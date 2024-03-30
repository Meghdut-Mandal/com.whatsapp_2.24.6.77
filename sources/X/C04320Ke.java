package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Ke  reason: invalid class name and case insensitive filesystem */
public class C04320Ke extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08450al();
    public final int A00;
    public final short A01;
    public final short A02;

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1J(objArr, this.A00);
        objArr[1] = Short.valueOf(this.A01);
        return AnonymousClass000.A0M(Short.valueOf(this.A02), objArr, 2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C04320Ke) {
            C04320Ke r4 = (C04320Ke) obj;
            if (this.A00 == r4.A00 && this.A01 == r4.A01 && this.A02 == r4.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C04320Ke(int i, short s, short s2) {
        this.A00 = i;
        this.A01 = s;
        this.A02 = s2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        short s = this.A01;
        parcel.writeInt(262146);
        parcel.writeInt(s);
        short s2 = this.A02;
        parcel.writeInt(262147);
        parcel.writeInt(s2);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
