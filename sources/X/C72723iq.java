package X;

/* renamed from: X.3iq  reason: invalid class name and case insensitive filesystem */
public class C72723iq implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_revoked");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, A0q);
        A00.A02 = "revoked_key_id";
        C63573Ko.A0W(A00, C52502pX.TEXT, A0q, A0i);
        C63573Ko.A08(A00, r2, "admin_jid_row_id", A0q);
        C63573Ko.A09(A00, r2, "revoke_timestamp", A0q);
        r7.A0B("message_revoked", A0q);
    }
}
