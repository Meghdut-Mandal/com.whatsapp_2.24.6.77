package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.6Ve  reason: invalid class name and case insensitive filesystem */
public abstract class C132766Ve {
    public static AnonymousClass6SB A00(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass6SB r1;
        AnonymousClass6SB r0;
        Pattern compile = Pattern.compile("index (\\w+)$");
        HashMap A0J = AnonymousClass001.A0J();
        ArrayList A0I = AnonymousClass001.A0I();
        Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA integrity_check", (String[]) null);
        if (rawQuery != null) {
            int i = 0;
            while (true) {
                try {
                    if (rawQuery.moveToNext()) {
                        i++;
                        String string = rawQuery.getString(0);
                        int i2 = 1;
                        if (i == 1 && "ok".equalsIgnoreCase(string)) {
                            r0 = new AnonymousClass6SB(A0I, A0J, 0);
                            break;
                        }
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("BaseSQLiteOpenHelperUtils/integritycheck/c ");
                        A0u.append(i);
                        C36321k7.A1Q(" ", string, A0u);
                        Matcher matcher = compile.matcher(string);
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            Integer num = (Integer) A0J.get(group);
                            if (num != null) {
                                i2 = 1 + num.intValue();
                            }
                            C36341k9.A1K(group, A0J, i2);
                        } else {
                            A0I.add(string);
                        }
                    } else {
                        Iterator A0s = C90484aE.A0s(A0J);
                        while (A0s.hasNext()) {
                            String A0C = AnonymousClass001.A0C(A0s);
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            A0u2.append("BaseSQLiteOpenHelperUtils/integritycheck/error-details/index/");
                            A0u2.append(A0C);
                            C36321k7.A1K((Integer) A0J.get(A0C), " cnt=", A0u2);
                        }
                        Iterator it = A0I.iterator();
                        while (it.hasNext()) {
                            C36321k7.A1Q("BaseSQLiteOpenHelperUtils/integritycheck/error-details/other/", AnonymousClass001.A0C(it), AnonymousClass000.A0u());
                        }
                        r0 = new AnonymousClass6SB(A0I, A0J, i);
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e("BaseSQLiteOpenHelperUtils/integritycheck/c/error", e);
                    AnonymousClass6SB r02 = AnonymousClass6SB.A04;
                    e.getMessage();
                    r1 = new AnonymousClass6SB(-3);
                    rawQuery.close();
                    return r1;
                } catch (Exception e2) {
                    Log.e("BaseSQLiteOpenHelperUtils/integritycheck/c/error", e2);
                    AnonymousClass6SB r03 = AnonymousClass6SB.A04;
                    e2.getMessage();
                    r1 = new AnonymousClass6SB(-1);
                    rawQuery.close();
                    return r1;
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
            rawQuery.close();
            return r0;
        }
        Log.w("BaseSQLiteOpenHelperUtils/integritycheck/query-failed");
        return AnonymousClass6SB.A04;
    }

    public static String A01(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor rawQuery;
        String str2 = "";
        try {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("select sql from sqlite_master where type='table' and name='");
            A0u.append(str);
            rawQuery = sQLiteDatabase.rawQuery(AnonymousClass000.A0q("';", A0u), (String[]) null);
            if (rawQuery != null) {
                if (rawQuery.moveToNext()) {
                    str2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("sql"));
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
                return str2;
            }
        } catch (Exception e) {
            C90464aC.A1L("base-sqlite-open-helper-utils/schema ", str, AnonymousClass000.A0u(), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return str2;
        throw th;
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        A03(sQLiteDatabase, A01(sQLiteDatabase, str), str, str2, str3);
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        String trim = str3.trim();
        String trim2 = str4.trim();
        if (!C224614k.A06(str, trim, trim2)) {
            try {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("ALTER TABLE ");
                A0u.append(str2);
                A0u.append(" ADD ");
                A0u.append(trim);
                sQLiteDatabase.execSQL(AnonymousClass000.A0p(" ", trim2, A0u));
            } catch (SQLiteException e) {
                C90464aC.A1L("base-sqlite-open-helper-utils/add-column ", trim, AnonymousClass000.A0u(), e);
            }
        }
    }
}
