package X;

/* renamed from: X.1M1  reason: invalid class name */
public abstract class AnonymousClass1M1 {
    public static final String A00;
    public static final String[] A01;

    static {
        String[] strArr = {"_id", "raw_string_jid", "display_message_row_id", "last_read_message_row_id", "last_read_receipt_sent_message_row_id", "archived", "sort_timestamp", "gen", "spam_detection", "plaintext_disabled", "vcard_ui_dismissed", "change_number_notified_message_row_id", "subject", "last_message_row_id", "unseen_message_count", "unseen_missed_calls_count", "unseen_row_count", "unseen_message_reaction_count", "unseen_comment_message_count", "last_message_reaction_row_id", "last_seen_message_reaction_row_id", "unseen_earliest_message_received_time", "last_important_message_row_id", "show_group_description", "ephemeral_expiration", "ephemeral_setting_timestamp", "ephemeral_displayed_exemptions", "ephemeral_disappearing_messages_initiator", "unseen_important_message_count", "group_type", "growth_lock_level", "growth_lock_expiration_ts", "last_read_message_sort_id", "display_message_sort_id", "last_message_sort_id", "last_read_receipt_sent_message_sort_id", "has_new_community_admin_dialog_been_acknowledged", "history_sync_progress", "hidden", "chat_lock", "chat_origin"};
        A01 = strArr;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(AnonymousClass1M2.A01("chat_view", strArr));
        sb.append(", ");
        sb.append(AnonymousClass1M2.A01("deleted_chat_job", new String[]{"chat_row_id", "deleted_message_row_id", "deleted_starred_message_row_id", "deleted_categories_message_row_id", "deleted_categories_starred_message_row_id", "deleted_message_categories"}));
        sb.append(" FROM chat_view AS chat_view");
        sb.append(" LEFT JOIN deleted_chat_job AS deleted_chat_job");
        sb.append(" ON ");
        sb.append("chat_view._id = deleted_chat_job.chat_row_id");
        sb.append(" WHERE ");
        sb.append("(hidden = 0)");
        A00 = sb.toString();
    }
}
