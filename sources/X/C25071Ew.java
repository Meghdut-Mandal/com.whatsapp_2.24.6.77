package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.1Ew  reason: invalid class name and case insensitive filesystem */
public class C25071Ew {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass1C7 A02;
    public final AnonymousClass163 A03;
    public final C220412q A04;
    public final C219712j A05;
    public final C220612s A06;
    public final AnonymousClass12P A07;

    public static ArrayList A00(C25071Ew r8, long j, boolean z) {
        String str;
        String str2;
        Cursor A09;
        if (z) {
            str = "SELECT vcard FROM message_quoted_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\"";
        } else {
            str = "SELECT vcard FROM message_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\"";
        }
        if (z) {
            str2 = "GET_QUOTED_VCARDS_BY_MESSAGE_ROW_ID_SQL";
        } else {
            str2 = "GET_VCARDS_BY_MESSAGE_ROW_ID_SQL";
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A042 = r8.A07.get();
        try {
            A09 = A042.A02.A09(str, str2, new String[]{Long.toString(j)});
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("vcard");
            while (A09.moveToNext()) {
                arrayList.add(A09.getString(columnIndexOrThrow));
            }
            A09.close();
            A042.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A01(C25071Ew r5, String str, long j) {
        AnonymousClass1M0 A052 = r5.A07.A05();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("vcard", str);
            A052.A02.A08("message_quoted_vcard", "INSERT_QUOTED_VCARD_SQL", contentValues, 4);
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static void A02(C25071Ew r5, String str, long j) {
        AnonymousClass1M0 A052 = r5.A07.A05();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("vcard", str);
            A052.A02.A08("message_vcard", "INSERT_VCARD_SQL", contentValues, 4);
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A03(C46972by r8) {
        Cursor A09;
        if (r8.A09 == 7 && r8.A01 != null) {
            AnonymousClass1M0 A042 = this.A07.get();
            try {
                A09 = A042.A02.A09("SELECT count FROM message_media_vcard_count WHERE message_row_id = ?", "GET_VCARD_COUNT_BY_MESSAGE_ROW_ID_SQL", new String[]{Long.toString(r8.A1N)});
                if (A09.moveToFirst()) {
                    r8.A01.A01 = A09.getInt(A09.getColumnIndexOrThrow("count"));
                }
                A09.close();
                A042.close();
                return;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public void A04(C46972by r6) {
        if (r6.A09 == 7 && r6.A01 != null) {
            AnonymousClass1M0 A052 = this.A07.A05();
            try {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("message_row_id", Long.valueOf(r6.A1N));
                contentValues.put("count", Integer.valueOf(r6.A01.A01));
                A052.A02.A06("message_media_vcard_count", "REPLACE_VCARD_COUNT_SQL", contentValues);
                A052.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public C25071Ew(C19730wQ r1, AnonymousClass16D r2, AnonymousClass1C7 r3, AnonymousClass163 r4, C220412q r5, C219712j r6, C220612s r7, AnonymousClass12P r8) {
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r8;
        this.A06 = r7;
    }
}
