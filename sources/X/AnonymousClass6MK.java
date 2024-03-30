package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.6MK  reason: invalid class name */
public class AnonymousClass6MK {
    public final C1270466s A00;

    public static C123905xH A00(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("local_path");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("exported_path");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("required");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("encryption_iv");
        long j = cursor.getLong(columnIndexOrThrow);
        String string = cursor.getString(columnIndexOrThrow2);
        String string2 = cursor.getString(columnIndexOrThrow3);
        int i = cursor.getInt(columnIndexOrThrow4);
        long j2 = cursor.getLong(columnIndexOrThrow5);
        String string3 = cursor.getString(columnIndexOrThrow6);
        C18740tg.A06(string);
        C18740tg.A06(string2);
        C18740tg.A06(string3);
        return new C123905xH(C90524aI.A0S(string), string2, string3, j, j2, AnonymousClass000.A1P(i));
    }

    public AnonymousClass6MK(C1270466s r1) {
        this.A00 = r1;
    }

    public long A01(String str, String str2, String str3, long j, boolean z) {
        C1031154a r0;
        ContentValues A0E = C36441kJ.A0E();
        A0E.put("local_path", str);
        A0E.put("exported_path", str2);
        A0E.put("required", Boolean.valueOf(z));
        A0E.put("file_size", Long.valueOf(j));
        A0E.put("encryption_iv", str3);
        C1270466s r1 = this.A00;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                r0 = (C1031154a) r1.A02.get();
                r1.A00 = r0;
            }
        }
        AnonymousClass1M0 A04 = r0.A04();
        try {
            long A042 = A04.A02.A04("exported_files_metadata", "XPM_EXPORT_FILE_METADATA_ADD", A0E);
            A04.close();
            return A042;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
