package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.14d  reason: invalid class name and case insensitive filesystem */
public abstract class C224014d {
    public static void A02(Cursor cursor, HashMap hashMap, String[] strArr) {
        for (String str : strArr) {
            C18740tg.A0D(!hashMap.containsKey(str), "Column is already in the map, make sure there are no columns with same name in the same query.");
            hashMap.put(str, Integer.valueOf(cursor.getColumnIndexOrThrow(str)));
        }
    }

    public static boolean A03(Cursor cursor, int i) {
        if (!cursor.isNull(i) && cursor.getInt(i) == 1) {
            return true;
        }
        return false;
    }

    public static C224114e A01(SQLiteDatabase sQLiteDatabase, AnonymousClass11g r2, AnonymousClass12S r3, String str) {
        Log.i("DatabaseUtils/initDatabase/injected sql log writer/using modified LoggableSQLiteDatabase");
        if (TextUtils.isEmpty(str)) {
            str = "unspecified";
        }
        return new C224114e(sQLiteDatabase, r2, r3, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r1.delete() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005a, code lost:
        if (r3.delete() != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0068, code lost:
        if (r2.delete() != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(java.io.File r5, java.lang.String r6) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-wal"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-journal"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-shm"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r3.exists()
            r5 = 0
            if (r0 == 0) goto L_0x005c
            boolean r0 = r3.delete()
            r4 = 0
            if (r0 == 0) goto L_0x005d
        L_0x005c:
            r4 = 1
        L_0x005d:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x006a
            boolean r0 = r2.delete()
            r3 = 0
            if (r0 == 0) goto L_0x006b
        L_0x006a:
            r3 = 1
        L_0x006b:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0078
            boolean r0 = r1.delete()
            r2 = 0
            if (r0 == 0) goto L_0x0079
        L_0x0078:
            r2 = 1
        L_0x0079:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = "deleteTemporaryFiles/journalDeleted="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; writeAheadLogDeleted="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; sharedDeleted="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 == 0) goto L_0x00a7
            if (r3 == 0) goto L_0x00a7
            if (r2 == 0) goto L_0x00a7
            r5 = 1
        L_0x00a7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224014d.A04(java.io.File, java.lang.String):boolean");
    }

    public static int A00(String str, HashMap hashMap) {
        Object obj = hashMap.get(str);
        C18740tg.A06(obj);
        return ((Number) obj).intValue();
    }
}
