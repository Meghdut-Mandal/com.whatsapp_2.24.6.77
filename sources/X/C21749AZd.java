package X;

import java.util.Arrays;

/* renamed from: X.AZd  reason: case insensitive filesystem */
public class C21749AZd implements B35 {
    public int A00;
    public B35 A01;
    public byte[] A02;
    public byte[] A03;
    public boolean A04;
    public byte[] A05;

    public C21749AZd(B35 b35) {
        this.A01 = b35;
        int B8o = b35.B8o();
        this.A00 = B8o;
        this.A05 = new byte[B8o];
        this.A03 = new byte[B8o];
        this.A02 = new byte[B8o];
    }

    public int B8o() {
        return this.A01.B8o();
    }

    public void BKQ(C16590pl r7, boolean z) {
        boolean z2 = this.A04;
        this.A04 = z;
        if (r7 instanceof C21760AZs) {
            C21760AZs aZs = (C21760AZs) r7;
            byte[] bArr = aZs.A01;
            int length = bArr.length;
            if (length == this.A00) {
                System.arraycopy(bArr, 0, this.A05, 0, length);
                reset();
                r7 = aZs.A00;
                if (r7 == null) {
                    if (z2 != z) {
                        throw AnonymousClass001.A08("cannot change encrypting state without providing key.");
                    }
                    return;
                }
            } else {
                throw AnonymousClass001.A08("initialisation vector must be the same length as block size");
            }
        } else {
            reset();
            if (r7 == null) {
                if (z2 != z) {
                    throw AnonymousClass001.A08("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        this.A01.BKQ(r7, z);
    }

    public int BmM(byte[] bArr, byte[] bArr2, int i, int i2) {
        boolean z = this.A04;
        int i3 = this.A00;
        if (z) {
            if (i3 + i <= bArr.length) {
                for (int i4 = 0; i4 < i3; i4++) {
                    byte[] bArr3 = this.A03;
                    C165577te.A1T(bArr, bArr3, i + i4, bArr3[i4], i4);
                }
                int BmM = this.A01.BmM(this.A03, bArr2, 0, i2);
                byte[] bArr4 = this.A03;
                System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
                return BmM;
            }
            throw C22702At6.A01();
        } else if (i + i3 <= bArr.length) {
            System.arraycopy(bArr, i, this.A02, 0, i3);
            int BmM2 = this.A01.BmM(bArr, bArr2, i, i2);
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = i2 + i5;
                C165577te.A1T(this.A03, bArr2, i5, bArr2[i6], i6);
            }
            byte[] bArr5 = this.A03;
            this.A03 = this.A02;
            this.A02 = bArr5;
            return BmM2;
        } else {
            throw C22702At6.A01();
        }
    }

    public void reset() {
        byte[] bArr = this.A05;
        System.arraycopy(bArr, 0, this.A03, 0, bArr.length);
        Arrays.fill(this.A02, (byte) 0);
        this.A01.reset();
    }

    public String B8R() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C165597tg.A1J(A0u, this.A01);
        return AnonymousClass000.A0q("/CBC", A0u);
    }
}
