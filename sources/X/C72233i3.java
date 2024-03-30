package X;

/* renamed from: X.3i3  reason: invalid class name and case insensitive filesystem */
public class C72233i3 implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_external_ad_content");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[15];
        C52502pX A02 = C52502pX.A02(A00);
        boolean A0i = C63573Ko.A0i(A00, A02, r3);
        A00.A02 = "title";
        C52502pX r2 = C52502pX.TEXT;
        C63573Ko.A0V(A00, r2, r3, A0i ? 1 : 0);
        C63573Ko.A08(A00, r2, "body", r3);
        C63573Ko.A09(A00, A02, "media_type", r3);
        C63573Ko.A0A(A00, r2, "thumbnail_url", r3);
        A00.A02 = "full_thumbnail";
        C52502pX r1 = C52502pX.BLOB;
        A00.A00 = r1;
        C63573Ko.A0d(A00, r3);
        C63573Ko.A0C(A00, r1, "micro_thumbnail", r3);
        C63573Ko.A0D(A00, r2, "media_url", r3);
        C63573Ko.A0E(A00, r2, "source_type", r3);
        C63573Ko.A0F(A00, r2, "source_id", r3);
        C63573Ko.A0G(A00, r2, "source_url", r3);
        A00.A02 = "render_larger_thumbnail";
        C52502pX r22 = C52502pX.BOOLEAN;
        A00.A00 = r22;
        r3[11] = A00.A0r();
        C63573Ko.A0I(A00, r22, "show_ad_attribution", r3);
        C63573Ko.A0J(A00, r22, "has_icebreaker_auto_response", r3);
        C63573Ko.A0K(A00, r22, "has_click_to_call_auto_response", r3);
        r8.A0B("message_external_ad_content", r3);
    }
}
