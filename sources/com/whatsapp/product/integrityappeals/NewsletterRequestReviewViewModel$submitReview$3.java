package com.whatsapp.product.integrityappeals;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass2Yz;
import X.C001700s;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C51892oY;
import X.C82263yQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel$submitReview$3", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$submitReview$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $networkCall;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$submitReview$3(NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, C023509x r3, C006302t r4) {
        super(2, r3);
        this.$networkCall = r4;
        this.this$0 = newsletterRequestReviewViewModel;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new NewsletterRequestReviewViewModel$submitReview$3(this.this$0, r5, this.$networkCall);
    }

    public final Object invokeSuspend(Object obj) {
        C51892oY r0;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                C006302t r02 = this.$networkCall;
                this.label = 1;
                if (r02.invoke(this) == r2) {
                    return r2;
                }
            } catch (C82263yQ e) {
                boolean z = e instanceof AnonymousClass2Yz;
                C001700s r1 = this.this$0.A00;
                if (z) {
                    r0 = C51892oY.NO_CONNECTION;
                } else {
                    r0 = C51892oY.ERROR;
                }
                r1.A0C(r0);
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.this$0.A00.A0C(C51892oY.SUCCESS);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterRequestReviewViewModel$submitReview$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
