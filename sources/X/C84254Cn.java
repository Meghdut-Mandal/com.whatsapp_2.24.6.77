package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity;

/* renamed from: X.4Cn  reason: invalid class name and case insensitive filesystem */
public final class C84254Cn extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ NewsletterTransferOwnershipActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84254Cn(NewsletterTransferOwnershipActivity newsletterTransferOwnershipActivity) {
        super(0);
        this.this$0 = newsletterTransferOwnershipActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return UserJid.Companion.A02(this.this$0.getIntent().getStringExtra("transfer_ownership_admin_jid"));
    }
}
