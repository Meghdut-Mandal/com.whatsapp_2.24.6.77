package X;

/* renamed from: X.Asi  reason: case insensitive filesystem */
public class C22678Asi extends C22657AsN {
    public int A00 = -1;

    public C22678Asi() {
    }

    public C22678Asi(C219411z r2) {
        super(r2);
    }

    public C22678Asi(C202169lB r2) {
        super(r2, true);
    }

    public C22678Asi(C219411z[] r2) {
        super(r2);
    }

    public C22678Asi(C219411z[] r2, boolean z) {
        super(r2, true);
    }

    public AnonymousClass121 A0B() {
        return this.A01 ? this : super.A0B();
    }

    public int A0A() {
        int i = this.A00;
        if (i < 0) {
            C219411z[] r3 = this.A00;
            int length = r3.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += C165597tg.A0w(r3, i2).A0A();
            }
            this.A00 = i;
        }
        return C201849kY.A01(i) + 1 + i;
    }

    public void A0D(C200179gm r10, boolean z) {
        C22647AsD asD;
        if (z) {
            r10.A00.write(49);
        }
        if (r10 instanceof C22647AsD) {
            asD = (C22647AsD) r10;
        } else {
            asD = new C22647AsD(r10.A00);
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
                    i += C165597tg.A0w(r8, i3).A0A();
                    i3++;
                } while (i3 < length);
                this.A00 = i;
            } else {
                AnonymousClass121[] r3 = new AnonymousClass121[length];
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    AnonymousClass121 A0w = C165597tg.A0w(r8, i5);
                    r3[i5] = A0w;
                    i4 += A0w.A0A();
                }
                this.A00 = i4;
                r10.A01(i4);
                while (i2 < length) {
                    r3[i2].A0D(asD, true);
                    i2++;
                }
                return;
            }
        }
        r10.A01(i);
        while (i2 < length) {
            C165597tg.A0w(r8, i2).A0D(asD, true);
            i2++;
        }
    }
}
