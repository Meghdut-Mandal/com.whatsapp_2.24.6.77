package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bI  reason: invalid class name and case insensitive filesystem */
public final class C134596bI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C133886a9();
    public final int A00;
    public final int A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134596bI) {
                C134596bI r5 = (C134596bI) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public C134596bI(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CdsColorData(lightColor=");
        A0u.append(this.A01);
        A0u.append(", darkColor=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
