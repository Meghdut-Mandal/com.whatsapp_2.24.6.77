package X;

/* renamed from: X.4Xc  reason: invalid class name and case insensitive filesystem */
public class C89584Xc implements C87854Qk {
    public Object A00;
    public final int A01;

    public C89584Xc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.1tX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.1tW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: X.1tX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: X.1tX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0224, code lost:
        X.C36331k8.A1T(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0227, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        r1.invalidateOptionsMenu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b0, code lost:
        X.C80233v4.A01(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01db, code lost:
        r2.Boy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01de, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BQN(X.AnonymousClass11F r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0018;
                case 2: goto L_0x0042;
                case 3: goto L_0x0054;
                case 4: goto L_0x0078;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00fa;
                case 7: goto L_0x010c;
                case 8: goto L_0x0131;
                case 9: goto L_0x0141;
                case 10: goto L_0x015f;
                case 11: goto L_0x0173;
                case 12: goto L_0x0187;
                case 13: goto L_0x019c;
                case 14: goto L_0x01b4;
                case 15: goto L_0x01c7;
                case 16: goto L_0x01df;
                case 17: goto L_0x01f7;
                case 18: goto L_0x0207;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A00
            com.whatsapp.quickcontact.QuickContactActivity r0 = (com.whatsapp.quickcontact.QuickContactActivity) r0
            X.AnonymousClass3QZ.A01(r0)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r5.A00
            com.whatsapp.community.CommunityHomeActivity r1 = (com.whatsapp.community.CommunityHomeActivity) r1
            X.147 r0 = r1.A0l
            boolean r0 = r0.equals(r6)
            goto L_0x004e
        L_0x0018:
            java.lang.Object r4 = r5.A00
            com.whatsapp.community.CommunityMembersViewModel r4 = (com.whatsapp.community.CommunityMembersViewModel) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.1Sm r1 = r4.A07
            X.147 r0 = r4.A0I
            java.util.Set r1 = r1.B9u(r0)
            X.147 r0 = X.C65533Sl.A01(r6)
            boolean r0 = X.C007103b.A0j(r1, r0)
            if (r0 == 0) goto L_0x000c
            X.040 r3 = X.C109325Xd.A00(r4)
            X.02l r2 = r4.A0J
            r1 = 0
            com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1 r0 = new com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1
            r0.<init>(r4, r1)
            X.C36381kD.A1R(r2, r0, r3)
            return
        L_0x0042:
            if (r6 == 0) goto L_0x000c
            java.lang.Object r1 = r5.A00
            com.whatsapp.community.CommunityNavigationActivity r1 = (com.whatsapp.community.CommunityNavigationActivity) r1
            X.147 r0 = r1.A0c
            boolean r0 = r6.equals(r0)
        L_0x004e:
            if (r0 == 0) goto L_0x000c
            r1.invalidateOptionsMenu()
            return
        L_0x0054:
            java.lang.Object r1 = r5.A00
            com.whatsapp.community.communityInfo.CAGInfoViewModel r1 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.147 r0 = r1.A03
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "cagJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0067:
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 == 0) goto L_0x000c
            X.1tr r0 = r1.A01
            if (r0 != 0) goto L_0x0228
            java.lang.String r0 = "groupParticipantsViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0078:
            java.lang.Object r4 = r5.A00
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r4 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.147 r3 = r4.A03
            if (r3 == 0) goto L_0x00ac
            boolean r0 = X.AnonymousClass00C.A0J(r6, r3)
            if (r0 == 0) goto L_0x00ac
            X.1hi r2 = r4.A0A
            java.lang.Object r0 = r2.A04()
            X.3Ht r0 = (X.C62843Ht) r0
            X.2oJ r1 = r0.A01
            X.2oJ r0 = X.C51742oJ.REQUESTING
            if (r1 == r0) goto L_0x00ac
            X.16D r0 = r4.A07
            X.141 r0 = r0.A08(r3)
            r1 = 1
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r0.A0c
            if (r0 != r1) goto L_0x00c1
            X.2nN r1 = X.C51162nN.EVERYONE
        L_0x00a7:
            X.2oJ r0 = X.C51742oJ.IDLE
            X.C62843Ht.A00(r2, r1, r0)
        L_0x00ac:
            X.147 r3 = r4.A02
            if (r3 == 0) goto L_0x000c
            boolean r0 = X.AnonymousClass00C.A0J(r6, r3)
            if (r0 == 0) goto L_0x000c
            X.0wU r2 = r4.A0C
            r1 = 22
            X.3v7 r0 = new X.3v7
            r0.<init>(r4, r3, r1)
            goto L_0x01db
        L_0x00c1:
            X.2nN r1 = X.C51162nN.ADMINS
            goto L_0x00a7
        L_0x00c4:
            java.lang.Object r2 = r5.A00
            X.3BL r2 = (X.AnonymousClass3BL) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            if (r6 == 0) goto L_0x000c
            X.147 r0 = r2.A0D
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 == 0) goto L_0x00f0
            java.util.Iterator r3 = X.AnonymousClass3BL.A00(r2)
        L_0x00da:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r2 = r3.next()
            X.30n r2 = (X.C586530n) r2
            X.1uf r0 = r2.A00
            X.0wk r1 = r0.A0t
            r0 = 49
            X.C81323wp.A00(r1, r2, r0)
            goto L_0x00da
        L_0x00f0:
            X.040 r3 = r2.A0F
            r0 = 0
            com.whatsapp.community.subgroup.CommunitySubgroupsObserver$groupDataChangeListener$1$1$2 r1 = new com.whatsapp.community.subgroup.CommunitySubgroupsObserver$groupDataChangeListener$1$1$2
            r1.<init>(r2, r6, r6, r0)
            goto L_0x0224
        L_0x00fa:
            java.lang.Object r1 = r5.A00
            X.1oo r1 = (X.C38421oo) r1
            if (r6 == 0) goto L_0x000c
            com.whatsapp.jid.GroupJid r0 = r1.A08
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000c
            X.C38421oo.A00(r1)
            return
        L_0x010c:
            java.lang.Object r3 = r5.A00
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r3 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r3
            X.00T r0 = r3.A0Q
            X.147 r2 = X.C36431kI.A0k(r0)
            if (r2 == 0) goto L_0x000c
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x000c
            r0 = 2131429590(0x7f0b08d6, float:1.8480857E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36421kH.A0I(r3, r0)
            if (r1 == 0) goto L_0x000c
            boolean r0 = com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0z(r3)
            if (r0 == 0) goto L_0x000c
            com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0w(r1, r3, r2)
            return
        L_0x0131:
            java.lang.Object r1 = r5.A00
            X.28d r1 = (X.AnonymousClass28d) r1
            X.11F r0 = r1.A0e
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x000c
            r1.A0H()
            return
        L_0x0141:
            java.lang.Object r1 = r5.A00
            X.2I7 r1 = (X.AnonymousClass2I7) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.2bT r0 = r1.getFMessage()
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 == 0) goto L_0x000c
            X.2bT r0 = r1.getFMessage()
            X.AnonymousClass2I7.A0D(r1, r0)
            return
        L_0x015f:
            java.lang.Object r1 = r5.A00
            X.1u8 r1 = (X.AnonymousClass1u8) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.147 r0 = r1.A01
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 == 0) goto L_0x000c
            X.AnonymousClass1u8.A01(r1)
            return
        L_0x0173:
            java.lang.Object r1 = r5.A00
            X.1uA r1 = (X.C39891uA) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.147 r0 = r1.A05
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 == 0) goto L_0x000c
            X.C39891uA.A01(r1)
            return
        L_0x0187:
            java.lang.Object r2 = r5.A00
            X.1tW r2 = (X.C39751tW) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.147 r0 = r2.A03
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 == 0) goto L_0x000c
            X.0wU r1 = r2.A04
            r0 = 30
            goto L_0x01b0
        L_0x019c:
            java.lang.Object r2 = r5.A00
            X.1tX r2 = (X.C39761tX) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.147 r0 = r2.A03
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 == 0) goto L_0x000c
            X.0wU r1 = r2.A04
            r0 = 32
        L_0x01b0:
            X.C80233v4.A01(r1, r2, r0)
            return
        L_0x01b4:
            java.lang.Object r1 = r5.A00
            X.1uL r1 = (X.C39951uL) r1
            X.C18740tg.A06(r6)
            X.11F r0 = r1.A01
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1.A0T()
            return
        L_0x01c7:
            java.lang.Object r1 = r5.A00
            X.1uw r1 = (X.C40111uw) r1
            X.147 r0 = r1.A03
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000c
            X.0wU r2 = r1.A0Z
            r0 = 42
            X.3v5 r0 = X.C80243v5.A00(r1, r0)
        L_0x01db:
            r2.Boy(r0)
            return
        L_0x01df:
            java.lang.Object r1 = r5.A00
            com.whatsapp.group.GroupAdminPickerActivity r1 = (com.whatsapp.group.GroupAdminPickerActivity) r1
            X.147 r0 = r1.A0H
            X.C18740tg.A06(r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x000c
            com.whatsapp.group.GroupAdminPickerActivity.A0F(r1)
            java.lang.String r0 = r1.A0I
            com.whatsapp.group.GroupAdminPickerActivity.A0G(r1, r0)
            return
        L_0x01f7:
            java.lang.Object r1 = r5.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            X.147 r0 = r1.A1Y
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x000c
            com.whatsapp.group.GroupChatInfoActivity.A15(r1)
            return
        L_0x0207:
            java.lang.Object r2 = r5.A00
            com.whatsapp.group.HistorySettingViewModel r2 = (com.whatsapp.group.HistorySettingViewModel) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r1 = 1
            if (r6 == 0) goto L_0x000c
            X.147 r0 = r2.A01
            boolean r0 = r6.equals(r0)
            if (r0 != r1) goto L_0x000c
            X.040 r3 = X.C109325Xd.A00(r2)
            r0 = 0
            com.whatsapp.group.HistorySettingViewModel$updateChecked$1 r1 = new com.whatsapp.group.HistorySettingViewModel$updateChecked$1
            r1.<init>(r2, r0)
        L_0x0224:
            X.C36331k8.A1T(r1, r3)
            return
        L_0x0228:
            r0.A0S()
            com.whatsapp.community.communityInfo.CAGInfoViewModel.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89584Xc.BQN(X.11F):void");
    }
}
