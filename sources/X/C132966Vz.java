package X;

/* renamed from: X.6Vz  reason: invalid class name and case insensitive filesystem */
public abstract class C132966Vz {
    public static final float A00 = (C113825gB.A01 - (C113825gB.A00 * ((float) 2)));
    public static final C136346eE A01 = new C136346eE(0.4f, 0.2f);
    public static final C136346eE A02 = new C136346eE(0.2f, 0.8f);
    public static final C136346eE A03 = new C136346eE(0.4f, 1.0f);
    public static final C136346eE A04 = new C136346eE(0.0f, 0.65f);
    public static final C136346eE A05 = new C136346eE(0.1f, 0.45f);

    public static final C137106fb A01(C136296e9 r8, AnonymousClass63C r9, C161337ma r10, float f) {
        C161337ma r5 = r10;
        r10.Bum(-644770905);
        C136296e9 r2 = r8;
        AnonymousClass63C r3 = r9;
        C137106fb A002 = A00(r2, r3, C114135gh.A02, r5, Float.valueOf(0.0f), Float.valueOf(f));
        C136916fF.A0M((C136916fF) r5, false);
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r2 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7.B2e(r14) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C161337ma r22, X.C161267mT r23, float r24, int r25, int r26, int r27, long r28, long r30) {
        /*
            r4 = r25
            r12 = r30
            r5 = r24
            r14 = r28
            r6 = r23
            r0 = -115871647(0xfffffffff917f061, float:-4.930702E34)
            r7 = r22
            r7.Bun(r0)
            r10 = r27 & 1
            r3 = r26
            if (r10 == 0) goto L_0x01b8
            r1 = r26 | 6
        L_0x001a:
            r0 = r26 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x002d
            r0 = r27 & 2
            if (r0 != 0) goto L_0x002a
            boolean r2 = r7.B2e(r14)
            r0 = 32
            if (r2 != 0) goto L_0x002c
        L_0x002a:
            r0 = 16
        L_0x002c:
            r1 = r1 | r0
        L_0x002d:
            r9 = r27 & 4
            if (r9 == 0) goto L_0x0192
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0033:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0046
            r0 = r27 & 8
            if (r0 != 0) goto L_0x0043
            boolean r2 = r7.B2e(r12)
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x0045
        L_0x0043:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0045:
            r1 = r1 | r0
        L_0x0046:
            r2 = r27 & 16
            if (r2 == 0) goto L_0x0184
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x004c:
            r0 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r0
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r0) goto L_0x0079
            boolean r0 = r7.BHg()
            if (r0 == 0) goto L_0x0079
            r7.BuE()
        L_0x005d:
            X.6fO r1 = r7.B6Z()
            if (r1 == 0) goto L_0x0078
            X.7Yw r0 = new X.7Yw
            r22 = r0
            r23 = r6
            r24 = r5
            r25 = r4
            r26 = r3
            r28 = r14
            r30 = r12
            r22.<init>(r23, r24, r25, r26, r27, r28, r30)
            r1.A06 = r0
        L_0x0078:
            return
        L_0x0079:
            r7.BuS()
            r0 = r26 & 1
            if (r0 == 0) goto L_0x0155
            boolean r0 = r7.BAx()
            if (r0 != 0) goto L_0x0155
            r7.BuE()
        L_0x0089:
            r7.B6X()
            X.4gm r0 = X.C131996Rr.A00
            r2 = r7
            X.6fF r2 = (X.C136916fF) r2
            java.lang.Object r0 = X.AnonymousClass6G0.A01(r2, r0)
            X.7ni r0 = (X.C161937ni) r0
            float r9 = r0.Bvq(r5)
            r0 = 0
            r8 = 1082130432(0x40800000, float:4.0)
            X.4iT r16 = new X.4iT
            r1 = r16
            r1.<init>(r9, r8, r4, r0)
            r1 = 1013651573(0x3c6b1875, float:0.014349093)
            java.lang.Object r8 = X.C90474aD.A0a(r7, r1)
            java.lang.Object r1 = X.C129736Ig.A00
            if (r8 != r1) goto L_0x00b8
            X.63C r8 = new X.63C
            r8.<init>()
            r2.A0R(r8)
        L_0x00b8:
            X.C136916fF.A0M(r2, r0)
            X.63C r8 = (X.AnonymousClass63C) r8
            r1 = 8
            r8.A00(r7, r1)
            X.C136916fF.A0M(r2, r0)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r22 = X.C36371kC.A0p()
            X.7b4 r19 = X.C114135gh.A05
            X.7dY r10 = X.C113945gO.A01
            r1 = 6660(0x1a04, float:9.333E-42)
            X.6eD r11 = new X.6eD
            r11.<init>(r10, r1)
            java.lang.Integer r2 = X.C023109s.A00
            long r0 = (long) r0
            X.6e9 r9 = new X.6e9
            r9.<init>(r11, r2, r0)
            r17 = r9
            r18 = r8
            r20 = r7
            X.6fb r17 = A00(r17, r18, r19, r20, r21, r22)
            r11 = 1332(0x534, float:1.867E-42)
            X.6eD r9 = new X.6eD
            r9.<init>(r10, r11)
            X.6e9 r10 = new X.6e9
            r10.<init>(r9, r2, r0)
            r9 = 1133445120(0x438f0000, float:286.0)
            X.6fb r20 = A01(r10, r8, r7, r9)
            X.7WF r10 = X.AnonymousClass7WF.A00
            X.61Q r9 = new X.61Q
            r9.<init>()
            r10.invoke(r9)
            X.6eC r10 = new X.6eC
            r10.<init>(r9)
            X.6e9 r9 = new X.6e9
            r9.<init>(r10, r2, r0)
            r11 = 1133576192(0x43910000, float:290.0)
            X.6fb r18 = A01(r9, r8, r7, r11)
            X.7WG r10 = X.AnonymousClass7WG.A00
            X.61Q r9 = new X.61Q
            r9.<init>()
            r10.invoke(r9)
            X.6eC r10 = new X.6eC
            r10.<init>(r9)
            X.6e9 r9 = new X.6e9
            r9.<init>(r10, r2, r0)
            X.6fb r19 = A01(r9, r8, r7, r11)
            X.7W4 r2 = X.AnonymousClass7W4.A00
            r1 = 1
            androidx.compose.ui.semantics.AppendedSemanticsElement r0 = new androidx.compose.ui.semantics.AppendedSemanticsElement
            r0.<init>(r2, r1)
            X.7mT r1 = r6.Bva(r0)
            float r0 = A00
            X.7mT r1 = X.C131986Rq.A00(r1, r0)
            X.7Ve r0 = new X.7Ve
            r21 = r16
            r22 = r5
            r23 = r12
            r25 = r14
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25)
            r2 = 0
            X.C108985Vt.A00(r7, r1, r0, r2)
            goto L_0x005d
        L_0x0155:
            if (r10 == 0) goto L_0x0159
            X.6fu r6 = X.C161267mT.A00
        L_0x0159:
            r0 = r27 & 2
            if (r0 == 0) goto L_0x016c
            r0 = 1803349725(0x6b7ceedd, float:3.057773E26)
            r7.Bum(r0)
            java.lang.Integer r0 = X.C113825gB.A02
            long r14 = X.C129516Hh.A00(r7, r0)
            X.C136916fF.A0N(r7)
        L_0x016c:
            if (r9 == 0) goto L_0x0170
            float r5 = X.C113505fe.A00
        L_0x0170:
            r0 = r27 & 8
            if (r0 == 0) goto L_0x017f
            r0 = -404222247(0xffffffffe7e80ed9, float:-2.1917258E24)
            r7.Bum(r0)
            long r12 = X.C133336Xx.A04
            X.C136916fF.A0N(r7)
        L_0x017f:
            if (r2 == 0) goto L_0x0089
            r4 = 2
            goto L_0x0089
        L_0x0184:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r26
            if (r0 != 0) goto L_0x004c
            int r0 = X.C90514aH.A0E(r7, r4)
            r1 = r1 | r0
            goto L_0x004c
        L_0x0192:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0033
            r2 = r7
            X.6fF r2 = (X.C136916fF) r2
            java.lang.Object r8 = r2.A0Q()
            boolean r0 = r8 instanceof java.lang.Float
            if (r0 == 0) goto L_0x01ae
            float r0 = X.C36441kJ.A03(r8)
            int r0 = (r24 > r0 ? 1 : (r24 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01ae
            r0 = 128(0x80, float:1.794E-43)
        L_0x01ab:
            r1 = r1 | r0
            goto L_0x0033
        L_0x01ae:
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r2.A0R(r0)
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x01ab
        L_0x01b8:
            r0 = r26 & 14
            if (r0 != 0) goto L_0x01c4
            int r1 = X.C90464aC.A0A(r7, r6)
            r1 = r1 | r26
            goto L_0x001a
        L_0x01c4:
            r1 = r3
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132966Vz.A02(X.7ma, X.7mT, float, int, int, int, long, long):void");
    }

    public static final void A03(C161927nh r17, C94594iT r18, float f, float f2, long j) {
        C94594iT r7 = r18;
        float f3 = (float) 2;
        float f4 = r7.A01 / f3;
        C161927nh r5 = r17;
        float A012 = AnonymousClass6X0.A01(r5.BHc()) - (f3 * f4);
        long A0B = C90464aC.A0B(f4, f4);
        long j2 = C133206Xf.A03;
        r5.B60((C114365h6) null, r7, f, f2, 1.0f, 3, j, A0B, C90464aC.A0B(A012, A012), false);
    }

    public static final C137106fb A00(C136296e9 r7, AnonymousClass63C r8, C156857b4 r9, C161337ma r10, Object obj, Object obj2) {
        Object A0a = C90474aD.A0a(r10, -1062847727);
        C136296e9 r4 = r7;
        AnonymousClass63C r5 = r8;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (A0a == C129736Ig.A00) {
            A0a = new C137106fb(r4, r5, r9, obj3, obj4);
            ((C136916fF) r10).A0R(A0a);
        }
        C136916fF r2 = (C136916fF) r10;
        C136916fF.A0M(r2, false);
        C137106fb r3 = (C137106fb) A0a;
        r10.Bn4(new C153397Oe(r4, r3, obj, obj2));
        C132846Vm.A02(r10, r3, new AnonymousClass7TY(r3, r5));
        C136916fF.A0M(r2, false);
        return r3;
    }
}
