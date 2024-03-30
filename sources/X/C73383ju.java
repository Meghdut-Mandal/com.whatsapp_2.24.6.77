package X;

/* renamed from: X.3ju  reason: invalid class name and case insensitive filesystem */
public class C73383ju implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("receipt_user_index", "CREATE UNIQUE INDEX IF NOT EXISTS receipt_user_index ON receipt_user(message_row_id,receipt_user_jid_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "receipt_user");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[6];
        C52502pX A01 = C52502pX.A01(A00);
        boolean A0g = C63573Ko.A0g(A00, A01, r3);
        C63573Ko.A0R(A00, A01, "message_row_id", r3, A0g);
        C63573Ko.A0S(A00, A01, "receipt_user_jid_row_id", r3, A0g);
        C63573Ko.A09(A00, A01, "receipt_timestamp", r3);
        C63573Ko.A0A(A00, A01, "read_timestamp", r3);
        C63573Ko.A0B(A00, A01, "played_timestamp", r3);
        r7.A0B("receipt_user", r3);
    }
}
