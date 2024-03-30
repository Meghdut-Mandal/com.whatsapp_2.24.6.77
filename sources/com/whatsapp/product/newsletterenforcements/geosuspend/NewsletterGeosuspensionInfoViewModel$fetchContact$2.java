package com.whatsapp.product.newsletterenforcements.geosuspend;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass141;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel$fetchContact$2", f = "NewsletterGeosuspensionInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterGeosuspensionInfoViewModel$fetchContact$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterGeosuspensionInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterGeosuspensionInfoViewModel$fetchContact$2(C28981Uw r2, NewsletterGeosuspensionInfoViewModel newsletterGeosuspensionInfoViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = newsletterGeosuspensionInfoViewModel;
        this.$newsletterJid = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new NewsletterGeosuspensionInfoViewModel$fetchContact$2(this.$newsletterJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass141 A08 = this.this$0.A02.A08(this.$newsletterJid);
            if (A08 == null) {
                return null;
            }
            this.this$0.A00.A0C(A08);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterGeosuspensionInfoViewModel$fetchContact$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
