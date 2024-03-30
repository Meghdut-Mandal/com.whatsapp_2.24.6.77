package X;

import com.whatsapp.community.NewCommunityActivity;

/* renamed from: X.3wS  reason: invalid class name and case insensitive filesystem */
public class C81093wS implements Runnable {
    public Object A00;
    public final int A01;

    public C81093wS(NewCommunityActivity newCommunityActivity, int i) {
        this.A01 = i;
        if (19 - i != 0) {
            this.A00 = newCommunityActivity;
        } else {
            this.A00 = newCommunityActivity;
        }
    }

    public static void A00(AnonymousClass17Y r1, Object obj, int i) {
        r1.A0H(new C81093wS(obj, i));
    }

    public static void A01(C19770wU r1, Object obj, int i) {
        r1.Boy(new C81093wS(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.whatsapp.community.ManageGroupsInCommunityActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v117, resolved type: com.whatsapp.community.ManageGroupsInCommunityActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: com.whatsapp.community.NewCommunityActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v118, resolved type: com.whatsapp.community.ManageGroupsInCommunityActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0278, code lost:
        if (r6 != 9) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06a6, code lost:
        r1.A01(r2, "community-examples-article");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06c2, code lost:
        r1.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0733, code lost:
        r1.A0T(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0736, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        if (r1.BLh() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A01(r1);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cd, code lost:
        com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A07(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        X.C40021ub.A03((X.C40021ub) r1, true);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r6 = r19
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0807;
                case 1: goto L_0x07cf;
                case 2: goto L_0x0737;
                case 3: goto L_0x0396;
                case 4: goto L_0x038e;
                case 5: goto L_0x0386;
                case 6: goto L_0x0007;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x037e;
                case 10: goto L_0x072e;
                case 11: goto L_0x0721;
                case 12: goto L_0x0111;
                case 13: goto L_0x0717;
                case 14: goto L_0x06e2;
                case 15: goto L_0x06c6;
                case 16: goto L_0x06b8;
                case 17: goto L_0x06b8;
                case 18: goto L_0x06ac;
                case 19: goto L_0x06a0;
                case 20: goto L_0x00d1;
                case 21: goto L_0x0693;
                case 22: goto L_0x05ee;
                case 23: goto L_0x0569;
                case 24: goto L_0x0461;
                case 25: goto L_0x054f;
                case 26: goto L_0x0538;
                case 27: goto L_0x0521;
                case 28: goto L_0x050f;
                case 29: goto L_0x04ee;
                case 30: goto L_0x04d6;
                case 31: goto L_0x04d6;
                case 32: goto L_0x04ce;
                case 33: goto L_0x04c1;
                case 34: goto L_0x047e;
                case 35: goto L_0x0095;
                case 36: goto L_0x043e;
                case 37: goto L_0x0084;
                case 38: goto L_0x0430;
                case 39: goto L_0x0426;
                case 40: goto L_0x0051;
                case 41: goto L_0x041a;
                case 42: goto L_0x0040;
                case 43: goto L_0x0038;
                case 44: goto L_0x0026;
                case 45: goto L_0x0014;
                case 46: goto L_0x03d7;
                case 47: goto L_0x03cb;
                case 48: goto L_0x03af;
                case 49: goto L_0x039a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r6.A00
            X.4a5 r0 = (X.C90394a5) r0
            java.lang.Object r1 = r0.A00
        L_0x000d:
            X.1ub r1 = (X.C40021ub) r1
            r0 = 1
            X.C40021ub.A03(r1, r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r0 = r6.A00
            X.3N1 r0 = (X.AnonymousClass3N1) r0
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = r0.A00
            boolean r0 = r1.BLh()
            if (r0 != 0) goto L_0x0013
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A01(r1)
            r0 = 2
            goto L_0x00cd
        L_0x0026:
            java.lang.Object r0 = r6.A00
            X.3N1 r0 = (X.AnonymousClass3N1) r0
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = r0.A00
            boolean r0 = r1.BLh()
            if (r0 != 0) goto L_0x0013
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A01(r1)
            r0 = 1
            goto L_0x00cd
        L_0x0038:
            java.lang.Object r0 = r6.A00
            X.3N1 r0 = (X.AnonymousClass3N1) r0
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = r0.A00
            goto L_0x00c3
        L_0x0040:
            java.lang.Object r0 = r6.A00
            X.3N1 r0 = (X.AnonymousClass3N1) r0
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = r0.A00
            boolean r0 = r1.BLh()
            if (r0 != 0) goto L_0x0013
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A01(r1)
            r0 = 3
            goto L_0x00cd
        L_0x0051:
            java.lang.Object r4 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r4 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r4
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0013
            androidx.recyclerview.widget.RecyclerView r0 = r4.A01
            X.0CP r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.A1U()
            int r0 = r0.A1S()
            int r1 = r1 - r0
            r3 = 1
            int r2 = r1 + 1
            X.1wd r0 = r4.A06
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            r1 = 0
            if (r2 == r0) goto L_0x007b
            r3 = 0
        L_0x007b:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A01
            if (r3 == 0) goto L_0x0080
            r1 = 2
        L_0x0080:
            r0.setOverScrollMode(r1)
            return
        L_0x0084:
            java.lang.Object r1 = r6.A00
            X.3pW r1 = (X.C76833pW) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0013
            X.3CL r2 = r1.A05
            X.39o r1 = r1.A00
            r0 = -2
            r2.A00(r1, r0)
            return
        L_0x0095:
            java.lang.Object r0 = r6.A00
            X.3eX r0 = (X.C70063eX) r0
            X.3Sv r0 = r0.A02
            X.C65623Sv.A00(r0)
            X.4Uk r6 = r0.A0D
            X.3M6 r6 = (X.AnonymousClass3M6) r6
            int r0 = r6.A01
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r5 = r6.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r5 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r5
            X.4Tr r4 = r5.A09
            r3 = 0
            r2 = 1
            r0 = -4
            r4.BOi(r2, r0, r3)
            com.whatsapp.qrcode.DevicePairQrScannerActivity.A01(r5)
            r6.A00()
            return
        L_0x00ba:
            java.lang.String r0 = "LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onSyncdDeleteAllError"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r1
        L_0x00c3:
            boolean r0 = r1.BLh()
            if (r0 != 0) goto L_0x0013
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A01(r1)
            r0 = 0
        L_0x00cd:
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A07(r1, r0)
            return
        L_0x00d1:
            double r8 = java.lang.Math.random()
            int[] r7 = com.whatsapp.community.NewCommunityActivity.A0R
            r3 = 1
            r0 = 22
            double r4 = (double) r0
            double r0 = r8 * r4
            long r1 = java.lang.Math.round(r0)
            int r0 = (int) r1
            int[] r2 = new int[r3]
            r1 = r7[r0]
            r0 = 0
            r2[r0] = r1
            X.2M9 r13 = new X.2M9
            r13.<init>(r2)
            long r14 = X.C1898996a.A00(r13, r0)
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.NewCommunityActivity r2 = (com.whatsapp.community.NewCommunityActivity) r2
            X.1H2 r10 = r2.A0C
            android.content.res.Resources r11 = r2.getResources()
            r12 = 0
            android.graphics.drawable.BitmapDrawable r5 = r10.A04(r11, r12, r13, r14)
            if (r5 == 0) goto L_0x0013
            X.5zr r4 = r2.A0C
            android.widget.ImageView r1 = r2.A00
            android.content.res.Resources r0 = r2.getResources()
            android.graphics.Bitmap r7 = r4.A00(r0, r5, r1)
            goto L_0x0811
        L_0x0111:
            java.lang.Object r0 = r6.A00
            X.1ue r0 = (X.C40041ue) r0
            X.1hi r1 = r0.A0d
            int r5 = X.C36341k9.A07(r1)
            X.00s r8 = r0.A0E
            java.lang.Number r9 = X.C36441kJ.A0z(r8)
            r3 = 1
            r1 = 5
            if (r5 != r1) goto L_0x0129
            r0.A0T(r3)
            return
        L_0x0129:
            r2 = 4
            if (r5 != r2) goto L_0x014e
            int r1 = r0.A02
            r4 = 2
            if (r1 != r4) goto L_0x014a
            X.1LX r1 = r0.A0c
            X.147 r3 = r0.A0a
            if (r3 != 0) goto L_0x0139
            X.147 r3 = r0.A07
        L_0x0139:
            java.lang.String r2 = "community_home"
            X.1LY r1 = r1.A00
            boolean r1 = r1.A01(r3, r2)
            X.1hi r0 = r0.A0e
            if (r1 != 0) goto L_0x0146
            r4 = 3
        L_0x0146:
            X.C36341k9.A17(r0, r4)
            return
        L_0x014a:
            X.1hi r0 = r0.A0e
            r4 = 4
            goto L_0x0146
        L_0x014e:
            r1 = 2
            if (r5 == r1) goto L_0x0154
            r4 = 6
            if (r5 != r4) goto L_0x0013
        L_0x0154:
            int r6 = r0.A01
            r5 = 426(0x1aa, float:5.97E-43)
            r4 = 7
            if (r6 != r5) goto L_0x0161
            X.1hi r0 = r0.A0d
            X.C36341k9.A17(r0, r4)
            return
        L_0x0161:
            r7 = 9
            if (r9 == 0) goto L_0x01e0
            int r5 = r9.intValue()
            if (r5 != r7) goto L_0x01e0
            X.0wo r4 = r0.A0Q
            long r4 = X.C19970wo.A00(r4)
            r0.A03 = r4
            X.34p r7 = r0.A0Z
            X.0wQ r4 = r0.A0H
            com.whatsapp.jid.PhoneUserJid r6 = X.C36441kJ.A0n(r4)
            X.147 r5 = r0.A07
            X.C36351kA.A1J(r6, r5, r3)
            X.3ty r4 = new X.3ty
            r4.<init>()
            X.19A r12 = r7.A00
            java.lang.String r15 = r12.A09()
            X.1AL[] r9 = new X.AnonymousClass1AL[r3]
            java.lang.String r8 = "jid"
            X.1AL r7 = new X.1AL
            r7.<init>((com.whatsapp.jid.Jid) r6, (java.lang.String) r8)
            r11 = 0
            r9[r11] = r7
            java.lang.String r7 = "participant"
            X.9nx r10 = new X.9nx
            r10.<init>(r7, r9)
            java.lang.String r9 = "cancel_membership_requests"
            r7 = 0
            X.9nx r8 = new X.9nx
            r8.<init>((X.C203399nx) r10, (java.lang.String) r9, (X.AnonymousClass1AL[]) r7)
            X.1AL[] r7 = new X.AnonymousClass1AL[r2]
            X.C36341k9.A1S(r7, r11)
            X.C36331k8.A1R(r15, r7, r3)
            java.lang.String r3 = "type"
            java.lang.String r2 = "set"
            X.C36341k9.A1L(r3, r2, r7, r1)
            java.lang.String r2 = "to"
            X.1AL r3 = new X.1AL
            r3.<init>((com.whatsapp.jid.Jid) r5, (java.lang.String) r2)
            r2 = 3
            r7[r2] = r3
            X.9nx r14 = X.C36391kE.A0m(r8, r7)
            r2 = 1
            X.3Tq r13 = new X.3Tq
            r13.<init>(r6, r5, r4, r2)
            r16 = 351(0x15f, float:4.92E-43)
            r17 = 2000(0x7d0, double:9.88E-321)
            r12.A0K(r13, r14, r15, r16, r17)
            r2 = 3
            X.C79593ty.A00(r4, r0, r2)
            X.411 r2 = new X.411
            r2.<init>(r0, r1)
            X.1Hk r1 = r4.A00
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x01e0:
            X.147 r6 = r0.A07
            if (r6 == 0) goto L_0x0235
            X.12q r5 = r0.A0T
            int r5 = r5.A05(r6)
            boolean r5 = X.C63833Lp.A00(r5)
            if (r5 == 0) goto L_0x0235
            java.lang.Number r5 = X.C36441kJ.A0z(r8)
            if (r5 == 0) goto L_0x0235
            int r5 = r5.intValue()
            if (r5 == r1) goto L_0x036d
            if (r5 == r2) goto L_0x036d
            if (r5 != r3) goto L_0x0235
            X.1Sk r10 = r0.A0L
            int r12 = r0.A0A
            X.17X r6 = r0.A0U
            X.147 r5 = r0.A07
            int r5 = X.C36401kF.A01(r6, r5)
            long r5 = (long) r5
            r13 = 12
        L_0x020f:
            X.2RK r11 = new X.2RK
            r11.<init>()
            X.1NX r9 = r10.A00
            X.00T r9 = r9.A00
            java.lang.String r9 = X.C36431kI.A1E(r9)
            r11.A05 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r11.A00 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r11.A01 = r9
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r11.A04 = r5
            X.0yW r5 = r10.A05
            r5.Bly(r11)
        L_0x0235:
            X.00s r6 = r0.A0F
            r5 = 0
            r6.A0C(r5)
            r5 = 8
            X.C36341k9.A17(r8, r5)
            X.0wo r5 = r0.A0Q
            long r5 = X.C19970wo.A00(r5)
            r0.A04 = r5
            int r9 = r0.A02
            if (r9 == r2) goto L_0x02e1
            r5 = 3
            if (r9 == r5) goto L_0x02e1
            r5 = 8
            if (r9 == r5) goto L_0x02e1
            r5 = 6
            if (r9 != r5) goto L_0x0296
            X.1hi r6 = r0.A0e
            r5 = 5
            X.C36341k9.A17(r6, r5)
        L_0x025c:
            boolean r5 = r0.A0h
            if (r5 == 0) goto L_0x0013
            X.2Nx r8 = new X.2Nx
            r8.<init>()
            int r6 = r0.A02
            if (r6 == 0) goto L_0x028a
            if (r6 == r3) goto L_0x0285
            if (r6 == r1) goto L_0x028f
            r5 = 3
            if (r6 == r5) goto L_0x0280
            if (r6 == r2) goto L_0x0285
            if (r6 == r4) goto L_0x028a
            r2 = 8
            if (r6 == r2) goto L_0x0285
            if (r6 == r7) goto L_0x0285
        L_0x027a:
            X.0yW r0 = r0.A0W
            r0.Bly(r8)
            return
        L_0x0280:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x0293
        L_0x0285:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0293
        L_0x028a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            goto L_0x0293
        L_0x028f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L_0x0293:
            r8.A00 = r1
            goto L_0x027a
        L_0x0296:
            boolean r5 = X.C40041ue.A06(r9)
            if (r5 == 0) goto L_0x02b1
            java.lang.String r9 = r0.A0g
            X.C18740tg.A06(r9)
            X.0xg r8 = r0.A0Y
            X.4ZU r6 = new X.4ZU
            r6.<init>(r0, r3)
            X.4ZS r5 = new X.4ZS
            r5.<init>(r0, r3)
            r8.A08(r6, r5, r9)
            goto L_0x025c
        L_0x02b1:
            if (r9 != r4) goto L_0x02d9
            java.lang.String r12 = r0.A0g
            X.C18740tg.A06(r12)
            com.whatsapp.jid.UserJid r11 = r0.A0b
            X.C18740tg.A06(r11)
            X.147 r10 = r0.A07
            X.C18740tg.A06(r10)
            long r13 = r0.A0B
            X.38j r9 = new X.38j
            r9.<init>(r10, r11, r12, r13)
            X.0xg r8 = r0.A0Y
            X.4ZU r6 = new X.4ZU
            r6.<init>(r0, r3)
            X.4ZS r5 = new X.4ZS
            r5.<init>(r0, r3)
            r8.A07(r6, r5, r9)
            goto L_0x025c
        L_0x02d9:
            java.lang.String r6 = "has to to be one of the use case"
            r5 = 0
            X.C18740tg.A0D(r5, r6)
            goto L_0x025c
        L_0x02e1:
            X.147 r8 = r0.A07
            X.C18740tg.A06(r8)
            X.147 r14 = r0.A0a
            X.C18740tg.A06(r14)
            X.1Pt r12 = r0.A0K
            X.30q r11 = new X.30q
            r11.<init>(r0)
            X.30p r5 = new X.30p
            r5.<init>(r0)
            X.C36351kA.A1J(r14, r8, r3)
            r13 = 3
            X.1Pv r10 = r12.A00
            X.37q r6 = new X.37q
            r6.<init>(r5, r11, r12, r8)
            X.0y7 r5 = X.AnonymousClass3NW.A02
            X.0w4 r5 = r10.A00
            X.0tq r5 = r5.A00
            X.19A r5 = X.C36361kB.A0c(r5)
            X.3NW r11 = new X.3NW
            r11.<init>(r6, r5)
            r6 = 2
            if (r9 != r13) goto L_0x0315
            r6 = 3
        L_0x0315:
            X.19A r5 = r11.A01
            r17 = r5
            java.lang.String r9 = r17.A09()
            java.lang.String r5 = "JoinSubgroupProtocolHelper/sendJoinSubgroupRequest"
            com.whatsapp.util.Log.i((java.lang.String) r5)
            if (r6 != r13) goto L_0x036a
            java.lang.String r5 = "default_sub_group"
        L_0x0326:
            X.1AL[] r6 = new X.AnonymousClass1AL[r1]
            java.lang.String r12 = "type"
            boolean r10 = X.C36371kC.A1Y(r12, r5, r6)
            java.lang.String r15 = "jid"
            X.1AL r5 = new X.1AL
            r5.<init>((com.whatsapp.jid.Jid) r8, (java.lang.String) r15)
            r6[r3] = r5
            java.lang.String r5 = "join_linked_group"
            X.9nx r8 = new X.9nx
            r8.<init>(r5, r6)
            X.1AL[] r6 = new X.AnonymousClass1AL[r2]
            java.lang.String r15 = "to"
            X.1AL r5 = new X.1AL
            r5.<init>((com.whatsapp.jid.Jid) r14, (java.lang.String) r15)
            r6[r10] = r5
            java.lang.String r5 = "set"
            X.C36341k9.A1L(r12, r5, r6, r3)
            X.C36331k8.A1R(r9, r6, r1)
            X.C36341k9.A1S(r6, r13)
            X.9nx r12 = X.C36391kE.A0m(r8, r6)
            X.3T7 r5 = new X.3T7
            r5.<init>(r11, r10)
            r14 = 310(0x136, float:4.34E-43)
            r15 = 0
            r11 = r5
            r13 = r9
            r10 = r17
            r10.A0K(r11, r12, r13, r14, r15)
            goto L_0x025c
        L_0x036a:
            java.lang.String r5 = "sub_group"
            goto L_0x0326
        L_0x036d:
            X.1Sk r10 = r0.A0L
            int r12 = r0.A0A
            X.17X r6 = r0.A0U
            X.147 r5 = r0.A07
            int r5 = X.C36401kF.A01(r6, r5)
            long r5 = (long) r5
            r13 = 20
            goto L_0x020f
        L_0x037e:
            java.lang.Object r0 = r6.A00
            X.4YE r0 = (X.AnonymousClass4YE) r0
            java.lang.Object r1 = r0.A00
            goto L_0x000d
        L_0x0386:
            java.lang.Object r0 = r6.A00
            X.4WB r0 = (X.AnonymousClass4WB) r0
            java.lang.Object r1 = r0.A00
            goto L_0x000d
        L_0x038e:
            java.lang.Object r0 = r6.A00
            X.4WC r0 = (X.AnonymousClass4WC) r0
            java.lang.Object r1 = r0.A00
            goto L_0x000d
        L_0x0396:
            java.lang.Object r1 = r6.A00
            goto L_0x000d
        L_0x039a:
            java.lang.Object r0 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = (com.whatsapp.companiondevice.LinkedDevicesViewModel) r0
            X.0wU r4 = r0.A09
            X.19g r3 = r0.A03
            X.0v5 r2 = r0.A01
            X.1cr r1 = r0.A02
            X.2il r0 = new X.2il
            r0.<init>(r2, r1, r3)
            X.C36331k8.A1F(r0, r4)
            return
        L_0x03af:
            java.lang.Object r0 = r6.A00
            X.4Yu r0 = (X.C90024Yu) r0
            java.lang.Object r2 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r2
            r1 = 0
            r2.A03 = r1
            X.00s r0 = r2.A05
            X.C36341k9.A18(r0, r1)
            X.1Rs r0 = r2.A0T
            r1 = 0
            r0.A0D(r1)
            X.1Rs r0 = r2.A0N
            r0.A0D(r1)
            return
        L_0x03cb:
            java.lang.Object r2 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r2
            X.0wU r1 = r2.A0V
            r0 = 46
            A01(r1, r2, r0)
            return
        L_0x03d7:
            java.lang.Object r5 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            X.19g r7 = r5.A0G
            java.util.Set r0 = r7.A0O
            r0.clear()
            java.util.ArrayList r0 = r7.A0A()
            java.util.Iterator r6 = r0.iterator()
        L_0x03ea:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0406
            java.lang.Object r0 = r6.next()
            X.3SB r0 = (X.AnonymousClass3SB) r0
            com.whatsapp.jid.DeviceJid r4 = r0.A07
            X.19A r3 = r7.A0J
            r2 = 0
            r1 = 0
            r0 = 240(0xf0, float:3.36E-43)
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r0, r1, r4)
            r3.A0J(r0)
            goto L_0x03ea
        L_0x0406:
            X.0wU r4 = r5.A0V
            r0 = 47
            X.3wS r3 = new X.3wS
            r3.<init>((java.lang.Object) r5, (int) r0)
            r1 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r0 = "LinedDevicesActivity/refresh"
            X.1jE r0 = r4.BpM(r3, r0, r1)
            r5.A02 = r0
            return
        L_0x041a:
            java.lang.Object r0 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r0
            X.19g r1 = r0.A0C
            java.lang.String r0 = "account_sync_timeout"
            X.C236419g.A06(r1, r0)
            return
        L_0x0426:
            java.lang.Object r0 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r0
            X.1OG r0 = r0.A05
            r0.A03()
            return
        L_0x0430:
            java.lang.Object r0 = r6.A00
            X.14u r0 = (X.C225314u) r0
            X.17Y r2 = r0.A05
            r1 = 2131890926(0x7f1212ee, float:1.9416558E38)
            r0 = 1
            r2.A07(r1, r0)
            return
        L_0x043e:
            java.lang.Object r1 = r6.A00
            X.4Uk r1 = (X.C88884Uk) r1
            X.3M6 r1 = (X.AnonymousClass3M6) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x045b
            java.lang.Object r3 = r1.A00
            android.app.Activity r3 = (android.app.Activity) r3
            r2 = 1
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "has_removed_all_devices"
            r1.putExtra(r0, r2)
            r0 = -1
            r3.setResult(r0, r1)
            return
        L_0x045b:
            java.lang.String r0 = "LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onRemovedAllDevices"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0461:
            java.lang.Object r1 = r6.A00
            X.237 r1 = (X.AnonymousClass237) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.1dx r2 = r1.getUserMuteActions$app_product_community_community_non_modified()
            X.147 r1 = r1.A06
            if (r1 != 0) goto L_0x0478
            java.lang.String r0 = "cagJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0478:
            X.2oi r0 = X.C51992oi.CONTACT_INFO
            r2.A01(r1, r0)
            return
        L_0x047e:
            java.lang.Object r0 = r6.A00
            X.3CL r0 = (X.AnonymousClass3CL) r0
            X.3Sv r0 = r0.A00
            X.19g r5 = r0.A0C
            X.3Iw r2 = r0.A00
            java.lang.Object r4 = r5.A0N
            monitor-enter(r4)
            X.3Iw r0 = r5.A00     // Catch:{ all -> 0x04be }
            if (r0 != 0) goto L_0x04a9
            r0 = 0
            r5.A01 = r0     // Catch:{ all -> 0x04be }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04be }
            java.lang.String r0 = "companion-device-manager/device login initiated: "
            r1.append(r0)     // Catch:{ all -> 0x04be }
            X.3SB r0 = r2.A02     // Catch:{ all -> 0x04be }
            com.whatsapp.jid.DeviceJid r0 = r0.A07     // Catch:{ all -> 0x04be }
            X.C36321k7.A1N(r0, r1)     // Catch:{ all -> 0x04be }
            r5.A00 = r2     // Catch:{ all -> 0x04be }
            r0 = 1
            r5.A03 = r0     // Catch:{ all -> 0x04be }
        L_0x04a7:
            monitor-exit(r4)     // Catch:{ all -> 0x04be }
            goto L_0x04bd
        L_0x04a9:
            java.lang.String r0 = "companion-device-manager/onDeviceLoginInitiated/login already initiated"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04be }
            X.0wN r3 = r5.A06     // Catch:{ all -> 0x04be }
            java.lang.String r2 = "companion-device-manager/login already initiated"
            boolean r0 = r5.A03     // Catch:{ all -> 0x04be }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04be }
            r0 = 0
            r3.A0E(r2, r1, r0)     // Catch:{ all -> 0x04be }
            goto L_0x04a7
        L_0x04bd:
            return
        L_0x04be:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x04be }
            throw r0
        L_0x04c1:
            java.lang.Object r0 = r6.A00
            X.3Sv r0 = (X.C65623Sv) r0
            X.C65623Sv.A00(r0)
            X.4Uk r0 = r0.A0D
            r0.BZI()
            return
        L_0x04ce:
            java.lang.Object r0 = r6.A00
            X.1oo r0 = (X.C38421oo) r0
            X.C38421oo.A00(r0)
            return
        L_0x04d6:
            java.lang.Object r3 = r6.A00
            X.1yj r3 = (X.C42381yj) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.view.View r0 = r3.A00
            android.content.Context r1 = r0.getContext()
            java.lang.Class<X.01I> r0 = X.AnonymousClass01I.class
            android.app.Activity r2 = X.C24801Dv.A01(r1, r0)
            X.01I r2 = (X.AnonymousClass01I) r2
            X.1fs r1 = r3.A03
            goto L_0x06a6
        L_0x04ee:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r2 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r2
            X.1Sq r0 = r2.A03
            if (r0 == 0) goto L_0x0508
            X.00T r0 = r2.A0E
            X.147 r1 = X.C36431kI.A0k(r0)
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            android.content.Intent r0 = X.AnonymousClass190.A0s(r2, r1)
            r2.startActivity(r0)
            return
        L_0x0508:
            java.lang.String r0 = "communityNavigator"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x050f:
            java.lang.Object r1 = r6.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r1 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r1
            X.00T r0 = r1.A0E
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            android.content.Intent r0 = X.AnonymousClass190.A0c(r1, r0)
            goto L_0x06c2
        L_0x0521:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet r2 = (com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet) r2
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r2.A06
            r1 = 1
            if (r0 == 0) goto L_0x052d
            r0.setEnabled(r1)
        L_0x052d:
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r2.A07
            if (r0 == 0) goto L_0x0534
            r0.setEnabled(r1)
        L_0x0534:
            r2.A1b()
            return
        L_0x0538:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet r2 = (com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet) r2
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r2.A02
            r1 = 1
            if (r0 == 0) goto L_0x0544
            r0.setEnabled(r1)
        L_0x0544:
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r2.A03
            if (r0 == 0) goto L_0x054b
            r0.setEnabled(r1)
        L_0x054b:
            r2.A1c()
            return
        L_0x054f:
            java.lang.Object r3 = r6.A00
            X.1oO r3 = (X.C38341oO) r3
            X.0xT r1 = r3.getFaqLinkFactory$app_product_community_community_non_modified()
            java.lang.String r0 = "3114626665494175"
            android.content.Intent r2 = X.C36341k9.A0D(r1, r0)
            X.1Dv r1 = r3.getActivityUtils$app_product_community_community_non_modified()
            android.content.Context r0 = r3.getContext()
            r1.A06(r0, r2)
            return
        L_0x0569:
            java.lang.Object r4 = r6.A00
            com.whatsapp.community.communityInfo.CAGInfoViewModel r4 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r4
            X.16J r1 = r4.A0F
            X.00T r0 = r4.A0O
            java.lang.Object r0 = r0.getValue()
            r1.registerObserver(r0)
            X.1Cf r1 = r4.A0E
            X.00T r0 = r4.A0N
            java.lang.Object r0 = r0.getValue()
            r1.registerObserver(r0)
            X.1Op r1 = r4.A0I
            X.00T r0 = r4.A0P
            java.lang.Object r0 = r0.getValue()
            X.4Qk r0 = (X.C87854Qk) r0
            r1.A00(r0)
            X.08S r3 = r4.A08
            X.2EH r0 = r4.A02
            java.lang.String r5 = "groupChatInfoViewModel"
            if (r0 != 0) goto L_0x059d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x059d:
            X.00r r2 = r0.A02
            X.4J8 r1 = new X.4J8
            r1.<init>(r4)
            r0 = 34
            X.C53822rw.A02(r2, r3, r1, r0)
            X.1tr r0 = r4.A01
            if (r0 != 0) goto L_0x05b4
            java.lang.String r0 = "groupParticipantsViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05b4:
            X.1sU r2 = r0.A0F
            X.4J9 r1 = new X.4J9
            r1.<init>(r4)
            r0 = 36
            X.C53822rw.A02(r2, r3, r1, r0)
            X.2EH r0 = r4.A02
            if (r0 != 0) goto L_0x05c9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x05c9:
            X.00r r2 = r0.A07
            X.4JA r1 = new X.4JA
            r1.<init>(r4)
            r0 = 37
            X.C53822rw.A02(r2, r3, r1, r0)
            X.2EH r0 = r4.A02
            if (r0 != 0) goto L_0x05de
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x05de:
            X.00r r2 = r0.A00
            X.4JB r1 = new X.4JB
            r1.<init>(r4)
            r0 = 35
            X.C53822rw.A02(r2, r3, r1, r0)
            com.whatsapp.community.communityInfo.CAGInfoViewModel.A02(r4)
            return
        L_0x05ee:
            java.lang.Object r1 = r6.A00
            com.whatsapp.community.communityInfo.CAGInfoFragment r1 = (com.whatsapp.community.communityInfo.CAGInfoFragment) r1
            X.00T r0 = r1.A0A
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.community.communityInfo.CAGInfoViewModel r5 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r5
            X.00T r0 = r1.A0B
            X.147 r4 = X.C36431kI.A0k(r0)
            X.00T r0 = r1.A0D
            java.lang.Object r2 = r0.getValue()
            X.2EH r2 = (X.AnonymousClass2EH) r2
            X.00T r0 = r1.A0E
            java.lang.Object r1 = r0.getValue()
            X.1tr r1 = (X.C39811tr) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.C36321k7.A0x(r2, r1)
            X.16D r0 = r5.A0B
            X.141 r3 = r0.A0D(r4)
            r5.A00 = r3
            r5.A03 = r4
            r5.A02 = r2
            r5.A01 = r1
            X.171 r2 = r5.A0C
            java.lang.String r1 = "cagChat"
            r7 = 0
            r0 = -1
            boolean r0 = r2.A0g(r3, r0)
            r6 = 0
            if (r0 != 0) goto L_0x0647
            X.141 r0 = r5.A00
            if (r0 != 0) goto L_0x063b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x063b:
            java.lang.String r0 = r0.A0V
            if (r0 == 0) goto L_0x0647
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0647
            java.lang.String r7 = "interactive"
        L_0x0647:
            X.0yC r1 = r5.A0H
            r0 = 7119(0x1bcf, float:9.976E-42)
            boolean r0 = r1.A0E(r0)
            java.lang.String r4 = "cagJid"
            if (r0 == 0) goto L_0x067d
            X.17r r1 = r5.A0G
            X.147 r0 = r5.A03
            if (r0 != 0) goto L_0x065e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x065e:
            X.6X6 r0 = r1.A0C(r0)
            X.0xg r3 = r5.A0K
            X.147 r2 = r5.A03
            if (r2 != 0) goto L_0x066d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x066d:
            java.lang.String r1 = r0.A0C()
            X.AnonymousClass00C.A08(r1)
            X.3S5 r0 = new X.3S5
            r0.<init>(r7, r6, r1)
            r3.A09(r0, r2)
            goto L_0x068b
        L_0x067d:
            X.0xg r1 = r5.A0K
            X.147 r0 = r5.A03
            if (r0 != 0) goto L_0x0688
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x0688:
            r1.A0E(r0, r7, r6)
        L_0x068b:
            X.17Y r1 = r5.A09
            r0 = 23
            A00(r1, r5, r0)
            return
        L_0x0693:
            java.lang.Object r0 = r6.A00
            X.30s r0 = (X.C587030s) r0
            com.whatsapp.community.NewCommunityActivity r0 = r0.A00
            r0.Bnv()
            X.C36331k8.A0m(r0)
            return
        L_0x06a0:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.NewCommunityActivity r2 = (com.whatsapp.community.NewCommunityActivity) r2
            X.1fs r1 = r2.A06
        L_0x06a6:
            java.lang.String r0 = "community-examples-article"
            r1.A01(r2, r0)
            return
        L_0x06ac:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r2 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r2
            X.1fs r1 = r2.A0H
            java.lang.String r0 = "community-settings-add-groups"
            r1.A01(r2, r0)
            return
        L_0x06b8:
            java.lang.Object r1 = r6.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r1 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r1
            X.147 r0 = r1.A0M
            android.content.Intent r0 = X.AnonymousClass190.A0s(r1, r0)
        L_0x06c2:
            r1.startActivity(r0)
            return
        L_0x06c6:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.LinkExistingGroups r2 = (com.whatsapp.community.LinkExistingGroups) r2
            X.147 r1 = r2.A0A
            if (r1 == 0) goto L_0x06d9
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = r2.A03
            if (r0 == 0) goto L_0x06db
            java.util.SortedSet r0 = r0.A03(r1)
        L_0x06d6:
            r2.A0D = r0
            return
        L_0x06d9:
            r0 = 0
            goto L_0x06d6
        L_0x06db:
            java.lang.String r0 = "memberSuggestedGroupsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06e2:
            java.lang.Object r4 = r6.A00
            com.whatsapp.community.LinkExistingGroups r4 = (com.whatsapp.community.LinkExistingGroups) r4
            android.content.Intent r2 = X.C36431kI.A0D()
            X.147 r3 = r4.A0A
            if (r3 != 0) goto L_0x06f8
            r1 = 1
            java.lang.String r0 = "should_open_new_group"
            r2.putExtra(r0, r1)
            X.C36331k8.A0o(r4, r2)
            return
        L_0x06f8:
            X.190 r0 = r4.A09
            if (r0 == 0) goto L_0x0712
            r1 = 3
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass190.A1O(r4, r0, r1)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "parent_group_jid_to_link"
            r2.putExtra(r0, r1)
            r4.finish()
            r4.startActivity(r2)
            return
        L_0x0712:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0717:
            java.lang.Object r0 = r6.A00
            X.4YH r0 = (X.AnonymousClass4YH) r0
            java.lang.Object r1 = r0.A00
            X.1ue r1 = (X.C40041ue) r1
            r0 = 1
            goto L_0x0733
        L_0x0721:
            java.lang.Object r0 = r6.A00
            X.1ue r0 = (X.C40041ue) r0
            X.1LV r2 = r0.A0J
            X.147 r1 = r0.A0a
            r0 = 3
            r2.A0A(r1, r0)
            return
        L_0x072e:
            java.lang.Object r1 = r6.A00
            X.1ue r1 = (X.C40041ue) r1
            r0 = 0
        L_0x0733:
            r1.A0T(r0)
            return
        L_0x0737:
            java.lang.Object r3 = r6.A00
            X.1ub r3 = (X.C40021ub) r3
            X.0yC r1 = r3.A0F
            r0 = 7983(0x1f2f, float:1.1187E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0758
            X.1LV r0 = r3.A03
            X.17d r0 = r0.A08
            r0.A03()
            java.util.Map r0 = r0.A01
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0758
            r0 = 1
            X.C40021ub.A03(r3, r0)
        L_0x0758:
            X.1LV r0 = r3.A03
            java.util.ArrayList r0 = r0.A03()
            java.util.Iterator r6 = r0.iterator()
        L_0x0762:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x07c6
            X.11F r1 = X.C36401kF.A0a(r6)
            X.12q r0 = r3.A09
            X.3Qp r4 = X.C36371kC.A0W(r0, r1)
            com.whatsapp.jid.GroupJid r5 = X.C36441kJ.A0l(r1)
            if (r4 == 0) goto L_0x0762
            if (r5 == 0) goto L_0x0762
            java.util.Map r0 = r3.A0S
            java.util.ArrayList r1 = X.C40021ub.A01(r3, r4, r0)
            if (r1 == 0) goto L_0x0793
            java.util.Comparator r0 = r3.A0Q
            java.util.Collections.sort(r1, r0)
            java.util.Map r0 = r3.A0R
            r0.put(r4, r1)
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0762
        L_0x0793:
            X.1EL r2 = r3.A0K
            int r1 = r4.A02
            java.util.Set r0 = X.C56602wa.A00
            boolean r0 = X.AnonymousClass000.A1Z(r0, r1)
            if (r0 == 0) goto L_0x0762
            X.16D r1 = r2.A00
            X.11F r0 = r4.A06()
            X.141 r0 = r1.A0D(r0)
            boolean r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x0762
            X.3Ri r0 = r3.A04
            java.util.Set r0 = r0.A01
            r0.add(r5)
            java.util.Map r1 = r3.A0R
            java.lang.Object r0 = r1.get(r4)
            if (r0 != 0) goto L_0x0762
            java.util.List r0 = java.util.Collections.emptyList()
            r1.put(r4, r0)
            goto L_0x0762
        L_0x07c6:
            X.C40021ub.A03(r3, r2)
            X.17Y r0 = r3.A01
            A00(r0, r3, r2)
            return
        L_0x07cf:
            java.lang.Object r2 = r6.A00
            X.1ub r2 = (X.C40021ub) r2
            X.1WG r1 = r2.A08
            X.1NL r0 = r2.A07
            r1.registerObserver(r0)
            X.1Cf r1 = r2.A0B
            X.1Ct r0 = r2.A0A
            r1.registerObserver(r0)
            X.1Lo r1 = r2.A0J
            X.1cp r0 = r2.A0I
            r1.registerObserver(r0)
            X.17z r1 = r2.A0H
            X.1Cs r0 = r2.A0G
            r1.registerObserver(r0)
            X.16J r1 = r2.A0E
            X.191 r0 = r2.A0D
            r1.registerObserver(r0)
            X.16I r1 = r2.A06
            X.15j r0 = r2.A05
            r1.registerObserver(r0)
            X.3Ri r0 = r2.A04
            X.1Cf r1 = r0.A03
            X.1Ct r0 = r0.A02
            r1.registerObserver(r0)
            return
        L_0x0807:
            java.lang.Object r0 = r6.A00
            X.30n r0 = (X.C586530n) r0
            X.1uf r0 = r0.A00
            X.C40051uf.A04(r0)
            return
        L_0x0811:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0886 }
            r0 = 640(0x280, float:8.97E-43)
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r0, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0886 }
            if (r5 == 0) goto L_0x0886
            int[] r6 = r2.A0M
            int r0 = r6.length
            int r0 = r0 - r3
            double r0 = (double) r0
            double r8 = r8 * r0
            long r3 = java.lang.Math.round(r8)
            int r0 = (int) r3
            r0 = r6[r0]
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r5)
            r3.drawColor(r0)
            android.graphics.Paint r1 = X.C36441kJ.A0K()
            r0 = 0
            r3.drawBitmap(r7, r0, r0, r1)
            r3 = 0
            X.0yb r0 = r2.A08
            X.0ya r4 = r0.A0O()
            if (r4 != 0) goto L_0x0847
            java.lang.String r0 = "NewCommunityActivity/getRandomlySelectedEmojiBitmap contentResolver=null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0877 }
            goto L_0x087d
        L_0x0847:
            X.1P3 r1 = r2.A0F     // Catch:{ Exception -> 0x0877 }
            X.2Fo r0 = r2.A03     // Catch:{ Exception -> 0x0877 }
            java.io.File r0 = r1.A03(r0)     // Catch:{ Exception -> 0x0877 }
            r0.delete()     // Catch:{ Exception -> 0x0877 }
            X.16K r1 = r2.A0B     // Catch:{ Exception -> 0x0877 }
            X.2Fo r0 = r2.A03     // Catch:{ Exception -> 0x0877 }
            java.io.File r0 = r1.A02(r0)     // Catch:{ Exception -> 0x0877 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x0877 }
            java.io.OutputStream r3 = r4.A07(r0)     // Catch:{ Exception -> 0x0877 }
            if (r3 == 0) goto L_0x087d
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0877 }
            r0 = 85
            r5.compress(r1, r0, r3)     // Catch:{ Exception -> 0x0877 }
            r3.flush()     // Catch:{ Exception -> 0x0877 }
            java.lang.String r0 = "NewCommunityActivity/setRandomlySelectedPicture"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0877 }
            com.whatsapp.community.NewCommunityActivity.A0F(r2)     // Catch:{ Exception -> 0x0877 }
            goto L_0x087d
        L_0x0877:
            r1 = move-exception
            java.lang.String r0 = "NewCommunityActivity/render/bg/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0881 }
        L_0x087d:
            X.AnonymousClass14X.A02(r3)
            return
        L_0x0881:
            r0 = move-exception
            X.AnonymousClass14X.A02(r3)
            throw r0
        L_0x0886:
            java.lang.String r0 = "NewCommunityActivity/Could not create randomly selected community icon"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81093wS.run():void");
    }

    public C81093wS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
