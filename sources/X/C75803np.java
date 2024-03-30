package X;

import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.3np  reason: invalid class name and case insensitive filesystem */
public final class C75803np implements AnonymousClass4TM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass4RD A02;
    public final /* synthetic */ NewsletterLinkLauncher A03;
    public final /* synthetic */ Long A04;

    public void Bbg(C28981Uw r18) {
        C28981Uw r4 = r18;
        AnonymousClass00C.A0D(r4, 0);
        NewsletterLinkLauncher newsletterLinkLauncher = this.A03;
        long j = this.A01;
        int i = this.A00;
        Long l = this.A04;
        AnonymousClass4RD r5 = this.A02;
        if (j == -1 || !((C20800yB) newsletterLinkLauncher.A0G.getValue()).A0E(4682)) {
            newsletterLinkLauncher.A01.A01(r4);
            r5.BiR(r4, l, i, j);
            return;
        }
        AnonymousClass1SL r11 = newsletterLinkLauncher.A01;
        r11.A01(r4);
        C85654Hx r3 = new C85654Hx(r4, r5, l, i, j);
        if (C65903Tx.A06(r11.A01, r4, r11.A06)) {
            r11.A0B.Boy(new C35331iW(r11, r4, r3, 4, j));
        }
    }

    public void onError(Throwable th) {
        int i;
        String A0w;
        AnonymousClass00C.A0D(th, 0);
        C75813nq r2 = (C75813nq) this.A02;
        C225314u A0W = C36411kG.A0W(r2.A03);
        if (A0W != null) {
            r2.A01.A05(A0W);
            A0W.Bnv();
            if (th instanceof AnonymousClass8fQ) {
                i = R.string.f12nameremoved;
            } else if (th instanceof C178238fP) {
                int i2 = ((C21854Abe) th).code;
                if (i2 != 405) {
                    if (i2 == 451) {
                        AnonymousClass1ZS r1 = r2.A02;
                        String A012 = r1.A01(r1.A00());
                        if (A012 != null) {
                            A0w = C36351kA.A0w(A0W, A012, 1, R.string.f12nameremoved);
                            AnonymousClass00C.A0B(A0w);
                            A0W.BO7((String) null, A0w);
                        }
                    } else {
                        C28711Ts r12 = r2.A00;
                        C28711Ts r0 = C28711Ts.FORWARDED_MESSAGE;
                        i = R.string.f12nameremoved;
                        if (r12 == r0) {
                            i = R.string.f12nameremoved;
                        }
                    }
                }
                i = R.string.f12nameremoved;
            } else {
                i = R.string.f12nameremoved;
            }
            A0w = A0W.getString(i);
            AnonymousClass00C.A0B(A0w);
            A0W.BO7((String) null, A0w);
        }
    }

    public C75803np(AnonymousClass4RD r1, NewsletterLinkLauncher newsletterLinkLauncher, Long l, int i, long j) {
        this.A03 = newsletterLinkLauncher;
        this.A01 = j;
        this.A00 = i;
        this.A04 = l;
        this.A02 = r1;
    }
}
