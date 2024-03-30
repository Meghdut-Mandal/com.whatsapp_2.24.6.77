package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bb  reason: invalid class name and case insensitive filesystem */
public final class C134786bb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134426b1();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134786bb) {
                C134786bb r5 = (C134786bb) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }

    public C134786bb(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SmartFilter(filterId=");
        A0u.append(this.A01);
        A0u.append(", filterViewIdRes=");
        A0u.append(this.A03);
        A0u.append(", filterNameStringRes=");
        A0u.append(this.A02);
        A0u.append(", filterDrawableRes=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
