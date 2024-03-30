package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.14k  reason: invalid class name and case insensitive filesystem */
public abstract class C224614k {
    public static String A00(C224114e r4, String str, String str2) {
        Cursor A09;
        String str3 = "";
        try {
            A09 = r4.A09("SELECT sql FROM sqlite_master WHERE type = ? AND name = ?", "SELECT_SQL_FROM_SQLITE_MASTER_BY_TYPE_AND_NAME", new String[]{str, str2});
            if (A09.moveToNext()) {
                str3 = A09.getString(A09.getColumnIndexOrThrow("sql"));
            }
            A09.close();
            return str3;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("BaseDatabaseTable/getSqlFor view = ");
            sb.append(str2);
            Log.e(sb.toString(), e);
            return str3;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void A02(C224114e r3, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("SharedDBQueryExecutor/dropIndex/attempting to drop index: ");
        sb.append(str2);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DROP INDEX IF EXISTS ");
        sb2.append(str2);
        r3.A0D(sb2.toString(), C63853Lr.A01(str, "dropIndexIfExistsWithoutStatement", C63853Lr.A00(str2)));
    }

    public static boolean A05(C224114e r8, String str, List list, List list2) {
        C224114e r6 = r8;
        String str2 = str;
        String A00 = A00(r6, "table", str);
        if (TextUtils.isEmpty(A00)) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C64563Om r0 = (C64563Om) it.next();
                String str3 = r0.A00;
                String A002 = r0.A00();
                if (!AnonymousClass14B.A0F(A002)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(" ");
                    sb.append(A002);
                    str3 = sb.toString();
                }
                arrayList.add(str3);
            }
            arrayList.addAll(list2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE IF NOT EXISTS ");
            sb2.append(str);
            sb2.append("(");
            sb2.append(TextUtils.join(",", arrayList));
            sb2.append(")");
            String obj = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("CREATE_");
            sb3.append(str);
            r6.A0D(obj, sb3.toString());
            return true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C64563Om r02 = (C64563Om) it2.next();
            A04(r6, A00, str2, r02.A00, r02.A00(), "SharedDBQueryExecutor/createOrAlterTable");
        }
        return false;
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(C54162sV.A00(str));
    }

    public static void A03(C224114e r3, String str, String str2) {
        r3.A0D(C54162sV.A00(str2), C63853Lr.A01(str, "dropLoggableDatabaseTables", C63853Lr.A00(str2)));
    }

    public static boolean A04(C224114e r6, String str, String str2, String str3, String str4, String str5) {
        String trim = str3.trim();
        String trim2 = str4.trim();
        if (A06(str, trim, trim2)) {
            return false;
        }
        if (trim2.contains(" NOT NULL") && !trim2.contains(" DEFAULT ")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot add not null without default value ");
            sb.append(str2);
            sb.append(".");
            sb.append(trim);
            C18740tg.A0D(false, sb.toString());
            trim2 = trim2.replace(" NOT NULL", "");
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ALTER TABLE ");
            sb2.append(str2);
            sb2.append(" ADD ");
            sb2.append(trim);
            sb2.append(" ");
            sb2.append(trim2);
            String obj = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str5);
            sb3.append("/addColumnIfNotExists/ALTER_TABLE");
            r6.A0D(obj, sb3.toString());
            return true;
        } catch (SQLiteException e) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("databasehelper/addColumnIfNotExists/alter_table ");
            sb4.append(trim);
            Log.w(sb4.toString(), e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0051, code lost:
        if (r1.contains(r0.toString()) != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r6 = r9.trim()
            java.lang.String r1 = r10.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r1.toUpperCase(r0)
            java.lang.String r4 = "\\s+"
            java.lang.String r7 = " "
            java.lang.String r1 = r8.replaceAll(r4, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = ","
            r0.append(r3)
            r0.append(r6)
            r0.append(r7)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.contains(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0053
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r8.replaceAll(r4, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0054
        L_0x0053:
            return r2
        L_0x0054:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "[(,]\\s*(`*)"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "(`*)(\\s+)"
            r1.append(r0)
            java.lang.String r0 = "(\\\\s+)"
            java.lang.String r0 = r5.replaceAll(r4, r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r1, r0)
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r0 = r0.find()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224614k.A06(java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
