package X;

/* renamed from: X.3iz  reason: invalid class name and case insensitive filesystem */
public class C72813iz implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_system", "message_system_community_link_changed");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, A0q);
        C63573Ko.A0Q(A00, r2, "old_group_type", A0q, A0i ? 1 : 0);
        C63573Ko.A0S(A00, r2, "new_group_type", A0q, A0i);
        C63573Ko.A09(A00, r2, "linked_parent_group_jid_row_id", A0q);
        r7.A0B("message_system_community_link_changed", A0q);
    }
}