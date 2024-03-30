package com.whatsapp.community.subgroup;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass147;
import X.AnonymousClass3BL;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.CommunitySubgroupsObserver$getParentGroupJid$2", f = "CommunitySubgroupsObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommunitySubgroupsObserver$getParentGroupJid$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass147 $subgroupJid;
    public int label;
    public final /* synthetic */ AnonymousClass3BL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunitySubgroupsObserver$getParentGroupJid$2(AnonymousClass3BL r2, AnonymousClass147 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$subgroupJid = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommunitySubgroupsObserver$getParentGroupJid$2(this.this$0, this.$subgroupJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return this.this$0.A00.A02(this.$subgroupJid);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunitySubgroupsObserver$getParentGroupJid$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
