package X;

import java.lang.ref.Reference;

/* renamed from: X.9d4  reason: invalid class name and case insensitive filesystem */
public final class C198199d4 {
    public final AnonymousClass17Y A00;
    public final C20810yC A01;
    public final AnonymousClass1EV A02;
    public final AnonymousClass8gF A03;
    public final C24611Dc A04 = C165607th.A0a("IndiaUpiP2mCheckoutSessionRepository");
    public final C183358qf A05;
    public final AnonymousClass1FR A06;
    public final C19770wU A07;
    public final C19970wo A08;

    public static final void A00(C202059ky r4, C198199d4 r5, C186238vd r6, String str) {
        B1M b1m;
        C183358qf r3 = r5.A05;
        r3.A03.A04(AnonymousClass000.A0p("Removing pending callback for ", str, AnonymousClass000.A0u()));
        Reference reference = (Reference) r3.A00.remove(str);
        if (reference != null && (b1m = (B1M) reference.get()) != null) {
            r5.A04.A04(AnonymousClass000.A0p("Executing pending callback for ", str, AnonymousClass000.A0u()));
            if (r6 != null) {
                b1m.BfF(r6);
            }
            if (r4 != null) {
                b1m.BWg(r4);
            }
        }
    }

    public C198199d4(AnonymousClass17Y r2, C19970wo r3, C20810yC r4, AnonymousClass1EV r5, AnonymousClass8gF r6, C183358qf r7, AnonymousClass1FR r8, C19770wU r9) {
        C36321k7.A1B(r3, r4, r2, r9, r8);
        C36321k7.A10(r5, r7);
        this.A08 = r3;
        this.A01 = r4;
        this.A00 = r2;
        this.A07 = r9;
        this.A06 = r8;
        this.A02 = r5;
        this.A05 = r7;
        this.A03 = r6;
    }
}
