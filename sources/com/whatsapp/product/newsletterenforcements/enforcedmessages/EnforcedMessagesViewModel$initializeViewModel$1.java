package com.whatsapp.product.newsletterenforcements.enforcedmessages;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel$initializeViewModel$1", f = "EnforcedMessagesViewModel.kt", i = {}, l = {51, 54}, m = "invokeSuspend", n = {}, s = {})
public final class EnforcedMessagesViewModel$initializeViewModel$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public int label;
    public final /* synthetic */ EnforcedMessagesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnforcedMessagesViewModel$initializeViewModel$1(C28981Uw r2, EnforcedMessagesViewModel enforcedMessagesViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = enforcedMessagesViewModel;
        this.$newsletterJid = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EnforcedMessagesViewModel$initializeViewModel$1(this.$newsletterJid, this.this$0, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r7.label
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x002a
            if (r1 != r5) goto L_0x0044
            X.AnonymousClass0AN.A00(r8)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r8)
            com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel r4 = r7.this$0
            X.1Uw r3 = r7.$newsletterJid
            r7.label = r0
            X.02l r2 = r4.A05
            r1 = 0
            com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel$fetchContact$2 r0 = new com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel$fetchContact$2
            r0.<init>(r3, r4, r1)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r7, r2, r0)
            if (r0 != r6) goto L_0x002d
            return r6
        L_0x002a:
            X.AnonymousClass0AN.A00(r8)
        L_0x002d:
            com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel r0 = r7.this$0
            X.00T r0 = r0.A04
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x000f
            com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel r1 = r7.this$0
            X.1Uw r0 = r7.$newsletterJid
            r7.label = r5
            java.lang.Object r0 = com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel.A01(r0, r1, r7)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel$initializeViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EnforcedMessagesViewModel$initializeViewModel$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
