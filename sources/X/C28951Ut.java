package X;

/* renamed from: X.1Ut  reason: invalid class name and case insensitive filesystem */
public final class C28951Ut implements C28911Up {
    public final C220412q A00;

    public C28951Ut(C220412q r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void B0W(C28891Um r3, AnonymousClass11F r4) {
        C44072La r1;
        AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
        r3.A0C = r4.user;
        r3.A07 = 5;
        C65073Qp A09 = this.A00.A09(r4, false);
        if ((A09 instanceof C44072La) && (r1 = (C44072La) A09) != null) {
            r3.A09 = Long.valueOf(r1.A07);
        }
    }

    public boolean BtG(AnonymousClass11F r2) {
        return r2 instanceof C28981Uw;
    }
}
