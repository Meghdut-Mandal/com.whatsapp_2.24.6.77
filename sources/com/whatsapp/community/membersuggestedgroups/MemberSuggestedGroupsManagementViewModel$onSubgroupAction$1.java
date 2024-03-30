package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C51452nq;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {321, 329, 333, 337}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C51452nq $action;
    public final /* synthetic */ boolean $skipConfirm;
    public final /* synthetic */ List $suggestions;
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C51452nq r3, List list, C023509x r5, boolean z) {
        super(2, r5);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
        this.$action = r3;
        this.$suggestions = list;
        this.$skipConfirm = z;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(this.this$0, this.$action, this.$suggestions, r8, this.$skipConfirm);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r13.label
            r8 = 4
            r9 = 1
            r10 = 0
            r7 = 3
            r6 = 2
            if (r0 == 0) goto L_0x0018
            if (r0 == r9) goto L_0x0117
            if (r0 == r6) goto L_0x0117
            if (r0 == r7) goto L_0x0117
            if (r0 == r8) goto L_0x0117
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0018:
            X.AnonymousClass0AN.A00(r14)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r13.this$0
            X.0wD r0 = r0.A04
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0034
            X.2FH r1 = X.AnonymousClass2FH.A00
        L_0x0027:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r13.this$0
            X.0sR r0 = r0.A0A
            r13.label = r9
            java.lang.Object r0 = r0.Bpf(r1, r13)
        L_0x0031:
            if (r0 != r3) goto L_0x011a
            return r3
        L_0x0034:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r13.this$0
            X.2nq r2 = r13.$action
            X.05L r0 = r0.A0E
            java.lang.Object r1 = r0.getValue()
            X.2nP r0 = X.C51182nP.MEMBER
            if (r1 != r0) goto L_0x0049
            X.2nq r0 = X.C51452nq.CANCEL
            if (r2 == r0) goto L_0x0049
            X.2FG r1 = X.AnonymousClass2FG.A00
            goto L_0x0027
        L_0x0049:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            java.util.List r0 = r13.$suggestions
            int r4 = r0.size()
            X.2nq r2 = r13.$action
            boolean r5 = r13.$skipConfirm
            X.05K r11 = r1.A0G
            java.lang.Object r0 = r11.getValue()
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.first
            int r12 = X.AnonymousClass000.A0I(r0)
            int r12 = r12 + r4
            java.lang.Object r0 = r11.getValue()
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.second
            int r0 = X.AnonymousClass000.A0I(r0)
            int r12 = r12 - r0
            if (r12 <= 0) goto L_0x009e
            X.2nq r0 = X.C51452nq.APPROVE
            if (r2 != r0) goto L_0x009e
            java.lang.Object r0 = r11.getValue()
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.first
            int r1 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r0 = r11.getValue()
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r0 = r0.second
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r1 < r0) goto L_0x0094
            X.2FF r1 = X.AnonymousClass2FF.A00
            goto L_0x0027
        L_0x0094:
            if (r5 != 0) goto L_0x009e
            int r0 = r4 - r12
            X.2FE r1 = new X.2FE
            r1.<init>(r2, r4, r0)
            goto L_0x0027
        L_0x009e:
            java.util.List r0 = r13.$suggestions
            java.util.ArrayList r4 = X.C36351kA.A0z(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00a8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r1.next()
            X.3KN r0 = (X.AnonymousClass3KN) r0
            X.147 r0 = r0.A02
            r4.add(r0)
            goto L_0x00a8
        L_0x00ba:
            java.util.List r0 = r13.$suggestions
            java.util.ArrayList r5 = X.C36351kA.A0z(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x00c4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r11.next()
            X.3KN r0 = (X.AnonymousClass3KN) r0
            X.147 r2 = r0.A02
            com.whatsapp.jid.UserJid r1 = r0.A04
            X.3Hu r0 = new X.3Hu
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x00c4
        L_0x00dd:
            X.2nq r0 = r13.$action
            int r0 = r0.ordinal()
            r2 = 0
            if (r0 == r10) goto L_0x0108
            if (r0 == r9) goto L_0x00f9
            if (r0 != r6) goto L_0x011a
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$4 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$4
            r0.<init>(r4, r2)
            r13.label = r8
            X.0AO r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A04(r1, r4, r13, r0, r8)
            goto L_0x0031
        L_0x00f9:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$3 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$3
            r0.<init>(r5, r2)
            r13.label = r7
            X.0AO r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A04(r1, r4, r13, r0, r7)
            goto L_0x0031
        L_0x0108:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$2 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$2
            r0.<init>(r5, r2)
            r13.label = r6
            X.0AO r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A04(r1, r4, r13, r0, r6)
            goto L_0x0031
        L_0x0117:
            X.AnonymousClass0AN.A00(r14)
        L_0x011a:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
