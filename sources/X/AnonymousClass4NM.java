package X;

import android.os.Bundle;
import com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet;
import java.lang.ref.WeakReference;

/* renamed from: X.4NM  reason: invalid class name */
public final class AnonymousClass4NM extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ WeakReference $activityWeakReference;
    public final /* synthetic */ long $expirationTimestamp;
    public final /* synthetic */ C28981Uw $newsletterJid;
    public final /* synthetic */ String $newsletterName;
    public final /* synthetic */ AnonymousClass8ZK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4NM(AnonymousClass8ZK r2, C28981Uw r3, String str, WeakReference weakReference, long j) {
        super(1);
        this.this$0 = r2;
        this.$newsletterJid = r3;
        this.$newsletterName = str;
        this.$expirationTimestamp = j;
        this.$activityWeakReference = weakReference;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1X = AnonymousClass000.A1X(obj);
        ((C20780y9) this.this$0.A28.get()).A01(C20630xs.class);
        C28981Uw r6 = this.$newsletterJid;
        String str = this.$newsletterName;
        long j = this.$expirationTimestamp;
        C36321k7.A0w(r6, str);
        NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = new NewsletterAcceptAdminInviteSheet();
        Bundle A07 = AnonymousClass001.A07();
        C36401kF.A14(A07, r6, "newsletter_jid");
        A07.putString("newsletter_name", str);
        A07.putLong("invite_expiration_ts", j);
        A07.putBoolean("from_tos_accepted", A1X);
        newsletterAcceptAdminInviteSheet.A17(A07);
        AnonymousClass01I r0 = (AnonymousClass01I) this.$activityWeakReference.get();
        if (r0 != null) {
            C65443Sb.A00(newsletterAcceptAdminInviteSheet, r0);
        }
        return AnonymousClass0AJ.A00;
    }
}
