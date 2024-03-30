package X;

/* renamed from: X.3jc  reason: invalid class name and case insensitive filesystem */
public class C73203jc implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[16];
        A00.A02 = "background_id";
        C52502pX r2 = C52502pX.TEXT;
        boolean A0i = C63573Ko.A0i(A00, r2, r3);
        A00.A02 = "file_size";
        C52502pX r5 = C52502pX.INTEGER;
        C63573Ko.A0V(A00, r5, r3, A0i ? 1 : 0);
        C63573Ko.A08(A00, r5, "width", r3);
        C63573Ko.A09(A00, r5, "height", r3);
        C63573Ko.A0A(A00, r2, "mime_type", r3);
        C63573Ko.A0B(A00, r5, "placeholder_color", r3);
        C63573Ko.A0C(A00, r5, "text_color", r3);
        C63573Ko.A0D(A00, r5, "subtext_color", r3);
        C63573Ko.A0E(A00, r2, "fullsize_url", r3);
        C63573Ko.A0F(A00, r2, "description", r3);
        C63573Ko.A0G(A00, r2, "lg", r3);
        r3[11] = C52502pX.A00(A00, "media_key");
        C63573Ko.A0I(A00, r5, "media_key_timestamp", r3);
        C63573Ko.A0J(A00, r2, "file_sha256", r3);
        C63573Ko.A0K(A00, r2, "file_enc_sha256", r3);
        C63573Ko.A0L(A00, r2, "direct_path", r3);
        r8.A0B("payment_background", r3);
    }
}
