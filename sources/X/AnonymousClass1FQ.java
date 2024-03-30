package X;

/* renamed from: X.1FQ  reason: invalid class name */
public class AnonymousClass1FQ implements AnonymousClass1FP {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final C19970wo A03;
    public final C19630wG A04;
    public final C20650xu A05;
    public final AnonymousClass1DQ A06;
    public final C24541Cv A07;
    public final AnonymousClass1EZ A08;
    public final AnonymousClass1EU A09;
    public final C24611Dc A0A = C24611Dc.A00("PaymentStatusNotifier", "notification", "COMMON");
    public final AnonymousClass1FR A0B;
    public final C237919w A0C;
    public final AnonymousClass005 A0D;
    public final AnonymousClass005 A0E;
    public final AnonymousClass12P A0F;
    public final AnonymousClass1EV A0G;

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0165 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00() {
        /*
            r17 = this;
            r4 = r17
            monitor-enter(r4)
            X.005 r0 = r4.A0D     // Catch:{ all -> 0x01e4 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x01e4 }
            X.0xM r5 = (X.C20310xM) r5     // Catch:{ all -> 0x01e4 }
            X.1EU r3 = r4.A09     // Catch:{ all -> 0x01e4 }
            X.AnonymousClass1EU.A00(r3)     // Catch:{ all -> 0x01e4 }
            X.1Ed r6 = r3.A05     // Catch:{ all -> 0x01e4 }
            monitor-enter(r6)     // Catch:{ all -> 0x01e4 }
            X.0wo r2 = r6.A01     // Catch:{ all -> 0x01e1 }
            long r15 = X.C19970wo.A00(r2)     // Catch:{ all -> 0x01e1 }
            java.util.ArrayList r1 = r6.A0O()     // Catch:{ all -> 0x01e1 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x01e1 }
            r7.<init>()     // Catch:{ all -> 0x01e1 }
            X.12P r0 = r6.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ad }
            X.1M0 r8 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ad }
            X.71s r14 = r8.B1k()     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x0099 }
        L_0x0030:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x0099 }
            X.9lY r10 = (X.C202319lY) r10     // Catch:{ all -> 0x0099 }
            X.8av r0 = r10.A0A     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0048
            long r11 = r0.A09()     // Catch:{ all -> 0x0099 }
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
        L_0x0048:
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0099 }
            r11.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x0099 }
            X.C24881Ed.A07(r1, r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "status"
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0099 }
            r11.put(r1, r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r12 = "timestamp"
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r15 / r0
            int r9 = (int) r0     // Catch:{ all -> 0x0099 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0099 }
            r11.put(r12, r0)     // Catch:{ all -> 0x0099 }
            X.1Dc r9 = r6.A04     // Catch:{ all -> 0x0099 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r1.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "expireOldPendingRequests key id:"
            r1.append(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r10.A0L     // Catch:{ all -> 0x0099 }
            r1.append(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0099 }
            r9.A06(r0)     // Catch:{ all -> 0x0099 }
            int r0 = X.C24881Ed.A00(r11, r8, r10)     // Catch:{ all -> 0x0099 }
            if (r0 <= 0) goto L_0x0030
            r7.add(r10)     // Catch:{ all -> 0x0099 }
            goto L_0x0030
        L_0x008f:
            r14.A00()     // Catch:{ all -> 0x0099 }
            r14.close()     // Catch:{ all -> 0x00a3 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ad }
            goto L_0x00b4
        L_0x0099:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00a3 }
        L_0x00a2:
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ad }
        L_0x00ac:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ad }
        L_0x00ad:
            X.1Dc r1 = r6.A04     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "expireOldPendingRequests failed."
            r1.A05(r0)     // Catch:{ all -> 0x01e1 }
        L_0x00b4:
            monitor-exit(r6)     // Catch:{ all -> 0x01e4 }
            X.AnonymousClass1EU.A00(r3)     // Catch:{ all -> 0x01e4 }
            monitor-enter(r6)     // Catch:{ all -> 0x01e4 }
            long r14 = X.C19970wo.A00(r2)     // Catch:{ all -> 0x01e1 }
            r8 = -1
            r1 = 1
            java.lang.Integer[] r3 = new java.lang.Integer[r1]     // Catch:{ all -> 0x01e1 }
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e1 }
            r2 = 0
            r3[r2] = r0     // Catch:{ all -> 0x01e1 }
            java.lang.Integer[] r1 = new java.lang.Integer[r1]     // Catch:{ all -> 0x01e1 }
            r0 = 40
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e1 }
            r1[r2] = r0     // Catch:{ all -> 0x01e1 }
            java.util.List r1 = r6.A0U(r3, r1, r8)     // Catch:{ all -> 0x01e1 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01e1 }
            r3.<init>()     // Catch:{ all -> 0x01e1 }
            X.12P r0 = r6.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x0165 }
            X.1M0 r8 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0165 }
            X.71s r13 = r8.B1k()     // Catch:{ all -> 0x015b }
            java.util.Iterator r12 = r1.iterator()     // Catch:{ all -> 0x0151 }
        L_0x00eb:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0151 }
            if (r0 == 0) goto L_0x0147
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0151 }
            X.9lY r10 = (X.C202319lY) r10     // Catch:{ all -> 0x0151 }
            X.8av r0 = r10.A0A     // Catch:{ all -> 0x0151 }
            if (r0 == 0) goto L_0x0103
            long r1 = r0.A09()     // Catch:{ all -> 0x0151 }
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x00eb
        L_0x0103:
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0151 }
            r9.<init>()     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x0151 }
            X.C24881Ed.A07(r1, r0)     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = "status"
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0151 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0151 }
            java.lang.String r11 = "timestamp"
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r14 / r0
            int r2 = (int) r0     // Catch:{ all -> 0x0151 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0151 }
            r9.put(r11, r0)     // Catch:{ all -> 0x0151 }
            X.1Dc r2 = r6.A04     // Catch:{ all -> 0x0151 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
            r1.<init>()     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = "expireOldPendingRequests key id:"
            r1.append(r0)     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = r10.A0L     // Catch:{ all -> 0x0151 }
            r1.append(r0)     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0151 }
            r2.A06(r0)     // Catch:{ all -> 0x0151 }
            X.C24881Ed.A00(r9, r8, r10)     // Catch:{ all -> 0x0151 }
            r3.add(r10)     // Catch:{ all -> 0x0151 }
            goto L_0x00eb
        L_0x0147:
            r13.A00()     // Catch:{ all -> 0x0151 }
            r13.close()     // Catch:{ all -> 0x015b }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0165 }
            goto L_0x016c
        L_0x0151:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0156 }
            goto L_0x015a
        L_0x0156:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x015b }
        L_0x015a:
            throw r1     // Catch:{ all -> 0x015b }
        L_0x015b:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0160 }
            goto L_0x0164
        L_0x0160:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0165 }
        L_0x0164:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0165 }
        L_0x0165:
            X.1Dc r1 = r6.A04     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "expirePendingMandateRequests failed."
            r1.A05(r0)     // Catch:{ all -> 0x01e1 }
        L_0x016c:
            monitor-exit(r6)     // Catch:{ all -> 0x01e4 }
            r7.addAll(r3)     // Catch:{ all -> 0x01e4 }
            java.util.Iterator r8 = r7.iterator()     // Catch:{ all -> 0x01e4 }
        L_0x0174:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x01df
            java.lang.Object r6 = r8.next()     // Catch:{ all -> 0x01e4 }
            X.9lY r6 = (X.C202319lY) r6     // Catch:{ all -> 0x01e4 }
            X.19w r2 = r4.A0C     // Catch:{ all -> 0x01e4 }
            X.11F r1 = r6.A0C     // Catch:{ all -> 0x01e4 }
            r0 = 1
            X.3Qa r3 = r2.A02(r1, r0)     // Catch:{ all -> 0x01e4 }
            X.0wo r0 = r4.A03     // Catch:{ all -> 0x01e4 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x01e4 }
            r2 = 44
            X.2cP r7 = new X.2cP     // Catch:{ all -> 0x01e4 }
            r7.<init>(r3, r2, r0)     // Catch:{ all -> 0x01e4 }
            com.whatsapp.jid.UserJid r0 = r6.A0D     // Catch:{ all -> 0x01e4 }
            r7.A01 = r0     // Catch:{ all -> 0x01e4 }
            com.whatsapp.jid.UserJid r0 = r6.A0E     // Catch:{ all -> 0x01e4 }
            r7.A00 = r0     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = r6.A0I     // Catch:{ all -> 0x01e4 }
            X.16X r0 = r6.A08     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = X.AnonymousClass1FR.A06(r0, r1)     // Catch:{ all -> 0x01e4 }
            r7.A03 = r0     // Catch:{ all -> 0x01e4 }
            X.11F r3 = r6.A0C     // Catch:{ all -> 0x01e4 }
            boolean r2 = r6.A0Q     // Catch:{ all -> 0x01e4 }
            java.lang.String r1 = r6.A0L     // Catch:{ all -> 0x01e4 }
            X.3Qa r0 = new X.3Qa     // Catch:{ all -> 0x01e4 }
            r0.<init>(r3, r1, r2)     // Catch:{ all -> 0x01e4 }
            r7.A02 = r0     // Catch:{ all -> 0x01e4 }
            X.3Qa r0 = r7.A1J     // Catch:{ all -> 0x01e4 }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x0174
            r2 = 16
            r5.A0Q(r7, r2)     // Catch:{ all -> 0x01e4 }
            X.005 r0 = r4.A0E     // Catch:{ all -> 0x01dd }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01dd }
            X.1VZ r0 = (X.AnonymousClass1VZ) r0     // Catch:{ all -> 0x01dd }
            X.3T1 r1 = r0.A00(r6)     // Catch:{ all -> 0x01dd }
            if (r1 == 0) goto L_0x0174
            r6.A02 = r2     // Catch:{ all -> 0x01dd }
            r1.A0M = r6     // Catch:{ all -> 0x01dd }
            X.1DQ r0 = r4.A06     // Catch:{ all -> 0x01dd }
            r0.A01(r1, r2)     // Catch:{ all -> 0x01dd }
            X.0xu r0 = r4.A05     // Catch:{ all -> 0x01dd }
            r0.A0K(r1)     // Catch:{ all -> 0x01dd }
            goto L_0x0174
        L_0x01dd:
            r0 = move-exception
            goto L_0x01e3
        L_0x01df:
            monitor-exit(r4)
            return
        L_0x01e1:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01e4 }
        L_0x01e3:
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x01e4:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FQ.A00():void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void BYy() {
        /*
            r22 = this;
            r4 = r22
            X.0wQ r0 = r4.A00
            r0.A0G()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0473
            X.1EV r1 = r4.A0G
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0473
            X.12P r0 = r4.A0F
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0473
            X.1EU r7 = r4.A09
            X.B66 r0 = r7.A05()
            X.B34 r1 = r0.BAG()
            if (r1 == 0) goto L_0x0030
            r0 = 0
            boolean r0 = r1.Bsv(r0)
            if (r0 == 0) goto L_0x00d0
        L_0x0030:
            X.1EZ r0 = r4.A08
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x00d0
            X.B66 r0 = r7.A05()
            X.9Ne r3 = r0.BFm()
            if (r3 == 0) goto L_0x00d0
            X.005 r0 = r4.A0D
            java.lang.Object r2 = r0.get()
            X.0xM r2 = (X.C20310xM) r2
            X.AnonymousClass1EU.A00(r7)
            X.1Ed r0 = r7.A05
            monitor-enter(r0)
            r1 = 1
            java.lang.String[] r12 = new java.lang.String[r1]     // Catch:{ all -> 0x046f }
            r5 = 0
            r1 = 102(0x66, float:1.43E-43)
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x046f }
            r12[r5] = r1     // Catch:{ all -> 0x046f }
            X.12P r1 = r0.A03     // Catch:{ IllegalStateException -> 0x00b4 }
            X.1M0 r1 = r1.get()     // Catch:{ IllegalStateException -> 0x00b4 }
            X.14e r8 = r1.A02     // Catch:{ all -> 0x00aa }
            java.lang.String r9 = "pay_transaction"
            java.lang.String[] r10 = X.C24881Ed.A0A     // Catch:{ all -> 0x00aa }
            java.lang.String r11 = "status=? AND metadata LIKE '%expiryTs%'"
            r13 = 0
            java.lang.String r14 = "timestamp ASC"
            java.lang.String r15 = "100"
            java.lang.String r16 = "readUnacceptedTransactions/QUERY_PAY_TRANSACTION"
            android.database.Cursor r10 = r8.A0A(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00aa }
            java.lang.String r5 = "readUnacceptedTransactions"
            java.util.ArrayList r9 = X.C24881Ed.A0B(r10, r0, r5)     // Catch:{ all -> 0x009e }
            X.1Dc r8 = r0.A04     // Catch:{ all -> 0x009e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r6.<init>()     // Catch:{ all -> 0x009e }
            java.lang.String r5 = "readUnacceptedTransactions returned: "
            r6.append(r5)     // Catch:{ all -> 0x009e }
            int r5 = r9.size()     // Catch:{ all -> 0x009e }
            r6.append(r5)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x009e }
            r8.A06(r5)     // Catch:{ all -> 0x009e }
            if (r10 == 0) goto L_0x009a
            r10.close()     // Catch:{ all -> 0x00aa }
        L_0x009a:
            r1.close()     // Catch:{ IllegalStateException -> 0x00b4 }
            goto L_0x00c1
        L_0x009e:
            r6 = move-exception
            if (r10 == 0) goto L_0x00a9
            r10.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch:{ all -> 0x00aa }
        L_0x00a9:
            throw r6     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r5 = move-exception
            r1.close()     // Catch:{ all -> 0x00af }
            goto L_0x00b3
        L_0x00af:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch:{ IllegalStateException -> 0x00b4 }
        L_0x00b3:
            throw r5     // Catch:{ IllegalStateException -> 0x00b4 }
        L_0x00b4:
            r6 = move-exception
            X.1Dc r5 = r0.A04     // Catch:{ all -> 0x046f }
            java.lang.String r1 = "readUnacceptedTransactions/IllegalStateException "
            r5.A0A(r1, r6)     // Catch:{ all -> 0x046f }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x046f }
            r9.<init>()     // Catch:{ all -> 0x046f }
        L_0x00c1:
            monitor-exit(r0)
            int r0 = r9.size()
            if (r0 != 0) goto L_0x00db
            X.1Dc r2 = r4.A0A
            java.lang.String r1 = "sendAcceptPaymentReminderNotificationsIfNeeded skipped. No pending transaction with expiry timestamp."
            r0 = 0
            X.C24611Dc.A02(r2, r0, r1)
        L_0x00d0:
            r4.A00()
            X.AnonymousClass1EU.A00(r7)
            X.1Ed r0 = r7.A05
            monitor-enter(r0)
            goto L_0x02ff
        L_0x00db:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r18 = r9.iterator()
        L_0x00e4:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x02e9
            java.lang.Object r9 = r18.next()
            X.9lY r9 = (X.C202319lY) r9
            X.8av r0 = r9.A0A
            if (r0 == 0) goto L_0x02e5
            long r0 = r0.A09()
            java.lang.String r6 = java.lang.String.valueOf(r0)
        L_0x00fc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "PAY: BrazilPaymentStatusNotificationHelper/buildPaymentReminders - transaction transferred at: "
            r5.append(r0)
            long r0 = r9.A05
            r5.append(r0)
            java.lang.String r0 = ", expired at: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FR r12 = r3.A05
            java.lang.Long r17 = r12.A0L(r9)
            if (r17 == 0) goto L_0x0172
            java.lang.String r6 = r9.A0L
            long r13 = r17.longValue()
            r10 = 0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x02cd
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x02cd
            org.json.JSONObject r1 = r3.A00
            if (r1 != 0) goto L_0x0156
            X.1Db r0 = r3.A04
            android.content.SharedPreferences r5 = r0.A03()
            java.lang.String r1 = "payments_nagged_transactions"
            java.lang.String r0 = ""
            java.lang.String r0 = r5.getString(r1, r0)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x014f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x014f }
            r3.A00 = r1     // Catch:{ Exception -> 0x014f }
            goto L_0x0156
        L_0x014f:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r3.A00 = r1
        L_0x0156:
            boolean r0 = r1.optBoolean(r6)
            if (r0 != 0) goto L_0x02cd
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.util.Calendar r1 = java.util.Calendar.getInstance(r0)
            r0 = 11
            int r1 = r1.get(r0)
            r0 = 9
            if (r1 < r0) goto L_0x02cd
            r0 = 21
            if (r1 >= r0) goto L_0x02cd
        L_0x0172:
            com.whatsapp.jid.UserJid r5 = r9.A0E
            if (r5 == 0) goto L_0x00e4
            X.171 r1 = r3.A02
            X.16D r0 = r3.A01
            X.141 r0 = r0.A0D(r5)
            java.lang.String r11 = r1.A0H(r0)
            X.19w r5 = r3.A06
            X.11F r1 = r9.A0C
            r0 = 1
            X.3Qa r5 = r5.A02(r1, r0)
            X.0wo r0 = r3.A03
            long r0 = X.C19970wo.A00(r0)
            X.8ng r10 = new X.8ng
            r10.<init>(r5, r0)
            r1 = 3
            java.lang.Comparable[] r6 = new java.lang.Comparable[r1]
            r5 = 0
            com.whatsapp.jid.UserJid r0 = r9.A0E
            r6[r5] = r0
            r5 = 1
            java.lang.String r0 = r9.A0I
            r6[r5] = r0
            r14 = 2
            X.16X r0 = r9.A08
            java.lang.String r5 = ""
            r13 = r5
            if (r0 != 0) goto L_0x0287
            r0 = r5
        L_0x01ac:
            r6[r14] = r0
            java.util.List r1 = java.util.Arrays.asList(r6)
            java.lang.String r0 = ";"
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            r10.A02 = r0
            java.lang.String r1 = r9.A0I
            X.16X r0 = r9.A08
            java.lang.String r0 = X.AnonymousClass1FR.A06(r0, r1)
            r10.A03 = r0
            X.16X r0 = r9.A08
            if (r0 == 0) goto L_0x01d2
            java.math.BigDecimal r0 = r0.A00
            int r0 = r0.intValue()
            java.lang.String r5 = java.lang.String.valueOf(r0)
        L_0x01d2:
            r10.A01 = r5
            long r5 = r9.A05
            X.0wo r0 = r12.A03
            long r0 = X.C19970wo.A00(r0)
            int r0 = X.AnonymousClass6XI.A00(r0, r5)
            if (r0 != 0) goto L_0x0215
            X.0ts r1 = r12.A05
            r0 = 272(0x110, float:3.81E-43)
            java.lang.String r0 = r1.A0A(r0)
        L_0x01ea:
            r10.A04 = r0
            r10.A03 = r11
            X.11F r5 = r9.A0C
            boolean r1 = r9.A0Q
            java.lang.String r6 = r9.A0L
            X.3Qa r0 = new X.3Qa
            r0.<init>(r5, r6, r1)
            r10.A02 = r0
            if (r17 == 0) goto L_0x02c8
            int r0 = r17.intValue()
            r10.A00 = r0
            org.json.JSONObject r5 = r3.A00
            if (r5 != 0) goto L_0x02a6
            X.1Db r0 = r3.A04
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payments_nagged_transactions"
            java.lang.String r0 = r1.getString(r0, r13)
            goto L_0x0297
        L_0x0215:
            r1 = 1
            if (r0 != r1) goto L_0x0221
            X.0ts r1 = r12.A05
            r0 = 298(0x12a, float:4.18E-43)
            java.lang.String r0 = r1.A0A(r0)
            goto L_0x01ea
        L_0x0221:
            r14 = 7
            if (r0 >= r14) goto L_0x0232
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r5)
            int r0 = r0.get(r14)
            switch(r0) {
                case 1: goto L_0x027a;
                case 2: goto L_0x0272;
                case 3: goto L_0x026a;
                case 4: goto L_0x0262;
                case 5: goto L_0x025a;
                case 6: goto L_0x0252;
                case 7: goto L_0x024a;
                default: goto L_0x0232;
            }
        L_0x0232:
            X.0wG r0 = r12.A04
            android.content.Context r15 = r0.A00
            r14 = 2131895063(0x7f122317, float:1.9424948E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r16 = 0
            X.0ts r0 = r12.A05
            java.lang.String r0 = X.C20040wv.A03(r0, r5)
            r1[r16] = r0
            java.lang.String r0 = r15.getString(r14, r1)
            goto L_0x01ea
        L_0x024a:
            X.0wG r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131895066(0x7f12231a, float:1.9424955E38)
            goto L_0x0281
        L_0x0252:
            X.0wG r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131895064(0x7f122318, float:1.942495E38)
            goto L_0x0281
        L_0x025a:
            X.0wG r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131895068(0x7f12231c, float:1.9424959E38)
            goto L_0x0281
        L_0x0262:
            X.0wG r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131895070(0x7f12231e, float:1.9424963E38)
            goto L_0x0281
        L_0x026a:
            X.0wG r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131895069(0x7f12231d, float:1.942496E38)
            goto L_0x0281
        L_0x0272:
            X.0wG r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131895065(0x7f122319, float:1.9424952E38)
            goto L_0x0281
        L_0x027a:
            X.0wG r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131895067(0x7f12231b, float:1.9424957E38)
        L_0x0281:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x01ea
        L_0x0287:
            java.math.BigDecimal r0 = r0.A00
            java.math.BigDecimal r0 = r0.scaleByPowerOfTen(r1)
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01ac
        L_0x0297:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x029f }
            r5.<init>(r0)     // Catch:{ Exception -> 0x029f }
            r3.A00 = r5     // Catch:{ Exception -> 0x029f }
            goto L_0x02a6
        L_0x029f:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r3.A00 = r5
        L_0x02a6:
            r0 = 1
            r5.put(r6, r0)     // Catch:{ Exception -> 0x02ab }
            goto L_0x02b1
        L_0x02ab:
            r1 = move-exception
            java.lang.String r0 = "BrazilPaymentStatusNotificationHelper/setNaggedTransaction/error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02b1:
            X.1Db r0 = r3.A04
            java.lang.String r5 = r5.toString()
            android.content.SharedPreferences r0 = r0.A03()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payments_nagged_transactions"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r5)
            r0.apply()
        L_0x02c8:
            r8.add(r10)
            goto L_0x00e4
        L_0x02cd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PAY: BrazilPaymentStatusNotificationHelper/buildPaymentReminders - transaction skipped: "
            r1.append(r0)
            java.lang.String r0 = r9.A0L
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00e4
        L_0x02e5:
            java.lang.String r6 = "EMPTY"
            goto L_0x00fc
        L_0x02e9:
            java.util.Iterator r3 = r8.iterator()
        L_0x02ed:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r1 = r3.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            r0 = 16
            r2.A0Q(r1, r0)
            goto L_0x02ed
        L_0x02ff:
            X.0wo r1 = r0.A01     // Catch:{ all -> 0x046f }
            long r11 = X.C19970wo.A00(r1)     // Catch:{ all -> 0x046f }
            monitor-enter(r0)     // Catch:{ all -> 0x046f }
            monitor-enter(r0)     // Catch:{ all -> 0x046c }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0469 }
            r1 = 8
            java.lang.String r6 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0469 }
            r1 = 0
            r3[r1] = r6     // Catch:{ all -> 0x0469 }
            r1 = 602(0x25a, float:8.44E-43)
            java.lang.String r2 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0469 }
            r1 = 1
            r3[r1] = r2     // Catch:{ all -> 0x0469 }
            java.lang.String r5 = "(type=? AND status=?)"
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0469 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0469 }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0469 }
            r1 = 0
            r3[r1] = r6     // Catch:{ all -> 0x0469 }
            r1 = 608(0x260, float:8.52E-43)
            java.lang.String r2 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0469 }
            r1 = 1
            r3[r1] = r2     // Catch:{ all -> 0x0469 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x0469 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0469 }
            java.lang.String r1 = "OR"
            android.util.Pair r4 = X.C24881Ed.A04(r4, r2, r1)     // Catch:{ all -> 0x0469 }
            r1 = 0
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0469 }
            r2 = 0
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0469 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0469 }
            java.lang.Object r3 = r1.second     // Catch:{ all -> 0x0469 }
            java.lang.Object r1 = r1.first     // Catch:{ all -> 0x0469 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x0469 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0469 }
            java.lang.String r1 = "AND"
            android.util.Pair r1 = X.C24881Ed.A04(r4, r2, r1)     // Catch:{ all -> 0x0469 }
            java.lang.Object r4 = r1.first     // Catch:{ all -> 0x0469 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0469 }
            java.lang.Object r2 = r1.second     // Catch:{ all -> 0x0469 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x0469 }
            java.lang.String r20 = ""
            X.12P r1 = r0.A03     // Catch:{ IllegalStateException -> 0x03b9 }
            X.1M0 r3 = r1.get()     // Catch:{ IllegalStateException -> 0x03b9 }
            X.14e r13 = r3.A02     // Catch:{ all -> 0x03af }
            java.lang.String r14 = "pay_transaction"
            java.lang.String[] r15 = X.C24881Ed.A0A     // Catch:{ all -> 0x03af }
            r5 = 0
            java.lang.String r19 = "init_timestamp DESC"
            java.lang.String r21 = "readPendingAndActiveWithdrawalsV2/QUERY_PAY_TRANSACTION"
            r16 = r4
            r17 = r2
            r18 = r5
            android.database.Cursor r7 = r13.A0A(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x03af }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2"
            java.util.ArrayList r6 = X.C24881Ed.A0B(r7, r0, r1)     // Catch:{ all -> 0x03a3 }
            X.1Dc r4 = r0.A04     // Catch:{ all -> 0x03a3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a3 }
            r2.<init>()     // Catch:{ all -> 0x03a3 }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2 returned: "
            r2.append(r1)     // Catch:{ all -> 0x03a3 }
            int r1 = r6.size()     // Catch:{ all -> 0x03a3 }
            r2.append(r1)     // Catch:{ all -> 0x03a3 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x03a3 }
            X.C24611Dc.A02(r4, r5, r1)     // Catch:{ all -> 0x03a3 }
            if (r7 == 0) goto L_0x039f
            r7.close()     // Catch:{ all -> 0x03af }
        L_0x039f:
            r3.close()     // Catch:{ IllegalStateException -> 0x03b9 }
            goto L_0x03c6
        L_0x03a3:
            r2 = move-exception
            if (r7 == 0) goto L_0x03ae
            r7.close()     // Catch:{ all -> 0x03aa }
            goto L_0x03ae
        L_0x03aa:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x03af }
        L_0x03ae:
            throw r2     // Catch:{ all -> 0x03af }
        L_0x03af:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x03b4 }
            goto L_0x03b8
        L_0x03b4:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IllegalStateException -> 0x03b9 }
        L_0x03b8:
            throw r2     // Catch:{ IllegalStateException -> 0x03b9 }
        L_0x03b9:
            r2 = move-exception
            X.1Dc r4 = r0.A04     // Catch:{ all -> 0x0469 }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2/IllegalStateException "
            r4.A0A(r1, r2)     // Catch:{ all -> 0x0469 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0469 }
            r6.<init>()     // Catch:{ all -> 0x0469 }
        L_0x03c6:
            monitor-exit(r0)     // Catch:{ all -> 0x046c }
            monitor-exit(r0)     // Catch:{ all -> 0x046f }
            X.12P r1 = r0.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x0463 }
            X.1M0 r5 = r1.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0463 }
            X.71s r10 = r5.B1k()     // Catch:{ all -> 0x0459 }
            java.util.Iterator r9 = r6.iterator()     // Catch:{ all -> 0x044f }
        L_0x03d6:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x044f }
            if (r1 == 0) goto L_0x0445
            java.lang.Object r6 = r9.next()     // Catch:{ all -> 0x044f }
            X.9lY r6 = (X.C202319lY) r6     // Catch:{ all -> 0x044f }
            X.8av r1 = r6.A0A     // Catch:{ all -> 0x044f }
            if (r1 == 0) goto L_0x03f4
            long r7 = r1.A09()     // Catch:{ all -> 0x044f }
            r2 = 0
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x03d6
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x03d6
        L_0x03f4:
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x044f }
            r14.<init>()     // Catch:{ all -> 0x044f }
            java.lang.String r2 = r6.A0L     // Catch:{ all -> 0x044f }
            java.lang.String r1 = r6.A0K     // Catch:{ all -> 0x044f }
            X.C24881Ed.A07(r2, r1)     // Catch:{ all -> 0x044f }
            java.lang.String r2 = "status"
            r1 = 607(0x25f, float:8.5E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x044f }
            r14.put(r2, r1)     // Catch:{ all -> 0x044f }
            java.lang.String r7 = "timestamp"
            r1 = 1000(0x3e8, double:4.94E-321)
            long r2 = r11 / r1
            int r1 = (int) r2     // Catch:{ all -> 0x044f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x044f }
            r14.put(r7, r1)     // Catch:{ all -> 0x044f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x044f }
            r2.<init>()     // Catch:{ all -> 0x044f }
            java.lang.String r1 = "expireOldWithdrawals key id:"
            r2.append(r1)     // Catch:{ all -> 0x044f }
            java.lang.String r1 = r6.A0K     // Catch:{ all -> 0x044f }
            r2.append(r1)     // Catch:{ all -> 0x044f }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x044f }
            r4.A06(r1)     // Catch:{ all -> 0x044f }
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x044f }
            java.lang.String r2 = r6.A0K     // Catch:{ all -> 0x044f }
            r1 = 0
            r3[r1] = r2     // Catch:{ all -> 0x044f }
            X.14e r13 = r5.A02     // Catch:{ all -> 0x044f }
            java.lang.String r15 = "pay_transaction"
            java.lang.String r16 = "id=?"
            java.lang.String r17 = "expireOldWithdrawalsV2/UPDATE_PAY_TRANSACTION"
            r18 = r3
            r13.A01(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x044f }
            goto L_0x03d6
        L_0x0445:
            r10.A00()     // Catch:{ all -> 0x044f }
            r10.close()     // Catch:{ all -> 0x0459 }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0463 }
            goto L_0x0472
        L_0x044f:
            r2 = move-exception
            r10.close()     // Catch:{ all -> 0x0454 }
            goto L_0x0458
        L_0x0454:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0459 }
        L_0x0458:
            throw r2     // Catch:{ all -> 0x0459 }
        L_0x0459:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x045e }
            goto L_0x0462
        L_0x045e:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0463 }
        L_0x0462:
            throw r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x0463 }
        L_0x0463:
            java.lang.String r1 = "expireOldWithdrawals failed."
            r4.A05(r1)     // Catch:{ all -> 0x046f }
            goto L_0x0472
        L_0x0469:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x046c }
            throw r1     // Catch:{ all -> 0x046c }
        L_0x046c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x046f }
            throw r1     // Catch:{ all -> 0x046f }
        L_0x046f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0472:
            monitor-exit(r0)
        L_0x0473:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FQ.BYy():void");
    }

    public AnonymousClass1FQ(C19730wQ r4, AnonymousClass16D r5, AnonymousClass171 r6, C19970wo r7, C19630wG r8, C20650xu r9, AnonymousClass1DQ r10, C24541Cv r11, AnonymousClass12P r12, AnonymousClass1EZ r13, AnonymousClass1EV r14, AnonymousClass1EU r15, AnonymousClass1FR r16, C237919w r17, AnonymousClass005 r18, AnonymousClass005 r19) {
        this.A04 = r8;
        this.A03 = r7;
        this.A00 = r4;
        this.A0B = r16;
        this.A01 = r5;
        this.A02 = r6;
        this.A06 = r10;
        this.A09 = r15;
        this.A05 = r9;
        this.A07 = r11;
        this.A0C = r17;
        this.A0F = r12;
        this.A08 = r13;
        this.A0G = r14;
        this.A0E = r18;
        this.A0D = r19;
    }
}
