package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.9zn  reason: invalid class name and case insensitive filesystem */
public final class C209309zn implements B5K {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(21);
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C209309zn r5 = (C209309zn) obj;
            if (!this.A02.equals(r5.A02) || !Arrays.equals(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((C165617ti.A01(this.A02.hashCode()) + Arrays.hashCode(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        byte[] bArr = this.A03;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public C209309zn(byte[] bArr, int i, int i2, String str) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("mdta: key=");
        return AnonymousClass000.A0q(this.A02, A0u);
    }

    public C209309zn(Parcel parcel) {
        this.A02 = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        this.A03 = bArr;
        parcel.readByteArray(bArr);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }
}
