package X;

import android.view.View;

/* renamed from: X.3YG  reason: invalid class name */
public class AnonymousClass3YG implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3YG(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass3YG(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.whatsapp.framework.alerts.ui.AlertCardListFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v49, resolved type: com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x032c, code lost:
        r1 = X.C36421kH.A0Z(r0);
        X.AnonymousClass00C.A0D(r1, 0);
        r2.A03.A04 = r1;
        r2.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x033b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0351, code lost:
        X.C142466ov.A0A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0354, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0494, code lost:
        r2.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0497, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x05a0, code lost:
        X.C36341k9.A15(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x05a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06dc, code lost:
        r0.BTm(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x06df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07f4, code lost:
        r2 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0801, code lost:
        r1.invoke(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0804, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ce, code lost:
        r0 = r2.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0288, code lost:
        r3.removeCallbacks(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x028f, code lost:
        if (r3.getVisibility() != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0291, code lost:
        r3.postDelayed(r2, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0296, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r6 = r17
            int r0 = r6.A02
            r3 = r18
            switch(r0) {
                case 0: goto L_0x0791;
                case 1: goto L_0x0788;
                case 2: goto L_0x06f1;
                case 3: goto L_0x06e0;
                case 4: goto L_0x06d2;
                case 5: goto L_0x0273;
                case 6: goto L_0x06c7;
                case 7: goto L_0x025d;
                case 8: goto L_0x06bc;
                case 9: goto L_0x06ac;
                case 10: goto L_0x022a;
                case 11: goto L_0x01f5;
                case 12: goto L_0x0686;
                case 13: goto L_0x0677;
                case 14: goto L_0x07f9;
                case 15: goto L_0x0669;
                case 16: goto L_0x07e6;
                case 17: goto L_0x07d7;
                case 18: goto L_0x0656;
                case 19: goto L_0x0601;
                case 20: goto L_0x01c8;
                case 21: goto L_0x05c2;
                case 22: goto L_0x05b2;
                case 23: goto L_0x051a;
                case 24: goto L_0x0170;
                case 25: goto L_0x0507;
                case 26: goto L_0x0145;
                case 27: goto L_0x00d4;
                case 28: goto L_0x04d8;
                case 29: goto L_0x00bf;
                case 30: goto L_0x00b1;
                case 31: goto L_0x0089;
                case 32: goto L_0x0542;
                case 33: goto L_0x0498;
                case 34: goto L_0x047b;
                case 35: goto L_0x0464;
                case 36: goto L_0x03cd;
                case 37: goto L_0x037d;
                case 38: goto L_0x0355;
                case 39: goto L_0x0347;
                case 40: goto L_0x033c;
                case 41: goto L_0x0079;
                case 42: goto L_0x0066;
                case 43: goto L_0x0319;
                case 44: goto L_0x0306;
                case 45: goto L_0x02d5;
                case 46: goto L_0x02ab;
                case 47: goto L_0x0297;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r6.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r0 = r6.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r5 = r0.A1J
            X.01I r0 = r4.A0h()
            if (r0 == 0) goto L_0x0065
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0065
            X.3Qq r0 = r4.A1o
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0044
            X.3Qq r0 = r4.A1o
            r0.A0A()
            X.3Qq r0 = r4.A1o
            X.5NI r1 = r0.A09()
            if (r1 == 0) goto L_0x0044
            boolean r0 = r1.A0A()
            if (r0 != 0) goto L_0x0044
            r1.A03()
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A09(r0)
        L_0x0044:
            com.whatsapp.mediaview.MediaViewFragment.A0E(r4)
            X.01I r0 = r4.A0i()
            r3 = 1
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.status.playback.MessageReplyActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "isMediaViewReply"
            r2.putExtra(r0, r3)
            android.content.Intent r0 = X.AnonymousClass3UJ.A00(r2, r5)
            r4.A1C(r0)
        L_0x0065:
            return
        L_0x0066:
            java.lang.Object r2 = r6.A00
            X.4mq r2 = (X.C96134mq) r2
            java.lang.Object r0 = r6.A01
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            int r1 = r0.A04()
            r0 = -1
            if (r1 == r0) goto L_0x0065
            X.C96134mq.A02(r2, r1)
            return
        L_0x0079:
            java.lang.Object r0 = r6.A00
            com.whatsapp.mediacomposer.doodle.penmode.PenModeView r0 = (com.whatsapp.mediacomposer.doodle.penmode.PenModeView) r0
            java.lang.Object r1 = r6.A01
            X.4R4 r1 = (X.AnonymousClass4R4) r1
            X.4OG r0 = r0.A00
            if (r0 == 0) goto L_0x0065
            r1.BKx(r0)
            return
        L_0x0089:
            java.lang.Object r1 = r6.A00
            X.1vv r1 = (X.C40671vv) r1
            java.lang.Object r0 = r6.A01
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            int r4 = r0.A04()
            if (r4 < 0) goto L_0x0065
            X.1sc r3 = r1.A01
            int[] r1 = r1.A03
            int r0 = r1.length
            int r0 = r4 % r0
            r2 = r1[r0]
            X.1hi r1 = r3.A01
            int r0 = X.C36341k9.A07(r1)
            if (r4 == r0) goto L_0x0065
            X.C36341k9.A16(r1, r4)
            X.1hi r0 = r3.A00
            X.C36341k9.A16(r0, r2)
            return
        L_0x00b1:
            java.lang.Object r0 = r6.A00
            X.7zh r0 = (X.C168097zh) r0
            java.lang.Object r2 = r6.A01
            X.0D3 r2 = (X.AnonymousClass0D3) r2
            X.C36391kE.A1T(r2)
            X.02t r1 = r0.A03
            goto L_0x00cc
        L_0x00bf:
            java.lang.Object r0 = r6.A00
            X.7zh r0 = (X.C168097zh) r0
            java.lang.Object r2 = r6.A01
            X.0D3 r2 = (X.AnonymousClass0D3) r2
            X.C36391kE.A1T(r2)
            X.02t r1 = r0.A02
        L_0x00cc:
            if (r1 == 0) goto L_0x0065
            int r0 = r2.A04()
            goto L_0x07f4
        L_0x00d4:
            java.lang.Object r5 = r6.A00
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            java.lang.Object r3 = r6.A01
            X.3CG r3 = (X.AnonymousClass3CG) r3
            boolean r0 = X.AnonymousClass22g.A0r(r5)
            if (r0 == 0) goto L_0x00f7
            X.1qm r2 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131889566(0x7f120d9e, float:1.94138E38)
            r2.A0c(r0)
            r1 = 2131890331(0x7f12109b, float:1.941535E38)
            r0 = 0
            r2.A0h(r0, r1)
            r2.A0b()
            return
        L_0x00f7:
            boolean r0 = X.AnonymousClass22g.A0q(r5)
            if (r0 != 0) goto L_0x0104
            r0 = 2131889567(0x7f120d9f, float:1.9413801E38)
            r5.BO5(r0)
            return
        L_0x0104:
            X.141 r4 = r5.A0y
            boolean r0 = r4.A0f
            r11 = 0
            if (r0 == 0) goto L_0x079a
            boolean r0 = r5.A0Z
            if (r0 != 0) goto L_0x0065
            android.view.Window r0 = r5.getWindow()
            int r9 = r0.getStatusBarColor()
            boolean r0 = X.C19550w8.A04()
            if (r0 == 0) goto L_0x0125
            android.view.Window r0 = r5.getWindow()
            int r11 = r0.getNavigationBarColor()
        L_0x0125:
            r7 = 0
            X.141 r0 = r5.A0y
            X.11F r6 = r0.A0H
            r10 = 0
            r8 = 0
            r12 = 0
            r13 = 0
            android.content.Intent r2 = X.AnonymousClass190.A0o(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.2E6 r1 = r5.A0Z
            r0 = 2131435328(0x7f0b1f40, float:1.8492495E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            android.os.Bundle r1 = X.AnonymousClass3CG.A00(r5, r0, r3)
            r0 = 15
            X.AnonymousClass0XN.A02(r5, r2, r1, r0)
            return
        L_0x0145:
            java.lang.Object r3 = r6.A00
            com.whatsapp.group.GroupAdminPickerActivity r3 = (com.whatsapp.group.GroupAdminPickerActivity) r3
            java.lang.Object r1 = r6.A01
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.view.View r0 = r3.A02
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0065
            float r2 = r1.y
            android.view.View r0 = r3.A01
            float r1 = r0.getY()
            android.view.View r0 = r3.A01
            int r0 = r0.getPaddingTop()
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0065
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A03
            r0 = 4
            r1.A0W(r0)
            return
        L_0x0170:
            java.lang.Object r3 = r6.A00
            com.whatsapp.framework.alerts.ui.AlertCardListFragment r3 = (com.whatsapp.framework.alerts.ui.AlertCardListFragment) r3
            java.lang.Object r5 = r6.A01
            X.AUj r5 = (X.C21667AUj) r5
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1sb r1 = r3.A04
            if (r1 != 0) goto L_0x0185
            java.lang.String r0 = "alertListViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0185:
            java.lang.String r0 = r5.A06
            X.1EW r2 = r1.A01
            java.util.List r0 = X.C36371kC.A11(r0)
            r2.A06(r0)
            X.00s r1 = r1.A00
            java.util.ArrayList r0 = r2.A04()
            r1.A0C(r0)
            X.31n r0 = r3.A02
            if (r0 == 0) goto L_0x07bd
            java.util.Set r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x01a3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r2 = r3.next()
            com.whatsapp.payments.ui.BrazilPaymentSettingsFragment r2 = (com.whatsapp.payments.ui.BrazilPaymentSettingsFragment) r2
            X.0yC r1 = r2.A02
            r0 = 1724(0x6bc, float:2.416E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01a3
            X.B3f r4 = r2.A0C
            java.lang.Integer r6 = X.C36361kB.A0i()
            java.lang.String r9 = r2.A0u
            java.lang.String r8 = "payment_home"
            r7 = r6
            r4.BOZ(r5, r6, r7, r8, r9)
            goto L_0x01a3
        L_0x01c8:
            java.lang.Object r5 = r6.A00
            com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment r5 = (com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment) r5
            java.lang.Object r4 = r6.A01
            X.155 r4 = (X.AnonymousClass155) r4
            r3 = 1
            r5.A1c()
            r2 = 0
            X.3Gy r1 = r5.A03
            if (r1 == 0) goto L_0x07d0
            r0 = 0
            r1.A01(r0, r0, r2, r3)
            X.16D r2 = r5.A02
            if (r2 == 0) goto L_0x07cb
            X.00T r0 = r5.A06
            long r0 = X.C36351kA.A08(r0)
            X.141 r1 = r2.A05(r0)
            if (r1 == 0) goto L_0x0065
            X.3Gy r0 = r5.A03
            if (r0 == 0) goto L_0x07c4
            r0.A00(r4, r1, r3)
            return
        L_0x01f5:
            java.lang.Object r1 = r6.A00
            X.4O1 r1 = (X.AnonymousClass4O1) r1
            java.lang.Object r3 = r6.A01
            X.8ab r3 = (X.C175508ab) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.3h0 r1 = (X.C71583h0) r1
            X.3HK r2 = r1.A00
            X.1sS r0 = r2.A0N
            X.6tS r1 = r0.A01
            if (r1 == 0) goto L_0x0065
            boolean r0 = r1 instanceof X.AnonymousClass28U
            if (r0 == 0) goto L_0x0065
            X.28U r1 = (X.AnonymousClass28U) r1
            X.3CT r0 = r2.A07
            X.3Fw r3 = r3.A00
            r0.A00(r1, r3)
            X.11F r0 = r2.A0A
            if (r0 == 0) goto L_0x0065
            X.3Ol r2 = r2.A0P
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = r3.A01
            boolean r0 = X.C36421kH.A1a(r0)
            r2.A01(r1, r0)
            return
        L_0x022a:
            java.lang.Object r3 = r6.A00
            X.3HK r3 = (X.AnonymousClass3HK) r3
            java.lang.Object r7 = r6.A01
            X.3Ah r7 = (X.C61033Ah) r7
            X.11F r0 = r3.A0A
            if (r0 == 0) goto L_0x0065
            X.3Ol r5 = r3.A0P
            java.lang.String r2 = r0.getRawString()
            r1 = 2
            r0 = 1
            X.C64553Ol.A00(r5, r2, r1, r0)
            X.31X r6 = new X.31X
            r6.<init>(r3)
            android.app.Activity r1 = r3.A0I
            X.11F r8 = r3.A0A
            X.1DU r9 = r3.A0S
            X.0ww r2 = r3.A0L
            X.1EM r10 = r3.A0T
            X.3PE r4 = r3.A0O
            X.3FY r3 = r3.A0M
            X.21M r0 = new X.21M
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.show()
            return
        L_0x025d:
            java.lang.Object r4 = r6.A00
            X.8a4 r4 = (X.C175238a4) r4
            java.lang.Object r3 = r6.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            X.1Rx r2 = r4.A0D
            com.whatsapp.conversationslist.ViewHolder r1 = r4.A06
            int r0 = r4.A07
            r2.BTh(r1, r3, r0)
            android.view.View r3 = r1.A05
            java.lang.Runnable r2 = r4.A0N
            goto L_0x0288
        L_0x0273:
            java.lang.Object r4 = r6.A00
            X.8a3 r4 = (X.C175228a3) r4
            java.lang.Object r3 = r6.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            X.1Rx r2 = r4.A0C
            com.whatsapp.conversationslist.ViewHolder r1 = r4.A06
            int r0 = r4.A05
            r2.BTh(r1, r3, r0)
            android.view.View r3 = r1.A05
            java.lang.Runnable r2 = r4.A0P
        L_0x0288:
            r3.removeCallbacks(r2)
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0065
            r0 = 20
            r3.postDelayed(r2, r0)
            return
        L_0x0297:
            java.lang.Object r2 = r6.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r2 = (com.whatsapp.mediaview.MediaViewBaseFragment) r2
            java.lang.Object r0 = r6.A01
            X.9v5 r0 = (X.AnonymousClass9v5) r0
            r3.setOnClickListener(r0)
            boolean r0 = r2.A0G
            r1 = r0 ^ 1
            r0 = 1
            r2.A1o(r1, r0)
            return
        L_0x02ab:
            java.lang.Object r4 = r6.A00
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r4 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r4
            java.lang.Object r3 = r6.A01
            X.3nZ r3 = (X.C75643nZ) r3
            X.3A1 r2 = r3.A03
            int r0 = r2.A03
            int r0 = r0 + 1
            int r1 = r0 % 3
            r2.A03 = r1
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = r3.A01
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r0.A03
            if (r0 != 0) goto L_0x02ca
            java.lang.String r0 = "doodleEditText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02ca:
            r0.A0E(r1)
            X.6wC r0 = r3.A02
            r0.A00 = r1
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView.A00(r4, r1)
            return
        L_0x02d5:
            java.lang.Object r4 = r6.A00
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r4 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r4
            java.lang.Object r3 = r6.A01
            X.3nZ r3 = (X.C75643nZ) r3
            X.3A1 r0 = r3.A03
            X.3PW r2 = r0.A05
            int r0 = r2.A02
            int r0 = r0 + 1
            int r1 = r0 % 4
            r2.A02 = r1
            int r0 = r2.A03
            r2.A01(r0, r1)
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = r3.A01
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r0.A03
            if (r0 != 0) goto L_0x02fb
            java.lang.String r0 = "doodleEditText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02fb:
            r0.setBackgroundStyle(r1)
            X.6wC r0 = r3.A02
            r0.A01 = r1
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView.A01(r4, r1)
            return
        L_0x0306:
            java.lang.Object r2 = r6.A00
            X.3nZ r2 = (X.C75643nZ) r2
            java.lang.Object r0 = r6.A01
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r0
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r0.A03
            if (r0 != 0) goto L_0x032c
            java.lang.String r0 = "doodleEditText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0319:
            java.lang.Object r2 = r6.A00
            X.3nZ r2 = (X.C75643nZ) r2
            java.lang.Object r0 = r6.A01
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r0
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r0.A03
            if (r0 != 0) goto L_0x032c
            java.lang.String r0 = "doodleEditText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x032c:
            java.lang.String r1 = X.C36421kH.A0Z(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.3A1 r0 = r2.A03
            r0.A04 = r1
            r2.dismiss()
            return
        L_0x033c:
            java.lang.Object r0 = r6.A00
            X.5B6 r0 = (X.AnonymousClass5B6) r0
            java.lang.Object r1 = r6.A01
            X.3Kq r1 = (X.C63593Kq) r1
            X.6ov r0 = r0.A04
            goto L_0x0351
        L_0x0347:
            java.lang.Object r0 = r6.A00
            X.5B7 r0 = (X.AnonymousClass5B7) r0
            java.lang.Object r1 = r6.A01
            X.3Kq r1 = (X.C63593Kq) r1
            X.6ov r0 = r0.A06
        L_0x0351:
            X.C142466ov.A0A(r0, r1)
            return
        L_0x0355:
            java.lang.Object r0 = r6.A00
            X.32M r0 = (X.AnonymousClass32M) r0
            java.lang.Object r4 = r6.A01
            X.3Xd r4 = (X.C66743Xd) r4
            X.C36341k9.A1D(r0)
            com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity r3 = r0.A00
            X.00T r0 = r3.A06
            r0.getValue()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "integratorInfo"
            r2.putExtra(r0, r4)
            r3.startActivity(r2)
            return
        L_0x037d:
            java.lang.Object r8 = r6.A00
            X.14p r8 = (X.C224914p) r8
            java.lang.Object r1 = r6.A01
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r1 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r1
            r9 = 0
            android.content.Context r0 = r1.getContext()
            java.lang.String r7 = r1.A0D
            if (r7 != 0) goto L_0x0395
            java.lang.String r0 = "videoUrl"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0395:
            java.lang.String r6 = r1.A0A
            int r5 = r1.A00
            java.lang.String r4 = r1.A0B
            java.lang.String r3 = r1.A0C
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportVideoActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "video_url"
            r2.putExtra(r0, r7)
            if (r6 == 0) goto L_0x03b6
            java.lang.String r0 = "captions_url"
            r2.putExtra(r0, r6)
        L_0x03b6:
            java.lang.String r0 = "video_start_position"
            r2.putExtra(r0, r5)
            if (r4 == 0) goto L_0x03c2
            java.lang.String r0 = "media_group_id"
            r2.putExtra(r0, r4)
        L_0x03c2:
            if (r3 == 0) goto L_0x03c9
            java.lang.String r0 = "video_locale"
            r2.putExtra(r0, r3)
        L_0x03c9:
            r8.startActivityForResult(r2, r9)
            return
        L_0x03cd:
            java.lang.Object r0 = r6.A00
            X.1nN r0 = (X.C37891nN) r0
            java.lang.Object r7 = r6.A01
            X.3Xc r7 = (X.C66733Xc) r7
            com.whatsapp.inappsupport.ui.SupportTopicsActivity r6 = r0.A00
            java.lang.String r4 = r7.A01
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x040b
            java.util.Objects.requireNonNull(r4)
            java.lang.String r3 = r7.A04
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.FaqItemActivityV2"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.util.Objects.requireNonNull(r4)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.FaqItemActivityV2.html_content"
            r1.putExtra(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0405
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.FaqItemActivityV2.url"
            r1.putExtra(r0, r3)
        L_0x0405:
            r0 = 15
            r6.startActivityForResult(r1, r0)
            return
        L_0x040b:
            java.util.ArrayList r3 = r7.A05
            if (r3 == 0) goto L_0x0460
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0460
            android.view.MenuItem r1 = r6.A02
            if (r1 == 0) goto L_0x041e
            boolean r0 = r7.A06
            r1.setVisible(r0)
        L_0x041e:
            X.01z r2 = r6.getSupportFragmentManager()
            com.whatsapp.inappsupport.ui.SupportTopicsFragment r5 = new com.whatsapp.inappsupport.ui.SupportTopicsFragment
            r5.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "parent_topic"
            r1.putParcelable(r0, r7)
            java.lang.String r0 = "topics"
            r1.putParcelableArrayList(r0, r3)
            r5.A17(r1)
            X.09Y r4 = new X.09Y
            r4.<init>(r2)
            java.lang.String r0 = r7.A02
            r4.A0J(r0)
            r3 = 2130772008(0x7f010028, float:1.7147122E38)
            r2 = 2130772009(0x7f010029, float:1.7147124E38)
            r1 = 2130772007(0x7f010027, float:1.714712E38)
            r0 = 2130772010(0x7f01002a, float:1.7147126E38)
            r4.A06(r3, r2, r1, r0)
            r0 = 2131434499(0x7f0b1c03, float:1.8490814E38)
            r4.A0B(r5, r0)
            r4.A01()
            java.util.List r0 = r6.A05
            r0.add(r5)
            return
        L_0x0460:
            r6.A3i(r7)
            return
        L_0x0464:
            java.lang.Object r2 = r6.A00
            android.app.Dialog r2 = (android.app.Dialog) r2
            java.lang.Object r1 = r6.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r1 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            r2.dismiss()
            X.3Cf r2 = r1.A3i()
            r1 = 0
            r0 = 20
            goto L_0x0494
        L_0x047b:
            java.lang.Object r2 = r6.A00
            android.app.Dialog r2 = (android.app.Dialog) r2
            java.lang.Object r1 = r6.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r1 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            r2.dismiss()
            com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0F(r1)
            X.3Cf r2 = r1.A3i()
            r1 = 0
            r0 = 19
        L_0x0494:
            r2.A00(r0, r1)
            return
        L_0x0498:
            java.lang.Object r0 = r6.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            java.lang.Object r1 = r6.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r1 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r1
            r8 = 1
            X.AnonymousClass00C.A0D(r1, r8)
            r0.dismiss()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r3 = X.C36411kG.A0g(r1)
            com.whatsapp.WaEditText r0 = r1.A09
            r2 = 0
            if (r0 != 0) goto L_0x04b7
            java.lang.String r0 = "titleEditText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04b7:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x04d6
            java.lang.String r4 = r0.toString()
        L_0x04c1:
            java.lang.String r5 = com.whatsapp.inappbugreporting.InAppBugReportingActivity.A01(r1)
            android.net.Uri[] r7 = r1.A0M
            java.lang.String r6 = r1.A0L
            r3.A0T(r4, r5, r6, r7, r8)
            X.3Cf r1 = r1.A3i()
            r0 = 18
            r1.A00(r0, r2)
            return
        L_0x04d6:
            r4 = r2
            goto L_0x04c1
        L_0x04d8:
            java.lang.Object r5 = r6.A00
            X.1Dv r5 = (X.C24801Dv) r5
            java.lang.Object r1 = r6.A01
            X.808 r1 = (X.AnonymousClass808) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r4 = 1
            X.AnonymousClass00C.A0D(r1, r4)
            java.lang.Object r3 = r3.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.AnonymousClass00C.A0E(r3, r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            android.view.View r0 = r1.A00
            android.content.Context r2 = r0.getContext()
            android.content.Context r1 = r0.getContext()
            java.lang.Integer r0 = X.C36371kC.A0o()
            android.content.Intent r0 = X.AnonymousClass190.A0w(r1, r3, r0, r4, r4)
            r5.A06(r2, r0)
            return
        L_0x0507:
            java.lang.Object r1 = r6.A00
            X.00S r1 = (X.AnonymousClass00S) r1
            java.lang.Object r0 = r6.A01
            X.02E r0 = (X.AnonymousClass02E) r0
            r1.invoke()
            X.01I r0 = r0.A0i()
            X.AnonymousClass3UJ.A06(r0)
            return
        L_0x051a:
            java.lang.Object r3 = r6.A00
            com.whatsapp.framework.alerts.ui.AlertCardListFragment r3 = (com.whatsapp.framework.alerts.ui.AlertCardListFragment) r3
            java.lang.Object r2 = r6.A01
            X.AUj r2 = (X.C21667AUj) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.31n r0 = r3.A02
            if (r0 == 0) goto L_0x05ab
            java.util.Set r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x052e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05a0
            java.lang.Object r0 = r1.next()
            com.whatsapp.payments.ui.PaymentSettingsFragment r0 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r0
            X.9lN r0 = r0.A0l
            if (r0 == 0) goto L_0x052e
            r0.A05(r2)
            goto L_0x052e
        L_0x0542:
            java.lang.Object r3 = r6.A00
            com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment r3 = (com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment) r3
            java.lang.Object r5 = r6.A01
            android.view.View r5 = (android.view.View) r5
            X.1X4 r2 = r3.A00
            if (r2 == 0) goto L_0x05a4
            java.lang.String r13 = r3.A09
            X.00T r4 = r3.A0A
            X.11F r10 = X.C36421kH.A0O(r4)
            X.00T r0 = r3.A0B
            java.lang.Object r9 = r0.getValue()
            com.whatsapp.jid.GroupJid r9 = (com.whatsapp.jid.GroupJid) r9
            X.00T r0 = r3.A0C
            java.lang.String r8 = X.C36431kI.A1E(r0)
            X.00T r0 = r3.A0D
            java.lang.String r7 = X.C36431kI.A1E(r0)
            X.0wo r6 = r2.A0K
            long r0 = X.C19970wo.A00(r6)
            X.2c5 r11 = X.C55162uB.A00(r9, r8, r7, r0)
            java.lang.String r0 = ""
            r11.A16(r0)
            long r0 = X.C19970wo.A00(r6)
            X.AnonymousClass1X4.A07(r2, r0)
            X.1Xb r9 = r2.A16
            X.3uZ r12 = X.C79963uZ.A00
            r14 = 0
            r15 = r0
            X.2bV r0 = r9.A00(r10, r11, r12, r13, r14, r15)
            X.C36401kF.A1E(r2, r0)
            X.190 r2 = X.C36441kJ.A0j()
            android.content.Context r1 = r5.getContext()
            X.11F r0 = X.C36421kH.A0O(r4)
            android.content.Intent r0 = X.C36391kE.A0F(r1, r2, r0)
            r3.A1C(r0)
        L_0x05a0:
            X.C36341k9.A15(r3)
            return
        L_0x05a4:
            java.lang.String r0 = "userActions"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05ab:
            java.lang.String r0 = "alertActionObserverManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05b2:
            java.lang.Object r1 = r6.A00
            X.3J9 r1 = (X.AnonymousClass3J9) r1
            java.lang.Object r0 = r6.A01
            X.3J9 r0 = (X.AnonymousClass3J9) r0
            X.4T9 r1 = r1.A01
            X.AUj r0 = r0.A02
            r1.BTd(r0)
            return
        L_0x05c2:
            java.lang.Object r5 = r6.A00
            com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment r5 = (com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment) r5
            java.lang.Object r4 = r6.A01
            android.content.Context r4 = (android.content.Context) r4
            r3 = 8
            X.3Gy r2 = r5.A03
            if (r2 == 0) goto L_0x05fa
            r1 = 0
            r0 = 1
            r2.A01(r1, r1, r3, r0)
            X.0xT r1 = r5.A04
            if (r1 == 0) goto L_0x05f3
            java.lang.String r0 = "1313491802751163"
            android.content.Intent r1 = X.C36341k9.A0D(r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            X.1Dv r0 = r5.A00
            if (r0 == 0) goto L_0x05ec
            r0.A06(r4, r1)
            return
        L_0x05ec:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05f3:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05fa:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0601:
            java.lang.Object r7 = r6.A00
            com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment r7 = (com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment) r7
            java.lang.Object r5 = r6.A01
            X.155 r5 = (X.AnonymousClass155) r5
            r7.A1c()
            r3 = 2
            X.3Gy r2 = r7.A03
            if (r2 == 0) goto L_0x064f
            r1 = 0
            r0 = 1
            r2.A01(r1, r1, r3, r0)
            X.3Gy r4 = r7.A03
            if (r4 == 0) goto L_0x0648
            X.00T r0 = r7.A05
            X.11F r3 = X.C36421kH.A0O(r0)
            X.C18740tg.A06(r3)
            X.AnonymousClass00C.A08(r3)
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r3)
            if (r1 == 0) goto L_0x0645
            X.1C6 r0 = r4.A03
            boolean r0 = r0.A0A(r1)
            if (r0 == 0) goto L_0x0645
            java.lang.String r2 = "chat_fmx_card_safety_tools_report"
        L_0x0636:
            X.19g r0 = r4.A01
            X.3ty r1 = r0.A07()
            X.3tr r0 = new X.3tr
            r0.<init>(r5, r4, r3, r2)
            r1.A0A(r0)
            return
        L_0x0645:
            java.lang.String r2 = "chat_fmx_card_safety_tools_report_suspicious"
            goto L_0x0636
        L_0x0648:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x064f:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0656:
            java.lang.Object r3 = r6.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r3 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r3
            java.lang.Object r2 = r6.A01
            X.68t r2 = (X.C1275568t) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r1 = 1
            X.5zp r0 = r2.A00()
            r3.A1l(r0, r1)
            return
        L_0x0669:
            java.lang.Object r2 = r6.A00
            X.56G r2 = (X.AnonymousClass56G) r2
            java.lang.Object r1 = r6.A01
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.02t r0 = r2.A02
            r0.invoke(r1)
            return
        L_0x0677:
            java.lang.Object r1 = r6.A00
            X.4Q0 r1 = (X.AnonymousClass4Q0) r1
            java.lang.Object r0 = r6.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.B2t()
            r0.dismiss()
            return
        L_0x0686:
            java.lang.Object r0 = r6.A00
            X.36m r0 = (X.C601036m) r0
            java.lang.Object r1 = r6.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            X.4QQ r0 = r0.A00
            boolean r2 = r1.isChecked()
            X.4Zs r0 = (X.C90264Zs) r0
            int r1 = r0.A01
            java.lang.Object r0 = r0.A00
            switch(r1) {
                case 0: goto L_0x06a2;
                case 1: goto L_0x06a7;
                default: goto L_0x069d;
            }
        L_0x069d:
            com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment) r0
            r0.A01 = r2
            return
        L_0x06a2:
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r0 = (com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment) r0
            r0.A06 = r2
            return
        L_0x06a7:
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r0 = (com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment) r0
            r0.A05 = r2
            return
        L_0x06ac:
            java.lang.Object r0 = r6.A00
            X.8a1 r0 = (X.C175208a1) r0
            java.lang.Object r2 = r6.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            X.1Rx r1 = r0.A04
            com.whatsapp.conversationslist.ViewHolder r0 = r0.A06
            r1.BTj(r0, r2)
            return
        L_0x06bc:
            java.lang.Object r0 = r6.A00
            X.8a4 r0 = (X.C175238a4) r0
            java.lang.Object r1 = r6.A01
            X.146 r1 = (X.AnonymousClass146) r1
            X.1Rx r0 = r0.A0D
            goto L_0x06dc
        L_0x06c7:
            java.lang.Object r0 = r6.A00
            X.8a3 r0 = (X.C175228a3) r0
            java.lang.Object r1 = r6.A01
            X.146 r1 = (X.AnonymousClass146) r1
            X.1Rx r0 = r0.A0C
            goto L_0x06dc
        L_0x06d2:
            java.lang.Object r0 = r6.A00
            X.8a2 r0 = (X.C175218a2) r0
            java.lang.Object r1 = r6.A01
            X.146 r1 = (X.AnonymousClass146) r1
            X.1Rx r0 = r0.A03
        L_0x06dc:
            r0.BTm(r1)
            return
        L_0x06e0:
            java.lang.Object r0 = r6.A00
            X.8a2 r0 = (X.C175218a2) r0
            java.lang.Object r3 = r6.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            X.1Rx r2 = r0.A03
            com.whatsapp.conversationslist.ViewHolder r1 = r0.A06
            r0 = -1
            r2.BTh(r1, r3, r0)
            return
        L_0x06f1:
            java.lang.Object r5 = r6.A00
            com.whatsapp.conversation.selectlist.SelectListBottomSheet r5 = (com.whatsapp.conversation.selectlist.SelectListBottomSheet) r5
            java.lang.Object r4 = r6.A01
            X.1w7 r4 = (X.C40791w7) r4
            X.4Q5 r0 = r5.A00
            if (r0 == 0) goto L_0x075b
            int r1 = r4.A00
            r0 = -1
            if (r1 == r0) goto L_0x075b
            java.util.List r3 = r4.A02
            int r0 = r3.size()
            if (r1 > r0) goto L_0x075b
            int r0 = r4.A00
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x075b
            X.4Q5 r2 = r5.A00
            int r1 = r4.A00
            r0 = -1
            if (r1 == r0) goto L_0x0786
            int r0 = r3.size()
            if (r1 > r0) goto L_0x0786
            int r0 = r4.A00
            java.lang.Object r0 = r3.get(r0)
            X.3Na r0 = (X.C64193Na) r0
        L_0x0727:
            X.9ts r6 = r0.A00
            X.2tZ r2 = (X.AnonymousClass2tZ) r2
            int r0 = r2.A03
            if (r0 == 0) goto L_0x075f
            java.lang.Object r8 = r2.A00
            X.2KA r8 = (X.AnonymousClass2KA) r8
            java.lang.Object r7 = r2.A01
            java.lang.Object r10 = r2.A02
            if (r6 == 0) goto L_0x075b
            java.lang.String r11 = r6.A03
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "id"
            r2.put(r0, r1)
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "description"
            org.json.JSONObject r9 = r2.put(r0, r1)
            X.17Y r2 = r8.A00
            r12 = 4
            X.74q r6 = new X.74q
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 400(0x190, double:1.976E-321)
            r2.A0I(r6, r0)
        L_0x075b:
            r5.A1b()
            return
        L_0x075f:
            java.lang.Object r1 = r2.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r2.A01
            X.3fP r0 = (X.C70593fP) r0
            java.lang.Object r4 = r2.A02
            X.4V7 r1 = X.AnonymousClass3SS.A01(r1)
            if (r6 == 0) goto L_0x0780
            if (r1 == 0) goto L_0x0780
            X.17Y r3 = r0.A00
            r0 = 15
            X.3vL r2 = new X.3vL
            r2.<init>(r1, r6, r4, r0)
            r0 = 400(0x190, double:1.976E-321)
            r3.A0I(r2, r0)
            goto L_0x075b
        L_0x0780:
            java.lang.String r0 = "OpenSelectListAction/perform/error: not click in Conversation"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x075b
        L_0x0786:
            r0 = 0
            goto L_0x0727
        L_0x0788:
            java.lang.Object r1 = r6.A01
            X.3Qn r1 = (X.C65053Qn) r1
            r0 = 0
            r1.A08(r0)
            return
        L_0x0791:
            java.lang.Object r1 = r6.A01
            X.3Qn r1 = (X.C65053Qn) r1
            r0 = 0
            r1.A07(r0)
            return
        L_0x079a:
            X.147 r2 = r5.A1Y
            X.17X r0 = r5.A0M
            boolean r1 = r0.A0C(r2)
            boolean r0 = r0.A0D(r2)
            if (r1 == 0) goto L_0x07b2
            if (r0 != 0) goto L_0x07ae
            boolean r0 = r4.A13
            if (r0 != 0) goto L_0x07b2
        L_0x07ae:
            com.whatsapp.group.GroupChatInfoActivity.A18(r5)
            return
        L_0x07b2:
            r0 = 2131889563(0x7f120d9b, float:1.9413793E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r11)
            r0.show()
            return
        L_0x07bd:
            java.lang.String r0 = "alertActionObserverManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07c4:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07cb:
            java.lang.RuntimeException r0 = X.C36331k8.A0Z()
            throw r0
        L_0x07d0:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07d7:
            java.lang.Object r1 = r6.A00
            X.4mL r1 = (X.C95824mL) r1
            java.lang.Object r2 = r6.A01
            X.56U r2 = (X.AnonymousClass56U) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.02t r1 = r1.A09
            java.lang.String r2 = r2.A01
            goto L_0x0801
        L_0x07e6:
            java.lang.Object r1 = r6.A00
            X.4mL r1 = (X.C95824mL) r1
            java.lang.Object r2 = r6.A01
            X.56U r2 = (X.AnonymousClass56U) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.02t r1 = r1.A0A
            int r0 = r2.A00
        L_0x07f4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0801
        L_0x07f9:
            java.lang.Object r1 = r6.A00
            X.02t r1 = (X.C006302t) r1
            java.lang.Object r2 = r6.A01
            java.util.List r0 = X.AnonymousClass0D3.A0I
        L_0x0801:
            r1.invoke(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YG.onClick(android.view.View):void");
    }
}
