package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.8fF  reason: invalid class name and case insensitive filesystem */
public final class C178188fF extends C22726Aue {
    public transient C19420v0 A00;
    public transient C26141Ja A01;
    public transient C30131Zi A02;
    public transient C31051bC A03;
    public transient AnonymousClass19A A04;
    public final long count;
    public final C28981Uw newsletterJid;

    public boolean A0D(Exception exc) {
        return true;
    }

    public C178188fF(C28981Uw r2, long j) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.count = j;
    }

    public void A09() {
        Log.i("GetNewsletterMyAddOnsMessagesJob/onAdded");
    }

    public void A0A() {
        Log.i("GetNewsletterMyAddOnsMessagesJob/onCanceled");
    }

    public void A0B() {
        if (!this.isCancelled) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GetNewsletterMyAddOnsMessagesJob/onRun ");
            A0u.append(this.newsletterJid);
            A0u.append(' ');
            C36351kA.A1S(A0u, this.count);
            AnonymousClass19A r0 = this.A04;
            if (r0 == null) {
                throw C36331k8.A0d("messageClient");
            }
            String A09 = r0.A09();
            C186018vH r02 = new C186018vH(this.newsletterJid, Long.valueOf(this.count), A09);
            AnonymousClass19A r1 = this.A04;
            if (r1 == null) {
                throw C36331k8.A0d("messageClient");
            }
            C203399nx r3 = r02.A00;
            AnonymousClass00C.A08(r3);
            r1.A0E(new C23220BAc(this, r02), r3, A09, 368, 32000);
        }
    }

    public void Bqf(Context context) {
        C18800tq A0P = C165577te.A0P(context);
        this.A04 = C36361kB.A0c(A0P);
        this.A01 = (C26141Ja) A0P.A5m.get();
        this.A02 = C36431kI.A0m(A0P);
        this.A00 = C36351kA.A0Y(A0P);
        this.A03 = (C31051bC) A0P.A5d.get();
    }
}
