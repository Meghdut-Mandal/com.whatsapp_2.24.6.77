package X;

import android.net.Uri;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.3o9  reason: invalid class name and case insensitive filesystem */
public class C75993o9 implements C32131d1 {
    public final Long A00 = Long.valueOf(AnonymousClass0XG.A00.A05(Long.MAX_VALUE));
    public final /* synthetic */ C64543Ok A01;

    public C75993o9(C64543Ok r4) {
        this.A01 = r4;
        C70803fk.A0G(r4.A02).A09.get();
    }

    public void BZJ(C44072La r5, AnonymousClass00S r6) {
        C70803fk r1 = this.A01.A02;
        C225314u A0S = C36381kD.A0S(C70803fk.A0C(r1));
        AnonymousClass3UC r2 = r1.A4G;
        C82053y4 r12 = new C82053y4(this, r5, r6);
        AnonymousClass00C.A0D(A0S, 0);
        r2.A0A(A0S, C51582o3.CONSUMER, r12);
    }

    public void Bba(C44072La r13) {
        String str = r13.A0J;
        if (str != null) {
            C70803fk r0 = this.A01.A02;
            NewsletterLinkLauncher newsletterLinkLauncher = r0.A4F;
            AnonymousClass155 A0C = C70803fk.A0C(r0);
            C28711Ts r6 = C28711Ts.SIMILAR_NEWSLETTERS_NEWSLETTER_THREAD;
            Long l = this.A00;
            AnonymousClass00C.A0D(A0C, 0);
            newsletterLinkLauncher.A01(A0C, Uri.parse(AnonymousClass000.A0p("whatsapp://channel/", str, AnonymousClass000.A0u())), (C28981Uw) null, r6, l, str, 0, -1);
        }
    }
}
