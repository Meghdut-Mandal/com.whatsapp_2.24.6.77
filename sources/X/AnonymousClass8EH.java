package X;

/* renamed from: X.8EH  reason: invalid class name */
public abstract class AnonymousClass8EH extends C21036A3z {
    public AnonymousClass8EX A00;
    public boolean A01 = false;
    public final AnonymousClass8EX A02;

    public static void A00(AnonymousClass8EH r1) {
        if (r1.A01) {
            r1.A03();
            r1.A01 = false;
        }
    }

    public /* synthetic */ AnonymousClass8EX A02() {
        if (!this.A01) {
            AnonymousClass8EX r2 = this.A00;
            C198729e6.A02.A00(r2.getClass()).Byd(r2);
            this.A01 = true;
        }
        return this.A00;
    }

    public void A03() {
        AnonymousClass8EX r3 = (AnonymousClass8EX) this.A00.A09(4);
        C198729e6.A02.A00(r3.getClass()).ByW(r3, this.A00);
        this.A00 = r3;
    }

    public /* synthetic */ Object clone() {
        AnonymousClass8EH A012 = AnonymousClass8EX.A01(this.A02);
        A012.A04(A02());
        return A012;
    }

    public AnonymousClass8EH(AnonymousClass8EX r2) {
        this.A02 = r2;
        this.A00 = (AnonymousClass8EX) r2.A09(4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        if (r1 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass8EX A01() {
        /*
            r3 = this;
            X.8EX r2 = r3.A02()
            r0 = 1
            java.lang.Object r0 = r2.A09(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            r0 = 1
            if (r1 == r0) goto L_0x0028
            if (r1 == 0) goto L_0x0029
            X.9e6 r1 = X.C198729e6.A02
            java.lang.Class r0 = r2.getClass()
            X.B3T r0 = r1.A00(r0)
            boolean r1 = r0.Byk(r2)
            r0 = 2
            r2.A09(r0)
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            return r2
        L_0x0029:
            X.Ab1 r0 = new X.Ab1
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EH.A01():X.8EX");
    }

    public final void A04(AnonymousClass8EX r4) {
        A00(this);
        AnonymousClass8EX r2 = this.A00;
        C198729e6.A02.A00(r2.getClass()).ByW(r2, r4);
    }

    public final /* synthetic */ AnonymousClass8EX Byz() {
        return this.A02;
    }
}
