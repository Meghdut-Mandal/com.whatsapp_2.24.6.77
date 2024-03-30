package X;

/* renamed from: X.3kG  reason: invalid class name and case insensitive filesystem */
public final class C73603kG implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_comment_parent_message_row_id_unique_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_comment_parent_message_row_id_unique_index ON message_comment (parent_message_row_id, message_row_id)");
        r5.A07("message_comment_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_comment_message_row_id_index ON message_comment (message_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A03(r6, "message", "message_comment", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0l = C63573Ko.A0l(A01);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A01, r2, "parent_message_row_id", A0l, C63573Ko.A0f(A01, r2, A0l) ? 1 : 0);
        C63573Ko.A08(A01, r2, "message_row_id", A0l);
        r7.A0B("message_comment", A0l);
    }
}
