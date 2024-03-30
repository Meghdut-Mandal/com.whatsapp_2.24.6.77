package X;

/* renamed from: X.1j0  reason: invalid class name and case insensitive filesystem */
public class C35631j0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C35631j0(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0bf1  */
    public final void run() {
        /*
            r33 = this;
            r2 = r33
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0e4a;
                case 1: goto L_0x0efd;
                case 2: goto L_0x0e34;
                case 3: goto L_0x0466;
                case 4: goto L_0x0e14;
                case 5: goto L_0x0df9;
                case 6: goto L_0x043e;
                case 7: goto L_0x0d9f;
                case 8: goto L_0x0d42;
                case 9: goto L_0x0a55;
                case 10: goto L_0x0a36;
                case 11: goto L_0x03e3;
                case 12: goto L_0x0a07;
                case 13: goto L_0x09d2;
                case 14: goto L_0x096a;
                case 15: goto L_0x03b9;
                case 16: goto L_0x0901;
                case 17: goto L_0x0ec1;
                case 18: goto L_0x08db;
                case 19: goto L_0x08ca;
                case 20: goto L_0x0393;
                case 21: goto L_0x036d;
                case 22: goto L_0x032b;
                case 23: goto L_0x0840;
                case 24: goto L_0x02e0;
                case 25: goto L_0x02e0;
                case 26: goto L_0x082e;
                case 27: goto L_0x0790;
                case 28: goto L_0x0780;
                case 29: goto L_0x0760;
                case 30: goto L_0x02c2;
                case 31: goto L_0x074e;
                case 32: goto L_0x0723;
                case 33: goto L_0x0713;
                case 34: goto L_0x0704;
                case 35: goto L_0x01b5;
                case 36: goto L_0x06ed;
                case 37: goto L_0x019a;
                case 38: goto L_0x0176;
                case 39: goto L_0x0125;
                case 40: goto L_0x0678;
                case 41: goto L_0x00f8;
                case 42: goto L_0x007d;
                case 43: goto L_0x0656;
                case 44: goto L_0x04f5;
                case 45: goto L_0x0492;
                case 46: goto L_0x004d;
                case 47: goto L_0x0007;
                case 48: goto L_0x0007;
                case 49: goto L_0x0017;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r2.A00
            X.1Yo r3 = (X.C29931Yo) r3
            java.lang.Object r1 = r2.A01
            X.6c9 r1 = (X.C135106c9) r1
            java.lang.Object r0 = r2.A02
            X.7hG r0 = (X.AnonymousClass7hG) r0
            X.C29931Yo.A00(r1, r0, r3)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r4 = r2.A00
            X.1Yo r4 = (X.C29931Yo) r4
            java.lang.Object r3 = r2.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r2.A02
            X.7nx r1 = (X.C162057nx) r1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0e81
            r1.BbA(r3)
            java.util.Iterator r2 = r3.iterator()
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0016
            r2.next()
            X.1Yp r0 = r4.A0B
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0043:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0030
            r1.next()
            goto L_0x0043
        L_0x004d:
            java.lang.Object r4 = r2.A00
            X.1Le r4 = (X.C26701Le) r4
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A02
            X.1LY r2 = (X.AnonymousClass1LY) r2
            r0 = 0
            boolean r1 = r4.BJz(r0)
            r4.BrK(r3)
            boolean r0 = r4.BJz(r0)
            if (r1 != 0) goto L_0x0016
            if (r0 == 0) goto L_0x0016
            java.lang.String r3 = r4.BEa()
            r0 = 1
            X.196 r2 = r2.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.3I4 r1 = new X.3I4
            r1.<init>(r0, r3)
            X.1Ld r0 = X.C26691Ld.Nux
            r2.A0J(r1, r0)
            return
        L_0x007d:
            java.lang.Object r1 = r2.A00
            X.1bC r1 = (X.C31051bC) r1
            java.lang.Object r8 = r2.A01
            X.1Uw r8 = (X.C28981Uw) r8
            java.lang.Object r0 = r2.A02
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.1SL r7 = r1.A04
            long r11 = r0.A1O
            r5 = 100
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0016
            X.1SM r1 = r7.A07
            r3 = 0
            X.12P r0 = r1.A03
            X.1M0 r2 = r0.get()
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0e8c }
            X.163 r0 = r1.A00     // Catch:{ all -> 0x0e8c }
            long r0 = r0.A08(r8)     // Catch:{ all -> 0x0e8c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0e8c }
            r4[r3] = r0     // Catch:{ all -> 0x0e8c }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0e8c }
            r4[r1] = r0     // Catch:{ all -> 0x0e8c }
            X.14e r3 = r2.A02     // Catch:{ all -> 0x0e8c }
            java.lang.String r1 = "SELECT sort_id  FROM message  WHERE chat_row_id = ? AND sort_id < ?  ORDER BY sort_id DESC LIMIT 1"
            java.lang.String r0 = "GET_MESSAGE_SERVER_ID_BEFORE"
            android.database.Cursor r3 = r3.A09(r1, r0, r4)     // Catch:{ all -> 0x0e8c }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0e85 }
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = "sort_id"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0e85 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0e85 }
            if (r0 != 0) goto L_0x00e0
            long r9 = r3.getLong(r1)     // Catch:{ all -> 0x0e85 }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0e85 }
            if (r0 == 0) goto L_0x00e0
            r3.close()     // Catch:{ all -> 0x0e8c }
            goto L_0x00e7
        L_0x00e0:
            r3.close()     // Catch:{ all -> 0x0e8c }
            r2.close()
            goto L_0x00ee
        L_0x00e7:
            r2.close()
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f0
        L_0x00ee:
            r9 = 100
        L_0x00f0:
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0016
            r7.A04(r8, r9, r11)
            return
        L_0x00f8:
            java.lang.Object r6 = r2.A00
            X.1SL r6 = (X.AnonymousClass1SL) r6
            java.lang.Object r7 = r2.A01
            X.1Uw r7 = (X.C28981Uw) r7
            java.lang.Object r5 = r2.A02
            X.2La r5 = (X.C44072La) r5
            X.17U r2 = r6.A04
            r0 = -1
            int r0 = r2.A01(r7, r0)
            long r3 = (long) r0
            r1 = 50
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0119
            X.2pL r1 = r5.A09
            X.2pL r0 = X.C52382pL.GUEST
            if (r1 != r0) goto L_0x0016
        L_0x0119:
            X.1TZ r6 = r6.A09
            r8 = 0
            r13 = 0
            r11 = 50
            r10 = r8
            r9 = r8
            r6.A01(r7, r8, r9, r10, r11, r13)
            return
        L_0x0125:
            java.lang.Object r3 = r2.A00
            com.whatsapp.newsletter.NewsletterLinkLauncher r3 = (com.whatsapp.newsletter.NewsletterLinkLauncher) r3
            java.lang.Object r5 = r2.A01
            X.351 r5 = (X.AnonymousClass351) r5
            java.lang.Object r6 = r2.A02
            X.00S r6 = (X.AnonymousClass00S) r6
            X.005 r0 = r3.A07     // Catch:{ all -> 0x013f }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x013f }
            X.19A r2 = (X.AnonymousClass19A) r2     // Catch:{ all -> 0x013f }
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.A0B(r0)     // Catch:{ all -> 0x013f }
            goto L_0x0145
        L_0x013f:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
        L_0x0145:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0016
            X.005 r0 = r3.A07
            java.lang.Object r0 = r0.get()
            X.19A r0 = (X.AnonymousClass19A) r0
            boolean r0 = r0.A0I()
            if (r0 == 0) goto L_0x015b
            r6.invoke()
            return
        L_0x015b:
            java.lang.ref.WeakReference r0 = r5.A01
            java.lang.Object r4 = r0.get()
            if (r4 == 0) goto L_0x0016
            X.005 r0 = r3.A06
            java.lang.Object r0 = r0.get()
            X.17Y r0 = (X.AnonymousClass17Y) r0
            r7 = 23
            X.1ia r2 = new X.1ia
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0H(r2)
            return
        L_0x0176:
            java.lang.Object r0 = r2.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Object r3 = r2.A01
            X.2oe r3 = (X.C51952oe) r3
            java.lang.Object r2 = r2.A02
            X.1Uw r2 = (X.C28981Uw) r2
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x018a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.4TL r0 = (X.AnonymousClass4TL) r0
            r0.BQi(r2, r3)
            goto L_0x018a
        L_0x019a:
            java.lang.Object r0 = r2.A00
            X.0xJ r0 = (X.C20280xJ) r0
            java.lang.Object r3 = r2.A01
            X.6Do r3 = (X.C128776Do) r3
            java.lang.Object r4 = r2.A02
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            X.19I r2 = r0.A0M
            X.3T1 r0 = r3.A05
            X.3Qa r1 = r0.A1J
            com.whatsapp.jid.DeviceJid r0 = r3.A03
            r2.A02(r0, r1)
            if (r4 == 0) goto L_0x0016
            goto L_0x0f43
        L_0x01b5:
            java.lang.Object r1 = r2.A00
            X.1DL r1 = (X.AnonymousClass1DL) r1
            java.lang.Object r0 = r2.A01
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r4 = r2.A02
            java.util.AbstractMap r4 = (java.util.AbstractMap) r4
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x01c9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01f1
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            X.1DO r5 = r1.A03
            java.lang.Object r6 = r2.getKey()
            X.11F r6 = (X.AnonymousClass11F) r6
            java.lang.Object r0 = r2.getValue()
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            long r7 = r0.A1N
            java.lang.Object r0 = r2.getValue()
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            long r9 = r0.A1O
            r5.A00(r6, r7, r9)
            goto L_0x01c9
        L_0x01f1:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r11 = r0.iterator()
        L_0x01f9:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            X.1DO r3 = r1.A03
            java.lang.Object r5 = r0.getKey()
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = r0.longValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/"
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.16E r8 = r3.A05
            X.3Sz r4 = r8.A08(r5)
            if (r4 != 0) goto L_0x0250
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/no status for "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x01f9
        L_0x0250:
            monitor-enter(r4)
            long r9 = r4.A06     // Catch:{ all -> 0x0e98 }
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0259
            r4.A06 = r6     // Catch:{ all -> 0x0e98 }
        L_0x0259:
            X.3Sz r2 = r4.A06()     // Catch:{ all -> 0x0e98 }
            monitor-exit(r4)
            monitor-enter(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02b7, Error | RuntimeException -> 0x0e93 }
            long r6 = r2.A06     // Catch:{ all -> 0x02b4 }
            monitor-exit(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02b7, Error | RuntimeException -> 0x0e93 }
            X.12P r0 = r8.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x02b7, Error | RuntimeException -> 0x0e93 }
            X.1M0 r4 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02b7, Error | RuntimeException -> 0x0e93 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x02aa }
            r13.<init>()     // Catch:{ all -> 0x02aa }
            java.lang.String r2 = "last_read_receipt_sent_message_table_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02aa }
            r13.put(r2, r0)     // Catch:{ all -> 0x02aa }
            X.14e r12 = r4.A02     // Catch:{ all -> 0x02aa }
            java.lang.String r14 = "status"
            java.lang.String r15 = "jid_row_id=?"
            java.lang.String[] r17 = X.AnonymousClass16E.A04(r8, r5)     // Catch:{ all -> 0x02aa }
            java.lang.String r0 = "updateLastReadReceiptSentMessageRowId/UPDATE"
            java.lang.String r16 = X.AnonymousClass16E.A00(r0)     // Catch:{ all -> 0x02aa }
            int r0 = r12.A01(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x02aa }
            if (r0 != 0) goto L_0x02a5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02aa }
            r2.<init>()     // Catch:{ all -> 0x02aa }
            java.lang.String r0 = "StatusStore/updateLastReadReceiptSentMessageTableId/no status saved for "
            r2.append(r0)     // Catch:{ all -> 0x02aa }
            r2.append(r5)     // Catch:{ all -> 0x02aa }
            java.lang.String r0 = ";"
            r2.append(r0)     // Catch:{ all -> 0x02aa }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x02aa }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02aa }
        L_0x02a5:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02b7, Error | RuntimeException -> 0x0e93 }
            goto L_0x01f9
        L_0x02aa:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x02af }
            goto L_0x02b3
        L_0x02af:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02b7, Error | RuntimeException -> 0x0e93 }
        L_0x02b3:
            throw r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x02b7, Error | RuntimeException -> 0x0e93 }
        L_0x02b4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02b7, Error | RuntimeException -> 0x0e93 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x02b7, Error | RuntimeException -> 0x0e93 }
        L_0x02b7:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r3.A03
            r0.A03()
            goto L_0x01f9
        L_0x02c2:
            java.lang.Object r0 = r2.A00
            X.1Ax r0 = (X.AnonymousClass1Ax) r0
            java.lang.Object r7 = r2.A01
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r6 = r2.A02
            java.io.File r6 = (java.io.File) r6
            java.lang.String r5 = "ReferenceCountedFileManager/deleteFileFromMediaProvider"
            if (r7 == 0) goto L_0x0016
            X.0yb r0 = r0.A01
            X.0ya r4 = r0.A0O()
            if (r4 != 0) goto L_0x0e9b
            java.lang.String r0 = "ReferenceCountedFileManager/deleteFileFromMediaProvider content resolver is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x02e0:
            java.lang.Object r4 = r2.A00
            X.0xQ r4 = (X.C20350xQ) r4
            java.lang.Object r3 = r2.A01
            X.144 r3 = (X.AnonymousClass144) r3
            java.lang.Object r1 = r2.A02
            X.6X6 r1 = (X.AnonymousClass6X6) r1
            X.17X r0 = r4.A0U
            r0.A06(r1)
            boolean r1 = r0.A0B(r3)
            X.0wQ r0 = r4.A05
            if (r1 == 0) goto L_0x0325
            X.8du r0 = r0.A07()
        L_0x02fd:
            X.C18740tg.A06(r0)
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.6EZ r1 = X.C133256Xm.A02(r0)
            java.lang.String r0 = r3.getRawString()
            X.6EU r2 = new X.6EU
            r2.<init>(r1, r0)
            X.189 r0 = r4.A0K
            r1 = 0
            X.18k r0 = r0.A0A
            boolean r0 = r0.A07(r2, r1)
            if (r0 == 0) goto L_0x0016
            X.1DT r1 = r4.A06
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0K(r3, r0)
            return
        L_0x0325:
            r0.A0G()
            X.13x r0 = r0.A02
            goto L_0x02fd
        L_0x032b:
            java.lang.Object r5 = r2.A00
            X.0xQ r5 = (X.C20350xQ) r5
            java.lang.Object r7 = r2.A01
            X.147 r7 = (X.AnonymousClass147) r7
            java.lang.Object r4 = r2.A02
            java.util.Map r4 = (java.util.Map) r4
            X.1PB r6 = r5.A0Q
            X.0wo r0 = r5.A0I
            long r2 = X.C19970wo.A00(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.util.ArrayList r0 = r6.A00(r7, r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x034a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r2 = r3.next()
            X.2bQ r2 = (X.AnonymousClass2bQ) r2
            X.3Qa r0 = r2.A1J
            X.11F r0 = r0.A00
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x034a
            r0 = 1
            r2.A07 = r0
            r0 = 0
            r2.A01 = r0
            X.0xM r0 = r5.A0O
            r0.A0k(r2)
            goto L_0x034a
        L_0x036d:
            java.lang.Object r0 = r2.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r3 = r2.A01
            X.144 r3 = (X.AnonymousClass144) r3
            java.lang.Object r2 = r2.A02
            X.6X6 r2 = (X.AnonymousClass6X6) r2
            X.17z r0 = r0.A0j
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0383:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.1Cs r0 = (X.C24511Cs) r0
            r0.A01(r2, r3)
            goto L_0x0383
        L_0x0393:
            java.lang.Object r0 = r2.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r3 = r2.A01
            X.144 r3 = (X.AnonymousClass144) r3
            java.lang.Object r2 = r2.A02
            X.6X6 r2 = (X.AnonymousClass6X6) r2
            X.17z r0 = r0.A0j
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x03a9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.1Cs r0 = (X.C24511Cs) r0
            r0.A01(r2, r3)
            goto L_0x03a9
        L_0x03b9:
            java.lang.Object r4 = r2.A00
            X.17k r4 = (X.C231617k) r4
            java.lang.Object r1 = r2.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r3 = r2.A02
            java.util.Collection r3 = (java.util.Collection) r3
            X.12O r0 = r4.A03
            java.util.Set r0 = r0.A0G(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x03cf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.0y7 r0 = X.C20760y7.copyOf((java.util.Collection) r3)
            r4.A02(r0, r1)
            goto L_0x03cf
        L_0x03e3:
            java.lang.Object r8 = r2.A00
            X.1Xd r8 = (X.C29571Xd) r8
            java.lang.Object r7 = r2.A01
            X.3T1 r7 = (X.AnonymousClass3T1) r7
            java.lang.Object r9 = r2.A02
            X.3T1 r9 = (X.AnonymousClass3T1) r9
            X.5J2 r0 = r7.A1V
            if (r0 == 0) goto L_0x0419
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0419
            X.16J r6 = r8.A0J
            java.lang.Iterable r0 = r6.getObservers()
            java.util.Iterator r5 = r0.iterator()
        L_0x0402:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0419
            java.lang.Object r4 = r5.next()
            X.191 r4 = (X.AnonymousClass191) r4
            long r2 = r6.A00
            r0 = 1
            long r2 = r2 + r0
            r6.A00 = r2
            r4.Bci(r9, r7)
            goto L_0x0402
        L_0x0419:
            X.16J r0 = r8.A0J
            r0.A06(r9, r7)
            X.1DP r2 = r8.A07
            X.3Qa r0 = r9.A1J
            X.11F r1 = r0.A00
            r0 = 0
            r2.A02(r1, r0)
            X.0wU r2 = r8.A0c
            r1 = 9
            X.1j7 r0 = new X.1j7
            r0.<init>(r8, r7, r1)
            r2.Boy(r0)
            X.3L1 r0 = r7.A0a
            if (r0 == 0) goto L_0x0016
            X.1Xj r0 = r8.A0Y
            r0.A02(r7)
            return
        L_0x043e:
            java.lang.Object r4 = r2.A00
            X.1A5 r4 = (X.AnonymousClass1A5) r4
            java.lang.Object r1 = r2.A01
            X.141 r1 = (X.AnonymousClass141) r1
            java.lang.Object r3 = r2.A02
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r1 = r1.A06(r0)
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r1 == 0) goto L_0x0016
            X.17X r0 = r4.A03
            boolean r0 = r0.A0C(r1)
            if (r0 == 0) goto L_0x0016
            X.0xg r2 = r4.A04
            X.147 r3 = (X.AnonymousClass147) r3
            r1 = 0
            r0 = 3
            r2.A0E(r3, r1, r0)
            return
        L_0x0466:
            java.lang.Object r4 = r2.A00
            X.1HJ r4 = (X.AnonymousClass1HJ) r4
            java.lang.Object r3 = r2.A01
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r2.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.16J r1 = r4.A0C
            r0 = 0
            r1.A08(r3, r0)
            X.1HP r0 = r4.A0I
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0482:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.1co r0 = (X.C32011co) r0
            r0.BSh(r2)
            goto L_0x0482
        L_0x0492:
            java.lang.Object r0 = r2.A00
            X.1Si r0 = (X.C28361Si) r0
            java.lang.Object r9 = r2.A01
            X.3T1 r9 = (X.AnonymousClass3T1) r9
            java.lang.Object r2 = r2.A02
            if (r9 != 0) goto L_0x04a9
            java.util.Map r1 = r0.A0H
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r2, r0)
            return
        L_0x04a9:
            java.util.Map r0 = r0.A0H
            java.lang.Object r8 = r0.get(r2)
            java.util.List r8 = (java.util.List) r8
            X.C28361Si.A02(r8)
            if (r8 == 0) goto L_0x04d9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r8.iterator()
        L_0x04bf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04ee
            java.lang.Object r5 = r6.next()
            X.3LF r5 = (X.AnonymousClass3LF) r5
            X.3T1 r0 = r5.A00
            long r3 = r0.A1O
            long r1 = r9.A1O
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x04bf
            r7.add(r5)
            goto L_0x04bf
        L_0x04d9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "messagenotification/cache/reset/list null for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x04f1
        L_0x04ee:
            r8.removeAll(r7)
        L_0x04f1:
            X.C28361Si.A02(r8)
            return
        L_0x04f5:
            java.lang.Object r3 = r2.A00
            X.1Si r3 = (X.C28361Si) r3
            java.lang.Object r5 = r2.A01
            X.11F r5 = (X.AnonymousClass11F) r5
            java.lang.Object r10 = r2.A02
            X.3T1 r10 = (X.AnonymousClass3T1) r10
            java.util.Map r6 = r3.A0H
            java.lang.Object r2 = r6.get(r5)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0513
            r0 = 1
            java.util.ArrayList r2 = r3.A07(r5, r0)
            r6.put(r5, r2)
        L_0x0513:
            boolean r0 = X.C28361Si.A03(r10, r2)
            if (r0 != 0) goto L_0x0652
            boolean r0 = r10 instanceof X.AnonymousClass2bO
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x057f
            r0 = r10
            X.2bO r0 = (X.AnonymousClass2bO) r0
            java.lang.String r7 = r0.A01
            X.C18740tg.A06(r7)
            X.3Qa r0 = r10.A1J
            X.11F r0 = r0.A00
            X.3Qa r8 = new X.3Qa
            r8.<init>(r0, r7, r4)
        L_0x0530:
            int r0 = r2.size()
            if (r4 >= r0) goto L_0x056c
            java.lang.Object r6 = r2.get(r4)
            X.3LF r6 = (X.AnonymousClass3LF) r6
            X.3T1 r0 = r6.A00
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0558
            boolean r0 = r6 instanceof X.AnonymousClass4RM
            if (r0 == 0) goto L_0x057c
            X.4RM r6 = (X.AnonymousClass4RM) r6
            X.3Qa r0 = r6.BF8()
            java.lang.String r0 = r0.A01
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x057c
        L_0x0558:
            if (r4 < 0) goto L_0x056c
            int r0 = r2.size()
            if (r4 >= r0) goto L_0x056c
            r2.remove(r4)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x056c
            r3.A0B(r5)
        L_0x056c:
            int r3 = r2.size()
            r0 = 7
            if (r3 <= r0) goto L_0x0652
            int r0 = r2.size()
            int r0 = r0 - r1
            r2.remove(r0)
            goto L_0x056c
        L_0x057c:
            int r4 = r4 + 1
            goto L_0x0530
        L_0x057f:
            boolean r0 = r10 instanceof X.AnonymousClass2bK
            if (r0 != 0) goto L_0x056c
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r10.A1T(r0)
            if (r0 == 0) goto L_0x060f
            X.3Kx r7 = r10.A0P()
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r10.A1T(r0)
            if (r0 == 0) goto L_0x060f
            if (r7 == 0) goto L_0x060f
            X.9Vv r0 = r7.A01()
            if (r0 == 0) goto L_0x060f
            X.3Qa r0 = r0.A01
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x060f
            java.util.Iterator r9 = r2.iterator()
        L_0x05a9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x060f
            java.lang.Object r7 = r9.next()
            X.3LF r7 = (X.AnonymousClass3LF) r7
            boolean r0 = r7 instanceof X.AnonymousClass2Z8
            if (r0 == 0) goto L_0x05a9
            X.2Z8 r7 = (X.AnonymousClass2Z8) r7
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r10.A1T(r0)
            if (r0 == 0) goto L_0x05a9
            X.3Kx r0 = r10.A0P()
            if (r0 == 0) goto L_0x05a9
            X.3K6 r0 = r7.A00
            X.3Qa r0 = r0.A04
            X.11F r8 = r0.A00
            X.3Qa r0 = r10.A1J
            X.11F r0 = r0.A00
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x05a9
            r7.A00 = r10
            X.3Kx r0 = r10.A0P()
            if (r0 == 0) goto L_0x0602
            java.lang.Long r4 = r0.A04()
            X.9Vv r3 = r0.A01()
            if (r4 == 0) goto L_0x0602
            if (r3 == 0) goto L_0x0602
            X.3K6 r0 = r7.A00
            java.util.Set r12 = r0.A05
            r12.add(r4)
            long r13 = r4.longValue()
            X.3Qa r11 = r3.A01
            X.3K6 r9 = new X.3K6
            r15 = r13
            r9.<init>(r10, r11, r12, r13, r15)
            r7.A00 = r9
        L_0x0602:
            X.3wy r0 = new X.3wy
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            r6.put(r5, r2)
            goto L_0x056c
        L_0x060f:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r10.A1T(r0)
            if (r0 == 0) goto L_0x064d
            X.3Kx r0 = r10.A0P()
            java.lang.Long r6 = r0.A04()
            long r13 = r6.longValue()
            X.1A1 r0 = r3.A0F
            X.175 r0 = r0.A01
            X.3T1 r5 = r0.A01(r13)
            if (r5 == 0) goto L_0x056c
            X.3Qa r11 = r5.A1J
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x056c
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r12.add(r6)
            long r15 = r5.A1O
            X.3K6 r9 = new X.3K6
            r9.<init>(r10, r11, r12, r13, r15)
            X.1TI r0 = r3.A04
            X.2Z8 r0 = r0.A00(r9)
        L_0x0648:
            r2.add(r4, r0)
            goto L_0x056c
        L_0x064d:
            X.3LF r0 = r3.A06(r10)
            goto L_0x0648
        L_0x0652:
            X.C28361Si.A02(r2)
            return
        L_0x0656:
            java.lang.Object r5 = r2.A00
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            java.lang.Object r4 = r2.A01
            X.1SP r4 = (X.AnonymousClass1SP) r4
            java.lang.Object r3 = r2.A02
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            r2 = 0
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            X.3Qa r0 = r5.A1J
            X.11F r1 = r0.A00
            if (r1 == 0) goto L_0x0672
            X.1DP r0 = r4.A00
            r0.A02(r1, r2)
        L_0x0672:
            X.16J r0 = r4.A01
            r0.A06(r5, r3)
            return
        L_0x0678:
            java.lang.Object r0 = r2.A00
            X.1Zi r0 = (X.C30131Zi) r0
            java.lang.Object r6 = r2.A01
            X.2La r6 = (X.C44072La) r6
            java.lang.Object r2 = r2.A02
            r30 = 0
            X.12q r3 = r0.A0C
            X.11F r1 = r6.A06()
            X.AnonymousClass00C.A08(r1)
            X.C65903Tx.A04(r3, r1)
            X.1Ja r1 = r0.A0D
            X.11F r4 = r6.A06()
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.AnonymousClass00C.A0E(r4, r3)
            X.1Uw r4 = (X.C28981Uw) r4
            java.lang.String r3 = r6.A0K
            X.011 r3 = r1.A06(r4, r3)
            java.lang.Object r4 = r3.first
            X.3Qp r4 = (X.C65073Qp) r4
            java.lang.Object r3 = r3.second
            java.lang.Number r3 = (java.lang.Number) r3
            long r18 = r3.longValue()
            r5 = 0
            r20 = 0
            r17 = 536870908(0x1ffffffc, float:1.0842019E-19)
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r7 = r5
            X.2La r3 = X.C44072La.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24, r26, r28, r30)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            X.AnonymousClass00C.A08(r3)
            r1.A0A(r3)
            X.1ZL r1 = r0.A0L
            r1.A0G(r3)
            X.1ZK r1 = r0.A0H
            r1.A00(r6)
            X.17Y r3 = r0.A0A
            r1 = 39
            X.1j8 r0 = new X.1j8
            r0.<init>(r2, r1)
            r3.A0H(r0)
            return
        L_0x06ed:
            java.lang.Object r4 = r2.A00
            X.1a4 r4 = (X.C30351a4) r4
            java.lang.Object r3 = r2.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.Object r1 = r2.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1Nx r0 = r4.A0C
            r0.A08(r3, r1)
            X.1Cd r0 = r4.A04
            r0.A00(r3)
            return
        L_0x0704:
            java.lang.Object r0 = r2.A00
            X.1Xk r0 = (X.C29641Xk) r0
            java.lang.Object r3 = r2.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r1 = r2.A02
            X.4xN r1 = (X.C101334xN) r1
            X.1TR r0 = r0.A0A
            goto L_0x075c
        L_0x0713:
            java.lang.Object r3 = r2.A00
            X.1Xj r3 = (X.C29631Xj) r3
            java.lang.Object r1 = r2.A01
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r0 = r2.A02
            java.util.Random r0 = (java.util.Random) r0
            X.C29631Xj.A00(r3, r1, r0)
            return
        L_0x0723:
            java.lang.Object r4 = r2.A00
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r3 = r2.A01
            byte[] r3 = (byte[]) r3
            java.lang.Object r0 = r2.A02
            X.68C r0 = (X.AnonymousClass68C) r0
            X.1Gl r2 = r0.A0A
            boolean r1 = r0.A0Y
            boolean r0 = X.AnonymousClass1Ax.A04(r2)
            if (r0 != 0) goto L_0x0747
            boolean r0 = X.AnonymousClass6Y1.A07(r2)
            if (r0 != 0) goto L_0x0747
            boolean r0 = X.AnonymousClass6Y1.A04(r2)
            if (r0 == 0) goto L_0x074c
            if (r1 == 0) goto L_0x074c
        L_0x0747:
            r0 = 1
        L_0x0748:
            r4.A1D(r3, r0)
            return
        L_0x074c:
            r0 = 0
            goto L_0x0748
        L_0x074e:
            java.lang.Object r0 = r2.A00
            X.1ST r0 = (X.AnonymousClass1ST) r0
            java.lang.Object r3 = r2.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r1 = r2.A02
            X.4xN r1 = (X.C101334xN) r1
            X.1TR r0 = r0.A0I
        L_0x075c:
            r0.A04(r1, r3)
            return
        L_0x0760:
            java.lang.Object r4 = r2.A00
            X.1D0 r4 = (X.AnonymousClass1D0) r4
            java.lang.Object r3 = r2.A01
            X.6vi r3 = (X.C146506vi) r3
            java.lang.Object r1 = r2.A02
            X.5xD r1 = (X.C123865xD) r1
            X.1Hk r0 = r3.A0K
            r0.A04(r1)
            boolean r0 = r3.A08()
            if (r0 == 0) goto L_0x077c
            int r0 = r1.A00
            if (r0 != 0) goto L_0x077c
            return
        L_0x077c:
            X.AnonymousClass1D0.A03(r4, r3, r1)
            return
        L_0x0780:
            java.lang.Object r3 = r2.A00
            X.1D0 r3 = (X.AnonymousClass1D0) r3
            java.lang.Object r1 = r2.A01
            X.6vi r1 = (X.C146506vi) r1
            java.lang.Object r0 = r2.A02
            X.6Pj r0 = (X.C131516Pj) r0
            r3.A0D(r1, r0)
            return
        L_0x0790:
            java.lang.Object r6 = r2.A00
            X.1P5 r6 = (X.AnonymousClass1P5) r6
            java.lang.Object r8 = r2.A01
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r7 = r6.A0R
            monitor-enter(r7)
            java.util.Map r5 = X.AnonymousClass1P5.A06(r6)     // Catch:{ all -> 0x082b }
            java.util.Iterator r4 = r8.iterator()     // Catch:{ all -> 0x082b }
        L_0x07a3:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x082b }
            if (r0 == 0) goto L_0x07d1
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x082b }
            X.3T1 r3 = (X.AnonymousClass3T1) r3     // Catch:{ all -> 0x082b }
            X.3Qa r2 = r3.A1J     // Catch:{ all -> 0x082b }
            X.11F r1 = r2.A00     // Catch:{ all -> 0x082b }
            if (r1 == 0) goto L_0x07a3
            boolean r0 = r2.A02     // Catch:{ all -> 0x082b }
            if (r0 == 0) goto L_0x07a3
            boolean r0 = r3 instanceof X.C46902br     // Catch:{ all -> 0x082b }
            if (r0 == 0) goto L_0x07a3
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x082b }
            X.38X r0 = (X.AnonymousClass38X) r0     // Catch:{ all -> 0x082b }
            if (r0 == 0) goto L_0x07a3
            X.3Qa r0 = r0.A02     // Catch:{ all -> 0x082b }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x082b }
            if (r0 == 0) goto L_0x07a3
            r6.A0V(r1)     // Catch:{ all -> 0x082b }
            goto L_0x07a3
        L_0x07d1:
            monitor-exit(r7)     // Catch:{ all -> 0x082b }
            java.lang.Object r5 = r6.A0Q
            monitor-enter(r5)
            java.util.Map r7 = X.AnonymousClass1P5.A05(r6)     // Catch:{ all -> 0x0828 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0828 }
        L_0x07dd:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0828 }
            if (r0 == 0) goto L_0x0826
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x0828 }
            X.3T1 r1 = (X.AnonymousClass3T1) r1     // Catch:{ all -> 0x0828 }
            X.3Qa r4 = r1.A1J     // Catch:{ all -> 0x0828 }
            X.11F r3 = r4.A00     // Catch:{ all -> 0x0828 }
            if (r3 == 0) goto L_0x0826
            boolean r0 = r4.A02     // Catch:{ all -> 0x0828 }
            if (r0 != 0) goto L_0x0826
            boolean r0 = r1 instanceof X.C46902br     // Catch:{ all -> 0x0828 }
            if (r0 == 0) goto L_0x0826
            java.lang.Object r2 = r7.get(r3)     // Catch:{ all -> 0x0828 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x0828 }
            if (r2 == 0) goto L_0x0826
            X.11F r1 = r1.A0J()     // Catch:{ all -> 0x0828 }
            if (r1 != 0) goto L_0x081f
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0828 }
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r3)     // Catch:{ all -> 0x0828 }
        L_0x080b:
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0828 }
            X.375 r0 = (X.AnonymousClass375) r0     // Catch:{ all -> 0x0828 }
            if (r0 == 0) goto L_0x07dd
            X.3Qa r0 = r0.A02     // Catch:{ all -> 0x0828 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0828 }
            if (r0 == 0) goto L_0x07dd
            X.AnonymousClass1P5.A08(r3, r1, r6)     // Catch:{ all -> 0x0828 }
            goto L_0x07dd
        L_0x081f:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0828 }
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r1)     // Catch:{ all -> 0x0828 }
            goto L_0x080b
        L_0x0826:
            monitor-exit(r5)     // Catch:{ all -> 0x0828 }
            return
        L_0x0828:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0828 }
            throw r1
        L_0x082b:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x082b }
            throw r1
        L_0x082e:
            java.lang.Object r0 = r2.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r3 = r2.A01
            X.144 r3 = (X.AnonymousClass144) r3
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            X.17X r0 = r0.A0U
            r0.A09(r3, r1)
            return
        L_0x0840:
            java.lang.Object r0 = r2.A00
            X.0xQ r0 = (X.C20350xQ) r0
            java.lang.Object r8 = r2.A01
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r2.A02
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            X.17X r1 = r0.A0U
            X.12P r0 = r1.A06
            X.1M0 r6 = r0.A05()
            X.71s r5 = r6.B1k()     // Catch:{ all -> 0x08c5 }
            X.17r r4 = r1.A07     // Catch:{ all -> 0x08bb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x08bb }
            r1.<init>()     // Catch:{ all -> 0x08bb }
            java.lang.String r0 = "participant-user-store/removeParticipantFromGroups/"
            r1.append(r0)     // Catch:{ all -> 0x08bb }
            r1.append(r8)     // Catch:{ all -> 0x08bb }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x08bb }
            r1.append(r7)     // Catch:{ all -> 0x08bb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x08bb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08bb }
            X.12P r0 = r4.A06     // Catch:{ all -> 0x08bb }
            X.1M0 r3 = r0.A05()     // Catch:{ all -> 0x08bb }
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x08b1 }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x08a7 }
        L_0x0884:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x08a7 }
            if (r0 == 0) goto L_0x0894
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x08a7 }
            X.144 r0 = (X.AnonymousClass144) r0     // Catch:{ all -> 0x08a7 }
            r4.A0N(r0, r7)     // Catch:{ all -> 0x08a7 }
            goto L_0x0884
        L_0x0894:
            r2.A00()     // Catch:{ all -> 0x08a7 }
            r2.close()     // Catch:{ all -> 0x08b1 }
            r3.close()     // Catch:{ all -> 0x08bb }
            r5.A00()     // Catch:{ all -> 0x08bb }
            r5.close()     // Catch:{ all -> 0x08c5 }
            r6.close()
            return
        L_0x08a7:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x08ac }
            goto L_0x08b0
        L_0x08ac:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08b1 }
        L_0x08b0:
            throw r1     // Catch:{ all -> 0x08b1 }
        L_0x08b1:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x08b6 }
            goto L_0x08ba
        L_0x08b6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08bb }
        L_0x08ba:
            throw r1     // Catch:{ all -> 0x08bb }
        L_0x08bb:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x08c0 }
            goto L_0x08c4
        L_0x08c0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08c5 }
        L_0x08c4:
            throw r1     // Catch:{ all -> 0x08c5 }
        L_0x08c5:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x09cd }
            throw r1
        L_0x08ca:
            java.lang.Object r4 = r2.A00
            X.1CH r4 = (X.AnonymousClass1CH) r4
            java.lang.Object r3 = r2.A01
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            java.lang.Object r1 = r2.A02
            X.34i r1 = (X.C595434i) r1
            r0 = 0
            r4.A02(r1, r3, r0)
            return
        L_0x08db:
            java.lang.Object r0 = r2.A00
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r3 = r2.A01
            X.1F4 r3 = (X.AnonymousClass1F4) r3
            java.lang.Object r2 = r2.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.util.Iterator r1 = r0.iterator()
        L_0x08eb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08fb
            java.lang.Object r0 = r1.next()
            X.3Kh r0 = (X.C63503Kh) r0
            X.AnonymousClass1F4.A00(r3, r0)
            goto L_0x08eb
        L_0x08fb:
            X.0wI r0 = r3.A02
            r0.A00(r2)
            return
        L_0x0901:
            java.lang.Object r1 = r2.A00
            X.1Hi r1 = (X.C25701Hi) r1
            java.lang.Object r6 = r2.A01
            X.1Hj r6 = (X.C25711Hj) r6
            java.lang.Object r7 = r2.A02
            java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7
            X.1Hk r5 = r1.A00
            java.lang.Object r0 = r5.A00()
            if (r0 != 0) goto L_0x0966
            X.C18740tg.A00()
            X.18P r0 = r1.A02
            X.1M0 r8 = r0.get()
            X.14e r9 = r8.A02     // Catch:{ all -> 0x09c8 }
            java.lang.String r3 = "SELECT DISTINCT (device_id) FROM msg_history_sync WHERE status=?"
            r4 = 1
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ all -> 0x09c8 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x09c8 }
            r2[r1] = r0     // Catch:{ all -> 0x09c8 }
            java.lang.String r0 = "MessageHistorySyncTable.SELECT_ALL_DEVICE_ID_FOR_SYNC_STATUS"
            android.database.Cursor r3 = r9.A09(r3, r0, r2)     // Catch:{ all -> 0x09c8 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x095c }
            r2.<init>()     // Catch:{ all -> 0x095c }
        L_0x0937:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x095c }
            if (r0 == 0) goto L_0x0955
            java.lang.String r0 = "device_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x095c }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x095c }
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getNullable(r0)     // Catch:{ all -> 0x095c }
            if (r1 == 0) goto L_0x0937
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x095c }
            r2.put(r1, r0)     // Catch:{ all -> 0x095c }
            goto L_0x0937
        L_0x0955:
            r5.A04(r2)     // Catch:{ all -> 0x095c }
            r3.close()     // Catch:{ all -> 0x09c8 }
            goto L_0x0963
        L_0x095c:
            r1 = move-exception
            if (r3 == 0) goto L_0x09c7
            r3.close()     // Catch:{ all -> 0x09c3 }
            goto L_0x09c7
        L_0x0963:
            r8.close()
        L_0x0966:
            r5.A03(r6, r7)
            return
        L_0x096a:
            java.lang.Object r7 = r2.A00
            X.17r r7 = (X.C232317r) r7
            java.lang.Object r6 = r2.A01
            X.6X6 r6 = (X.AnonymousClass6X6) r6
            java.lang.Object r2 = r2.A02
            java.util.Map r2 = (java.util.Map) r2
            X.17u r1 = r7.A04
            X.144 r0 = r6.A05
            X.6X6 r5 = r1.A09(r0)
            X.12P r0 = r7.A06
            X.1M0 r8 = r0.A05()
            X.71s r4 = r8.B1k()     // Catch:{ all -> 0x09c8 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x09be }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x09be }
        L_0x0990:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x09be }
            if (r0 == 0) goto L_0x09b4
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x09be }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x09be }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x09be }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x09be }
            r1 = r6
            if (r5 == 0) goto L_0x09a6
            r1 = r5
        L_0x09a6:
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x09be }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x09be }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x09be }
            X.C232317r.A07(r1, r7, r2, r0)     // Catch:{ all -> 0x09be }
            goto L_0x0990
        L_0x09b4:
            r4.A00()     // Catch:{ all -> 0x09be }
            r4.close()     // Catch:{ all -> 0x09c8 }
            r8.close()
            return
        L_0x09be:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x09c3 }
            goto L_0x09c7
        L_0x09c3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09c8 }
        L_0x09c7:
            throw r1     // Catch:{ all -> 0x09c8 }
        L_0x09c8:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x09cd }
            throw r1
        L_0x09cd:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x09d2:
            java.lang.Object r6 = r2.A00
            X.17X r6 = (X.AnonymousClass17X) r6
            java.lang.Object r5 = r2.A01
            X.11F r5 = (X.AnonymousClass11F) r5
            java.lang.Object r4 = r2.A02
            X.00r r4 = (X.C001600r) r4
            X.12O r1 = r6.A09
            r0 = r5
            X.13w r0 = (X.C223313w) r0
            com.whatsapp.jid.PhoneUserJid r1 = r1.A0A(r0)
            if (r1 != 0) goto L_0x0a00
            X.0wN r3 = r6.A00
            r2 = 0
            r1 = 0
            java.lang.String r0 = "lid_group_chat/pn_unknown"
            r3.A0E(r0, r2, r1)
        L_0x09f2:
            X.0wn r0 = new X.0wn
            r0.<init>(r5)
            r4.A0C(r0)
            X.17Y r0 = r6.A01
            r0.A02()
            return
        L_0x0a00:
            java.lang.String r0 = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat PN JID"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = r1
            goto L_0x09f2
        L_0x0a07:
            java.lang.Object r4 = r2.A00
            X.1LW r4 = (X.AnonymousClass1LW) r4
            java.lang.Object r3 = r2.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.Object r2 = r2.A02
            X.3G4 r2 = (X.AnonymousClass3G4) r2
            X.12q r1 = r4.A02
            r0 = 0
            X.3Qp r1 = r1.A09(r3, r0)
            if (r1 != 0) goto L_0x0a2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupchatstore/updateGroupChatInfoInBackgroundIfExists/chat does not exist: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            goto L_0x0ac9
        L_0x0a2f:
            r1.A0e = r2
            r0 = 0
            X.AnonymousClass1LW.A00(r1, r4, r3, r0)
            return
        L_0x0a36:
            java.lang.Object r4 = r2.A00
            X.1SR r4 = (X.AnonymousClass1SR) r4
            java.lang.Object r3 = r2.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r2 = r2.A02
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            X.176 r1 = r4.A0F
            X.3Qa r0 = r3.A1J
            r1.A0C(r0)
            r1.A0B(r2)
            X.12q r0 = r4.A05
            r0.A0K(r2)
            r0 = 1
            r3.A1P = r0
            return
        L_0x0a55:
            java.lang.Object r6 = r2.A00
            X.0xM r6 = (X.C20310xM) r6
            java.lang.Object r8 = r2.A01
            X.3Qa r8 = (X.C64933Qa) r8
            java.lang.Object r5 = r2.A02
            X.9lY r5 = (X.C202319lY) r5
            X.1A1 r0 = r6.A1B
            X.3T1 r4 = r0.A03(r8)
            if (r4 == 0) goto L_0x0af3
            X.9lY r3 = r4.A0M
        L_0x0a6b:
            X.1EU r0 = r6.A19
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r7 = r0.A05
            java.lang.String r18 = " ts: "
            if (r3 == 0) goto L_0x0b56
            int r15 = r3.A02
            java.lang.String r0 = r3.A0J
            r17 = r0
            boolean r0 = r3.A0N()
            if (r0 == 0) goto L_0x0a89
            boolean r0 = r5.A0N()
            r10 = 1
            if (r0 == 0) goto L_0x0a8a
        L_0x0a89:
            r10 = 0
        L_0x0a8a:
            int r9 = r5.A03
            long r0 = r5.A06
            X.8av r2 = r5.A0A
            boolean r0 = r3.A0O(r2, r9, r0)
            java.lang.String r9 = " new: "
            if (r0 != 0) goto L_0x0acd
            if (r10 != 0) goto L_0x0acd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY nochange: old status: "
            r4.append(r0)
            int r0 = r3.A02
            r4.append(r0)
            r4.append(r9)
            int r0 = r5.A02
            r4.append(r0)
            java.lang.String r0 = " old ts: "
            r4.append(r0)
            long r0 = r3.A06
            r4.append(r0)
            java.lang.String r0 = " new ts: "
            r4.append(r0)
            long r0 = r5.A06
            r4.append(r0)
        L_0x0ac5:
            java.lang.String r0 = r4.toString()
        L_0x0ac9:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0acd:
            java.lang.String r2 = r3.A0K
            java.lang.String r1 = r5.A0K
            if (r2 != 0) goto L_0x0ad7
            r3.A0K = r1
        L_0x0ad5:
            monitor-enter(r5)
            goto L_0x0af6
        L_0x0ad7:
            if (r1 == 0) goto L_0x0ad5
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x0ad5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY nochange: id's not equal, old trans id: "
            r4.append(r0)
            r4.append(r2)
            r4.append(r9)
            r4.append(r1)
            goto L_0x0ac5
        L_0x0af3:
            r3 = 0
            goto L_0x0a6b
        L_0x0af6:
            boolean r0 = r5.A0K()     // Catch:{ all -> 0x0b53 }
            r1 = 1
            if (r0 != 0) goto L_0x0b02
            int r0 = r5.A00     // Catch:{ all -> 0x0b53 }
            if (r0 != r1) goto L_0x0b02
            goto L_0x0b03
        L_0x0b02:
            r1 = 0
        L_0x0b03:
            monitor-exit(r5)
            if (r1 == 0) goto L_0x0b25
            int r1 = r5.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 != r0) goto L_0x0b25
            long r0 = r4.A1N
            X.3Qa r2 = r4.A1J
            java.lang.String r9 = r2.A01
            java.lang.String r2 = r3.A0K
            X.9lY r0 = r7.A0L(r9, r2, r0)
            if (r0 == 0) goto L_0x0b25
            X.8av r1 = r0.A0A
            if (r1 == 0) goto L_0x0b25
            X.9uo r0 = r1.A02
            if (r0 == 0) goto L_0x0b25
            r5.A08(r0, r1)
        L_0x0b25:
            int r13 = r5.A02
            long r0 = r5.A06
            java.lang.String r12 = r5.A0H
            java.lang.String r11 = r5.A0J
            java.lang.String r10 = r5.A0F
            X.8av r9 = r5.A0A
            r2 = 16
            monitor-enter(r3)
            r19 = r3
            r20 = r0
            r22 = r12
            r23 = r13
            r24 = r11
            r25 = r10
            r19.A07(r20, r22, r23, r24, r25)     // Catch:{ all -> 0x0b50 }
            if (r9 == 0) goto L_0x0b86
            X.8av r0 = r3.A0A     // Catch:{ all -> 0x0b50 }
            if (r0 == 0) goto L_0x0b4d
            r0.A0O(r9)     // Catch:{ all -> 0x0b50 }
            goto L_0x0b86
        L_0x0b4d:
            r3.A0A = r9     // Catch:{ all -> 0x0b50 }
            goto L_0x0b86
        L_0x0b50:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x0b53:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x0b56:
            r2 = 16
            java.lang.String r0 = r5.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0b83
            X.17E r4 = r6.A14
            r0 = 0
            r3 = 0
            X.3T1 r4 = r4.A00(r8, r3, r0)
            java.lang.String r0 = r5.A0K
            r4.A0t = r0
            r4.A0M = r5
            java.lang.String r1 = r7.A0M(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY added new transaction with trans id: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " status: "
            goto L_0x0bcb
        L_0x0b83:
            if (r4 == 0) goto L_0x0bf4
            goto L_0x0be9
        L_0x0b86:
            monitor-exit(r3)
            int r1 = r3.A03
            r0 = 5
            if (r1 != r0) goto L_0x0d10
            java.lang.String r0 = r8.A01
            boolean r0 = r7.A0c(r5, r3, r0)
            r4.A0M = r5
            r3.A0B(r5)
        L_0x0b97:
            if (r0 == 0) goto L_0x0be9
            int r0 = r5.A02
            if (r0 == r15) goto L_0x0bc4
            X.1FQ r9 = r6.A18
            X.3Qa r7 = r4.A1J
            long r0 = r4.A0I
            r31 = r0
            X.1Cv r0 = r9.A07
            X.11F r11 = r7.A00
            X.3T1 r0 = r0.A05(r11)
            X.C18740tg.A06(r0)
            X.3Qa r0 = r0.A1J
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r7.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0bfa
            X.1Dc r3 = r9.A0A
            java.lang.String r1 = "Do not insert system message if last message is the transaction message."
            r0 = 0
            X.C24611Dc.A02(r3, r0, r1)
        L_0x0bc4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY updated transaction status to: "
        L_0x0bcb:
            r3.append(r0)
            int r0 = r5.A02
            r3.append(r0)
            r0 = r18
            r3.append(r0)
            long r0 = r5.A06
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1DQ r0 = r6.A0T
            r0.A01(r4, r2)
        L_0x0be9:
            X.0xu r1 = r6.A0R
            boolean r0 = r1.A0N()
            if (r0 == 0) goto L_0x0bf4
            r1.A0K(r4)
        L_0x0bf4:
            X.1Fn r0 = r6.A0e
            r0.A01(r4)
            return
        L_0x0bfa:
            X.1FR r1 = r9.A0B
            java.lang.String r12 = r1.A0R(r3)
            java.lang.String r10 = r1.A0U(r3)
            java.lang.String r16 = r1.A0P(r3)
            boolean r0 = r7.A02
            r30 = r0
            int r0 = r3.A02
            r19 = r0
            long r13 = r3.A06
            X.16X r0 = r3.A08
            if (r0 != 0) goto L_0x0d0c
            X.0wG r0 = r9.A04
            android.content.Context r8 = r0.A00
            r0 = 2131895201(0x7f1223a1, float:1.9425228E38)
            java.lang.String r22 = r8.getString(r0)
        L_0x0c21:
            X.16X r0 = r3.A08
            r8 = 1
            if (r0 != 0) goto L_0x0d04
            r25 = 1
        L_0x0c28:
            r20 = r12
            r21 = r10
            r23 = r19
            r24 = r15
            r26 = r31
            r28 = r13
            r19 = r1
            java.lang.String r0 = r19.A0b(r20, r21, r22, r23, r24, r25, r26, r28, r30)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0bc4
            X.1Dc r14 = r9.A0A
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "generatePaymentStatusChangeMessageIfNeeded receiverName:"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = " senderName:"
            r13.append(r0)
            r13.append(r10)
            java.lang.String r0 = " newStatus:"
            r13.append(r0)
            int r0 = r3.A02
            r13.append(r0)
            java.lang.String r0 = " oldStatus:"
            r13.append(r0)
            r13.append(r15)
            java.lang.String r0 = " initTs:"
            r13.append(r0)
            r0 = r31
            r13.append(r0)
            java.lang.String r0 = " updateTs:"
            r13.append(r0)
            long r0 = r3.A06
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            r14.A06(r0)
            X.19w r0 = r9.A0C
            X.C18740tg.A06(r11)
            X.3Qa r11 = r0.A02(r11, r8)
            X.0wo r0 = r9.A03
            long r0 = X.C19970wo.A00(r0)
            X.8nh r9 = new X.8nh
            r9.<init>(r11, r0)
            java.lang.String r0 = r3.A0K
            r9.A03 = r0
            r0 = 5
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.String.valueOf(r15)
            r13 = 0
            r1[r13] = r0
            r1[r8] = r17
            int r0 = r3.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11 = 2
            r1[r11] = r0
            r0 = 3
            r1[r0] = r12
            r0 = 4
            r1[r0] = r10
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.lang.String r10 = ";"
            java.lang.String r0 = android.text.TextUtils.join(r10, r0)
            r9.A01 = r0
            java.lang.String r0 = java.lang.String.valueOf(r31)
            r9.A02 = r0
            long r0 = r3.A06
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.A04 = r0
            r9.A02 = r7
            java.lang.String[] r7 = new java.lang.String[r11]
            X.16X r0 = r3.A08
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0cf9
            r0 = r1
        L_0x0cdc:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7[r13] = r0
            X.16X r0 = r3.A08
            if (r0 != 0) goto L_0x0ce8
            r16 = r1
        L_0x0ce8:
            r7[r8] = r16
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.lang.String r0 = android.text.TextUtils.join(r10, r0)
            r9.A00 = r0
            r6.A0Q(r9, r2)
            goto L_0x0bc4
        L_0x0cf9:
            java.math.BigDecimal r0 = r0.A00
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0cdc
        L_0x0d04:
            java.math.BigDecimal r0 = r0.A00
            int r25 = r0.intValue()
            goto L_0x0c28
        L_0x0d0c:
            r22 = r16
            goto L_0x0c21
        L_0x0d10:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0d24
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r5)
            r4.A0M = r5
            boolean r0 = r7.A0e(r0)
            goto L_0x0b97
        L_0x0d24:
            X.9lY r8 = r4.A0M
            if (r8 == 0) goto L_0x0be9
            X.3Qa r1 = r4.A1J
            X.8av r0 = r5.A0A
            if (r0 == 0) goto L_0x0d3e
            long r12 = r0.A09()
            int r11 = r0.A07()
        L_0x0d36:
            r9 = r1
            r10 = r15
            boolean r0 = r7.A0d(r8, r9, r10, r11, r12)
            goto L_0x0b97
        L_0x0d3e:
            r12 = 0
            r11 = 0
            goto L_0x0d36
        L_0x0d42:
            java.lang.Object r5 = r2.A00
            X.0xM r5 = (X.C20310xM) r5
            java.lang.Object r3 = r2.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r6 = r2.A02
            java.util.Collection r6 = (java.util.Collection) r6
            X.1Fr r8 = r5.A0m
            X.3GP r0 = r3.A0c
            int r7 = r0.A00
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r0 = 3
            if (r7 == r0) goto L_0x0d8d
            X.16E r0 = r8.A08
            java.util.ArrayList r2 = r0.A0A()
            java.util.ArrayList r1 = r0.A0B()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = X.C25281Fr.A00(r8, r0, r2, r1, r7)
            X.17i r0 = r8.A09
            java.util.HashMap r0 = r0.A08(r1)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0d7d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0d8d
            java.lang.Object r0 = r1.next()
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            goto L_0x0d7d
        L_0x0d8d:
            r4.removeAll(r6)
            X.1FN r1 = r5.A0i
            X.3Qa r0 = r3.A1J
            java.util.HashSet r0 = r1.A00(r0)
            r4.removeAll(r0)
            r1.A02(r3, r4)
            return
        L_0x0d9f:
            java.lang.Object r0 = r2.A00
            X.1A5 r0 = (X.AnonymousClass1A5) r0
            java.lang.Object r6 = r2.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r8 = r2.A02
            X.11F r8 = (X.AnonymousClass11F) r8
            X.16D r7 = r0.A02
            X.16p r0 = r7.A05
            java.util.ArrayList r1 = r0.A0Q(r8)
            int r0 = r1.size()
            r5 = 0
            r4 = 1
            if (r0 != r4) goto L_0x0dc3
            java.lang.Object r0 = r1.get(r5)
        L_0x0dbf:
            r6.add(r0)
            return
        L_0x0dc3:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x0dcc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0de0
            java.lang.Object r1 = r2.next()
            X.141 r1 = (X.AnonymousClass141) r1
            int r0 = r1.A07
            if (r0 != r4) goto L_0x0dcc
            r3.add(r1)
            goto L_0x0dcc
        L_0x0de0:
            r1 = 4
            X.4YZ r0 = new X.4YZ
            r0.<init>(r7, r1)
            java.util.Collections.sort(r3, r0)
            int r0 = r3.size()
            if (r0 != 0) goto L_0x0df4
            X.141 r0 = r7.A0D(r8)
            goto L_0x0dbf
        L_0x0df4:
            java.lang.Object r0 = r3.get(r5)
            goto L_0x0dbf
        L_0x0df9:
            java.lang.Object r0 = r2.A00
            X.12t r0 = (X.C220712t) r0
            java.lang.Object r3 = r2.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.Object r2 = r2.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.005 r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1Do r0 = (X.C24731Do) r0
            X.1Hr r1 = r0.A01
            r0 = 4
            r1.A03(r3, r2, r0)
            return
        L_0x0e14:
            java.lang.Object r4 = r2.A00
            X.1Cu r4 = (X.C24531Cu) r4
            java.lang.Object r3 = r2.A01
            X.3Qp r3 = (X.C65073Qp) r3
            java.lang.Object r0 = r2.A02
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            long r0 = r0.A1N
            r3.A0C = r0
            X.163 r0 = r4.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e2a, Error | RuntimeException -> 0x0e93, Error | RuntimeException -> 0x0e93 }
            r0.A0D(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0e2a, Error | RuntimeException -> 0x0e93, Error | RuntimeException -> 0x0e93 }
            return
        L_0x0e2a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r4.A03
            r0.A03()
            return
        L_0x0e34:
            java.lang.Object r1 = r2.A00
            X.1FJ r1 = (X.AnonymousClass1FJ) r1
            java.lang.Object r0 = r2.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            java.lang.Object r3 = r2.A02
            X.00v r2 = r1.A00
            long r0 = r0.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08(r0, r3)
            return
        L_0x0e4a:
            java.lang.Object r0 = r2.A00
            X.189 r0 = (X.AnonymousClass189) r0
            java.lang.Object r4 = r2.A01
            X.6EZ r4 = (X.AnonymousClass6EZ) r4
            java.lang.Object r1 = r2.A02
            byte[] r1 = (byte[]) r1
            X.18a r3 = r0.A0G
            monitor-enter(r3)
            X.9eC r0 = new X.9eC     // Catch:{ IOException -> 0x0e62 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0e62 }
            r3.A03(r0, r4)     // Catch:{ IOException -> 0x0e62 }
            goto L_0x0e7c
        L_0x0e62:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e7e }
            r1.<init>()     // Catch:{ all -> 0x0e7e }
            java.lang.String r0 = "axolotl storeSession for "
            r1.append(r0)     // Catch:{ all -> 0x0e7e }
            r1.append(r4)     // Catch:{ all -> 0x0e7e }
            java.lang.String r0 = " failed to update"
            r1.append(r0)     // Catch:{ all -> 0x0e7e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0e7e }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0e7e }
        L_0x0e7c:
            monitor-exit(r3)     // Catch:{ all -> 0x0e7e }
            return
        L_0x0e7e:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0e7e }
            throw r1
        L_0x0e81:
            r1.BWY()
            return
        L_0x0e85:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0e87 }
        L_0x0e87:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0e8c }
            throw r0     // Catch:{ all -> 0x0e8c }
        L_0x0e8c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0e8e }
        L_0x0e8e:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)
            throw r1
        L_0x0e93:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            throw r1
        L_0x0e98:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x0e9b:
            java.lang.String r3 = "_data=?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ SQLiteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0eab, RuntimeException -> 0x0ead }
            r1 = 0
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ SQLiteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0eab, RuntimeException -> 0x0ead }
            r2[r1] = r0     // Catch:{ SQLiteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0eab, RuntimeException -> 0x0ead }
            r4.A01(r7, r3, r2)     // Catch:{ SQLiteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0eab, RuntimeException -> 0x0ead }
            return
        L_0x0eab:
            r2 = move-exception
            goto L_0x0ebc
        L_0x0ead:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x0ec0
            java.lang.String r0 = "android.os.DeadSystemException"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0ec0
        L_0x0ebc:
            com.whatsapp.util.Log.e(r5, r2)
            return
        L_0x0ec0:
            throw r2
        L_0x0ec1:
            java.lang.Object r5 = r2.A00
            X.1SW r5 = (X.AnonymousClass1SW) r5
            java.lang.Object r3 = r2.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r4 = r2.A02
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            X.0yC r2 = r5.A00
            r1 = 1856(0x740, float:2.601E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0ef7
            int r0 = r3.A1I
            boolean r0 = X.C66013Ui.A0M(r0)
            if (r0 == 0) goto L_0x0ef7
            X.1QB r2 = r5.A02
            java.io.File r0 = X.AnonymousClass1QB.A00(r3)
            if (r0 == 0) goto L_0x0ef7
            X.3Kz r1 = r3.A0V()
            X.C18740tg.A06(r1)
            byte[] r0 = r2.A01(r3)
            r1.A00(r0)
        L_0x0ef7:
            X.1EJ r0 = r5.A01
            r0.A00(r3)
            goto L_0x0f43
        L_0x0efd:
            java.lang.Object r0 = r2.A00
            X.1CY r0 = (X.AnonymousClass1CY) r0
            java.lang.Object r4 = r2.A01
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            java.lang.Object r3 = r2.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            X.1CZ r0 = r0.A00
            java.util.Map r1 = r0.A00
            r1.size()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0f1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0f47
            java.lang.Object r0 = r1.next()
            X.62q r0 = (X.C1261262q) r0
            int r2 = r0.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 < r0) goto L_0x0f1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "backupencryption/received/error "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0f43:
            r4.run()
            return
        L_0x0f47:
            r3.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35631j0.run():void");
    }
}
