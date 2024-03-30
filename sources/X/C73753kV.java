package X;

/* renamed from: X.3kV  reason: invalid class name and case insensitive filesystem */
public class C73753kV implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("entry_point_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS entry_point_jid_index ON wa_last_entry_point (jid)");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[4];
        A00.A02 = "jid";
        C52502pX r2 = C52502pX.TEXT;
        A00.A00 = r2;
        C63573Ko.A0b(A00, r3);
        C63573Ko.A0R(A00, r2, "entry_point_type", r3, true);
        C63573Ko.A08(A00, r2, "entry_point_id", r3);
        A00.A02 = "entry_point_time";
        C63573Ko.A0U(A00, C52502pX.INTEGER, r3);
        r7.A0B("wa_last_entry_point", r3);
    }
}
