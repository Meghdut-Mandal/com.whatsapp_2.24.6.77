package X;

/* renamed from: X.3im  reason: invalid class name and case insensitive filesystem */
public class C72683im implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_quoted", "message_quoted_media");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[20];
        C52502pX A02 = C52502pX.A02(A00);
        boolean A0i = C63573Ko.A0i(A00, A02, r2);
        A00.A02 = "media_job_uuid";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0V(A00, r1, r2, A0i ? 1 : 0);
        C63573Ko.A08(A00, A02, "transferred", r2);
        C63573Ko.A09(A00, r1, "file_path", r2);
        C63573Ko.A0A(A00, A02, "file_size", r2);
        A00.A02 = "media_key";
        C52502pX r4 = C52502pX.BLOB;
        A00.A00 = r4;
        C63573Ko.A0d(A00, r2);
        C63573Ko.A0C(A00, A02, "media_key_timestamp", r2);
        C63573Ko.A0D(A00, A02, "width", r2);
        C63573Ko.A0E(A00, A02, "height", r2);
        C63573Ko.A0F(A00, r1, "direct_path", r2);
        C63573Ko.A0G(A00, r1, "message_url", r2);
        C63573Ko.A0H(A00, r1, "mime_type", r2);
        C63573Ko.A0I(A00, A02, "file_length", r2);
        C63573Ko.A0J(A00, r1, "media_name", r2);
        C63573Ko.A0K(A00, r1, "file_hash", r2);
        C63573Ko.A0L(A00, A02, "media_duration", r2);
        C63573Ko.A0M(A00, A02, "page_count", r2);
        C63573Ko.A0N(A00, r1, "enc_file_hash", r2);
        C63573Ko.A0O(A00, r4, "thumbnail", r2);
        C63573Ko.A0P(A00, r1, "media_caption", r2);
        r8.A0B("message_quoted_media", r2);
    }
}
