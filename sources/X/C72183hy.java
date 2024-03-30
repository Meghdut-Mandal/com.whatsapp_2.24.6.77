package X;

/* renamed from: X.3hy  reason: invalid class name and case insensitive filesystem */
public class C72183hy implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        r6.A07("chat_group_type_index", "CREATE INDEX IF NOT EXISTS chat_group_type_index ON chat (group_type)");
        r6.A09("chat", "chat_hidden_index", "CREATE INDEX IF NOT EXISTS chat_hidden_index ON chat (hidden)");
    }

    public void B7q(AnonymousClass38H r9, C65063Qo r10) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[44];
        C52502pX A01 = C52502pX.A01(A00);
        boolean A0g = C63573Ko.A0g(A00, A01, r2);
        A00.A02 = "jid_row_id";
        C63573Ko.A0X(A00, A01, r2, A0g);
        C63573Ko.A08(A00, A01, "hidden", r2);
        A00.A02 = "subject";
        C52502pX r3 = C52502pX.TEXT;
        C63573Ko.A0U(A00, r3, r2);
        C63573Ko.A0A(A00, A01, "created_timestamp", r2);
        C63573Ko.A0B(A00, A01, "display_message_row_id", r2);
        C63573Ko.A0C(A00, A01, "last_message_row_id", r2);
        C63573Ko.A0D(A00, A01, "last_read_message_row_id", r2);
        C63573Ko.A0E(A00, A01, "last_read_receipt_sent_message_row_id", r2);
        C63573Ko.A0F(A00, A01, "last_important_message_row_id", r2);
        C63573Ko.A0G(A00, A01, "archived", r2);
        C63573Ko.A0H(A00, A01, "sort_timestamp", r2);
        C63573Ko.A0I(A00, A01, "mod_tag", r2);
        A00.A02 = "gen";
        A00.A00 = C52502pX.REAL;
        r2[13] = A00.A0r();
        C63573Ko.A0K(A00, A01, "spam_detection", r2);
        C63573Ko.A0L(A00, A01, "unseen_earliest_message_received_time", r2);
        C63573Ko.A0M(A00, A01, "unseen_message_count", r2);
        C63573Ko.A0N(A00, A01, "unseen_missed_calls_count", r2);
        C63573Ko.A0O(A00, A01, "unseen_row_count", r2);
        C63573Ko.A0P(A00, A01, "plaintext_disabled", r2);
        r2[20] = C63573Ko.A02(A00, A01, "vcard_ui_dismissed");
        r2[21] = C63573Ko.A02(A00, A01, "change_number_notified_message_row_id");
        r2[22] = C63573Ko.A02(A00, A01, "show_group_description");
        r2[23] = C63573Ko.A02(A00, A01, "ephemeral_expiration");
        r2[24] = C63573Ko.A02(A00, A01, "last_read_ephemeral_message_row_id");
        r2[25] = C63573Ko.A02(A00, A01, "ephemeral_setting_timestamp");
        r2[26] = C63573Ko.A02(A00, A01, "ephemeral_displayed_exemptions");
        r2[27] = C63573Ko.A02(A00, A01, "ephemeral_disappearing_messages_initiator");
        C63573Ko.A06(A00, A01, "unseen_important_message_count", A0g);
        A00.A01 = "0";
        r2[28] = A00.A0r();
        C63573Ko.A06(A00, A01, "group_type", A0g);
        A00.A01 = "0";
        r2[29] = A00.A0r();
        r2[30] = C63573Ko.A02(A00, A01, "last_message_reaction_row_id");
        r2[31] = C63573Ko.A02(A00, A01, "last_seen_message_reaction_row_id");
        r2[32] = C63573Ko.A02(A00, A01, "unseen_message_reaction_count");
        r2[33] = C63573Ko.A02(A00, A01, "unseen_comment_message_count");
        r2[34] = C63573Ko.A02(A00, A01, "growth_lock_level");
        r2[35] = C63573Ko.A02(A00, A01, "growth_lock_expiration_ts");
        r2[36] = C63573Ko.A02(A00, A01, "last_read_message_sort_id");
        r2[37] = C63573Ko.A02(A00, A01, "display_message_sort_id");
        r2[38] = C63573Ko.A02(A00, A01, "last_message_sort_id");
        r2[39] = C63573Ko.A02(A00, A01, "last_read_receipt_sent_message_sort_id");
        C63573Ko.A06(A00, A01, "has_new_community_admin_dialog_been_acknowledged", A0g);
        A00.A01 = "0";
        r2[40] = A00.A0r();
        r2[41] = C63573Ko.A02(A00, A01, "history_sync_progress");
        r2[42] = C63573Ko.A02(A00, A01, "chat_lock");
        r2[43] = C63573Ko.A02(A00, r3, "chat_origin");
        r10.A0B("chat", r2);
    }
}
