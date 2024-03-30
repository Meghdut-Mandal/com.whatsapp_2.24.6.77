package X;

import com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient", f = "NewsletterAppealsClient.kt", i = {}, l = {134}, m = "createSuspensionAppeal", n = {}, s = {})
/* renamed from: X.3yj  reason: invalid class name and case insensitive filesystem */
public final class C82453yj extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NewsletterAppealsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82453yj(NewsletterAppealsClient newsletterAppealsClient, C023509x r2) {
        super(r2);
        this.this$0 = newsletterAppealsClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A05((C28981Uw) null, (String) null, this);
    }
}
