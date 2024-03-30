package X;

import android.os.ConditionVariable;

/* renamed from: X.0xJ  reason: invalid class name and case insensitive filesystem */
public class C20280xJ implements AnonymousClass00M {
    public final C19460v5 A00;
    public final C19700wN A01;
    public final AnonymousClass1XR A02;
    public final C19730wQ A03;
    public final AnonymousClass1DT A04;
    public final AnonymousClass164 A05;
    public final AnonymousClass19J A06;
    public final C19970wo A07;
    public final AnonymousClass189 A08;
    public final AnonymousClass187 A09;
    public final C220412q A0A;
    public final AnonymousClass17S A0B;
    public final AnonymousClass17X A0C;
    public final AnonymousClass1QJ A0D;
    public final C25151Fe A0E;
    public final C28291Sb A0F;
    public final AnonymousClass1FN A0G;
    public final C236419g A0H;
    public final C20810yC A0I;
    public final C25181Fh A0J;
    public final C25121Fb A0K;
    public final C20520xh A0L;
    public final AnonymousClass19I A0M;
    public final AnonymousClass19A A0N;
    public final C29861Yg A0O;
    public final C29871Yh A0P;
    public final C26271Jn A0Q;
    public final AnonymousClass1A1 A0R;
    public final C19930wk A0S;
    public final AnonymousClass005 A0T;
    public final AnonymousClass005 A0U;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.11F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C20280xJ r47, X.C128776Do r48, X.AnonymousClass777 r49, java.lang.Runnable r50) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sending message: "
            r1.append(r0)
            r6 = r48
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3T1 r5 = r6.A05
            X.3Qa r4 = r5.A1J
            X.11F r3 = r4.A00
            boolean r0 = r3 instanceof X.C28981Uw
            r7 = r47
            if (r0 == 0) goto L_0x0026
            r7.A02(r5)
        L_0x0025:
            return
        L_0x0026:
            X.1XR r0 = r7.A02
            android.os.Handler r1 = r0.A00
            r0 = 0
            r1.removeMessages(r0)
            r0 = 1
            r1.removeMessages(r0)
            r0 = 2
            r1.removeMessages(r0)
            com.whatsapp.jid.DeviceJid r2 = r6.A03
            r0 = r2
            X.0wN r10 = r7.A01
            X.0wQ r9 = r7.A03
            X.12q r1 = r7.A0A
            X.17X r8 = r7.A0C
            boolean r1 = X.C66013Ui.A0N(r10, r9, r1, r8, r5)
            r12 = r49
            if (r1 == 0) goto L_0x0178
            boolean r1 = r5.A1P()
            if (r1 == 0) goto L_0x0178
            X.19J r13 = r7.A06
            boolean r1 = r13.A06
            if (r1 == 0) goto L_0x0178
            X.19I r11 = r7.A0M
            java.util.Map r1 = r11.A01
            monitor-enter(r1)
            java.lang.Object r14 = r1.get(r4)     // Catch:{ all -> 0x0193 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x0193 }
            r15 = 0
            if (r14 == 0) goto L_0x0080
            java.lang.Object r14 = r14.first     // Catch:{ all -> 0x0193 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0193 }
            if (r14 == 0) goto L_0x0080
            if (r2 != 0) goto L_0x0076
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0193 }
            if (r0 == 0) goto L_0x007d
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r3)     // Catch:{ all -> 0x0193 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0193 }
        L_0x0076:
            boolean r0 = r14.contains(r0)     // Catch:{ all -> 0x0193 }
            if (r0 == 0) goto L_0x0080
            goto L_0x007f
        L_0x007d:
            r0 = 0
            goto L_0x0076
        L_0x007f:
            r15 = 1
        L_0x0080:
            monitor-exit(r1)     // Catch:{ all -> 0x0193 }
            if (r15 != 0) goto L_0x0178
            boolean r0 = r5.A1Y
            if (r0 != 0) goto L_0x0178
            r11.A01(r2, r5)
            int r1 = r13.A04
            r0 = 2
            if (r1 == r0) goto L_0x00a6
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x00a6
            X.005 r0 = r7.A0U
            java.lang.Object r13 = r0.get()
            X.0y3 r13 = (X.C20720y3) r13
            r14 = 1
            r16 = 0
            r15 = 1
            r17 = 0
            r18 = 0
            r13.A0C(r14, r15, r16, r17, r18)
        L_0x00a6:
            long r0 = r5.A1S
            r13 = 0
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x00b4
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.A1S = r0
        L_0x00b4:
            boolean r11 = r6.A07
            if (r11 != 0) goto L_0x00bc
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x00d2
        L_0x00bc:
            X.1DT r1 = r7.A04
            int r15 = r5.A1f
            r14 = 5
            boolean r0 = r1.A0a
            if (r0 == 0) goto L_0x00d2
            X.1EE r13 = r1.A0N
            java.lang.String r0 = r4.A01
            int r1 = r0.hashCode()
            int r0 = r5.A1I
            r13.A04(r1, r14, r15, r0)
        L_0x00d2:
            X.0wk r4 = r7.A0S
            X.0wo r0 = r7.A07
            r49 = r0
            X.0yC r0 = r7.A0I
            r22 = r0
            X.164 r0 = r7.A05
            r48 = r0
            X.1DT r0 = r7.A04
            r47 = r0
            X.187 r0 = r7.A09
            r46 = r0
            X.005 r0 = r7.A0T
            r33 = r0
            X.1A1 r0 = r7.A0R
            r31 = r0
            X.189 r0 = r7.A08
            r45 = r0
            X.1Sb r0 = r7.A0F
            r19 = r0
            X.1FN r0 = r7.A0G
            r20 = r0
            X.17S r0 = r7.A0B
            r16 = r0
            X.19g r0 = r7.A0H
            r21 = r0
            X.1Jn r0 = r7.A0Q
            r30 = r0
            X.1Fh r0 = r7.A0J
            r23 = r0
            X.1Fb r0 = r7.A0K
            r24 = r0
            X.0xh r0 = r7.A0L
            r25 = r0
            X.1Fe r0 = r7.A0E
            r18 = r0
            X.0v5 r0 = r7.A00
            r44 = r0
            X.1QJ r0 = r7.A0D
            r17 = r0
            X.1Yh r0 = r7.A0P
            r28 = r0
            if (r2 != 0) goto L_0x012a
            r2 = r3
            X.C18740tg.A06(r3)
        L_0x012a:
            com.whatsapp.jid.UserJid r0 = r6.A04
            r27 = r0
            java.util.Set r0 = r6.A06
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r0)
            boolean r0 = r6.A08
            r42 = r0
            long r0 = r6.A00
            r38 = r0
            long r0 = r6.A01
            r40 = r0
            long r0 = r6.A02
            r15 = 37
            X.1j0 r14 = new X.1j0
            r13 = r50
            r14.<init>(r7, r6, r13, r15)
            X.AX0 r6 = new X.AX0
            r15 = r16
            r16 = r8
            r26 = r2
            r29 = r5
            r32 = r12
            r34 = r14
            r35 = r3
            r36 = r38
            r38 = r40
            r40 = r0
            r43 = r11
            r7 = r44
            r8 = r10
            r10 = r47
            r11 = r48
            r12 = r49
            r13 = r45
            r14 = r46
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40, r42, r43)
            r4.execute(r6)
            return
        L_0x0178:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Dropping send message: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r49 == 0) goto L_0x0025
            r0 = 0
            r12.BVO(r0)
            return
        L_0x0193:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0193 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20280xJ.A00(X.0xJ, X.6Do, X.777, java.lang.Runnable):void");
    }

    public void A01(AnonymousClass3T1 r3) {
        A00(this, new C128776Do(new C124675yc(this.A07, r3)), (AnonymousClass777) null, (Runnable) null);
    }

    public void A02(AnonymousClass3T1 r4) {
        this.A0S.execute(new C35741jB(this, r4, 17));
    }

    public void A03(AnonymousClass3T1 r4, boolean z) {
        C124675yc r2 = new C124675yc(this.A07, r4);
        r2.A07 = z;
        r2.A06 = true;
        A00(this, new C128776Do(r2), (AnonymousClass777) null, (Runnable) null);
    }

    public void A04(boolean z) {
        ((C20720y3) this.A0U.get()).A0z = !z;
        this.A0N.A0C(C203429o0.A05(z), (String) null);
    }

    public C20280xJ(C19460v5 r4, C19700wN r5, AnonymousClass1XR r6, C19730wQ r7, AnonymousClass1DT r8, AnonymousClass164 r9, AnonymousClass19J r10, C19970wo r11, AnonymousClass189 r12, AnonymousClass187 r13, C220412q r14, AnonymousClass17S r15, AnonymousClass17X r16, AnonymousClass1QJ r17, C25151Fe r18, C28291Sb r19, AnonymousClass1FN r20, C236419g r21, C20810yC r22, C25181Fh r23, C25121Fb r24, C20520xh r25, AnonymousClass19I r26, AnonymousClass19A r27, C29861Yg r28, C29871Yh r29, C26271Jn r30, AnonymousClass1A1 r31, C19770wU r32, AnonymousClass005 r33, AnonymousClass005 r34) {
        C19930wk r0 = new C19930wk(r32, true);
        this.A07 = r11;
        this.A0I = r22;
        this.A01 = r5;
        this.A03 = r7;
        this.A0A = r14;
        this.A05 = r9;
        this.A0N = r27;
        this.A04 = r8;
        this.A09 = r13;
        this.A0T = r33;
        this.A0R = r31;
        this.A0M = r26;
        this.A06 = r10;
        this.A02 = r6;
        this.A08 = r12;
        this.A0F = r19;
        this.A0U = r34;
        this.A0G = r20;
        this.A0B = r15;
        this.A0H = r21;
        this.A0Q = r30;
        this.A00 = r4;
        this.A0J = r23;
        this.A0K = r24;
        this.A0C = r16;
        this.A0O = r28;
        this.A0L = r25;
        this.A0E = r18;
        this.A0D = r17;
        this.A0P = r29;
        this.A0S = r0;
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
