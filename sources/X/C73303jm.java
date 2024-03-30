package X;

/* renamed from: X.3jm  reason: invalid class name and case insensitive filesystem */
public class C73303jm implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_quoted", "message_quoted_group_invite");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r4 = new C64563Om[9];
        C52502pX A02 = C52502pX.A02(A00);
        A00.A00 = A02;
        boolean A0j = C63573Ko.A0j(A00, r4);
        C63573Ko.A0R(A00, A02, "group_jid_row_id", r4, true);
        C63573Ko.A0S(A00, A02, "admin_jid_row_id", r4, true);
        A00.A02 = "group_name";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0U(A00, r1, r4);
        C63573Ko.A0A(A00, r1, "invite_code", r4);
        C63573Ko.A0B(A00, A02, "expiration", r4);
        C63573Ko.A0C(A00, A02, "invite_time", r4);
        C63573Ko.A0D(A00, A02, "expired", r4);
        r4[8] = C63573Ko.A04(A00, A02, "group_type", A0j ? 1 : 0, true);
        r9.A0B("message_quoted_group_invite", r4);
    }
}
