package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$initialize$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {141, 142, 145, 146}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$initialize$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$initialize$1(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new MemberSuggestedGroupsManagementViewModel$initialize$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MemberSuggestedGroupsManagementViewModel$initialize$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A03(r0, r7) == r4) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r7.label
            r5 = 4
            r3 = 3
            r6 = 2
            r0 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 == r0) goto L_0x0017
            if (r1 == r6) goto L_0x0048
            if (r1 == r3) goto L_0x007e
            if (r1 == r5) goto L_0x0096
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0017:
            X.AnonymousClass0AN.A00(r8)
            goto L_0x003a
        L_0x001b:
            X.AnonymousClass0AN.A00(r8)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r7.this$0
            r7.label = r0
            X.05L r2 = r1.A0E
            X.1LV r0 = r1.A02
            X.147 r1 = r1.A08
            X.17X r0 = r0.A05
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0045
            X.2nP r0 = X.C51182nP.ADMIN
        L_0x0032:
            java.lang.Object r0 = r2.B6N(r0, r7)
            if (r0 == r4) goto L_0x0044
            X.0AJ r0 = X.AnonymousClass0AJ.A00
        L_0x003a:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r7.this$0
            r7.label = r6
            java.lang.Object r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A03(r0, r7)
            if (r0 != r4) goto L_0x004b
        L_0x0044:
            return r4
        L_0x0045:
            X.2nP r0 = X.C51182nP.MEMBER
            goto L_0x0032
        L_0x0048:
            X.AnonymousClass0AN.A00(r8)
        L_0x004b:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r7.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A05(r0)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r2 = r7.this$0
            X.1Cv r0 = r2.A06
            X.147 r1 = r2.A08
            X.3T1 r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x006f
            boolean r0 = X.C66013Ui.A0o(r0)
            if (r0 == 0) goto L_0x006f
            X.12q r0 = r2.A05
            X.3Qp r1 = X.C36371kC.A0W(r0, r1)
            if (r1 == 0) goto L_0x006f
            X.1LV r0 = r2.A02
            r0.A09(r1)
        L_0x006f:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r7.this$0
            X.05L r1 = r0.A0C
            X.2nO r0 = X.C51172nO.READY
            r7.label = r3
            java.lang.Object r0 = r1.B6N(r0, r7)
            if (r0 != r4) goto L_0x0081
            return r4
        L_0x007e:
            X.AnonymousClass0AN.A00(r8)
        L_0x0081:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r3 = r7.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = r3.A03
            X.05K r2 = r0.A0B
            r1 = 1
            X.2vV r0 = new X.2vV
            r0.<init>(r3, r1)
            r7.label = r5
            java.lang.Object r0 = r2.B36(r7, r0)
            if (r0 != r4) goto L_0x0099
            return r4
        L_0x0096:
            X.AnonymousClass0AN.A00(r8)
        L_0x0099:
            X.0jR r0 = new X.0jR
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$initialize$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
