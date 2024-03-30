package X;

/* renamed from: X.ABc  reason: case insensitive filesystem */
public abstract class C21168ABc implements C22938Ayo, C22942Ays, C17740rx {
    public final C203099nI A00;

    public static void A01(AnonymousClass8NL r0, AnonymousClass8N6 r1, AnonymousClass8N7 r2, AnonymousClass8SO r3, int i) {
        r3.titleCase_ = i;
        r1.A0V(r2);
        r1.A0U(r2);
        r0.A0g(r1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.2bj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.2bj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.8o0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: X.8o0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: X.2bj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: X.2bj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: X.2bj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: X.2bj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: X.2cW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: X.2bn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: X.2cA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: X.8o0} */
    /* JADX WARNING: type inference failed for: r13v2, types: [X.2bu, X.2bU, X.8me, X.3T1] */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c8, code lost:
        if (r4 == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01cc, code lost:
        r4 = r13.A01;
        X.C18740tg.A06(r4);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d5, code lost:
        if ((r12.bitField0_ & 32) == 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d7, code lost:
        r4.A05 = X.C203359nq.A05(r12);
        r13 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3T1 BlH(X.AnonymousClass9YL r18) {
        /*
            r17 = this;
            r0 = r18
            X.8SX r2 = X.AnonymousClass9YL.A00(r0)
            boolean r1 = r2.A10()
            if (r1 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            X.8SL r2 = r2.templateMessage_
            if (r2 != 0) goto L_0x0014
            X.8SL r2 = X.AnonymousClass8SL.DEFAULT_INSTANCE
        L_0x0014:
            X.AnonymousClass00C.A0B(r2)
            r1 = r17
            boolean r3 = r1 instanceof X.C183328qc
            if (r3 == 0) goto L_0x007e
            r7 = r1
            X.8qc r7 = (X.C183328qc) r7
            boolean r3 = X.C203099nI.A04(r2)
            if (r3 == 0) goto L_0x023a
            X.8SE r6 = X.C203099nI.A01(r2)
            boolean r3 = r6.gifPlayback_
            if (r3 != 0) goto L_0x023a
            X.3Qa r5 = r0.A0C
            long r3 = r0.A04
            X.8o0 r13 = new X.8o0
            r13.<init>(r5, r3)
            X.9Xl r3 = r7.A00
            X.C196049Xl.A00(r0, r6, r13, r3)
        L_0x003c:
            boolean r3 = r13 instanceof X.C88854Uh
            if (r3 == 0) goto L_0x0079
            X.9nI r4 = r1.A00
            r3 = r13
            X.4Uh r3 = (X.C88854Uh) r3
            X.8SO r2 = X.C170918Hz.A0N(r2)
            java.lang.String r6 = r2.hydratedContentText_
            int r1 = r2.bitField0_
            r1 = r1 & 64
            if (r1 == 0) goto L_0x007c
            java.lang.String r7 = r2.hydratedFooterText_
        L_0x0053:
            java.lang.String r8 = r2.templateId_
            X.0yC r1 = r4.A00
            java.util.ArrayList r11 = X.C203099nI.A02(r1, r2)
            int r1 = r2.bitField0_
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x007a
            boolean r1 = r2.maskLinkedDevices_
        L_0x0063:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Long r5 = r0.A0D
            java.lang.String r9 = r0.A0H
            java.lang.String r10 = r0.A0I
            boolean r12 = r1.booleanValue()
            X.3F4 r4 = new X.3F4
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r3.BsS(r4)
        L_0x0079:
            return r13
        L_0x007a:
            r1 = 0
            goto L_0x0063
        L_0x007c:
            r7 = 0
            goto L_0x0053
        L_0x007e:
            boolean r3 = r1 instanceof X.C183318qb
            if (r3 == 0) goto L_0x00d0
            int r4 = r2.formatCase_
            r3 = 1
            if (r4 != r3) goto L_0x00c5
            X.8SM r3 = r2.A0u()
            int r3 = r3.titleCase_
            java.lang.Integer r4 = X.C170918Hz.A0R(r3)
        L_0x0091:
            java.lang.Integer r3 = X.C023109s.A0R
            if (r4 != r3) goto L_0x023a
            X.3Qa r5 = r0.A0C
            long r3 = r0.A04
            X.2cA r13 = new X.2cA
            r13.<init>(r5, r3)
            int r4 = r2.formatCase_
            r3 = 1
            if (r4 != r3) goto L_0x00b6
            X.8SM r5 = r2.A0u()
            int r4 = r5.titleCase_
            r3 = 5
            if (r4 != r3) goto L_0x00c2
            java.lang.Object r4 = r5.title_
        L_0x00ae:
            X.8Ry r4 = (X.C173508Ry) r4
        L_0x00b0:
            boolean r3 = r0.A0O
            X.C198499df.A00(r4, r13, r3)
            goto L_0x003c
        L_0x00b6:
            X.8SO r5 = X.C170918Hz.A0N(r2)
            int r4 = r5.titleCase_
            r3 = 5
            if (r4 != r3) goto L_0x00c2
            java.lang.Object r4 = r5.title_
            goto L_0x00ae
        L_0x00c2:
            X.8Ry r4 = X.C173508Ry.DEFAULT_INSTANCE
            goto L_0x00b0
        L_0x00c5:
            X.8SO r3 = X.C170918Hz.A0N(r2)
            int r3 = r3.titleCase_
            java.lang.Integer r4 = X.C170918Hz.A0R(r3)
            goto L_0x0091
        L_0x00d0:
            boolean r3 = r1 instanceof X.C183308qa
            if (r3 == 0) goto L_0x0130
            r6 = r1
            X.8qa r6 = (X.C183308qa) r6
            int r4 = r2.formatCase_
            r3 = 1
            if (r4 != r3) goto L_0x0125
            X.8SM r3 = r2.A0u()
            int r3 = r3.titleCase_
            java.lang.Integer r4 = X.C170918Hz.A0R(r3)
        L_0x00e6:
            java.lang.Integer r3 = X.C023109s.A0C
            if (r4 != r3) goto L_0x023a
            X.3Qa r5 = r0.A0C
            long r3 = r0.A04
            X.2bn r13 = new X.2bn
            r13.<init>(r5, r3)
            X.9Vt r11 = r6.A00
            int r4 = r2.formatCase_
            r3 = 1
            if (r4 != r3) goto L_0x0116
            X.8SM r5 = r2.A0u()
            int r4 = r5.titleCase_
            r3 = 3
            if (r4 != r3) goto L_0x0122
            java.lang.Object r12 = r5.title_
        L_0x0105:
            X.8SF r12 = (X.AnonymousClass8SF) r12
        L_0x0107:
            boolean r15 = r0.A03()
            boolean r3 = r0.A0O
            int r14 = r13.A01
            r16 = r3
            r11.A02(r12, r13, r14, r15, r16)
            goto L_0x003c
        L_0x0116:
            X.8SO r5 = X.C170918Hz.A0N(r2)
            int r4 = r5.titleCase_
            r3 = 3
            if (r4 != r3) goto L_0x0122
            java.lang.Object r12 = r5.title_
            goto L_0x0105
        L_0x0122:
            X.8SF r12 = X.AnonymousClass8SF.DEFAULT_INSTANCE
            goto L_0x0107
        L_0x0125:
            X.8SO r3 = X.C170918Hz.A0N(r2)
            int r3 = r3.titleCase_
            java.lang.Integer r4 = X.C170918Hz.A0R(r3)
            goto L_0x00e6
        L_0x0130:
            boolean r3 = r1 instanceof X.C183278qX
            if (r3 == 0) goto L_0x0194
            int r7 = r2.formatCase_
            boolean r3 = X.AnonymousClass000.A1O(r7)
            r6 = 1
            if (r3 == 0) goto L_0x016e
            X.8SM r3 = r2.A0u()
            int r3 = r3.titleCase_
            java.lang.Integer r4 = X.C170918Hz.A0R(r3)
        L_0x0147:
            java.lang.Integer r3 = X.C023109s.A01
            if (r4 == r3) goto L_0x014c
            r6 = 0
        L_0x014c:
            r5 = 0
            if (r6 != 0) goto L_0x0179
            r3 = 1
            if (r7 != r3) goto L_0x0163
            X.8SM r3 = r2.A0u()
            int r3 = r3.titleCase_
            java.lang.Integer r4 = X.C170918Hz.A0R(r3)
        L_0x015c:
            java.lang.Integer r3 = X.C023109s.A0S
            if (r4 == r3) goto L_0x0179
            r13 = r5
            goto L_0x003c
        L_0x0163:
            X.8SO r3 = X.C170918Hz.A0N(r2)
            int r3 = r3.titleCase_
            java.lang.Integer r4 = X.C170918Hz.A0R(r3)
            goto L_0x015c
        L_0x016e:
            X.8SO r3 = X.C170918Hz.A0N(r2)
            int r3 = r3.titleCase_
            java.lang.Integer r4 = X.C170918Hz.A0R(r3)
            goto L_0x0147
        L_0x0179:
            X.3Qa r6 = r0.A0C
            long r3 = r0.A04
            X.2cW r13 = new X.2cW
            r13.<init>(r6, r3)
            X.8SO r6 = X.C170918Hz.A0N(r2)
            int r4 = r6.titleCase_
            r3 = 2
            if (r4 != r3) goto L_0x018f
            java.lang.Object r5 = r6.title_
            java.lang.String r5 = (java.lang.String) r5
        L_0x018f:
            r13.A16(r5)
            goto L_0x003c
        L_0x0194:
            boolean r3 = r1 instanceof X.C183298qZ
            if (r3 == 0) goto L_0x01df
            r6 = r1
            X.8qZ r6 = (X.C183298qZ) r6
            boolean r3 = X.C203099nI.A04(r2)
            if (r3 == 0) goto L_0x023a
            X.8SE r12 = X.C203099nI.A01(r2)
            boolean r3 = r12.gifPlayback_
            if (r3 == 0) goto L_0x023a
            X.3Qa r5 = r0.A0C
            long r3 = r0.A04
            X.8me r13 = new X.8me
            r13.<init>(r5, r3)
            X.9Xl r11 = r6.A00
            boolean r15 = r0.A03()
            boolean r3 = r0.A0O
            int r14 = r13.A01
            r16 = r3
            r11.A04(r12, r13, r14, r15, r16)
            int r5 = r13.A01
            boolean r4 = r0.A0N
            r3 = 1
            if (r5 != r3) goto L_0x01cc
            if (r4 != 0) goto L_0x01cc
            goto L_0x003c
        L_0x01cc:
            X.3Qj r4 = r13.A01
            X.C18740tg.A06(r4)
            int r3 = r12.bitField0_
            r3 = r3 & 32
            if (r3 == 0) goto L_0x003c
            int r3 = X.C203359nq.A05(r12)
            r4.A05 = r3
            goto L_0x003c
        L_0x01df:
            r6 = r1
            X.8qY r6 = (X.C183288qY) r6
            int r4 = r2.formatCase_
            r3 = 1
            if (r4 != r3) goto L_0x022f
            X.8SM r3 = r2.A0u()
            int r3 = r3.titleCase_
            java.lang.Integer r4 = X.C170918Hz.A0R(r3)
        L_0x01f1:
            java.lang.Integer r3 = X.C023109s.A00
            if (r4 != r3) goto L_0x023a
            X.3Qa r5 = r0.A0C
            long r3 = r0.A04
            X.2bj r13 = new X.2bj
            r13.<init>(r5, r3)
            X.9Tv r11 = r6.A00
            int r3 = r2.formatCase_
            r5 = 1
            if (r3 != r5) goto L_0x0220
            X.8SM r4 = r2.A0u()
            int r3 = r4.titleCase_
            if (r3 != r5) goto L_0x022c
            java.lang.Object r12 = r4.title_
        L_0x020f:
            X.8SC r12 = (X.AnonymousClass8SC) r12
        L_0x0211:
            boolean r15 = r0.A03()
            boolean r3 = r0.A0O
            int r14 = r0.A01
            r16 = r3
            r11.A01(r12, r13, r14, r15, r16)
            goto L_0x003c
        L_0x0220:
            X.8SO r5 = X.C170918Hz.A0N(r2)
            int r4 = r5.titleCase_
            r3 = 1
            if (r4 != r3) goto L_0x022c
            java.lang.Object r12 = r5.title_
            goto L_0x020f
        L_0x022c:
            X.8SC r12 = X.AnonymousClass8SC.DEFAULT_INSTANCE
            goto L_0x0211
        L_0x022f:
            X.8SO r3 = X.C170918Hz.A0N(r2)
            int r3 = r3.titleCase_
            java.lang.Integer r4 = X.C170918Hz.A0R(r3)
            goto L_0x01f1
        L_0x023a:
            r13 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21168ABc.BlH(X.9YL):X.3T1");
    }

    public C21168ABc(C203099nI r1) {
        this.A00 = r1;
    }

    public static AnonymousClass8SO A00(AnonymousClass8NN r1, AnonymousClass8NN r2) {
        r1.A0S();
        AnonymousClass8SO r12 = (AnonymousClass8SO) r1.A00;
        C170918Hz A0R = r2.A0R();
        A0R.getClass();
        r12.title_ = A0R;
        return r12;
    }
}
