package X;

import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.community.NewCommunityActivity;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.inappsupport.ui.SupportAiViewModel;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.util.Log;

/* renamed from: X.4YE  reason: invalid class name */
public class AnonymousClass4YE implements C24521Ct {
    public Object A00;
    public final int A01;

    public AnonymousClass4YE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BUf(AnonymousClass11F r5) {
        AnonymousClass17Y r2;
        Runnable runnable;
        switch (this.A01) {
            case 7:
                C36321k7.A1K(r5, "joinSubgroup/onConversationAdded/", AnonymousClass000.A0u());
                if (r5 instanceof AnonymousClass147) {
                    C40041ue r22 = (C40041ue) this.A00;
                    int A07 = C36341k9.A07(r22.A0d);
                    if (A07 == 2 || A07 == 6) {
                        C36341k9.A17(r22.A0d, 4);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                Log.i("newgroup/onConversationAdded");
                NewGroup newGroup = (NewGroup) this.A00;
                AnonymousClass00I r0 = newGroup.A06;
                if (r0 != null && r0.A00.equals(r5)) {
                    Log.i("newgroup/onConversationAdded/processing runAfterTempConversationAddedToDb");
                    C36411kG.A1O(newGroup.A06.A01);
                    newGroup.A06 = null;
                    return;
                }
                return;
            case 14:
                AnonymousClass00C.A0D(r5, 0);
                SupportAiViewModel supportAiViewModel = (SupportAiViewModel) this.A00;
                if (r5.equals(supportAiViewModel.A00)) {
                    r2 = supportAiViewModel.A04;
                    runnable = new C80293vA(supportAiViewModel, this, 19);
                    break;
                } else {
                    return;
                }
            case 15:
                AnonymousClass3SE r1 = (AnonymousClass3SE) this.A00;
                if (r5.equals(r1.A01)) {
                    r2 = r1.A05;
                    runnable = new C80253v6(this, 33);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r2.A0H(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r1 = (com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel) r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BUg(X.AnonymousClass11F r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x002c;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x004b;
                case 10: goto L_0x0068;
                case 11: goto L_0x0005;
                case 12: goto L_0x007e;
                case 13: goto L_0x0095;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x00b5;
                case 17: goto L_0x00da;
                case 18: goto L_0x00ef;
                case 19: goto L_0x010a;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "acceptlink/onConversationChanged/"
            X.C36321k7.A1K(r6, r0, r1)
            java.lang.Object r2 = r5.A00
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r2 = (com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity) r2
            java.util.concurrent.atomic.AtomicReference r0 = r2.A0N
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0005
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x0005
            X.17Y r4 = r2.A05
            r0 = 32
            X.74N r3 = new X.74N
            r3.<init>(r5, r1, r0)
            goto L_0x0106
        L_0x002c:
            java.lang.Object r1 = r5.A00
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            X.141 r0 = r1.A0z
            if (r0 == 0) goto L_0x0005
            if (r6 == 0) goto L_0x0005
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.17Y r4 = r1.A05
            r0 = 16
            X.3wp r3 = new X.3wp
            r3.<init>((java.lang.Object) r5, (int) r0)
            goto L_0x0106
        L_0x004b:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.lang.Object r1 = r5.A00
            com.whatsapp.community.communityInfo.CAGInfoViewModel r1 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r1
            X.147 r0 = r1.A03
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = "cagJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x005e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0005
            com.whatsapp.community.communityInfo.CAGInfoViewModel.A01(r1)
            return
        L_0x0068:
            if (r6 == 0) goto L_0x0005
            java.lang.Object r1 = r5.A00
            com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel r1 = (com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel) r1
            X.147 r0 = r1.A01
            if (r0 == 0) goto L_0x0005
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.08S r0 = r1.A02
            X.C36331k8.A13(r0)
            return
        L_0x007e:
            if (r6 == 0) goto L_0x0005
            java.lang.Object r1 = r5.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            X.147 r0 = r1.A1Y
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.17Y r4 = r1.A05
            r0 = 48
            X.3v5 r3 = X.C80243v5.A00(r5, r0)
            goto L_0x0106
        L_0x0095:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "newgroup/onConversationChanged/"
            X.C36321k7.A1K(r6, r0, r1)
            java.lang.Object r1 = r5.A00
            com.whatsapp.group.newgroup.NewGroup r1 = (com.whatsapp.group.newgroup.NewGroup) r1
            java.util.concurrent.atomic.AtomicReference r0 = r1.A0t
            java.lang.Object r2 = r0.get()
            if (r2 == 0) goto L_0x0005
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x0005
            X.17Y r4 = r1.A05
            r0 = 8
            goto L_0x00d4
        L_0x00b5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ViewGroupInviteActivity/onConversationChanged/"
            X.C36321k7.A1K(r6, r0, r1)
            java.lang.Object r1 = r5.A00
            com.whatsapp.invites.ViewGroupInviteActivity r1 = (com.whatsapp.invites.ViewGroupInviteActivity) r1
            java.util.concurrent.atomic.AtomicReference r0 = r1.A0S
            java.lang.Object r2 = r0.get()
            if (r2 == 0) goto L_0x0005
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x0005
            X.17Y r4 = r1.A05
            r0 = 25
        L_0x00d4:
            X.3vA r3 = new X.3vA
            r3.<init>(r5, r2, r0)
            goto L_0x0106
        L_0x00da:
            boolean r0 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0005
            java.lang.Object r3 = r5.A00
            X.3d2 r3 = (X.C69133d2) r3
            X.0wU r2 = r3.A08
            r1 = 23
            X.74j r0 = new X.74j
            r0.<init>(r3, r6, r1)
            r2.Boy(r0)
            return
        L_0x00ef:
            java.lang.Object r1 = r5.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.1Uw r0 = r1.A3v()
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 == 0) goto L_0x0005
            X.17Y r4 = r1.A05
            r0 = 43
            X.72n r3 = new X.72n
            r3.<init>(r1, r0)
        L_0x0106:
            r4.A0H(r3)
            return
        L_0x010a:
            java.lang.Object r0 = r5.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            X.17Y r1 = r0.A0N
            r0 = 45
            X.3vC r0 = X.C80313vC.A00(r5, r6, r0)
            r1.Bp3(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YE.BUg(X.11F):void");
    }

    public /* synthetic */ void BUh(AnonymousClass11F r1, boolean z) {
    }

    public /* synthetic */ void BUi(AnonymousClass11F r2) {
        if (20 - this.A01 == 0) {
            ((C65813To) this.A00).A06(r2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BUj(X.AnonymousClass11F r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 1: goto L_0x0006;
                case 2: goto L_0x0012;
                case 3: goto L_0x0029;
                case 4: goto L_0x0040;
                case 5: goto L_0x0005;
                case 6: goto L_0x00f4;
                case 7: goto L_0x0075;
                case 8: goto L_0x0005;
                case 9: goto L_0x008d;
                case 10: goto L_0x0005;
                case 11: goto L_0x0105;
                case 12: goto L_0x00ac;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x00ca;
                case 19: goto L_0x0119;
                case 20: goto L_0x0123;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r4.A00
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            X.141 r0 = r1.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            goto L_0x00b2
        L_0x0012:
            java.lang.Object r1 = r4.A00
            com.whatsapp.community.CommunityHomeActivity r1 = (com.whatsapp.community.CommunityHomeActivity) r1
            X.147 r0 = r1.A0l
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 2131888077(0x7f1207cd, float:1.941078E38)
            java.lang.String r0 = r1.getString(r0)
            com.whatsapp.community.CommunityHomeActivity.A07(r1, r0)
            return
        L_0x0029:
            java.lang.Object r1 = r4.A00
            com.whatsapp.community.CommunityNavigationActivity r1 = (com.whatsapp.community.CommunityNavigationActivity) r1
            X.147 r0 = r1.A0c
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 2131888077(0x7f1207cd, float:1.941078E38)
            java.lang.String r0 = r1.getString(r0)
            com.whatsapp.community.CommunityNavigationActivity.A01(r1, r0)
            return
        L_0x0040:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r1 = r4.A00
            com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet r1 = (com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet) r1
            X.00T r0 = r1.A0M
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 2131888077(0x7f1207cd, float:1.941078E38)
            java.lang.String r2 = X.C36421kH.A0a(r1, r0)
            r1.A1b()
            X.01I r1 = r1.A0h()
            boolean r0 = r1 instanceof X.C87124No
            if (r0 == 0) goto L_0x0005
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet.Host"
            X.AnonymousClass00C.A0E(r1, r0)
            X.4No r1 = (X.C87124No) r1
            com.whatsapp.Conversation r1 = (com.whatsapp.Conversation) r1
            X.3fk r0 = r1.A03
            r0.A2V(r2)
            return
        L_0x0075:
            boolean r0 = r5 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x0005
            java.lang.Object r2 = r4.A00
            X.1ue r2 = (X.C40041ue) r2
            X.1hi r0 = r2.A0d
            int r1 = X.C36341k9.A07(r0)
            r0 = 4
            if (r1 != r0) goto L_0x0005
            r1 = 2
            X.1hi r0 = r2.A0d
            X.C36341k9.A17(r0, r1)
            return
        L_0x008d:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r1 = r4.A00
            com.whatsapp.community.communityInfo.CAGInfoViewModel r1 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r1
            X.147 r0 = r1.A03
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = "cagJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a0:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.1Rs r0 = r1.A0L
            X.C36331k8.A13(r0)
            return
        L_0x00ac:
            java.lang.Object r1 = r4.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            X.147 r0 = r1.A1Y
        L_0x00b2:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r1.A0E
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0005
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Intent r0 = X.C36371kC.A0C(r0)
            r1.startActivity(r0)
            return
        L_0x00ca:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r1 = r4.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.1Uw r0 = r1.A3v()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r1.A0E
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0005
            r1.A3u()
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Intent r0 = X.C36371kC.A0C(r0)
            X.AnonymousClass00C.A08(r0)
            r1.startActivity(r0)
            return
        L_0x00f4:
            java.lang.Object r0 = r4.A00
            X.1ub r0 = (X.C40021ub) r0
            X.17Y r2 = r0.A01
            r1 = 12
            X.3v7 r0 = new X.3v7
            r0.<init>(r4, r5, r1)
            r2.Bp3(r0)
            return
        L_0x0105:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r3 = r4.A00
            X.3BL r3 = (X.AnonymousClass3BL) r3
            X.040 r2 = r3.A0F
            r1 = 0
            com.whatsapp.community.subgroup.CommunitySubgroupsObserver$conversationObserver$1$onConversationDeleted$1 r0 = new com.whatsapp.community.subgroup.CommunitySubgroupsObserver$conversationObserver$1$onConversationDeleted$1
            r0.<init>(r3, r5, r1)
            X.C36331k8.A1T(r0, r2)
            return
        L_0x0119:
            java.lang.Object r0 = r4.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchViewModel r0 = r0.A1d
            r0.A0d()
            return
        L_0x0123:
            java.lang.Object r0 = r4.A00
            X.3To r0 = (X.C65813To) r0
            r0.A06(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YE.BUj(X.11F):void");
    }

    public /* synthetic */ void BUm(int i) {
        if (5 - this.A01 == 0) {
            C65253Ri.A00((C65253Ri) this.A00);
        }
    }

    public void BUn() {
        AnonymousClass17Y r4;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A00;
                Object obj = acceptInviteLinkActivity.A0N.get();
                C36321k7.A1K(obj, "acceptlink/onConversationsListChanged ", AnonymousClass000.A0u());
                if (obj != null) {
                    r4 = acceptInviteLinkActivity.A05;
                    runnable = new AnonymousClass74N(this, obj, 33);
                    break;
                } else {
                    return;
                }
            case 8:
                Log.i("NewCommunityActivity/onConversationsListChanged/");
                NewCommunityActivity newCommunityActivity = (NewCommunityActivity) this.A00;
                Object obj2 = newCommunityActivity.A0P.get();
                if (obj2 != null) {
                    r4 = newCommunityActivity.A05;
                    runnable = new C80263v7(this, obj2, 18);
                    break;
                } else {
                    return;
                }
            case 13:
                Log.i("newgroup/onConversationsListChanged");
                NewGroup newGroup = (NewGroup) this.A00;
                Object obj3 = newGroup.A0t.get();
                if (obj3 != null) {
                    r4 = newGroup.A05;
                    runnable = new C80293vA(newGroup, obj3, 7);
                    break;
                } else {
                    return;
                }
            case 16:
                Log.i("ViewGroupInviteActivity/onConversationsListChanged");
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A00;
                Object obj4 = viewGroupInviteActivity.A0S.get();
                if (obj4 != null) {
                    r4 = viewGroupInviteActivity.A05;
                    runnable = new C80293vA(this, obj4, 26);
                    break;
                } else {
                    return;
                }
            case 19:
                ((SearchFragment) this.A00).A0N.Bp3(new C81163wZ((Object) this, 3));
                return;
            default:
                return;
        }
        r4.A0H(runnable);
    }
}
