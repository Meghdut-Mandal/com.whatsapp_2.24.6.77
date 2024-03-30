package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bY  reason: invalid class name and case insensitive filesystem */
public final class C134756bY implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134096aU();
    public final double A00;
    public final double A01;
    public final int A02;
    public final String A03;

    public C134756bY(String str, double d, double d2, int i) {
        AnonymousClass00C.A0D(str, 4);
        this.A02 = i;
        this.A00 = d;
        this.A01 = d2;
        this.A03 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134756bY) {
                C134756bY r7 = (C134756bY) obj;
                if (!(this.A02 == r7.A02 && Double.compare(this.A00, r7.A00) == 0 && Double.compare(this.A01, r7.A01) == 0 && AnonymousClass00C.A0J(this.A03, r7.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeString(this.A03);
    }

    public int hashCode() {
        return C90504aG.A0B(this.A03, C36321k7.A00(Double.doubleToLongBits(this.A01), C36321k7.A00(Double.doubleToLongBits(this.A00), this.A02 * 31)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessServiceArea(radius=");
        A0u.append(this.A02);
        A0u.append(", latitude=");
        A0u.append(this.A00);
        A0u.append(", longitude=");
        A0u.append(this.A01);
        A0u.append(", areaDescription=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
