package X;

import java.util.Collections;

/* renamed from: X.9hb  reason: invalid class name and case insensitive filesystem */
public abstract class C200559hb {
    public static final C197499bo A00 = C197499bo.A00("ty", "d");

    public static AnonymousClass817 A00(AnonymousClass817 r1) {
        if (r1 == null) {
            return new AnonymousClass817(Collections.singletonList(new C202689mQ(100)));
        }
        return r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: X.815} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: X.81A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v42, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.Ax4] */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3, types: [X.B25] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v24, types: [X.B25] */
    /* JADX WARNING: type inference failed for: r9v27, types: [X.B25] */
    /* JADX WARNING: type inference failed for: r9v34 */
    /* JADX WARNING: type inference failed for: r9v37 */
    /* JADX WARNING: type inference failed for: r7v31, types: [X.9yK] */
    /* JADX WARNING: type inference failed for: r9v52 */
    /* JADX WARNING: type inference failed for: r9v60 */
    /* JADX WARNING: type inference failed for: r9v72 */
    /* JADX WARNING: type inference failed for: r9v74 */
    /* JADX WARNING: type inference failed for: r9v75 */
    /* JADX WARNING: type inference failed for: r9v79 */
    /* JADX WARNING: type inference failed for: r7v32, types: [X.9yT] */
    /* JADX WARNING: type inference failed for: r9v90 */
    /* JADX WARNING: type inference failed for: r9v95 */
    /* JADX WARNING: type inference failed for: r8v19, types: [X.9yL] */
    /* JADX WARNING: type inference failed for: r9v102 */
    /* JADX WARNING: type inference failed for: r9v108 */
    /* JADX WARNING: type inference failed for: r9v121 */
    /* JADX WARNING: type inference failed for: r9v123 */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r9v130 */
    /* JADX WARNING: type inference failed for: r9v133 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r0.A0S() == false) goto L_0x0692;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r0.A0Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x05d3, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0634, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x068f, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0692, code lost:
        r0.A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0695, code lost:
        return r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C22854Ax4 A02(X.AnonymousClass9Y2 r21, X.C21655ATw r22) {
        /*
            r0 = r22
            r0.A0M()
            r7 = 2
        L_0x0006:
            boolean r1 = r0.A0S()
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L_0x06a1
            X.9bo r1 = A00
            int r1 = r0.A0F(r1)
            if (r1 == 0) goto L_0x0024
            if (r1 == r2) goto L_0x001f
            r0.A0P()
            r0.A0Q()
            goto L_0x0006
        L_0x001f:
            int r7 = r0.A0E()
            goto L_0x0006
        L_0x0024:
            java.lang.String r3 = r0.A0J()
            if (r3 == 0) goto L_0x06a1
            int r2 = r3.hashCode()
            r1 = r21
            switch(r2) {
                case 3239: goto L_0x063a;
                case 3270: goto L_0x05d6;
                case 3295: goto L_0x0535;
                case 3307: goto L_0x04e5;
                case 3308: goto L_0x03b3;
                case 3488: goto L_0x0356;
                case 3633: goto L_0x0308;
                case 3634: goto L_0x02cd;
                case 3646: goto L_0x027f;
                case 3669: goto L_0x022f;
                case 3679: goto L_0x019a;
                case 3681: goto L_0x00b6;
                case 3705: goto L_0x0057;
                case 3710: goto L_0x004a;
                default: goto L_0x0033;
            }
        L_0x0033:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Unknown shape type "
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r3, r2)
            X.AnonymousClass6GP.A00(r1)
        L_0x0040:
            boolean r1 = r0.A0S()
            if (r1 == 0) goto L_0x0692
            r0.A0Q()
            goto L_0x0040
        L_0x004a:
            java.lang.String r2 = "tr"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9yW r9 = X.C196919ak.A00(r1, r0)
            goto L_0x0040
        L_0x0057:
            java.lang.String r2 = "tm"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass98Y.A00
            r4 = 0
            r6 = r9
            r7 = r9
            r8 = r9
            r10 = 0
        L_0x0066:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x00af
            X.9bo r2 = X.AnonymousClass98Y.A00
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x00aa
            r2 = 1
            if (r3 == r2) goto L_0x00a5
            r2 = 2
            if (r3 == r2) goto L_0x00a0
            r2 = 3
            if (r3 == r2) goto L_0x009c
            r2 = 4
            if (r3 == r2) goto L_0x008c
            r2 = 5
            if (r3 == r2) goto L_0x0087
            r0.A0Q()
            goto L_0x0066
        L_0x0087:
            boolean r10 = r0.A0T()
            goto L_0x0066
        L_0x008c:
            int r3 = r0.A0E()
            r2 = 1
            if (r3 == r2) goto L_0x0099
            r2 = 2
            if (r3 != r2) goto L_0x0696
            java.lang.Integer r9 = X.C023109s.A01
            goto L_0x0066
        L_0x0099:
            java.lang.Integer r9 = X.C023109s.A00
            goto L_0x0066
        L_0x009c:
            r0.A0J()
            goto L_0x0066
        L_0x00a0:
            X.815 r8 = X.C200299h7.A01(r1, r0, r4)
            goto L_0x0066
        L_0x00a5:
            X.815 r7 = X.C200299h7.A01(r1, r0, r4)
            goto L_0x0066
        L_0x00aa:
            X.815 r6 = X.C200299h7.A01(r1, r0, r4)
            goto L_0x0066
        L_0x00af:
            X.9yU r5 = new X.9yU
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x068f
        L_0x00b6:
            java.lang.String r2 = "st"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass9AG.A00
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r4 = 0
            r16 = 0
            r11 = 0
            r10 = 0
            r12 = 0
            r8 = 0
            r18 = 0
            r19 = 0
            r14 = 0
            r15 = 0
        L_0x00d1:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x0185
            X.9bo r2 = X.AnonymousClass9AG.A01
            int r2 = r0.A0F(r2)
            r5 = 1
            switch(r2) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x00ea;
                case 2: goto L_0x017f;
                case 3: goto L_0x00ef;
                case 4: goto L_0x00f4;
                case 5: goto L_0x0101;
                case 6: goto L_0x010e;
                case 7: goto L_0x0113;
                case 8: goto L_0x0118;
                default: goto L_0x00e1;
            }
        L_0x00e1:
            r0.A0Q()
            goto L_0x00d1
        L_0x00e5:
            java.lang.String r16 = r0.A0J()
            goto L_0x00d1
        L_0x00ea:
            X.814 r10 = X.C200299h7.A00(r1, r0)
            goto L_0x00d1
        L_0x00ef:
            X.817 r8 = X.C200299h7.A02(r1, r0)
            goto L_0x00d1
        L_0x00f4:
            r2 = 3
            java.lang.Integer[] r6 = X.C023109s.A00(r2)
            int r2 = r0.A0E()
            int r2 = r2 - r5
            r14 = r6[r2]
            goto L_0x00d1
        L_0x0101:
            r2 = 3
            java.lang.Integer[] r6 = X.C023109s.A00(r2)
            int r2 = r0.A0E()
            int r2 = r2 - r5
            r15 = r6[r2]
            goto L_0x00d1
        L_0x010e:
            float r18 = X.C21655ATw.A08(r0)
            goto L_0x00d1
        L_0x0113:
            boolean r19 = r0.A0T()
            goto L_0x00d1
        L_0x0118:
            r0.A0L()
        L_0x011b:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x016d
            r0.A0M()
            r7 = 0
            r6 = 0
        L_0x0126:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x0147
            X.9bo r2 = X.AnonymousClass9AG.A00
            int r2 = r0.A0F(r2)
            if (r2 == 0) goto L_0x0142
            if (r2 == r5) goto L_0x013d
            r0.A0P()
            r0.A0Q()
            goto L_0x0126
        L_0x013d:
            X.815 r6 = X.C200299h7.A01(r1, r0, r5)
            goto L_0x0126
        L_0x0142:
            java.lang.String r7 = r0.A0J()
            goto L_0x0126
        L_0x0147:
            r0.A0O()
            int r2 = r7.hashCode()
            switch(r2) {
                case 100: goto L_0x0152;
                case 103: goto L_0x0155;
                case 111: goto L_0x0163;
                default: goto L_0x0151;
            }
        L_0x0151:
            goto L_0x011b
        L_0x0152:
            java.lang.String r2 = "d"
            goto L_0x0157
        L_0x0155:
            java.lang.String r2 = "g"
        L_0x0157:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x011b
            r1.A0C = r5
            r3.add(r6)
            goto L_0x011b
        L_0x0163:
            java.lang.String r2 = "o"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x011b
            r11 = r6
            goto L_0x011b
        L_0x016d:
            r0.A0N()
            int r2 = r3.size()
            if (r2 != r5) goto L_0x00d1
            java.lang.Object r2 = r3.get(r4)
            r3.add(r2)
            goto L_0x00d1
        L_0x017f:
            X.815 r12 = X.C200299h7.A01(r1, r0, r5)
            goto L_0x00d1
        L_0x0185:
            X.817 r13 = A00(r8)
            if (r14 != 0) goto L_0x018d
            java.lang.Integer r14 = X.C023109s.A00
        L_0x018d:
            if (r15 != 0) goto L_0x0191
            java.lang.Integer r15 = X.C023109s.A00
        L_0x0191:
            X.9yN r9 = new X.9yN
            r17 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0040
        L_0x019a:
            java.lang.String r2 = "sr"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass98R.A00
            r6 = 3
            r4 = 0
            boolean r21 = X.AnonymousClass000.A1S(r7, r6)
            r19 = 0
            r11 = r9
            r17 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r20 = 0
        L_0x01b7:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x0226
            X.9bo r2 = X.AnonymousClass98R.A00
            int r2 = r0.A0F(r2)
            switch(r2) {
                case 0: goto L_0x01cd;
                case 1: goto L_0x01d2;
                case 2: goto L_0x01f3;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01fd;
                case 5: goto L_0x021a;
                case 6: goto L_0x0202;
                case 7: goto L_0x0220;
                case 8: goto L_0x0207;
                case 9: goto L_0x020c;
                case 10: goto L_0x0211;
                default: goto L_0x01c6;
            }
        L_0x01c6:
            r0.A0P()
            r0.A0Q()
            goto L_0x01b7
        L_0x01cd:
            java.lang.String r19 = r0.A0J()
            goto L_0x01b7
        L_0x01d2:
            int r8 = r0.A0E()
            r2 = 2
            java.lang.Integer[] r5 = X.C023109s.A00(r2)
            int r7 = r5.length
            r3 = 0
        L_0x01dd:
            if (r3 >= r7) goto L_0x01f1
            r9 = r5[r3]
            int r2 = r9.intValue()
            int r2 = 1 - r2
            if (r2 == 0) goto L_0x01ef
            r2 = 1
        L_0x01ea:
            if (r2 == r8) goto L_0x01b7
            int r3 = r3 + 1
            goto L_0x01dd
        L_0x01ef:
            r2 = 2
            goto L_0x01ea
        L_0x01f1:
            r9 = 0
            goto L_0x01b7
        L_0x01f3:
            X.815 r11 = X.C200299h7.A01(r1, r0, r4)
            goto L_0x01b7
        L_0x01f8:
            X.B25 r17 = X.C200549ha.A01(r1, r0)
            goto L_0x01b7
        L_0x01fd:
            X.815 r12 = X.C200299h7.A01(r1, r0, r4)
            goto L_0x01b7
        L_0x0202:
            X.815 r16 = X.C200299h7.A01(r1, r0, r4)
            goto L_0x01b7
        L_0x0207:
            X.815 r15 = X.C200299h7.A01(r1, r0, r4)
            goto L_0x01b7
        L_0x020c:
            boolean r20 = r0.A0T()
            goto L_0x01b7
        L_0x0211:
            int r2 = r0.A0E()
            boolean r21 = X.AnonymousClass000.A1S(r2, r6)
            goto L_0x01b7
        L_0x021a:
            r2 = 1
            X.815 r14 = X.C200299h7.A01(r1, r0, r2)
            goto L_0x01b7
        L_0x0220:
            r2 = 1
            X.815 r13 = X.C200299h7.A01(r1, r0, r2)
            goto L_0x01b7
        L_0x0226:
            X.9yO r10 = new X.9yO
            r18 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x05d3
        L_0x022f:
            java.lang.String r2 = "sh"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass98X.A00
            r7 = 0
            r6 = 0
            r5 = 0
        L_0x023c:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x0277
            X.9bo r2 = X.AnonymousClass98X.A00
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x0272
            r2 = 1
            if (r3 == r2) goto L_0x026d
            r2 = 2
            if (r3 == r2) goto L_0x025c
            r2 = 3
            if (r3 == r2) goto L_0x0257
            r0.A0Q()
            goto L_0x023c
        L_0x0257:
            boolean r5 = r0.A0T()
            goto L_0x023c
        L_0x025c:
            float r4 = X.C203079nF.A00()
            X.9yf r3 = X.C208679yf.A00
            r2 = 0
            java.util.ArrayList r2 = X.C200569hc.A00(r1, r3, r0, r4, r2)
            X.81A r9 = new X.81A
            r9.<init>(r2)
            goto L_0x023c
        L_0x026d:
            int r7 = r0.A0E()
            goto L_0x023c
        L_0x0272:
            java.lang.String r6 = r0.A0J()
            goto L_0x023c
        L_0x0277:
            X.9yS r1 = new X.9yS
            r1.<init>(r9, r6, r7, r5)
            r9 = r1
            goto L_0x0040
        L_0x027f:
            java.lang.String r2 = "rp"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass98T.A00
            r4 = 0
            r12 = 0
            r10 = r9
            r11 = r9
            r13 = 0
        L_0x028e:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x02c5
            X.9bo r2 = X.AnonymousClass98T.A00
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x02c0
            r2 = 1
            if (r3 == r2) goto L_0x02bb
            r2 = 2
            if (r3 == r2) goto L_0x02b6
            r2 = 3
            if (r3 == r2) goto L_0x02b1
            r2 = 4
            if (r3 == r2) goto L_0x02ac
            r0.A0Q()
            goto L_0x028e
        L_0x02ac:
            boolean r13 = r0.A0T()
            goto L_0x028e
        L_0x02b1:
            X.9yW r11 = X.C196919ak.A00(r1, r0)
            goto L_0x028e
        L_0x02b6:
            X.815 r10 = X.C200299h7.A01(r1, r0, r4)
            goto L_0x028e
        L_0x02bb:
            X.815 r9 = X.C200299h7.A01(r1, r0, r4)
            goto L_0x028e
        L_0x02c0:
            java.lang.String r12 = r0.A0J()
            goto L_0x028e
        L_0x02c5:
            X.9yL r5 = new X.9yL
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x068f
        L_0x02cd:
            java.lang.String r2 = "rd"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass98U.A00
            r5 = 0
            r4 = 0
        L_0x02d9:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x02ff
            X.9bo r2 = X.AnonymousClass98U.A00
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x02fb
            r2 = 1
            if (r3 == r2) goto L_0x02f6
            r2 = 2
            if (r3 == r2) goto L_0x02f1
            r0.A0Q()
            goto L_0x02d9
        L_0x02f1:
            boolean r4 = r0.A0T()
            goto L_0x02d9
        L_0x02f6:
            X.815 r9 = X.C200299h7.A01(r1, r0, r2)
            goto L_0x02d9
        L_0x02fb:
            r0.A0J()
            goto L_0x02d9
        L_0x02ff:
            if (r4 != 0) goto L_0x0634
            X.9yJ r5 = new X.9yJ
            r5.<init>(r9)
            goto L_0x0634
        L_0x0308:
            java.lang.String r2 = "rc"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass98S.A00
            r11 = 0
            r10 = r9
            r8 = r9
            r12 = 0
        L_0x0316:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x034e
            X.9bo r2 = X.AnonymousClass98S.A00
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x0349
            r2 = 1
            if (r3 == r2) goto L_0x0344
            r2 = 2
            if (r3 == r2) goto L_0x033f
            r2 = 3
            if (r3 == r2) goto L_0x0339
            r2 = 4
            if (r3 == r2) goto L_0x0334
            r0.A0Q()
            goto L_0x0316
        L_0x0334:
            boolean r12 = r0.A0T()
            goto L_0x0316
        L_0x0339:
            r2 = 1
            X.815 r8 = X.C200299h7.A01(r1, r0, r2)
            goto L_0x0316
        L_0x033f:
            X.818 r10 = A01(r1, r0)
            goto L_0x0316
        L_0x0344:
            X.B25 r9 = X.C200549ha.A01(r1, r0)
            goto L_0x0316
        L_0x0349:
            java.lang.String r11 = r0.A0J()
            goto L_0x0316
        L_0x034e:
            X.9yT r5 = new X.9yT
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x068f
        L_0x0356:
            java.lang.String r2 = "mm"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass98Q.A00
            r4 = 0
        L_0x0361:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x03a6
            X.9bo r2 = X.AnonymousClass98Q.A00
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x03a2
            r2 = 1
            if (r3 == r2) goto L_0x0381
            r2 = 2
            if (r3 == r2) goto L_0x037c
            r0.A0P()
            r0.A0Q()
            goto L_0x0361
        L_0x037c:
            boolean r4 = r0.A0T()
            goto L_0x0361
        L_0x0381:
            int r3 = r0.A0E()
            if (r3 == r2) goto L_0x039f
            r2 = 2
            if (r3 == r2) goto L_0x039c
            r2 = 3
            if (r3 == r2) goto L_0x0399
            r2 = 4
            if (r3 == r2) goto L_0x0396
            r2 = 5
            if (r3 != r2) goto L_0x039f
            java.lang.Integer r9 = X.C023109s.A0R
            goto L_0x0361
        L_0x0396:
            java.lang.Integer r9 = X.C023109s.A0G
            goto L_0x0361
        L_0x0399:
            java.lang.Integer r9 = X.C023109s.A0C
            goto L_0x0361
        L_0x039c:
            java.lang.Integer r9 = X.C023109s.A01
            goto L_0x0361
        L_0x039f:
            java.lang.Integer r9 = X.C023109s.A00
            goto L_0x0361
        L_0x03a2:
            r0.A0J()
            goto L_0x0361
        L_0x03a6:
            X.9yQ r2 = new X.9yQ
            r2.<init>(r9, r4)
            r9 = r2
            java.lang.String r2 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            X.AnonymousClass9Y2.A00(r1, r2)
            goto L_0x0040
        L_0x03b3:
            java.lang.String r2 = "gs"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.C190859Ao.A00
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            r19 = 0
            r16 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r10 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r11 = 0
            r22 = 0
            r7 = 0
        L_0x03d3:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x04d8
            X.9bo r2 = X.C190859Ao.A02
            int r2 = r0.A0F(r2)
            switch(r2) {
                case 0: goto L_0x03e9;
                case 1: goto L_0x03ee;
                case 2: goto L_0x0425;
                case 3: goto L_0x042a;
                case 4: goto L_0x0437;
                case 5: goto L_0x043c;
                case 6: goto L_0x04d1;
                case 7: goto L_0x0441;
                case 8: goto L_0x044f;
                case 9: goto L_0x045e;
                case 10: goto L_0x0464;
                case 11: goto L_0x046a;
                default: goto L_0x03e2;
            }
        L_0x03e2:
            r0.A0P()
            r0.A0Q()
            goto L_0x03d3
        L_0x03e9:
            java.lang.String r19 = r0.A0J()
            goto L_0x03d3
        L_0x03ee:
            r4 = -1
            r0.A0M()
        L_0x03f2:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x0421
            X.9bo r2 = X.C190859Ao.A01
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x041c
            r2 = 1
            if (r3 == r2) goto L_0x040a
            r0.A0P()
            r0.A0Q()
            goto L_0x03f2
        L_0x040a:
            X.9yX r5 = new X.9yX
            r5.<init>(r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            java.util.ArrayList r2 = X.C200569hc.A00(r1, r5, r0, r3, r2)
            X.816 r12 = new X.816
            r12.<init>(r2)
            goto L_0x03f2
        L_0x041c:
            int r4 = r0.A0E()
            goto L_0x03f2
        L_0x0421:
            r0.A0O()
            goto L_0x03d3
        L_0x0425:
            X.817 r7 = X.C200299h7.A02(r1, r0)
            goto L_0x03d3
        L_0x042a:
            r3 = 1
            int r2 = r0.A0E()
            if (r2 != r3) goto L_0x0434
            java.lang.Integer r16 = X.C023109s.A00
            goto L_0x03d3
        L_0x0434:
            java.lang.Integer r16 = X.C023109s.A01
            goto L_0x03d3
        L_0x0437:
            X.818 r14 = A01(r1, r0)
            goto L_0x03d3
        L_0x043c:
            X.818 r15 = A01(r1, r0)
            goto L_0x03d3
        L_0x0441:
            r4 = 1
            r2 = 3
            java.lang.Integer[] r3 = X.C023109s.A00(r2)
            int r2 = r0.A0E()
            int r2 = r2 - r4
            r17 = r3[r2]
            goto L_0x03d3
        L_0x044f:
            r2 = 3
            java.lang.Integer[] r4 = X.C023109s.A00(r2)
            int r3 = r0.A0E()
            r2 = 1
            int r3 = r3 - r2
            r18 = r4[r3]
            goto L_0x03d3
        L_0x045e:
            float r21 = X.C21655ATw.A08(r0)
            goto L_0x03d3
        L_0x0464:
            boolean r22 = r0.A0T()
            goto L_0x03d3
        L_0x046a:
            r0.A0L()
        L_0x046d:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x04be
            r0.A0M()
            r4 = 0
            r5 = 0
        L_0x0478:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x049a
            X.9bo r2 = X.C190859Ao.A00
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x0495
            r2 = 1
            if (r3 == r2) goto L_0x0490
            r0.A0P()
            r0.A0Q()
            goto L_0x0478
        L_0x0490:
            X.815 r5 = X.C200299h7.A01(r1, r0, r2)
            goto L_0x0478
        L_0x0495:
            java.lang.String r4 = r0.A0J()
            goto L_0x0478
        L_0x049a:
            r0.A0O()
            java.lang.String r2 = "o"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x04a7
            r11 = r5
            goto L_0x046d
        L_0x04a7:
            java.lang.String r2 = "d"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x04b7
            java.lang.String r2 = "g"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x046d
        L_0x04b7:
            r2 = 1
            r1.A0C = r2
            r6.add(r5)
            goto L_0x046d
        L_0x04be:
            r3 = 1
            r0.A0N()
            int r2 = r6.size()
            if (r2 != r3) goto L_0x03d3
            java.lang.Object r2 = X.C36441kJ.A12(r6)
            r6.add(r2)
            goto L_0x03d3
        L_0x04d1:
            r2 = 1
            X.815 r10 = X.C200299h7.A01(r1, r0, r2)
            goto L_0x03d3
        L_0x04d8:
            X.817 r13 = A00(r7)
            X.9yP r9 = new X.9yP
            r20 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0040
        L_0x04e5:
            java.lang.String r2 = "gr"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass98W.A00
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            r5 = 0
            r4 = 0
        L_0x04f5:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x052e
            X.9bo r2 = X.AnonymousClass98W.A00
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x0529
            r2 = 1
            if (r3 == r2) goto L_0x0524
            r2 = 2
            if (r3 == r2) goto L_0x050d
            r0.A0Q()
            goto L_0x04f5
        L_0x050d:
            r0.A0L()
        L_0x0510:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x0520
            X.Ax4 r2 = A02(r1, r0)
            if (r2 == 0) goto L_0x0510
            r6.add(r2)
            goto L_0x0510
        L_0x0520:
            r0.A0N()
            goto L_0x04f5
        L_0x0524:
            boolean r4 = r0.A0T()
            goto L_0x04f5
        L_0x0529:
            java.lang.String r5 = r0.A0J()
            goto L_0x04f5
        L_0x052e:
            X.9yR r9 = new X.9yR
            r9.<init>(r5, r6, r4)
            goto L_0x0040
        L_0x0535:
            java.lang.String r2 = "gf"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass9AF.A00
            android.graphics.Path$FillType r11 = android.graphics.Path.FillType.WINDING
            r7 = 0
            r16 = r9
            r3 = r9
            r14 = r9
            r15 = r9
            r18 = 0
        L_0x0549:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x05c7
            X.9bo r2 = X.AnonymousClass9AF.A01
            int r2 = r0.A0F(r2)
            r5 = 1
            switch(r2) {
                case 0: goto L_0x0560;
                case 1: goto L_0x0565;
                case 2: goto L_0x059b;
                case 3: goto L_0x05a0;
                case 4: goto L_0x05ac;
                case 5: goto L_0x05b1;
                case 6: goto L_0x05b6;
                case 7: goto L_0x05c2;
                default: goto L_0x0559;
            }
        L_0x0559:
            r0.A0P()
            r0.A0Q()
            goto L_0x0549
        L_0x0560:
            java.lang.String r9 = r0.A0J()
            goto L_0x0549
        L_0x0565:
            r6 = -1
            r0.A0M()
        L_0x0569:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x0597
            X.9bo r2 = X.AnonymousClass9AF.A00
            int r2 = r0.A0F(r2)
            if (r2 == 0) goto L_0x0592
            if (r2 == r5) goto L_0x0580
            r0.A0P()
            r0.A0Q()
            goto L_0x0569
        L_0x0580:
            X.9yX r4 = new X.9yX
            r4.<init>(r6)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            java.util.ArrayList r2 = X.C200569hc.A00(r1, r4, r0, r3, r2)
            X.816 r3 = new X.816
            r3.<init>(r2)
            goto L_0x0569
        L_0x0592:
            int r6 = r0.A0E()
            goto L_0x0569
        L_0x0597:
            r0.A0O()
            goto L_0x0549
        L_0x059b:
            X.817 r7 = X.C200299h7.A02(r1, r0)
            goto L_0x0549
        L_0x05a0:
            int r2 = r0.A0E()
            if (r2 != r5) goto L_0x05a9
            java.lang.Integer r16 = X.C023109s.A00
            goto L_0x0549
        L_0x05a9:
            java.lang.Integer r16 = X.C023109s.A01
            goto L_0x0549
        L_0x05ac:
            X.818 r14 = A01(r1, r0)
            goto L_0x0549
        L_0x05b1:
            X.818 r15 = A01(r1, r0)
            goto L_0x0549
        L_0x05b6:
            int r2 = r0.A0E()
            if (r2 != r5) goto L_0x05bf
            android.graphics.Path$FillType r11 = android.graphics.Path.FillType.WINDING
            goto L_0x0549
        L_0x05bf:
            android.graphics.Path$FillType r11 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x0549
        L_0x05c2:
            boolean r18 = r0.A0T()
            goto L_0x0549
        L_0x05c7:
            X.817 r13 = A00(r7)
            X.9yM r10 = new X.9yM
            r12 = r3
            r17 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x05d3:
            r9 = r10
            goto L_0x0040
        L_0x05d6:
            java.lang.String r2 = "fl"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass98V.A00
            r5 = 1
            r6 = 0
            r7 = r9
            r4 = 1
            r10 = 0
            r11 = 0
        L_0x05e6:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x0627
            X.9bo r2 = X.AnonymousClass98V.A00
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x0622
            if (r3 == r5) goto L_0x061d
            r2 = 2
            if (r3 == r2) goto L_0x0618
            r2 = 3
            if (r3 == r2) goto L_0x0613
            r2 = 4
            if (r3 == r2) goto L_0x060e
            r2 = 5
            if (r3 == r2) goto L_0x0609
            r0.A0P()
            r0.A0Q()
            goto L_0x05e6
        L_0x0609:
            boolean r11 = r0.A0T()
            goto L_0x05e6
        L_0x060e:
            int r4 = r0.A0E()
            goto L_0x05e6
        L_0x0613:
            boolean r10 = r0.A0T()
            goto L_0x05e6
        L_0x0618:
            X.817 r6 = X.C200299h7.A02(r1, r0)
            goto L_0x05e6
        L_0x061d:
            X.814 r7 = X.C200299h7.A00(r1, r0)
            goto L_0x05e6
        L_0x0622:
            java.lang.String r9 = r0.A0J()
            goto L_0x05e6
        L_0x0627:
            X.817 r8 = A00(r6)
            if (r4 != r5) goto L_0x0637
            android.graphics.Path$FillType r6 = android.graphics.Path.FillType.WINDING
        L_0x062f:
            X.9yV r5 = new X.9yV
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x0634:
            r9 = r5
            goto L_0x0040
        L_0x0637:
            android.graphics.Path$FillType r6 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x062f
        L_0x063a:
            java.lang.String r2 = "el"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.9bo r2 = X.AnonymousClass98O.A00
            r5 = 1
            r4 = 3
            boolean r11 = X.AnonymousClass000.A1S(r7, r4)
            r10 = 0
            r8 = r9
            r12 = 0
        L_0x064d:
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x0689
            X.9bo r2 = X.AnonymousClass98O.A00
            int r3 = r0.A0F(r2)
            if (r3 == 0) goto L_0x0684
            if (r3 == r5) goto L_0x067f
            r2 = 2
            if (r3 == r2) goto L_0x067a
            if (r3 == r4) goto L_0x0675
            r2 = 4
            if (r3 == r2) goto L_0x066c
            r0.A0P()
            r0.A0Q()
            goto L_0x064d
        L_0x066c:
            int r2 = r0.A0E()
            boolean r11 = X.AnonymousClass000.A1S(r2, r4)
            goto L_0x064d
        L_0x0675:
            boolean r12 = r0.A0T()
            goto L_0x064d
        L_0x067a:
            X.818 r8 = A01(r1, r0)
            goto L_0x064d
        L_0x067f:
            X.B25 r9 = X.C200549ha.A01(r1, r0)
            goto L_0x064d
        L_0x0684:
            java.lang.String r10 = r0.A0J()
            goto L_0x064d
        L_0x0689:
            X.9yK r5 = new X.9yK
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x068f:
            r9 = r5
            goto L_0x0040
        L_0x0692:
            r0.A0O()
            return r9
        L_0x0696:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown trim path type "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r3)
            throw r0
        L_0x06a1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200559hb.A02(X.9Y2, X.ATw):X.Ax4");
    }

    public static AnonymousClass818 A01(AnonymousClass9Y2 r3, C21655ATw aTw) {
        return new AnonymousClass818(C200569hc.A00(r3, C208649yc.A00, aTw, C203079nF.A00(), true));
    }
}
