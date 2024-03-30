package X;

/* renamed from: X.Asl  reason: case insensitive filesystem */
public class C22681Asl extends C22658AsO {
    public C22681Asl(C219411z r3) {
        super(r3, 0, true);
    }

    public C22681Asl(C219411z r1, int i, boolean z) {
        super(r1, i, z);
    }

    public AnonymousClass121 A0B() {
        return this;
    }

    public boolean A0E() {
        if (this.A02 || C22658AsO.A01(this).A0B().A0E()) {
            return true;
        }
        return false;
    }

    public int A0A() {
        int A00;
        int A0A = C22658AsO.A01(this).A0B().A0A();
        if (this.A02) {
            A00 = C201849kY.A00(this.A00) + C201849kY.A01(A0A);
        } else {
            A0A--;
            A00 = C201849kY.A00(this.A00);
        }
        return A00 + A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3.A0E() != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C200179gm r5, boolean r6) {
        /*
            r4 = this;
            X.121 r0 = X.C22658AsO.A01(r4)
            X.121 r3 = r0.A0B()
            boolean r2 = r4.A02
            if (r2 != 0) goto L_0x0014
            boolean r0 = r3.A0E()
            r1 = 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r1 = 160(0xa0, float:2.24E-43)
        L_0x0016:
            int r0 = r4.A00
            r5.A02(r1, r0, r6)
            if (r2 == 0) goto L_0x0024
            int r0 = r3.A0A()
            r5.A01(r0)
        L_0x0024:
            boolean r0 = r5 instanceof X.C22647AsD
            if (r0 == 0) goto L_0x002e
            X.AsD r5 = (X.C22647AsD) r5
        L_0x002a:
            r3.A0D(r5, r2)
            return
        L_0x002e:
            java.io.OutputStream r0 = r5.A00
            X.AsD r5 = new X.AsD
            r5.<init>(r0)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22681Asl.A0D(X.9gm, boolean):void");
    }
}
