package X;

public final class ABA implements B6B {
    public final C202909ms A00;

    public void B25(C192559Hl r8, AnonymousClass3T1 r9) {
        C1886690e r0;
        boolean A1a = C36341k9.A1a(r9, r8);
        if (r9 instanceof C181788o2) {
            AnonymousClass8NL r5 = r8.A00;
            AnonymousClass8NH A01 = this.A00.A01(C170918Hz.A0O(r5), (C46932bu) r9, r8.A01);
            if (A01 != null) {
                C65013Qj r3 = ((AnonymousClass2bU) r9).A01;
                if (!(r3 == null || r3.A0a == null)) {
                    AnonymousClass8SE A0C = AnonymousClass8NN.A0C(A01);
                    A0C.bitField0_ |= 128;
                    A0C.gifPlayback_ = true;
                    int i = r3.A05;
                    if (i == A1a) {
                        r0 = C1886690e.GIPHY;
                    } else if (i != 2) {
                        r0 = C1886690e.NONE;
                    } else {
                        r0 = C1886690e.TENOR;
                    }
                    A01.A0U(r0);
                }
                r5.A0i((AnonymousClass8SE) A01.A0R());
                return;
            }
            return;
        }
        throw C165567td.A0K(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlI(X.AnonymousClass9XL r8) {
        /*
            r7 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            X.8RS r1 = r8.A02
            int r0 = r1.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0053
            X.8S8 r6 = r1.videoMessage_
            if (r6 != 0) goto L_0x0012
            X.8S8 r6 = X.AnonymousClass8S8.DEFAULT_INSTANCE
        L_0x0012:
            boolean r0 = r6.gifPlayback_
            if (r0 == 0) goto L_0x0053
            X.3Qa r2 = r8.A03
            long r0 = r8.A01
            X.8o2 r5 = new X.8o2
            r5.<init>(r2, r0)
            X.C202909ms.A00(r6, r5)
            int r1 = r6.bitField0_
            r0 = r1 & 16
            if (r0 == 0) goto L_0x004a
            X.3Qj r4 = r5.A01
            if (r4 == 0) goto L_0x004a
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            r3 = 0
            if (r0 == 0) goto L_0x0048
            r0 = 1
            int r1 = r6.gifAttribution_
            if (r1 == 0) goto L_0x0050
            if (r1 == r0) goto L_0x004d
            r0 = 2
            if (r1 != r0) goto L_0x0050
            X.90f r0 = X.C1886790f.TENOR
        L_0x003d:
            int r2 = r0.ordinal()
            r1 = 2
            r0 = 1
            if (r2 == r0) goto L_0x004b
            if (r2 != r1) goto L_0x0048
            r3 = 2
        L_0x0048:
            r4.A05 = r3
        L_0x004a:
            return r5
        L_0x004b:
            r3 = 1
            goto L_0x0048
        L_0x004d:
            X.90f r0 = X.C1886790f.GIPHY
            goto L_0x003d
        L_0x0050:
            X.90f r0 = X.C1886790f.NONE
            goto L_0x003d
        L_0x0053:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABA.BlI(X.9XL):X.3T1");
    }

    public ABA(C202909ms r1) {
        this.A00 = r1;
    }
}
