package X;

import android.os.ConditionVariable;

/* renamed from: X.3eK  reason: invalid class name and case insensitive filesystem */
public final class C69933eK implements C88494Sx {
    public AnonymousClass3FW A00;
    public final AnonymousClass3L5 A01;
    public final C63603Kr A02;
    public final C19630wG A03;
    public final C20810yC A04;
    public final AnonymousClass004 A05;
    public final boolean A06 = C19550w8.A01();

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d1, code lost:
        if (((X.C202529m7) r10.A05.get()).A03(255) != 0) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        if (((X.C202529m7) r10.A05.get()).A03(255) != 0) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B1b(X.AnonymousClass155 r11, X.C53502rQ r12, X.AnonymousClass4PZ r13, X.C606938z r14, int r15) {
        /*
            r10 = this;
            r2 = 1
            r8 = r10
            X.3FW r0 = r10.A00
            if (r0 == 0) goto L_0x0009
            r0.A00()
        L_0x0009:
            java.util.concurrent.Executor r1 = X.AnonymousClass00F.A07(r11)
            X.1r9 r4 = new X.1r9
            r5 = r12
            r6 = r13
            r7 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            X.3FW r0 = new X.3FW
            r0.<init>(r4, r11, r1)
            r10.A00 = r0
            boolean r3 = r12 instanceof X.AnonymousClass2EM
            if (r3 == 0) goto L_0x0066
            X.004 r0 = r10.A05
            java.lang.Object r1 = r0.get()
            X.9m7 r1 = (X.C202529m7) r1
            r0 = 255(0xff, float:3.57E-43)
            int r1 = r1.A03(r0)
            r0 = 12
            if (r1 == r0) goto L_0x0066
        L_0x0033:
            X.3Ee r4 = new X.3Ee
            r4.<init>()
            r0 = 255(0xff, float:3.57E-43)
            r4.A00 = r0
            X.0wG r1 = r10.A03
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
        L_0x0041:
            java.lang.String r0 = r1.A01(r0)
            r4.A01 = r0
        L_0x0047:
            boolean r0 = r12 instanceof X.AnonymousClass2EN
            if (r0 != 0) goto L_0x00be
            if (r3 != 0) goto L_0x00be
            boolean r0 = r12 instanceof X.AnonymousClass2EP
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r12 instanceof X.AnonymousClass2EO
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r12 instanceof X.AnonymousClass2EQ
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r12 instanceof X.AnonymousClass2EL
            if (r0 != 0) goto L_0x00e6
            boolean r0 = r12 instanceof X.AnonymousClass2EK
            if (r0 != 0) goto L_0x00e6
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0066:
            X.3Kr r0 = r10.A02
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x008b
            boolean r0 = r12 instanceof X.AnonymousClass2EP
            if (r0 != 0) goto L_0x008b
            X.0yC r1 = r10.A04
            r0 = 5854(0x16de, float:8.203E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x008b
            X.3Ee r4 = new X.3Ee
            r4.<init>()
            r0 = 255(0xff, float:3.57E-43)
            r4.A00 = r0
            X.0wG r1 = r10.A03
            r0 = 2131887790(0x7f1206ae, float:1.9410197E38)
            goto L_0x0041
        L_0x008b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 == r0) goto L_0x00a0
            r0 = 28
            if (r1 == r0) goto L_0x00a0
            X.3Ee r4 = new X.3Ee
            r4.<init>()
            r0 = 33023(0x80ff, float:4.6275E-41)
            r4.A00 = r0
            goto L_0x0047
        L_0x00a0:
            X.004 r0 = r10.A05
            java.lang.Object r1 = r0.get()
            X.9m7 r1 = (X.C202529m7) r1
            r0 = 255(0xff, float:3.57E-43)
            int r1 = r1.A03(r0)
            r0 = 12
            if (r1 != r0) goto L_0x0033
            X.3Ee r4 = new X.3Ee
            r4.<init>()
            r4.A05 = r2
            goto L_0x0047
        L_0x00ba:
            r0 = 2131887747(0x7f120683, float:1.941011E38)
            goto L_0x010d
        L_0x00be:
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x00d3
            X.004 r0 = r10.A05
            java.lang.Object r1 = r0.get()
            X.9m7 r1 = (X.C202529m7) r1
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r1.A03(r0)
            r3 = 1
            if (r0 == 0) goto L_0x00d4
        L_0x00d3:
            r3 = 0
        L_0x00d4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChatLockManager/hasEnrolled: "
            X.C36321k7.A1X(r0, r1, r3)
            r0 = 2131887767(0x7f120697, float:1.941015E38)
            if (r3 == 0) goto L_0x010d
            r0 = 2131887746(0x7f120682, float:1.9410108E38)
            goto L_0x010d
        L_0x00e6:
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x00fb
            X.004 r0 = r10.A05
            java.lang.Object r1 = r0.get()
            X.9m7 r1 = (X.C202529m7) r1
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r1.A03(r0)
            r3 = 1
            if (r0 == 0) goto L_0x00fc
        L_0x00fb:
            r3 = 0
        L_0x00fc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChatLockManager/hasEnrolled: "
            X.C36321k7.A1X(r0, r1, r3)
            r0 = 2131887766(0x7f120696, float:1.9410148E38)
            if (r3 == 0) goto L_0x010d
            r0 = 2131887745(0x7f120681, float:1.9410106E38)
        L_0x010d:
            java.lang.String r0 = r11.getString(r0)
            r4.A03 = r0
            r0 = 0
            r4.A04 = r0
            X.9Mu r1 = r4.A00()
            X.3FW r0 = r10.A00
            if (r0 == 0) goto L_0x0121
            r0.A01(r1)
        L_0x0121:
            X.3L5 r4 = r10.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 2
            r4.A03(r12, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69933eK.B1b(X.155, X.2rQ, X.4PZ, X.38z, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2 == 28) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(X.C53502rQ r4) {
        /*
            r3 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r2 == r0) goto L_0x000b
            r1 = 28
            r0 = 0
            if (r2 != r1) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r2 = 1
            if (r0 != 0) goto L_0x001b
            boolean r0 = r4 instanceof X.AnonymousClass2EP
            if (r0 != 0) goto L_0x0036
            X.3Kr r0 = r3.A02
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0036
        L_0x001b:
            X.004 r0 = r3.A05
            java.lang.Object r1 = r0.get()
            X.9m7 r1 = (X.C202529m7) r1
            r0 = 255(0xff, float:3.57E-43)
        L_0x0025:
            int r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x002c
            r2 = 0
        L_0x002c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChatLockManager/canAuth: "
            X.C36321k7.A1X(r0, r1, r2)
            return r2
        L_0x0036:
            X.004 r0 = r3.A05
            java.lang.Object r1 = r0.get()
            X.9m7 r1 = (X.C202529m7) r1
            r0 = 33023(0x80ff, float:4.6275E-41)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69933eK.A00(X.2rQ):boolean");
    }

    public void B2U() {
        AnonymousClass3FW r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        this.A00 = null;
    }

    public C69933eK(AnonymousClass3L5 r2, C63603Kr r3, C19630wG r4, C20810yC r5, AnonymousClass004 r6) {
        C36321k7.A1B(r5, r4, r2, r3, r6);
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
