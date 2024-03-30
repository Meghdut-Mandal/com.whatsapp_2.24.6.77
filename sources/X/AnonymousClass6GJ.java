package X;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;

/* renamed from: X.6GJ  reason: invalid class name */
public abstract class AnonymousClass6GJ {
    public static final int A00(Cursor cursor, String str) {
        int length;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append('`');
            A0u.append(str);
            columnIndex = cursor.getColumnIndex(AnonymousClass000.A0t(A0u, '`'));
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT > 25 || (length = str.length()) == 0) {
                    return -1;
                }
                String[] columnNames = cursor.getColumnNames();
                AnonymousClass00C.A08(columnNames);
                String A0f = C90464aC.A0f(str, AnonymousClass000.A0u(), '.');
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append('.');
                A0u2.append(str);
                String A0t = AnonymousClass000.A0t(A0u2, '`');
                int length2 = columnNames.length;
                int i = 0;
                columnIndex = 0;
                while (i < length2) {
                    String str2 = columnNames[i];
                    int i2 = columnIndex + 1;
                    if (str2.length() >= length + 2) {
                        AnonymousClass00C.A0D(A0f, 1);
                        if (!str2.endsWith(A0f)) {
                            if (str2.charAt(0) == '`') {
                                AnonymousClass00C.A0D(A0t, 1);
                                if (str2.endsWith(A0t)) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i++;
                    columnIndex = i2;
                }
                return -1;
            }
        }
        return columnIndex;
    }

    public static final int A01(Cursor cursor, String str) {
        String str2;
        int A00 = A00(cursor, str);
        if (A00 >= 0) {
            return A00;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            AnonymousClass00C.A08(columnNames);
            str2 = AnonymousClass02R.A09(", ", "", "", columnNames);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("column '");
        A0u.append(str);
        A0u.append("' does not exist. Available columns: ");
        throw AnonymousClass000.A0c(str2, A0u);
    }
}
