package X;

/* renamed from: X.3ht  reason: invalid class name and case insensitive filesystem */
public class C72133ht implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("call_link_token_index", "CREATE UNIQUE INDEX IF NOT EXISTS call_link_token_index ON call_link(token)");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0l = C63573Ko.A0l(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0g = C63573Ko.A0g(A00, r2, A0l);
        A00.A02 = "token";
        C63573Ko.A0W(A00, C52502pX.TEXT, A0l, A0g);
        C63573Ko.A07(A00, r2, "creator_jid_row_id", A0g);
        A0l[2] = A00.A0r();
        r7.A0B("call_link", A0l);
    }
}
