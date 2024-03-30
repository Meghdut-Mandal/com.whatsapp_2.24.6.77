package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.163  reason: invalid class name */
public class AnonymousClass163 implements AnonymousClass162 {
    public final C220412q A00;
    public final AnonymousClass12J A01;
    public final C219712j A02;
    public final C220612s A03;
    public final AnonymousClass12P A04;
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final C19730wQ A07;
    public final C19970wo A08;
    public final C20810yC A09;
    public final AnonymousClass005 A0A;

    public int A06(C65073Qp r2) {
        return A05(r2.A05((Long) null), r2);
    }

    public long A08(AnonymousClass11F r3) {
        synchronized (this) {
            Long l = (Long) this.A05.get(r3);
            if (l != null) {
                long longValue = l.longValue();
                return longValue;
            }
            long A012 = A01(r3);
            A04(r3, A012);
            return A012;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r4 = r7.A04.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r4.A02.A09("SELECT jid_row_id FROM chat WHERE _id = ?", "GET_CHAT_BY_ROW_ID_SQL", new java.lang.String[]{java.lang.Long.toString(r8)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r3.moveToLast() == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r1 = r7.A02.A09(r3.getLong(r3.getColumnIndexOrThrow("jid_row_id")));
        r0 = X.AnonymousClass11F.A00;
        r6 = X.C222713q.A00(r1);
        A04(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r3 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass11F A0A(long r8) {
        /*
            r7 = this;
            r6 = 0
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
            monitor-enter(r7)
            java.util.Map r2 = r7.A06     // Catch:{ all -> 0x0073 }
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0073 }
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x001c
            java.lang.Object r6 = r2.get(r1)     // Catch:{ all -> 0x0073 }
            X.11F r6 = (X.AnonymousClass11F) r6     // Catch:{ all -> 0x0073 }
            monitor-exit(r7)     // Catch:{ all -> 0x0073 }
            return r6
        L_0x001c:
            monitor-exit(r7)     // Catch:{ all -> 0x0073 }
            X.12P r0 = r7.A04
            X.1M0 r4 = r0.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = "SELECT jid_row_id FROM chat WHERE _id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0069 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r8)     // Catch:{ all -> 0x0069 }
            r2[r1] = r0     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "GET_CHAT_BY_ROW_ID_SQL"
            android.database.Cursor r3 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x0069 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0056
            X.12j r2 = r7.A02     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "jid_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005d }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x005d }
            com.whatsapp.jid.Jid r1 = r2.A09(r0)     // Catch:{ all -> 0x005d }
            X.13q r0 = X.AnonymousClass11F.A00     // Catch:{ all -> 0x005d }
            X.11F r6 = X.C222713q.A00(r1)     // Catch:{ all -> 0x005d }
            r7.A04(r6, r8)     // Catch:{ all -> 0x005d }
        L_0x0056:
            r3.close()     // Catch:{ all -> 0x0069 }
            r4.close()
            return r6
        L_0x005d:
            r1 = move-exception
            if (r3 == 0) goto L_0x0068
            r3.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0069 }
        L_0x0068:
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x006e }
            throw r1
        L_0x006e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0073:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0073 }
            throw r1
        L_0x0076:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass163.A0A(long):X.11F");
    }

    public void A0D(C65073Qp r5) {
        ContentValues contentValues;
        synchronized (r5) {
            contentValues = new ContentValues(2);
            contentValues.put("change_number_notified_message_row_id", Long.valueOf(r5.A0C));
        }
        A05(contentValues, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r3.A03.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.C65073Qp r4) {
        /*
            r3 = this;
            monitor-enter(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x002f }
            r2.<init>()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "archived"
            boolean r0 = r4.A0i     // Catch:{ all -> 0x002f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x002f }
            r2.put(r1, r0)     // Catch:{ all -> 0x002f }
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            int r0 = r3.A05(r2, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            if (r0 != 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            java.lang.String r0 = "msgstore/archive/did not update "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            X.11F r0 = r4.A0q     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0037:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r3.A03
            r0.A03()
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass163.A0E(X.3Qp):void");
    }

    public void A0F(C65073Qp r5) {
        ContentValues contentValues;
        synchronized (r5) {
            contentValues = new ContentValues();
            contentValues.put("unseen_message_reaction_count", Integer.valueOf(r5.A07));
            contentValues.put("last_message_reaction_row_id", Long.valueOf(r5.A0M));
            contentValues.put("last_seen_message_reaction_row_id", Long.valueOf(r5.A0T));
        }
        int A052 = A05(contentValues, r5);
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/updateChatLastMessageReactionInfo/");
        sb.append(r5.A0q);
        sb.append("/");
        sb.append(r5.A09());
        sb.append("/");
        sb.append(A052);
        Log.i(sb.toString());
    }

    public boolean A0L(C65073Qp r5) {
        ContentValues contentValues;
        synchronized (r5) {
            contentValues = new ContentValues(5);
            contentValues.put("display_message_row_id", Long.valueOf(r5.A0U));
            contentValues.put("display_message_sort_id", Long.valueOf(r5.A0V));
            contentValues.put("last_message_row_id", Long.valueOf(r5.A0N));
            contentValues.put("last_message_sort_id", Long.valueOf(r5.A0O));
            contentValues.put("sort_timestamp", Long.valueOf(r5.A0X));
        }
        return A0K(contentValues, r5);
    }

    private long A00(AnonymousClass11F r13) {
        Cursor A092;
        long j;
        long A072 = this.A02.A07(r13);
        if (A072 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatStore/getOrCreateChatRowId/invalid jidRowId=");
            sb.append(A072);
            Log.e(sb.toString());
            return -1;
        }
        AnonymousClass1M0 A042 = this.A04.get();
        try {
            A092 = A042.A02.A09("SELECT _id FROM chat WHERE jid_row_id = ?", "GET_ROW_ID_FOR_CHAT", new String[]{Long.toString(A072)});
            if (A092.moveToNext()) {
                j = A092.getLong(A092.getColumnIndexOrThrow("_id"));
            } else {
                j = -1;
            }
            A092.close();
            A042.close();
            if (j == -1) {
                j = A02(r13);
                if (j <= 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ChatStore/getOrCreateChatRowId/error inserting a hidden chat; jid=");
                    sb2.append(r13);
                    sb2.append("; rowId=");
                    sb2.append(j);
                    Log.e(sb2.toString());
                }
            }
            return j;
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r3 == -1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r3 = A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (r3 > 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("ChatStore/getRowIdForChatHelperMAT/error inserting a hidden chat; jid=");
        r1.append(r9);
        r1.append("; rowId=");
        r1.append(r3);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r3 > 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long A01(X.AnonymousClass11F r9) {
        /*
            r8 = this;
            X.0wQ r0 = r8.A07
            boolean r0 = r0.A0M(r9)
            if (r0 != 0) goto L_0x00a2
            X.0yC r2 = r8.A09
            r0 = 2939(0xb7b, float:4.118E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x00a2
            r0 = 2479(0x9af, float:3.474E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x00a2
            X.12q r1 = r8.A00
            r0 = 0
            X.3Qp r0 = r1.A09(r9, r0)
            r6 = 0
            java.lang.String r5 = "; rowId="
            if (r0 == 0) goto L_0x0030
            long r3 = r0.A0W
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0030
        L_0x002f:
            return r3
        L_0x0030:
            X.12J r3 = r8.A01
            java.util.List r0 = r3.BDG(r9)
            r4 = 0
            java.util.HashMap r2 = r8.A03(r0, r4)
            java.util.Iterator r1 = r0.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x003f
        L_0x0051:
            long r3 = r0.longValue()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002f
        L_0x005b:
            long r3 = r8.A02(r9)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ChatStore/getRowIdForChatHelperMAT/error inserting a hidden chat; jid="
            r1.append(r0)
            r1.append(r9)
            r1.append(r5)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x007e:
            java.util.List r3 = r3.BDF(r9)
            r1 = 1
            java.util.List r0 = r3.subList(r4, r1)
            java.util.HashMap r2 = r8.A03(r0, r1)
            java.util.Iterator r1 = r3.iterator()
        L_0x008f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x008f
            goto L_0x0051
        L_0x00a2:
            X.12q r1 = r8.A00
            r0 = 0
            X.3Qp r0 = r1.A09(r9, r0)
            if (r0 == 0) goto L_0x00b4
            long r3 = r0.A0W
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b4
            return r3
        L_0x00b4:
            long r3 = r8.A00(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass163.A01(X.11F):long");
    }

    private long A02(AnonymousClass11F r10) {
        AnonymousClass1M0 A052;
        long A072 = this.A02.A07(r10);
        if (A072 == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatStore/insertHiddenChat/jid row id not found; jid=");
            sb.append(r10);
            Log.e(sb.toString());
            return -1;
        }
        C52152oy A002 = ((AnonymousClass1ER) this.A0A.get()).A00(r10);
        int i = 2;
        if (A002 != null) {
            i = 3;
        }
        ContentValues contentValues = new ContentValues(i);
        contentValues.put("jid_row_id", Long.valueOf(A072));
        contentValues.put("hidden", 1);
        if (A002 != null) {
            contentValues.put("chat_origin", A002.origin);
        }
        try {
            A052 = this.A04.A05();
            long A053 = A052.A02.A05("chat", "insertHiddenChat/INSERT_CHAT", contentValues);
            A052.close();
            return A053;
        } catch (SQLiteConstraintException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ChatStore/insertHiddenChat/row already exists but can't be read; jid=");
            sb2.append(r10);
            Log.e(sb2.toString(), e);
            return -1;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (X.AnonymousClass143.A0I(r2) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(X.AnonymousClass11F r5, long r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0068
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            monitor-enter(r4)
            java.util.Map r0 = r4.A05     // Catch:{ all -> 0x0065 }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0065 }
            r0.put(r5, r3)     // Catch:{ all -> 0x0065 }
            java.util.Map r1 = r4.A06     // Catch:{ all -> 0x0065 }
            java.lang.Object r2 = r1.get(r3)     // Catch:{ all -> 0x0065 }
            X.11F r2 = (X.AnonymousClass11F) r2     // Catch:{ all -> 0x0065 }
            boolean r0 = r5.equals(r2)     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0031
            if (r2 == 0) goto L_0x002e
            boolean r0 = X.AnonymousClass143.A0I(r5)     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0033
            boolean r0 = X.AnonymousClass143.A0I(r2)     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0042
        L_0x002e:
            r1.put(r3, r5)     // Catch:{ all -> 0x0065 }
        L_0x0031:
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            goto L_0x0064
        L_0x0033:
            boolean r0 = X.AnonymousClass143.A0I(r2)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0042
            X.12q r0 = r4.A00     // Catch:{ all -> 0x0065 }
            boolean r0 = r0.A0M(r5)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0042
            goto L_0x002e
        L_0x0042:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "Attempted to overwrite cached JID "
            r1.append(r0)     // Catch:{ all -> 0x0065 }
            r1.append(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = " with new JID "
            r1.append(r0)     // Catch:{ all -> 0x0065 }
            r1.append(r5)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0065 }
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ all -> 0x0065 }
            r0.<init>()     // Catch:{ all -> 0x0065 }
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ all -> 0x0065 }
            goto L_0x0031
        L_0x0064:
            return
        L_0x0065:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            throw r0
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass163.A04(X.11F, long):void");
    }

    public int A05(ContentValues contentValues, C65073Qp r13) {
        AnonymousClass11F r5 = r13.A0q;
        AnonymousClass1M0 A052 = this.A04.A05();
        try {
            boolean z = false;
            if (r13.A02 == 5) {
                z = true;
            }
            ContentValues contentValues2 = contentValues;
            if (!z) {
                if (!(r5 instanceof C28981Uw)) {
                    contentValues.put("hidden", 0);
                    if (r13.A0o) {
                        r13.A0o = false;
                    }
                    long A072 = this.A02.A07(r5);
                    int A012 = A052.A02.A01(contentValues2, "chat", "jid_row_id = ?", "updateChatTable/UPDATE_CHAT", new String[]{String.valueOf(A072)});
                    A052.close();
                    return A012;
                }
            }
            contentValues.put("hidden", 1);
            long A0722 = this.A02.A07(r5);
            int A0122 = A052.A02.A01(contentValues2, "chat", "jid_row_id = ?", "updateChatTable/UPDATE_CHAT", new String[]{String.valueOf(A0722)});
            A052.close();
            return A0122;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public long A07(ContentValues contentValues) {
        AnonymousClass1M0 A052 = this.A04.A05();
        try {
            contentValues.put("hidden", 0);
            long A042 = A052.A02.A04("chat", "insertIntoChatTable/INSERT_CHAT", contentValues);
            A052.close();
            return A042;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public long A09(AnonymousClass3T1 r4) {
        AnonymousClass11F r2 = r4.A1J.A00;
        if (r2 == null) {
            return -1;
        }
        if (r4 instanceof AnonymousClass2bI) {
            return A00(r2);
        }
        long A012 = A01(r2);
        A04(r2, A012);
        return A012;
    }

    public AnonymousClass11F A0B(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("chat_row_id");
        if (columnIndex >= 0) {
            return A0A(cursor.getLong(columnIndex));
        }
        return null;
    }

    public HashMap A0C() {
        C224214g r12 = new C224214g("ChatsStore/getChats");
        HashMap hashMap = new HashMap();
        try {
            AnonymousClass1M0 A042 = this.A04.get();
            try {
                Cursor A092 = A042.A02.A09(AnonymousClass1M1.A00, "GET_CHATS_SQL", (String[]) null);
                try {
                    int columnIndexOrThrow = A092.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("raw_string_jid");
                    int columnIndexOrThrow3 = A092.getColumnIndexOrThrow("display_message_row_id");
                    int columnIndexOrThrow4 = A092.getColumnIndexOrThrow("display_message_sort_id");
                    int columnIndexOrThrow5 = A092.getColumnIndexOrThrow("last_read_message_row_id");
                    int columnIndexOrThrow6 = A092.getColumnIndexOrThrow("last_read_message_sort_id");
                    int columnIndexOrThrow7 = A092.getColumnIndexOrThrow("last_read_receipt_sent_message_row_id");
                    int columnIndexOrThrow8 = A092.getColumnIndexOrThrow("last_read_receipt_sent_message_sort_id");
                    int columnIndexOrThrow9 = A092.getColumnIndexOrThrow("archived");
                    int columnIndexOrThrow10 = A092.getColumnIndexOrThrow("sort_timestamp");
                    int columnIndexOrThrow11 = A092.getColumnIndexOrThrow("spam_detection");
                    int columnIndexOrThrow12 = A092.getColumnIndexOrThrow("plaintext_disabled");
                    int columnIndexOrThrow13 = A092.getColumnIndexOrThrow("vcard_ui_dismissed");
                    int columnIndexOrThrow14 = A092.getColumnIndexOrThrow("change_number_notified_message_row_id");
                    int columnIndexOrThrow15 = A092.getColumnIndexOrThrow("subject");
                    int columnIndexOrThrow16 = A092.getColumnIndexOrThrow("last_message_row_id");
                    int columnIndexOrThrow17 = A092.getColumnIndexOrThrow("last_message_sort_id");
                    int columnIndexOrThrow18 = A092.getColumnIndexOrThrow("last_important_message_row_id");
                    int columnIndexOrThrow19 = A092.getColumnIndexOrThrow("unseen_earliest_message_received_time");
                    int columnIndexOrThrow20 = A092.getColumnIndexOrThrow("unseen_message_count");
                    int columnIndexOrThrow21 = A092.getColumnIndexOrThrow("unseen_missed_calls_count");
                    int columnIndexOrThrow22 = A092.getColumnIndexOrThrow("unseen_row_count");
                    int columnIndexOrThrow23 = A092.getColumnIndexOrThrow("unseen_message_reaction_count");
                    int columnIndexOrThrow24 = A092.getColumnIndexOrThrow("unseen_comment_message_count");
                    int columnIndexOrThrow25 = A092.getColumnIndexOrThrow("last_message_reaction_row_id");
                    int columnIndexOrThrow26 = A092.getColumnIndexOrThrow("last_seen_message_reaction_row_id");
                    int columnIndexOrThrow27 = A092.getColumnIndexOrThrow("deleted_message_row_id");
                    int columnIndexOrThrow28 = A092.getColumnIndexOrThrow("deleted_starred_message_row_id");
                    int columnIndexOrThrow29 = A092.getColumnIndexOrThrow("deleted_categories_message_row_id");
                    int columnIndexOrThrow30 = A092.getColumnIndexOrThrow("deleted_categories_starred_message_row_id");
                    int columnIndexOrThrow31 = A092.getColumnIndexOrThrow("deleted_message_categories");
                    int columnIndexOrThrow32 = A092.getColumnIndexOrThrow("show_group_description");
                    int columnIndexOrThrow33 = A092.getColumnIndexOrThrow("ephemeral_expiration");
                    int columnIndexOrThrow34 = A092.getColumnIndexOrThrow("ephemeral_setting_timestamp");
                    int columnIndexOrThrow35 = A092.getColumnIndexOrThrow("ephemeral_displayed_exemptions");
                    int columnIndexOrThrow36 = A092.getColumnIndexOrThrow("ephemeral_disappearing_messages_initiator");
                    int columnIndexOrThrow37 = A092.getColumnIndexOrThrow("unseen_important_message_count");
                    int columnIndexOrThrow38 = A092.getColumnIndexOrThrow("group_type");
                    int columnIndexOrThrow39 = A092.getColumnIndexOrThrow("growth_lock_level");
                    int columnIndexOrThrow40 = A092.getColumnIndexOrThrow("growth_lock_expiration_ts");
                    int columnIndexOrThrow41 = A092.getColumnIndexOrThrow("has_new_community_admin_dialog_been_acknowledged");
                    int columnIndexOrThrow42 = A092.getColumnIndexOrThrow("history_sync_progress");
                    int columnIndexOrThrow43 = A092.getColumnIndexOrThrow("hidden");
                    int columnIndexOrThrow44 = A092.getColumnIndexOrThrow("chat_lock");
                    int columnIndexOrThrow45 = A092.getColumnIndexOrThrow("chat_origin");
                    while (A092.moveToNext()) {
                        AnonymousClass11F A022 = AnonymousClass11F.A00.A02(A092.getString(columnIndexOrThrow2));
                        if (A022 == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("msgstore-manager/initialize/chats/could not parse raw chat jid: ");
                            sb.append(A092.getString(columnIndexOrThrow2));
                            Log.w(sb.toString());
                        } else if (!(A022 instanceof C177528dw) && A092.getInt(columnIndexOrThrow43) != 1 && !(A022 instanceof C28981Uw)) {
                            C65073Qp r4 = new C65073Qp(A022);
                            r4.A0W = A092.getLong(columnIndexOrThrow);
                            r4.A0U = A092.getLong(columnIndexOrThrow3);
                            r4.A0V = A092.getLong(columnIndexOrThrow4);
                            r4.A0P = A092.getLong(columnIndexOrThrow5);
                            r4.A0Q = A092.getLong(columnIndexOrThrow6);
                            r4.A0R = A092.getLong(columnIndexOrThrow7);
                            r4.A0S = A092.getLong(columnIndexOrThrow8);
                            boolean z = true;
                            if (A092.getInt(columnIndexOrThrow9) != 1) {
                                z = false;
                            }
                            r4.A0i = z;
                            r4.A0X = A092.getLong(columnIndexOrThrow10);
                            r4.A04 = A092.getInt(columnIndexOrThrow11);
                            r4.A00 = A092.getInt(columnIndexOrThrow12);
                            r4.A0B = A092.getInt(columnIndexOrThrow13);
                            r4.A0C = A092.getLong(columnIndexOrThrow14);
                            r4.A0h = A092.getString(columnIndexOrThrow15);
                            r4.A0N = A092.getLong(columnIndexOrThrow16);
                            r4.A0O = A092.getLong(columnIndexOrThrow17);
                            long j = A092.getLong(columnIndexOrThrow18);
                            r4.A0L = j;
                            if (j == 0) {
                                r4.A0L = 1;
                            }
                            r4.A0Y = A092.getLong(columnIndexOrThrow19);
                            r4.A08 = A092.getInt(columnIndexOrThrow20);
                            r4.A09 = A092.getInt(columnIndexOrThrow21);
                            r4.A0A = A092.getInt(columnIndexOrThrow22);
                            r4.A07 = A092.getInt(columnIndexOrThrow23);
                            r4.A05 = A092.getInt(columnIndexOrThrow24);
                            r4.A0M = (long) A092.getInt(columnIndexOrThrow25);
                            r4.A0T = (long) A092.getInt(columnIndexOrThrow26);
                            long j2 = A092.getLong(columnIndexOrThrow27);
                            r4.A0F = j2;
                            if (j2 == 0) {
                                r4.A0F = Long.MIN_VALUE;
                            }
                            long j3 = A092.getLong(columnIndexOrThrow28);
                            r4.A0G = j3;
                            if (j3 == 0) {
                                r4.A0G = Long.MIN_VALUE;
                            }
                            r4.A0g = A092.getString(columnIndexOrThrow31);
                            long j4 = A092.getLong(columnIndexOrThrow29);
                            r4.A0D = j4;
                            if (j4 == 0) {
                                r4.A0D = Long.MIN_VALUE;
                            }
                            long j5 = A092.getLong(columnIndexOrThrow30);
                            r4.A0E = j5;
                            if (j5 == 0) {
                                r4.A0E = Long.MIN_VALUE;
                            }
                            boolean z2 = true;
                            if (A092.getInt(columnIndexOrThrow32) != 1) {
                                z2 = false;
                            }
                            r4.A0p = z2;
                            r4.A03 = A092.getInt(columnIndexOrThrow42);
                            boolean z3 = false;
                            if (A092.getInt(columnIndexOrThrow44) > 0) {
                                z3 = true;
                            }
                            r4.A0j = z3;
                            String string = A092.getString(columnIndexOrThrow45);
                            C52152oy r14 = null;
                            if (string != null) {
                                C52152oy[] values = C52152oy.values();
                                int i = 0;
                                int length = values.length;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    C52152oy r1 = values[i];
                                    if (AnonymousClass00C.A0J(r1.origin, string)) {
                                        r14 = r1;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            if (r4.A0Z == null) {
                                r4.A0Z = r14;
                            }
                            boolean z4 = false;
                            if (A092.getInt(columnIndexOrThrow43) > 0) {
                                z4 = true;
                            }
                            r4.A0o = z4;
                            int i2 = A092.getInt(columnIndexOrThrow36);
                            int i3 = A092.getInt(columnIndexOrThrow33);
                            long j6 = A092.getLong(columnIndexOrThrow34);
                            int i4 = A092.getInt(columnIndexOrThrow35);
                            r4.A0b = new C80103un(i3, j6, i2);
                            r4.A01 = i4;
                            r4.A06 = A092.getInt(columnIndexOrThrow37);
                            boolean z5 = true;
                            if (A092.getInt(columnIndexOrThrow41) != 1) {
                                z5 = false;
                            }
                            r4.A0k = z5;
                            r4.A02 = A092.getInt(columnIndexOrThrow38);
                            r4.A0e = new AnonymousClass3G4(A092.getInt(columnIndexOrThrow39), A092.getLong(columnIndexOrThrow40));
                            hashMap.put(A022, r4);
                        }
                    }
                    synchronized (this) {
                        for (Map.Entry entry : hashMap.entrySet()) {
                            A04((AnonymousClass11F) entry.getKey(), ((C65073Qp) entry.getValue()).A0W);
                        }
                    }
                    A092.close();
                    A042.close();
                    r12.A01();
                    return hashMap;
                } catch (Throwable th) {
                    if (A092 != null) {
                        A092.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                A042.close();
                throw th2;
            }
        } catch (Throwable th3) {
            r12.A01();
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a5, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00aa, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r5.A03.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b2, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.C65073Qp r6) {
        /*
            r5 = this;
            java.lang.String r3 = "/"
            monitor-enter(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            android.content.ContentValues r4 = r6.A04()     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "last_read_message_row_id"
            long r0 = r6.A0P     // Catch:{ all -> 0x00a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "last_read_message_sort_id"
            long r0 = r6.A0Q     // Catch:{ all -> 0x00a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "last_message_row_id"
            long r0 = r6.A0N     // Catch:{ all -> 0x00a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "last_message_sort_id"
            long r0 = r6.A0O     // Catch:{ all -> 0x00a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "last_important_message_row_id"
            long r0 = r6.A0L     // Catch:{ all -> 0x00a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "unseen_important_message_count"
            int r0 = r6.A06     // Catch:{ all -> 0x00a1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "unseen_message_reaction_count"
            int r0 = r6.A07     // Catch:{ all -> 0x00a1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "unseen_comment_message_count"
            int r0 = r6.A05     // Catch:{ all -> 0x00a1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "last_message_reaction_row_id"
            long r0 = r6.A0M     // Catch:{ all -> 0x00a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "last_seen_message_reaction_row_id"
            long r0 = r6.A0T     // Catch:{ all -> 0x00a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            int r2 = r5.A05(r4, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            java.lang.String r0 = "msgstore/setchatseen/"
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            X.11F r0 = r6.A0q     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            r1.append(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            java.lang.String r0 = r6.A09()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            r1.append(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            r1.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            return
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a9, Error | RuntimeException -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x00a9:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r5.A03
            r0.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass163.A0G(X.3Qp):void");
    }

    public void A0H(C65073Qp r5) {
        try {
            int A052 = A05(r5.A04(), r5);
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/setchatunseen/");
            sb.append(r5.A0q);
            sb.append("/");
            sb.append(r5.A09());
            sb.append("/");
            sb.append(A052);
            Log.i(sb.toString());
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A03.A03();
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        }
    }

    public void A0I(AnonymousClass11F r10) {
        AnonymousClass1M0 A052 = this.A04.A05();
        try {
            C1495671s B1k = A052.B1k();
            try {
                long A072 = this.A02.A07(r10);
                A052.A02.A0E("DELETE FROM chat WHERE jid_row_id = ?", "DELETE_CHAT_BY_JID_ROW_ID", new String[]{String.valueOf(A072)});
                this.A00.A0J(r10);
                synchronized (this) {
                    Long l = (Long) this.A05.remove(r10);
                    if (l != null) {
                        this.A06.remove(l);
                    }
                }
                B1k.A00();
                B1k.close();
                A052.close();
            } catch (Throwable th) {
                B1k.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A052.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A0J(AnonymousClass11F r6, long j) {
        C65073Qp A092 = this.A00.A09(r6, false);
        if (A092 != null && A092.A0T <= j && j >= 1) {
            A092.A0T = j;
            if (A092.A0M < j) {
                A092.A0M = j;
            }
            A092.A07 = 0;
            A0F(A092);
        }
    }

    public void Blj(C176568cK r10) {
        Cursor A092;
        if (C20800yB.A01(C21000yV.A02, this.A09, 3911)) {
            AnonymousClass1M0 A042 = this.A04.get();
            try {
                A092 = A042.A02.A09("SELECT hidden, COUNT(1) as chat_count FROM chat GROUP BY hidden", "GET_CHAT_COUNT_BY_HIDDEN_COLUMN", (String[]) null);
                int columnIndexOrThrow = A092.getColumnIndexOrThrow("hidden");
                int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("chat_count");
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (A092.moveToNext()) {
                    if (A092.isNull(columnIndexOrThrow)) {
                        i3 = A092.getInt(columnIndexOrThrow2);
                    } else if (A092.getInt(columnIndexOrThrow) == 0) {
                        i2 = A092.getInt(columnIndexOrThrow2);
                    } else if (A092.getInt(columnIndexOrThrow) == 1) {
                        i = A092.getInt(columnIndexOrThrow2);
                    }
                }
                A092.close();
                A042.close();
                r10.A05 = Long.valueOf((long) i2);
                r10.A06 = Long.valueOf((long) i);
                r10.A07 = Long.valueOf((long) i3);
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

    public AnonymousClass163(C19730wQ r2, C19970wo r3, C220412q r4, AnonymousClass12J r5, C219712j r6, C220612s r7, AnonymousClass12P r8, C20810yC r9, AnonymousClass005 r10) {
        this.A08 = r3;
        this.A09 = r9;
        this.A02 = r6;
        this.A07 = r2;
        this.A00 = r4;
        this.A0A = r10;
        this.A01 = r5;
        this.A04 = r8;
        this.A03 = r7;
    }

    private HashMap A03(List list, boolean z) {
        String str;
        Cursor A092;
        HashMap hashMap = new HashMap(list.size());
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(list.get(i));
        }
        AnonymousClass1M0 A042 = this.A04.get();
        try {
            C224114e r2 = A042.A02;
            int size = list.size();
            String str2 = C56282w2.A00;
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT _id, jid_row_id FROM chat WHERE jid_row_id IN ");
            sb.append(AnonymousClass1M2.A00(size));
            sb.append(" AND ");
            sb.append("hidden = ");
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            sb.append(str);
            A092 = r2.A09(sb.toString(), "GET_ROW_ID_FOR_CHAT", strArr);
            int columnIndexOrThrow = A092.getColumnIndexOrThrow("jid_row_id");
            int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("_id");
            while (A092.moveToNext()) {
                hashMap.put(Long.valueOf(A092.getLong(columnIndexOrThrow)), Long.valueOf(A092.getLong(columnIndexOrThrow2)));
            }
            A092.close();
            A042.close();
            return hashMap;
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

    public boolean A0K(ContentValues contentValues, C65073Qp r8) {
        if (A05(contentValues, r8) != 0) {
            return true;
        }
        contentValues.put("jid_row_id", Long.valueOf(this.A02.A07(r8.A0q)));
        long A072 = A07(contentValues);
        r8.A0W = A072;
        if (A072 == -1) {
            return false;
        }
        return true;
    }
}
