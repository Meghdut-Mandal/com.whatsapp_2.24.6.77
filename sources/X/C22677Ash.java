package X;

/* renamed from: X.Ash  reason: case insensitive filesystem */
public class C22677Ash extends C22657AsN {
    public int A00 = -1;

    public C22677Ash() {
    }

    public C22677Ash(C219411z r2) {
        super(r2);
    }

    public C22677Ash(C202169lB r2) {
        super(r2, false);
    }

    public C22677Ash(C219411z[] r2, boolean z) {
        super(r2, z);
    }

    public int A0A() {
        int i = this.A00;
        if (i < 0) {
            C219411z[] r2 = this.A00;
            int length = r2.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i = C165597tg.A09(r2, i2, i);
            }
            this.A00 = i;
        }
        return C201849kY.A01(i) + 1 + i;
    }

    public void A0D(C200179gm r10, boolean z) {
        C200179gm r6;
        if (z) {
            r10.A00.write(49);
        }
        if ((r10 instanceof C22646AsC) || (r10 instanceof C22647AsD)) {
            r6 = r10;
        } else {
            r6 = new C22646AsC(r10.A00);
        }
        C219411z[] r8 = this.A00;
        int length = r8.length;
        int i = this.A00;
        int i2 = 0;
        if (i < 0) {
            if (length > 16) {
                int i3 = 0;
                i = 0;
                do {
                    i = C165597tg.A09(r8, i3, i);
                    i3++;
                } while (i3 < length);
                this.A00 = i;
            } else {
                AnonymousClass121[] r3 = new AnonymousClass121[length];
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    AnonymousClass121 A0C = r8[i5].Bve().A0C();
                    r3[i5] = A0C;
                    i4 += A0C.A0A();
                }
                this.A00 = i4;
                r10.A01(i4);
                while (i2 < length) {
                    r6.A03(r3[i2], true);
                    i2++;
                }
                return;
            }
        }
        r10.A01(i);
        while (i2 < length) {
            r6.A03(r8[i2].Bve(), true);
            i2++;
        }
    }
}
