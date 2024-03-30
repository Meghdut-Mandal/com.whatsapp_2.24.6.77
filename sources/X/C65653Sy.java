package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3Sy  reason: invalid class name and case insensitive filesystem */
public class C65653Sy {
    public final AnonymousClass12P A00;
    public final C74013kv A01;

    public C593733r A05(String str, long j, long j2, long j3) {
        String[] strArr;
        String str2;
        String str3;
        Cursor A09;
        if (j2 >= 0) {
            strArr = new String[4];
            strArr[0] = str;
            C36351kA.A1V(strArr, 1, j);
            C36351kA.A1V(strArr, 2, j2);
            C36351kA.A1V(strArr, 3, j3);
            str2 = "SELECT DISTINCT table_row_id FROM backup_changes WHERE (operation = 'DELETE') AND (table_name = ?) AND (table_row_id > ?) AND (_id <= ?) ORDER BY table_row_id ASC LIMIT ?";
            str3 = "BackupChangesStore/SELECT_DELETED_IDS_V2";
        } else {
            strArr = new String[3];
            strArr[0] = str;
            C36351kA.A1V(strArr, 1, j);
            C36351kA.A1V(strArr, 2, j3);
            str2 = "SELECT DISTINCT table_row_id FROM backup_changes WHERE (operation = 'DELETE') AND (table_name = ?) AND (table_row_id > ?) ORDER BY table_row_id ASC LIMIT ?";
            str3 = "BackupChangesStore/SELECT_DELETED_IDS";
        }
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09(str2, str3, strArr);
            C593733r A002 = A00(A09, j);
            if (A09 != null) {
                A09.close();
            }
            A04.close();
            return A002;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C593733r A06(String str, long j, long j2, long j3) {
        String[] strArr;
        String str2;
        String str3;
        Cursor A09;
        if (j2 != -1) {
            strArr = new String[4];
            strArr[0] = str;
            C36351kA.A1V(strArr, 1, j);
            C36351kA.A1V(strArr, 2, j2);
            C36351kA.A1V(strArr, 3, j3);
            str2 = "SELECT table_row_id FROM backup_changes WHERE ((operation = 'INSERT') OR (operation = 'UPDATE')) AND (table_name = ?) AND (table_row_id > ?) AND (_id <= ?) ORDER BY table_row_id ASC LIMIT ?";
            str3 = "BackupChangesStore/SELECT_UPDATED_IDS_V2";
        } else {
            strArr = new String[3];
            strArr[0] = str;
            C36351kA.A1V(strArr, 1, j);
            C36351kA.A1V(strArr, 2, j3);
            str2 = "SELECT DISTINCT table_row_id FROM backup_changes WHERE ((operation = 'INSERT') OR (operation = 'UPDATE')) AND (table_name = ?) AND (table_row_id > ?) ORDER BY table_row_id ASC LIMIT ?";
            str3 = "BackupChangesStore/SELECT_UPDATED_IDS";
        }
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09(str2, str3, strArr);
            C593733r A002 = A00(A09, j);
            if (A09 != null) {
                A09.close();
            }
            A04.close();
            return A002;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static C593733r A00(Cursor cursor, long j) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("table_row_id");
        ArrayList A14 = C36441kJ.A14(cursor.getCount());
        while (cursor.moveToNext()) {
            C36391kE.A1W(A14, (long) cursor.getInt(columnIndexOrThrow));
        }
        if (!A14.isEmpty()) {
            j = C36431kI.A09(A14.get(A14.size() - 1));
        }
        return new C593733r(A14, j);
    }

    public static boolean A02(ContentValues contentValues, Object obj, String str) {
        if (obj == null) {
            contentValues.putNull(str);
            return true;
        } else if (obj instanceof String) {
            contentValues.put(str, (String) obj);
            return true;
        } else if (obj instanceof Byte) {
            contentValues.put(str, (Byte) obj);
            return true;
        } else if (obj instanceof Short) {
            contentValues.put(str, (Short) obj);
            return true;
        } else if (obj instanceof Integer) {
            contentValues.put(str, (Integer) obj);
            return true;
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
            return true;
        } else if (obj instanceof Float) {
            contentValues.put(str, (Float) obj);
            return true;
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
            return true;
        } else if (obj instanceof Boolean) {
            contentValues.put(str, (Boolean) obj);
            return true;
        } else if (!(obj instanceof byte[])) {
            return false;
        } else {
            contentValues.put(str, (byte[]) obj);
            return true;
        }
    }

    public long A03() {
        Cursor A09;
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09("SELECT COUNT(*) as count FROM available_message_view", "GET_MESSAGES_COUNT_EXCLUDE_DELETED_SQL", (String[]) null);
            A09.moveToNext();
            long A07 = C36351kA.A07(A09, "count");
            A09.close();
            A04.close();
            return A07;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A04(String str, String str2) {
        Cursor A09;
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            C224114e r4 = A04.A02;
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1N(str2, str, A0M);
            A09 = r4.A09(String.format("SELECT COUNT(%s) AS count FROM %s", A0M), "GET_NUMBER_OF_ROWS", (String[]) null);
            A09.moveToNext();
            long A07 = C36351kA.A07(A09, "count");
            A09.close();
            A04.close();
            return A07;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A07() {
        AnonymousClass1M0 A05 = this.A00.A05();
        try {
            A05.A02.A03("backup_changes", (String) null, "BackupChangesStore/DELETE_BACKUP_CHANGES", (String[]) null);
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A08(String str, long j) {
        AnonymousClass1M0 A05 = this.A00.A05();
        try {
            ContentValues A0E = C36441kJ.A0E();
            A0E.put("operation", "DELETE");
            A0E.put("table_name", str);
            C36341k9.A0p(A0E, "table_row_id", j);
            A05.A02.A04("backup_changes", "BackupChangesStore/INSERT_DELETED_ENTITY_ID", A0E);
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C65653Sy(AnonymousClass12P r1, C74013kv r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static HashMap A01(Cursor cursor, String[] strArr) {
        Object A0k;
        HashMap A0J = AnonymousClass001.A0J();
        for (int i = 0; i < strArr.length; i++) {
            if (!cursor.isNull(i)) {
                int type = cursor.getType(i);
                if (type == 1) {
                    A0k = C36361kB.A0k(cursor, i);
                } else if (type == 2) {
                    A0k = Double.valueOf(cursor.getDouble(i));
                } else if (type == 3) {
                    A0k = cursor.getString(i);
                } else if (type == 4) {
                    A0k = cursor.getBlob(i);
                }
                A0J.put(strArr[i], A0k);
            }
        }
        return A0J;
    }
}
