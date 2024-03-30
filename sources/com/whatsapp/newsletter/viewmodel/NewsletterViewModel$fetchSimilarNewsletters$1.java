package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1ZS;
import X.AnonymousClass2YI;
import X.AnonymousClass3N6;
import X.AnonymousClass4OL;
import X.C009003v;
import X.C023509x;
import X.C18800tq;
import X.C19770wU;
import X.C28981Uw;
import X.C30131Zi;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.viewmodel.NewsletterViewModel$fetchSimilarNewsletters$1", f = "NewsletterViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterViewModel$fetchSimilarNewsletters$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ NewsletterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterViewModel$fetchSimilarNewsletters$1(NewsletterViewModel newsletterViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = newsletterViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new NewsletterViewModel$fetchSimilarNewsletters$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterViewModel$fetchSimilarNewsletters$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            NewsletterViewModel newsletterViewModel = this.this$0;
            C30131Zi r2 = newsletterViewModel.A04;
            C28981Uw r4 = newsletterViewModel.A05;
            AnonymousClass3N6 r8 = new AnonymousClass3N6(newsletterViewModel);
            int A07 = r2.A0E.A07(7559);
            C18800tq r1 = r2.A09.A00.A00;
            C19770wU A0Z = C36341k9.A0Z(r1);
            new AnonymousClass2YI(C36351kA.A0a(r1), C36391kE.A0g(r1), r4, (AnonymousClass4OL) r1.A5l.get(), (AnonymousClass1ZS) r1.A5b.get(), r1.Azc(), r8, A0Z, A07).A01();
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
