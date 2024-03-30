package com.whatsapp.newsletter.ui.reactions;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass80R;
import X.C009003v;
import X.C023509x;
import X.C15390nG;
import X.C164247rV;
import X.C167707yf;
import X.C90464aC;
import android.widget.ProgressBar;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1", f = "NewsletterReactionsSheet.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ ProgressBar $loaderView;
    public final /* synthetic */ C167707yf $this_apply;
    public int label;
    public final /* synthetic */ NewsletterReactionsSheet this$0;
    public final /* synthetic */ AnonymousClass80R this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1(ProgressBar progressBar, AnonymousClass80R r3, NewsletterReactionsSheet newsletterReactionsSheet, C167707yf r5, C023509x r6) {
        super(2, r6);
        this.$this_apply = r5;
        this.this$0 = newsletterReactionsSheet;
        this.this$1 = r3;
        this.$loaderView = progressBar;
    }

    public final C023509x create(Object obj, C023509x r8) {
        C167707yf r4 = this.$this_apply;
        NewsletterReactionsSheet newsletterReactionsSheet = this.this$0;
        return new NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1(this.$loaderView, this.this$1, newsletterReactionsSheet, r4, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C15390nG A0p = C90464aC.A0p(this.this$0, this.$this_apply.A0B);
            C164247rV r0 = new C164247rV((Object) this.$loaderView, (Object) this.this$1, 11);
            this.label = 1;
            if (A0p.B36(this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterReactionsSheet$TabsPagerAdapter$instantiateItem$3$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
