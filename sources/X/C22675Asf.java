package X;

/* renamed from: X.Asf  reason: case insensitive filesystem */
public class C22675Asf extends C22656AsM {
    public int A00 = -1;

    public C22675Asf() {
    }

    public C22675Asf(C202169lB r2) {
        super(r2);
    }

    public C22675Asf(C219411z[] r2) {
        super(r2);
    }

    public C22675Asf(C219411z[] r2, boolean z) {
        super(r2, false);
    }

    public AnonymousClass121 A0B() {
        return this;
    }

    public int A0A() {
        int i = this.A00;
        if (i < 0) {
            int length = this.A00.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += C165597tg.A0w(this.A00, i2).A0A();
            }
            this.A00 = i;
        }
        return C201849kY.A01(i) + 1 + i;
    }

    public void A0D(C200179gm r9, boolean z) {
        C22647AsD asD;
        if (z) {
            r9.A00.write(48);
        }
        if (r9 instanceof C22647AsD) {
            asD = (C22647AsD) r9;
        } else {
            asD = new C22647AsD(r9.A00);
        }
        int length = this.A00.length;
        int i = this.A00;
        int i2 = 0;
        if (i < 0) {
            if (length > 16) {
                int i3 = 0;
                i = 0;
                do {
                    i += C165597tg.A0w(this.A00, i3).A0A();
                    i3++;
                } while (i3 < length);
                this.A00 = i;
            } else {
                AnonymousClass121[] r3 = new AnonymousClass121[length];
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    AnonymousClass121 A0w = C165597tg.A0w(this.A00, i5);
                    r3[i5] = A0w;
                    i4 += A0w.A0A();
                }
                this.A00 = i4;
                r9.A01(i4);
                while (i2 < length) {
                    r3[i2].A0D(asD, true);
                    i2++;
                }
                return;
            }
        }
        r9.A01(i);
        while (i2 < length) {
            C165597tg.A0w(this.A00, i2).A0D(asD, true);
            i2++;
        }
    }
}
