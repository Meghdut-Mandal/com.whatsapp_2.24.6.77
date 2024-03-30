package X;

import com.whatsapp.R;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.GroupJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4WC  reason: invalid class name */
public class AnonymousClass4WC extends C32021cp {
    public Object A00;
    public final int A01;

    public AnonymousClass4WC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        if (4 - this.A01 != 0) {
            super.A00();
            return;
        }
        Iterator A002 = AnonymousClass3BL.A00((AnonymousClass3BL) this.A00);
        while (A002.hasNext()) {
            C586530n r2 = (C586530n) A002.next();
            C81323wp.A00(r2.A00.A0t, r2, 46);
        }
    }

    public void A01(AnonymousClass11F r4) {
        if (2 - this.A01 != 0) {
            super.A01(r4);
        } else {
            ((C40021ub) this.A00).A0M.execute(new C81093wS((Object) this, 4));
        }
    }

    public void A02(GroupJid groupJid) {
        switch (this.A01) {
            case 2:
                ((C40021ub) this.A00).A0M.execute(new C80263v7(this, groupJid, 9));
                return;
            case 3:
                MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A00;
                if (AnonymousClass00C.A0J(groupJid, memberSuggestedGroupsManagementViewModel.A08)) {
                    MemberSuggestedGroupsManagementViewModel.A05(memberSuggestedGroupsManagementViewModel);
                    return;
                }
                return;
            case 4:
                AnonymousClass3BL r1 = (AnonymousClass3BL) this.A00;
                if (AnonymousClass00C.A0J(r1.A0D, groupJid)) {
                    Iterator A002 = AnonymousClass3BL.A00(r1);
                    while (A002.hasNext()) {
                        C40051uf r2 = ((C586530n) A002.next()).A00;
                        C81323wp.A00(r2.A0t, r2, 38);
                        C40051uf.A04(r2);
                    }
                    return;
                }
                return;
            case 5:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (groupJid.equals(groupChatInfoActivity.A1Z)) {
                    GroupChatInfoActivity.A16(groupChatInfoActivity);
                    GroupChatInfoActivity.A17(groupChatInfoActivity);
                    return;
                }
                return;
            default:
                super.A02(groupJid);
                return;
        }
    }

    public void A03(GroupJid groupJid) {
        if (4 - this.A01 != 0) {
            super.A03(groupJid);
            return;
        }
        AnonymousClass3BL r1 = (AnonymousClass3BL) this.A00;
        if (AnonymousClass00C.A0J(r1.A0D, groupJid)) {
            Iterator A002 = AnonymousClass3BL.A00(r1);
            while (A002.hasNext()) {
                C40051uf r2 = ((C586530n) A002.next()).A00;
                C81323wp.A00(r2.A0t, r2, 43);
            }
        }
    }

    public void A04(GroupJid groupJid, GroupJid groupJid2) {
        switch (this.A01) {
            case 4:
                AnonymousClass3BL r1 = (AnonymousClass3BL) this.A00;
                if (AnonymousClass00C.A0J(r1.A0D, groupJid)) {
                    Iterator A002 = AnonymousClass3BL.A00(r1);
                    while (A002.hasNext()) {
                        C40051uf r3 = ((C586530n) A002.next()).A00;
                        r3.A0t.execute(new C80263v7(r3, groupJid2, 7));
                    }
                    return;
                }
                return;
            case 5:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (groupJid.equals(groupChatInfoActivity.A1Z) && groupJid2.equals(groupChatInfoActivity.A1Y)) {
                    C03570Gk.A0B(groupChatInfoActivity, R.id.link_to_community_home_card).setVisibility(8);
                    groupChatInfoActivity.A20.A03(8);
                    return;
                }
                return;
            default:
                super.A04(groupJid, groupJid2);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(com.whatsapp.jid.GroupJid r8, java.util.List r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A05(r8, r9)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r3 = r7.A00
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            X.147 r0 = r3.A0l
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.147 r5 = r3.A0l
            goto L_0x0026
        L_0x0018:
            java.lang.Object r3 = r7.A00
            com.whatsapp.community.CommunityNavigationActivity r3 = (com.whatsapp.community.CommunityNavigationActivity) r3
            X.147 r0 = r3.A0c
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.147 r5 = r3.A0c
        L_0x0026:
            r4 = 0
            r1 = 1
            X.AnonymousClass00C.A0D(r5, r1)
            r6 = 2
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0008
            int r0 = r9.size()
            if (r0 == r1) goto L_0x0084
            android.content.res.Resources r4 = r3.getResources()
            if (r0 == r6) goto L_0x007b
            r2 = 2131892073(0x7f121769, float:1.9418884E38)
            java.lang.Object[] r1 = X.C36441kJ.A1Q()
            X.C36341k9.A1Q(r9, r1)
            int r0 = X.C36421kH.A06(r9, r6)
            X.AnonymousClass000.A1L(r1, r0, r6)
        L_0x004f:
            java.lang.String r0 = r4.getString(r2, r1)
        L_0x0053:
            X.AnonymousClass00C.A08(r0)
            X.3P9 r2 = new X.3P9
            r2.<init>()
            r2.A08 = r0
            r0 = 4
            X.4Xp r1 = new X.4Xp
            r1.<init>(r5, r3, r0)
            r0 = 2131892070(0x7f121766, float:1.9418878E38)
            r2.A03 = r0
            r2.A06 = r1
            X.3Vb r1 = X.C66203Vb.A00
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            r2.A04 = r0
            r2.A07 = r1
            com.whatsapp.LegacyMessageDialogFragment r0 = r2.A02()
            r3.Btm(r0)
            return
        L_0x007b:
            r2 = 2131892072(0x7f121768, float:1.9418882E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.C36341k9.A1Q(r9, r1)
            goto L_0x004f
        L_0x0084:
            r2 = 2131892071(0x7f121767, float:1.941888E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r9.get(r4)
            java.lang.String r0 = X.C36391kE.A0v(r3, r0, r1, r4, r2)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WC.A05(com.whatsapp.jid.GroupJid, java.util.List):void");
    }

    public void A06(GroupJid groupJid, List list) {
        if (3 - this.A01 != 0) {
            super.A06(groupJid, list);
            return;
        }
        MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A00;
        if (AnonymousClass00C.A0J(groupJid, memberSuggestedGroupsManagementViewModel.A08)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(list));
            for (Object A1K : list) {
                C36341k9.A1K(A1K, linkedHashMap, 2);
            }
            MemberSuggestedGroupsManagementViewModel.A06(memberSuggestedGroupsManagementViewModel, linkedHashMap);
        }
    }

    public void A07(GroupJid groupJid, List list) {
        if (3 - this.A01 != 0) {
            super.A07(groupJid, list);
            return;
        }
        MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A00;
        if (AnonymousClass00C.A0J(groupJid, memberSuggestedGroupsManagementViewModel.A08)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(list));
            for (Object A1K : list) {
                C36341k9.A1K(A1K, linkedHashMap, 4);
            }
            MemberSuggestedGroupsManagementViewModel.A06(memberSuggestedGroupsManagementViewModel, linkedHashMap);
        }
    }

    public void A08(GroupJid groupJid, List list) {
        if (3 - this.A01 != 0) {
            super.A08(groupJid, list);
            return;
        }
        MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A00;
        if (AnonymousClass00C.A0J(groupJid, memberSuggestedGroupsManagementViewModel.A08)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(list));
            for (Object A1K : list) {
                C36341k9.A1K(A1K, linkedHashMap, 3);
            }
            MemberSuggestedGroupsManagementViewModel.A06(memberSuggestedGroupsManagementViewModel, linkedHashMap);
        }
    }
}
