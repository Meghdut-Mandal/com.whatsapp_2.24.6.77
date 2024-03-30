package X;

import android.database.Cursor;

/* renamed from: X.1A1  reason: invalid class name */
public class AnonymousClass1A1 {
    public final AnonymousClass1A0 A00;
    public final AnonymousClass175 A01;
    public final AnonymousClass17R A02;
    public final C238219z A03;

    public AnonymousClass1A1(AnonymousClass1A0 r2, AnonymousClass17R r3, AnonymousClass175 r4, C238219z r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = r4;
        this.A02 = r3;
        this.A03 = r5;
        this.A00 = r2;
    }

    public AnonymousClass3T1 A00(Cursor cursor) {
        AnonymousClass00C.A0D(cursor, 0);
        AnonymousClass175 r1 = this.A01;
        AnonymousClass11F A0B = r1.A01.A0B(cursor);
        if (A0B == null) {
            return null;
        }
        return r1.A02(cursor, A0B, false);
    }

    public AnonymousClass3T1 A01(Cursor cursor, AnonymousClass11F r4) {
        AnonymousClass00C.A0D(cursor, 0);
        AnonymousClass00C.A0D(r4, 1);
        return this.A01.A02(cursor, r4, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 A02(X.AnonymousClass11F r12, long r13) {
        /*
            r11 = this;
            r1 = 0
            X.AnonymousClass00C.A0D(r12, r1)
            X.175 r6 = r11.A01
            java.lang.String r4 = "CachedMessageStore/getMessageBySortIdForChat/sortId"
            long r9 = android.os.SystemClock.uptimeMillis()
            X.12P r0 = r6.A06     // Catch:{ all -> 0x005d }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x005d }
            X.14e r8 = r5.A02     // Catch:{ all -> 0x0056 }
            java.lang.String r7 = X.AnonymousClass2xD.A0D     // Catch:{ all -> 0x0056 }
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0056 }
            r3[r1] = r0     // Catch:{ all -> 0x0056 }
            r2 = 1
            X.163 r0 = r6.A01     // Catch:{ all -> 0x0056 }
            long r0 = r0.A08(r12)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0056 }
            r3[r2] = r0     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "GET_MESSAGE_BY_SORT_ID_SQL_FOR_CHAT"
            android.database.Cursor r2 = r8.A09(r7, r0, r3)     // Catch:{ all -> 0x0056 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004f }
            r3 = 0
            if (r0 == 0) goto L_0x003e
            r0 = 0
            X.3T1 r3 = r6.A02(r2, r12, r0)     // Catch:{ all -> 0x004f }
        L_0x003e:
            r2.close()     // Catch:{ all -> 0x0056 }
            r5.close()     // Catch:{ all -> 0x005d }
            X.12g r2 = r6.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r9
            r2.A01(r4, r0)
            return r3
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0056 }
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r3 = move-exception
            X.12g r2 = r6.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r9
            r2.A01(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A1.A02(X.11F, long):X.3T1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 A03(X.C64933Qa r13) {
        /*
            r12 = this;
            X.175 r5 = r12.A01
            r11 = 0
            if (r13 == 0) goto L_0x0074
            X.11F r3 = r13.A00
            if (r3 == 0) goto L_0x0074
            X.12P r0 = r5.A06
            X.1M0 r4 = r0.get()
            X.3T1 r11 = X.AnonymousClass175.A00(r13, r5)     // Catch:{ all -> 0x006d }
            if (r11 != 0) goto L_0x0069
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x006d }
            X.14e r8 = r4.A02     // Catch:{ all -> 0x006d }
            java.lang.String r7 = X.C56882x2.A02     // Catch:{ all -> 0x006d }
            r0 = 3
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x006d }
            X.163 r0 = r5.A01     // Catch:{ all -> 0x006d }
            long r0 = r0.A08(r3)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006d }
            r2 = 0
            r6[r2] = r0     // Catch:{ all -> 0x006d }
            boolean r0 = r13.A02     // Catch:{ all -> 0x006d }
            r1 = 1
            if (r0 == 0) goto L_0x0033
            r2 = 1
        L_0x0033:
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x006d }
            r6[r1] = r0     // Catch:{ all -> 0x006d }
            r1 = 2
            java.lang.String r0 = r13.A01     // Catch:{ all -> 0x006d }
            X.AnonymousClass00C.A07(r0)     // Catch:{ all -> 0x006d }
            r6[r1] = r0     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "GET_MESSAGE_BY_KEY_SQL"
            android.database.Cursor r2 = r8.A09(r7, r0, r6)     // Catch:{ all -> 0x006d }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0052
            r0 = 0
            X.3T1 r11 = r5.A02(r2, r3, r0)     // Catch:{ all -> 0x0062 }
        L_0x0052:
            r2.close()     // Catch:{ all -> 0x006d }
            X.12g r3 = r5.A03     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "CachedMessageStore/getMessage/key"
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x006d }
            long r0 = r0 - r9
            r3.A01(r2, r0)     // Catch:{ all -> 0x006d }
            goto L_0x0069
        L_0x0062:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x0069:
            r4.close()
            return r11
        L_0x006d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x0074:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A1.A03(X.3Qa):X.3T1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0100, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0103, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass3T1 r12) {
        /*
            r11 = this;
            X.17R r4 = r11.A02
            long r9 = android.os.SystemClock.uptimeMillis()
            boolean r0 = r12 instanceof X.AnonymousClass0p5
            if (r0 == 0) goto L_0x0021
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FMessageDatabaseInsertMethods/skip storing transient message: "
            r1.append(r0)
            X.3Qa r0 = r12.A1J
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0021:
            X.17P r6 = r4.A04
            int r2 = r12.A1I
            X.00T r1 = r6.A0B
            java.lang.Object r0 = r1.getValue()
            X.9XG r0 = (X.AnonymousClass9XG) r0
            boolean r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x0104
            java.lang.Object r0 = r1.getValue()
            X.9XG r0 = (X.AnonymousClass9XG) r0
            X.0ow r0 = r0.A00(r2)
            boolean r0 = r0 instanceof X.AnonymousClass4S2
            if (r0 == 0) goto L_0x0104
            X.12P r0 = r4.A02
            X.1M0 r3 = r0.A05()
            X.71s r5 = r3.B1k()     // Catch:{ all -> 0x00fd }
            X.4HK r8 = new X.4HK     // Catch:{ all -> 0x00f6 }
            r8.<init>(r12, r4)     // Catch:{ all -> 0x00f6 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x00f6 }
            X.9XG r0 = (X.AnonymousClass9XG) r0     // Catch:{ all -> 0x00f6 }
            boolean r0 = r0.A02(r2)     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x00f6 }
            X.9XG r0 = (X.AnonymousClass9XG) r0     // Catch:{ all -> 0x00f6 }
            X.0ow r0 = r0.A00(r2)     // Catch:{ all -> 0x00f6 }
            boolean r0 = r0 instanceof X.AnonymousClass4S2     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x00f6 }
            X.9XG r0 = (X.AnonymousClass9XG) r0     // Catch:{ all -> 0x00f6 }
            X.0ow r7 = r0.A00(r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.subsystem.database.insertion.FMessageDatabaseInserter"
            X.AnonymousClass00C.A0E(r7, r0)     // Catch:{ all -> 0x00f6 }
            X.4S2 r7 = (X.AnonymousClass4S2) r7     // Catch:{ all -> 0x00f6 }
            java.lang.Class r1 = r7.getClass()     // Catch:{ all -> 0x00f6 }
            X.08f r0 = new X.08f     // Catch:{ all -> 0x00f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f6 }
            r2 = 0
            X.005 r0 = r6.A07     // Catch:{ all -> 0x00f6 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00f6 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x00f6 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00f6 }
        L_0x0094:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f6 }
            X.4S0 r0 = (X.AnonymousClass4S0) r0     // Catch:{ all -> 0x00f6 }
            r0.BmI(r12, r2)     // Catch:{ all -> 0x00f6 }
            goto L_0x0094
        L_0x00a4:
            r8.invoke()     // Catch:{ all -> 0x00f6 }
            r7.BKi(r12)     // Catch:{ all -> 0x00f6 }
            X.005 r0 = r6.A06     // Catch:{ all -> 0x00f6 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00f6 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x00f6 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00f6 }
        L_0x00b9:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f6 }
            X.4S0 r0 = (X.AnonymousClass4S0) r0     // Catch:{ all -> 0x00f6 }
            r0.BmI(r12, r2)     // Catch:{ all -> 0x00f6 }
            goto L_0x00b9
        L_0x00c9:
            java.lang.String r2 = "message cannot be inserted into the database"
            java.lang.String r1 = "update"
            java.lang.String r0 = "fmessage-database-inserting-not-supported"
            X.AnonymousClass17P.A00(r12, r6, r2, r1, r0)     // Catch:{ all -> 0x00f6 }
        L_0x00d2:
            r5.A00()     // Catch:{ all -> 0x00f6 }
            r5.close()     // Catch:{ all -> 0x00fd }
            r3.close()
            X.0xc r3 = r4.A03
            X.0wk r2 = r3.A01
            r1 = 47
            X.1j7 r0 = new X.1j7
            r0.<init>(r3, r12, r1)
            r2.execute(r0)
            X.12g r3 = r4.A00
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r9
            java.lang.String r0 = "CoreMessageStore/insertMessage"
            r3.A01(r0, r1)
            return
        L_0x00f6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00fd }
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x0104:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported message type "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A1.A04(X.3T1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00de, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e2, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.AnonymousClass3T1 r12, int r13) {
        /*
            r11 = this;
            X.19z r5 = r11.A03
            long r9 = android.os.SystemClock.uptimeMillis()
            X.17P r6 = r5.A04
            int r2 = r12.A1I
            X.00T r1 = r6.A0B
            java.lang.Object r0 = r1.getValue()
            X.9XG r0 = (X.AnonymousClass9XG) r0
            boolean r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = r1.getValue()
            X.9XG r0 = (X.AnonymousClass9XG) r0
            X.0ow r0 = r0.A00(r2)
            boolean r0 = r0 instanceof X.AnonymousClass4S4
            if (r0 == 0) goto L_0x00e6
            X.12P r0 = r5.A03
            X.1M0 r3 = r0.A05()
            X.71s r4 = r3.B1k()     // Catch:{ all -> 0x00df }
            X.4Ho r8 = new X.4Ho     // Catch:{ all -> 0x00d8 }
            r8.<init>(r12, r5, r13)     // Catch:{ all -> 0x00d8 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x00d8 }
            X.9XG r0 = (X.AnonymousClass9XG) r0     // Catch:{ all -> 0x00d8 }
            boolean r0 = r0.A02(r2)     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x00d8 }
            X.9XG r0 = (X.AnonymousClass9XG) r0     // Catch:{ all -> 0x00d8 }
            X.0ow r0 = r0.A00(r2)     // Catch:{ all -> 0x00d8 }
            boolean r0 = r0 instanceof X.AnonymousClass4S4     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x00d8 }
            X.9XG r0 = (X.AnonymousClass9XG) r0     // Catch:{ all -> 0x00d8 }
            X.0ow r7 = r0.A00(r2)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.subsystem.database.update.FMessageDatabaseUpdater"
            X.AnonymousClass00C.A0E(r7, r0)     // Catch:{ all -> 0x00d8 }
            X.4S4 r7 = (X.AnonymousClass4S4) r7     // Catch:{ all -> 0x00d8 }
            java.lang.Class r1 = r7.getClass()     // Catch:{ all -> 0x00d8 }
            X.08f r0 = new X.08f     // Catch:{ all -> 0x00d8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d8 }
            r2 = 0
            X.005 r0 = r6.A0A     // Catch:{ all -> 0x00d8 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00d8 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00d8 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x00d8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00d8 }
        L_0x0079:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00d8 }
            X.4S6 r0 = (X.AnonymousClass4S6) r0     // Catch:{ all -> 0x00d8 }
            r0.BmK(r12, r2, r13)     // Catch:{ all -> 0x00d8 }
            goto L_0x0079
        L_0x0089:
            r8.invoke()     // Catch:{ all -> 0x00d8 }
            r7.BwV(r12)     // Catch:{ all -> 0x00d8 }
            X.005 r0 = r6.A09     // Catch:{ all -> 0x00d8 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00d8 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00d8 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x00d8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00d8 }
        L_0x009e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00d8 }
            X.4S5 r0 = (X.AnonymousClass4S5) r0     // Catch:{ all -> 0x00d8 }
            r0.BmK(r12, r2, r13)     // Catch:{ all -> 0x00d8 }
            goto L_0x009e
        L_0x00ae:
            java.lang.String r2 = "message cannot be updated into the database"
            java.lang.String r1 = "insert"
            java.lang.String r0 = "fmessage-database-updating-not-supported"
            X.AnonymousClass17P.A00(r12, r6, r2, r1, r0)     // Catch:{ all -> 0x00d8 }
        L_0x00b7:
            r4.A00()     // Catch:{ all -> 0x00d8 }
            r1 = 11
            X.1jE r0 = new X.1jE     // Catch:{ all -> 0x00d8 }
            r0.<init>(r5, r12, r1)     // Catch:{ all -> 0x00d8 }
            r3.B5o(r0)     // Catch:{ all -> 0x00d8 }
            r4.close()     // Catch:{ all -> 0x00df }
            r3.close()
            X.12g r3 = r5.A00
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r9
            java.lang.String r0 = "CoreMessageStore/updateMessageOnCurrentThread"
            r3.A01(r0, r1)
            r0 = 1
            return r0
        L_0x00d8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00df:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x00e6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported message type "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A1.A05(X.3T1, int):boolean");
    }
}
