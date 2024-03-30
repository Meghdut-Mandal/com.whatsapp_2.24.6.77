package X;

/* renamed from: X.5W0  reason: invalid class name */
public abstract class AnonymousClass5W0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v110, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: X.7a8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: X.6gO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: X.6gO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: X.7a8} */
    /* JADX WARNING: type inference failed for: r20v1 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0398, code lost:
        if (r1 == r10) goto L_0x039a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x039a, code lost:
        r28 = new X.C137586gO(r7, r19, r11, r14, r25);
        r4.Bwv(r28);
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03ae, code lost:
        X.C136916fF.A0M(r9, false);
        r12 = r12.Bva((X.C161267mT) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e0, code lost:
        if (r0 == r10) goto L_0x01e2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C157497dd r45, X.C158757iB r46, X.C158767iC r47, X.C156907b9 r48, androidx.compose.foundation.lazy.LazyListState r49, X.C161337ma r50, X.C157627dq r51, X.AnonymousClass7bO r52, X.C161267mT r53, X.C006302t r54, int r55, int r56, int r57, int r58, boolean r59, boolean r60, boolean r61) {
        /*
            r27 = r55
            r42 = r51
            r44 = r47
            r41 = r52
            r1 = r46
            r22 = r1
            r0 = 620764179(0x25001c13, float:1.1111742E-16)
            r4 = r50
            r4.Bun(r0)
            r2 = r58
            r0 = r58 & 1
            r3 = r56
            r40 = r53
            if (r0 == 0) goto L_0x04c2
            r6 = r56 | 6
        L_0x0020:
            r0 = r58 & 2
            r5 = r49
            if (r0 == 0) goto L_0x04b7
            r6 = r6 | 48
        L_0x0028:
            r0 = r58 & 4
            r13 = 256(0x100, float:3.59E-43)
            r43 = r48
            if (r0 == 0) goto L_0x04aa
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r0 = r58 & 8
            r25 = r59
            if (r0 == 0) goto L_0x0497
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x003a:
            r7 = r58 & 16
            r0 = 57344(0xe000, float:8.0356E-41)
            r24 = r60
            if (r7 == 0) goto L_0x0484
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0045:
            r7 = r58 & 32
            r0 = 458752(0x70000, float:6.42848E-40)
            if (r7 == 0) goto L_0x0474
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x004d:
            r6 = r6 | r0
        L_0x004e:
            r7 = r58 & 64
            r0 = 3670016(0x380000, float:5.142788E-39)
            r23 = r61
            if (r7 == 0) goto L_0x0464
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x0058:
            r6 = r6 | r0
        L_0x0059:
            r7 = r2 & 128(0x80, float:1.794E-43)
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            if (r7 == 0) goto L_0x0458
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0061:
            r6 = r6 | r0
        L_0x0062:
            r8 = r2 & 256(0x100, float:3.59E-43)
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            if (r8 == 0) goto L_0x0446
            r9 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x006a:
            r6 = r6 | r9
        L_0x006b:
            r9 = r2 & 512(0x200, float:7.175E-43)
            r10 = 805306368(0x30000000, float:4.656613E-10)
            if (r9 != 0) goto L_0x0083
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r56 & r0
            if (r0 != 0) goto L_0x0084
            r0 = r44
            boolean r0 = r4.B2f(r0)
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == 0) goto L_0x0083
            r10 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0083:
            r6 = r6 | r10
        L_0x0084:
            r10 = r2 & 1024(0x400, float:1.435E-42)
            r26 = r57
            if (r10 == 0) goto L_0x0430
            r12 = r57 | 6
        L_0x008c:
            r11 = r2 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x0425
            r12 = r12 | 48
        L_0x0092:
            r0 = r2 & 4096(0x1000, float:5.74E-42)
            r39 = r54
            if (r0 == 0) goto L_0x0412
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x009a:
            r13 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r13 = r13 & r6
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r0) goto L_0x00de
            r6 = r12 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r6 != r0) goto L_0x00de
            boolean r0 = r4.BHg()
            if (r0 == 0) goto L_0x00de
            r4.BuE()
        L_0x00b2:
            X.6fO r1 = r4.B6Z()
            if (r1 == 0) goto L_0x00dd
            X.7ZB r0 = new X.7ZB
            r7 = r5
            r8 = r42
            r9 = r41
            r10 = r40
            r11 = r39
            r12 = r27
            r13 = r3
            r14 = r26
            r15 = r2
            r16 = r25
            r17 = r24
            r18 = r23
            r2 = r0
            r3 = r45
            r4 = r22
            r5 = r44
            r6 = r43
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.A06 = r0
        L_0x00dd:
            return
        L_0x00de:
            if (r7 == 0) goto L_0x00e2
            r27 = 0
        L_0x00e2:
            r22 = 0
            if (r8 == 0) goto L_0x00e8
            r42 = r22
        L_0x00e8:
            if (r9 == 0) goto L_0x00ec
            r44 = r22
        L_0x00ec:
            if (r10 == 0) goto L_0x00f0
            r41 = r22
        L_0x00f0:
            if (r11 != 0) goto L_0x00f4
            r22 = r1
        L_0x00f4:
            r0 = -343736148(0xffffffffeb8300ac, float:-3.167449E26)
            r4.Bum(r0)
            r0 = r39
            X.7n5 r1 = X.AnonymousClass6G2.A00(r4, r0)
            boolean r0 = X.C90494aF.A1T(r4, r5)
            java.lang.Object r6 = r4.BnZ()
            if (r0 != 0) goto L_0x010e
            java.lang.Object r0 = X.C129736Ig.A00
            if (r6 != r0) goto L_0x013a
        L_0x010e:
            X.5na r8 = new X.5na
            r8.<init>()
            X.6fX r7 = X.C137066fX.A00
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>"
            X.AnonymousClass00C.A0E(r7, r6)
            X.7Ii r0 = new X.7Ii
            r0.<init>(r1)
            X.4hV r1 = new X.4hV
            r1.<init>(r7, r0)
            X.AnonymousClass00C.A0E(r7, r6)
            X.7OP r0 = new X.7OP
            r0.<init>(r8, r5, r1)
            X.4hV r1 = new X.4hV
            r1.<init>(r7, r0)
            r0 = 0
            X.5WM r6 = new X.5WM
            r6.<init>(r1, r0)
            r4.Bwv(r6)
        L_0x013a:
            r9 = r4
            X.6fF r9 = (X.C136916fF) r9
            r0 = 0
            X.C136916fF.A0M(r9, r0)
            X.0mQ r6 = (X.C14930mQ) r6
            X.C136916fF.A0M(r9, r0)
            r0 = 596174919(0x2388e847, float:1.4843523E-17)
            r4.Bum(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r24)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r4.Bum(r0)
            boolean r7 = r4.B2f(r5)
            boolean r0 = r4.B2f(r1)
            r0 = r0 | r7
            java.lang.Object r11 = r4.BnZ()
            if (r0 != 0) goto L_0x0169
            java.lang.Object r0 = X.C129736Ig.A00
            if (r11 != r0) goto L_0x0173
        L_0x0169:
            X.6f6 r11 = new X.6f6
            r0 = r24
            r11.<init>(r5, r0)
            r4.Bwv(r11)
        L_0x0173:
            r0 = 0
            X.C136916fF.A0M(r9, r0)
            X.7bG r11 = (X.AnonymousClass7bG) r11
            X.C136916fF.A0M(r9, r0)
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            java.lang.Object r7 = X.C90474aD.A0a(r4, r0)
            java.lang.Object r10 = X.C129736Ig.A00
            if (r7 != r10) goto L_0x0195
            X.03u r0 = X.C008903u.A00
            X.041 r0 = X.C132846Vm.A00(r4, r0)
            X.6fR r7 = new X.6fR
            r7.<init>(r0)
            r4.Bwv(r7)
        L_0x0195:
            r8 = 0
            X.C136916fF.A0M(r9, r8)
            X.6fR r7 = (X.C137006fR) r7
            X.040 r0 = r7.A00
            X.C136916fF.A0M(r9, r8)
            r5.A08 = r0
            r0 = 183156450(0xaeabee2, float:2.2605182E-32)
            r4.Bum(r0)
            r14 = 8
            java.lang.Object[] r13 = new java.lang.Object[r14]
            r12 = 0
            r0 = r43
            X.C90494aF.A1H(r5, r0, r13)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r25)
            r0 = r21
            X.C90514aH.A1O(r0, r1, r13)
            r15 = r42
            r7 = r41
            r1 = r22
            r0 = r44
            X.AnonymousClass000.A18(r15, r7, r1, r0, r13)
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r4.Bum(r0)
            r1 = 0
        L_0x01cd:
            r0 = r13[r12]
            boolean r0 = r4.B2f(r0)
            r1 = r1 | r0
            int r12 = r12 + 1
            if (r12 < r14) goto L_0x01cd
            java.lang.Object r20 = r4.BnZ()
            if (r1 != 0) goto L_0x01e2
            r0 = r20
            if (r0 != r10) goto L_0x0202
        L_0x01e2:
            X.7a8 r20 = new X.7a8
            r28 = r20
            r29 = r22
            r30 = r44
            r31 = r43
            r32 = r5
            r33 = r15
            r34 = r7
            r35 = r6
            r36 = r27
            r37 = r24
            r38 = r25
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r0 = r20
            r9.A0R(r0)
        L_0x0202:
            X.C136916fF.A0M(r9, r8)
            r0 = r20
            X.03v r0 = (X.C009003v) r0
            r20 = r0
            X.C136916fF.A0M(r9, r8)
            r0 = 1809802212(0x6bdf63e4, float:5.4012436E26)
            r4.Bum(r0)
            r0 = -1476348564(0xffffffffa800b56c, float:-7.144767E-15)
            r4.Bum(r0)
            X.4gm r0 = X.C131966Ro.A01
            java.lang.Object r7 = X.AnonymousClass6G0.A01(r9, r0)
            android.content.Context r7 = (android.content.Context) r7
            X.4gm r0 = X.C112185dU.A00
            java.lang.Object r1 = X.AnonymousClass6G0.A01(r9, r0)
            X.69B r1 = (X.AnonymousClass69B) r1
            if (r1 == 0) goto L_0x040e
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = X.C90464aC.A1X(r4, r7, r1, r0)
            java.lang.Object r8 = r4.BnZ()
            if (r0 != 0) goto L_0x023b
            if (r8 != r10) goto L_0x0243
        L_0x023b:
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r8 = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect
            r8.<init>(r7, r1)
            r9.A0R(r8)
        L_0x0243:
            r0 = 0
            X.C136916fF.A0M(r9, r0)
            X.7ki r8 = (X.C160257ki) r8
        L_0x0249:
            X.C136916fF.A0G(r9)
            if (r60 == 0) goto L_0x040a
            X.5RU r7 = X.AnonymousClass5RU.Vertical
        L_0x0250:
            X.7nA r1 = r5.A0P
            r0 = r40
            X.7mT r1 = r0.Bva(r1)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r5.A0H
            X.7mT r19 = r1.Bva(r0)
            r0 = 1070136913(0x3fc8fe51, float:1.5702611)
            r4.Bum(r0)
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            java.lang.Object r1 = X.C90474aD.A0a(r4, r0)
            if (r1 != r10) goto L_0x027b
            X.03u r0 = X.C008903u.A00
            X.041 r0 = X.C132846Vm.A00(r4, r0)
            X.6fR r1 = new X.6fR
            r1.<init>(r0)
            r4.Bwv(r1)
        L_0x027b:
            r0 = 0
            X.C136916fF.A0M(r9, r0)
            X.6fR r1 = (X.C137006fR) r1
            X.040 r13 = r1.A00
            X.C136916fF.A0M(r9, r0)
            r14 = 4
            java.lang.Object[] r12 = new java.lang.Object[r14]
            r1 = 0
            r12[r0] = r6
            r0 = 1
            X.C36411kG.A1Q(r11, r7, r12, r0)
            r15 = 3
            r0 = r23
            X.AnonymousClass000.A1N(r12, r15, r0)
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r4.Bum(r0)
            r15 = 0
            r16 = 0
        L_0x029f:
            r0 = r12[r15]
            boolean r0 = r4.B2f(r0)
            r16 = r16 | r0
            int r15 = r15 + 1
            if (r15 < r14) goto L_0x029f
            java.lang.Object r12 = r4.BnZ()
            if (r16 != 0) goto L_0x02b3
            if (r12 != r10) goto L_0x030a
        L_0x02b3:
            X.5RU r0 = X.AnonymousClass5RU.Vertical
            boolean r18 = X.C36361kB.A1a(r7, r0)
            X.7Qt r17 = new X.7Qt
            r0 = r17
            r0.<init>(r6)
            X.7Ik r15 = new X.7Ik
            r15.<init>(r11)
            X.7Il r14 = new X.7Il
            r14.<init>(r11)
            X.62P r16 = new X.62P
            r12 = r16
            r0 = r25
            r12.<init>(r15, r14, r0)
            r12 = 0
            if (r61 == 0) goto L_0x0407
            X.7YP r12 = new X.7YP
            r0 = r18
            r12.<init>(r11, r13, r0)
            X.7UZ r14 = new X.7UZ
            r14.<init>(r11, r6, r13)
        L_0x02e2:
            X.6f6 r11 = (X.C136856f6) r11
            boolean r15 = r11.A01
            r13 = -1
            r0 = 1
            X.5nm r11 = new X.5nm
            if (r15 == 0) goto L_0x0402
            r11.<init>(r13, r0)
        L_0x02ef:
            X.7VW r0 = new X.7VW
            r28 = r0
            r29 = r11
            r30 = r16
            r31 = r17
            r32 = r14
            r33 = r12
            r34 = r18
            r28.<init>(r29, r30, r31, r32, r33, r34)
            androidx.compose.ui.semantics.AppendedSemanticsElement r12 = new androidx.compose.ui.semantics.AppendedSemanticsElement
            r12.<init>(r0, r1)
            r4.Bwv(r12)
        L_0x030a:
            X.C136916fF.A0M(r9, r1)
            X.7mT r12 = (X.C161267mT) r12
            r0 = r19
            X.7mT r11 = r0.Bva(r12)
            X.C136916fF.A0M(r9, r1)
            X.5RU r18 = X.AnonymousClass5RU.Vertical
            r0 = r18
            if (r7 != r0) goto L_0x03fe
            X.7mT r0 = X.C113785g7.A02
        L_0x0320:
            X.7mT r12 = r11.Bva(r0)
            r0 = -1877443446(0xffffffff90187c8a, float:-3.0072656E-29)
            r4.Bum(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r27)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r4.Bum(r0)
            boolean r11 = r4.B2f(r5)
            boolean r0 = r4.B2f(r13)
            r0 = r0 | r11
            java.lang.Object r11 = r4.BnZ()
            if (r0 != 0) goto L_0x0345
            if (r11 != r10) goto L_0x034f
        L_0x0345:
            X.6f0 r11 = new X.6f0
            r0 = r27
            r11.<init>(r5, r0)
            r4.Bwv(r11)
        L_0x034f:
            X.C136916fF.A0M(r9, r1)
            X.6f0 r11 = (X.C136796f0) r11
            X.C136916fF.A0M(r9, r1)
            X.5gv r0 = r5.A0I
            r19 = r0
            X.4gm r17 = X.C131996Rr.A03
            r0 = r17
            java.lang.Object r14 = X.AnonymousClass6G0.A01(r9, r0)
            X.5RW r14 = (X.AnonymousClass5RW) r14
            r0 = 1331498025(0x4f5d0c29, float:3.70856166E9)
            r4.Bum(r0)
            if (r61 == 0) goto L_0x03b8
            r0 = 5
            java.lang.Object[] r15 = new java.lang.Object[r0]
            r13 = 0
            r15[r1] = r11
            r1 = r19
            r0 = r21
            X.C90464aC.A1D(r1, r0, r14, r15)
            r0 = 4
            r15[r0] = r7
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r4.Bum(r0)
            r16 = 0
        L_0x0385:
            r0 = r15[r13]
            boolean r0 = r4.B2f(r0)
            r16 = r16 | r0
            int r13 = r13 + 1
            r0 = 5
            if (r13 < r0) goto L_0x0385
            java.lang.Object r1 = r4.BnZ()
            if (r16 != 0) goto L_0x039a
            if (r1 != r10) goto L_0x03ae
        L_0x039a:
            X.6gO r1 = new X.6gO
            r28 = r1
            r29 = r7
            r30 = r19
            r31 = r11
            r32 = r14
            r33 = r25
            r28.<init>(r29, r30, r31, r32, r33)
            r4.Bwv(r1)
        L_0x03ae:
            r0 = 0
            X.C136916fF.A0M(r9, r0)
            X.7mT r1 = (X.C161267mT) r1
            X.7mT r12 = r12.Bva(r1)
        L_0x03b8:
            r0 = 0
            X.C136916fF.A0M(r9, r0)
            X.7mT r0 = r8.BBQ()
            X.7mT r10 = r12.Bva(r0)
            r0 = r17
            java.lang.Object r1 = X.AnonymousClass6G0.A01(r9, r0)
            r19 = r59 ^ 1
            X.5RW r0 = X.AnonymousClass5RW.Rtl
            if (r1 != r0) goto L_0x03d6
            r0 = r18
            if (r7 == r0) goto L_0x03d6
            r19 = r19 ^ 1
        L_0x03d6:
            X.7mu r1 = r5.A0E
            X.7mH r13 = X.C129896Iw.A01
            X.02t r0 = androidx.compose.foundation.gestures.ScrollableKt.A04
            androidx.compose.foundation.gestures.ScrollableElement r0 = new androidx.compose.foundation.gestures.ScrollableElement
            r11 = r0
            r12 = r8
            r14 = r45
            r15 = r7
            r16 = r5
            r17 = r1
            r18 = r23
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            X.7mT r9 = r10.Bva(r0)
            X.5gw r0 = r5.A0K
            r12 = 0
            r13 = 0
            r7 = r0
            r8 = r4
            r10 = r6
            r11 = r20
            X.AnonymousClass5W3.A00(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00b2
        L_0x03fe:
            X.7mT r0 = X.C113785g7.A01
            goto L_0x0320
        L_0x0402:
            r11.<init>(r0, r13)
            goto L_0x02ef
        L_0x0407:
            r14 = r12
            goto L_0x02e2
        L_0x040a:
            X.5RU r7 = X.AnonymousClass5RU.Horizontal
            goto L_0x0250
        L_0x040e:
            X.6eW r8 = X.C136516eW.A00
            goto L_0x0249
        L_0x0412:
            r0 = r26
            r0 = r0 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x009a
            r0 = r39
            boolean r0 = r4.B2h(r0)
            if (r0 != 0) goto L_0x0422
            r13 = 128(0x80, float:1.794E-43)
        L_0x0422:
            r12 = r12 | r13
            goto L_0x009a
        L_0x0425:
            r0 = r57 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0092
            int r0 = X.C90464aC.A09(r4, r1)
            r12 = r12 | r0
            goto L_0x0092
        L_0x0430:
            r0 = r57 & 14
            if (r0 != 0) goto L_0x0442
            r0 = r41
            boolean r0 = r4.B2f(r0)
            int r0 = X.C90484aE.A04(r0)
            r12 = r57 | r0
            goto L_0x008c
        L_0x0442:
            r12 = r26
            goto L_0x008c
        L_0x0446:
            r0 = r56 & r0
            if (r0 != 0) goto L_0x006b
            r0 = r42
            boolean r0 = r4.B2f(r0)
            r9 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x006a
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x006a
        L_0x0458:
            r0 = r56 & r0
            if (r0 != 0) goto L_0x0062
            r0 = r27
            int r0 = X.C90514aH.A0F(r4, r0)
            goto L_0x0061
        L_0x0464:
            r0 = r56 & r0
            if (r0 != 0) goto L_0x0059
            r0 = r23
            boolean r0 = r4.B2g(r0)
            int r0 = X.C90514aH.A07(r0)
            goto L_0x0058
        L_0x0474:
            r0 = r56 & r0
            if (r0 != 0) goto L_0x004e
            r0 = r45
            boolean r0 = r4.B2f(r0)
            int r0 = X.C90514aH.A08(r0)
            goto L_0x004d
        L_0x0484:
            r0 = r56 & r0
            if (r0 != 0) goto L_0x0045
            r0 = r24
            boolean r7 = r4.B2g(r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x0494
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x0494:
            r6 = r6 | r0
            goto L_0x0045
        L_0x0497:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x003a
            r0 = r25
            boolean r7 = r4.B2g(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x04a7
            r0 = 2048(0x800, float:2.87E-42)
        L_0x04a7:
            r6 = r6 | r0
            goto L_0x003a
        L_0x04aa:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0032
            r0 = r43
            int r0 = X.C90474aD.A04(r4, r0)
            r6 = r6 | r0
            goto L_0x0032
        L_0x04b7:
            r0 = r56 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0028
            int r0 = X.C90464aC.A09(r4, r5)
            r6 = r6 | r0
            goto L_0x0028
        L_0x04c2:
            r0 = r56 & 14
            if (r0 != 0) goto L_0x04d0
            r0 = r40
            int r6 = X.C90464aC.A0A(r4, r0)
            r6 = r6 | r56
            goto L_0x0020
        L_0x04d0:
            r6 = r3
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5W0.A00(X.7dd, X.7iB, X.7iC, X.7b9, androidx.compose.foundation.lazy.LazyListState, X.7ma, X.7dq, X.7bO, X.7mT, X.02t, int, int, int, int, boolean, boolean, boolean):void");
    }
}
