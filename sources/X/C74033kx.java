package X;

import android.content.ContentValues;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.3kx  reason: invalid class name and case insensitive filesystem */
public class C74033kx implements AnonymousClass15z, AnonymousClass160 {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_key_index ON message (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r5.A07("message_sort_id_index", "CREATE INDEX IF NOT EXISTS message_sort_id_index ON message (sort_id)");
        r5.A07("message_starred_index", "CREATE INDEX IF NOT EXISTS message_starred_index ON message(starred)");
        r5.A07("message_type_chat_index", "CREATE INDEX IF NOT EXISTS message_type_chat_index ON message(chat_row_id, message_type)");
        r5.A07("message_chat_id_index", "CREATE INDEX IF NOT EXISTS message_chat_id_index ON message (chat_row_id,_id)");
        r5.A07("message_type_index", "CREATE INDEX IF NOT EXISTS message_type_index ON message(message_type)");
        r5.A07("message_chat_sort_id_index", "CREATE INDEX IF NOT EXISTS message_chat_sort_id_index ON message (chat_row_id, sort_id)");
        r5.A07("message_starred_sort_id_index", "CREATE INDEX IF NOT EXISTS message_starred_sort_id_index ON message (starred, sort_id)");
    }

    public void B7q(AnonymousClass38H r2, C65063Qo r3) {
        r3.A06(this, "message");
    }

    public void B4y(C224114e r12, AnonymousClass38H r13) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[21];
        A00.A02 = "_id";
        C52502pX r8 = C52502pX.INTEGER;
        A00.A00 = r8;
        boolean A0k = C63573Ko.A0k(A00, r3);
        C63573Ko.A0R(A00, r8, "chat_row_id", r3, true);
        C63573Ko.A0S(A00, r8, "from_me", r3, true);
        A00.A02 = "key_id";
        C52502pX r10 = C52502pX.TEXT;
        C63573Ko.A0Z(A00, r10, r3, true);
        C63573Ko.A0A(A00, r8, "sender_jid_row_id", r3);
        C63573Ko.A0B(A00, r8, "status", r3);
        C63573Ko.A0C(A00, r8, "broadcast", r3);
        C63573Ko.A0D(A00, r8, "recipient_count", r3);
        C63573Ko.A0E(A00, r10, "participant_hash", r3);
        C63573Ko.A0F(A00, r8, "origination_flags", r3);
        C63573Ko.A0G(A00, r8, "origin", r3);
        C63573Ko.A0H(A00, r8, "timestamp", r3);
        C63573Ko.A0I(A00, r8, "received_timestamp", r3);
        C63573Ko.A0J(A00, r8, "receipt_server_timestamp", r3);
        C63573Ko.A0K(A00, r8, "message_type", r3);
        C63573Ko.A0L(A00, r10, "text_data", r3);
        C63573Ko.A0M(A00, r8, "starred", r3);
        C63573Ko.A0N(A00, r8, "lookup_tables", r3);
        C63573Ko.A0O(A00, r8, "message_add_on_flags", r3);
        C63573Ko.A0P(A00, r8, "view_mode", r3);
        r3[20] = C63573Ko.A04(A00, r8, "sort_id", A0k ? 1 : 0, true);
        if (C224614k.A05(r12, "message", Arrays.asList(r3), Collections.emptyList())) {
            ContentValues A0E = C36441kJ.A0E();
            C36341k9.A0p(A0E, "_id", 1);
            C36341k9.A0o(A0E, "chat_row_id", -1);
            C36341k9.A0o(A0E, "from_me", 0);
            A0E.put("key_id", "-1");
            r12.A04("message", "INSERT_TABLE_MESSAGE_FIRST_MESSAGE", A0E);
        }
    }
}
