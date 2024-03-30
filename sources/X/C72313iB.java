package X;

/* renamed from: X.3iB  reason: invalid class name and case insensitive filesystem */
public class C72313iB implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        r6.A09("message_ui_elements", "message_ui_elements_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_ui_elements_message_row_id_index ON message_ui_elements (message_row_id)");
        r6.A09("message_ui_elements", "message_ui_elements_element_type_index", "CREATE INDEX IF NOT EXISTS message_ui_elements_element_type_index ON message_ui_elements (element_type)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_ui_elements");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0m = C63573Ko.A0m(A00);
        C52502pX r2 = C52502pX.INTEGER;
        A00.A00 = r2;
        A00.A05 = true;
        A00.A03 = true;
        C63573Ko.A0b(A00, A0m);
        C63573Ko.A0R(A00, r2, "message_row_id", A0m, true);
        C63573Ko.A08(A00, r2, "element_type", A0m);
        A00.A02 = "element_content";
        C63573Ko.A0U(A00, C52502pX.TEXT, A0m);
        r7.A0B("message_ui_elements", A0m);
    }
}
