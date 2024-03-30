package X;

/* renamed from: X.3ka  reason: invalid class name and case insensitive filesystem */
public class C73803ka implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("incoming_tc_token_timestamp_index", "CREATE INDEX IF NOT EXISTS incoming_tc_token_timestamp_index ON wa_trusted_contacts (incoming_tc_token_timestamp)");
    }

    public void B7q(AnonymousClass38H r5, C65063Qo r6) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[3];
        A00.A02 = "jid";
        A00.A00 = C52502pX.TEXT;
        A00.A05 = true;
        C63573Ko.A0b(A00, r2);
        A00.A02 = "incoming_tc_token";
        C63573Ko.A0W(A00, C52502pX.BLOB, r2, true);
        A00.A02 = "incoming_tc_token_timestamp";
        C63573Ko.A0Y(A00, C52502pX.LONG, r2, true);
        r6.A0B("wa_trusted_contacts", r2);
    }
}
