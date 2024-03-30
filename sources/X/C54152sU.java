package X;

/* renamed from: X.2sU  reason: invalid class name and case insensitive filesystem */
public abstract class C54152sU {
    public static String A00(int i) {
        StringBuilder A0z = C36391kE.A0z();
        C36361kB.A1R("group_participant_user", A0z, new String[]{"group_jid_row_id", "user_jid_row_id"});
        A0z.append(" FROM ");
        A0z.append("group_participant_user");
        C36381kD.A1O(A0z, " JOIN (  SELECT group_jid_row_id FROM group_participant_user WHERE user_jid_row_id = ? ) as meSubSelect ON group_participant_user.group_jid_row_id = meSubSelect.group_jid_row_id");
        A0z.append("user_jid_row_id");
        C36351kA.A1O(" IN ", A0z, i);
        return A0z.toString();
    }
}
