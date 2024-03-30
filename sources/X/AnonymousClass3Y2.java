package X;

import android.view.View;

/* renamed from: X.3Y2  reason: invalid class name */
public class AnonymousClass3Y2 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass3Y2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass3Y2(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.gallery.LinksGalleryFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: com.whatsapp.gallery.DocumentsGalleryFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: com.whatsapp.gallery.LinksGalleryFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: com.whatsapp.group.newgroup.NewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: com.whatsapp.gallery.LinksGalleryFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
        r1 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c3, code lost:
        r3.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006f, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0071, code lost:
        X.C99304t3.A00(r1, r2, 0).A0P();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0651, code lost:
        r1.A06(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0654, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0655, code lost:
        r1 = X.C36381kD.A0Y(r2);
        r0 = r5.A00;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x065b, code lost:
        r1.Bvv(r0);
        r2.A0A.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0663, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a9, code lost:
        if (r0.getCurrentItem() != 1) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0687, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x068a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x06d9, code lost:
        r3.A0m(r13, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06dc, code lost:
        r3.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0166, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0177, code lost:
        if (r2.A01() == false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0055, code lost:
        r4.putExtra(r0, r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A01
            r4 = r19
            switch(r0) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0064;
                case 2: goto L_0x0473;
                case 3: goto L_0x0473;
                case 4: goto L_0x047b;
                case 5: goto L_0x0603;
                case 6: goto L_0x0487;
                case 7: goto L_0x0603;
                case 8: goto L_0x04c4;
                case 9: goto L_0x007a;
                case 10: goto L_0x0096;
                case 11: goto L_0x04e1;
                case 12: goto L_0x00da;
                case 13: goto L_0x011d;
                case 14: goto L_0x0508;
                case 15: goto L_0x0153;
                case 16: goto L_0x015d;
                case 17: goto L_0x016a;
                case 18: goto L_0x053b;
                case 19: goto L_0x0603;
                case 20: goto L_0x019c;
                case 21: goto L_0x0543;
                case 22: goto L_0x054b;
                case 23: goto L_0x01cf;
                case 24: goto L_0x0553;
                case 25: goto L_0x01fc;
                case 26: goto L_0x055b;
                case 27: goto L_0x0563;
                case 28: goto L_0x0011;
                case 29: goto L_0x0259;
                case 30: goto L_0x0577;
                case 31: goto L_0x0291;
                case 32: goto L_0x0581;
                case 33: goto L_0x058a;
                case 34: goto L_0x0038;
                case 35: goto L_0x05aa;
                case 36: goto L_0x05b2;
                case 37: goto L_0x05bd;
                case 38: goto L_0x02c7;
                case 39: goto L_0x02e6;
                case 40: goto L_0x0681;
                case 41: goto L_0x05d7;
                case 42: goto L_0x05e3;
                case 43: goto L_0x030d;
                case 44: goto L_0x034d;
                case 45: goto L_0x06c7;
                case 46: goto L_0x05f9;
                case 47: goto L_0x0603;
                case 48: goto L_0x0609;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.view.custom.GroupDetailsCard r0 = (com.whatsapp.group.view.custom.GroupDetailsCard) r0
            com.whatsapp.group.view.custom.GroupDetailsCard.setupClickListeners$lambda$1(r0, r4)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r3 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.1NN r2 = r3.A1M
            X.147 r1 = r3.A1Y
            X.141 r0 = r3.A0y
            boolean r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x056b
            X.147 r5 = r3.A1Y
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.expiringgroups.ChangeExpiringGroupsSettingActivity"
            android.content.Intent r4 = r2.setClassName(r1, r0)
            java.lang.String r1 = r5.getRawString()
            java.lang.String r0 = "jid"
            goto L_0x0055
        L_0x0038:
            java.lang.Object r3 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            android.content.Context r0 = r3.getApplicationContext()
            X.147 r2 = r3.A1Y
            android.content.Intent r4 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupPendingParticipantsActivity"
            r4.setClassName(r1, r0)
            java.lang.String r1 = r2.getRawString()
            java.lang.String r0 = "gid"
        L_0x0055:
            r4.putExtra(r0, r1)
            goto L_0x02c3
        L_0x005a:
            java.lang.Object r1 = r1.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r1 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r2 = 2131889098(0x7f120bca, float:1.941285E38)
            goto L_0x006d
        L_0x0064:
            java.lang.Object r1 = r1.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r1 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r2 = 2131889101(0x7f120bcd, float:1.9412856E38)
        L_0x006d:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r1.A03
            if (r1 == 0) goto L_0x0010
            r0 = 0
            X.4t3 r0 = X.C99304t3.A00(r1, r2, r0)
            r0.A0P()
            return
        L_0x007a:
            java.lang.Object r3 = r1.A00
            X.1ys r3 = (X.C42471ys) r3
            X.2by r0 = r3.A00
            if (r0 == 0) goto L_0x0010
            com.whatsapp.gallery.DocumentsGalleryFragment r2 = r3.A0B
            X.4Uw r0 = X.C36381kD.A0Y(r2)
            boolean r0 = r0.BK6()
            if (r0 == 0) goto L_0x0611
            X.4Uw r1 = X.C36381kD.A0Y(r2)
            X.2by r0 = r3.A00
            goto L_0x065b
        L_0x0096:
            java.lang.Object r4 = r1.A00
            com.whatsapp.gallery.GalleryTabHostFragment r4 = (com.whatsapp.gallery.GalleryTabHostFragment) r4
            X.66x r3 = r4.A0F
            if (r3 == 0) goto L_0x062b
            androidx.viewpager.widget.ViewPager r0 = r4.A05
            r2 = 1
            if (r0 == 0) goto L_0x00ab
            int r0 = r0.getCurrentItem()
            r1 = 15
            if (r0 == r2) goto L_0x00ad
        L_0x00ab:
            r1 = 16
        L_0x00ad:
            java.lang.Integer r0 = X.C36431kI.A12()
            r3.A02(r0, r2, r1)
            X.1sD r0 = com.whatsapp.gallery.GalleryTabHostFragment.A06(r4)
            if (r0 == 0) goto L_0x00d0
            X.00T r0 = r0.A0J
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.gallery.GalleryRecentsFragment r0 = (com.whatsapp.gallery.GalleryRecentsFragment) r0
            boolean r0 = r0.A07
            if (r0 != r2) goto L_0x00d0
            boolean r0 = com.whatsapp.gallery.GalleryTabHostFragment.A0D(r4)
            if (r0 != 0) goto L_0x00d0
            com.whatsapp.gallery.GalleryTabHostFragment.A09(r4)
            return
        L_0x00d0:
            X.01I r0 = r4.A0h()
            if (r0 == 0) goto L_0x0010
            r0.onBackPressed()
            return
        L_0x00da:
            java.lang.Object r5 = r1.A00
            X.1z5 r5 = (X.C42601z5) r5
            X.3T1 r0 = r5.A00
            if (r0 == 0) goto L_0x0010
            com.whatsapp.gallery.LinksGalleryFragment r2 = r5.A0A
            X.4Uw r0 = X.C36381kD.A0Y(r2)
            boolean r0 = r0.BK6()
            if (r0 != 0) goto L_0x0655
            X.190 r3 = X.C36441kJ.A0j()
            android.content.Context r1 = r2.A1D()
            X.3T1 r0 = r5.A00
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            android.content.Intent r1 = X.C36391kE.A0F(r1, r3, r0)
            X.3T1 r0 = r5.A00
            long r3 = r0.A1N
            java.lang.String r0 = "row_id"
            r1.putExtra(r0, r3)
            X.3T1 r0 = r5.A00
            long r3 = r0.A1O
            java.lang.String r0 = "sort_id"
            r1.putExtra(r0, r3)
            X.3T1 r0 = r5.A00
            X.3Qa r0 = r0.A1J
            X.AnonymousClass3UJ.A00(r1, r0)
            X.AnonymousClass3LQ.A00(r1, r2)
            return
        L_0x011d:
            java.lang.Object r5 = r1.A00
            X.1z5 r5 = (X.C42601z5) r5
            X.3T1 r0 = r5.A00
            if (r0 == 0) goto L_0x0010
            com.whatsapp.gallery.LinksGalleryFragment r2 = r5.A0A
            X.4Uw r0 = X.C36381kD.A0Y(r2)
            boolean r0 = r0.BK6()
            if (r0 != 0) goto L_0x0655
            java.lang.String r0 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0010
            java.util.Set r3 = r5.A02
            if (r3 == 0) goto L_0x0632
            X.01I r2 = r2.A0h()
            X.14u r2 = (X.C225314u) r2
            java.lang.String r1 = r5.A01
            X.3T1 r0 = r5.A00
            X.3Qa r0 = r0.A1J
            java.lang.String r0 = r0.A01
            com.whatsapp.SuspiciousLinkWarningDialogFragment r0 = X.C53152qr.A00(r1, r0, r3)
            r2.Btm(r0)
            return
        L_0x0153:
            java.lang.Object r0 = r1.A00
            com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment r0 = (com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment) r0
            r0.A1b()
            X.00S r0 = r0.A00
            goto L_0x0166
        L_0x015d:
            java.lang.Object r0 = r1.A00
            com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment r0 = (com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment) r0
            r0.A1b()
            X.00S r0 = r0.A01
        L_0x0166:
            if (r0 == 0) goto L_0x0010
            goto L_0x0687
        L_0x016a:
            java.lang.Object r3 = r1.A00
            X.2M8 r3 = (X.AnonymousClass2M8) r3
            X.3HE r2 = r3.A0D
            if (r2 == 0) goto L_0x0179
            boolean r0 = r2.A01()
            r1 = 1
            if (r0 != 0) goto L_0x017a
        L_0x0179:
            r1 = 0
        L_0x017a:
            boolean r0 = r3.isShowing()
            if (r0 == 0) goto L_0x0194
            int r0 = r3.A00
            if (r0 != 0) goto L_0x0194
            if (r1 == 0) goto L_0x0194
            r3.A0F()
            java.lang.String r0 = "contextual_suggestion"
            r3.A0M(r0)
        L_0x018e:
            X.3Ki r0 = r2.A0G
            r0.A00()
            return
        L_0x0194:
            android.view.View$OnClickListener r0 = r3.A0H
            r0.onClick(r4)
            if (r1 == 0) goto L_0x0010
            goto L_0x018e
        L_0x019c:
            java.lang.Object r2 = r1.A00
            com.whatsapp.glasses.SUPBottomSheetView r2 = (com.whatsapp.glasses.SUPBottomSheetView) r2
            X.1qR r0 = r2.A01
            if (r0 == 0) goto L_0x01b3
            com.whatsapp.wds.components.button.WDSButton r1 = r0.A05
            if (r1 == 0) goto L_0x01b3
            r0 = 2131886082(0x7f120002, float:1.9406733E38)
            r1.setText(r0)
            r0 = 19
            A00(r1, r2, r0)
        L_0x01b3:
            X.1qR r3 = r2.A01
            if (r3 == 0) goto L_0x0010
            android.view.animation.AlphaAnimation r2 = X.C36371kC.A0L()
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r1 = 1
            X.4Wm r0 = new X.4Wm
            r0.<init>(r3, r1)
            r2.setAnimationListener(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A03
            r0.startAnimation(r2)
            return
        L_0x01cf:
            java.lang.Object r0 = r1.A00
            com.whatsapp.greenalert.GreenAlertActivity r0 = (com.whatsapp.greenalert.GreenAlertActivity) r0
            com.whatsapp.WaViewPager r1 = r0.A02
            java.lang.Integer r0 = X.C36361kB.A0i()
            android.view.View r2 = r1.findViewWithTag(r0)
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            int r0 = r2.getChildCount()
            if (r0 == 0) goto L_0x0010
            int r0 = r0 + -1
            android.view.View r1 = r2.getChildAt(r0)
            int r0 = r1.getScrollY()
            int r1 = X.C36431kI.A04(r1, r0)
            int r0 = r2.getPaddingBottom()
            int r1 = r1 + r0
            r2.A0F(r1)
            return
        L_0x01fc:
            java.lang.Object r3 = r1.A00
            com.whatsapp.group.GroupAdminPickerActivity r3 = (com.whatsapp.group.GroupAdminPickerActivity) r3
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0010
            java.lang.Object r8 = r4.getTag()
            com.whatsapp.jid.Jid r8 = (com.whatsapp.jid.Jid) r8
            java.lang.String r0 = r3.A0L
            if (r0 == 0) goto L_0x0664
            java.lang.String r0 = r3.A0J
            if (r0 == 0) goto L_0x0664
            X.14u r7 = X.C36381kD.A0S(r3)
            java.lang.String r2 = r3.A0K
            X.147 r6 = r3.A0H
            java.lang.String r5 = r3.A0L
            java.lang.String r4 = r3.A0J
            java.lang.String r1 = "message"
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.C36321k7.A18(r8, r6, r5, r4)
            com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment r3 = new com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment
            r3.<init>()
            android.os.Bundle r2 = X.C36431kI.A0I(r1, r2)
            java.lang.String r1 = r8.getRawString()
            java.lang.String r0 = "admin_jid"
            r2.putString(r0, r1)
            java.lang.String r1 = r6.getRawString()
            java.lang.String r0 = "group_jid"
            r2.putString(r0, r1)
            java.lang.String r0 = "raw_parent_jid"
            r2.putString(r0, r4)
            java.lang.String r0 = "group_subject"
            r2.putString(r0, r5)
            r3.A17(r2)
            java.lang.String r0 = "join_request_reason"
            r7.Btl(r3, r0)
            return
        L_0x0259:
            java.lang.Object r2 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.2Sc r1 = r2.A1A
            r0 = 1
            if (r1 == 0) goto L_0x0268
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A03 = r0
        L_0x0268:
            boolean r0 = X.AnonymousClass22g.A0q(r2)
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.AnonymousClass22g.A0r(r2)
            if (r0 != 0) goto L_0x0010
            X.1EL r1 = r2.A0N
            X.141 r0 = r2.A0y
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x0010
            boolean r0 = X.AnonymousClass22g.A0p(r2)
            if (r0 != 0) goto L_0x0675
            X.141 r0 = r2.A0y
            boolean r0 = r0.A13
            if (r0 == 0) goto L_0x0675
            r0 = 2131889563(0x7f120d9b, float:1.9413793E38)
            r2.BO5(r0)
            return
        L_0x0291:
            java.lang.Object r3 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.1Or r1 = r3.A1m
            X.141 r0 = r3.A0y
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0010
            X.3Cu r2 = r3.A1l
            r1 = 0
            X.147 r0 = r3.A3t()
            java.lang.String r0 = r0.getRawString()
            r2.A00(r1, r0)
            X.147 r2 = r3.A3t()
            android.content.Intent r4 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity"
            X.C36331k8.A0v(r4, r2, r1, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r4.addFlags(r0)
        L_0x02c3:
            r3.startActivity(r4)
            return
        L_0x02c7:
            java.lang.Object r1 = r1.A00
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            r1.requestFocus()
            r0 = 0
            r1.A0C(r0)
            int r0 = r1.getSelectionStart()
            if (r0 <= 0) goto L_0x02de
            int r0 = r1.getSelectionEnd()
            if (r0 > 0) goto L_0x0010
        L_0x02de:
            int r0 = X.C36381kD.A06(r1)
            r1.setSelection(r0)
            return
        L_0x02e6:
            java.lang.Object r3 = r1.A00
            com.whatsapp.group.ReportGroupPrivacyTipDialogFragment r3 = (com.whatsapp.group.ReportGroupPrivacyTipDialogFragment) r3
            r0 = 2
            r3.A00 = r0
            r3.A1b()
            X.01I r0 = r3.A0i()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r2 = "privacy_groupadd"
            android.content.Intent r1 = X.AnonymousClass190.A0D(r0)
            java.lang.String r0 = "target_setting"
            r1.putExtra(r0, r2)
            X.01I r0 = r3.A0h()
            if (r0 == 0) goto L_0x0010
            r0.startActivity(r1)
            return
        L_0x030d:
            java.lang.Object r4 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r4 = (com.whatsapp.group.newgroup.NewGroup) r4
            com.whatsapp.WaEditText r0 = r4.A09
            java.lang.String r6 = X.C36361kB.A0n(r0)
            r0 = 1
            boolean r0 = com.whatsapp.group.newgroup.NewGroup.A0M(r4, r6, r0)
            if (r0 == 0) goto L_0x0010
            com.whatsapp.WaEditText r0 = r4.A08
            android.text.Editable r1 = r0.getText()
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x0329
            r1 = r0
        L_0x0329:
            java.lang.String r5 = X.C36411kG.A0z(r1)
            boolean r0 = X.C36431kI.A1R(r4)
            if (r0 != 0) goto L_0x068b
            java.lang.String r0 = "newgroup/no network access, fail to suggest group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131891264(0x7f121440, float:1.9417243E38)
            java.lang.String r0 = r4.getString(r0)
            X.1qm r3 = X.C39001qm.A01(r4, r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 13
            X.C39001qm.A06(r4, r3, r0, r1)
            goto L_0x06dc
        L_0x034d:
            java.lang.Object r13 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r13 = (com.whatsapp.group.newgroup.NewGroup) r13
            java.util.List r0 = r13.A0h
            java.util.ArrayList r8 = X.AnonymousClass141.A00(r0)
            com.whatsapp.WaEditText r0 = r13.A09
            java.lang.String r7 = X.C36361kB.A0n(r0)
            X.147 r1 = r13.A0W
            if (r1 == 0) goto L_0x038d
            X.1LV r0 = r13.A0A
            boolean r0 = r0.A0J(r1)
            if (r0 != 0) goto L_0x038d
            X.0yC r1 = r13.A0D
            r0 = 4184(0x1058, float:5.863E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 2131890868(0x7f1212b4, float:1.941644E38)
            if (r1 == 0) goto L_0x0379
            r0 = 2131890869(0x7f1212b5, float:1.9416442E38)
        L_0x0379:
            java.lang.String r0 = r13.getString(r0)
            X.1qm r3 = X.C39001qm.A01(r13, r0)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 13
            X.3Uj r0 = new X.3Uj
            r0.<init>(r13, r1)
            goto L_0x06d9
        L_0x038d:
            r0 = 0
            boolean r0 = com.whatsapp.group.newgroup.NewGroup.A0M(r13, r7, r0)
            if (r0 == 0) goto L_0x0010
            boolean r0 = r13.A0i
            r4 = -1
            if (r0 == 0) goto L_0x03dd
            java.io.File r0 = com.whatsapp.group.newgroup.NewGroup.A07(r13)
            if (r0 == 0) goto L_0x03db
            android.net.Uri r6 = android.net.Uri.fromFile(r0)
        L_0x03a3:
            X.0xQ r0 = r13.A0T
            X.146 r1 = r0.A0P()
            android.content.Intent r5 = X.C36431kI.A0D()
            int r3 = r13.A00
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "key_raw_jid"
            X.C36401kF.A14(r2, r1, r0)
            java.lang.String r1 = "key_raw_photo_uri"
            if (r6 == 0) goto L_0x03d9
            java.lang.String r0 = r6.toString()
        L_0x03c0:
            r2.putString(r1, r0)
            java.lang.String r0 = "key_group_name"
            r2.putString(r0, r7)
            java.lang.String r0 = "key_ephemeral_duration"
            r2.putInt(r0, r3)
            java.lang.String r0 = "group_created"
            r5.putExtra(r0, r2)
            r13.setResult(r4, r5)
        L_0x03d5:
            r13.finish()
            return
        L_0x03d9:
            r0 = 0
            goto L_0x03c0
        L_0x03db:
            r6 = 0
            goto L_0x03a3
        L_0x03dd:
            X.0xQ r0 = r13.A0T
            X.146 r6 = r0.A0P()
            X.0xQ r2 = r13.A0T
            r1 = 1
            r0 = 0
            r2.A0Y(r6, r8, r1, r0)
            boolean r0 = X.C36431kI.A1R(r13)
            if (r0 == 0) goto L_0x0431
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "newgroup/go create group:"
            X.C36321k7.A1K(r6, r0, r1)
            r0 = 2131888542(0x7f12099e, float:1.9411722E38)
            r13.Bu1(r0)
            r17 = 16
            X.74y r12 = new X.74y
            r14 = r6
            r15 = r8
            r16 = r7
            r12.<init>(r13, r14, r15, r16, r17)
            X.00I r0 = X.C36441kJ.A0W(r6, r12)
            r13.A06 = r0
            X.0xM r1 = r13.A0K
            X.19x r5 = r13.A0b
            long r11 = X.C36431kI.A08(r13)
            r9 = 2
            int r10 = r13.A00
            X.8nz r0 = r5.A05(r6, r7, r8, r9, r10, r11)
            r1.A0h(r0)
            X.17Y r3 = r13.A05
            r0 = 12
            X.3v6 r2 = new X.3v6
            r2.<init>(r13, r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.A0I(r2, r0)
            return
        L_0x0431:
            java.lang.String r0 = "newgroup/no network access, fail to create group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xM r1 = r13.A0K
            X.19x r5 = r13.A0b
            long r11 = X.C36431kI.A08(r13)
            r9 = 3
            int r10 = r13.A00
            X.8nz r0 = r5.A05(r6, r7, r8, r9, r10, r11)
            r1.A0h(r0)
            java.io.File r0 = com.whatsapp.group.newgroup.NewGroup.A07(r13)
            if (r0 == 0) goto L_0x046e
            X.1P3 r1 = r13.A0a     // Catch:{ IOException -> 0x0468 }
            byte[] r0 = X.AnonymousClass6YY.A0V(r0)     // Catch:{ IOException -> 0x0468 }
            X.35J r5 = r1.A0C(r0)     // Catch:{ IOException -> 0x0468 }
            X.16D r0 = r13.A0B     // Catch:{ IOException -> 0x0468 }
            X.141 r3 = r0.A0D(r6)     // Catch:{ IOException -> 0x0468 }
            X.1O7 r2 = r13.A0E     // Catch:{ IOException -> 0x0468 }
            byte[] r1 = r5.A00     // Catch:{ IOException -> 0x0468 }
            byte[] r0 = r5.A01     // Catch:{ IOException -> 0x0468 }
            r2.A01(r3, r1, r0)     // Catch:{ IOException -> 0x0468 }
            goto L_0x046e
        L_0x0468:
            r1 = move-exception
            java.lang.String r0 = "newgroup/failed to update photo"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x046e:
            r13.setResult(r4)
            goto L_0x03d5
        L_0x0473:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x047b:
            java.lang.Object r0 = r1.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01I r0 = r0.A0i()
            r0.finish()
            return
        L_0x0487:
            java.lang.Object r4 = r1.A00
            com.whatsapp.fmx.FMXGroupSafetyTipsBottomSheetFragment r4 = (com.whatsapp.fmx.FMXGroupSafetyTipsBottomSheetFragment) r4
            X.3Gy r3 = r4.A01
            if (r3 == 0) goto L_0x04bd
            r2 = 0
            r1 = 8
            r0 = 1
            r3.A01(r2, r2, r1, r0)
            X.0xT r1 = r4.A02
            if (r1 == 0) goto L_0x04b6
            java.lang.String r0 = "1313491802751163"
            android.content.Intent r3 = X.C36341k9.A0D(r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)
            X.1Dv r1 = r4.A00
            if (r1 == 0) goto L_0x04af
            android.content.Context r0 = r4.A0a()
            goto L_0x0651
        L_0x04af:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04b6:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04bd:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04c4:
            java.lang.Object r3 = r1.A00
            android.view.View r3 = (android.view.View) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            android.content.Context r0 = r3.getContext()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.framework.alerts.ui.AlertCardListActivity"
            r2.setClassName(r1, r0)
            X.C36371kC.A16(r2, r3)
            return
        L_0x04e1:
            java.lang.Object r4 = r1.A00
            com.whatsapp.gallery.GalleryTabHostFragment r4 = (com.whatsapp.gallery.GalleryTabHostFragment) r4
            X.66x r3 = r4.A0F
            if (r3 == 0) goto L_0x0501
            java.lang.Integer r2 = X.C36421kH.A0V()
            r1 = 1
            r0 = 16
            r3.A02(r2, r1, r0)
            X.00T r0 = r4.A0O
            java.lang.Object r0 = r0.getValue()
            X.1w8 r0 = (X.C40801w8) r0
            java.util.List r0 = r0.A02
            r4.A1Z(r0)
            return
        L_0x0501:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0508:
            java.lang.Object r3 = r1.A00
            com.whatsapp.gallery.NewMediaPickerFragment r3 = (com.whatsapp.gallery.NewMediaPickerFragment) r3
            X.66x r2 = r3.A0D
            if (r2 == 0) goto L_0x0534
            java.lang.Integer r1 = X.C36421kH.A0V()
            r0 = 1
            r2.A02(r1, r0, r0)
            java.util.Set r0 = r3.A05
            java.util.ArrayList r2 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0522:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x052c
            X.C36381kD.A1P(r2, r1)
            goto L_0x0522
        L_0x052c:
            java.util.Set r0 = X.C007103b.A0f(r2)
            r3.A1o(r0)
            return
        L_0x0534:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x053b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.gifsearch.GifSearchContainer r0 = (com.whatsapp.gifsearch.GifSearchContainer) r0
            com.whatsapp.gifsearch.GifSearchContainer.setupSearchContainer$lambda$4$lambda$2(r0, r4)
            return
        L_0x0543:
            java.lang.Object r0 = r1.A00
            X.9nR r0 = (X.C203169nR) r0
            r0.A06()
            return
        L_0x054b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.greenalert.GreenAlertActivity r0 = (com.whatsapp.greenalert.GreenAlertActivity) r0
            com.whatsapp.greenalert.GreenAlertActivity.A01(r0)
            return
        L_0x0553:
            java.lang.Object r0 = r1.A00
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            X.C36421kH.A16(r0)
            return
        L_0x055b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.GroupAdminPickerActivity r0 = (com.whatsapp.group.GroupAdminPickerActivity) r0
            com.whatsapp.group.GroupAdminPickerActivity.A07(r0)
            return
        L_0x0563:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.GroupChangedParticipantsBottomSheet r0 = (com.whatsapp.group.GroupChangedParticipantsBottomSheet) r0
            com.whatsapp.group.GroupChangedParticipantsBottomSheet.A03(r0)
            return
        L_0x056b:
            r1 = 2131889263(0x7f120c6f, float:1.9413185E38)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r1, r0)
            r0.show()
            return
        L_0x0577:
            java.lang.Object r0 = r1.A00
            X.2Dr r0 = (X.AnonymousClass2Dr) r0
            X.3Gl r0 = r0.A0C
            r0.A00()
            return
        L_0x0581:
            java.lang.Object r1 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            r0 = 0
            com.whatsapp.group.GroupChatInfoActivity.A1D(r1, r0)
            return
        L_0x058a:
            java.lang.Object r6 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r6 = (com.whatsapp.group.GroupChatInfoActivity) r6
            X.147 r5 = r6.A3t()
            long r3 = r6.A00
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity"
            X.C36331k8.A0v(r2, r5, r1, r0)
            java.lang.String r0 = "keptMessageCount"
            r2.putExtra(r0, r3)
            r6.startActivity(r2)
            return
        L_0x05aa:
            java.lang.Object r0 = r1.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x05b2:
            java.lang.Object r0 = r1.A00
            X.2iT r0 = (X.C49042iT) r0
            com.whatsapp.group.GroupMembersSelector r1 = r0.A00
            r0 = 1
            com.whatsapp.group.GroupMembersSelector.A0x(r1, r0)
            return
        L_0x05bd:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.HistorySettingActivity r0 = (com.whatsapp.group.HistorySettingActivity) r0
            X.00T r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.group.HistorySettingViewModel r3 = (com.whatsapp.group.HistorySettingViewModel) r3
            X.040 r2 = X.C109325Xd.A00(r3)
            r1 = 0
            com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1 r0 = new com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1
            r0.<init>(r3, r1)
            X.C36331k8.A1T(r0, r2)
            return
        L_0x05d7:
            java.lang.Object r0 = r1.A00
            X.3Ji r0 = (X.C63253Ji) r0
            X.02t r1 = r0.A02
            X.141 r0 = r0.A01
            r1.invoke(r0)
            return
        L_0x05e3:
            java.lang.Object r3 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r3 = (com.whatsapp.group.newgroup.NewGroup) r3
            X.141 r2 = r3.A0s
            com.whatsapp.WaEditText r0 = r3.A09
            java.lang.String r0 = X.C36361kB.A0n(r0)
            r2.A0P = r0
            X.1P3 r1 = r3.A0a
            r0 = 12
            r1.A07(r3, r2, r0)
            return
        L_0x05f9:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r0 = (com.whatsapp.group.newgroup.NewGroup) r0
            com.whatsapp.WaEditText r0 = r0.A08
            r0.requestFocus()
            return
        L_0x0603:
            java.lang.Object r0 = r1.A00
            X.C36431kI.A1N(r0)
            return
        L_0x0609:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.view.custom.GroupDetailsCard r0 = (com.whatsapp.group.view.custom.GroupDetailsCard) r0
            com.whatsapp.group.view.custom.GroupDetailsCard.setupClickListeners$lambda$2(r0, r4)
            return
        L_0x0611:
            X.1X7 r9 = r2.A07
            X.17Y r6 = r2.A02
            X.0wN r4 = r2.A01
            X.0wU r11 = r2.A0G
            X.1TA r7 = r2.A06
            X.01I r5 = r2.A0h()
            X.14u r5 = (X.C225314u) r5
            X.2by r8 = r3.A00
            X.1Dv r3 = r2.A00
            X.13J r10 = r2.A08
            X.C25561Gu.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x062b:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0632:
            java.lang.String r0 = r5.A01
            android.content.Intent r3 = X.C36331k8.A04(r0)
            android.content.Context r0 = r2.A1D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.android.browser.application_id"
            r3.putExtra(r0, r1)
            r1 = 1
            java.lang.String r0 = "create_new_tab"
            r3.putExtra(r0, r1)
            X.1Dv r1 = r2.A00
            android.content.Context r0 = r2.A1D()
        L_0x0651:
            r1.A06(r0, r3)
            return
        L_0x0655:
            X.4Uw r1 = X.C36381kD.A0Y(r2)
            X.3T1 r0 = r5.A00
        L_0x065b:
            r1.Bvv(r0)
            X.1wQ r0 = r2.A0A
            r0.A06()
            return
        L_0x0664:
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r8.getRawString()
            java.lang.String r0 = "contact"
            r2.putExtra(r0, r1)
            X.C36331k8.A0o(r3, r2)
            return
        L_0x0675:
            r0 = 7
            X.AnonymousClass3SJ.A01(r2, r0)
            X.12t r1 = r2.A0t
            X.147 r0 = r2.A1Y
            r1.A06(r0)
            return
        L_0x0681:
            java.lang.Object r0 = r1.A00
            X.3HU r0 = (X.AnonymousClass3HU) r0
            X.00S r0 = r0.A00
        L_0x0687:
            r0.invoke()
            return
        L_0x068b:
            java.lang.String r0 = "newgroup/go suggest group:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r3 = X.C36431kI.A0D()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "extra_group_name"
            r2.putString(r0, r6)
            X.147 r0 = r4.A0W
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "extra_parent_group_jid"
            r2.putString(r0, r1)
            java.lang.String r0 = "extra_group_description"
            r2.putString(r0, r5)
            X.0yC r1 = r4.A0D
            r0 = 7180(0x1c0c, float:1.0061E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x06be
            android.os.Bundle r1 = r4.A03
            java.lang.String r0 = "extra_group_settings_bundle"
            r2.putBundle(r0, r1)
        L_0x06be:
            java.lang.String r0 = "group_suggested"
            r3.putExtra(r0, r2)
            X.C36331k8.A0o(r4, r3)
            return
        L_0x06c7:
            java.lang.Object r13 = r1.A00
            X.014 r13 = (X.AnonymousClass014) r13
            X.1qm r3 = X.AnonymousClass3LW.A00(r13)
            r0 = 2131894732(0x7f1221cc, float:1.9424277E38)
            X.C39001qm.A02(r13, r3, r0)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 0
        L_0x06d9:
            r3.A0m(r13, r0, r2)
        L_0x06dc:
            r3.A0b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y2.onClick(android.view.View):void");
    }
}
