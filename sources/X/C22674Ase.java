package X;

/* renamed from: X.Ase  reason: case insensitive filesystem */
public class C22674Ase extends C22656AsM {
    public int A00 = -1;

    public C22674Ase() {
    }

    public C22674Ase(C219411z r2) {
        super(r2);
    }

    public C22674Ase(C202169lB r2) {
        super(r2);
    }

    public C22674Ase(C219411z[] r2) {
        super(r2, false);
    }

    public int A0A() {
        int i = this.A00;
        if (i < 0) {
            int length = this.A00.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i = C165597tg.A09(this.A00, i2, i);
            }
            this.A00 = i;
        }
        return C201849kY.A01(i) + 1 + i;
    }

    public void A0D(C200179gm r9, boolean z) {
        C200179gm r5;
        if (z) {
            r9.A00.write(48);
        }
        if ((r9 instanceof C22646AsC) || (r9 instanceof C22647AsD)) {
            r5 = r9;
        } else {
            r5 = new C22646AsC(r9.A00);
        }
        int length = this.A00.length;
        int i = this.A00;
        int i2 = 0;
        if (i < 0) {
            if (length > 16) {
                int i3 = 0;
                i = 0;
                do {
                    i = C165597tg.A09(this.A00, i3, i);
                    i3++;
                } while (i3 < length);
                this.A00 = i;
            } else {
                AnonymousClass121[] r7 = new AnonymousClass121[length];
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    AnonymousClass121 A0C = this.A00[i5].Bve().A0C();
                    r7[i5] = A0C;
                    i4 += A0C.A0A();
                }
                this.A00 = i4;
                r9.A01(i4);
                while (i2 < length) {
                    r5.A03(r7[i2], true);
                    i2++;
                }
                return;
            }
        }
        r9.A01(i);
        while (i2 < length) {
            r5.A03(this.A00[i2].Bve(), true);
            i2++;
        }
    }
}
