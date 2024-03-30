package X;

/* renamed from: X.1j3  reason: invalid class name and case insensitive filesystem */
public class C35661j3 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C35661j3(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A00 = obj3;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
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
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public void run() {
        /*
            r29 = this;
            r7 = r29
            int r0 = r7.A03
            switch(r0) {
                case 0: goto L_0x06f3;
                case 1: goto L_0x065e;
                case 2: goto L_0x063c;
                case 3: goto L_0x0542;
                case 4: goto L_0x0e3c;
                case 5: goto L_0x0e2a;
                case 6: goto L_0x0e04;
                case 7: goto L_0x0de9;
                case 8: goto L_0x0cf2;
                case 9: goto L_0x0b78;
                case 10: goto L_0x0adc;
                case 11: goto L_0x0a84;
                case 12: goto L_0x092d;
                case 13: goto L_0x04f2;
                case 14: goto L_0x090f;
                case 15: goto L_0x0895;
                case 16: goto L_0x0244;
                case 17: goto L_0x004b;
                case 18: goto L_0x07d8;
                case 19: goto L_0x001f;
                case 20: goto L_0x07c0;
                case 21: goto L_0x0771;
                case 22: goto L_0x072c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r7.A00
            X.1i0 r0 = (X.C35011i0) r0
            java.lang.Object r2 = r7.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r7.A02
            X.2bV r1 = (X.AnonymousClass2bV) r1
            X.005 r0 = r0.A0F
            java.lang.Object r0 = r0.get()
            X.67d r0 = (X.C1271467d) r0
            r0.A00(r2, r1)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r2 = r7.A00
            X.1Q0 r2 = (X.AnonymousClass1Q0) r2
            java.lang.Object r3 = r7.A01
            java.lang.Object r4 = r7.A02
            X.005 r0 = r2.A06
            java.lang.Object r0 = r0.get()
            X.1V6 r0 = (X.AnonymousClass1V6) r0
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x003b
            boolean r0 = X.AnonymousClass6YG.A09()
            if (r0 != 0) goto L_0x001e
        L_0x003b:
            r5 = 5
            java.util.concurrent.ExecutorService r0 = X.AnonymousClass1Q0.A00(r2)
            r6 = 15
            X.1iX r1 = new X.1iX
            r1.<init>(r2, r3, r4, r5, r6)
            r0.submit(r1)
            return
        L_0x004b:
            java.lang.Object r5 = r7.A00
            X.1Xt r5 = (X.C29731Xt) r5
            java.lang.Object r1 = r7.A01
            X.3Rn r1 = (X.C65303Rn) r1
            java.lang.Object r11 = r7.A02
            java.util.List r11 = (java.util.List) r11
            r8 = 2
            X.AnonymousClass00C.A0D(r11, r8)
            X.1HT r0 = r5.A04
            com.whatsapp.jid.UserJid r9 = r1.A04
            java.util.ArrayList r10 = r0.A03(r9)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            int r6 = r10.size()
            r4 = 0
        L_0x006d:
            if (r4 >= r6) goto L_0x008f
            java.lang.Object r0 = r10.get(r4)
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r0 = r0.A1J
            java.lang.String r3 = r0.A01
            X.AnonymousClass00C.A07(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r10.get(r4)
            X.00I r0 = new X.00I
            r0.<init>(r2, r1)
            r7.put(r3, r0)
            int r4 = r4 + 1
            goto L_0x006d
        L_0x008f:
            java.util.Iterator r16 = r11.iterator()
        L_0x0093:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r6 = r16.next()
            X.3OI r6 = (X.AnonymousClass3OI) r6
            boolean r0 = r9 instanceof X.C177638e7
            r4 = 1
            if (r0 == 0) goto L_0x0111
            java.lang.String r10 = r6.A0N
            boolean r0 = r7.containsKey(r10)
            if (r0 == 0) goto L_0x0111
            java.lang.Object r1 = r7.get(r10)
            X.C18740tg.A06(r1)
            X.00I r1 = (X.AnonymousClass00I) r1
            java.lang.Object r3 = r1.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            X.3Qa r0 = r3.A1J
            java.lang.String r2 = r0.A01
            boolean r0 = X.AnonymousClass00C.A0J(r10, r2)
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0I = r0
            X.16F r0 = r5.A05
            X.3SA r3 = r0.A00(r3)
            java.lang.String r0 = r3.A04
            r6.A0J = r0
            java.util.Map r0 = r5.A0D
            java.lang.Object r0 = r0.get(r10)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0241
            int r0 = r0.intValue()
        L_0x00ea:
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0H = r0
            java.lang.String r1 = r3.A03
            r0 = 0
            if (r1 == 0) goto L_0x00f7
            r0 = 1
        L_0x00f7:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r6.A0C = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0111
            java.util.Map r0 = r5.A0E
            java.lang.Object r0 = r0.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r6.A0D = r0
        L_0x0111:
            X.16D r0 = r5.A02
            com.whatsapp.jid.UserJid r13 = r6.A0M
            X.141 r1 = r0.A08(r13)
            if (r1 == 0) goto L_0x012f
            boolean r0 = r1.A0C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0A = r0
            boolean r0 = r1.A0B()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0B = r0
        L_0x012f:
            java.lang.Integer r3 = r6.A0E
            r12 = 3
            if (r3 == 0) goto L_0x013f
            int r0 = r3.intValue()
            if (r0 != r8) goto L_0x0230
            X.1Dw r0 = r5.A08
            r0.A02(r8, r12)
        L_0x013f:
            X.2T2 r2 = new X.2T2
            r2.<init>()
            java.lang.Boolean r0 = r6.A0A
            r2.A00 = r0
            java.lang.Boolean r0 = r6.A0B
            r2.A01 = r0
            long r0 = r6.A09
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r2.A0J = r10
            int r14 = r6.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r2.A07 = r0
            int r0 = r6.A01
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0I = r0
            int r0 = r6.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A06 = r0
            r2.A05 = r3
            long r0 = r6.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0E = r0
            long r0 = r6.A08
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0H = r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r6.A06
            long r0 = r12.toSeconds(r0)
            long r0 = r11.toMillis(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0D = r0
            int r0 = r6.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0F = r0
            int r0 = r6.A03
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0G = r0
            long r0 = r6.A05
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0B = r0
            boolean r0 = r6.A0L
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r2.A04 = r11
            java.lang.Long r0 = r6.A0I
            r2.A0C = r0
            java.lang.String r1 = r6.A0J
            r2.A0K = r1
            java.lang.Long r0 = r6.A0H
            r2.A0A = r0
            java.lang.Boolean r0 = r6.A0C
            r2.A02 = r0
            java.lang.Boolean r0 = r6.A0D
            r2.A03 = r0
            java.lang.Integer r0 = r6.A0G
            r2.A09 = r0
            java.lang.Integer r0 = r6.A0F
            r2.A08 = r0
            if (r1 == 0) goto L_0x022a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x022a
            X.0yW r1 = r5.A07
            X.0u5 r0 = X.AnonymousClass3TM.A00
            r1.Bls(r2, r0, r4)
        L_0x01e0:
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x0093
            java.lang.String r12 = r6.A0N
            r15 = 1
            if (r3 == 0) goto L_0x01fc
            int r1 = r3.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x01f3
            r0 = 3
            if (r1 != r0) goto L_0x01fc
        L_0x01f3:
            long r0 = r6.A08
            long r2 = r6.A06
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x01fc
            r15 = 0
        L_0x01fc:
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r15)
            int r0 = X.AnonymousClass3OI.A00(r14)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            X.1Xv r1 = r5.A0B
            r20 = r11
            r22 = r10
            r23 = r12
            r17 = r13
            r18 = r1
            X.2SE r2 = X.C29751Xv.A00(r17, r18, r19, r20, r21, r22, r23)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.A05 = r0
            X.0yW r1 = r1.A01
            X.0u5 r0 = new X.0u5
            r0.<init>(r4, r4)
            r1.Bls(r2, r0, r4)
            goto L_0x0093
        L_0x022a:
            X.0yW r0 = r5.A07
            r0.Bly(r2)
            goto L_0x01e0
        L_0x0230:
            if (r0 != r12) goto L_0x013f
            long r0 = r6.A08
            r10 = 400(0x190, double:1.976E-321)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x013f
            X.1Dw r0 = r5.A08
            r0.A02(r12, r12)
            goto L_0x013f
        L_0x0241:
            r0 = 0
            goto L_0x00ea
        L_0x0244:
            java.lang.Object r1 = r7.A00
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r6 = r7.A01
            X.1Sc r6 = (X.C28301Sc) r6
            java.lang.Object r12 = r7.A02
            X.3T1 r12 = (X.AnonymousClass3T1) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.List r22 = java.util.Collections.synchronizedList(r0)
            java.util.Iterator r21 = r22.iterator()
            r20 = 0
        L_0x025f:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r5 = r21.next()
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            if (r5 == 0) goto L_0x0329
            long r3 = r5.A1O
            long r1 = r12.A1O
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0329
            X.16E r3 = r6.A03
            boolean r0 = r3.A0J(r5)
            if (r0 == 0) goto L_0x0329
            int r1 = r20 + 1
            int r0 = r22.size()
            r7 = 0
            if (r1 >= r0) goto L_0x04ef
            r0 = r22
            java.lang.Object r8 = r0.get(r1)
            X.3T1 r8 = (X.AnonymousClass3T1) r8
        L_0x028e:
            int r0 = r22.size()
            if (r1 >= r0) goto L_0x02a8
            int r0 = r22.size()
            int r1 = r0 + -1
            int r0 = r20 + 2
            int r1 = java.lang.Math.min(r1, r0)
            r0 = r22
            java.lang.Object r7 = r0.get(r1)
            X.3T1 r7 = (X.AnonymousClass3T1) r7
        L_0x02a8:
            X.3Qa r10 = r5.A1J
            boolean r9 = r10.A02
            X.0v0 r0 = r6.A00
            boolean r11 = r0.A2L()
            r13 = r9 ^ 1
            if (r13 == 0) goto L_0x0307
            X.1DL r0 = r6.A04
            r0.A09(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "statusmanager/markstatusasseen/sending status rr for "
            r1.append(r0)
            r1.append(r10)
            r4 = 32
            r1.append(r4)
            X.11F r0 = r5.A0J()
            r1.append(r0)
            r1.append(r4)
            int r2 = r5.A1I
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "statusmanager/markstatusasseen/mark seen "
            r1.append(r0)
            r1.append(r10)
            r1.append(r4)
            X.11F r0 = r5.A0J()
            r1.append(r0)
            r1.append(r4)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0307:
            if (r9 == 0) goto L_0x04e5
            X.3Sz r4 = r3.A07()
        L_0x030d:
            if (r4 != 0) goto L_0x032d
            if (r13 == 0) goto L_0x0329
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "statusmanager/markstatusasseen/no status for "
            r1.append(r0)
            X.11F r0 = r5.A0J()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0326:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0329:
            int r20 = r20 + 1
            goto L_0x025f
        L_0x032d:
            monitor-enter(r4)
            long r2 = r5.A1O     // Catch:{ all -> 0x0e7f }
            long r0 = r4.A05     // Catch:{ all -> 0x0e7f }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0337
            goto L_0x0362
        L_0x0337:
            if (r11 == 0) goto L_0x033d
            long r0 = r5.A1O     // Catch:{ all -> 0x0e7f }
            r4.A06 = r0     // Catch:{ all -> 0x0e7f }
        L_0x033d:
            long r0 = r5.A1O     // Catch:{ all -> 0x0e7f }
            r4.A05 = r0     // Catch:{ all -> 0x0e7f }
            int r0 = r4.A01     // Catch:{ all -> 0x0e7f }
            if (r0 <= 0) goto L_0x0349
            int r0 = r0 + -1
            r4.A01 = r0     // Catch:{ all -> 0x0e7f }
        L_0x0349:
            r2 = -9223372036854775808
            if (r8 != 0) goto L_0x0350
            r0 = -9223372036854775808
            goto L_0x0352
        L_0x0350:
            long r0 = r8.A1O     // Catch:{ all -> 0x0e7f }
        L_0x0352:
            r4.A03 = r0     // Catch:{ all -> 0x0e7f }
            if (r7 == 0) goto L_0x0358
            long r2 = r7.A1O     // Catch:{ all -> 0x0e7f }
        L_0x0358:
            r4.A02 = r2     // Catch:{ all -> 0x0e7f }
            X.C65663Sz.A01(r5)     // Catch:{ all -> 0x0e7f }
            X.3Sz r8 = r4.A06()     // Catch:{ all -> 0x0e7f }
            goto L_0x0363
        L_0x0362:
            r8 = 0
        L_0x0363:
            monitor-exit(r4)
            if (r8 != 0) goto L_0x0369
            java.lang.String r0 = "statusmanager/markstatusasseen/updatestatus returned null"
            goto L_0x0326
        L_0x0369:
            X.1HT r4 = r6.A02
            java.lang.String r7 = "status_psa_viewed_time"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/"
            r1.append(r0)
            X.11F r0 = r5.A0J()
            r1.append(r0)
            java.lang.String r0 = " rrsent="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12P r0 = r4.A0D
            X.1M0 r19 = r0.A05()
            X.71s r18 = r19.B1k()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c9, Error | RuntimeException -> 0x0e75 }
            X.16E r13 = r4.A0G     // Catch:{ all -> 0x04bf }
            long r15 = r5.A1O     // Catch:{ all -> 0x04bf }
            int r17 = r8.A03()     // Catch:{ all -> 0x04bf }
            monitor-enter(r8)     // Catch:{ all -> 0x04bf }
            long r2 = r8.A03     // Catch:{ all -> 0x04bc }
            monitor-exit(r8)     // Catch:{ all -> 0x04bf }
            monitor-enter(r8)     // Catch:{ all -> 0x04bf }
            long r0 = r8.A02     // Catch:{ all -> 0x04bc }
            monitor-exit(r8)     // Catch:{ all -> 0x04bf }
            com.whatsapp.jid.UserJid r8 = r5.A0L()     // Catch:{ all -> 0x04bf }
            java.lang.String r10 = X.AnonymousClass143.A03(r8)     // Catch:{ all -> 0x04bf }
            X.12P r8 = r13.A03     // Catch:{ all -> 0x04bf }
            X.1M0 r9 = r8.A05()     // Catch:{ all -> 0x04bf }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x04b2 }
            r8.<init>()     // Catch:{ all -> 0x04b2 }
            if (r11 == 0) goto L_0x03c5
            java.lang.String r14 = "last_read_receipt_sent_message_table_id"
            java.lang.Long r11 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x04b2 }
            r8.put(r14, r11)     // Catch:{ all -> 0x04b2 }
        L_0x03c5:
            java.lang.String r11 = "last_read_message_table_id"
            java.lang.Long r14 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x04b2 }
            r8.put(r11, r14)     // Catch:{ all -> 0x04b2 }
            java.lang.String r14 = "unseen_count"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x04b2 }
            r8.put(r14, r11)     // Catch:{ all -> 0x04b2 }
            java.lang.String r11 = "first_unread_message_table_id"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x04b2 }
            r8.put(r11, r2)     // Catch:{ all -> 0x04b2 }
            java.lang.String r2 = "autodownload_limit_message_table_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x04b2 }
            r8.put(r2, r0)     // Catch:{ all -> 0x04b2 }
            X.14e r1 = r9.A02     // Catch:{ all -> 0x04b2 }
            java.lang.String r25 = "status"
            java.lang.String r26 = "jid_row_id=?"
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x04b2 }
            com.whatsapp.jid.UserJid r0 = r0.A02(r10)     // Catch:{ all -> 0x04b2 }
            java.lang.String[] r28 = X.AnonymousClass16E.A04(r13, r0)     // Catch:{ all -> 0x04b2 }
            java.lang.String r0 = "updateStatus/UPDATE"
            java.lang.String r27 = X.AnonymousClass16E.A00(r0)     // Catch:{ all -> 0x04b2 }
            r23 = r1
            r24 = r8
            int r0 = r23.A01(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x04b2 }
            if (r0 != 0) goto L_0x0422
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04b2 }
            r1.<init>()     // Catch:{ all -> 0x04b2 }
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/no status saved for "
            r1.append(r0)     // Catch:{ all -> 0x04b2 }
            r1.append(r10)     // Catch:{ all -> 0x04b2 }
            java.lang.String r0 = ";"
            r1.append(r0)     // Catch:{ all -> 0x04b2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04b2 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04b2 }
        L_0x0422:
            r9.close()     // Catch:{ all -> 0x04bf }
            X.11F r0 = r5.A0J()     // Catch:{ all -> 0x04bf }
            boolean r0 = r0 instanceof X.C177638e7     // Catch:{ all -> 0x04bf }
            if (r0 == 0) goto L_0x04ab
            X.12i r10 = r4.A0E     // Catch:{ all -> 0x04bf }
            r0 = 0
            long r13 = r10.A00(r7, r0)     // Catch:{ all -> 0x04bf }
            X.16F r2 = r4.A0F     // Catch:{ all -> 0x04bf }
            X.3SA r8 = r2.A00(r5)     // Catch:{ all -> 0x04bf }
            boolean r0 = r8.A00()     // Catch:{ all -> 0x04bf }
            if (r0 != 0) goto L_0x048c
            long r0 = r8.A01     // Catch:{ all -> 0x04bf }
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x04ab
            java.lang.String r9 = r8.A04     // Catch:{ all -> 0x04bf }
            X.0wo r0 = r4.A02     // Catch:{ all -> 0x04bf }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x04bf }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x04bf }
            r8.<init>()     // Catch:{ all -> 0x04bf }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x04bf }
            java.lang.String r0 = "first_seen_timestamp"
            r8.put(r0, r1)     // Catch:{ all -> 0x04bf }
            X.12P r0 = r2.A00     // Catch:{ all -> 0x04bf }
            X.1M0 r7 = r0.A05()     // Catch:{ all -> 0x04bf }
            X.14e r3 = r7.A02     // Catch:{ all -> 0x0487 }
            java.lang.String r25 = "message_status_psa_campaign"
            java.lang.String r26 = "campaign_id=? AND first_seen_timestamp=?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0487 }
            r0 = 0
            r2[r0] = r9     // Catch:{ all -> 0x0487 }
            r1 = 1
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ all -> 0x0487 }
            r2[r1] = r0     // Catch:{ all -> 0x0487 }
            java.lang.String r27 = "message_status_psa_campaign.UPDATE_SEEN_TIMESTAMP"
            r23 = r3
            r24 = r8
            r28 = r2
            r23.A01(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0487 }
            goto L_0x04a8
        L_0x0487:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x04b7 }
            goto L_0x04bb
        L_0x048c:
            long r2 = r5.A0I     // Catch:{ all -> 0x04bf }
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x04ab
            r0 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 + r0
            X.0wo r0 = r4.A02     // Catch:{ all -> 0x04bf }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x04bf }
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 + r8
            r10.A03(r7, r2)     // Catch:{ all -> 0x04bf }
            java.lang.String r2 = "status_psa_exipration_time"
            r10.A03(r2, r0)     // Catch:{ all -> 0x04bf }
            goto L_0x04ab
        L_0x04a8:
            r7.close()     // Catch:{ all -> 0x04bf }
        L_0x04ab:
            r18.A00()     // Catch:{ all -> 0x04bf }
            r18.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c9, Error | RuntimeException -> 0x0e75 }
            goto L_0x04d2
        L_0x04b2:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x04b7 }
            goto L_0x04bb
        L_0x04b7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04bf }
        L_0x04bb:
            throw r1     // Catch:{ all -> 0x04bf }
        L_0x04bc:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x04bf }
            throw r0     // Catch:{ all -> 0x04bf }
        L_0x04bf:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x04c4 }
            goto L_0x04c8
        L_0x04c4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c9, Error | RuntimeException -> 0x0e75 }
        L_0x04c8:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c9, Error | RuntimeException -> 0x0e75 }
        L_0x04c9:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0e7a }
            X.12s r0 = r4.A0C     // Catch:{ all -> 0x0e7a }
            r0.A03()     // Catch:{ all -> 0x0e7a }
        L_0x04d2:
            X.1DQ r0 = r4.A07     // Catch:{ all -> 0x0e7a }
            android.os.Handler r2 = r0.A02     // Catch:{ all -> 0x0e7a }
            r1 = 27
            X.1j7 r0 = new X.1j7     // Catch:{ all -> 0x0e7a }
            r0.<init>(r4, r5, r1)     // Catch:{ all -> 0x0e7a }
            r2.post(r0)     // Catch:{ all -> 0x0e7a }
            r19.close()
            goto L_0x0329
        L_0x04e5:
            com.whatsapp.jid.UserJid r0 = r5.A0L()
            X.3Sz r4 = r3.A08(r0)
            goto L_0x030d
        L_0x04ef:
            r8 = r7
            goto L_0x028e
        L_0x04f2:
            java.lang.Object r8 = r7.A00
            X.0zV r8 = (X.C21600zV) r8
            java.lang.Object r6 = r7.A01
            X.4TY r6 = (X.AnonymousClass4TY) r6
            java.lang.Object r5 = r7.A02
            X.0zr r5 = (X.C21820zr) r5
            X.005 r0 = r8.A04
            java.lang.Object r4 = r0.get()
            X.0zE r4 = (X.C21430zE) r4
            java.util.concurrent.atomic.AtomicInteger r0 = X.C21600zV.A09
            int r3 = r0.getAndIncrement()
            r2 = 916783105(0x36a50001, float:4.9173836E-6)
            r4.markerStart(r2, r3)
            java.lang.String r1 = r6.BDe()
            java.lang.String r0 = "job"
            r4.markerAnnotate((int) r2, (int) r3, (java.lang.String) r0, (java.lang.String) r1)
            int r1 = r5.A00
            java.lang.String r0 = "marker_id"
            r4.markerAnnotate((int) r2, (int) r3, (java.lang.String) r0, (int) r1)
            r6.B5q(r5)     // Catch:{ Exception -> 0x052a }
            r0 = 2
            r4.markerEnd(r2, r3, r0)     // Catch:{ Exception -> 0x052a }
            goto L_0x052e
        L_0x052a:
            r0 = 3
            r4.markerEnd(r2, r3, r0)     // Catch:{ all -> 0x0e82 }
        L_0x052e:
            java.util.concurrent.ConcurrentHashMap r1 = r8.A05
            int r0 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x001e
            r0.decrementAndGet()
            return
        L_0x0542:
            java.lang.Object r2 = r7.A00
            X.1cC r2 = (X.C31671cC) r2
            java.lang.Object r3 = r7.A01
            X.9uj r3 = (X.C207209uj) r3
            java.lang.Object r6 = r7.A02
            X.9nx r6 = (X.C203399nx) r6
            X.1cE r1 = r2.A0F
            r12 = 0
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            com.whatsapp.jid.Jid r3 = r3.A02
            X.11F r0 = X.AnonymousClass143.A00(r3)
            X.147 r0 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r0)
            r10 = 0
            java.lang.String r4 = "notification"
            X.C203399nx.A0A(r6, r4)     // Catch:{ 19b -> 0x0f27 }
            java.lang.String r4 = "participant"
            java.lang.String[] r11 = new java.lang.String[]{r4}     // Catch:{ 19b -> 0x0f27 }
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            r4 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch:{ 19b -> 0x0f27 }
            r4 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch:{ 19b -> 0x0f27 }
            X.C203379ns.A03(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ 19b -> 0x0f27 }
            X.AOJ r5 = X.AOJ.A00     // Catch:{ 19b -> 0x0f27 }
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ 19b -> 0x0f27 }
            X.C203539oF.A06(r6, r5, r4)     // Catch:{ 19b -> 0x0f27 }
            java.lang.String r5 = "reports"
            java.lang.String r4 = "report"
            java.lang.String[] r15 = new java.lang.String[]{r5, r4}     // Catch:{ 19b -> 0x0f27 }
            X.AOK r14 = X.AOK.A00     // Catch:{ 19b -> 0x0f27 }
            r16 = 1
            r18 = 10000(0x2710, double:4.9407E-320)
            X.AnonymousClass00C.A0D(r6, r12)     // Catch:{ 19b -> 0x0f27 }
            r13 = r6
            java.util.ArrayList r4 = X.C203539oF.A09(r13, r14, r15, r16, r18)     // Catch:{ 19b -> 0x0f27 }
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r4.iterator()
        L_0x05a9:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x05e1
            java.lang.Object r4 = r8.next()
            X.1jN r4 = (X.C35861jN) r4
            java.lang.Object r5 = r4.A00
            java.util.List r5 = (java.util.List) r5
            X.AnonymousClass00C.A08(r5)
            r4 = 10
            int r4 = X.AnonymousClass03U.A06(r5, r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            java.util.Iterator r5 = r5.iterator()
        L_0x05cb:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x05dd
            java.lang.Object r4 = r5.next()
            X.1jL r4 = (X.C35841jL) r4
            java.lang.Object r4 = r4.A00
            r6.add(r4)
            goto L_0x05cb
        L_0x05dd:
            X.AnonymousClass03Y.A0B(r6, r7)
            goto L_0x05a9
        L_0x05e1:
            X.0wQ r4 = r1.A00
            r4.A0G()
            com.whatsapp.jid.PhoneUserJid r6 = r4.A03
            X.C18740tg.A06(r6)
            X.AnonymousClass00C.A08(r6)
            boolean r4 = r7 instanceof java.util.Collection
            if (r4 == 0) goto L_0x05f9
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x05f9
            return
        L_0x05f9:
            java.util.Iterator r5 = r7.iterator()
        L_0x05fd:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x001e
            java.lang.Object r4 = r5.next()
            boolean r4 = X.AnonymousClass00C.A0J(r4, r6)
            if (r4 != 0) goto L_0x05fd
            X.16D r4 = r1.A01
            X.141 r5 = r4.A0A(r0)
            if (r5 == 0) goto L_0x001e
            X.1Or r4 = r1.A04
            boolean r4 = r4.A01(r5)
            if (r4 == 0) goto L_0x001e
            X.1CR r5 = r1.A05
            java.lang.String r4 = r0.getRawString()
            X.3LI r4 = X.AnonymousClass1CR.A02(r5, r4)
            boolean r4 = r4.A0B()
            r4 = r4 ^ 1
            X.12q r1 = r1.A03
            X.3Qp r0 = r1.A09(r0, r12)
            if (r4 != 0) goto L_0x001e
            if (r0 == 0) goto L_0x0e97
            boolean r0 = r0.A0i
            if (r0 == 0) goto L_0x0e97
            return
        L_0x063c:
            java.lang.Object r4 = r7.A00
            X.1cC r4 = (X.C31671cC) r4
            java.lang.Object r3 = r7.A01
            X.147 r3 = (X.AnonymousClass147) r3
            java.lang.Object r2 = r7.A02
            X.147 r2 = (X.AnonymousClass147) r2
            X.16D r0 = r4.A05
            X.141 r0 = r0.A0D(r3)
            boolean r0 = r0.A0c
            if (r0 != 0) goto L_0x001e
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r1 = r4.A04
            X.1cD r0 = r4.A0D
            boolean r0 = r0.A00()
            r1.A05(r3, r2, r0)
            return
        L_0x065e:
            java.lang.Object r6 = r7.A00
            X.1bU r6 = (X.C31231bU) r6
            java.lang.Object r5 = r7.A01
            X.9uj r5 = (X.C207209uj) r5
            java.lang.Object r2 = r7.A02
            X.9nx r2 = (X.C203399nx) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "identity changed notification received; stanzaKey="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.Jid r0 = r5.A02
            com.whatsapp.jid.DeviceJid r10 = com.whatsapp.jid.DeviceJid.of(r0)
            X.C18740tg.A06(r10)
            X.6EZ r7 = X.C133256Xm.A02(r10)
            X.18I r0 = r6.A05
            X.79X r4 = X.AnonymousClass18I.A00(r7, r0)
            X.AnonymousClass18I.A03(r4, r0)
            X.189 r3 = r6.A03     // Catch:{ all -> 0x0f30 }
            X.3FZ r8 = r3.A0B(r7)     // Catch:{ all -> 0x0f30 }
            java.lang.String r0 = "identity"
            X.9nx r9 = r2.A0c(r0)     // Catch:{ all -> 0x0f30 }
            java.lang.String r0 = "registration"
            X.9nx r0 = r2.A0c(r0)     // Catch:{ all -> 0x0f30 }
            if (r8 == 0) goto L_0x06db
            if (r9 == 0) goto L_0x06df
            if (r0 == 0) goto L_0x06df
            X.0yC r2 = r6.A06     // Catch:{ all -> 0x0f30 }
            r1 = 1296(0x510, float:1.816E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x0f30 }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x0f30 }
            if (r0 == 0) goto L_0x06df
            byte[] r2 = r9.A01     // Catch:{ all -> 0x0f30 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x0f30 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x0f30 }
            r1 = 5
            X.3IG r0 = new X.3IG     // Catch:{ all -> 0x0f30 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0f30 }
            X.3FZ r2 = new X.3FZ     // Catch:{ all -> 0x0f30 }
            r2.<init>(r0)     // Catch:{ all -> 0x0f30 }
            X.3IG r1 = r2.A00     // Catch:{ all -> 0x0f30 }
            X.3IG r0 = r8.A00     // Catch:{ all -> 0x0f30 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0f30 }
            if (r0 != 0) goto L_0x06db
            r3.A0E(r7)     // Catch:{ all -> 0x0f30 }
            r3.A0Q(r2, r7)     // Catch:{ all -> 0x0f30 }
        L_0x06db:
            r6.A05(r5)     // Catch:{ all -> 0x0f30 }
            goto L_0x06ed
        L_0x06df:
            X.1XT r3 = r6.A01     // Catch:{ all -> 0x0f30 }
            r2 = 1
            com.whatsapp.jid.DeviceJid[] r1 = new com.whatsapp.jid.DeviceJid[r2]     // Catch:{ all -> 0x0f30 }
            r0 = 0
            r1[r0] = r10     // Catch:{ all -> 0x0f30 }
            r0 = 8
            r3.A04(r1, r0, r2)     // Catch:{ all -> 0x0f30 }
            goto L_0x06db
        L_0x06ed:
            if (r4 == 0) goto L_0x001e
            r4.close()
            return
        L_0x06f3:
            java.lang.Object r4 = r7.A02
            X.1Nx r4 = (X.C27361Nx) r4
            java.util.HashMap r0 = r4.A04
            java.lang.Object r3 = r7.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x001e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "presencemgr/timeout/"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.Object r1 = r7.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A08(r3, r1)
            X.1Cd r0 = r4.A01
            r0.A00(r3)
            return
        L_0x072c:
            java.lang.Object r0 = r7.A00
            X.1i0 r0 = (X.C35011i0) r0
            java.lang.Object r5 = r7.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r7.A02
            X.2bV r4 = (X.AnonymousClass2bV) r4
            X.005 r0 = r0.A0E
            java.lang.Object r3 = r0.get()
            X.6V7 r3 = (X.AnonymousClass6V7) r3
            java.lang.String r1 = "XFamilyCrosspostRequestSessionManager/handleNewAutoShareRecordCreationForTextStatus start text status burning"
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.1Ua r0 = r3.A03
            X.0yC r2 = r0.A01
            r1 = 4437(0x1155, float:6.218E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0763
            X.005 r0 = r3.A08
            java.lang.Object r0 = r0.get()
            X.67d r0 = (X.C1271467d) r0
            r0.A00(r5, r4)
            r3.A04(r4)
            return
        L_0x0763:
            r3.A03(r4)
            java.util.List r0 = java.util.Collections.singletonList(r4)
            X.AnonymousClass00C.A08(r0)
            X.AnonymousClass6V7.A02(r5, r3, r0)
            return
        L_0x0771:
            java.lang.Object r1 = r7.A00
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r7.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r7.A02
            X.1hv r6 = (X.C34961hv) r6
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0790:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x07a6
            java.lang.Object r0 = r2.next()
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            long r0 = r0.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.add(r0)
            goto L_0x0790
        L_0x07a6:
            X.17Y r3 = r6.A00
            X.1hs r2 = r6.A03
            X.005 r0 = r6.A04
            java.lang.Object r0 = r0.get()
            X.6VF r0 = (X.AnonymousClass6VF) r0
            r0.A06(r4, r5)
            r1 = 40
            X.72w r0 = new X.72w
            r0.<init>(r2, r4, r1)
            r3.A0H(r0)
            return
        L_0x07c0:
            java.lang.Object r0 = r7.A00
            X.1hq r0 = (X.C34911hq) r0
            java.lang.Object r2 = r7.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r7.A02
            X.2bV r1 = (X.AnonymousClass2bV) r1
            X.005 r0 = r0.A0A
            java.lang.Object r0 = r0.get()
            X.67T r0 = (X.AnonymousClass67T) r0
            r0.A00(r2, r1)
            return
        L_0x07d8:
            java.lang.Object r5 = r7.A00
            X.1E9 r5 = (X.AnonymousClass1E9) r5
            java.lang.Object r4 = r7.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r7.A02
            java.util.List r3 = (java.util.List) r3
            X.19A r2 = r5.A04
            X.0wD r1 = r5.A02
            X.9IZ r0 = new X.9IZ
            r0.<init>(r5, r4)
            X.AI2 r10 = new X.AI2
            r10.<init>(r1, r2, r0, r3)
            X.0wD r0 = r10.A00
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0804
            X.9IZ r0 = r10.A02
            X.1E9 r0 = r0.A00
            X.1Cm r0 = r0.A08
            r0.A01()
            return
        L_0x0804:
            X.19A r9 = r10.A01
            java.lang.String r12 = r9.A09()
            r13 = 290(0x122, float:4.06E-43)
            java.util.List r1 = r10.A03
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x081d:
            boolean r0 = r5.hasNext()
            java.lang.String r7 = "id"
            r3 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0841
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            X.1AL[] r2 = new X.AnonymousClass1AL[r3]
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r7, (java.lang.String) r1)
            r2[r8] = r0
            java.lang.String r1 = "notice"
            X.9nx r0 = new X.9nx
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x081d
        L_0x0841:
            X.1AL[] r2 = new X.AnonymousClass1AL[r3]
            java.lang.String r6 = "type"
            java.lang.String r1 = "session_update"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r6, (java.lang.String) r1)
            r2[r8] = r0
            X.9nx[] r0 = new X.C203399nx[r8]
            java.lang.Object[] r1 = r4.toArray(r0)
            X.9nx[] r1 = (X.C203399nx[]) r1
            java.lang.String r0 = "request"
            X.9nx r5 = new X.9nx
            r5.<init>((java.lang.String) r0, (X.AnonymousClass1AL[]) r2, (X.C203399nx[]) r1)
            r0 = 4
            X.1AL[] r4 = new X.AnonymousClass1AL[r0]
            X.8e2 r2 = X.C177588e2.A00
            java.lang.String r1 = "to"
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r4[r8] = r0
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r7, (java.lang.String) r12)
            r4[r3] = r0
            r3 = 2
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "tos"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r4[r3] = r0
            r2 = 3
            java.lang.String r1 = "set"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r6, (java.lang.String) r1)
            r4[r2] = r0
            java.lang.String r0 = "iq"
            X.9nx r11 = new X.9nx
            r11.<init>((X.C203399nx) r5, (java.lang.String) r0, (X.AnonymousClass1AL[]) r4)
            r14 = 32000(0x7d00, double:1.581E-319)
            r9.A0F(r10, r11, r12, r13, r14)
            return
        L_0x0895:
            java.lang.Object r6 = r7.A00
            X.1b9 r6 = (X.C31021b9) r6
            java.lang.Object r2 = r7.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r5 = r7.A02
            long r10 = java.lang.System.currentTimeMillis()
            X.1Jh r3 = r6.A06
            r0 = 900000(0xdbba0, double:4.44659E-318)
            long r8 = r10 - r0
            r0 = 4
            java.lang.String[] r7 = new java.lang.String[r0]
            X.163 r0 = r3.A02
            long r0 = r0.A08(r2)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r7[r0] = r1
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r7[r1] = r0
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0 = 2
            r7[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r10)
            r0 = 3
            r7[r0] = r1
            X.12P r0 = r3.A04
            X.1M0 r4 = r0.get()
            X.14e r2 = r4.A02     // Catch:{ all -> 0x090a }
            java.lang.String r1 = " SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE key_chat_row_id = ?  AND is_upcoming = ?  AND scheduled_timestamp > ?  AND scheduled_timestamp <= ?  ORDER BY scheduled_timestamp DESC  LIMIT 1"
            java.lang.String r0 = "SELECT_LATEST_SCHEDULED_CALL_IN_TIMERANGE_IN_CHAT"
            android.database.Cursor r2 = r2.A09(r1, r0, r7)     // Catch:{ all -> 0x090a }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x08fe }
            if (r0 != 0) goto L_0x08e7
            r3 = 0
            goto L_0x08eb
        L_0x08e7:
            X.3KV r3 = X.C26211Jh.A00(r2, r3)     // Catch:{ all -> 0x08fe }
        L_0x08eb:
            r2.close()     // Catch:{ all -> 0x090a }
            r4.close()
            X.17Y r2 = r6.A00
            r1 = 42
            X.1jD r0 = new X.1jD
            r0.<init>(r5, r3, r1)
            r2.A0H(r0)
            return
        L_0x08fe:
            r1 = move-exception
            if (r2 == 0) goto L_0x0909
            r2.close()     // Catch:{ all -> 0x0905 }
            goto L_0x0909
        L_0x0905:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x090a }
        L_0x0909:
            throw r1     // Catch:{ all -> 0x090a }
        L_0x090a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0f37 }
            throw r1
        L_0x090f:
            java.lang.Object r0 = r7.A00
            X.1QD r0 = (X.AnonymousClass1QD) r0
            java.lang.Object r1 = r7.A01
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r7 = r7.A02
            android.os.Bundle r7 = (android.os.Bundle) r7
            X.0wG r0 = r0.A00
            android.content.Context r0 = r0.A00
            X.1ki r3 = new X.1ki
            r3.<init>()
            java.lang.String r2 = "com.whatsapp.permission.REGISTRATION"
            r4 = 0
            r5 = 1
            r6 = r4
            r0.sendOrderedBroadcast(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x092d:
            java.lang.Object r4 = r7.A00
            X.1bW r4 = (X.C31251bW) r4
            java.lang.Object r3 = r7.A01
            X.9uj r3 = (X.C207209uj) r3
            java.lang.Object r1 = r7.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "PSANotificationHandler/onMessageServerPsa"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r1.size()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r2.<init>(r0)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
        L_0x094b:
            boolean r0 = r10.hasNext()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            if (r0 == 0) goto L_0x09c0
            java.lang.Object r5 = r10.next()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.3SA r5 = (X.AnonymousClass3SA) r5     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.3T1 r6 = r5.A05     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            byte[] r0 = r6.A1V()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.8SX r9 = X.AnonymousClass8SX.A0i(r0)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            if (r9 == 0) goto L_0x094b
            X.1c0 r0 = r4.A09     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.8SG r7 = r0.A00(r9)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r14 = 0
            if (r7 == 0) goto L_0x09be
            int r1 = r7.bitField0_     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x09be
            X.8Oq r1 = r7.actionLink_     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r0 = r1
            if (r1 != 0) goto L_0x097a
            X.8Oq r1 = X.C172648Oq.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
        L_0x097a:
            java.lang.String r14 = r1.url_     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            if (r0 != 0) goto L_0x0980
            X.8Oq r0 = X.C172648Oq.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
        L_0x0980:
            java.lang.String r15 = r0.buttonTitle_     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
        L_0x0982:
            X.0xh r8 = r4.A08     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.3Qa r0 = r6.A1J     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.3Qa r7 = new X.3Qa     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r7.<init>(r0)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            long r0 = r6.A0I     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.9T0 r0 = X.C1899296d.A00(r9, r7, r0)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.9YL r0 = r0.A00()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.3T1 r12 = r8.A00(r0)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.8e7 r0 = X.C177638e7.A00     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r12.A0q(r0)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.0wG r0 = r4.A01     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            android.content.Context r1 = r0.A00     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r0 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r12.A0r = r0     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            long r0 = r6.A0I     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r12.A0I = r0     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            java.lang.String r13 = r5.A04     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            long r0 = r5.A00     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.3SA r11 = new X.3SA     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r2.add(r11)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            goto L_0x094b
        L_0x09be:
            r15 = r14
            goto L_0x0982
        L_0x09c0:
            X.0xM r5 = r4.A03     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.1C7 r0 = r5.A0F     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            android.os.Handler r0 = r0.A00     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.C18740tg.A02(r0)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            boolean r0 = r2.isEmpty()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            if (r0 != 0) goto L_0x0a75
            java.util.Iterator r12 = r2.iterator()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
        L_0x09d3:
            boolean r0 = r12.hasNext()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            if (r0 == 0) goto L_0x0a75
            java.lang.Object r2 = r12.next()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.3SA r2 = (X.AnonymousClass3SA) r2     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.3T1 r8 = r2.A05     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            boolean r1 = r8.A1Y     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r0 = -1
            if (r1 == 0) goto L_0x09e8
            r0 = 22
        L_0x09e8:
            X.34U r0 = r5.A0Q(r8, r0)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            boolean r9 = r0.A00     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.16F r7 = r5.A0n     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            long r0 = r8.A1N     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r10 = -1
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0a4b
            boolean r0 = r2.A00()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            if (r0 != 0) goto L_0x0a4b
            X.12P r0 = r7.A00     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.1M0 r7 = r0.A05()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0a6b }
            r6.<init>()     // Catch:{ all -> 0x0a6b }
            java.lang.String r10 = "message_row_id"
            long r0 = r8.A1N     // Catch:{ all -> 0x0a6b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0a6b }
            r6.put(r10, r0)     // Catch:{ all -> 0x0a6b }
            java.lang.String r1 = "campaign_id"
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x0a6b }
            r6.put(r1, r0)     // Catch:{ all -> 0x0a6b }
            java.lang.String r10 = "duration"
            long r0 = r2.A00     // Catch:{ all -> 0x0a6b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0a6b }
            r6.put(r10, r0)     // Catch:{ all -> 0x0a6b }
            java.lang.String r10 = "first_seen_timestamp"
            long r0 = r2.A01     // Catch:{ all -> 0x0a6b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0a6b }
            r6.put(r10, r0)     // Catch:{ all -> 0x0a6b }
            java.lang.String r1 = "action_link_url"
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0a6b }
            r6.put(r1, r0)     // Catch:{ all -> 0x0a6b }
            java.lang.String r1 = "action_link_button_title"
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x0a6b }
            r6.put(r1, r0)     // Catch:{ all -> 0x0a6b }
            X.14e r2 = r7.A02     // Catch:{ all -> 0x0a6b }
            java.lang.String r1 = "message_status_psa_campaign"
            java.lang.String r0 = "message_status_psa_campaign.INSERT_OR_REPLACE_STATUS_PSA_CAMPAIGN_FOR_ROW_ID_SQL"
            r2.A06(r1, r0, r6)     // Catch:{ all -> 0x0a6b }
            r7.close()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
        L_0x0a4b:
            if (r9 == 0) goto L_0x09d3
            X.1Cf r1 = r5.A0K     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.3Qa r0 = r8.A1J     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.11F r2 = r0.A00     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            java.lang.Iterable r0 = r1.getObservers()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
        L_0x0a5b:
            boolean r0 = r1.hasNext()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            if (r0 == 0) goto L_0x09d3
            java.lang.Object r0 = r1.next()     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            X.1Ct r0 = (X.C24521Ct) r0     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            r0.BUf(r2)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            goto L_0x0a5b
        L_0x0a6b:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0a70 }
            goto L_0x0a74
        L_0x0a70:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
        L_0x0a74:
            throw r1     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
        L_0x0a75:
            r4.A05(r3)     // Catch:{ 186 -> 0x0a7d, 1Ta -> 0x0a79 }
            return
        L_0x0a79:
            r1 = move-exception
            java.lang.String r0 = "recvmessagelistener/on-message-server-psa/bade2e:"
            goto L_0x0a80
        L_0x0a7d:
            r1 = move-exception
            java.lang.String r0 = "recvmessagelistener/on-message-server-psa/invalidproto:"
        L_0x0a80:
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0a84:
            java.lang.Object r4 = r7.A00
            X.1bW r4 = (X.C31251bW) r4
            java.lang.Object r3 = r7.A01
            X.9uj r3 = (X.C207209uj) r3
            java.lang.Object r0 = r7.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            java.lang.Object r1 = r0.get(r6)
            X.9nx r1 = (X.C203399nx) r1
            if (r1 == 0) goto L_0x0de5
            java.lang.String r0 = "message"
            java.util.List r0 = r1.A0j(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0aa8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0dcd
            java.lang.Object r2 = r7.next()
            X.9nx r2 = (X.C203399nx) r2
            if (r2 == 0) goto L_0x0aa8
            java.lang.String r1 = "id"
            r0 = 0
            java.lang.String r2 = r2.A0i(r1, r0)
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x0aa8
            X.8e7 r0 = X.C177638e7.A00
            X.3Qa r1 = new X.3Qa
            r1.<init>(r0, r2, r6)
            X.1A1 r0 = r4.A0B
            X.3T1 r2 = r0.A03(r1)
            if (r2 == 0) goto L_0x0aa8
            r5.add(r2)
            X.0xM r1 = r4.A03
            r0 = 1
            r1.A0o(r2, r0, r0)
            goto L_0x0aa8
        L_0x0adc:
            java.lang.Object r4 = r7.A00
            X.1bW r4 = (X.C31251bW) r4
            java.lang.Object r3 = r7.A01
            X.9uj r3 = (X.C207209uj) r3
            java.lang.Object r0 = r7.A02
            X.9nx r0 = (X.C203399nx) r0
            X.8vS r2 = new X.8vS     // Catch:{ 19b -> 0x0b5f }
            r2.<init>(r0)     // Catch:{ 19b -> 0x0b5f }
            java.lang.String r0 = r2.toString()     // Catch:{ 19b -> 0x0b5f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 19b -> 0x0b5f }
            X.9dQ r6 = new X.9dQ     // Catch:{ 19b -> 0x0b5f }
            r6.<init>()     // Catch:{ 19b -> 0x0b5f }
            X.1bZ r1 = r4.A0G     // Catch:{ 19b -> 0x0b5f }
            X.00T r0 = r1.A02     // Catch:{ 19b -> 0x0b5f }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 19b -> 0x0b5f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ 19b -> 0x0b5f }
            boolean r0 = r0.booleanValue()     // Catch:{ 19b -> 0x0b5f }
            if (r0 == 0) goto L_0x0b1d
            X.00T r0 = r1.A04     // Catch:{ 19b -> 0x0b5f }
            java.lang.Object r5 = r0.getValue()     // Catch:{ 19b -> 0x0b5f }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ 19b -> 0x0b5f }
        L_0x0b11:
            X.8rr r0 = r2.A00     // Catch:{ 19b -> 0x0b5f }
            java.lang.Object r0 = r0.A00     // Catch:{ 19b -> 0x0b5f }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ 19b -> 0x0b5f }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ 19b -> 0x0b5f }
            r2.<init>(r0)     // Catch:{ 19b -> 0x0b5f }
            goto L_0x0b1f
        L_0x0b1d:
            r5 = 0
            goto L_0x0b11
        L_0x0b1f:
            if (r5 == 0) goto L_0x0b41
            boolean r0 = r5.isEmpty()     // Catch:{ 19b -> 0x0b5f }
            if (r0 != 0) goto L_0x0b41
            int r1 = r2.size()     // Catch:{ 19b -> 0x0b5f }
        L_0x0b2b:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0b41
            java.lang.Object r0 = r2.get(r1)     // Catch:{ 19b -> 0x0b5f }
            X.8t5 r0 = (X.C184838t5) r0     // Catch:{ 19b -> 0x0b5f }
            java.lang.String r0 = r0.A01     // Catch:{ 19b -> 0x0b5f }
            boolean r0 = r5.contains(r0)     // Catch:{ 19b -> 0x0b5f }
            if (r0 == 0) goto L_0x0b2b
            r2.remove(r1)     // Catch:{ 19b -> 0x0b5f }
            goto L_0x0b2b
        L_0x0b41:
            java.util.ArrayList r0 = r6.A01(r2)     // Catch:{ 19b -> 0x0b5f }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 19b -> 0x0b5f }
        L_0x0b49:
            boolean r0 = r2.hasNext()     // Catch:{ 19b -> 0x0b5f }
            if (r0 == 0) goto L_0x0b5b
            java.lang.Object r1 = r2.next()     // Catch:{ 19b -> 0x0b5f }
            X.9Ic r1 = (X.C192669Ic) r1     // Catch:{ 19b -> 0x0b5f }
            X.1bX r0 = r4.A0D     // Catch:{ 19b -> 0x0b5f }
            r0.A04(r1)     // Catch:{ 19b -> 0x0b5f }
            goto L_0x0b49
        L_0x0b5b:
            r4.A05(r3)     // Catch:{ 19b -> 0x0b5f }
            return
        L_0x0b5f:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PSANotificationHandler/QpSurface corrupted : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A06(r3)
            return
        L_0x0b78:
            java.lang.Object r0 = r7.A00
            X.1bW r0 = (X.C31251bW) r0
            java.lang.Object r1 = r7.A01
            X.9uj r1 = (X.C207209uj) r1
            java.lang.Object r6 = r7.A02
            X.9nx r6 = (X.C203399nx) r6
            r13 = 0
            java.lang.String r2 = "notification"
            X.C203399nx.A0A(r6, r2)     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r2 = "type"
            java.lang.String[] r11 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x0cd9 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0cd9 }
            r2 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0cd9 }
            r12 = 0
            java.lang.String r10 = "psa"
            X.C203379ns.A03(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r2 = "from"
            java.lang.String[] r11 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x0cd9 }
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            r3 = r13
            r2 = 0
            r10 = r13
            X.C203379ns.A03(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0cd9 }
            X.ARA r5 = X.ARA.A00     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ Exception -> 0x0cd9 }
            X.C203539oF.A06(r6, r5, r4)     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r5 = "psa_wakeup"
            java.lang.String r4 = "promotions"
            java.lang.String[] r5 = new java.lang.String[]{r5, r4}     // Catch:{ Exception -> 0x0cd9 }
            X.6yF r4 = X.C148056yF.A00     // Catch:{ Exception -> 0x0cd9 }
            java.lang.Object r4 = X.C203379ns.A02(r6, r4, r5)     // Catch:{ Exception -> 0x0cd9 }
            X.1jK r4 = (X.C35831jK) r4     // Catch:{ Exception -> 0x0cd9 }
            if (r4 == 0) goto L_0x0c09
            java.lang.Object r5 = r4.A00     // Catch:{ Exception -> 0x0cd9 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ Exception -> 0x0cd9 }
            boolean r4 = r5.isEmpty()     // Catch:{ Exception -> 0x0cd9 }
            if (r4 != 0) goto L_0x0cd0
            java.lang.Object r4 = r5.get(r12)     // Catch:{ Exception -> 0x0cd9 }
            X.1jO r4 = (X.C35871jO) r4     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r13 = r4.A00     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r14 = r4.A01     // Catch:{ Exception -> 0x0cd9 }
        L_0x0be5:
            r4 = 11231(0x2bdf, float:1.5738E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r5 = "whatsapp_push_notification_event"
            android.content.Context r6 = r0.A00     // Catch:{ Exception -> 0x0cd9 }
            X.3JN r4 = new X.3JN     // Catch:{ Exception -> 0x0cd9 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0cd9 }
            X.3uO r12 = new X.3uO     // Catch:{ Exception -> 0x0cd9 }
            r12.<init>(r4)     // Catch:{ Exception -> 0x0cd9 }
            X.9Ry r9 = new X.9Ry     // Catch:{ Exception -> 0x0cd9 }
            r9.<init>(r0, r12, r7, r13)     // Catch:{ Exception -> 0x0cd9 }
            X.0yC r7 = r0.A07     // Catch:{ Exception -> 0x0cd9 }
            r6 = 7797(0x1e75, float:1.0926E-41)
            X.0yV r4 = X.C21000yV.A02     // Catch:{ Exception -> 0x0cd9 }
            boolean r4 = X.C20800yB.A01(r4, r7, r6)     // Catch:{ Exception -> 0x0cd9 }
            goto L_0x0c0b
        L_0x0c09:
            r14 = r13
            goto L_0x0be5
        L_0x0c0b:
            if (r4 == 0) goto L_0x0c1b
            X.1bg r2 = r0.A0E     // Catch:{ Exception -> 0x0cd9 }
            r3 = 11231(0x2bdf, float:1.5738E-41)
            X.1bh r2 = r2.A00     // Catch:{ Exception -> 0x0cd9 }
            X.ATi r2 = r2.A00(r12, r5, r3)     // Catch:{ Exception -> 0x0cd9 }
            X.C31251bW.A02(r0, r12, r2, r13)     // Catch:{ Exception -> 0x0cd9 }
            goto L_0x0c95
        L_0x0c1b:
            if (r13 == 0) goto L_0x0c95
            X.1bg r4 = r0.A0E     // Catch:{ Exception -> 0x0cd9 }
            X.1bw r11 = r4.A02     // Catch:{ Exception -> 0x0cd9 }
            if (r14 != 0) goto L_0x0c53
            java.util.Set r13 = java.util.Collections.singleton(r13)     // Catch:{ Exception -> 0x0cd9 }
            X.AnonymousClass00C.A08(r13)     // Catch:{ Exception -> 0x0cd9 }
            r6 = 11231(0x2bdf, float:1.5738E-41)
            X.1bX r4 = r11.A02     // Catch:{ Exception -> 0x0cd9 }
            java.util.ArrayList r7 = r4.A03(r5, r6)     // Catch:{ Exception -> 0x0cd9 }
            r4 = 10
            int r4 = X.AnonymousClass03U.A06(r7, r4)     // Catch:{ Exception -> 0x0cd9 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x0cd9 }
            r8.<init>(r4)     // Catch:{ Exception -> 0x0cd9 }
            java.util.Iterator r5 = r7.iterator()     // Catch:{ Exception -> 0x0cd9 }
        L_0x0c41:
            boolean r4 = r5.hasNext()     // Catch:{ Exception -> 0x0cd9 }
            if (r4 == 0) goto L_0x0c88
            java.lang.Object r4 = r5.next()     // Catch:{ Exception -> 0x0cd9 }
            X.ATi r4 = (X.C21642ATi) r4     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r4 = r4.A0F     // Catch:{ Exception -> 0x0cd9 }
            r8.add(r4)     // Catch:{ Exception -> 0x0cd9 }
            goto L_0x0c41
        L_0x0c53:
            r5 = 11231(0x2bdf, float:1.5738E-41)
            X.19A r7 = r11.A00     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r3 = r7.A09()     // Catch:{ Exception -> 0x0cd9 }
            r4 = 1
            X.1jQ[] r6 = new X.C35891jQ[r4]     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0cd9 }
            X.1jQ r4 = new X.1jQ     // Catch:{ Exception -> 0x0cd9 }
            r4.<init>(r5, r13, r14)     // Catch:{ Exception -> 0x0cd9 }
            r6[r2] = r4     // Catch:{ Exception -> 0x0cd9 }
            java.util.ArrayList r4 = X.AnonymousClass03T.A02(r6)     // Catch:{ Exception -> 0x0cd9 }
            r2 = 16
            X.1jS r10 = new X.1jS     // Catch:{ Exception -> 0x0cd9 }
            r10.<init>((java.util.List) r4, (int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x0cd9 }
            X.9nx r2 = r10.A00     // Catch:{ Exception -> 0x0cd9 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ Exception -> 0x0cd9 }
            X.AI5 r8 = new X.AI5     // Catch:{ Exception -> 0x0cd9 }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0cd9 }
            r11 = 396(0x18c, float:5.55E-43)
            r12 = 0
            r9 = r2
            r10 = r3
            r7.A0K(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0cd9 }
            goto L_0x0c95
        L_0x0c88:
            java.util.Set r4 = X.C007103b.A0f(r8)     // Catch:{ Exception -> 0x0cd9 }
            boolean r4 = r13.equals(r4)     // Catch:{ Exception -> 0x0cd9 }
            if (r4 == 0) goto L_0x0c99
            X.C31511bw.A00(r9, r11, r12, r7, r13)     // Catch:{ Exception -> 0x0cd9 }
        L_0x0c95:
            r0.A05(r1)     // Catch:{ Exception -> 0x0cd9 }
            goto L_0x0ccf
        L_0x0c99:
            X.19A r14 = r11.A00     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r4 = r14.A09()     // Catch:{ Exception -> 0x0cd9 }
            r5 = 1
            X.1jQ[] r7 = new X.C35891jQ[r5]     // Catch:{ Exception -> 0x0cd9 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0cd9 }
            X.1jQ r5 = new X.1jQ     // Catch:{ Exception -> 0x0cd9 }
            r5.<init>(r6, r3, r3)     // Catch:{ Exception -> 0x0cd9 }
            r7[r2] = r5     // Catch:{ Exception -> 0x0cd9 }
            java.util.ArrayList r3 = X.AnonymousClass03T.A02(r7)     // Catch:{ Exception -> 0x0cd9 }
            r2 = 16
            X.1jS r10 = new X.1jS     // Catch:{ Exception -> 0x0cd9 }
            r10.<init>((java.util.List) r3, (int) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x0cd9 }
            X.9nx r2 = r10.A00     // Catch:{ Exception -> 0x0cd9 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ Exception -> 0x0cd9 }
            X.AI3 r8 = new X.AI3     // Catch:{ Exception -> 0x0cd9 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0cd9 }
            r19 = 0
            r18 = 396(0x18c, float:5.55E-43)
            r15 = r8
            r17 = r4
            r16 = r2
            r14.A0K(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0cd9 }
            goto L_0x0c95
        L_0x0ccf:
            return
        L_0x0cd0:
            java.lang.String r2 = "PSANotificationHandler/empty promotion list"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x0cd9 }
            r0.A06(r1)     // Catch:{ Exception -> 0x0cd9 }
            return
        L_0x0cd9:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "PSANotificationHandler/Push PSA corrupted: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
            r0.A06(r1)
            return
        L_0x0cf2:
            java.lang.Object r4 = r7.A00
            X.1bW r4 = (X.C31251bW) r4
            java.lang.Object r3 = r7.A01
            X.9uj r3 = (X.C207209uj) r3
            java.lang.Object r8 = r7.A02
            X.9nx r8 = (X.C203399nx) r8
            r0 = 0
            X.9nx r1 = r8.A0b(r0)
            if (r1 == 0) goto L_0x0de5
            java.lang.String r0 = "message"
            java.util.List r0 = r1.A0j(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r12 = r0.iterator()
        L_0x0d14:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0d92
            java.lang.Object r2 = r12.next()
            X.9nx r2 = (X.C203399nx) r2
            if (r2 == 0) goto L_0x0d14
            java.lang.String r1 = "id"
            r0 = 0
            java.lang.String r11 = r2.A0i(r1, r0)
            boolean r0 = X.AnonymousClass14B.A0F(r11)
            if (r0 != 0) goto L_0x0d14
            long r5 = X.C31251bW.A01(r8, r4)
            java.lang.String r0 = "type"
            java.lang.String r1 = "text"
            java.lang.String r0 = r2.A0i(r0, r1)
            boolean r0 = r1.equalsIgnoreCase(r0)
            r10 = 0
            if (r0 != 0) goto L_0x0d4e
            X.9nx r2 = r2.A0b(r10)
            if (r2 != 0) goto L_0x0d4e
            java.lang.String r0 = "connection/generateChatPSAFMessage null media"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0d14
        L_0x0d4e:
            byte[] r0 = r2.A01
            X.8SX r9 = X.AnonymousClass8SX.A0i(r0)     // Catch:{ Exception -> 0x0d7c }
            X.0xh r1 = r4.A08     // Catch:{ Exception -> 0x0d7c }
            X.8e7 r2 = X.C177638e7.A00     // Catch:{ Exception -> 0x0d7c }
            X.3Qa r0 = new X.3Qa     // Catch:{ Exception -> 0x0d7c }
            r0.<init>(r2, r11, r10)     // Catch:{ Exception -> 0x0d7c }
            X.AnonymousClass00C.A0D(r9, r10)     // Catch:{ Exception -> 0x0d7c }
            X.9T0 r0 = X.C1899296d.A00(r9, r0, r5)     // Catch:{ Exception -> 0x0d7c }
            X.9YL r0 = r0.A00()     // Catch:{ Exception -> 0x0d7c }
            X.3T1 r1 = r1.A00(r0)     // Catch:{ Exception -> 0x0d7c }
            r1.A0q(r2)     // Catch:{ Exception -> 0x0d7c }
            java.lang.String r0 = "WhatsApp"
            r1.A0r = r0     // Catch:{ Exception -> 0x0d7c }
            r1.A0I = r5     // Catch:{ Exception -> 0x0d7c }
            r0 = 1
            r1.A1Z = r0     // Catch:{ Exception -> 0x0d7c }
            r7.add(r1)
            goto L_0x0d14
        L_0x0d7c:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "connection/generateChatPSAMultimediaFMessage "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0d14
        L_0x0d92:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0de5
            java.util.Iterator r5 = r7.iterator()
        L_0x0d9c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0de1
            java.lang.Object r2 = r5.next()
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            X.0xM r0 = r4.A03
            X.34U r0 = r0.A0P(r2)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0db8
            java.lang.String r0 = "PSANotificationHandler/message added"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0d9c
        L_0x0db8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PSANotificationHandler/didn't add message: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0d9c
        L_0x0dcd:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0de1
            X.1DQ r0 = r4.A04
            android.os.Handler r2 = r0.A01
            r1 = 35
            X.1jD r0 = new X.1jD
            r0.<init>(r4, r5, r1)
            r2.post(r0)
        L_0x0de1:
            r4.A05(r3)
            return
        L_0x0de5:
            r4.A06(r3)
            return
        L_0x0de9:
            java.lang.Object r5 = r7.A00
            X.1aH r5 = (X.C30481aH) r5
            java.lang.Object r0 = r7.A01
            X.B3V r0 = (X.B3V) r0
            java.lang.Object r4 = r7.A02
            X.777 r4 = (X.AnonymousClass777) r4
            r2 = 10000(0x2710, double:4.9407E-320)
            r1 = 0
            X.C30481aH.A02(r0, r5, r2)     // Catch:{ all -> 0x0dff }
            r4.BVO(r1)
            return
        L_0x0dff:
            r0 = move-exception
            r4.BVO(r1)
            throw r0
        L_0x0e04:
            java.lang.Object r4 = r7.A00
            X.1aH r4 = (X.C30481aH) r4
            java.lang.Object r3 = r7.A01
            X.B3V r3 = (X.B3V) r3
            java.lang.Object r2 = r7.A02
            r0 = 5000(0x1388, double:2.4703E-320)
            X.C30481aH.A02(r3, r4, r0)     // Catch:{ all -> 0x0e1e }
            java.util.Set r1 = r4.A0y
            monitor-enter(r1)
            r1.remove(r2)     // Catch:{ all -> 0x0e1b }
            monitor-exit(r1)     // Catch:{ all -> 0x0e1b }
            return
        L_0x0e1b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0e1b }
            throw r0
        L_0x0e1e:
            r1 = move-exception
            java.util.Set r0 = r4.A0y
            monitor-enter(r0)
            r0.remove(r2)     // Catch:{ all -> 0x0e27 }
        L_0x0e25:
            monitor-exit(r0)     // Catch:{ all -> 0x0e27 }
            goto L_0x0e29
        L_0x0e27:
            r1 = move-exception
            goto L_0x0e25
        L_0x0e29:
            throw r1
        L_0x0e2a:
            java.lang.Object r0 = r7.A00
            X.1aH r0 = (X.C30481aH) r0
            java.lang.Object r2 = r7.A01
            X.6EZ r2 = (X.AnonymousClass6EZ) r2
            java.lang.Object r1 = r7.A02
            X.3Qa r1 = (X.C64933Qa) r1
            X.189 r0 = r0.A0I
            r0.A0T(r2, r1)
            return
        L_0x0e3c:
            java.lang.Object r3 = r7.A00
            X.1aH r3 = (X.C30481aH) r3
            java.lang.Object r2 = r7.A01
            X.5J9 r2 = (X.AnonymousClass5J9) r2
            java.lang.Object r6 = r7.A02
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            X.1Cz r4 = r3.A0k
            java.lang.String r1 = r2.A0H
            if (r1 == 0) goto L_0x0e73
            java.lang.String r0 = r2.A0G
            if (r0 == 0) goto L_0x0e73
            X.3I3 r5 = new X.3I3
            r5.<init>(r1, r0)
        L_0x0e57:
            int r0 = r2.A02
            int r8 = r0 + 1
            X.3Qa r0 = r2.A1J
            java.lang.String r7 = r0.A01
            byte[] r0 = r2.A0I
            if (r0 == 0) goto L_0x0e71
            X.0yC r2 = r3.A0W
            r1 = 3626(0xe2a, float:5.081E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r9 = X.C20800yB.A01(r0, r2, r1)
        L_0x0e6d:
            r4.A09(r5, r6, r7, r8, r9)
            return
        L_0x0e71:
            r9 = 0
            goto L_0x0e6d
        L_0x0e73:
            r5 = 0
            goto L_0x0e57
        L_0x0e75:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0e7a }
            throw r0     // Catch:{ all -> 0x0e7a }
        L_0x0e7a:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0f37 }
            throw r1
        L_0x0e7f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0e82:
            r2 = move-exception
            java.util.concurrent.ConcurrentHashMap r1 = r8.A05
            int r0 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x0e96
            r0.decrementAndGet()
        L_0x0e96:
            throw r2
        L_0x0e97:
            X.11F r0 = X.AnonymousClass143.A00(r3)
            X.147 r4 = X.C65533Sl.A03(r0)
            X.C18740tg.A06(r4)
            X.16D r0 = r2.A05
            X.141 r9 = r0.A0A(r4)
            X.0wG r0 = r2.A07
            android.content.Context r5 = r0.A00
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity"
            r3.setClassName(r1, r0)
            java.lang.String r1 = X.AnonymousClass143.A03(r4)
            java.lang.String r0 = "jid"
            r3.putExtra(r0, r1)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r3.addFlags(r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r3.addFlags(r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r7 = X.C65743Th.A00(r5, r12, r3, r0)
            r0 = 2131893621(0x7f121d75, float:1.9422024E38)
            java.lang.String r8 = r5.getString(r0)
            X.0Yy r6 = X.C20600xp.A02(r5)
            java.lang.String r0 = "group_key_messages"
            r6.A0N = r0
            r5 = 1
            r1 = 8
            android.app.Notification r3 = r6.A0B
            int r0 = r3.flags
            r1 = r1 | r0
            r3.flags = r1
            java.lang.String r0 = "other_notifications@1"
            r6.A0M = r0
            X.0wo r0 = r2.A06
            long r0 = X.C19970wo.A00(r0)
            r6.A09(r0)
            java.lang.String r0 = r9.A0J()
            r6.A0F(r0)
            r6.A0E(r8)
            r6.A0G(r8)
            r0 = -1
            r6.A09 = r0
            r0 = 3
            r6.A06(r0)
            r6.A0I(r5)
            r6.A0D = r7
            r0 = 2131231578(0x7f08035a, float:1.807924E38)
            r3.icon = r0
            android.app.Notification r3 = r6.A05()
            X.1Fq r2 = r2.A08
            r1 = 67
            java.lang.String r0 = r4.getRawString()
            r2.A07(r0, r1, r3)
            return
        L_0x0f27:
            r2 = move-exception
            X.1Jb r1 = r1.A02
            X.8zz r0 = X.C188648zz.A0O
            r1.A01(r0, r10, r2)
            return
        L_0x0f30:
            r1 = move-exception
            if (r4 == 0) goto L_0x0f3b
            r4.close()     // Catch:{ all -> 0x0f37 }
            throw r1
        L_0x0f37:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0f3b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35661j3.run():void");
    }
}
