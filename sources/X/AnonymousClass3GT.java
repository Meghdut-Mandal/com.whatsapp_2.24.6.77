package X;

/* renamed from: X.3GT  reason: invalid class name */
public final class AnonymousClass3GT {
    public final C20810yC A00;
    public final AnonymousClass1BF A01;
    public final C19420v0 A02;

    public final void A00(int i) {
        C19420v0 r0;
        boolean z;
        AnonymousClass1BF r1 = this.A01;
        if ((!r1.A01() || i < 4) && (r1.A01() || i < 3)) {
            r0 = this.A02;
            z = false;
        } else {
            r0 = this.A02;
            z = true;
        }
        C36331k8.A0w(C19420v0.A00(r0), "sticker_contextual_suggestion_eligibility", z);
    }

    public final boolean A01() {
        if (C36371kC.A1U(C36341k9.A0E(this.A02), "sticker_contextual_suggestion_eligibility")) {
            return true;
        }
        if (!this.A00.A0E(3403) || !this.A01.A01()) {
            return false;
        }
        return true;
    }

    public AnonymousClass3GT(C19420v0 r1, C20810yC r2, AnonymousClass1BF r3) {
        C36321k7.A11(r2, r1, r3);
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
    }
}
