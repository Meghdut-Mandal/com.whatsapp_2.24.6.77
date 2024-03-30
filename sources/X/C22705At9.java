package X;

import java.util.Arrays;

/* renamed from: X.At9  reason: case insensitive filesystem */
public class C22705At9 extends C21755AZj {
    public int A00;
    public int A01;
    public B35 A02;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;

    public int B8o() {
        return this.A00;
    }

    public int BmM(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A00;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void BKQ(C16590pl r7, boolean z) {
        this.A03 = z;
        if (r7 instanceof C21760AZs) {
            C21760AZs aZs = (C21760AZs) r7;
            byte[] bArr = aZs.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A07;
            int length2 = bArr2.length;
            if (length < length2) {
                int i = length2 - length;
                System.arraycopy(bArr, 0, bArr2, i, length);
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = 0;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            r7 = aZs.A00;
        } else {
            reset();
        }
        if (r7 != null) {
            this.A02.BKQ(r7, true);
        }
    }

    public void reset() {
        byte[] bArr = this.A07;
        System.arraycopy(bArr, 0, this.A05, 0, bArr.length);
        Arrays.fill(this.A06, (byte) 0);
        this.A01 = 0;
        this.A02.reset();
    }

    public C22705At9(B35 b35, int i) {
        super(b35);
        if (i > b35.B8o() * 8 || i < 8 || i % 8 != 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("CFB");
            A0u.append(i);
            throw AnonymousClass000.A0c(" not supported", A0u);
        }
        this.A02 = b35;
        int i2 = i / 8;
        this.A00 = i2;
        int B8o = b35.B8o();
        this.A07 = new byte[B8o];
        this.A05 = new byte[B8o];
        this.A04 = new byte[B8o];
        this.A06 = new byte[i2];
    }

    public String B8R() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C165597tg.A1J(A0u, this.A02);
        A0u.append("/CFB");
        return C36381kD.A10(A0u, this.A00 * 8);
    }
}
