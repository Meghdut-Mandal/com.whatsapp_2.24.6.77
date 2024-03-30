package X;

/* renamed from: X.3kF  reason: invalid class name and case insensitive filesystem */
public final class C73593kF implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_parent_last_comment_index", "\n          CREATE INDEX IF NOT EXISTS \n          message_parent_last_comment_index \n          ON message_comment_parent (chat_row_id, last_comment_message_row_id)\n        ");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        AnonymousClass00C.A0D(r4, 0);
        C63843Lq.A01(r4, "message_comment_parent");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] r3 = new C64563Om[5];
        C52502pX A02 = C52502pX.A02(A01);
        boolean A0h = C63573Ko.A0h(A01, A02, r3);
        C63573Ko.A0Q(A01, A02, "chat_row_id", r3, A0h ? 1 : 0);
        C63573Ko.A0S(A01, A02, "number_of_comments", r3, A0h);
        C63573Ko.A09(A01, A02, "last_comment_ts", r3);
        C63573Ko.A0A(A01, A02, "last_comment_message_row_id", r3);
        r7.A0B("message_comment_parent", r3);
    }
}
