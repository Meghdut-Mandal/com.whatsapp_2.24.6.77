package X;

/* renamed from: X.ABs  reason: case insensitive filesystem */
public class C21184ABs implements C22938Ayo, C22942Ays, C17740rx {
    public final C20810yC A00;
    public final C194369Pk A01;
    public final C198269dB A02;
    public final C203129nM A03;
    public final AnonymousClass1AW A04;
    public final AnonymousClass3PX A05;
    public final AnonymousClass005 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r8 != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 A00(X.AnonymousClass9YL r11) {
        /*
            r10 = this;
            X.3Qa r2 = r11.A0C
            long r5 = r11.A04
            boolean r0 = r11.A0N
            boolean r8 = r11.A0O
            if (r0 != 0) goto L_0x000d
            r7 = 0
            if (r8 == 0) goto L_0x000e
        L_0x000d:
            r7 = 1
        L_0x000e:
            X.9nM r0 = r10.A03
            X.8SX r1 = r11.A0A
            java.lang.String r3 = r11.A0K
            boolean r9 = r11.A02
            int r4 = r11.A01
            X.3T1 r0 = r0.A03(r1, r2, r3, r4, r5, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21184ABs.A00(X.9YL):X.3T1");
    }

    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        C18740tg.A0E(r5 instanceof AnonymousClass2bZ, AnonymousClass000.A0l(r5, "FMessageInteractiveProtobuf: message type is not supported ", AnonymousClass000.A0u()));
        C207219uk r1 = ((AnonymousClass2bZ) r5).A00;
        if (r1 != null) {
            this.A04.A00(r1).A0F(r4, r5);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: X.3T1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: X.3T1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: X.2bs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: X.2bs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: X.2bs} */
    /* JADX WARNING: type inference failed for: r4v13, types: [X.2bu, X.8o3] */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0240, code lost:
        if ((r10 & 2) != 0) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0309, code lost:
        if ("pending".equals(r1) == false) goto L_0x0506;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0506 A[EDGE_INSN: B:309:0x0506->B:303:0x0506 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x007e A[EDGE_INSN: B:314:0x007e->B:25:0x007e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0130  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlH(X.AnonymousClass9YL r27) {
        /*
            r26 = this;
            r2 = r27
            X.8SX r3 = r2.A0A
            boolean r0 = X.C203099nI.A05(r3)
            r6 = r26
            if (r0 == 0) goto L_0x0066
            X.8SV r7 = r3.interactiveMessage_
            if (r7 != 0) goto L_0x0012
            X.8SV r7 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x0012:
            X.0yC r4 = r6.A00
            r1 = 3051(0xbeb, float:4.275E-42)
            boolean r0 = r4.A0E(r1)
            r5 = 4
            if (r0 == 0) goto L_0x0046
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            java.lang.String r0 = "message_with_link_status"
            boolean r0 = X.C202419ln.A01(r7, r0)
            if (r0 == 0) goto L_0x0046
            X.9Pk r7 = r6.A01
            X.005 r0 = r6.A06
            java.lang.Object r8 = r0.get()
            X.0xM r8 = (X.C20310xM) r8
            X.3Qa r4 = r2.A0C
            long r0 = r2.A04
            r9 = r3
            r10 = r4
            r11 = r0
            X.2bV r2 = r7.A00(r8, r9, r10, r11)
            X.3PX r1 = r6.A05
            java.lang.String r0 = "link_to_webview_status"
        L_0x0042:
            r1.A02(r2, r0, r5)
            return r2
        L_0x0046:
            boolean r0 = r4.A0E(r1)
            if (r0 == 0) goto L_0x0061
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            java.lang.String r0 = "open_webview"
            boolean r0 = X.C202419ln.A01(r7, r0)
            if (r0 == 0) goto L_0x0061
            X.3T1 r2 = r6.A00(r2)
            X.3PX r1 = r6.A05
            java.lang.String r0 = "link_to_webview"
            goto L_0x0042
        L_0x0061:
            X.3T1 r2 = r6.A00(r2)
            return r2
        L_0x0066:
            int r0 = r3.bitField1_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x051f
            X.9dB r5 = r6.A02
            X.005 r0 = r6.A06
            java.lang.Object r8 = r0.get()
            X.0xM r8 = (X.C20310xM) r8
            X.8Re r6 = r3.buttonsMessage_
            if (r6 != 0) goto L_0x00f6
            X.8Re r6 = X.C173308Re.DEFAULT_INSTANCE
            if (r6 != 0) goto L_0x00f6
        L_0x007e:
            r0 = 0
        L_0x007f:
            r12 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            if (r0 != 0) goto L_0x0092
            X.8SG r0 = r6.contextInfo_
            if (r0 != 0) goto L_0x008e
            X.8SG r0 = X.AnonymousClass8SG.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x0519
        L_0x008e:
            boolean r0 = r0.isForwarded_
            if (r0 == 0) goto L_0x0519
        L_0x0092:
            int r0 = r6.headerType_
            X.91C r10 = X.AnonymousClass91C.A00(r0)
            if (r10 != 0) goto L_0x009c
            X.91C r10 = X.AnonymousClass91C.UNKNOWN
        L_0x009c:
            X.B6c r0 = r6.buttons_
            java.util.Iterator r13 = r0.iterator()
            r9 = 0
        L_0x00a3:
            r7 = 0
        L_0x00a4:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r11 = r13.next()
            X.8Qh r11 = (X.C173078Qh) r11
            int r4 = r11.type_
            if (r4 == 0) goto L_0x00f3
            r0 = 1
            if (r4 == r0) goto L_0x00f0
            r0 = 2
            if (r4 != r0) goto L_0x00f3
            X.90Y r4 = X.AnonymousClass90Y.NATIVE_FLOW
        L_0x00bc:
            X.90Y r0 = X.AnonymousClass90Y.UNKNOWN
            if (r4 == r0) goto L_0x0506
            X.90Y r0 = X.AnonymousClass90Y.NATIVE_FLOW
            if (r4 != r0) goto L_0x00a4
            int r9 = r9 + 1
            if (r7 != 0) goto L_0x00ee
            X.9EV r4 = r5.A00
            int r0 = r11.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00ee
            X.1ao r7 = r4.A00
            X.8Ox r4 = r11.nativeFlowInfo_
            r0 = r4
            if (r4 != 0) goto L_0x00d9
            X.8Ox r4 = X.C172718Ox.DEFAULT_INSTANCE
        L_0x00d9:
            java.lang.String r4 = r4.name_
            if (r0 != 0) goto L_0x00df
            X.8Ox r0 = X.C172718Ox.DEFAULT_INSTANCE
        L_0x00df:
            java.lang.String r0 = r0.paramsJson_
            X.9Yd r0 = r7.A00(r4, r0)
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r0.A0D(r11, r10)
            if (r0 == 0) goto L_0x00ee
            goto L_0x00a3
        L_0x00ee:
            r7 = 1
            goto L_0x00a4
        L_0x00f0:
            X.90Y r4 = X.AnonymousClass90Y.RESPONSE
            goto L_0x00bc
        L_0x00f3:
            X.90Y r4 = X.AnonymousClass90Y.UNKNOWN
            goto L_0x00bc
        L_0x00f6:
            int r0 = r6.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r6.contentText_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007e
            X.B6c r1 = r6.buttons_
            if (r1 == 0) goto L_0x007e
            int r0 = r1.size()
            if (r0 == 0) goto L_0x007e
            java.util.Iterator r9 = r1.iterator()
        L_0x0112:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r7 = r9.next()
            X.8Qh r7 = (X.C173078Qh) r7
            int r1 = r7.type_
            if (r1 == 0) goto L_0x016d
            r0 = 1
            if (r1 == r0) goto L_0x016a
            r0 = 2
            if (r1 != r0) goto L_0x016d
            X.90Y r4 = X.AnonymousClass90Y.NATIVE_FLOW
        L_0x012a:
            X.90Y r1 = X.AnonymousClass90Y.NATIVE_FLOW
            int r0 = r7.bitField0_
            if (r4 != r1) goto L_0x014f
            r0 = r0 & 8
            if (r0 == 0) goto L_0x007e
            X.8Ox r0 = r7.nativeFlowInfo_
            r1 = r0
            if (r0 != 0) goto L_0x013b
            X.8Ox r0 = X.C172718Ox.DEFAULT_INSTANCE
        L_0x013b:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x007e
            if (r1 != 0) goto L_0x0145
            X.8Ox r1 = X.C172718Ox.DEFAULT_INSTANCE
        L_0x0145:
            java.lang.String r0 = r1.name_
        L_0x0147:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0112
            goto L_0x007e
        L_0x014f:
            r0 = r0 & 2
            if (r0 == 0) goto L_0x007e
            X.8Nh r0 = r7.buttonText_
            if (r0 != 0) goto L_0x0159
            X.8Nh r0 = X.C172298Nh.DEFAULT_INSTANCE
        L_0x0159:
            java.lang.String r0 = r0.displayText_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007e
            int r0 = r7.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r7.buttonId_
            goto L_0x0147
        L_0x016a:
            X.90Y r4 = X.AnonymousClass90Y.RESPONSE
            goto L_0x012a
        L_0x016d:
            X.90Y r4 = X.AnonymousClass90Y.UNKNOWN
            goto L_0x012a
        L_0x0170:
            r0 = 1
            goto L_0x007f
        L_0x0173:
            r0 = 2
            if (r9 > r0) goto L_0x0506
            if (r7 != 0) goto L_0x0506
            int r0 = r6.headerType_
            X.91C r4 = X.AnonymousClass91C.A00(r0)
            if (r4 != 0) goto L_0x0182
            X.91C r4 = X.AnonymousClass91C.UNKNOWN
        L_0x0182:
            java.lang.String r17 = "payment_status"
            r0 = r17
            boolean r14 = X.C198269dB.A00(r6, r0)
            java.lang.String r16 = "review_and_pay"
            r0 = r16
            boolean r0 = X.C198269dB.A00(r6, r0)
            java.lang.String r11 = "message_with_link_status"
            java.lang.String r10 = "payment_method"
            java.lang.String r9 = "review_order"
            r13 = 4
            r7 = 0
            if (r0 != 0) goto L_0x02db
            if (r14 != 0) goto L_0x02db
            boolean r0 = X.C198269dB.A00(r6, r9)
            if (r0 == 0) goto L_0x0320
            X.C18740tg.A06(r8)
            X.3Qa r4 = r2.A0C
            X.11F r13 = r4.A00
            X.C18740tg.A06(r13)
            X.1DL r12 = r5.A08
            X.C18740tg.A06(r12)
            X.0yC r0 = r5.A02
            r14 = 2688(0xa80, float:3.767E-42)
            boolean r14 = r0.A0E(r14)
            if (r14 == 0) goto L_0x0282
            X.ABt r13 = r5.A07
            X.8mf r22 = r13.A01(r2)
            long r0 = r2.A04
            boolean r12 = r2.A0O
            r19 = r8
            r20 = r3
            r21 = r4
            r23 = r0
            r25 = r12
            r18 = r13
            X.3T1 r4 = r18.A00(r19, r20, r21, r22, r23, r25)
        L_0x01d7:
            r0 = r16
            boolean r0 = X.C198269dB.A00(r6, r0)
            if (r0 != 0) goto L_0x04de
            boolean r0 = X.C198269dB.A00(r6, r9)
            if (r0 != 0) goto L_0x04de
            boolean r0 = X.C198269dB.A00(r6, r10)
            if (r0 != 0) goto L_0x04de
            r0 = r17
            boolean r0 = X.C198269dB.A00(r6, r0)
            if (r0 != 0) goto L_0x04de
            boolean r0 = X.C198269dB.A00(r6, r11)
            if (r0 != 0) goto L_0x04de
            java.lang.String r9 = r6.contentText_
            java.lang.String r8 = r6.footerText_
            X.B6c r0 = r6.buttons_
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r13 = r0.iterator()
        L_0x0207:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x04d6
            java.lang.Object r11 = r13.next()
            X.8Qh r11 = (X.C173078Qh) r11
            r15 = 0
            int r10 = r11.bitField0_
            r0 = r10 & 8
            if (r0 == 0) goto L_0x0239
            X.8Ox r0 = r11.nativeFlowInfo_
            r12 = r0
            if (r0 != 0) goto L_0x0221
            X.8Ox r0 = X.C172718Ox.DEFAULT_INSTANCE
        L_0x0221:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0239
            r0 = r12
            if (r12 != 0) goto L_0x022c
            X.8Ox r0 = X.C172718Ox.DEFAULT_INSTANCE
        L_0x022c:
            java.lang.String r1 = r0.name_
            if (r12 != 0) goto L_0x0232
            X.8Ox r12 = X.C172718Ox.DEFAULT_INSTANCE
        L_0x0232:
            java.lang.String r0 = r12.paramsJson_
            X.9uL r15 = new X.9uL
            r15.<init>(r1, r0)
        L_0x0239:
            r1 = 1
            r0 = r10 & 1
            if (r0 == 0) goto L_0x027a
            r0 = r10 & 2
            if (r0 == 0) goto L_0x027b
        L_0x0242:
            java.lang.String r10 = r11.buttonId_
        L_0x0244:
            X.8Nh r0 = r11.buttonText_
            if (r0 != 0) goto L_0x024a
            X.8Nh r0 = X.C172298Nh.DEFAULT_INSTANCE
        L_0x024a:
            java.lang.String r1 = r0.displayText_
            r19 = 0
            int r11 = r11.type_
            if (r11 == 0) goto L_0x0277
            r0 = 1
            if (r11 == r0) goto L_0x0274
            r0 = 2
            if (r11 != r0) goto L_0x0277
            X.90Y r11 = X.AnonymousClass90Y.NATIVE_FLOW
        L_0x025a:
            X.90Y r0 = X.AnonymousClass90Y.NATIVE_FLOW
            if (r11 != r0) goto L_0x026d
            r18 = 2
        L_0x0260:
            X.3EY r14 = new X.3EY
            r17 = r1
            r16 = r10
            r14.<init>(r15, r16, r17, r18, r19)
            r6.add(r14)
            goto L_0x0207
        L_0x026d:
            X.90Y r0 = X.AnonymousClass90Y.RESPONSE
            boolean r18 = X.C36361kB.A1a(r11, r0)
            goto L_0x0260
        L_0x0274:
            X.90Y r11 = X.AnonymousClass90Y.RESPONSE
            goto L_0x025a
        L_0x0277:
            X.90Y r11 = X.AnonymousClass90Y.UNKNOWN
            goto L_0x025a
        L_0x027a:
            r1 = 0
        L_0x027b:
            if (r15 == 0) goto L_0x0207
            if (r1 != 0) goto L_0x0242
            java.lang.String r10 = r15.A00
            goto L_0x0244
        L_0x0282:
            X.0wG r14 = r5.A01
            java.lang.String r15 = X.C203219nY.A04(r3)
            if (r15 == 0) goto L_0x04fa
            java.lang.String r15 = X.C202869mo.A02(r15)
            int r0 = X.C165587tf.A05(r0)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x02d8
            java.util.Map r0 = X.C202869mo.A03
        L_0x029a:
            java.lang.Number r0 = X.C90524aI.A0b(r15, r0)
            if (r0 == 0) goto L_0x04fa
            int r0 = r0.intValue()
            java.lang.String r14 = r14.A01(r0)
            java.lang.String r0 = X.C202869mo.A01(r3)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x02be
            r15 = 2
            java.lang.CharSequence[] r15 = new java.lang.CharSequence[r15]
            X.C90494aF.A1H(r14, r0, r15)
            java.lang.String r0 = "\n"
            java.lang.String r14 = X.AnonymousClass14B.A08(r0, r15)
        L_0x02be:
            if (r14 == 0) goto L_0x04fa
            long r0 = r2.A04
            X.2bV r4 = X.C165597tg.A0Y(r4, r14, r0)
            r23 = 0
            r18 = r8
            r19 = r13
            r20 = r12
            r21 = r3
            r22 = r4
            X.B1o r8 = X.C202449lr.A00(r18, r19, r20, r21, r22, r23)
            goto L_0x037d
        L_0x02d8:
            java.util.Map r0 = X.C202869mo.A02
            goto L_0x029a
        L_0x02db:
            X.ABt r0 = r5.A07
            X.8mf r4 = r0.A01(r2)
            X.9uk r0 = r4.A00
            if (r0 == 0) goto L_0x0506
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0506
            X.9uP r0 = r0.A09
            java.lang.String r0 = r0.A01
            int r0 = X.C207199ui.A00(r0)
            if (r0 == 0) goto L_0x0506
            if (r14 == 0) goto L_0x030b
            X.9uk r0 = r4.A00
            X.9ui r0 = r0.A01
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "captured"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x030b
            java.lang.String r0 = "pending"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0506
        L_0x030b:
            X.9gL r1 = r5.A0B
            X.9uk r0 = r4.A00
            if (r0 == 0) goto L_0x01d7
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x01d7
            X.0wU r13 = r1.A04
            r0 = 32
            X.3wq r12 = new X.3wq
            r12.<init>((X.C23043B1o) r4, (X.C199969gL) r1, (int) r0)
            goto L_0x03a0
        L_0x0320:
            boolean r0 = X.C198269dB.A00(r6, r10)
            if (r0 == 0) goto L_0x03b4
            X.C18740tg.A06(r8)
            X.3Qa r14 = r2.A0C
            X.11F r13 = r14.A00
            X.C18740tg.A06(r13)
            X.0wG r4 = r5.A01
            X.0yC r15 = r5.A02
            java.lang.String r0 = X.C203219nY.A04(r3)
            java.lang.Integer r0 = X.C202869mo.A00(r15, r0)
            r15 = 0
            if (r0 == 0) goto L_0x0500
            int r0 = r0.intValue()
            java.lang.String r4 = r4.A01(r0)
            int r0 = r3.bitField1_
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x03a5
            X.8SV r0 = r3.interactiveMessage_
            if (r0 != 0) goto L_0x0357
            X.8SV r0 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x0357:
            X.8Nn r0 = r0.body_
            if (r0 != 0) goto L_0x035d
            X.8Nn r0 = X.C172358Nn.DEFAULT_INSTANCE
        L_0x035d:
            java.lang.String r15 = r0.text_
        L_0x035f:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0371
            r0 = 2
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            X.C90494aF.A1H(r4, r15, r0)
            java.lang.String r4 = "\n"
            java.lang.String r4 = X.AnonymousClass14B.A08(r4, r0)
        L_0x0371:
            if (r4 == 0) goto L_0x0500
            long r0 = r2.A04
            X.2bV r4 = X.C165597tg.A0Y(r14, r4, r0)
            X.B1o r8 = X.C202449lr.A01(r8, r13, r3, r12)
        L_0x037d:
            if (r8 == 0) goto L_0x01d7
            X.1FO r1 = r5.A09
            r0 = r8
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            r1.A00(r4, r0)
            X.9gL r1 = r5.A0B
            X.9uk r0 = r8.BA8()
            if (r0 == 0) goto L_0x01d7
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x01d7
            boolean r0 = r8 instanceof X.AnonymousClass3T1
            if (r0 == 0) goto L_0x01d7
            X.0wU r13 = r1.A04
            r0 = 33
            X.3wq r12 = new X.3wq
            r12.<init>((X.C23043B1o) r8, (X.C199969gL) r1, (int) r0)
        L_0x03a0:
            r13.Boy(r12)
            goto L_0x01d7
        L_0x03a5:
            int r0 = r3.bitField1_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x035f
            X.8Re r0 = r3.buttonsMessage_
            if (r0 != 0) goto L_0x03b1
            X.8Re r0 = X.C173308Re.DEFAULT_INSTANCE
        L_0x03b1:
            java.lang.String r15 = r0.contentText_
            goto L_0x035f
        L_0x03b4:
            X.0yC r1 = r5.A02
            r0 = 3051(0xbeb, float:4.275E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x03e1
            boolean r0 = X.C198269dB.A00(r6, r11)
            if (r0 == 0) goto L_0x03e1
            X.9Pk r12 = r5.A06
            X.3Qa r4 = r2.A0C
            long r0 = r2.A04
            r18 = r12
            r19 = r8
            r20 = r3
            r21 = r4
            r22 = r0
            X.2bV r4 = r18.A00(r19, r20, r21, r22)
            X.3PX r1 = r5.A0A
            java.lang.String r0 = "link_to_webview_status"
            r1.A02(r4, r0, r13)
            goto L_0x01d7
        L_0x03e1:
            X.91C r0 = X.AnonymousClass91C.DOCUMENT
            if (r4 != r0) goto L_0x041f
            int r1 = r6.headerCase_
            r0 = 2
            if (r1 != r0) goto L_0x041f
            java.lang.Object r8 = r6.header_
            X.8SC r8 = (X.AnonymousClass8SC) r8
            X.ABv r13 = r5.A03
            X.3Qa r12 = r2.A0C
            long r0 = r2.A04
            X.2by r4 = new X.2by
            r4.<init>(r12, r0)
            X.9Tv r12 = r13.A01
            boolean r22 = r2.A03()
            boolean r1 = r2.A0O
            int r0 = r2.A01
            r18 = r12
            r19 = r8
            r20 = r4
            r21 = r0
            r23 = r1
            r18.A01(r19, r20, r21, r22, r23)
            int r1 = r8.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x01d7
            X.8SG r7 = r8.contextInfo_
        L_0x0419:
            if (r7 != 0) goto L_0x01d7
            X.8SG r7 = X.AnonymousClass8SG.DEFAULT_INSTANCE
            goto L_0x01d7
        L_0x041f:
            X.91C r0 = X.AnonymousClass91C.IMAGE
            if (r4 != r0) goto L_0x0457
            int r1 = r6.headerCase_
            r0 = 3
            if (r1 != r0) goto L_0x0457
            java.lang.Object r8 = r6.header_
            X.8SF r8 = (X.AnonymousClass8SF) r8
            X.ABn r13 = r5.A04
            X.3Qa r12 = r2.A0C
            long r0 = r2.A04
            X.2bp r4 = new X.2bp
            r4.<init>(r12, r0)
            X.9Vt r12 = r13.A01
            boolean r22 = r2.A03()
            boolean r1 = r2.A0O
            int r0 = r2.A01
            r18 = r12
            r19 = r8
            r20 = r4
            r21 = r0
            r23 = r1
            r18.A02(r19, r20, r21, r22, r23)
            int r0 = r8.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01d7
            X.8SG r7 = r8.contextInfo_
            goto L_0x0419
        L_0x0457:
            X.91C r0 = X.AnonymousClass91C.VIDEO
            if (r4 != r0) goto L_0x047c
            int r0 = r6.headerCase_
            if (r0 != r13) goto L_0x047c
            java.lang.Object r12 = r6.header_
            X.8SE r12 = (X.AnonymousClass8SE) r12
            X.ABo r13 = r5.A05
            X.3Qa r8 = r2.A0C
            long r0 = r2.A04
            X.8o3 r4 = new X.8o3
            r4.<init>(r8, r0)
            X.9Xl r0 = r13.A01
            X.C196049Xl.A00(r2, r12, r4, r0)
            int r0 = r12.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01d7
            X.8SG r7 = r12.contextInfo_
            goto L_0x0419
        L_0x047c:
            X.91C r0 = X.AnonymousClass91C.LOCATION
            if (r4 != r0) goto L_0x04aa
            int r1 = r6.headerCase_
            r0 = 5
            if (r1 != r0) goto L_0x04aa
            java.lang.Object r12 = r6.header_
            X.8Ry r12 = (X.C173508Ry) r12
            X.8Ry r13 = r3.locationMessage_
            if (r13 != 0) goto L_0x048f
            X.8Ry r13 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x048f:
            X.C18740tg.A06(r13)
            X.3Qa r8 = r2.A0C
            long r0 = r2.A04
            X.2bs r4 = new X.2bs
            r4.<init>(r8, r0)
            boolean r0 = r2.A0O
            X.C198499df.A00(r13, r4, r0)
            int r0 = r12.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01d7
            X.8SG r7 = r12.contextInfo_
            goto L_0x0419
        L_0x04aa:
            X.91C r0 = X.AnonymousClass91C.TEXT
            if (r4 != r0) goto L_0x04cb
            int r1 = r6.headerCase_
            r0 = 1
            if (r1 != r0) goto L_0x04cb
            X.3Qa r12 = r2.A0C
            long r0 = r2.A04
            java.lang.Object r8 = r6.header_
            java.lang.String r8 = (java.lang.String) r8
        L_0x04bb:
            X.2bV r4 = new X.2bV
            r4.<init>(r12, r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.AnonymousClass14B.A0C(r8, r0)
            r4.A16(r0)
            goto L_0x01d7
        L_0x04cb:
            X.91C r0 = X.AnonymousClass91C.EMPTY
            if (r4 != r0) goto L_0x0506
            X.3Qa r12 = r2.A0C
            long r0 = r2.A04
            java.lang.String r8 = ""
            goto L_0x04bb
        L_0x04d6:
            X.37E r0 = new X.37E
            r0.<init>(r9, r8, r6)
            r4.A10(r0)
        L_0x04de:
            X.005 r0 = r5.A0C
            java.lang.Object r5 = r0.get()
            X.0xO r5 = (X.C20330xO) r5
            boolean r0 = r3.A0x()
            if (r0 == 0) goto L_0x04f8
            X.8Ri r1 = r3.messageContextInfo_
            if (r1 != 0) goto L_0x04f2
            X.8Ri r1 = X.C173348Ri.DEFAULT_INSTANCE
        L_0x04f2:
            X.1c0 r0 = r5.A01
            r0.A01(r2, r7, r1, r4)
            return r4
        L_0x04f8:
            r1 = 0
            goto L_0x04f2
        L_0x04fa:
            X.1Tb r0 = new X.1Tb
            r0.<init>(r1)
            throw r0
        L_0x0500:
            X.1Tb r0 = new X.1Tb
            r0.<init>(r1)
            throw r0
        L_0x0506:
            X.3Qa r5 = r2.A0C
            long r0 = r2.A04
            byte[] r6 = r3.A0o()
            r7 = 2
            int r2 = r2.A01
            X.2bK r4 = new X.2bK
            r8 = r2
            r9 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0519:
            X.1Tb r0 = new X.1Tb
            r0.<init>(r1)
            throw r0
        L_0x051f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21184ABs.BlH(X.9YL):X.3T1");
    }

    public C21184ABs(C20810yC r1, C194369Pk r2, C198269dB r3, C203129nM r4, AnonymousClass1AW r5, AnonymousClass3PX r6, AnonymousClass005 r7) {
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A02 = r3;
    }
}
