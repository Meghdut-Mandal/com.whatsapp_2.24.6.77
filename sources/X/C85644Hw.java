package X;

import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.4Hw  reason: invalid class name and case insensitive filesystem */
public final class C85644Hw extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $code;
    public final /* synthetic */ boolean $forceFetchViewerMetadata;
    public final /* synthetic */ C75803np $newsletterCallback;
    public final /* synthetic */ C28981Uw $newsletterJid;
    public final /* synthetic */ NewsletterLinkLauncher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85644Hw(C28981Uw r2, C75803np r3, NewsletterLinkLauncher newsletterLinkLauncher, String str, boolean z) {
        super(0);
        this.this$0 = newsletterLinkLauncher;
        this.$code = str;
        this.$newsletterJid = r2;
        this.$forceFetchViewerMetadata = z;
        this.$newsletterCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        NewsletterLinkLauncher newsletterLinkLauncher = this.this$0;
        String str = this.$code;
        newsletterLinkLauncher.A00 = ((C30131Zi) newsletterLinkLauncher.A0B.get()).A01(this.$newsletterJid, this.$newsletterCallback, str, false, this.$forceFetchViewerMetadata);
        return AnonymousClass0AJ.A00;
    }
}
