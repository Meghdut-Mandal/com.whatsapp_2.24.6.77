package X;

import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: X.Aa2  reason: case insensitive filesystem */
public class C21769Aa2 implements C23069B2y {
    public SecureRandom A00;
    public C21749AZd A01;
    public C21760AZs A02;
    public boolean A03;

    public C21769Aa2(B35 b35) {
        this.A01 = new C21749AZd(b35);
    }

    public byte[] BwP(byte[] bArr, int i, int i2) {
        int i3;
        if (!this.A03) {
            C21749AZd aZd = this.A01;
            int B8o = aZd.A01.B8o();
            if (i2 >= B8o * 2) {
                byte[] bArr2 = new byte[i2];
                byte[] bArr3 = new byte[B8o];
                boolean z = false;
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                System.arraycopy(bArr, 0, bArr3, 0, B8o);
                aZd.BKQ(new C21760AZs(this.A02.A00, bArr3), false);
                for (int i4 = B8o; i4 < i2; i4 += B8o) {
                    aZd.BmM(bArr2, bArr2, i4, i4);
                }
                System.arraycopy(bArr2, i2 - B8o, bArr3, 0, B8o);
                aZd.BKQ(new C21760AZs(this.A02.A00, bArr3), false);
                aZd.BmM(bArr2, bArr2, 0, 0);
                aZd.BKQ(this.A02, false);
                for (int i5 = 0; i5 < i2; i5 += B8o) {
                    aZd.BmM(bArr2, bArr2, i5, i5);
                }
                byte b = bArr2[0] & 255;
                int i6 = i2 - 4;
                boolean z2 = true;
                if (b <= i6) {
                    z2 = false;
                    i6 = b;
                }
                byte[] bArr4 = new byte[i6];
                System.arraycopy(bArr2, 4, bArr4, 0, i6);
                int i7 = 0;
                byte b2 = 0;
                do {
                    i3 = i7 + 1;
                    b2 |= bArr2[i7 + 4] ^ ((byte) (~bArr2[i3]));
                    i7 = i3;
                } while (i3 != 3);
                Arrays.fill(bArr2, (byte) 0);
                if (b2 != 0) {
                    z = true;
                }
                if (!z2 && !z) {
                    return bArr4;
                }
                throw new C22696At0("wrapped key corrupted");
            }
            throw new C22696At0("input too short");
        }
        throw AnonymousClass001.A09("not set for unwrapping");
    }

    public byte[] BxW(byte[] bArr, int i, int i2) {
        if (!this.A03) {
            throw AnonymousClass001.A09("not set for wrapping");
        } else if (i2 > 255 || i2 < 0) {
            throw AnonymousClass001.A08("input must be from 0 to 255 bytes");
        } else {
            C21749AZd aZd = this.A01;
            aZd.BKQ(this.A02, true);
            int B8o = aZd.A01.B8o();
            int i3 = i2 + 4;
            int i4 = B8o * 2;
            if (i3 >= i4) {
                if (i3 % B8o == 0) {
                    i4 = i3;
                } else {
                    i4 = ((i3 / B8o) + 1) * B8o;
                }
            }
            byte[] bArr2 = new byte[i4];
            bArr2[0] = (byte) i2;
            System.arraycopy(bArr, 0, bArr2, 4, i2);
            int i5 = i4 - i3;
            byte[] bArr3 = new byte[i5];
            this.A00.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i3, i5);
            bArr2[1] = (byte) (~bArr2[4]);
            bArr2[2] = (byte) (~bArr2[5]);
            bArr2[3] = (byte) (~bArr2[6]);
            for (int i6 = 0; i6 < i4; i6 += B8o) {
                aZd.BmM(bArr2, bArr2, i6, i6);
            }
            for (int i7 = 0; i7 < i4; i7 += B8o) {
                aZd.BmM(bArr2, bArr2, i7, i7);
            }
            return bArr2;
        }
    }

    public void BKQ(C16590pl r4, boolean z) {
        this.A03 = z;
        if (r4 instanceof C21759AZn) {
            C21759AZn aZn = (C21759AZn) r4;
            this.A00 = aZn.A00;
            C16590pl r1 = aZn.A01;
            if (r1 instanceof C21760AZs) {
                this.A02 = (C21760AZs) r1;
                return;
            }
            throw AnonymousClass001.A08("RFC3211Wrap requires an IV");
        }
        if (z) {
            this.A00 = C201939kk.A00();
        }
        if (r4 instanceof C21760AZs) {
            this.A02 = (C21760AZs) r4;
            return;
        }
        throw AnonymousClass001.A08("RFC3211Wrap requires an IV");
    }

    public String B8R() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C165597tg.A1J(A0u, this.A01.A01);
        return AnonymousClass000.A0q("/RFC3211Wrap", A0u);
    }
}
