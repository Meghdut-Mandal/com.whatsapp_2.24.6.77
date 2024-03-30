package X;

/* renamed from: X.3hf  reason: invalid class name and case insensitive filesystem */
public class C71993hf implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("addon_message_media_message_row_id_index", "CREATE INDEX IF NOT EXISTS addon_message_media_message_row_id_index ON addon_message_media (message_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "addon_message_media");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[25];
        C52502pX A01 = C52502pX.A01(A00);
        A00.A00 = A01;
        A00.A05 = true;
        A00.A03 = true;
        C63573Ko.A0b(A00, r2);
        C63573Ko.A0R(A00, A01, "message_row_id", r2, true);
        C63573Ko.A0S(A00, A01, "addon_message_index", r2, true);
        C63573Ko.A09(A00, A01, "chat_row_id", r2);
        A00.A02 = "file_path";
        C52502pX r6 = C52502pX.TEXT;
        A00.A00 = r6;
        C63573Ko.A0c(A00, r2);
        C63573Ko.A0B(A00, A01, "file_size", r2);
        A00.A02 = "media_key";
        C52502pX r5 = C52502pX.BLOB;
        A00.A00 = r5;
        r2[6] = A00.A0r();
        C63573Ko.A0D(A00, A01, "media_key_timestamp", r2);
        C63573Ko.A0E(A00, A01, "width", r2);
        C63573Ko.A0F(A00, A01, "height", r2);
        C63573Ko.A0G(A00, r6, "direct_path", r2);
        C63573Ko.A0H(A00, r6, "message_url", r2);
        C63573Ko.A0I(A00, r6, "mime_type", r2);
        C63573Ko.A0J(A00, A01, "file_length", r2);
        C63573Ko.A0K(A00, r6, "file_hash", r2);
        C63573Ko.A0L(A00, r6, "enc_file_hash", r2);
        C63573Ko.A0M(A00, r6, "partial_media_hash", r2);
        C63573Ko.A0N(A00, r6, "partial_media_enc_hash", r2);
        C63573Ko.A0O(A00, r6, "original_file_hash", r2);
        C63573Ko.A0P(A00, r6, "thumbnail", r2);
        r2[20] = C63573Ko.A02(A00, r6, "thumbnail_direct_path");
        r2[21] = C63573Ko.A02(A00, r6, "thumbnail_hash");
        r2[22] = C63573Ko.A02(A00, r6, "enc_thumbnail_hash");
        r2[23] = C63573Ko.A02(A00, r5, "scans_sidecar");
        r2[24] = C63573Ko.A02(A00, A01, "transferred");
        r9.A0B("addon_message_media", r2);
    }
}
