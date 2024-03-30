package X;

import android.text.TextUtils;

/* renamed from: X.3kz  reason: invalid class name and case insensitive filesystem */
public class C74053kz implements AnonymousClass15z, AnonymousClass160 {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B4y(C224114e r10, AnonymousClass38H r11) {
        C224114e r3 = r10;
        String A00 = C224614k.A00(r10, "table", "group_participant_user");
        if (!TextUtils.isEmpty(A00)) {
            if (C224614k.A06(A00, "admin", "INTEGER")) {
                C224614k.A03(r10, "TableGroupParticipantUser", "group_participant_user");
            } else {
                C224614k.A04(r3, A00, "group_participant_user", "rank", "INTEGER", "TableGroupParticipantUser");
                C224614k.A04(r3, A00, "group_participant_user", "pending", "INTEGER", "TableGroupParticipantUser");
                return;
            }
        }
        r10.A0D("CREATE TABLE group_participant_user (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_jid_row_id INTEGER NOT NULL, user_jid_row_id INTEGER NOT NULL, rank INTEGER, pending INTEGER)", "CREATE_GROUP_PARTICIPANT_USER_TABLE");
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("group_participant_user_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_participant_user_index ON group_participant_user (group_jid_row_id, user_jid_row_id)");
    }

    public void B7q(AnonymousClass38H r2, C65063Qo r3) {
        r3.A06(this, "group_participant_user");
    }
}
