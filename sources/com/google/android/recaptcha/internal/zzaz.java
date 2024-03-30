package com.google.android.recaptcha.internal;

import X.C007103b;
import X.C05250Oz;
import X.C36371kC;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.List;

public final class zzaz extends SQLiteOpenHelper {
    public static final zzax zza = new zzax((C05250Oz) null);
    public static final int zzb = zzax.zzb("18.4.0");
    public static zzaz zzc;

    public /* synthetic */ zzaz(Context context, C05250Oz r5) {
        super(context, "cesdb", (SQLiteDatabase.CursorFactory) null, zzb);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(C007103b.A0Q(", ", "(", ")", list, zzay.zza))), (String[]) null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", (String[]) null);
        int i = -1;
        try {
            if (rawQuery.moveToNext()) {
                i = rawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r5 = X.C023409w.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzd() {
        /*
            r8 = this;
            android.database.sqlite.SQLiteDatabase r0 = r8.getReadableDatabase()
            java.lang.String r1 = "ce"
            r2 = 0
            java.lang.String r7 = "ts ASC"
            r4 = r2
            r5 = r2
            r6 = r2
            r3 = r2
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
        L_0x0015:
            boolean r0 = r6.moveToNext()     // Catch:{ Exception -> 0x0039 }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "id"
            int r4 = X.C36351kA.A03(r6, r0)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = "ss"
            java.lang.String r3 = X.C36341k9.A0f(r6, r0)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = "ts"
            long r1 = X.C36351kA.A07(r6, r0)     // Catch:{ Exception -> 0x0039 }
            X.AnonymousClass00C.A0B(r3)     // Catch:{ Exception -> 0x0039 }
            com.google.android.recaptcha.internal.zzba r0 = new com.google.android.recaptcha.internal.zzba     // Catch:{ Exception -> 0x0039 }
            r0.<init>(r3, r1, r4)     // Catch:{ Exception -> 0x0039 }
            r5.add(r0)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0015
        L_0x0039:
            X.09w r5 = X.C023409w.A00     // Catch:{ all -> 0x003f }
        L_0x003b:
            r6.close()
            return r5
        L_0x003f:
            r0 = move-exception
            r6.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaz.zzd():java.util.List");
    }

    public final boolean zzf(zzba zzba) {
        if (zza(C36371kC.A11(zzba)) != 1) {
            return false;
        }
        return true;
    }
}
