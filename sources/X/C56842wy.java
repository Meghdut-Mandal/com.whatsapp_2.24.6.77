package X;

import android.text.TextUtils;

@Deprecated
/* renamed from: X.2wy  reason: invalid class name and case insensitive filesystem */
public abstract class C56842wy {
    public static final String A00;
    public static final String A01;
    public static final String[] A02;
    public static final String[] A03;

    static {
        String[] strArr = {"sort_id", "from_me", "key_id", "status", "broadcast", "data", "timestamp", "media_url", "media_mime_type", "message_type", "media_size", "media_name", "media_caption", "media_hash", "media_duration", "origin", "latitude", "longitude", "thumb_image", "raw_data", "recipient_count", "participant_hash", "starred", "quoted_row_id", "mentioned_jids", "multicast_id", "edit_version", "receipt_server_timestamp", "media_enc_hash", "payment_transaction_id", "origination_flags", "preview_type", "received_timestamp", "_id", "text_data", "lookup_tables", "sender_jid_row_id", "sender_jid_raw_string", "chat_row_id", "future_message_type", "message_add_on_flags", "view_mode", "table_version"};
        A03 = strArr;
        String[] strArr2 = {"sort_id", "from_me", "key_id", "status", "broadcast", "data", "timestamp", "media_url", "media_mime_type", "message_type", "media_size", "media_name", "media_caption", "media_hash", "media_duration", "origin", "latitude", "longitude", "thumb_image", "recipient_count", "participant_hash", "starred", "quoted_row_id", "mentioned_jids", "multicast_id", "edit_version", "receipt_server_timestamp", "media_enc_hash", "payment_transaction_id", "origination_flags", "preview_type", "received_timestamp", "_id", "text_data", "lookup_tables", "sender_jid_row_id", "sender_jid_raw_string", "chat_row_id", "future_message_type", "message_add_on_flags", "view_mode", "table_version"};
        A02 = strArr2;
        A01 = TextUtils.join(", ", strArr);
        A00 = TextUtils.join(", ", strArr2);
    }
}
