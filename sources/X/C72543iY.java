package X;

/* renamed from: X.3iY  reason: invalid class name and case insensitive filesystem */
public class C72543iY implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_future");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[6];
        C52502pX A02 = C52502pX.A02(A00);
        C63573Ko.A0Q(A00, A02, "version", r3, C63573Ko.A0i(A00, A02, r3) ? 1 : 0);
        A00.A02 = "data";
        C52502pX r1 = C52502pX.BLOB;
        C63573Ko.A0T(A00, r1, r3);
        C63573Ko.A09(A00, A02, "future_message_type", r3);
        C63573Ko.A0A(A00, r1, "future_proof_stanza", r3);
        C63573Ko.A0B(A00, A02, "edit_version", r3);
        r7.A0B("message_future", r3);
    }
}
