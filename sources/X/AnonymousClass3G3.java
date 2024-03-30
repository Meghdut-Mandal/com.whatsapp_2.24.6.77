package X;

/* renamed from: X.3G3  reason: invalid class name */
public final class AnonymousClass3G3 {
    public final C220412q A00;
    public final C20810yC A01;

    public final boolean A00(C44072La r4) {
        C52282pB r1;
        C52282pB r12;
        C20810yC r2 = this.A01;
        if (r2.A0E(3149)) {
            if (r4 != null) {
                r12 = r4.A0E;
            } else {
                r12 = null;
            }
            if (r12 == C52282pB.SUSPENDED) {
                return true;
            }
        }
        if (!r2.A0E(5161)) {
            return false;
        }
        if (r4 != null) {
            r1 = r4.A0E;
        } else {
            r1 = null;
        }
        if (r1 == C52282pB.GEOSUSPENDED) {
            return true;
        }
        return false;
    }

    public final boolean A01(C28981Uw r2) {
        if (r2 == null) {
            return false;
        }
        return A00((C44072La) C36371kC.A0W(this.A00, r2));
    }

    public AnonymousClass3G3(C220412q r1, C20810yC r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
