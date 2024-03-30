package X;

/* renamed from: X.8dJ  reason: invalid class name and case insensitive filesystem */
public final class C177138dJ extends C21197ACf {
    public final C19970wo A00;

    public AnonymousClass3T1 A00(C1275768v r8, AnonymousClass8SU r9, AnonymousClass3T1 r10) {
        AnonymousClass00C.A0D(r10, 0);
        if (r10 instanceof AnonymousClass2bQ) {
            AnonymousClass2bQ r6 = (AnonymousClass2bQ) r10;
            boolean z = false;
            if (r6 != null) {
                if (r6.A01 * ((long) 1000) < C19970wo.A00(this.A00)) {
                    z = true;
                }
                r6.A07 = z;
                return r10;
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Unexpected message type: ");
        throw C165617ti.A0S(0, C36381kD.A10(A0u, r10.A1I));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177138dJ(C19970wo r1, C20520xh r2) {
        super(r2);
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
    }
}
