package X;

/* renamed from: X.04T  reason: invalid class name */
public abstract class AnonymousClass04T {
    public int A00 = -1;
    public boolean A01;
    public final AnonymousClass04S A02;
    public final /* synthetic */ C001600r A03;

    public void A00() {
    }

    public abstract boolean A02();

    public boolean A03(AnonymousClass012 r2) {
        return false;
    }

    public AnonymousClass04T(C001600r r2, AnonymousClass04S r3) {
        this.A03 = r2;
        this.A02 = r3;
    }

    public void A01(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            C001600r r3 = this.A03;
            int i = -1;
            if (z) {
                i = 1;
            }
            int i2 = r3.A00;
            r3.A00 = i + i2;
            if (!r3.A03) {
                r3.A03 = true;
                while (true) {
                    try {
                        int i3 = r3.A00;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0) {
                            if (i3 > 0) {
                                r3.A05();
                            }
                        } else if (i2 > 0 && i3 == 0) {
                            r3.A06();
                        }
                        i2 = i3;
                    } finally {
                        r3.A03 = false;
                    }
                }
            }
            if (this.A01) {
                r3.A09(this);
            }
        }
    }
}
