package X;

import java.util.Locale;

/* renamed from: X.3kv  reason: invalid class name and case insensitive filesystem */
public class C74013kv implements AnonymousClass15z {
    public static String A02(String str, String str2, String str3, String str4) {
        String format = String.format("DELETE FROM backup_changes WHERE (table_name = '%s') AND (table_row_id = %s) AND ((operation = 'INSERT') OR (operation = 'UPDATE'));", new Object[]{str3, str4});
        Object[] A1a = C36431kI.A1a(str2, str3, 3);
        A1a[2] = str4;
        String format2 = String.format(" INSERT INTO backup_changes(operation, table_name, table_row_id ) VALUES('%s', '%s', %s); ", A1a);
        Locale locale = Locale.US;
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1D("CREATE TRIGGER IF NOT EXISTS %s AFTER %s ON %s BEGIN ", format, format2, A0u);
        String A0q = AnonymousClass000.A0q(" END", A0u);
        Object[] A1a2 = C36431kI.A1a(str, str2, 3);
        A1a2[2] = str3;
        return String.format(locale, A0q, A1a2);
    }

    public static String A01(String str, String str2, String str3) {
        String format = String.format("DELETE FROM backup_changes WHERE (table_name = '%s') AND (table_row_id = %s) AND ((operation = 'INSERT') OR (operation = 'UPDATE'));", new Object[]{"message", str3});
        Object[] A1a = C36431kI.A1a(str2, "message", 3);
        A1a[2] = str3;
        String format2 = String.format(" INSERT INTO backup_changes(operation, table_name, table_row_id ) VALUES('%s', '%s', %s); ", A1a);
        Locale locale = Locale.US;
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1D("CREATE TRIGGER IF NOT EXISTS %s AFTER %s ON %s BEGIN ", format, format2, A0u);
        String A0q = AnonymousClass000.A0q(" END", A0u);
        Object[] A1a2 = C36431kI.A1a(str, str2, 3);
        A1a2[2] = "message_add_on";
        return String.format(locale, A0q, A1a2);
    }

    private void A03(C65063Qo r5, String str, String str2) {
        String A00 = A00("INSERT", str);
        r5.A08(A00, A02(A00, "INSERT", str, AnonymousClass000.A0p("NEW.", str2, AnonymousClass000.A0u())));
        String A002 = A00("UPDATE", str);
        r5.A08(A002, A02(A002, "UPDATE", str, C36321k7.A0D("NEW.", str2)));
        String A003 = A00("DELETE", str);
        r5.A08(A003, A02(A003, "DELETE", str, AnonymousClass000.A0p("OLD.", str2, AnonymousClass000.A0u())));
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("backup_changes_operation_index", "CREATE INDEX IF NOT EXISTS backup_changes_operation_index ON backup_changes (operation, table_name, table_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r8, AnonymousClass38H r9, C65063Qo r10) {
        if (r9.A03) {
            A03(r10, "message", "_id");
            String A00 = A00("INSERT", "message_add_on");
            r10.A08(A00, A01(A00, "INSERT", AnonymousClass000.A0p("NEW.", "parent_message_row_id", AnonymousClass000.A0u())));
            String A002 = A00("UPDATE", "message_add_on");
            r10.A08(A002, A01(A002, "UPDATE", C36321k7.A0D("NEW.", "parent_message_row_id")));
            String A003 = A00("DELETE", "message_add_on");
            r10.A08(A003, A01(A003, "DELETE", AnonymousClass000.A0p("OLD.", "parent_message_row_id", AnonymousClass000.A0u())));
            A03(r10, "receipt_user", "_id");
            A03(r10, "receipt_device", "_id");
            A03(r10, "message_add_on_receipt_device", "receipt_device_id");
            A03(r10, "receipt_orphaned", "_id");
            A03(r10, "played_self_receipt", "message_row_id");
            A03(r10, "jid", "_id");
            A03(r10, "chat", "_id");
            A03(r10, "community_chat", "chat_row_id");
            A03(r10, "parent_group_participants", "rowid");
            A03(r10, "props", "_id");
            A03(r10, "user_device", "_id");
            A03(r10, "user_device_info", "user_jid_row_id");
            A03(r10, "group_notification_version", "group_jid_row_id");
            A03(r10, "group_participant_device", "_id");
            A03(r10, "group_participant_user", "_id");
            A03(r10, "group_past_participant_user", "_id");
            A03(r10, "frequent", "_id");
            A03(r10, "lid_chat_state", "jid_row_id");
            A03(r10, "lid_display_name", "lid_row_id");
            A03(r10, "call_log", "_id");
            A03(r10, "call_link", "_id");
            A03(r10, "call_log_participant_v2", "_id");
            A03(r10, "joinable_call_log", "call_log_row_id");
            A03(r10, "primary_device_version", "user_jid_row_id");
            A03(r10, "payment_background", "rowid");
            A03(r10, "payment_background_order", "rowid");
            A03(r10, "pay_transaction", "_id");
            A03(r10, "media_refs", "_id");
            A03(r10, "agent_chat_assignment", "jid_row_id");
            A03(r10, "agent_devices", "rowid");
            A03(r10, "agent_message_attribution", "message_row_id");
            A03(r10, "away_messages", "_id");
            A03(r10, "keywords", "_id");
            A03(r10, "quick_replies", "_id");
            A03(r10, "quick_reply_attachments", "_id");
            A03(r10, "quick_reply_keywords", "_id");
            A03(r10, "quick_reply_usage", "_id");
        }
    }

    public static String A00(String str, String str2) {
        Object[] A1Q = C36441kJ.A1Q();
        C36331k8.A1N(str2, str, A1Q);
        A1Q[2] = "backup_changes";
        return String.format("%s_%s_for_%s_trigger", A1Q).toLowerCase(Locale.getDefault());
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0m = C63573Ko.A0m(A00);
        C52502pX r3 = C52502pX.INTEGER;
        boolean A0g = C63573Ko.A0g(A00, r3, A0m);
        A00.A02 = "operation";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0W(A00, r1, A0m, A0g);
        C63573Ko.A0S(A00, r1, "table_name", A0m, A0g);
        A00.A02 = "table_row_id";
        C63573Ko.A0Z(A00, r3, A0m, A0g);
        r8.A0B("backup_changes", A0m);
    }
}
