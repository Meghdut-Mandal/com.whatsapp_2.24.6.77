package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {127, 128}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A03(r0, r5) != r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r5.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 == r0) goto L_0x0012
            if (r1 != r3) goto L_0x0043
            X.AnonymousClass0AN.A00(r6)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r6)
            goto L_0x0035
        L_0x0016:
            X.AnonymousClass0AN.A00(r6)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r5.this$0
            r5.label = r0
            X.05L r2 = r1.A0E
            X.1LV r0 = r1.A02
            X.147 r1 = r1.A08
            X.17X r0 = r0.A05
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0040
            X.2nP r0 = X.C51182nP.ADMIN
        L_0x002d:
            java.lang.Object r0 = r2.B6N(r0, r5)
            if (r0 == r4) goto L_0x003f
            X.0AJ r0 = X.AnonymousClass0AJ.A00
        L_0x0035:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r5.this$0
            r5.label = r3
            java.lang.Object r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A03(r0, r5)
            if (r0 != r4) goto L_0x000f
        L_0x003f:
            return r4
        L_0x0040:
            X.2nP r0 = X.C51182nP.MEMBER
            goto L_0x002d
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
