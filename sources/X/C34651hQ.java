package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.1hQ  reason: invalid class name and case insensitive filesystem */
public final class C34651hQ {
    public final C19700wN A00;
    public final C219712j A01;
    public final AnonymousClass12P A02;

    public C34651hQ(C19700wN r2, C219712j r3, AnonymousClass12P r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static final ContentValues A00(C63243Jh r7, C34651hQ r8) {
        long A07 = r8.A01.A07(r7.A03);
        int i = r7.A02.value;
        int i2 = r7.A00;
        ContentValues contentValues = new ContentValues();
        contentValues.put("jid_row_id", Long.valueOf(A07));
        contentValues.put("favorite_type", Integer.valueOf(i));
        contentValues.put("sort_order", Integer.valueOf(i2));
        return contentValues;
    }

    public static final ArrayList A01(Cursor cursor, C34651hQ r16) {
        C52312pE r10;
        ArrayList arrayList = new ArrayList();
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("jid_row_id");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("favorite_type");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("sort_order");
        while (cursor.moveToNext()) {
            long j = cursor.getLong(columnIndexOrThrow);
            AnonymousClass11F r11 = (AnonymousClass11F) r16.A01.A0C(AnonymousClass11F.class, cursor.getLong(columnIndexOrThrow2));
            int i = cursor.getInt(columnIndexOrThrow3);
            C52312pE[] values = C52312pE.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    r10 = C52312pE.NONE;
                    break;
                }
                r10 = values[i2];
                if (r10.value == i) {
                    break;
                }
                i2++;
            }
            int i3 = cursor.getInt(columnIndexOrThrow4);
            if (r11 != null) {
                arrayList.add(new C63243Jh(r10, r11, i3, j));
            }
        }
        return arrayList;
    }
}
