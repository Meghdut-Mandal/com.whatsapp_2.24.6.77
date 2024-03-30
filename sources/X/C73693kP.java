package X;

/* renamed from: X.3kP  reason: invalid class name and case insensitive filesystem */
public class C73693kP implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("wa_group_descriptions_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS wa_group_descriptions_jid_index ON wa_group_descriptions(jid)");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r4 = new C64563Om[6];
        A00.A02 = "jid";
        C52502pX r3 = C52502pX.TEXT;
        A00.A00 = r3;
        C63573Ko.A0b(A00, r4);
        C63573Ko.A0R(A00, r3, "description", r4, true);
        A00.A02 = "description_id";
        C52502pX r1 = C52502pX.INTEGER;
        C63573Ko.A0T(A00, r1, r4);
        C63573Ko.A09(A00, r1, "description_time", r4);
        C63573Ko.A06(A00, r3, "description_setter_jid", true);
        C63573Ko.A0c(A00, r4);
        C63573Ko.A06(A00, r3, "description_id_string", true);
        A00.A01 = "''";
        C63573Ko.A0d(A00, r4);
        r8.A0B("wa_group_descriptions", r4);
    }
}
