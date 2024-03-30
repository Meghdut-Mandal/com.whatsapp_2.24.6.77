package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import java.lang.ref.WeakReference;

/* renamed from: X.3nq  reason: invalid class name and case insensitive filesystem */
public final class C75813nq implements AnonymousClass4RD {
    public final C28711Ts A00;
    public final NewsletterLinkLauncher A01;
    public final AnonymousClass1ZS A02;
    public final WeakReference A03;

    public C75813nq(C225314u r2, C28711Ts r3, NewsletterLinkLauncher newsletterLinkLauncher, AnonymousClass1ZS r5) {
        C36331k8.A1G(r3, 3, r5);
        this.A01 = newsletterLinkLauncher;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = AnonymousClass001.A0F(r2);
    }

    public void BiR(AnonymousClass11F r16, Long l, int i, long j) {
        String str;
        AnonymousClass11F r9 = r16;
        AnonymousClass00C.A0D(r9, 0);
        C225314u A0W = C36411kG.A0W(this.A03);
        if (A0W != null) {
            NewsletterLinkLauncher newsletterLinkLauncher = this.A01;
            newsletterLinkLauncher.A05(A0W);
            C28711Ts r0 = this.A00;
            A0W.Bnv();
            int A002 = r0.A00();
            AnonymousClass005 r3 = newsletterLinkLauncher.A0E;
            r3.get();
            Intent putExtra = AnonymousClass190.A0F(A0W, A002).putExtra("jid", r9.getRawString()).putExtra("start_t", SystemClock.uptimeMillis());
            AnonymousClass00C.A08(putExtra);
            int i2 = i;
            putExtra.putExtra("extra_forwarded_message_thread_type", i2);
            long j2 = j;
            if (!(j == -1 || j == 0 || !((C20800yB) newsletterLinkLauncher.A0G.getValue()).A0E(4682))) {
                AnonymousClass3T1 A022 = ((AnonymousClass1SM) newsletterLinkLauncher.A0K.getValue()).A02((C28981Uw) r9, j2);
                if (A022 != null) {
                    r3.get();
                    C64933Qa r32 = A022.A1J;
                    putExtra = AnonymousClass190.A0F(A0W, A002).putExtra("jid", AnonymousClass143.A03(r32.A00)).putExtra("start_t", SystemClock.uptimeMillis()).putExtra("row_id", A022.A1N).putExtra("sort_id", A022.A1O);
                    AnonymousClass3UJ.A00(putExtra, r32);
                    AnonymousClass00C.A08(putExtra);
                    putExtra.putExtra("extra_forwarded_message_thread_type", i2);
                    if (C66013Ui.A0n(A022)) {
                        str = "show_revoked_newsletter_message_dialog";
                    }
                } else {
                    str = "show_expired_newsletter_message_dialog";
                }
                putExtra.putExtra(str, true);
            }
            putExtra.putExtra("similar_newsletters_session_id", l);
            ((C24801Dv) newsletterLinkLauncher.A03.get()).A08(A0W, putExtra, "NewsletterLinkLauncher:openNewsletterScreen");
        }
    }
}
