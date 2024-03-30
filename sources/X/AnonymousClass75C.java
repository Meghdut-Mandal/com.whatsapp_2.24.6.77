package X;

import java.util.List;

/* renamed from: X.75C  reason: invalid class name */
public class AnonymousClass75C implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass75C(C97484pl r1, AnonymousClass75A r2, int i) {
        this.A02 = i;
        if (18 - i != 0) {
            this.A00 = r2;
            this.A01 = r1;
            return;
        }
        this.A00 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0187, code lost:
        if (r20 != false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0189, code lost:
        r2 = r7.A0D();
        r1 = r2.BJI(r10).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0199, code lost:
        if (r1.hasNext() == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019b, code lost:
        r2.B5B(((X.AnonymousClass69M) r1.next()).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a7, code lost:
        r21 = false;
        r20 = false;
        r5 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.AnonymousClass6WE r24) {
        /*
            r9 = r24
            java.util.List r0 = r9.A06
            r23 = 0
            if (r0 == 0) goto L_0x0045
            java.util.Iterator r4 = r0.iterator()
        L_0x000c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r1 = r4.next()
            X.6WE r1 = (X.AnonymousClass6WE) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0023
            boolean r0 = A00(r1)
            r23 = r23 | r0
            goto L_0x000c
        L_0x0023:
            X.AnonymousClass6VD.A00()
            java.lang.String r3 = X.C112565e6.A00
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Already enqueued work ids ("
            r2.append(r0)
            java.util.List r1 = r1.A05
            java.lang.String r0 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            X.AnonymousClass000.A1A(r2, r3)
            goto L_0x000c
        L_0x0045:
            java.util.HashSet r1 = X.AnonymousClass6WE.A00(r9)
            X.6VR r8 = r9.A02
            java.util.List r0 = r9.A07
            r24 = r0
            r0 = 0
            java.lang.String[] r6 = X.C36371kC.A1b(r1, r0)
            java.lang.String r10 = r9.A04
            java.lang.Integer r11 = r9.A03
            long r3 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r7 = r8.A04
            r12 = 0
            if (r6 == 0) goto L_0x00b5
            int r5 = r6.length
            if (r5 <= 0) goto L_0x00b5
            r15 = 1
            r2 = 0
            r22 = 1
            r21 = 0
            r20 = 0
        L_0x006c:
            r13 = r6[r2]
            X.7lt r0 = r7.A0D()
            X.6QA r0 = r0.BJH(r13)
            if (r0 != 0) goto L_0x0099
            X.AnonymousClass6VD.A00()
            java.lang.String r2 = X.C112565e6.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Prerequisite "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " doesn't exist; not enqueuing"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            android.util.Log.e(r2, r0)
        L_0x0092:
            r14 = 0
        L_0x0093:
            r0 = 1
            r9.A00 = r0
            r14 = r14 | r23
            return r14
        L_0x0099:
            java.lang.Integer r1 = r0.A0E
            java.lang.Integer r0 = X.C023109s.A0C
            boolean r0 = X.C36361kB.A1a(r1, r0)
            r22 = r22 & r0
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 != r0) goto L_0x00ae
            r20 = 1
        L_0x00a9:
            int r2 = r2 + 1
            if (r2 >= r5) goto L_0x00bc
            goto L_0x006c
        L_0x00ae:
            java.lang.Integer r0 = X.C023109s.A0S
            if (r1 != r0) goto L_0x00a9
            r21 = 1
            goto L_0x00a9
        L_0x00b5:
            r15 = 0
            r22 = 1
            r21 = 0
            r20 = 0
        L_0x00bc:
            boolean r19 = X.C36421kH.A1a(r10)
            if (r19 == 0) goto L_0x01ba
            if (r15 != 0) goto L_0x01ba
            X.7lt r0 = r7.A0D()
            java.util.ArrayList r14 = r0.BJI(r10)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x01ba
            java.lang.Integer r13 = X.C023109s.A0C
            if (r11 == r13) goto L_0x011c
            java.lang.Integer r0 = X.C023109s.A0G
            if (r11 == r0) goto L_0x011c
            java.lang.Integer r5 = X.C023109s.A01
            if (r11 != r5) goto L_0x00f7
            java.util.Iterator r2 = r14.iterator()
        L_0x00e2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r0 = r2.next()
            X.69M r0 = (X.AnonymousClass69M) r0
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 == r0) goto L_0x0092
            if (r1 != r5) goto L_0x00e2
            goto L_0x0092
        L_0x00f7:
            X.4pk r0 = new X.4pk
            r0.<init>(r8, r10, r12)
            r0.run()
            X.7lt r2 = r7.A0D()
            java.util.Iterator r1 = r14.iterator()
        L_0x0107:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r0 = r1.next()
            X.69M r0 = (X.AnonymousClass69M) r0
            java.lang.String r0 = r0.A01
            r2.B5B(r0)
            goto L_0x0107
        L_0x0119:
            r14 = 1
            goto L_0x01bb
        L_0x011c:
            X.7e9 r18 = r7.A08()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r17 = r14.iterator()
        L_0x0128:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0181
            java.lang.Object r15 = r17.next()
            X.69M r15 = (X.AnonymousClass69M) r15
            java.lang.String r12 = r15.A01
            r1 = r18
            X.6ir r1 = (X.C138886ir) r1
            java.lang.String r2 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r14 = 1
            java.util.TreeMap r0 = X.C138686iW.A08
            X.6iW r2 = X.C109355Xg.A00(r2, r14)
            r2.B1q(r14, r12)
            X.6Q8 r1 = r1.A01
            r1.A05()
            r0 = 0
            android.database.Cursor r1 = X.C109365Xh.A00(r1, r2, r0)
            boolean r16 = r1.moveToFirst()     // Catch:{ all -> 0x026f }
            if (r16 == 0) goto L_0x015e
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x026f }
            if (r0 != 0) goto L_0x015d
            r14 = 0
        L_0x015d:
            r0 = r14
        L_0x015e:
            r1.close()
            r2.A00()
            if (r0 != 0) goto L_0x0128
            java.lang.Integer r2 = r15.A00
            boolean r1 = X.C36361kB.A1a(r2, r13)
            r1 = r1 & r22
            java.lang.Integer r0 = X.C023109s.A0G
            if (r2 != r0) goto L_0x017a
            r20 = 1
        L_0x0174:
            r5.add(r12)
            r22 = r1
            goto L_0x0128
        L_0x017a:
            java.lang.Integer r0 = X.C023109s.A0S
            if (r2 != r0) goto L_0x0174
            r21 = 1
            goto L_0x0174
        L_0x0181:
            java.lang.Integer r0 = X.C023109s.A0G
            if (r11 != r0) goto L_0x01af
            if (r21 != 0) goto L_0x0189
            if (r20 == 0) goto L_0x01af
        L_0x0189:
            X.7lt r2 = r7.A0D()
            java.util.ArrayList r0 = r2.BJI(r10)
            java.util.Iterator r1 = r0.iterator()
        L_0x0195:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r0 = r1.next()
            X.69M r0 = (X.AnonymousClass69M) r0
            java.lang.String r0 = r0.A01
            r2.B5B(r0)
            goto L_0x0195
        L_0x01a7:
            java.util.List r5 = java.util.Collections.emptyList()
            r21 = 0
            r20 = 0
        L_0x01af:
            java.lang.Object[] r6 = r5.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            int r0 = r6.length
            boolean r15 = X.AnonymousClass000.A1R(r0)
        L_0x01ba:
            r14 = 0
        L_0x01bb:
            java.util.Iterator r13 = r24.iterator()
        L_0x01bf:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r11 = r13.next()
            X.5s0 r11 = (X.C120745s0) r11
            X.6QA r5 = r11.A00
            if (r15 == 0) goto L_0x026b
            if (r22 != 0) goto L_0x026b
            if (r20 == 0) goto L_0x0261
            java.lang.Integer r0 = X.C023109s.A0G
        L_0x01d5:
            r5.A0E = r0
        L_0x01d7:
            java.lang.Integer r1 = r5.A0E
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x01de
            r14 = 1
        L_0x01de:
            X.7lt r2 = r7.A0D()
            java.util.List r0 = r8.A07
            X.6QA r1 = X.C109465Xr.A00(r5, r0)
            X.6iw r2 = (X.C138936iw) r2
            X.6Q8 r5 = r2.A02
            r5.A05()
            r5.A06()
            X.4oV r0 = r2.A00     // Catch:{ all -> 0x0277 }
            r0.A04(r1)     // Catch:{ all -> 0x0277 }
            r5.A07()     // Catch:{ all -> 0x0277 }
            X.AnonymousClass6Q8.A01(r5)
            if (r15 == 0) goto L_0x022c
            int r12 = r6.length
            r2 = 0
        L_0x0201:
            if (r2 >= r12) goto L_0x022c
            r5 = r6[r2]
            java.util.UUID r0 = r11.A02
            java.lang.String r0 = X.C36381kD.A0y(r0)
            X.5nt r1 = new X.5nt
            r1.<init>(r0, r5)
            X.7e9 r0 = r7.A08()
            X.6ir r0 = (X.C138886ir) r0
            X.6Q8 r5 = r0.A01
            r5.A05()
            r5.A06()
            X.4oV r0 = r0.A00     // Catch:{ all -> 0x0277 }
            r0.A04(r1)     // Catch:{ all -> 0x0277 }
            r5.A07()     // Catch:{ all -> 0x0277 }
            X.AnonymousClass6Q8.A01(r5)
            int r2 = r2 + 1
            goto L_0x0201
        L_0x022c:
            X.7iY r2 = r7.A0E()
            java.util.UUID r5 = r11.A02
            java.lang.String r1 = X.C36381kD.A0y(r5)
            java.util.Set r0 = r11.A01
            r2.BKl(r1, r0)
            if (r19 == 0) goto L_0x01bf
            X.7bv r2 = r7.A0B()
            java.lang.String r0 = X.C36381kD.A0y(r5)
            X.5nu r1 = new X.5nu
            r1.<init>(r10, r0)
            X.6iu r2 = (X.C138916iu) r2
            X.6Q8 r5 = r2.A01
            r5.A05()
            r5.A06()
            X.4oV r0 = r2.A00     // Catch:{ all -> 0x0277 }
            r0.A04(r1)     // Catch:{ all -> 0x0277 }
            r5.A07()     // Catch:{ all -> 0x0277 }
            X.AnonymousClass6Q8.A01(r5)
            goto L_0x01bf
        L_0x0261:
            if (r21 == 0) goto L_0x0267
            java.lang.Integer r0 = X.C023109s.A0S
            goto L_0x01d5
        L_0x0267:
            java.lang.Integer r0 = X.C023109s.A0R
            goto L_0x01d5
        L_0x026b:
            r5.A06 = r3
            goto L_0x01d7
        L_0x026f:
            r0 = move-exception
            r1.close()
            r2.A00()
            throw r0
        L_0x0277:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75C.A00(X.6WE):boolean");
    }

    public static boolean A01(Object obj) {
        if (!(obj instanceof AnonymousClass75C) || ((AnonymousClass75C) obj).A02 != 21) {
            return false;
        }
        return true;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
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
    public void run() {
        /*
            r22 = this;
            r3 = r22
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x01e0;
                case 1: goto L_0x01f6;
                case 2: goto L_0x01fd;
                case 3: goto L_0x0209;
                case 4: goto L_0x0226;
                case 5: goto L_0x023a;
                case 6: goto L_0x0433;
                case 7: goto L_0x05f7;
                case 8: goto L_0x062b;
                case 9: goto L_0x0622;
                case 10: goto L_0x063b;
                case 11: goto L_0x0654;
                case 12: goto L_0x0014;
                case 13: goto L_0x0029;
                case 14: goto L_0x0661;
                case 15: goto L_0x0037;
                case 16: goto L_0x0689;
                case 17: goto L_0x06e9;
                case 18: goto L_0x070d;
                case 19: goto L_0x005f;
                case 20: goto L_0x0730;
                case 21: goto L_0x006f;
                case 22: goto L_0x0786;
                case 23: goto L_0x07ac;
                case 24: goto L_0x07b8;
                case 25: goto L_0x008b;
                case 26: goto L_0x0008;
                case 27: goto L_0x07e7;
                case 28: goto L_0x0007;
                case 29: goto L_0x07fd;
                case 30: goto L_0x0007;
                case 31: goto L_0x00af;
                case 32: goto L_0x0802;
                case 33: goto L_0x0812;
                case 34: goto L_0x0822;
                case 35: goto L_0x0832;
                case 36: goto L_0x0007;
                case 37: goto L_0x07fd;
                case 38: goto L_0x084d;
                case 39: goto L_0x0166;
                case 40: goto L_0x085c;
                case 41: goto L_0x019c;
                case 42: goto L_0x0883;
                case 43: goto L_0x0890;
                case 44: goto L_0x0007;
                case 45: goto L_0x0934;
                case 46: goto L_0x0975;
                case 47: goto L_0x01ae;
                case 48: goto L_0x01cb;
                case 49: goto L_0x0981;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r5 = r3.A00
            X.7ku r5 = (X.C160377ku) r5
            X.6MO r4 = X.AnonymousClass6MO.A01
            java.lang.Object r0 = r3.A01
            X.4vP r0 = (X.C100674vP) r0
            goto L_0x00ab
        L_0x0014:
            java.lang.Object r0 = r3.A00
            X.758 r0 = (X.AnonymousClass758) r0
            java.lang.Object r1 = r3.A01
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            X.4pl r0 = r0.A0F
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x0007
            r0 = 1
            r1.cancel(r0)
            return
        L_0x0029:
            java.lang.Object r5 = r3.A00
            X.758 r5 = (X.AnonymousClass758) r5
            X.4pl r4 = r5.A0F
            boolean r0 = r4.isCancelled()
            if (r0 != 0) goto L_0x0007
            goto L_0x09a3
        L_0x0037:
            java.lang.Object r1 = r3.A00
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r3.A01
            X.9YC r4 = (X.AnonymousClass9YC) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x0047:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r2 = r3.next()
            X.7bs r2 = (X.C157127bs) r2
            java.lang.Object r1 = r4.A00
            X.9xq r2 = (X.C208199xq) r2
            r2.A01 = r1
            X.Avg r0 = r2.A00
            X.C208199xq.A00(r0, r2, r1)
            goto L_0x0047
        L_0x005f:
            java.lang.Object r5 = r3.A00
            X.75A r5 = (X.AnonymousClass75A) r5
            java.lang.Object r2 = r5.A02
            X.A6T r2 = (X.A6T) r2
            boolean r0 = r2.isCancelled()
            if (r0 != 0) goto L_0x0007
            goto L_0x09cf
        L_0x006f:
            java.lang.Object r2 = r3.A01
            X.A6T r2 = (X.A6T) r2
            java.lang.Object r0 = r2.value
            if (r0 != r3) goto L_0x0007
            java.lang.Object r0 = r3.A00
            X.0sD r0 = (X.C17880sD) r0
            java.lang.Object r1 = X.A6T.A00(r0)
            X.9Y4 r0 = X.A6T.A01
            boolean r0 = r0.A02(r2, r3, r1)
            if (r0 == 0) goto L_0x0007
            X.A6T.A03(r2)
            return
        L_0x008b:
            java.lang.Object r2 = r3.A01
            X.4vP r2 = (X.C100674vP) r2
            boolean r0 = X.C132926Vv.A03()
            if (r0 == 0) goto L_0x0007
            java.lang.ref.WeakReference r0 = r2.A07
            java.lang.Object r1 = r0.get()
            X.67i r1 = (X.C1271967i) r1
            if (r1 == 0) goto L_0x0007
            java.lang.Object r5 = r3.A00
            X.7ku r5 = (X.C160377ku) r5
            X.6MO r4 = X.AnonymousClass6MO.A01
            java.util.List r0 = r2.A06
            X.4vP r0 = X.C100674vP.A00(r1, r5, r0)
        L_0x00ab:
            X.AnonymousClass6JI.A00(r0, r4, r5)
            return
        L_0x00af:
            java.lang.Object r4 = r3.A00
            X.6S3 r4 = (X.AnonymousClass6S3) r4
            java.util.concurrent.ConcurrentLinkedQueue r7 = r4.A01
            java.util.Iterator r10 = r7.iterator()
        L_0x00b9:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r8 = r10.next()
            X.5xX r8 = (X.C124065xX) r8
            r5 = 0
            r6 = 1
            boolean r0 = r8.A05     // Catch:{ Exception -> 0x0136 }
            if (r0 == 0) goto L_0x0112
            X.6V0 r3 = r4.A02     // Catch:{ IllegalStateException -> 0x00d9 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x00d9 }
            r3.A02 = r0     // Catch:{ IllegalStateException -> 0x00d9 }
            X.B3l r9 = r8.A00     // Catch:{ IllegalStateException -> 0x00d9 }
            r9.reset()     // Catch:{ IllegalStateException -> 0x00d9 }
            goto L_0x00e2
        L_0x00d9:
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x010a }
            X.B3l r9 = r8.A00     // Catch:{ all -> 0x010a }
            X.AnonymousClass6S3.A01(r9, r4, r0)     // Catch:{ all -> 0x010a }
            X.6V0 r3 = r4.A02     // Catch:{ Exception -> 0x0136 }
        L_0x00e2:
            r0 = -1
            r3.A02 = r0     // Catch:{ Exception -> 0x0136 }
            boolean r0 = r8.A03     // Catch:{ Exception -> 0x0136 }
            if (r0 == 0) goto L_0x0128
            java.util.Map r2 = r3.A03     // Catch:{ Exception -> 0x0136 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0136 }
            java.util.Map r1 = r3.A03     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0107 }
            java.util.Set r1 = X.C90524aI.A0r(r0, r1)     // Catch:{ all -> 0x0107 }
            monitor-exit(r2)     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x0128
            monitor-enter(r1)     // Catch:{ Exception -> 0x0136 }
            r1.add(r9)     // Catch:{ all -> 0x0104 }
            int r0 = r3.A00     // Catch:{ all -> 0x0104 }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x0104 }
            monitor-exit(r1)     // Catch:{ all -> 0x0104 }
            goto L_0x0128
        L_0x0104:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0104 }
            goto L_0x0135
        L_0x0107:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0107 }
            goto L_0x0135
        L_0x010a:
            r3 = move-exception
            X.6V0 r2 = r4.A02     // Catch:{ Exception -> 0x0136 }
            r0 = -1
            r2.A02 = r0     // Catch:{ Exception -> 0x0136 }
            throw r3     // Catch:{ Exception -> 0x0136 }
        L_0x0112:
            X.5zM r3 = r8.A01     // Catch:{ Exception -> 0x0136 }
            boolean r2 = r8.A04     // Catch:{ Exception -> 0x0136 }
            X.B3l r1 = r8.A00     // Catch:{ Exception -> 0x0136 }
            boolean r0 = r3.A0P     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x0122
            if (r2 != 0) goto L_0x0125
            boolean r0 = r3.A0O     // Catch:{ all -> 0x0131 }
            if (r0 != 0) goto L_0x0125
        L_0x0122:
            r1.stop()     // Catch:{ all -> 0x0131 }
        L_0x0125:
            r1.release()     // Catch:{ Exception -> 0x0136 }
        L_0x0128:
            monitor-enter(r7)     // Catch:{ Exception -> 0x0153 }
            r7.remove(r8)     // Catch:{ all -> 0x012e }
            monitor-exit(r7)     // Catch:{ all -> 0x012e }
            goto L_0x00b9
        L_0x012e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x012e }
            goto L_0x0152
        L_0x0131:
            r0 = move-exception
            r1.release()     // Catch:{ Exception -> 0x0136 }
        L_0x0135:
            throw r0     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            r3 = move-exception
            java.lang.String r2 = "MediaCodecPoolOptimized"
            java.lang.String r1 = "error-while-release-codec-from-set: %s"
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0a37 }
            X.C90514aH.A1U(r3, r0, r5)     // Catch:{ all -> 0x0a37 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x0a37 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0a37 }
            if (r8 == 0) goto L_0x00b9
            monitor-enter(r7)     // Catch:{ Exception -> 0x0153 }
            r7.remove(r8)     // Catch:{ all -> 0x0150 }
            monitor-exit(r7)     // Catch:{ all -> 0x0150 }
            goto L_0x00b9
        L_0x0150:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0150 }
        L_0x0152:
            throw r0     // Catch:{ Exception -> 0x0153 }
        L_0x0153:
            r3 = move-exception
            java.lang.String r2 = "MediaCodecPoolOptimized"
            java.lang.String r1 = "error-while-release-codec-from-set-finally: %s"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.C90514aH.A1U(r3, r0, r5)
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.w(r2, r0)
            goto L_0x00b9
        L_0x0166:
            java.lang.Object r1 = r3.A01
            X.6NA r1 = (X.AnonymousClass6NA) r1
            X.62U r0 = r1.A03
            X.6c3 r3 = r1.A04
            X.6Xw r2 = r0.A01
            X.679 r0 = r0.A02
            java.util.List r1 = X.C133326Xw.A04(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0007
            X.6PQ r2 = r2.A03
            java.lang.Object r0 = X.C36391kE.A0t(r1)
            X.682 r0 = (X.AnonymousClass682) r0
            X.6SG r1 = r0.A07
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = X.AnonymousClass6PQ.A00(r1, r2)
            if (r0 != 0) goto L_0x0007
            X.4xG r2 = r2.A00
            int r1 = X.C101264xG.A00(r3, r1)
            java.lang.String r0 = "download_pause"
            r2.A02(r1, r0)
            return
        L_0x019c:
            java.lang.Object r1 = r3.A01
            X.7lR r1 = (X.C160697lR) r1
            boolean r0 = r1 instanceof X.C23015B0g
            if (r0 == 0) goto L_0x0007
            X.B0g r1 = (X.C23015B0g) r1
            java.lang.Object r0 = r3.A00
            X.Axf r0 = (X.C22884Axf) r0
            r1.Beh(r0)
            return
        L_0x01ae:
            java.lang.Object r3 = r3.A01
            java.util.List r3 = (java.util.List) r3
            int r2 = r3.size()
            r1 = 0
        L_0x01b7:
            if (r1 >= r2) goto L_0x0007
            java.lang.Object r0 = r3.get(r1)
            X.5hh r0 = (X.C114715hh) r0
            X.A0j r0 = r0.A00
            X.7ec r0 = r0.A0B
            if (r0 == 0) goto L_0x01c8
            r0.Bej()
        L_0x01c8:
            int r1 = r1 + 1
            goto L_0x01b7
        L_0x01cb:
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            int r1 = r2.size()
            r0 = 0
            if (r0 >= r1) goto L_0x0007
            r2.get(r0)
            java.lang.String r0 = "onPreviewStopped"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r0)
            throw r1
        L_0x01e0:
            java.lang.Object r0 = r3.A00
            androidx.biometric.BiometricFragment r0 = (androidx.biometric.BiometricFragment) r0
            X.7yg r2 = r0.A01
            X.3HL r1 = r2.A04
            if (r1 != 0) goto L_0x01f2
            r0 = 0
            X.4Va r1 = new X.4Va
            r1.<init>(r2, r0)
            r2.A04 = r1
        L_0x01f2:
            r1.A01()
            return
        L_0x01f6:
            java.lang.String r0 = "onRequestPermissionsResult"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01fd:
            java.lang.Object r1 = r3.A00
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r1
            java.lang.Object r0 = r3.A01
            android.util.LongSparseArray r0 = (android.util.LongSparseArray) r0
            X.AnonymousClass6W2.A00(r0, r1)
            return
        L_0x0209:
            java.lang.Object r2 = r3.A00
            X.3Dw r2 = (X.AnonymousClass3Dw) r2
            java.lang.Object r1 = r3.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.util.Queue r0 = r2.A03
            boolean r0 = r0.offer(r1)
            if (r0 == 0) goto L_0x021f
            r2.A00()
            return
        L_0x021f:
            java.lang.String r0 = "cannot enqueue any more runnables"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)
            throw r1
        L_0x0226:
            java.lang.Object r1 = r3.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r0 = r3.A01
            X.771 r0 = (X.AnonymousClass771) r0
            r1.run()     // Catch:{ all -> 0x0235 }
            r0.A00()
            return
        L_0x0235:
            r1 = move-exception
            r0.A00()
            throw r1
        L_0x023a:
            java.lang.Object r0 = r3.A00
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r0 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r0
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            r0.A04(r2)
            java.io.File r5 = r0.A02
            java.lang.String r11 = "share_targets"
            r10 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = ".new"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.io.File r6 = X.C90524aI.A0S(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = ".bak"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.io.File r1 = X.C90524aI.A0S(r0)
            r7 = 0
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x03e3 }
            if (r0 == 0) goto L_0x027e
            X.C05490Px.A00(r1, r5)     // Catch:{ Exception -> 0x03e3 }
        L_0x027e:
            java.io.FileOutputStream r7 = X.C90524aI.A0W(r6)     // Catch:{ FileNotFoundException -> 0x0283 }
            goto L_0x0291
        L_0x0283:
            java.io.File r0 = r6.getParentFile()     // Catch:{ Exception -> 0x03e3 }
            boolean r0 = r0.mkdirs()     // Catch:{ Exception -> 0x03e3 }
            if (r0 == 0) goto L_0x03c3
            java.io.FileOutputStream r7 = X.C90524aI.A0W(r6)     // Catch:{ FileNotFoundException -> 0x03d2 }
        L_0x0291:
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x03e3 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x03e3 }
            org.xmlpull.v1.XmlSerializer r8 = android.util.Xml.newSerializer()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "UTF_8"
            r8.setOutput(r9, r0)     // Catch:{ Exception -> 0x03e3 }
            java.lang.Boolean r0 = X.C36371kC.A0m()     // Catch:{ Exception -> 0x03e3 }
            r8.startDocument(r10, r0)     // Catch:{ Exception -> 0x03e3 }
            r8.startTag(r10, r11)     // Catch:{ Exception -> 0x03e3 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ Exception -> 0x03e3 }
        L_0x02ad:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x03e3 }
            if (r0 == 0) goto L_0x0396
            java.lang.Object r2 = r16.next()     // Catch:{ Exception -> 0x03e3 }
            X.5ry r2 = (X.C120725ry) r2     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r4 = "target"
            r8.startTag(r10, r4)     // Catch:{ Exception -> 0x03e3 }
            X.0X5 r14 = r2.A00     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r1 = r14.A0M     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "id"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
            java.lang.CharSequence r0 = r14.A0K     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "short_label"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
            int r0 = r14.A0E     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "rank"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
            java.lang.CharSequence r0 = r14.A0L     // Catch:{ Exception -> 0x03e3 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x03e3 }
            if (r0 != 0) goto L_0x02f0
            java.lang.CharSequence r0 = r14.A0L     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "long_label"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
        L_0x02f0:
            java.lang.CharSequence r0 = r14.A0J     // Catch:{ Exception -> 0x03e3 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x03e3 }
            if (r0 != 0) goto L_0x0303
            java.lang.CharSequence r0 = r14.A0J     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "disabled_message"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
        L_0x0303:
            android.content.ComponentName r0 = r14.A0F     // Catch:{ Exception -> 0x03e3 }
            if (r0 == 0) goto L_0x0310
            java.lang.String r1 = r0.flattenToString()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "component"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
        L_0x0310:
            java.lang.String r1 = r2.A02     // Catch:{ Exception -> 0x03e3 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x03e3 }
            if (r0 != 0) goto L_0x031d
            java.lang.String r0 = "icon_resource_name"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
        L_0x031d:
            java.lang.String r1 = r2.A01     // Catch:{ Exception -> 0x03e3 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x03e3 }
            if (r0 != 0) goto L_0x032a
            java.lang.String r0 = "icon_bitmap_path"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
        L_0x032a:
            android.content.Intent[] r1 = r14.A0P     // Catch:{ Exception -> 0x03e3 }
            int r0 = r1.length     // Catch:{ Exception -> 0x03e3 }
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ Exception -> 0x03e3 }
            android.content.Intent[] r13 = (android.content.Intent[]) r13     // Catch:{ Exception -> 0x03e3 }
            int r12 = r13.length     // Catch:{ Exception -> 0x03e3 }
            r3 = 0
        L_0x0335:
            if (r3 >= r12) goto L_0x036d
            r15 = r13[r3]     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r2 = "intent"
            r8.startTag(r10, r2)     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r1 = r15.getAction()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "action"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x03e3 }
            if (r0 == 0) goto L_0x0367
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "targetPackage"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r1 = r0.getClassName()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "targetClass"
            X.AnonymousClass6GK.A01(r0, r1, r8)     // Catch:{ Exception -> 0x03e3 }
        L_0x0367:
            r8.endTag(r10, r2)     // Catch:{ Exception -> 0x03e3 }
            int r3 = r3 + 1
            goto L_0x0335
        L_0x036d:
            java.util.Set r0 = r14.A0N     // Catch:{ Exception -> 0x03e3 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x03e3 }
        L_0x0373:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x03e3 }
            if (r0 == 0) goto L_0x0391
            java.lang.String r2 = X.AnonymousClass001.A0C(r3)     // Catch:{ Exception -> 0x03e3 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x03e3 }
            if (r0 != 0) goto L_0x0373
            java.lang.String r1 = "categories"
            r8.startTag(r10, r1)     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "name"
            X.AnonymousClass6GK.A01(r0, r2, r8)     // Catch:{ Exception -> 0x03e3 }
            r8.endTag(r10, r1)     // Catch:{ Exception -> 0x03e3 }
            goto L_0x0373
        L_0x0391:
            r8.endTag(r10, r4)     // Catch:{ Exception -> 0x03e3 }
            goto L_0x02ad
        L_0x0396:
            r8.endTag(r10, r11)     // Catch:{ Exception -> 0x03e3 }
            r8.endDocument()     // Catch:{ Exception -> 0x03e3 }
            r9.flush()     // Catch:{ Exception -> 0x03e3 }
            r7.flush()     // Catch:{ Exception -> 0x03e3 }
            java.io.FileDescriptor r0 = r7.getFD()     // Catch:{ IOException -> 0x03ab }
            r0.sync()     // Catch:{ IOException -> 0x03ab }
            r0 = 1
            goto L_0x03ac
        L_0x03ab:
            r0 = 0
        L_0x03ac:
            java.lang.String r2 = "AtomicFile"
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r2, r0)     // Catch:{ Exception -> 0x03e3 }
        L_0x03b5:
            r7.close()     // Catch:{ IOException -> 0x03b9 }
            goto L_0x03bf
        L_0x03b9:
            r1 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r2, r0, r1)     // Catch:{ Exception -> 0x03e3 }
        L_0x03bf:
            X.C05490Px.A00(r6, r5)     // Catch:{ Exception -> 0x03e3 }
            return
        L_0x03c3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "Failed to create directory for "
            java.lang.String r0 = X.AnonymousClass000.A0l(r6, r0, r1)     // Catch:{ Exception -> 0x03e3 }
            java.io.IOException r1 = X.C90524aI.A0X(r0)     // Catch:{ Exception -> 0x03e3 }
            goto L_0x03e2
        L_0x03d2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x03e3 }
            java.lang.String r0 = "Failed to create new file "
            java.lang.String r0 = X.AnonymousClass000.A0l(r6, r0, r1)     // Catch:{ Exception -> 0x03e3 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x03e3 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x03e3 }
        L_0x03e2:
            throw r1     // Catch:{ Exception -> 0x03e3 }
        L_0x03e3:
            r4 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "Failed to write to file "
            java.lang.String r1 = X.AnonymousClass000.A0l(r5, r3, r0)
            java.lang.String r0 = "ShortcutInfoCompatSaver"
            android.util.Log.e(r0, r1, r4)
            if (r7 == 0) goto L_0x0426
            java.io.FileDescriptor r0 = r7.getFD()     // Catch:{ IOException -> 0x03fd }
            r0.sync()     // Catch:{ IOException -> 0x03fd }
            goto L_0x03ff
        L_0x03fd:
            r0 = 0
            goto L_0x0400
        L_0x03ff:
            r0 = 1
        L_0x0400:
            java.lang.String r2 = "AtomicFile"
            if (r0 != 0) goto L_0x0409
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r2, r0)
        L_0x0409:
            r7.close()     // Catch:{ IOException -> 0x040d }
            goto L_0x0413
        L_0x040d:
            r1 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r2, r0, r1)
        L_0x0413:
            boolean r0 = r6.delete()
            if (r0 != 0) goto L_0x0426
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to delete new file "
            java.lang.String r0 = X.AnonymousClass000.A0l(r6, r0, r1)
            android.util.Log.e(r2, r0)
        L_0x0426:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.AnonymousClass000.A0l(r5, r3, r0)
            java.lang.RuntimeException r1 = X.C90524aI.A0e(r0, r4)
            throw r1
        L_0x0433:
            java.lang.Object r1 = r3.A01     // Catch:{ Exception -> 0x05ee }
            java.io.File r1 = (java.io.File) r1     // Catch:{ Exception -> 0x05ee }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x05ee }
            if (r0 == 0) goto L_0x0477
            boolean r0 = r1.isDirectory()     // Catch:{ Exception -> 0x05ee }
            if (r0 != 0) goto L_0x0477
            boolean r0 = r1.delete()     // Catch:{ Exception -> 0x05ee }
            if (r0 != 0) goto L_0x0477
        L_0x0449:
            java.lang.Object r4 = r3.A00     // Catch:{ Exception -> 0x05ee }
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r4 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r4     // Catch:{ Exception -> 0x05ee }
            java.io.File r1 = r4.A01     // Catch:{ Exception -> 0x05ee }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x05ee }
            if (r0 == 0) goto L_0x0473
            boolean r0 = r1.isDirectory()     // Catch:{ Exception -> 0x05ee }
            if (r0 != 0) goto L_0x0473
            boolean r0 = r1.delete()     // Catch:{ Exception -> 0x05ee }
            if (r0 != 0) goto L_0x0473
        L_0x0461:
            java.util.Map r0 = r4.A04     // Catch:{ Exception -> 0x05ee }
            r21 = r0
            java.io.File r0 = r4.A02     // Catch:{ Exception -> 0x05ee }
            r20 = r0
            android.content.Context r0 = r4.A00     // Catch:{ Exception -> 0x05ee }
            r19 = r0
            X.008 r5 = new X.008     // Catch:{ Exception -> 0x05ee }
            r5.<init>()     // Catch:{ Exception -> 0x05ee }
            goto L_0x047b
        L_0x0473:
            X.C90474aD.A15(r1)     // Catch:{ Exception -> 0x05ee }
            goto L_0x0461
        L_0x0477:
            X.C90474aD.A15(r1)     // Catch:{ Exception -> 0x05ee }
            goto L_0x0449
        L_0x047b:
            java.io.FileInputStream r18 = X.C90524aI.A0U(r20)     // Catch:{ Exception -> 0x05c7 }
            boolean r0 = r20.exists()     // Catch:{ all -> 0x05bd }
            if (r0 == 0) goto L_0x05b9
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch:{ all -> 0x05bd }
            java.lang.String r1 = "UTF_8"
            r0 = r18
            r2.setInput(r0, r1)     // Catch:{ all -> 0x05bd }
        L_0x0490:
            int r1 = r2.next()     // Catch:{ all -> 0x05bd }
            r0 = 1
            if (r1 == r0) goto L_0x05b9
            r0 = 2
            if (r1 != r0) goto L_0x0490
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x05bd }
            java.lang.String r1 = "target"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05bd }
            if (r0 == 0) goto L_0x0490
            boolean r0 = X.C90474aD.A1V(r1, r2)     // Catch:{ all -> 0x05bd }
            if (r0 == 0) goto L_0x0490
            java.lang.String r0 = "id"
            java.lang.String r17 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            java.lang.String r0 = "short_label"
            java.lang.String r15 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            boolean r0 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x05bd }
            if (r0 != 0) goto L_0x0490
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x05bd }
            if (r0 != 0) goto L_0x0490
            java.lang.String r0 = "rank"
            java.lang.String r0 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            int r14 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x05bd }
            java.lang.String r0 = "long_label"
            java.lang.String r13 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            java.lang.String r0 = "disabled_message"
            java.lang.String r12 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            java.lang.String r0 = "component"
            java.lang.String r3 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05bd }
            if (r0 == 0) goto L_0x04e8
            r11 = 0
            goto L_0x04ec
        L_0x04e8:
            android.content.ComponentName r11 = android.content.ComponentName.unflattenFromString(r3)     // Catch:{ all -> 0x05bd }
        L_0x04ec:
            java.lang.String r0 = "icon_resource_name"
            java.lang.String r6 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            java.lang.String r0 = "icon_bitmap_path"
            java.lang.String r3 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x05bd }
            java.util.HashSet r8 = X.C36441kJ.A16()     // Catch:{ all -> 0x05bd }
        L_0x0500:
            int r7 = r2.next()     // Catch:{ all -> 0x05bd }
            r0 = 1
            if (r7 == r0) goto L_0x0562
            r0 = 2
            if (r7 != r0) goto L_0x0559
            java.lang.String r7 = r2.getName()     // Catch:{ all -> 0x05bd }
            java.lang.String r0 = "intent"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x05bd }
            if (r0 != 0) goto L_0x052e
            java.lang.String r0 = "categories"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x05bd }
            if (r0 == 0) goto L_0x0500
            java.lang.String r0 = "name"
            java.lang.String r7 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x05bd }
            if (r0 != 0) goto L_0x0500
            r8.add(r7)     // Catch:{ all -> 0x05bd }
            goto L_0x0500
        L_0x052e:
            java.lang.String r0 = "action"
            java.lang.String r16 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            java.lang.String r0 = "targetPackage"
            java.lang.String r9 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            java.lang.String r0 = "targetClass"
            java.lang.String r7 = X.AnonymousClass6GK.A00(r0, r2)     // Catch:{ all -> 0x05bd }
            if (r16 == 0) goto L_0x0500
            android.content.Intent r0 = X.C36441kJ.A0I(r16)     // Catch:{ all -> 0x05bd }
            boolean r16 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x05bd }
            if (r16 != 0) goto L_0x0555
            boolean r16 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x05bd }
            if (r16 != 0) goto L_0x0555
            r0.setClassName(r9, r7)     // Catch:{ all -> 0x05bd }
        L_0x0555:
            r10.add(r0)     // Catch:{ all -> 0x05bd }
            goto L_0x0500
        L_0x0559:
            r0 = 3
            if (r7 != r0) goto L_0x0500
            boolean r0 = X.C90474aD.A1V(r1, r2)     // Catch:{ all -> 0x05bd }
            if (r0 == 0) goto L_0x0500
        L_0x0562:
            X.0Y4 r7 = new X.0Y4     // Catch:{ all -> 0x05bd }
            r1 = r19
            r0 = r17
            r7.<init>((android.content.Context) r1, (java.lang.String) r0)     // Catch:{ all -> 0x05bd }
            X.0X5 r9 = r7.A00     // Catch:{ all -> 0x05bd }
            r9.A0K = r15     // Catch:{ all -> 0x05bd }
            r9.A0E = r14     // Catch:{ all -> 0x05bd }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x05bd }
            if (r0 != 0) goto L_0x0579
            r9.A0L = r13     // Catch:{ all -> 0x05bd }
        L_0x0579:
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x05bd }
            if (r0 != 0) goto L_0x0581
            r9.A0J = r12     // Catch:{ all -> 0x05bd }
        L_0x0581:
            if (r11 == 0) goto L_0x0585
            r9.A0F = r11     // Catch:{ all -> 0x05bd }
        L_0x0585:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x05bd }
            if (r0 != 0) goto L_0x0596
            r0 = 0
            android.content.Intent[] r0 = new android.content.Intent[r0]     // Catch:{ all -> 0x05bd }
            java.lang.Object[] r0 = r10.toArray(r0)     // Catch:{ all -> 0x05bd }
            android.content.Intent[] r0 = (android.content.Intent[]) r0     // Catch:{ all -> 0x05bd }
            r9.A0P = r0     // Catch:{ all -> 0x05bd }
        L_0x0596:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x05bd }
            if (r0 != 0) goto L_0x05a7
            r1 = 0
            X.00a r0 = new X.00a     // Catch:{ all -> 0x05bd }
            r0.<init>(r1)     // Catch:{ all -> 0x05bd }
            r0.addAll(r8)     // Catch:{ all -> 0x05bd }
            r9.A0N = r0     // Catch:{ all -> 0x05bd }
        L_0x05a7:
            X.0X5 r0 = r7.A00()     // Catch:{ all -> 0x05bd }
            X.5ry r1 = new X.5ry     // Catch:{ all -> 0x05bd }
            r1.<init>(r0, r6, r3)     // Catch:{ all -> 0x05bd }
            X.0X5 r0 = r1.A00     // Catch:{ all -> 0x05bd }
            java.lang.String r0 = r0.A0M     // Catch:{ all -> 0x05bd }
            r5.put(r0, r1)     // Catch:{ all -> 0x05bd }
            goto L_0x0490
        L_0x05b9:
            r18.close()     // Catch:{ Exception -> 0x05c7 }
            goto L_0x05e1
        L_0x05bd:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x05c2 }
            goto L_0x05c6
        L_0x05c2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x05c7 }
        L_0x05c6:
            throw r1     // Catch:{ Exception -> 0x05c7 }
        L_0x05c7:
            r3 = move-exception
            r20.delete()     // Catch:{ Exception -> 0x05ee }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x05ee }
            java.lang.String r1 = "Failed to load saved values from file "
            r0 = r20
            X.C90464aC.A1A(r0, r1, r2)     // Catch:{ Exception -> 0x05ee }
            java.lang.String r0 = ". Old state removed, new added"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ Exception -> 0x05ee }
            java.lang.String r0 = "ShortcutInfoCompatSaver"
            android.util.Log.e(r0, r1, r3)     // Catch:{ Exception -> 0x05ee }
        L_0x05e1:
            r0 = r21
            r0.putAll(r5)     // Catch:{ Exception -> 0x05ee }
            java.util.ArrayList r0 = X.C90494aF.A0g(r21)     // Catch:{ Exception -> 0x05ee }
            r4.A04(r0)     // Catch:{ Exception -> 0x05ee }
            return
        L_0x05ee:
            r2 = move-exception
            java.lang.String r1 = "ShortcutInfoCompatSaver"
            java.lang.String r0 = "ShortcutInfoCompatSaver started with an exceptions "
            android.util.Log.w(r1, r0, r2)
            return
        L_0x05f7:
            java.lang.Object r5 = r3.A00
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r5 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r5
            java.util.Map r0 = r5.A04
            r0.clear()
            java.util.Map r4 = r5.A03
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r4)
        L_0x0606:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0617
            java.lang.Object r1 = r2.next()
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r0 = 0
            r1.cancel(r0)
            goto L_0x0606
        L_0x0617:
            r4.clear()
            java.lang.Object r0 = r3.A01
            X.0GE r0 = (X.AnonymousClass0GE) r0
            r5.A03(r0)
            return
        L_0x0622:
            java.lang.Object r0 = r3.A00
            X.9Kz r0 = (X.C193319Kz) r0
            java.lang.Object r2 = r3.A01
            X.026 r0 = r0.A02
            goto L_0x0637
        L_0x062b:
            java.lang.Object r1 = r3.A00
            X.3Dy r1 = (X.C61903Dy) r1
            java.lang.Object r2 = r3.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.026 r0 = r1.A01
        L_0x0637:
            r0.accept(r2)
            return
        L_0x063b:
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x064b }
            androidx.work.Worker r0 = (androidx.work.Worker) r0     // Catch:{ all -> 0x064b }
            X.6At r1 = r0.A08()     // Catch:{ all -> 0x064b }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x064b }
            X.4pl r0 = (X.C97484pl) r0     // Catch:{ all -> 0x064b }
            r0.A06(r1)     // Catch:{ all -> 0x064b }
            return
        L_0x064b:
            r1 = move-exception
            java.lang.Object r0 = r3.A01
            X.A6T r0 = (X.A6T) r0
            r0.A07(r1)
            return
        L_0x0654:
            java.lang.Object r2 = r3.A00
            X.6im r2 = (X.C138836im) r2
            java.lang.Object r1 = r3.A01
            X.69L r1 = (X.AnonymousClass69L) r1
            r0 = 0
            r2.BX7(r1, r0)
            return
        L_0x0661:
            X.6VD r5 = X.AnonymousClass6VD.A00()
            java.lang.String r2 = X.AnonymousClass6KQ.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Scheduling work "
            r1.append(r0)
            java.lang.Object r4 = r3.A01
            X.6QA r4 = (X.AnonymousClass6QA) r4
            java.lang.String r0 = r4.A0J
            X.AnonymousClass6VD.A03(r5, r0, r2, r1)
            java.lang.Object r0 = r3.A00
            X.6KQ r0 = (X.AnonymousClass6KQ) r0
            X.6ip r2 = r0.A01
            r0 = 1
            X.6QA[] r1 = new X.AnonymousClass6QA[r0]
            r0 = 0
            r1[r0] = r4
            r2.BpL(r1)
            return
        L_0x0689:
            java.lang.Object r2 = r3.A01     // Catch:{ all -> 0x06db }
            X.6WE r2 = (X.AnonymousClass6WE) r2     // Catch:{ all -> 0x06db }
            java.util.HashSet r0 = X.C36441kJ.A16()     // Catch:{ all -> 0x06db }
            boolean r0 = X.AnonymousClass6WE.A01(r2, r0)     // Catch:{ all -> 0x06db }
            if (r0 != 0) goto L_0x06c8
            X.6VR r5 = r2.A02     // Catch:{ all -> 0x06db }
            androidx.work.impl.WorkDatabase r4 = r5.A04     // Catch:{ all -> 0x06db }
            r4.A06()     // Catch:{ all -> 0x06db }
            boolean r0 = A00(r2)     // Catch:{ all -> 0x06c3 }
            r4.A07()     // Catch:{ all -> 0x06c3 }
            X.AnonymousClass6Q8.A01(r4)     // Catch:{ all -> 0x06db }
            if (r0 == 0) goto L_0x06b9
            android.content.Context r2 = r5.A01     // Catch:{ all -> 0x06db }
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            r0 = 1
            X.AnonymousClass6I0.A00(r2, r1, r0)     // Catch:{ all -> 0x06db }
            X.0tv r1 = r5.A02     // Catch:{ all -> 0x06db }
            java.util.List r0 = r5.A07     // Catch:{ all -> 0x06db }
            X.AnonymousClass6RH.A01(r1, r4, r0)     // Catch:{ all -> 0x06db }
        L_0x06b9:
            java.lang.Object r1 = r3.A00     // Catch:{ all -> 0x06db }
            X.6ig r1 = (X.C138776ig) r1     // Catch:{ all -> 0x06db }
            X.4pC r0 = X.C161147mG.A01     // Catch:{ all -> 0x06db }
            r1.A00(r0)     // Catch:{ all -> 0x06db }
            return
        L_0x06c3:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r4)     // Catch:{ all -> 0x06db }
            goto L_0x06da
        L_0x06c8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x06db }
            java.lang.String r0 = "WorkContinuation has cycles ("
            r1.append(r0)     // Catch:{ all -> 0x06db }
            r1.append(r2)     // Catch:{ all -> 0x06db }
            java.lang.String r0 = ")"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ all -> 0x06db }
        L_0x06da:
            throw r0     // Catch:{ all -> 0x06db }
        L_0x06db:
            r2 = move-exception
            java.lang.Object r1 = r3.A00
            X.6ig r1 = (X.C138776ig) r1
            X.4pD r0 = new X.4pD
            r0.<init>(r2)
            r1.A00(r0)
            return
        L_0x06e9:
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x06fd }
            X.C36411kG.A1O(r0)     // Catch:{ all -> 0x06fd }
            java.lang.Object r1 = r3.A01
            X.772 r1 = (X.AnonymousClass772) r1
            java.lang.Object r0 = r1.A01
            monitor-enter(r0)
            r1.A00()     // Catch:{ all -> 0x06fa }
            monitor-exit(r0)     // Catch:{ all -> 0x06fa }
            return
        L_0x06fa:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x06fa }
            throw r1
        L_0x06fd:
            r2 = move-exception
            java.lang.Object r1 = r3.A01
            X.772 r1 = (X.AnonymousClass772) r1
            java.lang.Object r0 = r1.A01
            monitor-enter(r0)
            r1.A00()     // Catch:{ all -> 0x070a }
        L_0x0708:
            monitor-exit(r0)     // Catch:{ all -> 0x070a }
            goto L_0x070c
        L_0x070a:
            r2 = move-exception
            goto L_0x0708
        L_0x070c:
            throw r2
        L_0x070d:
            java.lang.Object r2 = r3.A00
            X.75A r2 = (X.AnonymousClass75A) r2
            java.lang.Object r1 = r3.A01
            X.A6T r1 = (X.A6T) r1
            java.lang.Object r0 = r2.A02
            X.A6T r0 = (X.A6T) r0
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x072b
            java.lang.Object r0 = r2.A05
            X.6Ec r0 = (X.C128916Ec) r0
            X.0sD r0 = r0.A05()
            r1.A05(r0)
            return
        L_0x072b:
            r0 = 1
            r1.cancel(r0)
            return
        L_0x0730:
            java.lang.Object r1 = r3.A01
            X.6N1 r1 = (X.AnonymousClass6N1) r1
            java.lang.Object r5 = r1.A01
            monitor-enter(r5)
            java.util.Map r0 = r1.A03     // Catch:{ all -> 0x0783 }
            java.lang.Object r6 = r3.A00     // Catch:{ all -> 0x0783 }
            X.69L r6 = (X.AnonymousClass69L) r6     // Catch:{ all -> 0x0783 }
            java.lang.Object r0 = r0.remove(r6)     // Catch:{ all -> 0x0783 }
            X.75C r0 = (X.AnonymousClass75C) r0     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x076e
            java.util.Map r0 = r1.A02     // Catch:{ all -> 0x0783 }
            java.lang.Object r4 = r0.remove(r6)     // Catch:{ all -> 0x0783 }
            X.7bw r4 = (X.C157167bw) r4     // Catch:{ all -> 0x0783 }
            if (r4 == 0) goto L_0x076c
            X.6iq r4 = (X.C138876iq) r4     // Catch:{ all -> 0x0783 }
            X.6VD r3 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0783 }
            java.lang.String r2 = X.C138876iq.A0C     // Catch:{ all -> 0x0783 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "Exceeded time limits on execution for "
            X.AnonymousClass6VD.A02(r3, r6, r0, r2, r1)     // Catch:{ all -> 0x0783 }
            java.util.concurrent.Executor r2 = r4.A0A     // Catch:{ all -> 0x0783 }
            r1 = 18
            X.759 r0 = new X.759     // Catch:{ all -> 0x0783 }
            r0.<init>((java.lang.Object) r4, (int) r1)     // Catch:{ all -> 0x0783 }
            r2.execute(r0)     // Catch:{ all -> 0x0783 }
        L_0x076c:
            monitor-exit(r5)     // Catch:{ all -> 0x0783 }
            goto L_0x0782
        L_0x076e:
            X.6VD r3 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0783 }
            java.lang.String r2 = "WrkTimerRunnable"
            java.lang.String r1 = "Timer with %s is already marked as complete."
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r6)     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x0783 }
            r3.A04(r2, r0)     // Catch:{ all -> 0x0783 }
            goto L_0x076c
        L_0x0782:
            return
        L_0x0783:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0783 }
            throw r1
        L_0x0786:
            java.lang.Object r4 = r3.A00
            androidx.work.impl.workers.ConstraintTrackingWorker r4 = (androidx.work.impl.workers.ConstraintTrackingWorker) r4
            java.lang.Object r1 = r3.A01
            X.0sD r1 = (X.C17880sD) r1
            java.lang.Object r2 = r4.A03
            monitor-enter(r2)
            boolean r0 = r4.A04     // Catch:{ all -> 0x07a9 }
            if (r0 == 0) goto L_0x07a2
            X.4pl r1 = r4.A02     // Catch:{ all -> 0x07a9 }
            X.AnonymousClass00C.A07(r1)     // Catch:{ all -> 0x07a9 }
            X.4ov r0 = X.C97324ov.A00()     // Catch:{ all -> 0x07a9 }
            r1.A06(r0)     // Catch:{ all -> 0x07a9 }
            goto L_0x07a7
        L_0x07a2:
            X.4pl r0 = r4.A02     // Catch:{ all -> 0x07a9 }
            r0.A05(r1)     // Catch:{ all -> 0x07a9 }
        L_0x07a7:
            monitor-exit(r2)
            return
        L_0x07a9:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x07ac:
            java.lang.Object r1 = r3.A01
            X.6LD r1 = (X.AnonymousClass6LD) r1
            java.lang.Object r0 = r3.A00
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            X.AnonymousClass6LD.A00(r0, r1)
            return
        L_0x07b8:
            java.lang.Object r5 = r3.A00
            X.4nM r5 = (X.C96454nM) r5
            float[] r0 = X.C90524aI.A0v()
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r0)
            r5.A00 = r4
            java.lang.Object r2 = r3.A01
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            X.4n9 r1 = r5.A03
            X.6Yg r0 = new X.6Yg
            r0.<init>(r2, r1)
            r4.addUpdateListener(r0)
            android.animation.ValueAnimator r2 = r5.A00
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.animation.ValueAnimator r0 = r5.A00
            r0.start()
            r0 = 0
            r5.A02 = r0
            return
        L_0x07e7:
            java.lang.Object r0 = r3.A01
            X.9Xx r0 = (X.C196149Xx) r0
            X.C209329zp.A0F(r0)     // Catch:{ 82J -> 0x07ef }
            goto L_0x07fc
        L_0x07ef:
            r2 = move-exception
            java.lang.String r1 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Unexpected error delivering message on external thread."
            android.util.Log.e(r1, r0, r2)
            java.lang.RuntimeException r1 = X.AnonymousClass001.A0B(r2)
            throw r1
        L_0x07fc:
            return
        L_0x07fd:
            java.lang.Object r0 = r3.A01
            monitor-enter(r0)
            monitor-exit(r0)
            return
        L_0x0802:
            java.lang.Object r2 = r3.A01
            X.7lf r2 = (X.C160837lf) r2
            java.lang.Object r0 = r3.A00
            X.9lP r0 = (X.C202249lP) r0
            int r1 = r0.A00
            X.9WT r0 = r0.A01
            r2.BaX(r0, r1)
            return
        L_0x0812:
            java.lang.Object r2 = r3.A01
            X.7lf r2 = (X.C160837lf) r2
            java.lang.Object r0 = r3.A00
            X.9lP r0 = (X.C202249lP) r0
            int r1 = r0.A00
            X.9WT r0 = r0.A01
            r2.BaY(r0, r1)
            return
        L_0x0822:
            java.lang.Object r2 = r3.A01
            X.7lf r2 = (X.C160837lf) r2
            java.lang.Object r0 = r3.A00
            X.9lP r0 = (X.C202249lP) r0
            int r1 = r0.A00
            X.9WT r0 = r0.A01
            r2.BeB(r0, r1)
            return
        L_0x0832:
            java.lang.Object r0 = r3.A00
            X.5o9 r0 = (X.AnonymousClass5o9) r0
            java.lang.Object r2 = r3.A01
            android.view.Surface r2 = (android.view.Surface) r2
            X.9zx r0 = r0.A01
            X.9pt r1 = r0.A01
            r1.A0I = r2
            boolean r0 = r2.isValid()
            X.C204369pt.A0G(r1, r0)
            X.A2g r0 = r1.A0o
            r0.BWF()
            return
        L_0x084d:
            java.lang.Object r0 = r3.A00
            X.5o9 r0 = (X.AnonymousClass5o9) r0
            java.lang.Object r1 = r3.A01
            X.9OH r1 = (X.AnonymousClass9OH) r1
            X.9zx r0 = r0.A01
            X.9pt r0 = r0.A01
            r0.A0K = r1
            return
        L_0x085c:
            java.lang.Object r0 = r3.A00
            X.6NU r0 = (X.AnonymousClass6NU) r0
            java.lang.Object r5 = r3.A01
            X.7cD r5 = (X.AnonymousClass7cD) r5
            android.os.Handler r4 = r0.A02
            X.6KX r1 = r0.A03
            java.lang.String r0 = "pAS"
            X.AnonymousClass6KX.A00(r1, r0)
            java.lang.String r3 = "pause"
            java.lang.Integer r2 = X.C36381kD.A0m()
            java.lang.String r1 = "AudioPipelineController"
            java.lang.String r0 = "%s audio operation returned %d"
            X.AnonymousClass6YR.A01(r3, r2, r1, r0)
            X.751 r0 = new X.751
            r0.<init>((X.AnonymousClass7cD) r5)
            r4.post(r0)
            return
        L_0x0883:
            java.lang.Object r1 = r3.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 10
            android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x088c }
        L_0x088c:
            r1.run()
            return
        L_0x0890:
            java.lang.Object r2 = r3.A00
            X.6lF r2 = (X.C140226lF) r2
            java.lang.Object r4 = r3.A01
            java.util.concurrent.CountDownLatch r4 = (java.util.concurrent.CountDownLatch) r4
            X.9fW r1 = r2.A06     // Catch:{ RuntimeException -> 0x0920 }
            if (r1 == 0) goto L_0x08a1
            X.88P r0 = r2.A08     // Catch:{ RuntimeException -> 0x0920 }
            X.AnonymousClass88P.A01(r0, r1)     // Catch:{ RuntimeException -> 0x0920 }
        L_0x08a1:
            X.88P r3 = r2.A08     // Catch:{ RuntimeException -> 0x0920 }
            boolean r0 = r3.A0L     // Catch:{ RuntimeException -> 0x0920 }
            if (r0 == 0) goto L_0x08dc
            X.6lC r5 = r2.A07     // Catch:{ RuntimeException -> 0x0920 }
            X.88T r0 = new X.88T     // Catch:{ RuntimeException -> 0x0920 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0920 }
            X.A1z r1 = new X.A1z     // Catch:{ RuntimeException -> 0x0920 }
            r1.<init>(r5, r0)     // Catch:{ RuntimeException -> 0x0920 }
            r0 = 0
            r3.A06(r1, r0)     // Catch:{ RuntimeException -> 0x0920 }
            android.os.Handler r2 = r3.A0H     // Catch:{ RuntimeException -> 0x0920 }
            int r0 = r5.A00     // Catch:{ RuntimeException -> 0x0920 }
            if (r0 == 0) goto L_0x091a
            java.lang.String r1 = "ar-session"
            java.lang.String r0 = "regular surface used - attach"
            X.AnonymousClass6YR.A05(r1, r0)     // Catch:{ RuntimeException -> 0x0920 }
            android.graphics.SurfaceTexture r1 = r5.A02     // Catch:{ RuntimeException -> 0x0920 }
            if (r1 == 0) goto L_0x08d8
            r1.detachFromGLContext()     // Catch:{ RuntimeException -> 0x0920 }
            int r0 = r5.A00     // Catch:{ RuntimeException -> 0x0920 }
            r1.attachToGLContext(r0)     // Catch:{ RuntimeException -> 0x0920 }
            android.graphics.SurfaceTexture$OnFrameAvailableListener r0 = r5.A01     // Catch:{ RuntimeException -> 0x0920 }
            r1.setOnFrameAvailableListener(r0, r2)     // Catch:{ RuntimeException -> 0x0920 }
            r1.updateTexImage()     // Catch:{ RuntimeException -> 0x0920 }
        L_0x08d8:
            X.AnonymousClass88P.A00(r3)     // Catch:{ RuntimeException -> 0x0920 }
            goto L_0x0930
        L_0x08dc:
            X.6lC r2 = r2.A07     // Catch:{ RuntimeException -> 0x0920 }
            android.graphics.SurfaceTexture r1 = r2.A02     // Catch:{ RuntimeException -> 0x0920 }
            r0 = 0
            r2.A02 = r0     // Catch:{ RuntimeException -> 0x0920 }
            if (r1 == 0) goto L_0x08e8
            r1.release()     // Catch:{ RuntimeException -> 0x0920 }
        L_0x08e8:
            X.88T r0 = new X.88T     // Catch:{ RuntimeException -> 0x0920 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0920 }
            X.A1z r1 = new X.A1z     // Catch:{ RuntimeException -> 0x0920 }
            r1.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x0920 }
            r0 = 0
            r3.A06(r1, r0)     // Catch:{ RuntimeException -> 0x0920 }
            android.graphics.SurfaceTexture r0 = r2.A02     // Catch:{ RuntimeException -> 0x0920 }
            if (r0 != 0) goto L_0x0930
            int r0 = r2.A00     // Catch:{ RuntimeException -> 0x0920 }
            if (r0 == 0) goto L_0x0914
            java.lang.String r1 = "ar-session"
            java.lang.String r0 = "regular surface used"
            X.AnonymousClass6YR.A05(r1, r0)     // Catch:{ RuntimeException -> 0x0920 }
            int r0 = r2.A00     // Catch:{ RuntimeException -> 0x0920 }
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture     // Catch:{ RuntimeException -> 0x0920 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0920 }
            android.graphics.SurfaceTexture$OnFrameAvailableListener r0 = r2.A01     // Catch:{ RuntimeException -> 0x0920 }
            r1.setOnFrameAvailableListener(r0)     // Catch:{ RuntimeException -> 0x0920 }
            r2.A02 = r1     // Catch:{ RuntimeException -> 0x0920 }
            goto L_0x0930
        L_0x0914:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0920 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0920 }
            goto L_0x091f
        L_0x091a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0920 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0920 }
        L_0x091f:
            throw r0     // Catch:{ RuntimeException -> 0x0920 }
        L_0x0920:
            r3 = move-exception
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r0 = 0
            X.C90514aH.A1U(r3, r2, r0)
            java.lang.String r1 = "RtcSurfacePipeComponent"
            java.lang.String r0 = "Failed to create SurfaceNode: %s"
            X.AnonymousClass6YR.A0E(r1, r0, r3, r2)
        L_0x0930:
            r4.countDown()
            return
        L_0x0934:
            java.lang.Object r5 = r3.A00
            X.9fb r5 = (X.C199609fb) r5
            java.lang.Object r4 = r3.A01
            X.61X r4 = (X.AnonymousClass61X) r4
            X.9Co r3 = X.C199609fb.A0X
            java.lang.Object r0 = r5.A00(r3)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x096b
            int r0 = r0.length
            if (r0 == 0) goto L_0x096b
            java.lang.Object[] r2 = X.C36441kJ.A1Q()
            X.9HW r1 = r4.A01
            r0 = 0
            r2[r0] = r1
            java.lang.Object r1 = r5.A00(r3)
            r0 = 1
            X.C36411kG.A1Q(r1, r5, r2, r0)
            X.A0j r1 = r4.A00
            r0 = 6
            X.C20952A0j.A04(r1, r2, r0)
            X.9j3 r3 = X.C201199j3.A00()
            long r1 = r3.A03
            r0 = 0
            X.C201199j3.A01(r3, r0, r1)
            return
        L_0x096b:
            java.lang.String r0 = "Photo taking returned no jpeg data!"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            r4.A00(r0)
            return
        L_0x0975:
            java.lang.Object r1 = r3.A00
            X.61X r1 = (X.AnonymousClass61X) r1
            java.lang.Object r0 = r3.A01
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.A00(r0)
            return
        L_0x0981:
            java.lang.Object r4 = r3.A00
            X.61X r4 = (X.AnonymousClass61X) r4
            java.lang.Object r3 = r3.A01
            X.9fb r3 = (X.C199609fb) r3
            java.lang.Object[] r2 = X.C36441kJ.A1Q()
            X.9HW r1 = r4.A01
            r0 = 0
            r2[r0] = r1
            X.9Co r0 = X.C199609fb.A0X
            java.lang.Object r1 = r3.A00(r0)
            r0 = 1
            X.C36411kG.A1Q(r1, r3, r2, r0)
            X.A0j r1 = r4.A00
            r0 = 6
            X.C20952A0j.A04(r1, r2, r0)
            return
        L_0x09a3:
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x09ca }
            X.0sD r0 = (X.C17880sD) r0     // Catch:{ all -> 0x09ca }
            r0.get()     // Catch:{ all -> 0x09ca }
            X.6VD r3 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x09ca }
            java.lang.String r2 = X.AnonymousClass758.A0I     // Catch:{ all -> 0x09ca }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x09ca }
            java.lang.String r0 = "Starting work for "
            r1.append(r0)     // Catch:{ all -> 0x09ca }
            X.6QA r0 = r5.A08     // Catch:{ all -> 0x09ca }
            java.lang.String r0 = r0.A0G     // Catch:{ all -> 0x09ca }
            X.AnonymousClass6VD.A03(r3, r0, r2, r1)     // Catch:{ all -> 0x09ca }
            X.6Ec r0 = r5.A03     // Catch:{ all -> 0x09ca }
            X.0sD r0 = r0.A06()     // Catch:{ all -> 0x09ca }
            r4.A05(r0)     // Catch:{ all -> 0x09ca }
            return
        L_0x09ca:
            r0 = move-exception
            r4.A07(r0)
            return
        L_0x09cf:
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0a32 }
            X.4pl r0 = (X.C97484pl) r0     // Catch:{ all -> 0x0a32 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0a32 }
            X.6At r7 = (X.C128076At) r7     // Catch:{ all -> 0x0a32 }
            if (r7 == 0) goto L_0x0a19
            X.6VD r4 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0a32 }
            java.lang.String r3 = X.C112585e8.A00     // Catch:{ all -> 0x0a32 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0a32 }
            java.lang.String r0 = "Updating notification for "
            r1.append(r0)     // Catch:{ all -> 0x0a32 }
            java.lang.Object r0 = r5.A04     // Catch:{ all -> 0x0a32 }
            X.6QA r0 = (X.AnonymousClass6QA) r0     // Catch:{ all -> 0x0a32 }
            java.lang.String r0 = r0.A0G     // Catch:{ all -> 0x0a32 }
            X.AnonymousClass6VD.A03(r4, r0, r3, r1)     // Catch:{ all -> 0x0a32 }
            java.lang.Object r6 = r5.A01     // Catch:{ all -> 0x0a32 }
            X.7bo r6 = (X.C157087bo) r6     // Catch:{ all -> 0x0a32 }
            java.lang.Object r8 = r5.A00     // Catch:{ all -> 0x0a32 }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x0a32 }
            java.lang.Object r0 = r5.A05     // Catch:{ all -> 0x0a32 }
            X.6Ec r0 = (X.C128916Ec) r0     // Catch:{ all -> 0x0a32 }
            androidx.work.WorkerParameters r0 = r0.A01     // Catch:{ all -> 0x0a32 }
            java.util.UUID r5 = r0.A06     // Catch:{ all -> 0x0a32 }
            X.6if r6 = (X.C138766if) r6     // Catch:{ all -> 0x0a32 }
            X.4pl r9 = new X.4pl     // Catch:{ all -> 0x0a32 }
            r9.<init>()     // Catch:{ all -> 0x0a32 }
            X.7eB r0 = r6.A02     // Catch:{ all -> 0x0a32 }
            r10 = 0
            X.753 r4 = new X.753     // Catch:{ all -> 0x0a32 }
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0a32 }
            r0.B74(r4)     // Catch:{ all -> 0x0a32 }
            r2.A05(r9)     // Catch:{ all -> 0x0a32 }
            return
        L_0x0a19:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0a32 }
            java.lang.String r0 = "Worker was marked important ("
            r1.append(r0)     // Catch:{ all -> 0x0a32 }
            java.lang.Object r0 = r5.A04     // Catch:{ all -> 0x0a32 }
            X.6QA r0 = (X.AnonymousClass6QA) r0     // Catch:{ all -> 0x0a32 }
            java.lang.String r0 = r0.A0G     // Catch:{ all -> 0x0a32 }
            r1.append(r0)     // Catch:{ all -> 0x0a32 }
            java.lang.String r0 = ") but did not provide ForegroundInfo"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ all -> 0x0a32 }
            throw r0     // Catch:{ all -> 0x0a32 }
        L_0x0a32:
            r0 = move-exception
            r2.A07(r0)
            return
        L_0x0a37:
            r4 = move-exception
            if (r8 == 0) goto L_0x0a54
            monitor-enter(r7)     // Catch:{ Exception -> 0x0a43 }
            r7.remove(r8)     // Catch:{ all -> 0x0a40 }
            monitor-exit(r7)     // Catch:{ all -> 0x0a40 }
            throw r4
        L_0x0a40:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0a40 }
            throw r0     // Catch:{ Exception -> 0x0a43 }
        L_0x0a43:
            r3 = move-exception
            java.lang.String r2 = "MediaCodecPoolOptimized"
            java.lang.String r1 = "error-while-release-codec-from-set-finally: %s"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.C90514aH.A1U(r3, r0, r5)
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.w(r2, r0)
        L_0x0a54:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75C.run():void");
    }

    public AnonymousClass75C(C138836im r2, AnonymousClass69L r3) {
        this.A02 = 11;
        this.A00 = r2;
        this.A01 = r3;
    }

    public AnonymousClass75C(List list, List list2) {
        this.A02 = 1;
        this.A01 = list;
        this.A00 = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass75C(AnonymousClass6WE r3) {
        this((Object) new C138776ig(), (Object) r3, 16);
        this.A02 = 16;
    }

    public AnonymousClass75C(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public AnonymousClass75C(AnonymousClass758 r1, C17880sD r2, int i) {
        this.A02 = i;
        if (12 - i != 0) {
            this.A00 = r1;
            this.A01 = r2;
            return;
        }
        this.A00 = r1;
        this.A01 = r2;
    }
}
