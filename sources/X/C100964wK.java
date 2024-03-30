package X;

import com.whatsapp.polls.PollCreatorActivity;

/* renamed from: X.4wK  reason: invalid class name and case insensitive filesystem */
public abstract class C100964wK extends AnonymousClass155 {
    public boolean A00 = false;

    public static void A01(C27111My r1, C18830tt r2, PollCreatorActivity pollCreatorActivity) {
        pollCreatorActivity.A0D = (C65493Sh) r2.A3I.get();
        pollCreatorActivity.A0E = (C64813Pn) r2.A9Z.get();
        pollCreatorActivity.A07 = (C115285id) r1.A1g.get();
        pollCreatorActivity.A08 = (C115295ie) r1.A1h.get();
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            PollCreatorActivity pollCreatorActivity = (PollCreatorActivity) this;
            C27111My r4 = (C27111My) C36421kH.A0H(this);
            C18800tq r2 = r4.A5g;
            C90464aC.A11(r2, pollCreatorActivity);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, pollCreatorActivity, C36321k7.A05(r2, r1, pollCreatorActivity));
            A01(r4, r1, pollCreatorActivity);
            pollCreatorActivity.A09 = C90474aD.A0R(r1);
        }
    }

    public C100964wK() {
        C163027pX.A00(this, 48);
    }
}
