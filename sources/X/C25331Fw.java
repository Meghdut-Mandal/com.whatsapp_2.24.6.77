package X;

/* renamed from: X.1Fw  reason: invalid class name and case insensitive filesystem */
public final class C25331Fw {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final C19460v5 A04;

    public C25331Fw(C19460v5 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r2, 5);
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r5;
        this.A00 = r6;
        this.A04 = r2;
    }

    public static final void A00(C25331Fw r1) {
        C19460v5 r12 = r1.A04;
        if (r12.A05()) {
            r12.A02();
            throw new NullPointerException("isTracingEnabled");
        }
    }
}
