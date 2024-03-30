package X;

/* renamed from: X.AZu  reason: case insensitive filesystem */
public class C21762AZu implements B3H {
    public final C21774Aa7 A00;

    public C21762AZu(C21774Aa7 aa7) {
        this.A00 = aa7;
    }

    public int BDk() {
        return 16;
    }

    public void update(byte[] bArr, int i, int i2) {
        this.A00.BmL(bArr, i, i2);
    }

    public int B5n(byte[] bArr, int i) {
        try {
            return this.A00.B5n(bArr, i);
        } catch (C22696At0 e) {
            throw AnonymousClass001.A09(e.toString());
        }
    }

    public void BKO(C16590pl r8) {
        if (r8 instanceof C21760AZs) {
            C21760AZs aZs = (C21760AZs) r8;
            this.A00.BKQ(new AZo((AZr) aZs.A00, aZs.A01, (byte[]) null, 128), true);
            return;
        }
        throw AnonymousClass001.A08("GMAC requires ParametersWithIV");
    }

    public void BwT(byte b) {
        C21774Aa7 aa7 = this.A00;
        C21774Aa7.A03(aa7);
        byte[] bArr = aa7.A08;
        int i = aa7.A00;
        bArr[i] = b;
        int i2 = i + 1;
        aa7.A00 = i2;
        if (i2 == 16) {
            byte[] bArr2 = aa7.A07;
            C1902997u.A00(bArr2, bArr);
            aa7.A04.A00(bArr2);
            aa7.A00 = 0;
            aa7.A01 += 16;
        }
    }

    public void reset() {
        C21774Aa7.A04(this.A00, true);
    }
}
