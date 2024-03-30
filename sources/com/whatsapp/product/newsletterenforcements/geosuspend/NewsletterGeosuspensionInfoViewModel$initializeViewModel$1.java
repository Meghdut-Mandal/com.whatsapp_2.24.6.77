package com.whatsapp.product.newsletterenforcements.geosuspend;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel$initializeViewModel$1", f = "NewsletterGeosuspensionInfoViewModel.kt", i = {}, l = {47, 51}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterGeosuspensionInfoViewModel$initializeViewModel$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $countryCode;
    public final /* synthetic */ C28981Uw $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterGeosuspensionInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterGeosuspensionInfoViewModel$initializeViewModel$1(C28981Uw r2, NewsletterGeosuspensionInfoViewModel newsletterGeosuspensionInfoViewModel, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = newsletterGeosuspensionInfoViewModel;
        this.$newsletterJid = r2;
        this.$countryCode = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new NewsletterGeosuspensionInfoViewModel$initializeViewModel$1(this.$newsletterJid, this.this$0, this.$countryCode, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r7.label
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x002a
            if (r1 != r4) goto L_0x004f
            X.AnonymousClass0AN.A00(r8)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r8)
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel r6 = r7.this$0
            X.1Uw r5 = r7.$newsletterJid
            r7.label = r0
            X.02l r2 = r6.A05
            r1 = 0
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel$fetchContact$2 r0 = new com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel$fetchContact$2
            r0.<init>(r5, r6, r1)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r7, r2, r0)
            if (r0 != r3) goto L_0x002d
            return r3
        L_0x002a:
            X.AnonymousClass0AN.A00(r8)
        L_0x002d:
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel r0 = r7.this$0
            X.00T r0 = r0.A04
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x000f
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel r0 = r7.this$0
            X.00s r1 = r0.A01
            X.2ar r0 = X.C46702ar.A00
            r1.A0C(r0)
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel r2 = r7.this$0
            X.1Uw r1 = r7.$newsletterJid
            java.lang.String r0 = r7.$countryCode
            r7.label = r4
            java.lang.Object r0 = com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel.A01(r1, r2, r0, r7)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x004f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel$initializeViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterGeosuspensionInfoViewModel$initializeViewModel$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
