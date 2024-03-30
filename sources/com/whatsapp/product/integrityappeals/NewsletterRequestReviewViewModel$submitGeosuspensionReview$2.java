package com.whatsapp.product.integrityappeals;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C006302t;
import X.C023509x;
import X.C28981Uw;
import com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel$submitGeosuspensionReview$2", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$submitGeosuspensionReview$2 extends AnonymousClass0A1 implements C006302t {
    public final /* synthetic */ String $countryCode;
    public final /* synthetic */ C28981Uw $newsletterJid;
    public final /* synthetic */ String $reason;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$submitGeosuspensionReview$2(C28981Uw r2, NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, String str, String str2, C023509x r6) {
        super(1, r6);
        this.this$0 = newsletterRequestReviewViewModel;
        this.$newsletterJid = r2;
        this.$countryCode = str;
        this.$reason = str2;
    }

    public final C023509x create(C023509x r7) {
        return new NewsletterRequestReviewViewModel$submitGeosuspensionReview$2(this.$newsletterJid, this.this$0, this.$countryCode, this.$reason, r7);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((NewsletterRequestReviewViewModel$submitGeosuspensionReview$2) create((C023509x) obj)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            NewsletterAppealsClient newsletterAppealsClient = this.this$0.A01;
            C28981Uw r2 = this.$newsletterJid;
            String str = this.$countryCode;
            String str2 = this.$reason;
            this.label = 1;
            if (newsletterAppealsClient.A03(r2, str, str2, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
