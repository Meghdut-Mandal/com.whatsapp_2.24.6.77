package X;

/* renamed from: X.1EJ  reason: invalid class name */
public class AnonymousClass1EJ implements AnonymousClass1EI {
    public final AnonymousClass1EH A00;

    public boolean BQ5(AnonymousClass3IP r3, AnonymousClass3T1 r4) {
        C63683Kz A0V;
        if (r3.A00.contains(C25111Fa.SKIP_THUMBNAILS) || (A0V = r4.A0V()) == null || A0V.A01()) {
            return false;
        }
        return true;
    }

    public AnonymousClass1EJ(AnonymousClass1EH r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass3T1 r3) {
        C63683Kz A0V = r3.A0V();
        C18740tg.A06(A0V);
        if (!A0V.A01()) {
            byte[] A1W = r3.A1W();
            if (A1W == null) {
                A1W = this.A00.A05(r3);
            }
            A0V.A00(A1W);
        }
    }

    public void BON(AnonymousClass3IP r2, AnonymousClass3T1 r3) {
        if (BQ5(r2, r3) && r3.A0V() != null) {
            A00(r3);
        }
    }
}
