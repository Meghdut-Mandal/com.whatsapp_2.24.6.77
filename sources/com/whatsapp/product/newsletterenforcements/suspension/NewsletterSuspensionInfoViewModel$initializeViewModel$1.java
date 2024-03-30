package com.whatsapp.product.newsletterenforcements.suspension;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$initializeViewModel$1", f = "NewsletterSuspensionInfoViewModel.kt", i = {}, l = {53, 54, 58}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterSuspensionInfoViewModel$initializeViewModel$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterSuspensionInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterSuspensionInfoViewModel$initializeViewModel$1(C28981Uw r2, NewsletterSuspensionInfoViewModel newsletterSuspensionInfoViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = newsletterSuspensionInfoViewModel;
        this.$newsletterJid = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new NewsletterSuspensionInfoViewModel$initializeViewModel$1(this.$newsletterJid, this.this$0, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r8.label
            r5 = 3
            r7 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r0) goto L_0x002d
            if (r1 == r7) goto L_0x0045
            if (r1 != r5) goto L_0x0068
            X.AnonymousClass0AN.A00(r9)
        L_0x0012:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0015:
            X.AnonymousClass0AN.A00(r9)
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r6 = r8.this$0
            X.1Uw r3 = r8.$newsletterJid
            r8.label = r0
            X.02l r2 = r6.A07
            r1 = 0
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$fetchContact$2 r0 = new com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$fetchContact$2
            r0.<init>(r3, r6, r1)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r8, r2, r0)
            if (r0 != r4) goto L_0x0030
            return r4
        L_0x002d:
            X.AnonymousClass0AN.A00(r9)
        L_0x0030:
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r6 = r8.this$0
            X.1Uw r3 = r8.$newsletterJid
            r8.label = r7
            X.02l r2 = r6.A07
            r1 = 0
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$fetchNewsletterInfo$2 r0 = new com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$fetchNewsletterInfo$2
            r0.<init>(r3, r6, r1)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r8, r2, r0)
            if (r0 != r4) goto L_0x0048
            return r4
        L_0x0045:
            X.AnonymousClass0AN.A00(r9)
        L_0x0048:
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r0 = r8.this$0
            X.00T r0 = r0.A06
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x0012
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r0 = r8.this$0
            X.00s r1 = r0.A02
            X.2ax r0 = X.AnonymousClass2ax.A00
            r1.A0C(r0)
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r1 = r8.this$0
            X.1Uw r0 = r8.$newsletterJid
            r8.label = r5
            java.lang.Object r0 = com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel.A01(r0, r1, r8)
            if (r0 != r4) goto L_0x0012
            return r4
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$initializeViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterSuspensionInfoViewModel$initializeViewModel$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
