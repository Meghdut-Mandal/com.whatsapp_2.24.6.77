package X;

/* renamed from: X.3ku  reason: invalid class name and case insensitive filesystem */
public class C74003ku implements AnonymousClass15z {
    public static final C74003ku $redex_init_class = null;

    static {
        AnonymousClass1M2.A01("message_media", new String[]{"media_name", "file_path", "width", "height"});
    }

    public static String A00(long j, boolean z, boolean z2) {
        String str;
        String str2 = " ORDER BY sort_id ASC";
        String str3 = "";
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i > 0) {
            A0u.append(C56892xB.A00);
            if (z) {
                str3 = " AND message.chat_row_id = ?";
            }
            A0u.append(str3);
            A0u.append(" AND file_size > ?");
        } else {
            A0u.append(C56892xB.A02);
            if (z) {
                str = " AND chat_row_id = ?";
            } else {
                str = str3;
            }
            A0u.append(str);
            A0u.append(str3);
        }
        if (!z2) {
            str2 = " ORDER BY sort_id DESC";
        }
        return AnonymousClass000.A0q(str2, A0u);
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_media_hash_index", "CREATE INDEX IF NOT EXISTS message_media_hash_index ON message_media(file_hash)");
        r5.A07("message_media_chat_index", "CREATE INDEX IF NOT EXISTS message_media_chat_index ON message_media(chat_row_id)");
        r5.A07("message_media_original_file_hash_index", "CREATE INDEX IF NOT EXISTS message_media_original_file_hash_index ON message_media(original_file_hash)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_media");
    }

    public void B7q(AnonymousClass38H r9, C65063Qo r10) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[41];
        C52502pX A02 = C52502pX.A02(A00);
        A00.A00 = A02;
        boolean A0j = C63573Ko.A0j(A00, r2);
        C63573Ko.A0Q(A00, A02, "chat_row_id", r2, 1);
        C63573Ko.A08(A00, A02, "autotransfer_retry_enabled", r2);
        A00.A02 = "multicast_id";
        C52502pX r3 = C52502pX.TEXT;
        C63573Ko.A0U(A00, r3, r2);
        C63573Ko.A0A(A00, r3, "media_job_uuid", r2);
        C63573Ko.A0B(A00, A02, "transferred", r2);
        C63573Ko.A0C(A00, A02, "transcoded", r2);
        C63573Ko.A0D(A00, r3, "file_path", r2);
        C63573Ko.A0E(A00, A02, "file_size", r2);
        C63573Ko.A0F(A00, A02, "suspicious_content", r2);
        C63573Ko.A0G(A00, A02, "trim_from", r2);
        C63573Ko.A0H(A00, A02, "trim_to", r2);
        C63573Ko.A0I(A00, A02, "face_x", r2);
        C63573Ko.A0J(A00, A02, "face_y", r2);
        A00.A02 = "media_key";
        C52502pX r7 = C52502pX.BLOB;
        A00.A00 = r7;
        r2[14] = A00.A0r();
        C63573Ko.A0L(A00, A02, "media_key_timestamp", r2);
        C63573Ko.A0M(A00, A02, "width", r2);
        C63573Ko.A0N(A00, A02, "height", r2);
        C63573Ko.A0O(A00, A02, "has_streaming_sidecar", r2);
        C63573Ko.A0P(A00, A02, "gif_attribution", r2);
        A00.A02 = "thumbnail_height_width_ratio";
        A00.A00 = C52502pX.REAL;
        r2[20] = A00.A0r();
        r2[21] = C63573Ko.A02(A00, r3, "direct_path");
        r2[22] = C63573Ko.A02(A00, r7, "first_scan_sidecar");
        r2[23] = C63573Ko.A02(A00, A02, "first_scan_length");
        r2[24] = C63573Ko.A02(A00, r3, "message_url");
        r2[25] = C63573Ko.A02(A00, r3, "mime_type");
        r2[26] = C63573Ko.A02(A00, A02, "file_length");
        r2[27] = C63573Ko.A02(A00, r3, "media_name");
        r2[28] = C63573Ko.A02(A00, r3, "file_hash");
        r2[29] = C63573Ko.A02(A00, A02, "media_duration");
        r2[30] = C63573Ko.A02(A00, A02, "page_count");
        r2[31] = C63573Ko.A02(A00, r3, "enc_file_hash");
        r2[32] = C63573Ko.A02(A00, r3, "partial_media_hash");
        r2[33] = C63573Ko.A02(A00, r3, "partial_media_enc_hash");
        r2[34] = C63573Ko.A02(A00, A02, "is_animated_sticker");
        r2[35] = C63573Ko.A02(A00, r3, "original_file_hash");
        r2[36] = C63573Ko.A03(A00, A02, "mute_video", A0j ? 1 : 0);
        r2[37] = C63573Ko.A02(A00, r3, "media_caption");
        r2[38] = C63573Ko.A02(A00, r3, "media_upload_handle");
        r2[39] = C63573Ko.A02(A00, A02, "sticker_flags");
        r2[40] = C63573Ko.A02(A00, r3, "raw_transcription_text");
        r10.A0B("message_media", r2);
    }
}
