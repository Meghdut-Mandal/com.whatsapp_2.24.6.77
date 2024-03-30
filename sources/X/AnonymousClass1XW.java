package X;

/* renamed from: X.1XW  reason: invalid class name */
public final class AnonymousClass1XW {
    public final AnonymousClass17Y A00;
    public final C24251Bs A01;
    public final AnonymousClass005 A02;

    public AnonymousClass1XW(AnonymousClass17Y r2, C24251Bs r3, AnonymousClass005 r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final AnonymousClass6OQ A00() {
        return ((AnonymousClass1UA) this.A02.get()).A00(C113335fN.A00);
    }

    public final void A02(AnonymousClass6AZ r5, AnonymousClass4TU r6) {
        ((AnonymousClass1UA) this.A02.get()).A04(new C90054Yx(r6, 1), C113335fN.A00, (C128936Ee) null, r5);
    }

    public final void A01() {
        if (A00() != null) {
            ((AnonymousClass1UU) ((AnonymousClass1UA) this.A02.get()).A00.get()).A06(C113335fN.A00);
        }
    }

    public final void A03(AnonymousClass4TU r5, String str) {
        if (A00() == null) {
            r5.onFailure(new IllegalStateException("Avatar user does not exist"));
            return;
        }
        ((AnonymousClass1UA) this.A02.get()).A05(new C90054Yx(r5, 0), C113335fN.A00, (C128936Ee) null, str);
    }
}
