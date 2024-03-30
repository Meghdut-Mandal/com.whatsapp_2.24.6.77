package X;

import android.view.View;

/* renamed from: X.3Xz  reason: invalid class name and case insensitive filesystem */
public class C66963Xz implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C66963Xz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C66963Xz(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0364, code lost:
        r1.Bl7((java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0368, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03aa, code lost:
        X.C70803fk.A1M(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0435, code lost:
        r2.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0438, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x043f, code lost:
        r0.A02(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0442, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0475, code lost:
        r2.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0478, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f5, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A01
            r5 = r19
            switch(r0) {
                case 0: goto L_0x01fb;
                case 1: goto L_0x0009;
                case 2: goto L_0x0009;
                case 3: goto L_0x03e6;
                case 4: goto L_0x0229;
                case 5: goto L_0x03e6;
                case 6: goto L_0x023d;
                case 7: goto L_0x000f;
                case 8: goto L_0x0250;
                case 9: goto L_0x0258;
                case 10: goto L_0x0260;
                case 11: goto L_0x0279;
                case 12: goto L_0x0281;
                case 13: goto L_0x02a0;
                case 14: goto L_0x02bc;
                case 15: goto L_0x02c4;
                case 16: goto L_0x0044;
                case 17: goto L_0x02ec;
                case 18: goto L_0x02f5;
                case 19: goto L_0x0312;
                case 20: goto L_0x0322;
                case 21: goto L_0x032e;
                case 22: goto L_0x0338;
                case 23: goto L_0x00c0;
                case 24: goto L_0x0349;
                case 25: goto L_0x0103;
                case 26: goto L_0x0397;
                case 27: goto L_0x03a1;
                case 28: goto L_0x03ae;
                case 29: goto L_0x03b6;
                case 30: goto L_0x03d1;
                case 31: goto L_0x0009;
                case 32: goto L_0x03d9;
                case 33: goto L_0x03d9;
                case 34: goto L_0x03e6;
                case 35: goto L_0x01c3;
                case 36: goto L_0x03ec;
                case 37: goto L_0x03ec;
                case 38: goto L_0x03f6;
                case 39: goto L_0x03fe;
                case 40: goto L_0x0180;
                case 41: goto L_0x041f;
                case 42: goto L_0x0439;
                case 43: goto L_0x0196;
                case 44: goto L_0x0443;
                case 45: goto L_0x044b;
                case 46: goto L_0x0196;
                case 47: goto L_0x01b0;
                case 48: goto L_0x044b;
                case 49: goto L_0x0464;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.C36411kG.A1O(r0)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r2 = r1.A00
            X.2mh r2 = (X.C50822mh) r2
            X.147 r6 = r2.A06
            if (r6 == 0) goto L_0x001e
            X.0wU r1 = r2.A08
            r0 = 18
            X.C80283v9.A00(r1, r2, r6, r0)
        L_0x001e:
            android.content.Context r0 = r2.A01
            android.app.Activity r4 = X.C24801Dv.A00(r0)
            boolean r0 = r4 instanceof X.AnonymousClass01L
            if (r0 == 0) goto L_0x000e
            X.01I r4 = (X.AnonymousClass01I) r4
            if (r4 == 0) goto L_0x000e
            X.01z r3 = r4.getSupportFragmentManager()
            X.AnonymousClass00C.A08(r3)
            X.147 r5 = r2.A05
            boolean r12 = r2.A09
            int r11 = r2.A00
            X.09w r7 = X.C023409w.A00
            r10 = 1
            X.4IB r8 = X.AnonymousClass4IB.A00
            X.4ND r9 = X.AnonymousClass4ND.A00
            X.C54422sv.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0044:
            java.lang.Object r3 = r1.A00
            X.3fk r3 = (X.C70803fk) r3
            com.whatsapp.conversation.ConversationListView r1 = r3.A2U
            r0 = 0
            r1.onWindowFocusChanged(r0)
            X.1nd r2 = X.C70803fk.A0D(r3)
            X.1uh r0 = r3.A2x
            java.util.ArrayList r0 = r0.A1D
            boolean r0 = X.C36411kG.A1a(r0)
            if (r0 == 0) goto L_0x000e
            java.util.Set r0 = r2.A0R
            r0.clear()
            com.whatsapp.conversation.ConversationListView r0 = r3.A2U
            int r1 = r0.getFirstVisiblePosition()
            X.3T1 r7 = r2.getItem(r1)
            if (r7 == 0) goto L_0x0079
            X.3Qa r0 = r7.A1J
            X.11F r0 = r0.A00
            if (r0 != 0) goto L_0x0079
            int r0 = r1 + 1
            X.3T1 r7 = r2.getItem(r0)
        L_0x0079:
            X.1uh r9 = r3.A2x
            r1 = 2131166146(0x7f0703c2, float:1.794653E38)
            X.4V6 r0 = r3.A2l
            android.content.res.Resources r0 = r0.getResources()
            int r13 = r0.getDimensionPixelSize(r1)
            int r14 = r2.A04()
            com.whatsapp.conversation.ConversationListView r0 = r3.A2U
            int r15 = r0.getFirstVisiblePosition()
            int r16 = r2.getCount()
            java.util.ArrayList r6 = r9.A1D
            boolean r0 = X.C36411kG.A1a(r6)
            if (r0 == 0) goto L_0x000e
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            if (r7 == 0) goto L_0x0479
            java.util.Iterator r8 = r6.iterator()
        L_0x00a8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0479
            X.3T1 r5 = X.C36391kE.A0l(r8)
            long r2 = r5.A1O
            long r0 = r7.A1O
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a8
            X.3Qa r0 = r5.A1J
            r12.add(r0)
            goto L_0x00a8
        L_0x00c0:
            java.lang.Object r4 = r1.A00
            X.3fk r4 = (X.C70803fk) r4
            X.3Nh r1 = r4.A5C
            r0 = 8
            X.C64263Nh.A00(r1, r0)
            com.whatsapp.conversation.ConversationListView r0 = r4.A2U
            int r3 = r0.getLastVisiblePosition()
            com.whatsapp.conversation.ConversationListView r0 = r4.A2U
            int r1 = r0.getCount()
            com.whatsapp.conversation.ConversationListView r0 = r4.A2U
            int r0 = r0.getFooterViewsCount()
            int r1 = r1 - r0
            int r0 = r1 + -1
            r2 = 2
            if (r3 < r0) goto L_0x00ee
            com.whatsapp.conversation.ConversationListView r0 = r4.A2U
            r0.setTranscriptMode(r2)
            com.whatsapp.conversation.ConversationListView r1 = r4.A2U
            r0 = 1
            r1.A0A(r0)
        L_0x00ee:
            X.C70803fk.A0p(r4)
            boolean r0 = X.C70803fk.A1e(r4)
            if (r0 == 0) goto L_0x000e
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0n
            if (r0 == 0) goto L_0x000e
            int r0 = r0.A0J
            if (r0 == r2) goto L_0x000e
            r4.A1n()
            return
        L_0x0103:
            java.lang.Object r5 = r1.A00
            X.3fk r5 = (X.C70803fk) r5
            X.3Nh r0 = r5.A5C
            r4 = 1
            X.C64263Nh.A00(r0, r4)
            X.1NG r1 = r5.A1z
            X.11F r0 = r5.A45
            boolean r0 = X.C36351kA.A1X(r1, r0)
            if (r0 == 0) goto L_0x011b
            X.AnonymousClass3SJ.A03(r5)
            return
        L_0x011b:
            X.C70803fk.A0p(r5)
            X.0yC r0 = r5.A3n
            r2 = 0
            boolean r0 = X.C36391kE.A1Y(r0)
            if (r0 == 0) goto L_0x049c
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r5.A3f
            if (r0 == 0) goto L_0x012e
            r0.A02()
        L_0x012e:
            X.28e r0 = r5.A2Q
            X.22r r3 = r0.A02
            if (r3 == 0) goto L_0x0486
            boolean r0 = r3.isShowing()
            if (r0 == 0) goto L_0x015c
            com.whatsapp.WaEditText r2 = r3.A04
            r3.A02 = r4
            r3.A09()
            r3.dismiss()
            X.4Oz r1 = r3.A04
            com.whatsapp.KeyboardPopupLayout r1 = (com.whatsapp.KeyboardPopupLayout) r1
            X.1qM r0 = r1.A02
            if (r0 == 0) goto L_0x0152
            r0 = 0
            r1.A02 = r0
            r1.requestLayout()
        L_0x0152:
            r1 = 0
            X.4a0 r0 = new X.4a0
            r0.<init>(r2, r4)
            X.C38871qM.A01(r0, r3, r2, r1)
            return
        L_0x015c:
            boolean r0 = X.C70803fk.A1e(r5)
            if (r0 == 0) goto L_0x0172
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r5.A3l
            if (r0 == 0) goto L_0x0172
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0172
            X.C70803fk.A1S(r5, r2)
            return
        L_0x0172:
            X.28e r3 = r5.A2Q
            X.22r r2 = r3.A02
            if (r2 == 0) goto L_0x000e
            X.11F r1 = r3.A0K
            com.whatsapp.community.ConversationCommunityViewModel r0 = r3.A0D
            r2.A0F(r0, r3, r1)
            return
        L_0x0180:
            java.lang.Object r0 = r1.A00
            X.4fA r0 = (X.C92934fA) r0
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r2 = r0.A04
            if (r2 == 0) goto L_0x000e
            X.1Rs r1 = r2.A0C
            r0 = 0
            X.C36341k9.A18(r1, r0)
            X.1Rs r1 = r2.A0B
            X.2nv r0 = X.C51502nv.DISMISS_BUTTON
            r1.A0D(r0)
            return
        L_0x0196:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.LockedConversationsFragment r1 = (com.whatsapp.conversationslist.LockedConversationsFragment) r1
            X.005 r0 = r1.A32
            r0.get()
            android.content.Context r2 = r1.A0a()
            X.04e r1 = r1.A03
            r0 = 2
            android.content.Intent r0 = X.C36381kD.A0D(r2, r0)
            if (r1 == 0) goto L_0x000e
            r1.A02(r0)
            return
        L_0x01b0:
            java.lang.Object r2 = r1.A00
            com.whatsapp.conversationslist.LockedConversationsFragment r2 = (com.whatsapp.conversationslist.LockedConversationsFragment) r2
            X.005 r0 = r2.A32
            X.18z r1 = X.C36411kG.A0a(r0)
            r0 = 0
            r1.A0I(r0)
            android.view.View r1 = r2.A00
            if (r1 != 0) goto L_0x01f5
            return
        L_0x01c3:
            java.lang.Object r3 = r1.A00
            X.2Kn r3 = (X.C43942Kn) r3
            X.1w7 r2 = r3.A05
            int r0 = r2.A00
            r2.A07(r0)
            int r0 = r3.A04()
            r2.A00 = r0
            android.widget.RadioButton r1 = r3.A00
            r0 = 1
            r1.setChecked(r0)
            X.34M r0 = r2.A01
            if (r0 == 0) goto L_0x000e
            r3.A04()
            android.view.View r2 = r0.A00
            r0 = 2131433767(0x7f0b1927, float:1.8489329E38)
            android.view.View r1 = X.C012005e.A02(r2, r0)
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131434554(0x7f0b1c3a, float:1.8490925E38)
            android.view.View r1 = X.C012005e.A02(r2, r0)
        L_0x01f5:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x01fb:
            java.lang.Object r0 = r1.A00
            X.3D7 r0 = (X.AnonymousClass3D7) r0
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00
            X.3Ry r0 = r0.A09
            X.4Pz r1 = r0.A04
            X.2Wy r1 = (X.AnonymousClass2Wy) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0221
            java.lang.Object r1 = r1.A00
            X.2IO r1 = (X.AnonymousClass2IO) r1
            X.2bU r0 = r1.getFMessage()
            boolean r0 = X.C54732tQ.A00(r0)
            if (r0 != 0) goto L_0x021d
            r1.A1f()
            return
        L_0x021d:
            X.1fX r0 = r1.A0B
            goto L_0x043f
        L_0x0221:
            java.lang.Object r0 = r1.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            r0.A1f()
            return
        L_0x0229:
            java.lang.Object r1 = r1.A00
            X.2Ka r1 = (X.C43842Ka) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r1.A0F
            r0 = 2
            r1.A0S(r0)
            X.0yb r0 = r1.A04
            X.AnonymousClass3T3.A04(r0)
            return
        L_0x023d:
            java.lang.Object r2 = r1.A00
            com.whatsapp.conversation.conversationrow.bottomsheets.GenericSystemInfoBottomSheet r2 = (com.whatsapp.conversation.conversationrow.bottomsheets.GenericSystemInfoBottomSheet) r2
            boolean r0 = r2 instanceof com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet
            if (r0 == 0) goto L_0x024c
            r1 = r2
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet r1 = (com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet) r1
            r0 = 1
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet.A03(r1, r0)
        L_0x024c:
            r2.A1c()
            return
        L_0x0250:
            java.lang.Object r0 = r1.A00
            X.244 r0 = (X.AnonymousClass244) r0
            X.AnonymousClass244.A06(r0)
            return
        L_0x0258:
            java.lang.Object r0 = r1.A00
            X.2g0 r0 = (X.AnonymousClass2g0) r0
            X.AnonymousClass2g0.setupReadMoreClickListener$lambda$1(r0, r5)
            return
        L_0x0260:
            java.lang.Object r1 = r1.A00
            X.01I r1 = (X.AnonymousClass01I) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.fmx.FMXGroupSafetyTipsBottomSheetFragment r2 = new com.whatsapp.fmx.FMXGroupSafetyTipsBottomSheetFragment
            r2.<init>()
            X.01z r1 = r1.getSupportFragmentManager()
            java.lang.String r0 = X.AnonymousClass000.A0k(r2)
            r2.A1f(r1, r0)
            return
        L_0x0279:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity r0 = (com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity) r0
            com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity.A01(r0)
            return
        L_0x0281:
            java.lang.Object r4 = r1.A00
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            X.C36391kE.A1T(r5)
            android.content.Context r2 = r5.getContext()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r2.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.reporttoadminreporterslist.ReportToAdminReportersActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "reporters_user_jid"
            r3.putParcelableArrayListExtra(r0, r4)
            goto L_0x0435
        L_0x02a0:
            java.lang.Object r3 = r1.A00
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            android.content.Context r2 = r5.getContext()
            android.content.Context r1 = r5.getContext()
            r0 = 22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.content.Intent r3 = X.C36431kI.A0E(r1, r3, r0)
            goto L_0x0475
        L_0x02bc:
            java.lang.Object r0 = r1.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x02c4:
            java.lang.Object r3 = r1.A00
            X.3fk r3 = (X.C70803fk) r3
            com.whatsapp.conversation.ConversationListView r1 = r3.A2U
            r0 = 0
            r1.onWindowFocusChanged(r0)
            java.util.Stack r1 = r3.A7D
            boolean r0 = r1.empty()
            if (r0 == 0) goto L_0x02dd
            com.whatsapp.conversation.ConversationListView r1 = r3.A2U
            r0 = 1
            r1.A0A(r0)
            return
        L_0x02dd:
            java.lang.Object r0 = r1.pop()
            X.36V r0 = (X.AnonymousClass36V) r0
            X.3T1 r2 = r0.A02
            int r1 = r0.A01
            r0 = 0
            r3.A2L(r2, r0, r1)
            return
        L_0x02ec:
            java.lang.Object r1 = r1.A00
            X.3fk r1 = (X.C70803fk) r1
            r0 = 0
            r1.A2Z(r0)
            return
        L_0x02f5:
            java.lang.Object r1 = r1.A00
            X.3fk r1 = (X.C70803fk) r1
            X.4V6 r4 = r1.A2l
            X.155 r0 = r4.getActivityNullable()
            X.11F r3 = r1.A45
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity"
            X.C36331k8.A0u(r2, r3, r1, r0)
            r4.startActivity(r2)
            return
        L_0x0312:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            X.1fs r2 = r0.A2O
            X.155 r1 = X.C70803fk.A0C(r0)
            java.lang.String r0 = "newsletter-geosuspend"
            r2.A01(r1, r0)
            return
        L_0x0322:
            java.lang.Object r1 = r1.A00
            X.3fk r1 = (X.C70803fk) r1
            X.3Ki r0 = r1.A4x
            r0.A00()
            X.4T8 r1 = r1.A74
            goto L_0x0364
        L_0x032e:
            java.lang.Object r1 = r1.A00
            X.3fk r1 = (X.C70803fk) r1
            X.9uZ r0 = r1.A2G
            X.C70803fk.A0c(r0, r1)
            return
        L_0x0338:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            X.0v0 r0 = r0.A35
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "newsletter_wait_list_subscription"
            X.C36331k8.A0w(r1, r0, r2)
            return
        L_0x0349:
            java.lang.Object r3 = r1.A00
            X.3fk r3 = (X.C70803fk) r3
            boolean r0 = r3.A6I
            if (r0 == 0) goto L_0x0369
            X.0yC r1 = r3.A3n
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0369
            X.4T8 r1 = r3.A74
            if (r1 == 0) goto L_0x0369
            X.3Ki r0 = r3.A4x
            r0.A00()
        L_0x0364:
            r0 = 0
            r1.Bl7(r0)
            return
        L_0x0369:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r3.A3l
            if (r0 != 0) goto L_0x0393
            boolean r0 = X.C70803fk.A1c(r3)
            if (r0 == 0) goto L_0x0383
            X.1rd r0 = r3.A3y
            if (r0 != 0) goto L_0x0383
            android.widget.ImageButton r2 = r3.A0b
            r1 = 25
            X.3wT r0 = new X.3wT
            r0.<init>((X.C70803fk) r3, (int) r1)
            r2.post(r0)
        L_0x0383:
            X.C70803fk.A0q(r3)
            android.widget.ImageButton r2 = r3.A0b
            r1 = 23
            X.3wT r0 = new X.3wT
            r0.<init>((X.C70803fk) r3, (int) r1)
            r2.post(r0)
            return
        L_0x0393:
            X.C70803fk.A0w(r3)
            return
        L_0x0397:
            java.lang.Object r0 = r1.A00
            X.4YO r0 = (X.AnonymousClass4YO) r0
            java.lang.Object r1 = r0.A00
            X.3fk r1 = (X.C70803fk) r1
            r0 = 1
            goto L_0x03aa
        L_0x03a1:
            java.lang.Object r0 = r1.A00
            X.4YO r0 = (X.AnonymousClass4YO) r0
            java.lang.Object r1 = r0.A00
            X.3fk r1 = (X.C70803fk) r1
            r0 = 0
        L_0x03aa:
            X.C70803fk.A1M(r1, r0)
            return
        L_0x03ae:
            java.lang.Object r0 = r1.A00
            X.1ny r0 = (X.C38181ny) r0
            r0.BKD()
            return
        L_0x03b6:
            java.lang.Object r4 = r1.A00
            X.3Qn r4 = (X.C65053Qn) r4
            X.141 r0 = r4.A00
            X.11F r3 = X.C36331k8.A0G(r0)
            X.1C6 r2 = r4.A08
            boolean r1 = r4.A01
            java.lang.Integer r0 = X.C36371kC.A0p()
            r2.A02(r3, r0, r1)
            java.lang.Runnable r0 = r4.A0A
            r0.run()
            return
        L_0x03d1:
            java.lang.Object r0 = r1.A00
            X.3Qn r0 = (X.C65053Qn) r0
            r0.A06()
            return
        L_0x03d9:
            java.lang.Object r2 = r1.A00
            X.2Kk r2 = (X.C43922Kk) r2
            r1 = 0
            r0 = 0
            r2.setResult(r0, r1)
            r2.finish()
            return
        L_0x03e6:
            java.lang.Object r0 = r1.A00
            X.C36431kI.A1N(r0)
            return
        L_0x03ec:
            java.lang.Object r0 = r1.A00
            com.whatsapp.components.WaSwitchView r0 = (com.whatsapp.components.WaSwitchView) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A02
            r0.toggle()
            return
        L_0x03f6:
            java.lang.Object r0 = r1.A00
            X.14u r0 = (X.C225314u) r0
            r0.onBackPressed()
            return
        L_0x03fe:
            java.lang.Object r4 = r1.A00
            X.02E r4 = (X.AnonymousClass02E) r4
            X.01I r0 = r4.A0i()
            java.lang.String r3 = "archived_chats"
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsChat"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "scroll_to_setting"
            r1.putExtra(r0, r3)
            r4.A1C(r1)
            return
        L_0x041f:
            java.lang.Object r2 = r1.A00
            com.whatsapp.conversationslist.InteropConversationsActivity r2 = (com.whatsapp.conversationslist.InteropConversationsActivity) r2
            X.00T r0 = r2.A03
            r0.getValue()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r2.getPackageName()
            java.lang.String r0 = "com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity"
            r3.setClassName(r1, r0)
        L_0x0435:
            r2.startActivity(r3)
            return
        L_0x0439:
            java.lang.Object r0 = r1.A00
            X.2LG r0 = (X.AnonymousClass2LG) r0
            X.1fX r0 = r0.A03
        L_0x043f:
            r0.A02(r5)
            return
        L_0x0443:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversationslist.LockedConversationsFragment r0 = (com.whatsapp.conversationslist.LockedConversationsFragment) r0
            com.whatsapp.conversationslist.LockedConversationsFragment.A03(r0)
            return
        L_0x044b:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            java.lang.String r0 = "https://faq.whatsapp.com/764072925284841"
            android.content.Intent r2 = X.C36331k8.A04(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.1Dv r1 = r3.A0X
            X.01I r0 = r3.A0i()
            r1.A06(r0, r2)
            return
        L_0x0464:
            java.lang.Object r2 = r1.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = "package:com.whatsapp"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "android.intent.action.DELETE"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0, r1)
        L_0x0475:
            r2.startActivity(r3)
            return
        L_0x0479:
            java.lang.Object r11 = X.C36441kJ.A12(r6)
            X.3T1 r11 = (X.AnonymousClass3T1) r11
            r17 = 1
            r10 = 0
            r9.A0X(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0486:
            boolean r0 = X.C70803fk.A1e(r5)
            if (r0 == 0) goto L_0x049c
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r5.A3l
            if (r0 == 0) goto L_0x049c
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x049c
            X.C70803fk.A1S(r5, r4)
            return
        L_0x049c:
            X.28e r2 = r5.A2Q
            android.widget.ImageButton r1 = r5.A0c
            r0 = 3
            r2.A0F(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66963Xz.onClick(android.view.View):void");
    }
}
