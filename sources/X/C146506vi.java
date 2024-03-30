package X;

import android.graphics.RectF;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6vi  reason: invalid class name and case insensitive filesystem */
public final class C146506vi implements AnonymousClass4R0 {
    public int A00;
    public int A01 = 1;
    public C146496vh A02;
    public String A03;
    public boolean A04;
    public byte[] A05;
    public final C25721Hk A06;
    public final C25721Hk A07;
    public final C25721Hk A08;
    public final C25721Hk A09 = C90524aI.A0I();
    public final C25721Hk A0A = C90524aI.A0I();
    public final C25721Hk A0B = C90524aI.A0I();
    public final C25721Hk A0C = C90524aI.A0I();
    public final C25721Hk A0D;
    public final C25721Hk A0E;
    public final C25721Hk A0F;
    public final C25721Hk A0G = C90524aI.A0I();
    public final C25721Hk A0H;
    public final C25721Hk A0I;
    public final C25721Hk A0J;
    public final C25721Hk A0K;
    public final C159427jL A0L;
    public final C124935z2 A0M;
    public final C132976Wa A0N;
    public final C65233Rg A0O;
    public final C25711Hj A0P;
    public final C25711Hj A0Q;
    public final C25711Hj A0R;
    public final C25711Hj A0S;
    public final C25711Hj A0T;
    public final Object A0U = C36441kJ.A11();
    public final AtomicBoolean A0V = new AtomicBoolean();
    public final AtomicBoolean A0W = new AtomicBoolean();
    public volatile String A0X;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C146506vi(X.C159427jL r9, X.C20810yC r10, X.C124935z2 r11, X.C132976Wa r12, X.C65233Rg r13) {
        /*
            r8 = this;
            r2 = 1
            r0 = 5
            X.AnonymousClass00C.A0D(r10, r0)
            r8.<init>()
            r8.A0M = r11
            r8.A0O = r13
            r8.A0N = r12
            r8.A0L = r9
            java.lang.Object r0 = X.C36441kJ.A11()
            r8.A0U = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.A0V = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.A0W = r0
            r8.A01 = r2
            X.1Hk r0 = X.C90524aI.A0I()
            r8.A0B = r0
            X.1Hk r0 = X.C90524aI.A0I()
            r8.A09 = r0
            X.1Hk r0 = X.C90524aI.A0I()
            r8.A0A = r0
            X.1Hk r0 = X.C90524aI.A0I()
            r8.A0C = r0
            X.1Hk r0 = X.C90524aI.A0I()
            r8.A0G = r0
            X.1Hk r6 = X.C90524aI.A0I()
            r8.A0F = r6
            X.1Hk r5 = X.C90524aI.A0I()
            r8.A08 = r5
            X.1Hk r4 = X.C90524aI.A0I()
            r8.A0E = r4
            X.1Hk r3 = X.C90524aI.A0I()
            r8.A0I = r3
            X.1Hk r1 = X.C90524aI.A0I()
            r8.A0J = r1
            X.1Hk r0 = X.C90524aI.A0I()
            r8.A0K = r0
            X.1Hk r0 = X.C90524aI.A0I()
            r8.A0H = r0
            X.1Hk r0 = X.C90524aI.A0I()
            r8.A06 = r0
            X.1Hk r0 = X.C90524aI.A0I()
            r8.A07 = r0
            X.1Hk r0 = X.C90524aI.A0I()
            r8.A0D = r0
            r8.A0Q = r4
            r8.A0R = r6
            r8.A0P = r5
            r8.A0S = r3
            r8.A0T = r1
            X.65P r3 = r13.A02
            int r7 = r3.A01
            X.1Gl r0 = r3.A08
            int r6 = r0.A00
            r1 = 0
            int r5 = X.AnonymousClass6UH.A01(r6, r7, r1)
            monitor-enter(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0119 }
            r12.A09 = r0     // Catch:{ all -> 0x0119 }
            r12.A0G = r1     // Catch:{ all -> 0x0119 }
            monitor-exit(r12)
            monitor-enter(r12)
            r4 = 3
            r1 = 2
            if (r7 == r2) goto L_0x00b5
            if (r7 == r1) goto L_0x00b2
            r0 = 4
            if (r7 == r0) goto L_0x00bd
            switch(r7) {
                case 8: goto L_0x00af;
                case 9: goto L_0x00af;
                case 10: goto L_0x00bd;
                case 11: goto L_0x00b2;
                case 12: goto L_0x00af;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x00ba
        L_0x00af:
            r12.A01 = r0     // Catch:{ all -> 0x0119 }
            goto L_0x00bf
        L_0x00b2:
            r12.A01 = r4     // Catch:{ all -> 0x0119 }
            goto L_0x00bf
        L_0x00b5:
            if (r5 == r4) goto L_0x00bd
            if (r5 != r1) goto L_0x00ba
            goto L_0x00bd
        L_0x00ba:
            r12.A01 = r2     // Catch:{ all -> 0x0119 }
            goto L_0x00bf
        L_0x00bd:
            r12.A01 = r1     // Catch:{ all -> 0x0119 }
        L_0x00bf:
            monitor-exit(r12)
            X.5z9 r0 = r13.A01
            boolean r0 = r0.A0F
            monitor-enter(r12)
            r12.A0E = r0     // Catch:{ all -> 0x0119 }
            monitor-exit(r12)
            boolean r0 = X.C66013Ui.A0K(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            monitor-enter(r12)
            r12.A08 = r0     // Catch:{ all -> 0x0119 }
            monitor-exit(r12)
            X.63a r1 = r3.A07
            monitor-enter(r12)
            if (r1 == 0) goto L_0x00fd
            r0 = 3349(0xd15, float:4.693E-42)
            boolean r0 = r10.A0E(r0)     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r1 instanceof X.C104845Bq     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x00ec
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0119 }
            r12.A0A = r0     // Catch:{ all -> 0x0119 }
            goto L_0x00fd
        L_0x00ec:
            boolean r0 = r1 instanceof X.AnonymousClass5Bo     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x00f7
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x0119 }
            r12.A0A = r0     // Catch:{ all -> 0x0119 }
            goto L_0x00fd
        L_0x00f7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0119 }
            r12.A0A = r0     // Catch:{ all -> 0x0119 }
        L_0x00fd:
            monitor-exit(r12)
            boolean r0 = r3.A0I
            monitor-enter(r12)
            r12.A0F = r0     // Catch:{ all -> 0x0119 }
            monitor-exit(r12)
            int r0 = r13.A00
            monitor-enter(r12)
            r12.A00 = r0     // Catch:{ all -> 0x0119 }
            monitor-exit(r12)
            java.io.File r0 = r3.A0A
            if (r0 == 0) goto L_0x0118
            X.5vB r1 = new X.5vB
            r1.<init>(r0, r2)
            X.1Hk r0 = r8.A0A
            r0.A04(r1)
        L_0x0118:
            return
        L_0x0119:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146506vi.<init>(X.7jL, X.0yC, X.5z2, X.6Wa, X.3Rg):void");
    }

    public static void A00(C146506vi r1) {
        C122635vB r12 = (C122635vB) r1.A0A.A00();
        if (r12 != null && !r12.A02.get()) {
            r12.A01.delete();
        }
    }

    public final int A01() {
        AnonymousClass65P r5 = this.A0O.A02;
        String str = r5.A0D;
        if (str != null && AnonymousClass098.A07(str, "image", false)) {
            C1262263a r1 = r5.A07;
            if (r1 == null) {
                return 1;
            }
            if (r1 instanceof C104845Bq) {
                return 3;
            }
            if (r1 instanceof AnonymousClass5Bo) {
                return 2;
            }
            return 1;
        } else if (r5.A0I) {
            return 3;
        } else {
            return 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C124995z9 A02() {
        /*
            r33 = this;
            r3 = r33
            X.3Rg r0 = r3.A0O
            X.5z9 r0 = r0.A01
            X.AnonymousClass00C.A08(r0)
            java.lang.String r14 = r3.A0X
            if (r14 != 0) goto L_0x000f
            java.lang.String r14 = "optimistic"
        L_0x000f:
            X.1Hk r1 = r3.A0A
            java.lang.Object r15 = r1.A00()
            X.5vB r15 = (X.C122635vB) r15
            X.1Hk r1 = r3.A0G
            java.lang.Object r8 = r1.A00()
            X.5v9 r8 = (X.C122615v9) r8
            X.1Hk r1 = r3.A0D
            java.lang.Object r2 = r1.A00()
            X.5wK r2 = (X.C123335wK) r2
            int r13 = r3.A01
            java.io.File r1 = r0.A07
            java.lang.String r12 = r0.A09
            r19 = r12
            java.lang.String r11 = r0.A08
            r18 = r11
            long r4 = r0.A03
            int[] r10 = r0.A0H
            java.lang.String r6 = r0.A0A
            int r3 = r0.A02
            int r7 = r0.A00
            r17 = 0
            if (r15 == 0) goto L_0x00c7
            java.io.File r9 = r15.A01
            boolean r16 = X.AnonymousClass00C.A0J(r9, r1)
            if (r16 != 0) goto L_0x00c7
            long r4 = r15.A00
            r12 = r17
            r11 = r12
            r15 = 1
        L_0x004f:
            if (r19 != 0) goto L_0x005e
            if (r18 != 0) goto L_0x005e
            if (r2 == 0) goto L_0x005e
            X.621 r1 = r2.A02
            java.lang.String r12 = r1.A01
            X.621 r1 = r2.A01
            java.lang.String r11 = r1.A01
            r15 = 1
        L_0x005e:
            boolean r1 = r8 instanceof X.AnonymousClass5Bf
            if (r1 == 0) goto L_0x006f
            r1 = r8
            X.5Bf r1 = (X.AnonymousClass5Bf) r1
            int[] r2 = r1.A06
            boolean r1 = java.util.Arrays.equals(r2, r10)
            if (r1 != 0) goto L_0x006f
            r10 = r2
            r15 = 1
        L_0x006f:
            boolean r1 = r8 instanceof X.AnonymousClass5Be
            if (r1 == 0) goto L_0x00c5
            X.5Be r8 = (X.AnonymousClass5Be) r8
            int r8 = r8.A00
            if (r8 == r7) goto L_0x00c5
            r15 = 1
        L_0x007a:
            boolean r1 = r14.equals(r6)
            if (r1 != 0) goto L_0x00c3
            r15 = 1
        L_0x0081:
            if (r13 != r3) goto L_0x0086
            r13 = r3
            if (r15 == 0) goto L_0x00c2
        L_0x0086:
            X.1Gl r1 = r0.A06
            r18 = r1
            X.6Rx r1 = r0.A04
            r17 = r1
            int r15 = r0.A01
            boolean r7 = r0.A0E
            boolean r6 = r0.A0C
            boolean r3 = r0.A0D
            boolean r2 = r0.A0F
            java.util.List r1 = r0.A0B
            r16 = 0
            X.5z9 r0 = new X.5z9
            r19 = r12
            r20 = r11
            r21 = r14
            r22 = r1
            r23 = r10
            r24 = r15
            r25 = r8
            r26 = r13
            r27 = r4
            r29 = r7
            r30 = r6
            r31 = r3
            r32 = r2
            r14 = r0
            r15 = r17
            r17 = r18
            r18 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32)
        L_0x00c2:
            return r0
        L_0x00c3:
            r14 = r6
            goto L_0x0081
        L_0x00c5:
            r8 = r7
            goto L_0x007a
        L_0x00c7:
            r15 = 0
            r9 = r1
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146506vi.A02():X.5z9");
    }

    public final AnonymousClass65P A03() {
        File file;
        AnonymousClass65P r0 = this.A0O.A02;
        C122635vB r2 = (C122635vB) this.A0A.A00();
        String str = this.A03;
        if (r2 == null && str == null) {
            return r0;
        }
        String str2 = r0.A0B;
        if (r2 == null || (file = r2.A01) == null) {
            file = r0.A0A;
        }
        if (str == null) {
            str = r0.A0E;
        }
        String str3 = r0.A0C;
        String str4 = r0.A0D;
        C25471Gl r33 = r0.A08;
        int i = r0.A00;
        int i2 = r0.A01;
        long j = r0.A04;
        long j2 = r0.A05;
        int i3 = r0.A03;
        int i4 = r0.A02;
        RectF rectF = r0.A06;
        boolean z = r0.A0H;
        boolean z2 = r0.A0G;
        boolean z3 = r0.A0M;
        boolean z4 = r0.A0F;
        AnonymousClass3S2 r9 = r0.A09;
        C1262263a r8 = r0.A07;
        return new AnonymousClass65P(rectF, r8, r33, r9, file, str2, str, str3, str4, i, i2, i3, i4, j, j2, z, z2, z3, z4, false, r0.A0L, r0.A0I, r0.A0J);
    }

    public final C123865xD A04() {
        return (C123865xD) this.A0K.A00();
    }

    public final void A05() {
        this.A0B.A01();
        this.A0A.A01();
        this.A09.A01();
        this.A0C.A01();
        this.A0F.A01();
        this.A0E.A01();
        this.A0G.A01();
        this.A0I.A01();
        this.A0J.A01();
        this.A0K.A01();
        this.A0H.A01();
        this.A08.A01();
        this.A0D.A01();
    }

    public final void A06(C25711Hj r2, Executor executor) {
        this.A0C.A03(r2, executor);
    }

    public final boolean A07() {
        if ("express".equalsIgnoreCase(this.A0X) || "express-optimistic".equalsIgnoreCase(this.A0X)) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        if (this.A0X == null || AnonymousClass00C.A0J(this.A0X, "optimistic") || AnonymousClass00C.A0J(this.A0X, "express-optimistic")) {
            return true;
        }
        return false;
    }

    public String BDI() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("mediajob/ ");
        return AnonymousClass000.A0q(this.A0M.A0D, A0u);
    }
}
