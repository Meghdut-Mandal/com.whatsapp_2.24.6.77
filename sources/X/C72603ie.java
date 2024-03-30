package X;

/* renamed from: X.3ie  reason: invalid class name and case insensitive filesystem */
public final class C72603ie implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_parent_association_parent_message_row_id_and_association_type_index", "CREATE INDEX IF NOT EXISTS message_parent_association_parent_message_row_id_and_association_type_index ON message_parent_association (parent_message_row_id, association_type)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A03(r6, "message", "message_parent_association", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0p = C63573Ko.A0p(A01);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0h = C63573Ko.A0h(A01, r2, A0p);
        C63573Ko.A0R(A01, r2, "parent_message_row_id", A0p, A0h);
        C63573Ko.A0S(A01, r2, "association_type", A0p, A0h);
        r7.A0B("message_parent_association", A0p);
    }
}
