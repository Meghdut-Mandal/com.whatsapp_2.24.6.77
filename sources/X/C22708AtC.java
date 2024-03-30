package X;

import java.util.Arrays;

/* renamed from: X.AtC  reason: case insensitive filesystem */
public class C22708AtC extends C21755AZj implements C22842Awr {
    public int A00 = 0;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final B35 A05;

    public C22708AtC(B35 b35) {
        super(b35);
        this.A05 = b35;
        int B8o = b35.B8o();
        this.A04 = B8o;
        this.A01 = new byte[B8o];
        this.A02 = new byte[B8o];
        this.A03 = new byte[B8o];
    }

    public int B8o() {
        return this.A05.B8o();
    }

    public int BmM(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A04;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void BKQ(C16590pl r6, boolean z) {
        if (r6 instanceof C21760AZs) {
            C21760AZs aZs = (C21760AZs) r6;
            byte[] A022 = AnonymousClass124.A02(aZs.A01);
            this.A01 = A022;
            int i = this.A04;
            int length = A022.length;
            if (i >= length) {
                int i2 = i / 2;
                int i3 = 8;
                if (8 > i2) {
                    i3 = i2;
                }
                if (i - length <= i3) {
                    C16590pl r2 = aZs.A00;
                    if (r2 != null) {
                        this.A05.BKQ(r2, true);
                    }
                    reset();
                    return;
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("CTR/SIC mode requires IV of at least: ");
                A0u.append(i - i3);
                throw AnonymousClass000.A0c(" bytes.", A0u);
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("CTR/SIC mode requires IV no greater than: ");
            A0u2.append(i);
            throw AnonymousClass000.A0c(" bytes.", A0u2);
        }
        throw AnonymousClass001.A08("CTR/SIC mode requires ParametersWithIV");
    }

    public void reset() {
        byte[] bArr = this.A02;
        Arrays.fill(bArr, (byte) 0);
        byte[] bArr2 = this.A01;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.A05.reset();
        this.A00 = 0;
    }

    public String B8R() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C165597tg.A1J(A0u, this.A05);
        return AnonymousClass000.A0q("/SIC", A0u);
    }
}
