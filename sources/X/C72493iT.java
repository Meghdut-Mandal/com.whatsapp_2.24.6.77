package X;

/* renamed from: X.3iT  reason: invalid class name and case insensitive filesystem */
public class C72493iT implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_details_author_device_jid_index", "CREATE INDEX IF NOT EXISTS message_details_author_device_jid_index ON message_details (author_device_jid)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "message_details", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0o = C63573Ko.A0o(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "author_device_jid", A0o, C63573Ko.A0i(A00, r2, A0o) ? 1 : 0);
        r7.A0B("message_details", A0o);
    }
}
