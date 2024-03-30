package com.whatsapp.contact.picker;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass147;
import X.AnonymousClass4T0;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2$1$1", f = "CompoundContactsLoader.kt", i = {}, l = {41, 41}, m = "invokeSuspend", n = {}, s = {})
public final class CompoundContactsLoader$loadContacts$2$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C005502l $dispatcher;
    public final /* synthetic */ AnonymousClass147 $groupJid;
    public final /* synthetic */ AnonymousClass4T0 $loader;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompoundContactsLoader$loadContacts$2$1$1(AnonymousClass4T0 r2, AnonymousClass147 r3, C023509x r4, C005502l r5) {
        super(2, r4);
        this.$loader = r2;
        this.$groupJid = r3;
        this.$dispatcher = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        CompoundContactsLoader$loadContacts$2$1$1 compoundContactsLoader$loadContacts$2$1$1 = new CompoundContactsLoader$loadContacts$2$1$1(this.$loader, this.$groupJid, r6, this.$dispatcher);
        compoundContactsLoader$loadContacts$2$1$1.L$0 = obj;
        return compoundContactsLoader$loadContacts$2$1$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x0030
            if (r0 != r6) goto L_0x004b
            X.AnonymousClass0AN.A00(r9)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r9)
            java.lang.Object r4 = r8.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.4T0 r3 = r8.$loader
            java.lang.String r2 = r3.BDM()
            X.147 r1 = r8.$groupJid
            X.02l r0 = r8.$dispatcher
            r8.L$0 = r4
            r8.L$1 = r2
            r8.label = r5
            java.lang.Object r9 = r3.BOK(r1, r8, r0)
            if (r9 != r7) goto L_0x0039
            return r7
        L_0x0030:
            java.lang.Object r2 = r8.L$1
            java.lang.Object r4 = r8.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r9)
        L_0x0039:
            X.011 r1 = X.C36441kJ.A19(r2, r9)
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.label = r6
            java.lang.Object r0 = r4.B6N(r1, r8)
            if (r0 != r7) goto L_0x000f
            return r7
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CompoundContactsLoader$loadContacts$2$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
