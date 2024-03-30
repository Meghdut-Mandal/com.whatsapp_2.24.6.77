package com.whatsapp.community;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass147;
import X.C009003v;
import X.C023509x;
import X.C28401Sn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4", f = "CommunityMembersDirectory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersDirectory$getCommunityDirectory$4 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass147 $parentJid;
    public int label;
    public final /* synthetic */ C28401Sn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersDirectory$getCommunityDirectory$4(C28401Sn r2, AnonymousClass147 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$parentJid = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommunityMembersDirectory$getCommunityDirectory$4(this.this$0, this.$parentJid, r5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.147} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.147} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.147} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x0178
            X.AnonymousClass0AN.A00(r7)
            X.1Sn r4 = r6.this$0
            X.147 r3 = r6.$parentJid
            X.12q r0 = r4.A06
            int r1 = r0.A05(r3)
            r0 = 1
            if (r1 != r0) goto L_0x0032
            X.17X r2 = r4.A07
            boolean r0 = r2.A0D(r3)
            if (r0 != 0) goto L_0x0032
            X.1LV r0 = r4.A02
            X.3QK r0 = X.C36421kH.A0L(r0, r3)
            if (r0 == 0) goto L_0x0032
            com.whatsapp.jid.GroupJid r1 = r0.A02
            boolean r0 = r2.A0C(r1)
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.AnonymousClass00C.A0E(r1, r0)
            r3 = r1
        L_0x0032:
            X.1Sn r0 = r6.this$0
            X.17X r0 = r0.A07
            X.0y7 r0 = X.C36381kD.A0R(r0, r3)
            X.AnonymousClass00C.A08(r0)
            r5 = 0
            X.0tV r1 = new X.0tV
            r1.<init>(r0, r5)
            X.4Mv r0 = X.C86934Mv.A00
            X.0ih r1 = X.C15060md.A02(r0, r1)
            X.4Mw r0 = X.C86944Mw.A00
            X.0ih r0 = X.C15060md.A02(r0, r1)
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()
            X.0hx r2 = new X.0hx
            r2.<init>(r0)
        L_0x0058:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6PM r0 = (X.AnonymousClass6PM) r0
            com.whatsapp.jid.UserJid r0 = r0.A03
            r3.put(r0, r1)
            goto L_0x0058
        L_0x006b:
            X.1Sn r0 = r6.this$0
            X.17X r1 = r0.A07
            X.147 r0 = r6.$parentJid
            boolean r0 = r1.A0D(r0)
            X.1Sn r4 = r6.this$0
            if (r0 == 0) goto L_0x00db
            X.180 r4 = r4.A08
            X.147 r0 = r6.$parentJid
            monitor-enter(r4)
            java.util.ArrayList r2 = X.AnonymousClass180.A00(r4, r0)     // Catch:{ all -> 0x00d8 }
            int r0 = r2.size()     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x008d
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x00d8 }
            goto L_0x009d
        L_0x008d:
            X.12j r1 = r4.A00     // Catch:{ all -> 0x00d8 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.HashMap r0 = r1.A0D(r0, r2)     // Catch:{ all -> 0x00d8 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00d8 }
            java.util.ArrayList r0 = X.C36441kJ.A15(r0)     // Catch:{ all -> 0x00d8 }
        L_0x009d:
            monitor-exit(r4)
            X.AnonymousClass00C.A0D(r0, r5)
            X.0tV r1 = new X.0tV
            r1.<init>(r0, r5)
            X.4Mx r0 = X.C86954Mx.A00
            X.0ih r1 = X.C15060md.A02(r0, r1)
            X.4Iv r0 = new X.4Iv
            r0.<init>(r3)
            X.0ih r2 = X.C15060md.A02(r0, r1)
            X.4My r1 = X.C86964My.A00
            X.0if r0 = new X.0if
            r0.<init>(r1, r2)
            java.util.LinkedHashMap r4 = X.C36431kI.A1G()
            X.0hr r2 = new X.0hr
            r2.<init>(r0)
        L_0x00c5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6PM r0 = (X.AnonymousClass6PM) r0
            com.whatsapp.jid.UserJid r0 = r0.A03
            r4.put(r0, r1)
            goto L_0x00c5
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00db:
            X.147 r2 = r6.$parentJid
            X.16D r0 = r4.A03
            X.141 r1 = r0.A0D(r2)
            X.1EL r0 = r4.A0A
            boolean r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0119
            X.0il r2 = X.C12850il.A00
        L_0x00ed:
            X.4Iw r0 = new X.4Iw
            r0.<init>(r3)
            X.0ih r2 = X.C15060md.A02(r0, r2)
            X.4Mz r1 = X.C86974Mz.A00
            X.0if r0 = new X.0if
            r0.<init>(r1, r2)
            java.util.LinkedHashMap r4 = X.C36431kI.A1G()
            X.0hr r2 = new X.0hr
            r2.<init>(r0)
        L_0x0106:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6PM r0 = (X.AnonymousClass6PM) r0
            com.whatsapp.jid.UserJid r0 = r0.A03
            r4.put(r0, r1)
            goto L_0x0106
        L_0x0119:
            X.1LV r0 = r4.A02
            java.util.HashSet r0 = r0.A04(r2)
            X.AnonymousClass00C.A0D(r0, r5)
            X.0tV r1 = new X.0tV
            r1.<init>(r0, r5)
            X.4N0 r0 = X.AnonymousClass4N0.A00
            X.0ih r1 = X.C15060md.A02(r0, r1)
            X.4Ix r0 = new X.4Ix
            r0.<init>(r4)
            X.0if r4 = new X.0if
            r4.<init>(r0, r1)
            X.4N1 r2 = X.AnonymousClass4N1.A00
            X.0la r0 = X.C14410la.A00
            X.0ii r1 = new X.0ii
            r1.<init>(r2, r0, r4)
            X.4N2 r0 = X.AnonymousClass4N2.A00
            X.0if r2 = new X.0if
            r2.<init>(r0, r1)
            goto L_0x00ed
        L_0x0148:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.1Sn r0 = r6.this$0
            X.0wQ r0 = r0.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r0)
            com.whatsapp.jid.UserJid r2 = X.C222813r.A00(r0)
            if (r2 == 0) goto L_0x016f
            java.lang.Object r0 = r4.get(r2)
            if (r0 != 0) goto L_0x016f
            java.util.HashSet r1 = X.C36441kJ.A16()
            X.6PM r0 = new X.6PM
            r0.<init>(r2, r1, r5, r5)
            X.011 r0 = X.C36441kJ.A19(r2, r0)
            java.util.Map r4 = X.C000400e.A0C(r4, r0)
        L_0x016f:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r3)
            r0.putAll(r4)
            return r0
        L_0x0178:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunityMembersDirectory$getCommunityDirectory$4) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
