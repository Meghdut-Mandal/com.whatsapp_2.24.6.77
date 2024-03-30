package com.whatsapp.community.subgroup;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass11F;
import X.AnonymousClass3BL;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.CommunitySubgroupsObserver$conversationObserver$1$onConversationDeleted$1", f = "CommunitySubgroupsObserver.kt", i = {}, l = {160, 161}, m = "invokeSuspend", n = {}, s = {})
public final class CommunitySubgroupsObserver$conversationObserver$1$onConversationDeleted$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $chatJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass3BL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunitySubgroupsObserver$conversationObserver$1$onConversationDeleted$1(AnonymousClass3BL r2, AnonymousClass11F r3, C023509x r4) {
        super(2, r4);
        this.$chatJid = r3;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommunitySubgroupsObserver$conversationObserver$1$onConversationDeleted$1(this.this$0, this.$chatJid, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r2) goto L_0x0053
            if (r0 != r4) goto L_0x0077
            X.AnonymousClass0AN.A00(r7)
        L_0x000f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            X.11F r0 = r6.$chatJid
            boolean r0 = X.C007103b.A0j(r7, r0)
            if (r0 == 0) goto L_0x007c
            X.3BL r0 = r6.this$0
            java.util.Iterator r3 = X.AnonymousClass3BL.A00(r0)
        L_0x001f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r2 = r3.next()
            X.30n r2 = (X.C586530n) r2
            X.1uf r0 = r2.A00
            X.0wk r1 = r0.A0t
            r0 = 47
            X.C81323wp.A00(r1, r2, r0)
            goto L_0x001f
        L_0x0035:
            X.AnonymousClass0AN.A00(r7)
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion
            X.11F r0 = r6.$chatJid
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass6SZ.A00(r0)
            if (r0 == 0) goto L_0x007c
            X.3BL r1 = r6.this$0
            X.1EL r0 = r1.A0C
            X.0sP r1 = r1.A0G
            r6.L$0 = r0
            r6.label = r2
            java.lang.Object r7 = r1.B1c(r6)
            if (r7 != r5) goto L_0x005a
            return r5
        L_0x0053:
            java.lang.Object r0 = r6.L$0
            X.1EL r0 = (X.AnonymousClass1EL) r0
            X.AnonymousClass0AN.A00(r7)
        L_0x005a:
            X.141 r7 = (X.AnonymousClass141) r7
            boolean r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x007c
            X.3BL r3 = r6.this$0
            r2 = 0
            r6.L$0 = r2
            r6.label = r4
            X.02l r1 = r3.A0E
            com.whatsapp.community.subgroup.CommunitySubgroupsObserver$getCommunitySubgroupsMeParticipating$2 r0 = new com.whatsapp.community.subgroup.CommunitySubgroupsObserver$getCommunitySubgroupsMeParticipating$2
            r0.<init>(r3, r2)
            java.lang.Object r7 = X.AnonymousClass0A2.A00(r6, r1, r0)
            if (r7 != r5) goto L_0x000f
            return r5
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x007c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.subgroup.CommunitySubgroupsObserver$conversationObserver$1$onConversationDeleted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunitySubgroupsObserver$conversationObserver$1$onConversationDeleted$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
