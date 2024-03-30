package X;

/* renamed from: X.1U9  reason: invalid class name */
public final class AnonymousClass1U9 {
    public final AnonymousClass1UA A00;
    public final AnonymousClass1UB A01;

    public AnonymousClass1U9(AnonymousClass1UA r2, AnonymousClass1UB r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(C160057kO r8) {
        AnonymousClass1UA r6 = this.A00;
        AnonymousClass6OQ A002 = r6.A00(C113435fX.A00);
        if (A002 == null) {
            r8.BWk(new IllegalStateException("user does not exist"));
        } else {
            r6.A01(A002, new C164067rD(r8, 1), new C128936Ee(3, AnonymousClass6X5.A0L));
        }
    }

    public final void A01(C160057kO r7) {
        AnonymousClass1UB r2 = this.A01;
        if (C19970wo.A00(r2.A01) / ((long) 1000) > AnonymousClass1UB.A00(r2).getLong("pref_ping_validity_time", 0)) {
            A00(r7);
        } else {
            r7.Bi5(this.A00.A00(C113435fX.A00));
        }
    }
}
