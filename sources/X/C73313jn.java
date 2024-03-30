package X;

/* renamed from: X.3jn  reason: invalid class name and case insensitive filesystem */
public class C73313jn implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_quoted", "message_quoted_ui_elements");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r4 = new C64563Om[3];
        C52502pX r3 = C52502pX.INTEGER;
        r4[0] = new C64563Om(r3, "message_row_id", "NOT NULL PRIMARY KEY");
        r4[1] = C63573Ko.A02(A00, r3, "element_type");
        A00.A02 = "element_content";
        C63573Ko.A0T(A00, C52502pX.TEXT, r4);
        r8.A0B("message_quoted_ui_elements", r4);
    }
}
