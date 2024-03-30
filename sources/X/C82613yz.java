package X;

import com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel", f = "NewsletterSuspensionInfoViewModel.kt", i = {0}, l = {76}, m = "fetchAppealState", n = {"this"}, s = {"L$0"})
/* renamed from: X.3yz  reason: invalid class name and case insensitive filesystem */
public final class C82613yz extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NewsletterSuspensionInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82613yz(NewsletterSuspensionInfoViewModel newsletterSuspensionInfoViewModel, C023509x r2) {
        super(r2);
        this.this$0 = newsletterSuspensionInfoViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NewsletterSuspensionInfoViewModel.A01((C28981Uw) null, this.this$0, this);
    }
}
