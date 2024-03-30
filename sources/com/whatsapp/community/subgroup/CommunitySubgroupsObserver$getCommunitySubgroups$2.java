package com.whatsapp.community.subgroup;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass3BL;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.CommunitySubgroupsObserver$getCommunitySubgroups$2", f = "CommunitySubgroupsObserver.kt", i = {1}, l = {214, 215}, m = "invokeSuspend", n = {"meParticipating"}, s = {"L$0"})
public final class CommunitySubgroupsObserver$getCommunitySubgroups$2 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass3BL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunitySubgroupsObserver$getCommunitySubgroups$2(AnonymousClass3BL r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CommunitySubgroupsObserver$getCommunitySubgroups$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunitySubgroupsObserver$getCommunitySubgroups$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r7 == r5) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r6.label
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r0) goto L_0x0034
            if (r1 != r4) goto L_0x0050
            java.lang.Object r1 = r6.L$0
            java.util.Collection r1 = (java.util.Collection) r1
            X.AnonymousClass0AN.A00(r7)
        L_0x0013:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = X.C007103b.A0S(r7, r1)
            java.util.Set r0 = X.C007103b.A0f(r0)
            return r0
        L_0x001e:
            X.AnonymousClass0AN.A00(r7)
            X.3BL r3 = r6.this$0
            r6.label = r0
            X.02l r2 = r3.A0E
            r1 = 0
            com.whatsapp.community.subgroup.CommunitySubgroupsObserver$getCommunitySubgroupsMeParticipating$2 r0 = new com.whatsapp.community.subgroup.CommunitySubgroupsObserver$getCommunitySubgroupsMeParticipating$2
            r0.<init>(r3, r1)
            java.lang.Object r7 = X.AnonymousClass0A2.A00(r6, r2, r0)
            if (r7 != r5) goto L_0x0037
        L_0x0033:
            return r5
        L_0x0034:
            X.AnonymousClass0AN.A00(r7)
        L_0x0037:
            java.util.Collection r7 = (java.util.Collection) r7
            X.3BL r3 = r6.this$0
            r6.L$0 = r7
            r6.label = r4
            X.02l r2 = r3.A0E
            r1 = 0
            com.whatsapp.community.subgroup.CommunitySubgroupsObserver$getCommunitySubgroupsMeNotParticipating$2 r0 = new com.whatsapp.community.subgroup.CommunitySubgroupsObserver$getCommunitySubgroupsMeNotParticipating$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r6, r2, r0)
            if (r0 == r5) goto L_0x0033
            r1 = r7
            r7 = r0
            goto L_0x0013
        L_0x0050:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.subgroup.CommunitySubgroupsObserver$getCommunitySubgroups$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
