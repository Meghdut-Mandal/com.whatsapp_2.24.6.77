package X;

/* renamed from: X.3iC  reason: invalid class name and case insensitive filesystem */
public final class C72323iC implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("integrator_opt_in_index", "CREATE INDEX IF NOT EXISTS integrator_opt_in_index ON integrator_display_name (opt_in_status)");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A01 = C63573Ko.A01(r9);
        C64563Om[] r4 = new C64563Om[6];
        A01.A02 = "integrator_id";
        C52502pX r3 = C52502pX.INTEGER;
        A01.A00 = r3;
        A01.A05 = true;
        A01.A04 = true;
        C63573Ko.A0e(A01, r4, 0);
        A01.A02 = "display_name";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0W(A01, r1, r4, true);
        C63573Ko.A0S(A01, r3, "status", r4, true);
        C63573Ko.A06(A01, r1, "icon_path", true);
        C63573Ko.A0a(A01, "''", r4);
        r4[4] = C63573Ko.A04(A01, r3, "opt_in_status", 0, true);
        r4[5] = C63573Ko.A04(A01, r3, "identifier_type", 0, true);
        r9.A0B("integrator_display_name", r4);
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
