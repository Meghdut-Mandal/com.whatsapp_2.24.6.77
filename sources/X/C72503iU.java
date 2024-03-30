package X;

/* renamed from: X.3iU  reason: invalid class name and case insensitive filesystem */
public class C72503iU implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_edit_info_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_edit_info_index ON message_edit_info (original_key_id)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_edit_info");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, A0q);
        A00.A02 = "original_key_id";
        C63573Ko.A0W(A00, C52502pX.TEXT, A0q, A0i);
        C63573Ko.A0S(A00, r2, "edited_timestamp", A0q, A0i);
        A00.A02 = "sender_timestamp";
        C63573Ko.A0Z(A00, r2, A0q, A0i);
        r7.A0B("message_edit_info", A0q);
    }
}
