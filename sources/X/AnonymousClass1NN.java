package X;

/* renamed from: X.1NN  reason: invalid class name */
public class AnonymousClass1NN {
    public final AnonymousClass185 A00;
    public final C220412q A01;
    public final AnonymousClass17X A02;
    public final C26371Jx A03;
    public final AnonymousClass1EL A04;

    public boolean A00(AnonymousClass141 r5, AnonymousClass147 r6) {
        AnonymousClass17X r0 = this.A02;
        boolean A0C = r0.A0C(r6);
        boolean A0D = r0.A0D(r6);
        boolean A002 = this.A04.A00(r5);
        if (!A0C || !A0D || A002) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r3.A03.A00(r4, r5) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.AnonymousClass141 r4, X.AnonymousClass147 r5, boolean r6) {
        /*
            r3 = this;
            int r0 = r4.A02
            r2 = 1
            r1 = 0
            if (r0 <= 0) goto L_0x0007
            r1 = 1
        L_0x0007:
            boolean r0 = r3.A00(r4, r5)
            if (r0 != 0) goto L_0x0018
            if (r1 != 0) goto L_0x0018
            X.1Jx r0 = r3.A03
            boolean r0 = r0.A00(r4, r5)
            r1 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            X.1EL r0 = r3.A04
            boolean r0 = r0.A01(r4)
            if (r6 != 0) goto L_0x0026
            if (r1 == 0) goto L_0x0026
            if (r0 != 0) goto L_0x0026
            return r2
        L_0x0026:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NN.A01(X.141, X.147, boolean):boolean");
    }

    public AnonymousClass1NN(AnonymousClass185 r1, C220412q r2, AnonymousClass17X r3, AnonymousClass1EL r4, C26371Jx r5) {
        this.A01 = r2;
        this.A04 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r5;
    }
}
