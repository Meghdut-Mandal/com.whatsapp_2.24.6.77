package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.8fG  reason: invalid class name */
public final class AnonymousClass8fG extends C22726Aue {
    public transient C19700wN A00;
    public transient C26141Ja A01;
    public transient C30131Zi A02;
    public transient AnonymousClass1SL A03;
    public transient AnonymousClass19A A04;
    public final Long afterServerId;
    public final Long beforeServerId;
    public final C006302t callback;
    public final long count;
    public final C28981Uw newsletterJid;
    public final long sinceMs;
    public final String token;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8fG(C28981Uw r2, Long l, Long l2, String str, C006302t r6, long j, long j2) {
        super("GetNewsletterMetadataJob");
        AnonymousClass00C.A0D(str, 6);
        this.newsletterJid = r2;
        this.count = j;
        this.beforeServerId = l;
        this.afterServerId = l2;
        this.sinceMs = j2;
        this.token = str;
        this.callback = r6;
    }

    public boolean A0D(Exception exc) {
        return false;
    }

    public void A09() {
        Log.i("GetNewsletterMessagesUpdatesJob/onAdded");
    }

    public void A0A() {
        Log.i("GetNewsletterMessagesUpdatesJob/onCanceled");
    }

    public void A0B() {
        C19700wN r1;
        String str;
        int i;
        Long l = this.beforeServerId;
        if (l == null || l.longValue() >= 0) {
            long j = this.count;
            if (j < 1 || j > 300) {
                r1 = this.A00;
                if (r1 == null) {
                    throw C36331k8.A0d("crashLogs");
                }
                str = "GetNewsletterMessagesUpdatesJob/invalid params - count";
            } else if (!this.isCancelled) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("GetNewsletterMessagesUpdatesJob/onRun ");
                A0u.append(j);
                A0u.append(", ");
                A0u.append(l);
                A0u.append(", ");
                C36321k7.A1N(this.afterServerId, A0u);
                AnonymousClass19A r0 = this.A04;
                if (r0 == null) {
                    throw C36331k8.A0d("messageClient");
                }
                String A09 = r0.A09();
                C28981Uw r4 = this.newsletterJid;
                Long valueOf = Long.valueOf(this.count);
                Long valueOf2 = Long.valueOf(C36391kE.A0B(this.sinceMs));
                Long l2 = this.beforeServerId;
                if (l2 != null) {
                    i = 1;
                } else {
                    l2 = this.afterServerId;
                    if (l2 != null) {
                        i = 0;
                    } else {
                        throw AnonymousClass001.A08("GetNewsletterMessagesUpdatesJob/invalid before/after one of them must be set");
                    }
                }
                C186018vH r3 = new C186018vH(r4, new C185778um(l2, i), valueOf, valueOf2, A09);
                AnonymousClass19A r5 = this.A04;
                if (r5 == null) {
                    throw C36331k8.A0d("messageClient");
                }
                C203399nx r7 = r3.A00;
                AnonymousClass00C.A08(r7);
                r5.A0E(new C23220BAc(this, r3), r7, A09, 368, 32000);
                return;
            } else {
                return;
            }
        } else {
            r1 = this.A00;
            if (r1 == null) {
                throw C36331k8.A0d("crashLogs");
            }
            str = "GetNewsletterMessagesUpdatesJob/invalid params - beforeServerId";
        }
        r1.A0E(str, (String) null, false);
    }

    public void Bqf(Context context) {
        C18800tq A0P = C165577te.A0P(context);
        this.A00 = A0P.B3m();
        this.A04 = C36361kB.A0c(A0P);
        this.A01 = (C26141Ja) A0P.A5m.get();
        this.A02 = C36431kI.A0m(A0P);
        this.A03 = (AnonymousClass1SL) A0P.A5Z.get();
    }
}
