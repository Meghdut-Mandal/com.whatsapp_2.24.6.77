package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XS  reason: invalid class name */
public final class AnonymousClass3XS implements Parcelable {
    public static final AnonymousClass3XS A04 = new AnonymousClass3XS(AnonymousClass3XE.A04, (String) null, (String) null, (String) null);
    public static final Parcelable.Creator CREATOR = new C89864Ye(4);
    public final AnonymousClass3XE A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AnonymousClass3XS(AnonymousClass3XE r2, String str, String str2, String str3) {
        AnonymousClass00C.A0D(r2, 4);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = r2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C36381kD.A1Y(this, obj)) {
            return false;
        }
        AnonymousClass3XS r4 = (AnonymousClass3XS) obj;
        if (!AnonymousClass00C.A0J(this.A01, r4.A01) || !AnonymousClass00C.A0J(this.A03, r4.A03) || !AnonymousClass00C.A0J(this.A02, r4.A02)) {
            return false;
        }
        return this.A00.equals(r4.A00);
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.A01;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.A02;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return C36401kF.A02(this.A00, (i5 + i3) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A03);
        A0u.append(' ');
        A0u.append(this.A02);
        A0u.append(' ');
        return AnonymousClass000.A0o(this.A00, A0u);
    }
}
