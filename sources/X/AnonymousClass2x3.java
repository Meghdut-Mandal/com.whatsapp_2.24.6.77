package X;

/* renamed from: X.2x3  reason: invalid class name */
public abstract class AnonymousClass2x3 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String[] strArr = C56842wy.A03;
        C36361kB.A1R("message_view", A0u, strArr);
        A0u.append(" FROM ");
        A0u.append("message_view_once_media view_once ");
        A0u.append(" JOIN message_view message_view  ON view_once.message_row_id=message_view._id");
        String A1C = C36431kI.A1C(" JOIN message_media message_media  ON message_media.message_row_id =  message_view._id", A0u);
        A0u.append("message_media.file_size != 0 AND message_view.from_me = 0  AND view_once.state IN (1, 2) ");
        A04 = AnonymousClass000.A0q(" LIMIT ?", A0u);
        StringBuilder A0v = AnonymousClass000.A0v("SELECT ");
        AnonymousClass000.A1D(AnonymousClass1M2.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A0v);
        A0v.append(" JOIN message_view message_view  JOIN message_media message_media  WHERE view_once.message_row_id=message_view._id AND message_media.message_row_id =  message_view._id");
        AnonymousClass000.A1D(" AND ", "message_media.file_size != 0 AND message_view.from_me = 0  AND view_once.state IN (1, 2) ", " LIMIT ?", A0v);
        A05 = A0v.toString();
        StringBuilder A0v2 = AnonymousClass000.A0v("SELECT ");
        AnonymousClass000.A1D(AnonymousClass1M2.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A0v2);
        A0v2.append(" JOIN available_message_view message_view  ON view_once.message_row_id=message_view._id");
        A0v2.append(A1C);
        A0v2.append("view_once.state = 0");
        A0v2.append(" AND ");
        A02 = AnonymousClass000.A0q("message_view.from_me = 0", A0v2);
        StringBuilder A0v3 = AnonymousClass000.A0v("SELECT ");
        AnonymousClass000.A1D(AnonymousClass1M2.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A0v3);
        AnonymousClass000.A1D(" JOIN available_message_view message_view  WHERE view_once.message_row_id=message_view._id", " AND ", "view_once.state = 0", A0v3);
        A03 = AnonymousClass000.A0p(" AND ", "message_view.from_me = 0", A0v3);
        StringBuilder A0v4 = AnonymousClass000.A0v("SELECT ");
        C36321k7.A1O(AnonymousClass1M2.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", " JOIN message_view message_view  ON view_once.message_row_id=message_view._id", A0v4);
        A0v4.append(A1C);
        A00 = AnonymousClass000.A0p("message_view.timestamp <= ?  AND view_once.state = 0", " LIMIT ?", A0v4);
        StringBuilder A0v5 = AnonymousClass000.A0v("SELECT ");
        AnonymousClass000.A1D(AnonymousClass1M2.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A0v5);
        C36321k7.A1O(" JOIN message_view message_view  WHERE view_once.message_row_id=message_view._id", " AND ", "message_view.timestamp <= ?  AND view_once.state = 0", " LIMIT ?", A0v5);
        A01 = A0v5.toString();
    }
}
