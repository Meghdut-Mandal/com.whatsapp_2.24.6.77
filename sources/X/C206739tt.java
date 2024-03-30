package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.9tt  reason: invalid class name and case insensitive filesystem */
public final class C206739tt implements Parcelable {
    public static final AnonymousClass7c0 CREATOR = AnonymousClass9z8.A00;
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C206739tt r5 = (C206739tt) obj;
            if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03 && Arrays.equals(this.A04, r5.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((527 + this.A02) * 31) + this.A01) * 31) + this.A03) * 31) + Arrays.hashCode(this.A04);
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        byte[] bArr = this.A04;
        parcel.writeInt(AnonymousClass000.A1V(bArr) ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public C206739tt(byte[] bArr, int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ColorInfo(");
        A0u.append(this.A02);
        A0u.append(", ");
        A0u.append(this.A01);
        A0u.append(", ");
        A0u.append(this.A03);
        A0u.append(", ");
        A0u.append(AnonymousClass000.A1V(this.A04));
        return C90474aD.A0f(A0u);
    }
}
