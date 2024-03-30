package com.whatsapp.community;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass147;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.DirectoryContactsLoader$loadContacts$2", f = "DirectoryContactsLoader.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class DirectoryContactsLoader$loadContacts$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass147 $groupJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ DirectoryContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectoryContactsLoader$loadContacts$2(DirectoryContactsLoader directoryContactsLoader, AnonymousClass147 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = directoryContactsLoader;
        this.$groupJid = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new DirectoryContactsLoader$loadContacts$2(this.this$0, this.$groupJid, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r6) goto L_0x0079
            java.lang.Object r7 = r8.L$0
            com.whatsapp.community.DirectoryContactsLoader r7 = (com.whatsapp.community.DirectoryContactsLoader) r7
            X.AnonymousClass0AN.A00(r9)
        L_0x0010:
            java.util.Map r9 = (java.util.Map) r9
            java.util.Collection r0 = r9.values()
            X.0tV r2 = X.C90514aH.A0X(r0)
            X.7Xe r0 = X.C155727Xe.A00
            X.0if r1 = new X.0if
            r1.<init>(r0, r2)
            X.7SX r0 = new X.7SX
            r0.<init>(r7)
            X.0ih r2 = X.C15060md.A02(r0, r1)
            X.7SY r1 = new X.7SY
            r1.<init>(r7)
            X.0if r0 = new X.0if
            r0.<init>(r1, r2)
            java.util.Set r0 = X.C15060md.A01(r0)
            return r0
        L_0x0039:
            X.AnonymousClass0AN.A00(r9)
            com.whatsapp.community.DirectoryContactsLoader r0 = r8.this$0
            X.12q r1 = r0.A04
            X.147 r0 = r8.$groupJid
            int r1 = r1.A05(r0)
            if (r1 == r6) goto L_0x0051
            r0 = 2
            if (r1 == r0) goto L_0x0054
            r0 = 6
            if (r1 == r0) goto L_0x0054
        L_0x004e:
            X.02c r0 = X.C004702c.A00
            return r0
        L_0x0051:
            X.147 r4 = r8.$groupJid
            goto L_0x005e
        L_0x0054:
            com.whatsapp.community.DirectoryContactsLoader r0 = r8.this$0
            X.1LV r1 = r0.A01
            X.147 r0 = r8.$groupJid
            X.147 r4 = r1.A02(r0)
        L_0x005e:
            if (r4 == 0) goto L_0x004e
            com.whatsapp.community.DirectoryContactsLoader r7 = r8.this$0
            X.1Sm r3 = r7.A02
            X.02m r2 = X.AnonymousClass19R.A01
            r8.L$0 = r7
            r8.label = r6
            X.1Sn r3 = (X.C28401Sn) r3
            r1 = 0
            com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4 r0 = new com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$4
            r0.<init>(r3, r4, r1)
            java.lang.Object r9 = X.AnonymousClass0A2.A00(r8, r2, r0)
            if (r9 != r5) goto L_0x0010
            return r5
        L_0x0079:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.DirectoryContactsLoader$loadContacts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DirectoryContactsLoader$loadContacts$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
