package X;

/* renamed from: X.8d2  reason: invalid class name and case insensitive filesystem */
public final class C177008d2 extends C177178dN {
    public final AD1 A00;

    public AnonymousClass3T1 A00(C1275768v r6, AnonymousClass8SU r7, AnonymousClass3T1 r8) {
        AnonymousClass4TX r3;
        AnonymousClass00C.A0D(r8, 0);
        C36321k7.A0v(r7, 1, r6);
        super.A00(r6, r7, r8);
        if (!(r8 instanceof AnonymousClass4TX) || (r3 = (AnonymousClass4TX) r8) == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unsupported message type ");
            throw C165617ti.A0S(0, C36381kD.A10(A0u, r8.A1I));
        }
        boolean z = r8.A1J.A02;
        Integer A002 = AD1.A00(r7);
        int i = 9;
        if (z) {
            i = 8;
        }
        if (A002 != null && A002.intValue() == i) {
            r3.Bsk(1);
        }
        return r8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177008d2(C19700wN r1, AnonymousClass179 r2, C20520xh r3, AD1 ad1) {
        super(r1, r2, r3);
        C36321k7.A11(r1, r2, r3);
        this.A00 = ad1;
    }
}
