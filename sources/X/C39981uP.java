package X;

/* renamed from: X.1uP  reason: invalid class name and case insensitive filesystem */
public final class C39981uP extends AnonymousClass04R {
    public final AnonymousClass08S A00;
    public final C001700s A01;
    public final C001700s A02;
    public final C001700s A03;
    public final C19460v5 A04;
    public final C585330b A05;
    public final C19770wU A06;
    public final C001600r A07;
    public final C001600r A08;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r0.A01.ordinal() >= 3) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (java.util.Objects.equals(X.C66013Ui.A0B(r4), X.C66013Ui.A0B(r6)) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C39981uP r7) {
        /*
            X.00s r0 = r7.A03
            X.3T1 r4 = X.C36431kI.A0r(r0)
            if (r4 == 0) goto L_0x0073
            X.00r r0 = r7.A08
            X.3T1 r6 = X.C36431kI.A0r(r0)
            if (r6 == 0) goto L_0x0073
            X.00s r0 = r7.A02
            java.lang.Object r0 = r0.A04()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0073
            boolean r5 = r0.booleanValue()
            X.00r r0 = r7.A07
            java.lang.Object r0 = r0.A04()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0073
            boolean r3 = r0.booleanValue()
            X.00s r0 = r7.A01
            java.util.List r2 = X.C36401kF.A0w(r0)
            X.0v5 r1 = r7.A04
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0073
            X.1K3 r1 = X.C36441kJ.A0f(r1)
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            boolean r0 = r1.BLB(r0)
            if (r0 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0074
            X.3Kf r0 = r4.A0M()
            if (r5 != 0) goto L_0x0074
            if (r0 == 0) goto L_0x005b
            X.2of r0 = r0.A01
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 < r0) goto L_0x0074
        L_0x005b:
            X.3Qa r1 = X.C66013Ui.A0B(r4)
            X.3Qa r0 = X.C66013Ui.A0B(r6)
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L_0x0074
        L_0x0069:
            r0 = 1
        L_0x006a:
            X.08S r1 = r7.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass3R7.A01(r1, r0)
        L_0x0073:
            return
        L_0x0074:
            if (r2 == 0) goto L_0x00a4
            java.util.Iterator r3 = r2.iterator()
        L_0x007a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a4
            X.3T1 r2 = X.C36391kE.A0l(r3)
            X.3Kf r0 = r2.A0M()
            if (r5 != 0) goto L_0x007a
            if (r0 == 0) goto L_0x0095
            X.2of r0 = r0.A01
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 < r0) goto L_0x007a
        L_0x0095:
            X.3Qa r1 = X.C66013Ui.A0B(r2)
            X.3Qa r0 = X.C66013Ui.A0B(r6)
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L_0x007a
            goto L_0x0069
        L_0x00a4:
            r0 = 0
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39981uP.A01(X.1uP):void");
    }

    public final void A0S(AnonymousClass3T1 r5) {
        C64933Qa r0;
        C64933Qa r3 = r5.A1J;
        C001700s r2 = this.A03;
        AnonymousClass3T1 A0r = C36431kI.A0r(r2);
        if (A0r != null) {
            r0 = A0r.A1J;
        } else {
            r0 = null;
        }
        if (!AnonymousClass00C.A0J(r3, r0)) {
            AnonymousClass3R7.A01(this.A02, (Object) null);
            AnonymousClass3R7.A01(r2, r5);
            AnonymousClass3R7.A01(this.A01, C023409w.A00);
            Object A042 = r2.A04();
            if (A042 != null) {
                this.A06.Bp1(new C80283v9(this, A042, 32));
            }
        }
    }

    public C39981uP(C001600r r7, C001600r r8, C19460v5 r9, C585330b r10, C19770wU r11) {
        C36321k7.A0y(r11, r10);
        this.A06 = r11;
        this.A04 = r9;
        this.A05 = r10;
        this.A08 = r7;
        this.A07 = r8;
        AnonymousClass08S A0Y = C36441kJ.A0Y();
        this.A00 = A0Y;
        C001700s A0S = C36431kI.A0S();
        this.A03 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        this.A01 = A0S2;
        C001700s A0Z = C36441kJ.A0Z((Object) null);
        this.A02 = A0Z;
        C80073uk.A01(A0S, A0Y, new C86144Ju(this), 5);
        C80073uk.A01(A0S2, A0Y, new C86154Jv(this), 7);
        C80073uk.A01(r7, A0Y, new C86164Jw(this), 4);
        C80073uk.A01(A0Z, A0Y, new C86174Jx(this), 8);
        C80073uk.A01(r8, A0Y, new C86184Jy(this), 6);
    }
}
