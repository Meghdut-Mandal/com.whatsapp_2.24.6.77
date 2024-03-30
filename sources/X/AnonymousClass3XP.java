package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XP  reason: invalid class name */
public final class AnonymousClass3XP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66483Wd();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AnonymousClass3XP(String str, String str2, String str3, String str4) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3XP)) {
            return false;
        }
        AnonymousClass3XP r4 = (AnonymousClass3XP) obj;
        if (!C1901797e.A00(this.A00, r4.A00) || !C1901797e.A00(this.A02, r4.A02) || !C1901797e.A00(this.A01, r4.A01) || !C1901797e.A00(this.A03, r4.A03)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        int A04 = C36421kH.A04(this.A00);
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (A04 + i) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.A03;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CoverPhoto:{'id'='");
        A0u.append(this.A00);
        A0u.append("', 'ts'='");
        A0u.append(this.A02);
        A0u.append("', 'token'='");
        A0u.append(this.A01);
        A0u.append("', 'url'='");
        A0u.append(this.A03);
        return AnonymousClass000.A0q("'}", A0u);
    }
}
