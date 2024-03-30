package com.whatsapp.product.integrityappeals;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass2Z3;
import X.AnonymousClass2Z4;
import X.AnonymousClass2Z5;
import X.AnonymousClass3X8;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import X.C51892oY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel$submitReview$1", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {39, 43, 46}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$submitReview$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3X8 $appealRequest;
    public final /* synthetic */ String $reason;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$submitReview$1(AnonymousClass3X8 r2, NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = newsletterRequestReviewViewModel;
        this.$appealRequest = r2;
        this.$reason = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new NewsletterRequestReviewViewModel$submitReview$1(this.$appealRequest, this.this$0, this.$reason, r6);
    }

    public final Object invokeSuspend(Object obj) {
        Object A01;
        AnonymousClass0AO r1 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A00.A0C(C51892oY.PENDING);
            AnonymousClass3X8 r2 = this.$appealRequest;
            if (r2 instanceof AnonymousClass2Z4) {
                NewsletterRequestReviewViewModel newsletterRequestReviewViewModel = this.this$0;
                C28981Uw A00 = r2.A00();
                String str = ((AnonymousClass2Z4) r2).A01;
                String str2 = this.$reason;
                this.label = 1;
                A01 = NewsletterRequestReviewViewModel.A01(newsletterRequestReviewViewModel, this, new NewsletterRequestReviewViewModel$submitGeosuspensionReview$2(A00, newsletterRequestReviewViewModel, str, str2, (C023509x) null));
            } else if (r2 instanceof AnonymousClass2Z3) {
                NewsletterRequestReviewViewModel newsletterRequestReviewViewModel2 = this.this$0;
                C28981Uw A002 = r2.A00();
                String str3 = this.$reason;
                this.label = 2;
                A01 = NewsletterRequestReviewViewModel.A01(newsletterRequestReviewViewModel2, this, new NewsletterRequestReviewViewModel$submitSuspensionReview$2(A002, newsletterRequestReviewViewModel2, str3, (C023509x) null));
            } else if (r2 instanceof AnonymousClass2Z5) {
                NewsletterRequestReviewViewModel newsletterRequestReviewViewModel3 = this.this$0;
                C28981Uw A003 = r2.A00();
                String str4 = ((AnonymousClass2Z5) r2).A01;
                String str5 = this.$reason;
                this.label = 3;
                A01 = NewsletterRequestReviewViewModel.A01(newsletterRequestReviewViewModel3, this, new NewsletterRequestReviewViewModel$submitViolatingMessageReview$2(A003, newsletterRequestReviewViewModel3, str4, str5, (C023509x) null));
            }
            if (A01 == r1) {
                return r1;
            }
        } else if (i == 1 || i == 2 || i == 3) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterRequestReviewViewModel$submitReview$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
