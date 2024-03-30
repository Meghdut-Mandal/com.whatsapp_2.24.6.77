package X;

import java.util.Arrays;

/* renamed from: X.9jo  reason: invalid class name and case insensitive filesystem */
public class C201539jo {
    public final byte[] A00;

    public int A00() {
        byte[] bArr = this.A00;
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public C172288Ng A01() {
        AnonymousClass8NN A0p = C172288Ng.DEFAULT_INSTANCE.A0p();
        AnonymousClass8I5 A0O = C90474aD.A0O(A0p, this.A00);
        C172288Ng r1 = (C172288Ng) A0p.A00;
        r1.bitField0_ |= 1;
        r1.keyId_ = A0O;
        return (C172288Ng) A0p.A0R();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C201539jo)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C201539jo) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C201539jo(int i, int i2) {
        byte[] bArr = new byte[6];
        this.A00 = bArr;
        bArr[1] = (byte) i;
        bArr[0] = (byte) (i >> 8);
        bArr[5] = (byte) i2;
        bArr[4] = (byte) (i2 >> 8);
        bArr[3] = (byte) (i2 >> 16);
        bArr[2] = (byte) (i2 >> 24);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncdKeyId{deviceId=");
        byte[] bArr = this.A00;
        A0u.append((bArr[1] & 255) | ((bArr[0] & 255) << 8));
        A0u.append(", epoch=");
        A0u.append(C203239na.A01(bArr, 2));
        return AnonymousClass000.A0q("}", A0u);
    }

    public C201539jo(byte[] bArr) {
        this.A00 = bArr;
    }
}
