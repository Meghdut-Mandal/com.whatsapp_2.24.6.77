package X;

/* renamed from: X.3kM  reason: invalid class name and case insensitive filesystem */
public class C73663kM implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("wa_contact_storage_usage_index", " CREATE INDEX IF NOT EXISTS wa_contact_storage_usage_index ON wa_contact_storage_usage (jid, conversation_size DESC)");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0m = C63573Ko.A0m(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0g = C63573Ko.A0g(A00, r2, A0m);
        A00.A02 = "jid";
        C63573Ko.A0W(A00, C52502pX.TEXT, A0m, A0g);
        C63573Ko.A0S(A00, r2, "conversation_size", A0m, A0g);
        A00.A02 = "conversation_message_count";
        C63573Ko.A0Z(A00, r2, A0m, A0g);
        r7.A0B("wa_contact_storage_usage", A0m);
    }
}
