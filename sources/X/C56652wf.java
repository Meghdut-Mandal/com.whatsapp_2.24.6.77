package X;

import java.util.Arrays;

/* renamed from: X.2wf  reason: invalid class name and case insensitive filesystem */
public abstract class C56652wf {
    public static final int[] A00;
    public static final String A01;

    static {
        int[] iArr = {1, 3, 13, 9, 25, 26, 28, 29, 42, 43};
        A00 = iArr;
        String arrays = Arrays.toString(iArr);
        String substring = arrays.substring(1, arrays.length() - 1);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(" SELECT message_thumbnail.message_row_id FROM message_thumbnail INNER JOIN available_message_view WHERE message_thumbnail.message_row_id = available_message_view._id AND available_message_view.message_type IN (");
        A0u.append(substring);
        A01 = AnonymousClass000.A0q(")", A0u);
    }
}
