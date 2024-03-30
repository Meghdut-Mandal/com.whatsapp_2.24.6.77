package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6c1  reason: invalid class name and case insensitive filesystem */
public final class C135036c1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134196ae();
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135036c1) {
                C135036c1 r5 = (C135036c1) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A03, r5.A03) && this.A04 == r5.A04 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public int hashCode() {
        return (((((((((this.A01 * 31) + this.A00) * 31) + this.A02) * 31) + C36341k9.A09(this.A03)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0);
    }

    public C135036c1(String str, int i, int i2, int i3, boolean z, boolean z2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A03 = str;
        this.A04 = z;
        this.A05 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ImageListParam{loc=");
        A0u.append(this.A01);
        A0u.append(",inc=");
        A0u.append(this.A00);
        A0u.append(",sort=");
        A0u.append(this.A02);
        A0u.append(",bucket=");
        A0u.append(this.A03);
        A0u.append(",empty=");
        A0u.append(this.A05);
        A0u.append(",favorite=");
        A0u.append(this.A04);
        return AnonymousClass000.A0s(A0u);
    }

    public C135036c1() {
        this((String) null, 0, 0, 0, false, false);
    }
}
