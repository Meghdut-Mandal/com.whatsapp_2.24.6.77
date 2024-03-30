package X;

import java.util.Map;

/* renamed from: X.175  reason: invalid class name */
public final class AnonymousClass175 {
    public final C19700wN A00;
    public final AnonymousClass163 A01;
    public final C220412q A02;
    public final AnonymousClass12g A03;
    public final AnonymousClass178 A04;
    public final AnonymousClass177 A05;
    public final AnonymousClass12P A06;
    public final C19970wo A07;
    public final AnonymousClass17P A08;
    public final Map A09;

    public AnonymousClass175(C19700wN r2, C19970wo r3, AnonymousClass163 r4, C220412q r5, AnonymousClass12g r6, AnonymousClass178 r7, AnonymousClass176 r8, AnonymousClass12P r9, AnonymousClass17P r10) {
        AnonymousClass00C.A0D(r8, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r2, 4);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r6, 7);
        AnonymousClass00C.A0D(r9, 8);
        AnonymousClass00C.A0D(r10, 9);
        this.A07 = r3;
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A06 = r9;
        this.A08 = r10;
        AnonymousClass177 r0 = r8.A01;
        AnonymousClass00C.A08(r0);
        this.A05 = r0;
        Map map = r8.A02;
        AnonymousClass00C.A08(map);
        this.A09 = map;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.AnonymousClass3T1 A02(android.database.Cursor r12, X.AnonymousClass11F r13, boolean r14) {
        /*
            r11 = this;
            r1 = 0
            r6 = 1
            int r0 = r12.getColumnCount()
            if (r0 != r6) goto L_0x0011
            long r0 = r12.getLong(r1)
            X.3T1 r0 = r11.A01(r0)
        L_0x0010:
            return r0
        L_0x0011:
            java.lang.String r0 = "key_id"
            int r0 = r12.getColumnIndexOrThrow(r0)
            java.lang.String r2 = r12.getString(r0)
            java.lang.String r0 = "from_me"
            int r0 = r12.getColumnIndexOrThrow(r0)
            int r0 = r12.getInt(r0)
            r1 = 1
            if (r0 == r6) goto L_0x0029
            r1 = 0
        L_0x0029:
            if (r2 == 0) goto L_0x0050
            java.lang.String r0 = "-1"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0050
            X.3Qa r5 = new X.3Qa
            r5.<init>(r13, r2, r1)
        L_0x0038:
            r8 = 0
            if (r5 != 0) goto L_0x0066
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FMessageDatabaseRetrieverImpl/getMessage/can't read key; jid="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r8
        L_0x0050:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MainMessageStore/getMessage/id is null or no messages for jid="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r5 = 0
            goto L_0x0038
        L_0x0066:
            X.3T1 r0 = A00(r5, r11)
            if (r0 != 0) goto L_0x0010
            X.178 r7 = r11.A04
            java.lang.String r0 = "table_version"
            int r1 = r12.getColumnIndex(r0)
            r0 = -1
            if (r1 != r0) goto L_0x00bb
            X.0wN r1 = r7.A00
            java.lang.String r0 = "MainMessageStore/readMessage/read directly from old table instead of view."
            r1.A0E(r0, r8, r6)
            X.12P r0 = r7.A03
            X.1M0 r3 = r0.get()
            X.14e r4 = r3.A02     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = X.C56882x2.A03     // Catch:{ all -> 0x00b1 }
            java.lang.String[] r1 = X.AnonymousClass178.A04(r7, r5)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "GET_MESSAGE_MAIN_BY_KEY_SQL"
            android.database.Cursor r2 = r4.A09(r2, r0, r1)     // Catch:{ all -> 0x00b1 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x00a0
            X.3T1 r4 = X.AnonymousClass178.A00(r2, r7, r5)     // Catch:{ all -> 0x00a5 }
            r2.close()     // Catch:{ all -> 0x00b1 }
            goto L_0x00c0
        L_0x00a0:
            r2.close()     // Catch:{ all -> 0x00b1 }
            goto L_0x01af
        L_0x00a5:
            r1 = move-exception
            if (r2 == 0) goto L_0x00b0
            r2.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00b0
        L_0x00ac:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b1 }
        L_0x00b0:
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00b6 }
            throw r1
        L_0x00b6:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00bb:
            X.3T1 r4 = X.AnonymousClass178.A00(r12, r7, r5)
            goto L_0x00c3
        L_0x00c0:
            r3.close()
        L_0x00c3:
            if (r4 == 0) goto L_0x01b2
            X.3Qa r0 = r4.A1J
            X.11F r7 = r0.A00
            X.C18740tg.A06(r7)
            int r6 = r4.A1I
            r0 = 8
            if (r6 == r0) goto L_0x00fc
            boolean r0 = r4.A15
            if (r0 != 0) goto L_0x00e7
            long r2 = r4.A1O
            X.12q r1 = r11.A02
            r0 = 0
            X.3Qp r0 = r1.A09(r7, r0)
            if (r0 != 0) goto L_0x019c
            r0 = -9223372036854775808
        L_0x00e3:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x012c
        L_0x00e7:
            boolean r0 = r4.A15
            if (r0 == 0) goto L_0x00fc
            long r2 = r4.A1O
            X.12q r1 = r11.A02
            r0 = 0
            X.3Qp r0 = r1.A09(r7, r0)
            if (r0 != 0) goto L_0x0198
            r0 = -9223372036854775808
        L_0x00f8:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x012c
        L_0x00fc:
            boolean r0 = r4.A15
            if (r0 != 0) goto L_0x0111
            long r2 = r4.A1O
            X.12q r9 = r11.A02
            r0 = 0
            X.3Qp r0 = r9.A09(r7, r0)
            if (r0 != 0) goto L_0x0194
            r0 = -9223372036854775808
        L_0x010d:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0126
        L_0x0111:
            boolean r0 = r4.A15
            if (r0 == 0) goto L_0x012e
            long r2 = r4.A1O
            X.12q r9 = r11.A02
            r0 = 0
            X.3Qp r0 = r9.A09(r7, r0)
            if (r0 != 0) goto L_0x0191
            r0 = -9223372036854775808
        L_0x0122:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x012e
        L_0x0126:
            boolean r0 = r9.A0T(r7, r6)
            if (r0 == 0) goto L_0x012e
        L_0x012c:
            if (r14 == 0) goto L_0x020e
        L_0x012e:
            X.17P r3 = r11.A08
            X.00T r1 = r3.A0B
            java.lang.Object r0 = r1.getValue()
            X.9XG r0 = (X.AnonymousClass9XG) r0
            boolean r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x0204
            java.lang.Object r0 = r1.getValue()
            X.9XG r0 = (X.AnonymousClass9XG) r0
            X.0ow r0 = r0.A00(r6)
            boolean r0 = r0 instanceof X.AnonymousClass4S3
            if (r0 == 0) goto L_0x0204
            long r7 = android.os.SystemClock.uptimeMillis()
            r0 = 1
            r4.A0o(r0)
            java.lang.Object r0 = r1.getValue()
            X.9XG r0 = (X.AnonymousClass9XG) r0
            X.0ow r1 = r0.A00(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.subsystem.database.retrieval.FMessageDatabaseReader"
            X.AnonymousClass00C.A0E(r1, r0)
            X.4S3 r1 = (X.AnonymousClass4S3) r1
            r1.B7J(r4)
            java.lang.Class r1 = r1.getClass()
            X.08f r0 = new X.08f
            r0.<init>(r1)
            r2 = 0
            X.005 r0 = r3.A08
            java.lang.Object r0 = r0.get()
            X.AnonymousClass00C.A08(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0181:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r0 = r1.next()
            X.4S0 r0 = (X.AnonymousClass4S0) r0
            r0.BmI(r4, r2)
            goto L_0x0181
        L_0x0191:
            long r0 = r0.A0E
            goto L_0x0122
        L_0x0194:
            long r0 = r0.A0D
            goto L_0x010d
        L_0x0198:
            long r0 = r0.A0G
            goto L_0x00f8
        L_0x019c:
            long r0 = r0.A0F
            goto L_0x00e3
        L_0x01a0:
            X.12g r6 = r3.A01
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r7
            X.0u5 r3 = r3.A03
            java.lang.String r0 = "CachedMessageStore/fillMessageFromExtraTables"
            r6.A00(r3, r0, r1)
            goto L_0x020d
        L_0x01af:
            r3.close()
        L_0x01b2:
            java.lang.String r0 = "message_type"
            int r7 = r12.getColumnIndex(r0)
            if (r7 >= 0) goto L_0x01bb
            r7 = -1
        L_0x01bb:
            java.lang.String r0 = "timestamp"
            int r0 = r12.getColumnIndex(r0)
            if (r0 < 0) goto L_0x0202
            long r0 = r12.getLong(r0)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r2, r4)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r4 = r3.format(r2)
        L_0x01d9:
            java.lang.String r3 = "FMessageDatabaseRetrieverImpl/getMessage/message is null"
            X.0wN r2 = r11.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "key="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", date="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", type="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            r2.A0E(r3, r0, r6)
            goto L_0x020e
        L_0x0202:
            r4 = r8
            goto L_0x01d9
        L_0x0204:
            java.lang.String r2 = "message cannot be read from the database"
            java.lang.String r1 = "fill"
            java.lang.String r0 = "fmessage-database-reading-not-supported"
            X.AnonymousClass17P.A00(r4, r3, r2, r1, r0)
        L_0x020d:
            r8 = r4
        L_0x020e:
            X.177 r2 = r11.A05
            monitor-enter(r2)
            X.3T1 r1 = A00(r5, r11)     // Catch:{ all -> 0x0225 }
            r0 = 0
            if (r1 == 0) goto L_0x021a
            r8 = r1
            goto L_0x0223
        L_0x021a:
            if (r8 == 0) goto L_0x0222
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0225 }
            r2.A01(r8, r0)     // Catch:{ all -> 0x0225 }
            goto L_0x0223
        L_0x0222:
            r8 = r0
        L_0x0223:
            monitor-exit(r2)
            return r8
        L_0x0225:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass175.A02(android.database.Cursor, X.11F, boolean):X.3T1");
    }

    public static final AnonymousClass3T1 A00(C64933Qa r3, AnonymousClass175 r4) {
        C65073Qp A092;
        AnonymousClass3T1 A002 = r4.A05.A00(r3);
        if (A002 == null && ((A092 = r4.A02.A09(r3.A00, false)) == null || (A002 = A092.A0d) == null || !r3.equals(A002.A1J))) {
            return (AnonymousClass3T1) r4.A09.get(r3);
        }
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 A01(long r10) {
        /*
            r9 = this;
            java.lang.String r4 = "CachedMessageStore/getMessage/rowId"
            long r7 = android.os.SystemClock.uptimeMillis()
            X.12P r0 = r9.A06     // Catch:{ all -> 0x005d }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x005d }
            X.14e r6 = r5.A02     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = X.AnonymousClass2xD.A0B     // Catch:{ all -> 0x0056 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0056 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0056 }
            r2[r1] = r0     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "GET_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r6 = r6.A09(r3, r0, r2)     // Catch:{ all -> 0x0056 }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x004f }
            r3 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "chat_row_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004f }
            long r1 = r6.getLong(r0)     // Catch:{ all -> 0x004f }
            X.163 r0 = r9.A01     // Catch:{ all -> 0x004f }
            X.11F r1 = r0.A0A(r1)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x003e
            r0 = 0
            X.3T1 r3 = r9.A02(r6, r1, r0)     // Catch:{ all -> 0x004f }
        L_0x003e:
            r6.close()     // Catch:{ all -> 0x0056 }
            r5.close()     // Catch:{ all -> 0x005d }
            X.12g r2 = r9.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r7
            r2.A01(r4, r0)
            return r3
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x0056 }
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
            X.12g r2 = r9.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r7
            r2.A01(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass175.A01(long):X.3T1");
    }
}
