package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C006302t;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$2", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {420}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$subgroupAction$2 extends AnonymousClass0A1 implements C006302t {
    public final /* synthetic */ C006302t $networkCall;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$subgroupAction$2(C023509x r2, C006302t r3) {
        super(1, r2);
        this.$networkCall = r3;
    }

    public final C023509x create(C023509x r3) {
        return new MemberSuggestedGroupsManagementViewModel$subgroupAction$2(r3, this.$networkCall);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new MemberSuggestedGroupsManagementViewModel$subgroupAction$2((C023509x) obj, this.$networkCall).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C006302t r0 = this.$networkCall;
            this.label = 1;
            obj = r0.invoke(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }
}
