package X;

import android.view.View;

/* renamed from: X.3Y4  reason: invalid class name */
public class AnonymousClass3Y4 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass3Y4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass3Y4(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x031b, code lost:
        r3.putExtra("jid", r1);
        r4.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0323, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x037b, code lost:
        r0.showContextMenu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x037e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ac, code lost:
        r4.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04b5, code lost:
        r2.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05e8, code lost:
        throw X.C36331k8.A0d("newsletterLogging");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05ef, code lost:
        throw X.C36331k8.A0d("settingsManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0106, code lost:
        r4 = r2.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0108, code lost:
        if (r4 == null) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010a, code lost:
        r7 = r2.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010c, code lost:
        if (r7 != null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        throw X.C36331k8.A0d("jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0115, code lost:
        r1 = X.C36371kC.A0W(r4.A03, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011d, code lost:
        if ((r1 instanceof X.C44072La) == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011f, code lost:
        r1 = (X.C44072La) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0121, code lost:
        if (r1 == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        r1.A0B = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0125, code lost:
        r5 = r4.A04;
        r8 = new X.C90434a9(r4, 2);
        r1 = r5.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0135, code lost:
        if (X.C36391kE.A1Z(r1) == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013f, code lost:
        if (r1.A00.A0E(4887) == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0141, code lost:
        r1 = r5.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0149, code lost:
        if (X.C36391kE.A1Z(r1.A01) == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014b, code lost:
        r4 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0153, code lost:
        if (r4.A0E(3604) == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015f, code lost:
        if (((1 << 7) & r4.A07(3605)) == 0) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0161, code lost:
        r5.A0B.A01(new X.AnonymousClass8fL(r6, r7, r8, (java.lang.String) null, (java.lang.String) null, (byte[]) null, false, false, false, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0170, code lost:
        r0 = r6.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        if (r0 == 1) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0176, code lost:
        if (r0 == 0) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0178, code lost:
        if (r0 != 2) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017a, code lost:
        r1 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017c, code lost:
        r0 = r2.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017e, code lost:
        if (r0 == null) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0180, code lost:
        r0.A07(r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0183, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0184, code lost:
        r1 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0187, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r35) {
        /*
            r34 = this;
            r1 = r34
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x01fe;
                case 1: goto L_0x01fe;
                case 2: goto L_0x020a;
                case 3: goto L_0x0212;
                case 4: goto L_0x021b;
                case 5: goto L_0x0247;
                case 6: goto L_0x0269;
                case 7: goto L_0x0284;
                case 8: goto L_0x02c2;
                case 9: goto L_0x02f5;
                case 10: goto L_0x02ff;
                case 11: goto L_0x0007;
                case 12: goto L_0x0324;
                case 13: goto L_0x001f;
                case 14: goto L_0x0007;
                case 15: goto L_0x0336;
                case 16: goto L_0x033e;
                case 17: goto L_0x03b7;
                case 18: goto L_0x0345;
                case 19: goto L_0x003b;
                case 20: goto L_0x0373;
                case 21: goto L_0x037f;
                case 22: goto L_0x0387;
                case 23: goto L_0x03b7;
                case 24: goto L_0x03bf;
                case 25: goto L_0x03dc;
                case 26: goto L_0x0414;
                case 27: goto L_0x044d;
                case 28: goto L_0x0461;
                case 29: goto L_0x03b7;
                case 30: goto L_0x0483;
                case 31: goto L_0x048b;
                case 32: goto L_0x04c0;
                case 33: goto L_0x03b7;
                case 34: goto L_0x0517;
                case 35: goto L_0x051f;
                case 36: goto L_0x004b;
                case 37: goto L_0x0543;
                case 38: goto L_0x008b;
                case 39: goto L_0x0092;
                case 40: goto L_0x00f9;
                case 41: goto L_0x0100;
                case 42: goto L_0x054e;
                case 43: goto L_0x0562;
                case 44: goto L_0x03b7;
                case 45: goto L_0x056a;
                case 46: goto L_0x057a;
                case 47: goto L_0x018a;
                case 48: goto L_0x01c5;
                case 49: goto L_0x05b8;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            X.005 r0 = r3.A0Y
            java.lang.Object r2 = X.C36411kG.A0v(r0)
            X.0y9 r2 = (X.C20780y9) r2
            boolean r1 = X.AnonymousClass22g.A0t(r3)
            X.1Uw r0 = X.AnonymousClass22g.A0F(r3)
            X.C200659hu.A00(r3, r2, r0, r1)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            X.2La r1 = r2.A3t()
            boolean r0 = r1.A0N()
            if (r0 == 0) goto L_0x0031
            com.whatsapp.newsletter.NewsletterInfoActivity.A0x(r2)
            return
        L_0x0031:
            boolean r0 = r1.A0M()
            if (r0 == 0) goto L_0x001e
            com.whatsapp.newsletter.NewsletterInfoActivity.A0w(r2)
            return
        L_0x003b:
            java.lang.Object r0 = r1.A00
            X.01I r0 = X.C36441kJ.A0X(r0)
            if (r0 == 0) goto L_0x001e
            X.01z r0 = r0.getSupportFragmentManager()
            r0.A0V()
            return
        L_0x004b:
            java.lang.Object r5 = r1.A00
            com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity r5 = (com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity) r5
            X.2La r1 = com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity.A01(r5)
            if (r1 == 0) goto L_0x001e
            r0 = 2131891509(0x7f121535, float:1.941774E38)
            r5.Bu1(r0)
            X.1Zi r4 = r5.A0B
            if (r4 == 0) goto L_0x05cc
            X.1Uw r3 = r1.A0J()
            r0 = 6
            X.4a9 r2 = new X.4a9
            r2.<init>(r5, r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.1GQ r1 = r4.A0G
            boolean r0 = X.C36391kE.A1Z(r1)
            if (r0 == 0) goto L_0x001e
            X.12q r0 = r4.A0C
            boolean r0 = X.C65903Tx.A06(r0, r3, r1)
            if (r0 == 0) goto L_0x001e
            X.1Zo r1 = r4.A04
            if (r1 == 0) goto L_0x05c5
            X.2p1 r0 = X.C52182p1.VERIFIED
            X.2YH r0 = r1.A00(r0, r3, r2)
            r0.A01()
            return
        L_0x008b:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity r2 = (com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity) r2
            X.2pM r6 = X.C52392pM.ALL
            goto L_0x0106
        L_0x0092:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity r2 = (com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity) r2
            int r0 = r35.getId()
            int r6 = com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity.A01(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x001e
            X.39I r1 = r2.A0A
            if (r1 == 0) goto L_0x05db
            X.1Uw r0 = r2.A08
            if (r0 != 0) goto L_0x00b1
            java.lang.String r0 = "jid"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x00b1:
            r2 = 0
            X.12q r1 = r1.A03
            X.3Qp r9 = r1.A09(r0, r2)
            boolean r2 = r9 instanceof X.C44072La
            if (r2 == 0) goto L_0x001e
            X.2La r9 = (X.C44072La) r9
            if (r9 == 0) goto L_0x001e
            r7 = 0
            r21 = 0
            X.2pS[] r5 = X.C52452pS.values()
            int r4 = r5.length
            r3 = 0
        L_0x00c9:
            if (r3 >= r4) goto L_0x05d3
            r10 = r5[r3]
            int r2 = r10.value
            if (r2 != r6) goto L_0x00f6
            r20 = 402653183(0x17ffffff, float:1.6543611E-24)
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r19 = r7
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r8 = r7
            X.2La r2 = X.C44072La.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r29, r31, r33)
            r1.A0I(r2, r0)
            return
        L_0x00f6:
            int r3 = r3 + 1
            goto L_0x00c9
        L_0x00f9:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity r2 = (com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity) r2
            X.2pM r6 = X.C52392pM.DEFAULT
            goto L_0x0106
        L_0x0100:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity r2 = (com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity) r2
            X.2pM r6 = X.C52392pM.NONE
        L_0x0106:
            X.39I r4 = r2.A0A
            if (r4 == 0) goto L_0x05e9
            X.1Uw r7 = r2.A08
            if (r7 != 0) goto L_0x0115
            java.lang.String r0 = "jid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0115:
            X.12q r0 = r4.A03
            X.3Qp r1 = X.C36371kC.A0W(r0, r7)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x0125
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x0125
            r1.A0B = r6
        L_0x0125:
            X.1Zi r5 = r4.A04
            r3 = 2
            X.4a9 r8 = new X.4a9
            r8.<init>(r4, r3)
            r12 = 0
            r15 = 1
            X.1GQ r1 = r5.A0G
            boolean r0 = X.C36391kE.A1Z(r1)
            if (r0 == 0) goto L_0x0170
            X.0yC r1 = r1.A00
            r0 = 4887(0x1317, float:6.848E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0170
            X.1OA r1 = r5.A0M
            X.1GQ r0 = r1.A01
            boolean r0 = X.C36391kE.A1Z(r0)
            if (r0 == 0) goto L_0x0170
            X.0yC r4 = r1.A00
            r0 = 3604(0xe14, float:5.05E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x0170
            r0 = 7
            int r1 = r15 << r0
            r0 = 3605(0xe15, float:5.052E-42)
            int r0 = r4.A07(r0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0170
            X.164 r0 = r5.A0B
            r9 = 0
            r11 = r9
            r13 = 0
            r14 = 0
            X.8fL r5 = new X.8fL
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.A01(r5)
        L_0x0170:
            int r0 = r6.ordinal()
            if (r0 == r15) goto L_0x0187
            if (r0 == r12) goto L_0x0184
            if (r0 != r3) goto L_0x001e
            r1 = 18
        L_0x017c:
            X.1dD r0 = r2.A0B
            if (r0 == 0) goto L_0x05e2
            r0.A07(r1, r12)
            return
        L_0x0184:
            r1 = 17
            goto L_0x017c
        L_0x0187:
            r1 = 16
            goto L_0x017c
        L_0x018a:
            java.lang.Object r3 = r1.A00
            com.whatsapp.notification.PopupNotification r3 = (com.whatsapp.notification.PopupNotification) r3
            boolean r0 = com.whatsapp.notification.PopupNotification.A0O(r3)
            if (r0 != 0) goto L_0x001e
            X.1YV r0 = r3.A13
            r2 = 1
            X.C36401kF.A1H(r3, r0)
            X.C36391kE.A1P(r3)
            r3.A1M = r2
            java.util.List r0 = r3.A1J
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x001e
            com.whatsapp.notification.PopupNotificationViewPager r1 = r3.A10
            int r0 = r1.getCurrentItem()
            int r0 = r0 + 1
            r1.A0J(r0, r2)
            com.whatsapp.notification.PopupNotificationViewPager r0 = r3.A10
            int r1 = r0.getCurrentItem()
            java.util.List r0 = r3.A1J
            int r0 = r0.size()
            if (r1 < r0) goto L_0x01c1
            r1 = 0
        L_0x01c1:
            com.whatsapp.notification.PopupNotification.A0L(r3, r1)
            return
        L_0x01c5:
            java.lang.Object r3 = r1.A00
            com.whatsapp.notification.PopupNotification r3 = (com.whatsapp.notification.PopupNotification) r3
            boolean r0 = com.whatsapp.notification.PopupNotification.A0O(r3)
            if (r0 != 0) goto L_0x001e
            X.1YV r0 = r3.A13
            r2 = 1
            X.C36401kF.A1H(r3, r0)
            X.C36391kE.A1P(r3)
            r3.A1M = r2
            java.util.List r0 = r3.A1J
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x001e
            com.whatsapp.notification.PopupNotificationViewPager r1 = r3.A10
            int r0 = r1.getCurrentItem()
            int r0 = r0 - r2
            r1.A0J(r0, r2)
            com.whatsapp.notification.PopupNotificationViewPager r0 = r3.A10
            int r0 = r0.getCurrentItem()
            if (r0 >= 0) goto L_0x01fa
            java.util.List r0 = r3.A1J
            int r0 = X.C36421kH.A06(r0, r2)
        L_0x01fa:
            com.whatsapp.notification.PopupNotification.A0L(r3, r0)
            return
        L_0x01fe:
            java.lang.Object r1 = r1.A00
            X.2Xj r1 = (X.C46422Xj) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.4RC r0 = r1.A00
            r0.Bki()
            return
        L_0x020a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment r0 = (com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment) r0
            com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment.A05(r0)
            return
        L_0x0212:
            java.lang.Object r1 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            r0 = 1
            r1.A40(r0)
            return
        L_0x021b:
            java.lang.Object r7 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r7 = (com.whatsapp.newsletter.NewsletterInfoActivity) r7
            java.lang.String r6 = com.whatsapp.newsletter.NewsletterInfoActivity.A0v(r7)
            android.content.Intent r5 = X.C36431kI.A0B()
            java.lang.String r0 = "android.intent.extra.TEXT"
            r5.putExtra(r0, r6)
            java.lang.String r0 = "text/plain"
            X.C36371kC.A18(r5, r0)
            X.1dD r4 = r7.A3x()
            X.1Uw r3 = r7.A3v()
            r2 = 0
            r1 = 3
            r0 = 2
            r4.A08(r3, r2, r1, r0)
            android.content.Intent r0 = android.content.Intent.createChooser(r5, r6)
            r7.startActivity(r0)
            return
        L_0x0247:
            java.lang.Object r4 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r4 = (com.whatsapp.newsletter.NewsletterInfoActivity) r4
            r4.A3u()
            android.content.Context r0 = r35.getContext()
            X.1Uw r2 = r4.A3v()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity"
            r3.setClassName(r1, r0)
            java.lang.String r1 = X.AnonymousClass143.A03(r2)
            goto L_0x031b
        L_0x0269:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            r2.A3u()
            X.1Uw r1 = X.AnonymousClass22g.A0F(r2)
            X.2pY r0 = X.C52512pY.NEWSLETTER_INFO
            int r0 = r0.value
            android.content.Intent r1 = X.AnonymousClass190.A0r(r2, r1, r0)
            X.AnonymousClass3M9.A00(r1, r2)
            r0 = 0
            X.C05290Pd.A00(r2, r1, r0)
            return
        L_0x0284:
            java.lang.Object r6 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r6 = (com.whatsapp.newsletter.NewsletterInfoActivity) r6
            java.lang.String r0 = com.whatsapp.newsletter.NewsletterInfoActivity.A0v(r6)
            java.lang.String r2 = X.AnonymousClass3UN.A07(r0)
            r6.A3u()
            X.3OM r1 = new X.3OM
            r1.<init>(r6)
            java.lang.String r0 = "text/plain"
            r1.A0Y = r0
            r1.A0X = r2
            X.1Uw r0 = r6.A3v()
            r1.A02 = r0
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A06 = r0
            android.content.Intent r5 = X.AnonymousClass3OM.A00(r1)
            X.1dD r4 = r6.A3x()
            X.1Uw r3 = r6.A3v()
            r2 = 0
            r1 = 1
            r0 = 2
            r4.A08(r3, r2, r1, r0)
            r0 = 54
            r6.startActivityForResult(r5, r0)
            return
        L_0x02c2:
            java.lang.Object r3 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            X.1LY r2 = r3.A0x
            if (r2 == 0) goto L_0x02ee
            java.lang.String r1 = "newsletter_multi_admin"
            r0 = 0
            boolean r0 = r2.A01(r0, r1)
            r1 = r0 ^ 1
            r0 = 0
            if (r1 == 0) goto L_0x02ea
            X.01z r2 = r3.getSupportFragmentManager()
            com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet r1 = new com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            r1.A17(r0)
            X.C65443Sb.A02(r1, r2)
            return
        L_0x02ea:
            r3.BZK(r0)
            return
        L_0x02ee:
            java.lang.String r0 = "nuxManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02f5:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 52
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x02ff:
            java.lang.Object r4 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r4 = (com.whatsapp.newsletter.NewsletterInfoActivity) r4
            r4.A3u()
            X.1Uw r2 = r4.A3v()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity"
            r3.setClassName(r1, r0)
            java.lang.String r1 = r2.getRawString()
        L_0x031b:
            java.lang.String r0 = "jid"
            r3.putExtra(r0, r1)
            r4.startActivity(r3)
            return
        L_0x0324:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            X.2Sj r1 = r2.A0e
            if (r1 == 0) goto L_0x0332
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A00 = r0
        L_0x0332:
            com.whatsapp.newsletter.NewsletterInfoActivity.A10(r2)
            return
        L_0x0336:
            java.lang.Object r0 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment r0 = (com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment) r0
            r0.B75()
            return
        L_0x033e:
            java.lang.Object r0 = r1.A00
            X.2Y8 r0 = (X.AnonymousClass2Y8) r0
            android.view.View r0 = r0.A00
            goto L_0x037b
        L_0x0345:
            java.lang.Object r4 = r1.A00
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment r4 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment) r4
            X.01I r3 = r4.A0h()
            boolean r0 = r3 instanceof X.AnonymousClass4TO
            if (r0 == 0) goto L_0x03ac
            X.4TO r3 = (X.AnonymousClass4TO) r3
            if (r3 == 0) goto L_0x03ac
            X.00T r0 = r4.A0G
            X.1Uw r2 = X.C36431kI.A0i(r0)
            X.00T r0 = r4.A0F
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            com.whatsapp.mentions.MentionableEntry r0 = r4.A09
            if (r0 == 0) goto L_0x036d
            java.lang.String r0 = r0.getStringText()
            if (r0 != 0) goto L_0x036f
        L_0x036d:
            java.lang.String r0 = ""
        L_0x036f:
            r3.BgD(r2, r0, r1)
            goto L_0x03ac
        L_0x0373:
            java.lang.Object r1 = r1.A00
            X.0D3 r1 = (X.AnonymousClass0D3) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.view.View r0 = r1.A0H
        L_0x037b:
            r0.showContextMenu()
            return
        L_0x037f:
            java.lang.Object r0 = r1.A00
            com.whatsapp.newsletter.multiadmin.NewsletterSelectNewOwnerFragment r0 = (com.whatsapp.newsletter.multiadmin.NewsletterSelectNewOwnerFragment) r0
            r0.B75()
            return
        L_0x0387:
            java.lang.Object r4 = r1.A00
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.01I r2 = r4.A0h()
            boolean r0 = r2 instanceof X.AnonymousClass4RJ
            if (r0 == 0) goto L_0x03ac
            X.4RJ r2 = (X.AnonymousClass4RJ) r2
            if (r2 == 0) goto L_0x03ac
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            X.0xT r1 = r2.A11
            if (r1 == 0) goto L_0x03b0
            java.lang.String r0 = "360977646301595"
            android.net.Uri r0 = r1.A02(r0)
            X.AnonymousClass00C.A08(r0)
            r2.A3u()
            X.C36371kC.A1A(r0, r2)
        L_0x03ac:
            r4.A1b()
            return
        L_0x03b0:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03b7:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
            return
        L_0x03bf:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet r2 = (com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet) r2
            X.01I r1 = r2.A0h()
            boolean r0 = r1 instanceof X.AnonymousClass4RJ
            if (r0 == 0) goto L_0x04b5
            X.4RJ r1 = (X.AnonymousClass4RJ) r1
            if (r1 == 0) goto L_0x04b5
            X.00T r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r1.BZK(r0)
            goto L_0x04b5
        L_0x03dc:
            java.lang.Object r2 = r1.A00
            X.8fc r2 = (X.C178248fc) r2
            X.2bA r1 = r2.A0F
            if (r1 != 0) goto L_0x03eb
            java.lang.String r0 = "photoUpdater"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03eb:
            X.141 r3 = r2.A09
            if (r3 != 0) goto L_0x03f6
            java.lang.String r0 = "tempContact"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03f6:
            com.whatsapp.WaEditText r0 = r2.A3j()
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0406
            java.lang.String r0 = r0.toString()
            r3.A0P = r0
        L_0x0406:
            boolean r7 = r2.A3v()
            r4 = 2001(0x7d1, float:2.804E-42)
            r5 = 1
            r6 = -1
            r8 = 1
            r9 = 1
            r1.A08(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0414:
            java.lang.Object r5 = r1.A00
            X.2Ya r5 = (X.C46502Ya) r5
            X.01z r0 = r5.getSupportFragmentManager()
            java.lang.String r4 = "owner_action_confirmation"
            X.02E r1 = r0.A0N(r4)
            boolean r0 = r1 instanceof androidx.fragment.app.DialogFragment
            if (r0 == 0) goto L_0x042b
            if (r1 == 0) goto L_0x042b
            X.C46502Ya.A0F(r5)
        L_0x042b:
            boolean r0 = r5 instanceof com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity
            if (r0 == 0) goto L_0x044a
            X.2o2 r0 = X.C51572o2.TRANSFER_OWNERSHIP
        L_0x0431:
            com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment r3 = new com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = "arg_type"
            java.lang.String r0 = r0.toString()
            r2.putString(r1, r0)
            r3.A17(r2)
            r5.Btl(r3, r4)
            return
        L_0x044a:
            X.2o2 r0 = X.C51572o2.DELETE
            goto L_0x0431
        L_0x044d:
            java.lang.Object r3 = r1.A00
            X.2Yd r3 = (X.C46512Yd) r3
            r2 = 0
            X.3LE r1 = r3.A3m()
            r0 = 1
            r1.A05(r0)
            r3.A3u(r0)
            r3.A3v(r2)
            return
        L_0x0461:
            java.lang.Object r1 = r1.A00
            X.2Ym r1 = (X.AnonymousClass2Ym) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.4OO r2 = r1.A00
            X.2Yd r2 = (X.C46512Yd) r2
            r1 = 1
            X.1dD r0 = r2.A3j()
            r0.A06(r1)
            X.3UC r1 = r2.A07
            if (r1 == 0) goto L_0x047c
            r0 = 0
            r1.A0B(r2, r0)
            return
        L_0x047c:
            java.lang.String r0 = "newsletterLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0483:
            java.lang.Object r0 = r1.A00
            com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet r0 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet) r0
            com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet.A03(r0)
            return
        L_0x048b:
            java.lang.Object r2 = r1.A00
            com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet r2 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet) r2
            com.whatsapp.newsletter.NewsletterLinkLauncher r3 = r2.A04
            if (r3 == 0) goto L_0x04b9
            android.content.Context r4 = r2.A0a()
            X.00T r0 = r2.A0F
            X.1Uw r6 = X.C36431kI.A0i(r0)
            r8 = 0
            r11 = -1
            X.1Ts r7 = X.C28711Ts.IN_APP_LINK
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "whatsapp://channel/"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r8, r1)
            android.net.Uri r5 = android.net.Uri.parse(r0)
            r10 = 0
            r9 = r8
            r3.A01(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x04b5:
            r2.A1b()
            return
        L_0x04b9:
            java.lang.String r0 = "newsletterLinkLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04c0:
            java.lang.Object r6 = r1.A00
            com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet r6 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet) r6
            android.content.Context r0 = r6.A1D()
            android.app.Activity r0 = X.C36381kD.A0A(r0)
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r0)
            java.lang.Object r5 = r0.get()
            X.01I r5 = (X.AnonymousClass01I) r5
            if (r5 == 0) goto L_0x0513
            X.00T r0 = r6.A0C
            com.whatsapp.jid.Jid r4 = X.C36441kJ.A0m(r0)
            X.3On r2 = r6.A1m()
            X.11F r1 = X.C36421kH.A0O(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.16D r0 = r2.A00
            X.141 r1 = r0.A0D(r1)
            X.171 r0 = r2.A01
            java.lang.String r3 = X.C36381kD.A0v(r0, r1)
            com.whatsapp.newsletter.multiadmin.RevokeNewsletterAdminInviteDialogFragment r2 = new com.whatsapp.newsletter.multiadmin.RevokeNewsletterAdminInviteDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            if (r4 == 0) goto L_0x0506
            java.lang.String r0 = "arg_contact_jid"
            X.C36401kF.A14(r1, r4, r0)
        L_0x0506:
            java.lang.String r0 = "arg_contact_name"
            r1.putString(r0, r3)
            r2.A17(r1)
            r2.A00 = r6
            X.C65443Sb.A00(r2, r5)
        L_0x0513:
            r6.A1b()
            return
        L_0x0517:
            java.lang.Object r0 = r1.A00
            com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity r0 = (com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity) r0
            com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity.A01(r0)
            return
        L_0x051f:
            java.lang.Object r5 = r1.A00
            com.whatsapp.newsletter.ui.mv.NewsletterCreateMVUpsellActivity r5 = (com.whatsapp.newsletter.ui.mv.NewsletterCreateMVUpsellActivity) r5
            X.3UC r4 = r5.A00
            if (r4 == 0) goto L_0x053c
            r3 = 1
            X.0yC r1 = r4.A02
            r0 = 3834(0xefa, float:5.373E-42)
            int r2 = X.C36341k9.A08(r1, r0)
            X.0yC r1 = r4.A02
            r0 = 3835(0xefb, float:5.374E-42)
            int r0 = X.C36341k9.A08(r1, r0)
            r4.A07(r5, r2, r0, r3)
            return
        L_0x053c:
            java.lang.String r0 = "newsletterLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0543:
            java.lang.Object r0 = r1.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            X.C36341k9.A1D(r0)
            r0.invoke()
            return
        L_0x054e:
            java.lang.Object r3 = r1.A00
            X.14u r3 = (X.C225314u) r3
            X.0v0 r0 = r3.A09
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "newsletter_wait_list_subscription"
            X.C36331k8.A0w(r1, r0, r2)
            r3.finish()
            return
        L_0x0562:
            java.lang.Object r0 = r1.A00
            com.whatsapp.newsletter.ui.waitlist.NewsletterWaitListSubscribeFragment r0 = (com.whatsapp.newsletter.ui.waitlist.NewsletterWaitListSubscribeFragment) r0
            com.whatsapp.newsletter.ui.waitlist.NewsletterWaitListSubscribeFragment.A03(r0)
            return
        L_0x056a:
            java.lang.Object r1 = r1.A00
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            X.1Q0 r0 = r1.A1D
            r0.A01()
            com.whatsapp.notification.PopupNotification.A0I(r1)
            r1.finish()
            return
        L_0x057a:
            java.lang.Object r4 = r1.A00
            com.whatsapp.notification.PopupNotification r4 = (com.whatsapp.notification.PopupNotification) r4
            X.1Q0 r0 = r4.A1D
            r0.A01()
            X.2HC r0 = r4.A0X
            java.lang.String r3 = X.C36331k8.A0f(r0)
            X.141 r2 = r4.A0l
            if (r2 == 0) goto L_0x059c
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x059c
            java.util.HashMap r1 = X.C56772wr.A02
            com.whatsapp.jid.Jid r0 = X.C36411kG.A0h(r2)
            r1.put(r0, r3)
        L_0x059c:
            X.1Dv r3 = r4.A09
            X.190 r2 = X.C36441kJ.A0j()
            X.1A5 r1 = r4.A0h
            X.3T1 r0 = r4.A16
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            X.141 r0 = r1.A01(r0)
            X.C36391kE.A1A(r4, r3, r0, r2)
            com.whatsapp.notification.PopupNotification.A0I(r4)
            r4.finish()
            return
        L_0x05b8:
            java.lang.Object r1 = r1.A00
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            X.1YV r0 = r1.A13
            X.C36401kF.A1H(r1, r0)
            X.C36391kE.A1P(r1)
            return
        L_0x05c5:
            java.lang.String r0 = "newsletterUpdateVerifiedStatusGraphqlHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05cc:
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05d3:
            java.lang.String r0 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        L_0x05db:
            java.lang.String r0 = "settingsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05e2:
            java.lang.String r0 = "newsletterLogging"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05e9:
            java.lang.String r0 = "settingsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y4.onClick(android.view.View):void");
    }
}
