package X;

/* renamed from: X.3k6  reason: invalid class name and case insensitive filesystem */
public class C73503k6 implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_template_button_index", "CREATE INDEX IF NOT EXISTS message_template_button_index ON message_template_button (message_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_template", "message_template_button");
        C63843Lq.A01(r5, "message_template_button");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[12];
        C52502pX A01 = C52502pX.A01(A00);
        boolean A0g = C63573Ko.A0g(A00, A01, r3);
        C63573Ko.A0Q(A00, A01, "message_row_id", r3, A0g ? 1 : 0);
        A00.A02 = "text_data";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0Y(A00, r1, r3, A0g);
        C63573Ko.A09(A00, r1, "extra_data", r3);
        C63573Ko.A0A(A00, A01, "button_type", r3);
        C63573Ko.A0B(A00, A01, "used", r3);
        C63573Ko.A0C(A00, A01, "selected_index", r3);
        C63573Ko.A0D(A00, A01, "selected_carousel_card_index", r3);
        C63573Ko.A0E(A00, A01, "otp_button_type", r3);
        C63573Ko.A0F(A00, r1, "extra_consent_data", r3);
        C63573Ko.A0G(A00, r1, "otp_matched_package_name", r3);
        C63573Ko.A0H(A00, A01, "webview_presentation", r3);
        r8.A0B("message_template_button", r3);
    }
}
