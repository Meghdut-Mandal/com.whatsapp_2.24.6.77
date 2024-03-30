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

@DebugMetadata(c = "com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel$submitSuspensionReview$2", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$submitSuspensionReview$2 extends AnonymousClass0A1 implements C006302t {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public final /* synthetic */ String $reason;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$submitSuspensionReview$2(C28981Uw r2, NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, String str, C023509x r5) {
        super(1, r5);
        this.this$0 = newsletterRequestReviewViewModel;
        this.$newsletterJid = r2;
        this.$reason = str;
    }

    public final C023509x create(C023509x r5) {
        return new NewsletterRequestReviewViewModel$submitSuspensionReview$2(this.$newsletterJid, this.this$0, this.$reason, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((NewsletterRequestReviewViewModel$submitSuspensionReview$2) create((C023509x) obj)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            NewsletterAppealsClient newsletterAppealsClient = this.this$0.A01;
            C28981Uw r1 = this.$newsletterJid;
            String str = this.$reason;
            this.label = 1;
            if (newsletterAppealsClient.A05(r1, str, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
