package X;

import android.database.Cursor;
import android.database.CursorWrapper;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.1lB  reason: invalid class name and case insensitive filesystem */
public class C36711lB extends CursorWrapper {
    public final Map A00 = AnonymousClass001.A0J();

    public int getColumnIndex(String str) {
        Map map = this.A00;
        Number number = (Number) map.get(str);
        if (number != null) {
            return number.intValue();
        }
        int columnIndex = super.getColumnIndex(str);
        C36421kH.A1M(str, map, columnIndex);
        return columnIndex;
    }

    public C36711lB(Cursor cursor) {
        super(cursor);
    }

    public int getColumnIndexOrThrow(String str) {
        String str2;
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(getColumnNames());
        } catch (Exception unused) {
            str2 = "";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("column '");
        A0u.append(str);
        A0u.append("' does not exist. Available columns: ");
        throw AnonymousClass000.A0c(str2, A0u);
    }
}
