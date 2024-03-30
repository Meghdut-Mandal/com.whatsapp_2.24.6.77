package X;

/* renamed from: X.3kb  reason: invalid class name and case insensitive filesystem */
public class C73813kb implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("sent_tc_token_timestamp_index", "CREATE INDEX IF NOT EXISTS sent_tc_token_timestamp_index ON wa_trusted_contacts_send (sent_tc_token_timestamp)");
        r5.A07("sent_real_issue_timestamp_index", "CREATE INDEX IF NOT EXISTS sent_real_issue_timestamp_index ON wa_trusted_contacts_send (real_issue_timestamp)");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[3];
        A00.A02 = "jid";
        A00.A00 = C52502pX.TEXT;
        A00.A05 = true;
        C63573Ko.A0b(A00, r3);
        A00.A02 = "sent_tc_token_timestamp";
        C52502pX r1 = C52502pX.LONG;
        C63573Ko.A0W(A00, r1, r3, true);
        C63573Ko.A08(A00, r1, "real_issue_timestamp", r3);
        r7.A0B("wa_trusted_contacts_send", r3);
    }
}
