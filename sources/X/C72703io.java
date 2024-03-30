package X;

/* renamed from: X.3io  reason: invalid class name and case insensitive filesystem */
public class C72703io implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_quoted", "message_quoted_location");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[7];
        boolean A0i = C63573Ko.A0i(A00, C52502pX.A02(A00), r3);
        A00.A02 = "latitude";
        C52502pX r1 = C52502pX.REAL;
        C63573Ko.A0V(A00, r1, r3, A0i ? 1 : 0);
        C63573Ko.A08(A00, r1, "longitude", r3);
        A00.A02 = "place_name";
        C52502pX r12 = C52502pX.TEXT;
        C63573Ko.A0U(A00, r12, r3);
        C63573Ko.A0A(A00, r12, "place_address", r3);
        C63573Ko.A0B(A00, r12, "url", r3);
        r3[6] = C52502pX.A00(A00, "thumbnail");
        r7.A0B("message_quoted_location", r3);
    }
}
