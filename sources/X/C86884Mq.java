package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import java.lang.ref.WeakReference;

/* renamed from: X.4Mq  reason: invalid class name and case insensitive filesystem */
public final class C86884Mq extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ WeakReference $activityWeakReference;
    public final /* synthetic */ String $code;
    public final /* synthetic */ int $messageType;
    public final /* synthetic */ C28981Uw $newsletterJid;
    public final /* synthetic */ C28711Ts $newsletterLinkType;
    public final /* synthetic */ long $serverMessageId;
    public final /* synthetic */ Long $similarNewslettersSessionId;
    public final /* synthetic */ NewsletterLinkLauncher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86884Mq(C28981Uw r2, C28711Ts r3, NewsletterLinkLauncher newsletterLinkLauncher, Long l, String str, WeakReference weakReference, int i, long j) {
        super(1);
        this.$activityWeakReference = weakReference;
        this.this$0 = newsletterLinkLauncher;
        this.$code = str;
        this.$newsletterJid = r2;
        this.$serverMessageId = j;
        this.$newsletterLinkType = r3;
        this.$similarNewslettersSessionId = l;
        this.$messageType = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context A0G = C36441kJ.A0G(this.$activityWeakReference);
        if (A0G != null) {
            NewsletterLinkLauncher newsletterLinkLauncher = this.this$0;
            String str = this.$code;
            C28981Uw r11 = this.$newsletterJid;
            long j = this.$serverMessageId;
            C28711Ts r2 = this.$newsletterLinkType;
            Long l = this.$similarNewslettersSessionId;
            int i = this.$messageType;
            C225314u r1 = (C225314u) C36381kD.A0A(A0G);
            if (!((C19600wD) newsletterLinkLauncher.A04.get()).A09()) {
                r1.BO5(R.string.f12nameremoved);
            } else {
                r1.A06.A04(newsletterLinkLauncher);
                AnonymousClass351 r3 = new AnonymousClass351(r1);
                r1.A30(new AnonymousClass3WC(r1, r3, newsletterLinkLauncher), 0, R.string.f12nameremoved);
                boolean A1a = C36361kB.A1a(r2, C28711Ts.ADMIN_INVITE);
                C75813nq r5 = new C75813nq(r1, r2, newsletterLinkLauncher, (AnonymousClass1ZS) C36411kG.A0v(newsletterLinkLauncher.A09));
                AnonymousClass4PA r0 = newsletterLinkLauncher.A00;
                if (r0 != null) {
                    r0.cancel();
                }
                ((C19770wU) newsletterLinkLauncher.A0M.getValue()).Boy(new C35631j0(newsletterLinkLauncher, r3, new C85644Hw(r11, new C75803np(r5, newsletterLinkLauncher, l, i, j), newsletterLinkLauncher, str, A1a), 39));
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
