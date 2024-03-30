package X;

import android.database.Cursor;
import com.whatsapp.jid.Jid;

/* renamed from: X.4YI  reason: invalid class name */
public class AnonymousClass4YI implements AnonymousClass4QM {
    public Object A00;
    public final int A01;

    public AnonymousClass4YI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object BlC(Cursor cursor) {
        Integer num;
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(cursor, 1);
                C45362Rb r4 = new C45362Rb();
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("comment_space_id");
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("comments");
                int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("comment_deletes");
                int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("accumulated_comments");
                int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("comment_parent_group_id");
                int columnIndex = cursor.getColumnIndex("group_size_bucket");
                int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("cag_message_sent_ds");
                r4.A06 = cursor.getString(columnIndexOrThrow);
                r4.A04 = C36361kB.A0k(cursor, columnIndexOrThrow2);
                r4.A03 = C36361kB.A0k(cursor, columnIndexOrThrow3);
                r4.A01 = C36361kB.A0k(cursor, columnIndexOrThrow4);
                r4.A05 = cursor.getString(columnIndexOrThrow5);
                r4.A00 = Integer.valueOf(cursor.getInt(columnIndex));
                r4.A02 = C36361kB.A0k(cursor, columnIndexOrThrow6);
                return r4;
            case 1:
                C45232Qo r42 = new C45232Qo();
                Jid A09 = ((C26841Ls) this.A00).A00.A09(cursor.getLong(cursor.getColumnIndexOrThrow("jid_row_id")));
                if (A09 == null) {
                    return null;
                }
                int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("home_group_discovery_count");
                int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("home_view_count");
                int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("home_group_join_count");
                int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("home_group_navigation_count");
                r42.A04 = A09.user;
                r42.A03 = C36361kB.A0k(cursor, columnIndexOrThrow8);
                r42.A00 = C36361kB.A0k(cursor, columnIndexOrThrow7);
                r42.A01 = C36361kB.A0k(cursor, columnIndexOrThrow9);
                r42.A02 = C36361kB.A0k(cursor, columnIndexOrThrow10);
                return r42;
            case 2:
                AnonymousClass2RQ r43 = new AnonymousClass2RQ();
                int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("community_id");
                int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("type_of_subgroup");
                int columnIndexOrThrow13 = cursor.getColumnIndexOrThrow("reaction_open_tray_count");
                int columnIndexOrThrow14 = cursor.getColumnIndexOrThrow("reaction_delete_count");
                int columnIndexOrThrow15 = cursor.getColumnIndexOrThrow("pnh_indicator_clicks_info_screen");
                int columnIndex2 = cursor.getColumnIndex("pnh_indicator_clicks_chat");
                r43.A05 = cursor.getString(columnIndexOrThrow11);
                r43.A00 = Integer.valueOf(cursor.getInt(columnIndexOrThrow12));
                r43.A04 = C36361kB.A0k(cursor, columnIndexOrThrow13);
                r43.A03 = C36361kB.A0k(cursor, columnIndexOrThrow14);
                r43.A02 = C36361kB.A0k(cursor, columnIndexOrThrow15);
                r43.A01 = C36361kB.A0k(cursor, columnIndex2);
                return r43;
            default:
                AnonymousClass2SB r44 = new AnonymousClass2SB();
                int columnIndexOrThrow16 = cursor.getColumnIndexOrThrow("poll_id");
                int columnIndexOrThrow17 = cursor.getColumnIndexOrThrow("poll_votes");
                int columnIndexOrThrow18 = cursor.getColumnIndexOrThrow("poll_votes_changed");
                int columnIndexOrThrow19 = cursor.getColumnIndexOrThrow("poll_vote_deletes");
                int columnIndexOrThrow20 = cursor.getColumnIndexOrThrow("option_count");
                int columnIndex3 = cursor.getColumnIndex("users_participated");
                int columnIndexOrThrow21 = cursor.getColumnIndexOrThrow("poll_creation_ds");
                int columnIndexOrThrow22 = cursor.getColumnIndexOrThrow("is_a_group_flag");
                int columnIndexOrThrow23 = cursor.getColumnIndexOrThrow("group_size_bucket");
                r44.A04 = C36361kB.A0k(cursor, columnIndexOrThrow16);
                r44.A06 = C36361kB.A0k(cursor, columnIndexOrThrow17);
                r44.A07 = C36361kB.A0k(cursor, columnIndexOrThrow18);
                r44.A05 = C36361kB.A0k(cursor, columnIndexOrThrow19);
                r44.A02 = C36361kB.A0k(cursor, columnIndexOrThrow20);
                r44.A08 = C36361kB.A0k(cursor, columnIndex3);
                r44.A03 = C36361kB.A0k(cursor, columnIndexOrThrow21);
                boolean A1P = AnonymousClass000.A1P(cursor.getInt(columnIndexOrThrow22));
                r44.A00 = Boolean.valueOf(A1P);
                if (A1P) {
                    num = Integer.valueOf(cursor.getInt(columnIndexOrThrow23));
                } else {
                    num = null;
                }
                r44.A01 = num;
                return r44;
        }
    }
}
