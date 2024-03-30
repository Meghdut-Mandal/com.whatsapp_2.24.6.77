package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XN  reason: invalid class name */
public final class AnonymousClass3XN implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66573Wm();
    public final int A00;
    public final int A01;
    public final String A02;

    public AnonymousClass3XN(String str, int i, int i2) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XN) {
                AnonymousClass3XN r5 = (AnonymousClass3XN) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return ((C36421kH.A04(this.A02) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(AnonymousClass000.A0k(this));
        A0u.append("{url='");
        A0u.append(this.A02);
        A0u.append("', width='");
        A0u.append(this.A01);
        A0u.append("', height='");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("'}", A0u);
    }
}
