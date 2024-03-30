package com.whatsapp.community;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass147;
import X.C009003v;
import X.C023509x;
import X.C28401Sn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$3", f = "CommunityMembersDirectory.kt", i = {0}, l = {434}, m = "invokeSuspend", n = {"communityContacts"}, s = {"L$0"})
public final class CommunityMembersDirectory$getCommunityContacts$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass147 $parentJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ C28401Sn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersDirectory$getCommunityContacts$3(C28401Sn r2, AnonymousClass147 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$parentJid = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommunityMembersDirectory$getCommunityContacts$3(this.this$0, this.$parentJid, r5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.0AO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.0AO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.TreeSet} */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.AbstractCollection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r7 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r7) goto L_0x0067
            java.lang.Object r6 = r8.L$0
            java.util.AbstractCollection r6 = (java.util.AbstractCollection) r6
            X.AnonymousClass0AN.A00(r9)
        L_0x0010:
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r1 = r9.keySet()
            X.1Sn r0 = r8.this$0
            X.16D r0 = r0.A03
            java.util.HashMap r0 = r0.A0L(r1)
            java.util.Iterator r2 = X.C36391kE.A10(r0)
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006c
            X.141 r1 = X.C36391kE.A0f(r2)
            if (r1 == 0) goto L_0x0022
            X.1Sn r0 = r8.this$0
            X.0wQ r0 = r0.A01
            boolean r0 = X.C36361kB.A1X(r0, r1)
            if (r0 != 0) goto L_0x0022
            r6.add(r1)
            goto L_0x0022
        L_0x003c:
            X.AnonymousClass0AN.A00(r9)
            X.1Sn r0 = r8.this$0
            X.171 r2 = r0.A04
            X.0ts r1 = r0.A05
            X.3xD r0 = new X.3xD
            r0.<init>(r2, r1)
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>(r0)
            X.1Sn r4 = r8.this$0
            X.147 r3 = r8.$parentJid
            X.02m r2 = X.AnonymousClass19R.A00
            r8.L$0 = r5
            r8.label = r7
            r1 = 0
            com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4 r0 = new com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4
            r0.<init>(r4, r3, r1)
            java.lang.Object r9 = X.AnonymousClass0A2.A00(r8, r2, r0)
            if (r9 == r6) goto L_0x006c
            r6 = r5
            goto L_0x0010
        L_0x0067:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x006c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunityMembersDirectory$getCommunityContacts$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
