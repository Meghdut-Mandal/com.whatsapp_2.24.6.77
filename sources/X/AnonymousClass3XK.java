package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.3XK  reason: invalid class name */
public final class AnonymousClass3XK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C89864Ye(1);
    public final String A00;
    public final String A01;
    public final List A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeTypedList(this.A02);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3XK)) {
            return false;
        }
        AnonymousClass3XK r4 = (AnonymousClass3XK) obj;
        if (!TextUtils.equals(this.A01, r4.A01) || !TextUtils.equals(this.A00, r4.A00) || !AnonymousClass00C.A0J(this.A02, r4.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.A01;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return C36401kF.A02(this.A02, (i3 + i2) * 31);
    }

    public AnonymousClass3XK(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("timezone: ");
        A0u.append(this.A01);
        A0u.append(", note: ");
        A0u.append(this.A00);
        for (Object valueOf : this.A02) {
            A0u.append(String.valueOf(valueOf));
            A0u.append(";");
        }
        return C36381kD.A0y(A0u);
    }
}
