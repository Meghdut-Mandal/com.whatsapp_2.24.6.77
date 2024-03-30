package X;

/* renamed from: X.3iL  reason: invalid class name and case insensitive filesystem */
public class C72413iL implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r5 = new C64563Om[4];
        A00.A02 = "jid_row_id";
        C52502pX r4 = C52502pX.INTEGER;
        A00.A00 = r4;
        A00.A05 = true;
        C63573Ko.A0b(A00, r5);
        C63573Ko.A06(A00, r4, "is_pn_shared", true);
        A00.A01 = "0";
        C63573Ko.A0e(A00, r5, 1);
        C63573Ko.A06(A00, r4, "pn_requested_ts", true);
        A00.A01 = "0";
        r5[2] = A00.A0r();
        C63573Ko.A06(A00, r4, "pnh_duplicate_lid_thread", true);
        C63573Ko.A0a(A00, "0", r5);
        r9.A0B("lid_chat_state", r5);
    }
}
