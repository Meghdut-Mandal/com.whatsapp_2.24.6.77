package X;

/* renamed from: X.3ki  reason: invalid class name and case insensitive filesystem */
public class C73883ki implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("vname_localized_index", "CREATE UNIQUE INDEX IF NOT EXISTS vname_localized_index ON wa_vnames_localized (jid, lg, lc);");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0n = C63573Ko.A0n(A00);
        boolean A0g = C63573Ko.A0g(A00, C52502pX.INTEGER, A0n);
        A00.A02 = "jid";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0W(A00, r1, A0n, A0g);
        C63573Ko.A0S(A00, r1, "lg", A0n, A0g);
        A00.A02 = "lc";
        C63573Ko.A0Z(A00, r1, A0n, A0g);
        C63573Ko.A06(A00, r1, "verified_name", A0g);
        C63573Ko.A0c(A00, A0n);
        r7.A0B("wa_vnames_localized", A0n);
    }
}
