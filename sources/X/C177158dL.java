package X;

/* renamed from: X.8dL  reason: invalid class name and case insensitive filesystem */
public final class C177158dL extends C21197ACf {
    public final C19970wo A00;

    public AnonymousClass3T1 A00(C1275768v r7, AnonymousClass8SU r8, AnonymousClass3T1 r9) {
        AnonymousClass2bP r5;
        AnonymousClass00C.A0D(r9, 0);
        if (!(r9 instanceof AnonymousClass2bP) || (r5 = (AnonymousClass2bP) r9) == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unexpected message type: ");
            throw C165617ti.A0S(0, C36381kD.A10(A0u, r9.A1I));
        }
        if (r5.A00 < C19970wo.A00(this.A00)) {
            r5.A00 = 0;
        }
        return r9;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177158dL(C19970wo r1, C20520xh r2) {
        super(r2);
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
    }
}
