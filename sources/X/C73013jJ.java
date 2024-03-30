package X;

/* renamed from: X.3jJ  reason: invalid class name and case insensitive filesystem */
public class C73013jJ implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_text");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[10];
        C52502pX A02 = C52502pX.A02(A00);
        boolean A0i = C63573Ko.A0i(A00, A02, r3);
        A00.A02 = "description";
        C52502pX r2 = C52502pX.TEXT;
        C63573Ko.A0V(A00, r2, r3, A0i ? 1 : 0);
        C63573Ko.A08(A00, r2, "page_title", r3);
        C63573Ko.A09(A00, r2, "url", r3);
        C63573Ko.A0A(A00, A02, "font_style", r3);
        C63573Ko.A0B(A00, A02, "text_color", r3);
        C63573Ko.A0C(A00, A02, "background_color", r3);
        C63573Ko.A0D(A00, A02, "preview_type", r3);
        C63573Ko.A07(A00, A02, "invite_link_group_type", A0i);
        r3[8] = A00.A0r();
        C63573Ko.A0F(A00, r2, "counter_abuse_token", r3);
        r8.A0B("message_text", r3);
    }
}
