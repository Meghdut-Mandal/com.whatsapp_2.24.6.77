package X;

/* renamed from: X.9f4  reason: invalid class name and case insensitive filesystem */
public class C199289f4 {
    public final byte[] A00;

    public byte[] A01(byte[] bArr, byte[] bArr2, int i, long j) {
        try {
            C21774Aa7 A002 = A00(j, true);
            A002.BmL(bArr, 0, bArr.length);
            int BEq = A002.BEq(i);
            byte[] bArr3 = new byte[BEq];
            int BmN = A002.BmN(bArr2, 0, i, bArr3, 0);
            int B5n = BmN + A002.B5n(bArr3, BmN);
            if (B5n >= BEq) {
                return bArr3;
            }
            byte[] bArr4 = new byte[B5n];
            System.arraycopy(bArr3, 0, bArr4, 0, B5n);
            return bArr4;
        } catch (C22696At0 e) {
            throw C90524aI.A0Y(e);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, long j) {
        try {
            C21774Aa7 A002 = A00(j, false);
            A002.BmL(bArr, 0, bArr.length);
            int length = bArr2.length;
            int BEq = A002.BEq(length);
            byte[] bArr3 = new byte[BEq];
            int BmN = A002.BmN(bArr2, 0, length, bArr3, 0);
            int B5n = BmN + A002.B5n(bArr3, BmN);
            if (B5n >= BEq) {
                return bArr3;
            }
            byte[] bArr4 = new byte[B5n];
            System.arraycopy(bArr3, 0, bArr4, 0, B5n);
            return bArr4;
        } catch (C22696At0 e) {
            throw new C29031Vb(e, this);
        }
    }

    private C21774Aa7 A00(long j, boolean z) {
        C21774Aa7 aa7 = new C21774Aa7(new C21753AZh());
        byte[] bArr = new byte[12];
        bArr[11] = (byte) ((int) j);
        C165577te.A0s(j, bArr, 8, 10);
        C165577te.A0s(j, bArr, 16, 9);
        C165577te.A0s(j, bArr, 24, 8);
        C165577te.A0s(j, bArr, 32, 7);
        C165577te.A0s(j, bArr, 40, 6);
        C165577te.A0s(j, bArr, 48, 5);
        C165577te.A0s(j, bArr, 56, 4);
        aa7.BKQ(new C21760AZs(new AZr(this.A00), bArr), z);
        return aa7;
    }

    public C199289f4(byte[] bArr) {
        this.A00 = bArr;
    }
}
