package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.ConditionVariable;
import android.os.OperationCanceledException;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.14e  reason: invalid class name and case insensitive filesystem */
public class C224114e {
    public final SQLiteDatabase A00;
    public final AnonymousClass12S A01;
    public final AnonymousClass11g A02;
    public final String A03;

    public long A04(String str, String str2, ContentValues contentValues) {
        long j;
        ConditionVariable conditionVariable = C18740tg.A00;
        SystemClock.uptimeMillis();
        try {
            j = this.A00.insert(str, (String) null, contentValues);
        } catch (SQLiteConstraintException e) {
            Log.e("insert/Record insertion raised an unexpected exception.", e);
            j = -1;
        }
        this.A02.A02(this.A03, 2, str2);
        return j;
    }

    public long A05(String str, String str2, ContentValues contentValues) {
        ConditionVariable conditionVariable = C18740tg.A00;
        SystemClock.uptimeMillis();
        long insertOrThrow = this.A00.insertOrThrow(str, (String) null, contentValues);
        this.A02.A02(this.A03, 2, str2);
        return insertOrThrow;
    }

    public long A06(String str, String str2, ContentValues contentValues) {
        ConditionVariable conditionVariable = C18740tg.A00;
        SystemClock.uptimeMillis();
        long replace = this.A00.replace(str, (String) null, contentValues);
        this.A02.A02(this.A03, 5, str2);
        return replace;
    }

    public long A07(String str, String str2, ContentValues contentValues) {
        ConditionVariable conditionVariable = C18740tg.A00;
        SystemClock.uptimeMillis();
        long replaceOrThrow = this.A00.replaceOrThrow(str, (String) null, contentValues);
        this.A02.A02(this.A03, 5, str2);
        return replaceOrThrow;
    }

    public long A08(String str, String str2, ContentValues contentValues, int i) {
        long j;
        ConditionVariable conditionVariable = C18740tg.A00;
        SystemClock.uptimeMillis();
        try {
            j = this.A00.insertWithOnConflict(str, (String) null, contentValues, i);
        } catch (SQLiteConstraintException e) {
            Log.e("insertWithOnConflict/Record insertion raised an unexpected exception.", e);
            j = -1;
        }
        this.A02.A02(this.A03, 2, str2);
        return j;
    }

    @Deprecated
    public Cursor A0A(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        A00(strArr2);
        SystemClock.uptimeMillis();
        Cursor query = this.A00.query(false, str, strArr, str2, strArr2, str3, (String) null, str4, str5);
        this.A02.A02(this.A03, 1, str6);
        return query;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r4.length <= 999) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(java.lang.Object[] r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0008
            int r2 = r4.length
            r0 = 999(0x3e7, float:1.4E-42)
            r1 = 0
            if (r2 > r0) goto L_0x0009
        L_0x0008:
            r1 = 1
        L_0x0009:
            java.lang.String r0 = "Too many sql arguments"
            X.C18740tg.A0D(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224114e.A00(java.lang.Object[]):void");
    }

    public int A02(ContentValues contentValues, String str, String str2, String str3, String[] strArr, int i) {
        ConditionVariable conditionVariable = C18740tg.A00;
        SystemClock.uptimeMillis();
        int updateWithOnConflict = this.A00.updateWithOnConflict(str, contentValues, str2, strArr, i);
        this.A02.A02(this.A03, 3, str3);
        return updateWithOnConflict;
    }

    public AnonymousClass6QI A0C(String str, String str2) {
        ConditionVariable conditionVariable = C18740tg.A00;
        AnonymousClass11g r2 = this.A02;
        String str3 = this.A03;
        r2.A02(str3, 6, str2);
        SystemClock.uptimeMillis();
        return new AnonymousClass6QI(this.A00.compileStatement(str), r2, this.A01, str2, str3);
    }

    public void A0D(String str, String str2) {
        ConditionVariable conditionVariable = C18740tg.A00;
        SystemClock.uptimeMillis();
        this.A00.execSQL(str);
        this.A02.A02(this.A03, 7, str2);
    }

    public C224114e(SQLiteDatabase sQLiteDatabase, AnonymousClass11g r2, AnonymousClass12S r3, String str) {
        this.A03 = str;
        this.A00 = sQLiteDatabase;
        this.A01 = r3;
        this.A02 = r2;
    }

    public int A01(ContentValues contentValues, String str, String str2, String str3, String[] strArr) {
        A00(strArr);
        SystemClock.uptimeMillis();
        int update = this.A00.update(str, contentValues, str2, strArr);
        this.A02.A02(this.A03, 3, str3);
        return update;
    }

    public int A03(String str, String str2, String str3, String[] strArr) {
        A00(strArr);
        SystemClock.uptimeMillis();
        int delete = this.A00.delete(str, str2, strArr);
        this.A02.A02(this.A03, 4, str3);
        return delete;
    }

    public Cursor A09(String str, String str2, String[] strArr) {
        A00(strArr);
        SystemClock.uptimeMillis();
        Cursor rawQuery = this.A00.rawQuery(str, strArr);
        this.A02.A02(this.A03, 0, str2);
        return rawQuery;
    }

    public C36721lC A0B(C02680Bk r5, String str, String str2, String[] strArr) {
        CancellationSignal cancellationSignal;
        A00(strArr);
        SystemClock.uptimeMillis();
        if (r5 != null) {
            try {
                cancellationSignal = (CancellationSignal) r5.A02();
            } catch (Exception e) {
                e = e;
                if (e instanceof OperationCanceledException) {
                    e = new AnonymousClass02S();
                }
                throw e;
            }
        } else {
            cancellationSignal = null;
        }
        C36721lC r3 = new C36721lC(this.A00.rawQuery(str, strArr, cancellationSignal));
        this.A02.A02(this.A03, 0, str2);
        return r3;
    }

    public void A0E(String str, String str2, Object[] objArr) {
        A00(objArr);
        SystemClock.uptimeMillis();
        this.A00.execSQL(str, objArr);
        this.A02.A02(this.A03, 7, str2);
    }
}
