package X;

/* renamed from: X.1iS  reason: invalid class name and case insensitive filesystem */
public class C35291iS implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C35291iS(Object obj, Object obj2, int i, boolean z) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x0171;
                case 1: goto L_0x01b1;
                case 2: goto L_0x0027;
                case 3: goto L_0x03de;
                case 4: goto L_0x0060;
                case 5: goto L_0x043e;
                case 6: goto L_0x046f;
                case 7: goto L_0x00e5;
                case 8: goto L_0x04ea;
                case 9: goto L_0x04f8;
                case 10: goto L_0x0107;
                case 11: goto L_0x0509;
                case 12: goto L_0x0124;
                case 13: goto L_0x0520;
                case 14: goto L_0x0142;
                case 15: goto L_0x0549;
                case 16: goto L_0x0764;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r0.A00
            X.1dz r3 = (X.C32661dz) r3
            boolean r2 = r0.A02
            java.lang.Object r1 = r0.A01
            X.2Qb r1 = (X.C45102Qb) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            X.C32661dz.A00(r1, r3)
            if (r2 == 0) goto L_0x001b
            r0 = 1
        L_0x001b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.0yW r0 = r3.A00
            r0.Bly(r1)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Object r5 = r0.A00
            X.1KK r5 = (X.AnonymousClass1KK) r5
            java.lang.Object r4 = r0.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r2 = r0.A02
            X.9uZ r1 = r5.A07(r4)
            if (r1 == 0) goto L_0x0026
            boolean r0 = r1.A0W
            if (r0 == r2) goto L_0x0026
            X.9ep r0 = new X.9ep
            r0.<init>(r1)
            r0.A0X = r2
            X.9uZ r3 = r0.A01()
            X.1LE r1 = r5.A06
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r4, r3)
            r1.A08(r0)
            android.os.Handler r2 = r5.A00
            r1 = 41
            X.1iz r0 = new X.1iz
            r0.<init>(r5, r3, r1)
            r2.post(r0)
            return
        L_0x0060:
            java.lang.Object r2 = r0.A00
            X.1ji r2 = (X.C36071ji) r2
            java.lang.Object r4 = r0.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            boolean r3 = r0.A02
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "conversations/group/toggleGroupProgressbar/:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r2.A00
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            android.view.View r1 = com.whatsapp.conversationslist.ConversationsFragment.A05(r2, r4)
            if (r1 == 0) goto L_0x009d
            r0 = 2131433020(0x7f0b163c, float:1.8487814E38)
            android.view.View r0 = r1.findViewById(r0)
            X.1RJ r1 = new X.1RJ
            r1.<init>(r0)
            r0 = 8
            if (r3 == 0) goto L_0x0099
            r0 = 0
        L_0x0099:
            r1.A03(r0)
            return
        L_0x009d:
            android.widget.ListView r0 = r2.A0A
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "conversations/refresh: no view for "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " "
            r1.append(r0)
            android.widget.ListView r0 = r2.A0A
            int r0 = r0.getFirstVisiblePosition()
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            android.widget.ListView r0 = r2.A0A
            int r0 = r0.getLastVisiblePosition()
            r1.append(r0)
            java.lang.String r0 = " ("
            r1.append(r0)
            android.widget.ListView r0 = r2.A0A
            int r0 = r0.getCount()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00e5:
            java.lang.Object r1 = r0.A00
            X.0wB r1 = (X.C19580wB) r1
            java.lang.Object r3 = r0.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            boolean r2 = r0.A02
            java.lang.Iterable r0 = r1.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x00f7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            X.1JB r0 = (X.AnonymousClass1JB) r0
            r0.BQJ(r3, r2)
            goto L_0x00f7
        L_0x0107:
            java.lang.Object r1 = r0.A00
            X.1Hi r1 = (X.C25701Hi) r1
            java.lang.Object r3 = r0.A01
            boolean r0 = r0.A02
            X.1Hk r2 = r1.A00
            java.lang.Object r1 = r2.A00()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0026
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.put(r3, r0)
            r2.A04(r1)
            return
        L_0x0124:
            java.lang.Object r6 = r0.A00
            X.1aB r6 = (X.C30421aB) r6
            java.lang.Object r5 = r0.A01
            com.whatsapp.jid.DeviceJid[] r5 = (com.whatsapp.jid.DeviceJid[]) r5
            boolean r4 = r0.A02
            int r3 = r5.length
            r2 = 0
        L_0x0130:
            if (r2 >= r3) goto L_0x0026
            r1 = r5[r2]
            int r0 = r1.getDevice()
            if (r0 == 0) goto L_0x013f
            X.1OD r0 = r6.A06
            r0.A0B(r1, r4)
        L_0x013f:
            int r2 = r2 + 1
            goto L_0x0130
        L_0x0142:
            java.lang.Object r1 = r0.A00
            X.1SP r1 = (X.AnonymousClass1SP) r1
            java.lang.Object r8 = r0.A01
            X.1Uw r8 = (X.C28981Uw) r8
            boolean r7 = r0.A02
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.16J r6 = r1.A01
            java.lang.Iterable r0 = r6.getObservers()
            java.util.Iterator r5 = r0.iterator()
        L_0x015a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r4 = r5.next()
            X.191 r4 = (X.AnonymousClass191) r4
            long r2 = r6.A00
            r0 = 1
            long r2 = r2 + r0
            r6.A00 = r2
            r4.Bbe(r8, r7)
            goto L_0x015a
        L_0x0171:
            java.lang.Object r4 = r0.A00
            X.18S r4 = (X.AnonymousClass18S) r4
            java.lang.Object r3 = r0.A01
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r1 = r0.A02
            X.2P3 r2 = new X.2P3
            r2.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.A02 = r0
            X.18T r0 = r4.A06
            java.lang.Long r0 = r0.A00()
            r2.A01 = r0
            r0 = 2
            if (r1 == 0) goto L_0x0196
            r0 = 1
        L_0x0196:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            X.0yW r1 = r4.A05
            boolean r0 = r3 instanceof X.C225714y
            if (r0 == 0) goto L_0x01ae
            X.14y r3 = (X.C225714y) r3
            X.0u5 r0 = r3.BGv()
        L_0x01a8:
            int r0 = r0.A00
            r1.Blz(r2, r0)
            return
        L_0x01ae:
            X.0u5 r0 = X.C19430v1.A03
            goto L_0x01a8
        L_0x01b1:
            java.lang.Object r5 = r0.A00
            X.1X4 r5 = (X.AnonymousClass1X4) r5
            java.lang.Object r1 = r0.A01
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r6 = r0.A02
            java.util.ArrayList r4 = X.AnonymousClass1X4.A04(r5, r1)
            java.util.Iterator r13 = r4.iterator()
        L_0x01c3:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x03d7
            java.lang.Object r7 = r13.next()
            X.3T1 r7 = (X.AnonymousClass3T1) r7
            r0 = 1
            r7.A1X = r0
            boolean r0 = X.C66013Ui.A0n(r7)
            if (r0 != 0) goto L_0x01c3
            X.3Qa r10 = r7.A1J
            X.11F r3 = r10.A00
            boolean r1 = r3 instanceof X.C28981Uw
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r7.A1T(r0)
            if (r0 == 0) goto L_0x01f4
            if (r1 != 0) goto L_0x01f6
            X.3Kx r1 = r7.A0P()
            if (r1 != 0) goto L_0x0220
            java.lang.String r0 = "UserActions/userActionRevokeMessages/commentInfo is null for a comment message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x01f4:
            if (r1 == 0) goto L_0x0255
        L_0x01f6:
            X.0wo r0 = r5.A0K
            boolean r0 = X.C65903Tx.A05(r0, r7)
            if (r0 != 0) goto L_0x0204
            java.lang.String r0 = "UserActions/userActionRevokeMessages/outside of edit window"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01c3
        L_0x0204:
            long r0 = r7.A0I
            X.2c7 r8 = new X.2c7
            r8.<init>((X.AnonymousClass3T1) r7, (X.C64933Qa) r10, (long) r0)
            X.005 r0 = r5.A1P
            java.lang.Object r3 = r0.get()
            X.1Yg r3 = (X.C29861Yg) r3
            X.0wU r2 = r3.A07
            r1 = 13
            X.1iS r0 = new X.1iS
            r0.<init>(r3, r8, r1, r6)
            r2.Boy(r0)
            goto L_0x01c3
        L_0x0220:
            X.3Kx r0 = r7.A0P()
            X.9Vv r0 = r0.A01()
            if (r0 == 0) goto L_0x022e
            X.11F r0 = r0.A00
            if (r0 != 0) goto L_0x0255
        L_0x022e:
            java.lang.Long r0 = r1.A04()
            if (r0 == 0) goto L_0x0255
            X.1A1 r2 = r5.A1H
            long r0 = r0.longValue()
            X.175 r2 = r2.A01
            X.3T1 r2 = r2.A01(r0)
            if (r2 == 0) goto L_0x0255
            X.3Qa r9 = r2.A1J
            com.whatsapp.jid.UserJid r2 = r2.A0L()
            X.9Vv r8 = new X.9Vv
            r8.<init>(r2, r9)
            X.2bB r2 = new X.2bB
            r2.<init>(r8, r0)
            r7.A0u(r2)
        L_0x0255:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0321
            boolean r0 = r7 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0263
            X.1Y4 r1 = r5.A0q
            r0 = 0
            r1.A08(r7, r0)
        L_0x0263:
            boolean r0 = r3 instanceof X.C177528dw
            if (r0 == 0) goto L_0x02a5
            X.1DW r2 = r5.A0h
            X.1AW r1 = r5.A18
            X.1EO r0 = r5.A19
            int r8 = X.C55802vD.A00(r2, r7, r1, r0)
            X.1Xt r10 = r5.A1D
            X.2Ps r2 = new X.2Ps
            r2.<init>()
            X.3Ao r0 = r10.A00
            if (r0 == 0) goto L_0x031d
            long r0 = r0.A05
        L_0x027e:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.A00 = r0
            X.0wo r0 = r10.A03
            long r8 = X.C19970wo.A00(r0)
            long r0 = r7.A0I
            long r8 = r8 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2.A01 = r0
            X.0yW r0 = r10.A07
            r0.Blw(r2)
            X.1Xw r2 = r10.A0A
            r1 = 4
            r0 = 0
            X.C29761Xw.A02(r7, r2, r0, r0, r1)
        L_0x02a5:
            boolean r0 = r7 instanceof X.AnonymousClass2bQ
            if (r0 == 0) goto L_0x02d2
            r12 = r7
            X.2bQ r12 = (X.AnonymousClass2bQ) r12
            X.0wo r0 = r5.A0K
            long r10 = X.C19970wo.A00(r0)
            long r0 = r12.A01
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r8
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x02d2
            boolean r0 = r12.A07
            if (r0 != 0) goto L_0x02d2
            X.0xg r8 = r5.A0m
            X.147 r2 = r12.A02
            X.C18740tg.A06(r2)
            X.3Qa r0 = r12.A1J
            X.11F r0 = r0.A00
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 0
            r8.A06(r0, r2, r1)
        L_0x02d2:
            X.1TU r2 = r5.A15
            X.0wo r10 = r5.A0K
            long r0 = X.C19970wo.A00(r10)
            X.19w r9 = r2.A01
            r2 = 1
            X.3Qa r8 = r9.A02(r3, r2)
            X.2c7 r2 = new X.2c7
            r2.<init>((X.AnonymousClass3T1) r7, (X.C64933Qa) r8, (long) r0)
            r5.A0W(r7, r2)
            X.1SR r12 = r5.A0Y
            r12.A03(r2, r6)
            boolean r0 = r7.A10
            if (r0 == 0) goto L_0x01c3
            java.util.List r0 = r7.A0e()
            if (r0 == 0) goto L_0x01c3
            java.util.Iterator r11 = r0.iterator()
        L_0x02fc:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r8 = r11.next()
            X.11F r8 = (X.AnonymousClass11F) r8
            long r0 = X.C19970wo.A00(r10)
            r2 = 1
            X.3Qa r8 = r9.A02(r8, r2)
            X.2c7 r2 = new X.2c7
            r2.<init>((X.AnonymousClass3T1) r7, (X.C64933Qa) r8, (long) r0)
            r2.A0q(r3)
            r12.A03(r2, r6)
            goto L_0x02fc
        L_0x031d:
            r0 = 0
            goto L_0x027e
        L_0x0321:
            X.11F r0 = r7.A0J()
            boolean r0 = X.C197029b1.A00(r0)
            if (r0 == 0) goto L_0x0354
            X.005 r0 = r5.A1M
            java.lang.Object r0 = r0.get()
            X.1HX r0 = (X.AnonymousClass1HX) r0
            boolean r0 = r0.A07(r7)
            if (r0 == 0) goto L_0x0354
            X.1TU r2 = r5.A15
            X.0wo r0 = r5.A0K
            long r0 = X.C19970wo.A00(r0)
            X.19w r8 = r2.A01
            r2 = 1
            X.3Qa r3 = r8.A02(r3, r2)
            X.2c7 r2 = new X.2c7
            r2.<init>((X.AnonymousClass3T1) r7, (X.C64933Qa) r3, (long) r0)
            X.1SR r0 = r5.A0Y
            r0.A03(r2, r6)
            goto L_0x01c3
        L_0x0354:
            X.11F r0 = r7.A0J()
            boolean r9 = X.C197029b1.A00(r0)
            X.1TU r2 = r5.A15
            X.0wo r0 = r5.A0K
            long r0 = X.C19970wo.A00(r0)
            X.19w r8 = r2.A01
            r2 = 0
            X.3Qa r2 = r8.A02(r3, r2)
            X.2c8 r3 = new X.2c8
            if (r9 == 0) goto L_0x03d0
            r3.<init>((X.AnonymousClass3T1) r7, (X.C64933Qa) r2, (long) r0)
            X.1XZ r2 = r5.A0A
            long r0 = r7.A1N
            X.3Kf r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x03ce
            com.whatsapp.jid.UserJid r1 = r0.A00
        L_0x037e:
            X.3T1 r0 = r7.A0S()
            if (r0 != 0) goto L_0x03a4
            if (r1 != 0) goto L_0x03c4
            java.lang.String r0 = "UserActions/appendDataFromTheOriginalToTheAdminRevokeBotResponse/invoke message and bot message info do not exist!"
        L_0x0388:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x038b:
            X.0wQ r1 = r5.A03
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r1.A03
            r3.A00 = r0
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r1.A03
            if (r0 == 0) goto L_0x039d
            r3.A00 = r0
        L_0x039d:
            X.1SR r0 = r5.A0Y
            r0.A03(r3, r6)
            goto L_0x01c3
        L_0x03a4:
            if (r1 != 0) goto L_0x03c4
            X.1A1 r1 = r5.A1H
            X.3Qa r0 = r0.A1J
            X.3T1 r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x03cb
            X.11F r2 = r0.A0J()
            if (r2 == 0) goto L_0x038b
        L_0x03b6:
            r1 = 0
            X.3ux r0 = new X.3ux
            r0.<init>(r2, r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r3.A18(r0)
            goto L_0x038b
        L_0x03c4:
            X.13q r0 = X.AnonymousClass11F.A00
            X.11F r2 = X.C222713q.A00(r1)
            goto L_0x03b6
        L_0x03cb:
            java.lang.String r0 = "UserActions/appendDataFromTheOriginalToTheAdminRevokeBotResponse/invoke message does not exist!"
            goto L_0x0388
        L_0x03ce:
            r1 = 0
            goto L_0x037e
        L_0x03d0:
            r3.<init>((X.AnonymousClass3T1) r7, (X.C64933Qa) r2, (long) r0)
            r5.A0W(r7, r3)
            goto L_0x038b
        L_0x03d7:
            X.1Hr r1 = r5.A09
            r0 = 4
            r1.A04(r4, r0)
            return
        L_0x03de:
            java.lang.Object r4 = r0.A00
            X.18z r4 = (X.C235718z) r4
            java.lang.Object r6 = r0.A01
            java.util.AbstractCollection r6 = (java.util.AbstractCollection) r6
            boolean r5 = r0.A02
            r0 = 1
            X.AnonymousClass00C.A0D(r6, r0)
            X.0yC r2 = r4.A08
            r1 = 7279(0x1c6f, float:1.02E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0424
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            monitor-enter(r6)
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x041b }
        L_0x0402:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x041b }
            if (r0 == 0) goto L_0x041e
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x041b }
            X.11F r1 = (X.AnonymousClass11F) r1     // Catch:{ all -> 0x041b }
            X.196 r0 = r4.A05     // Catch:{ all -> 0x041b }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ all -> 0x041b }
            java.util.Set r0 = r0.A07(r1, r5)     // Catch:{ all -> 0x041b }
            r3.addAll(r0)     // Catch:{ all -> 0x041b }
            goto L_0x0402
        L_0x041b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x041e:
            monitor-exit(r6)
            X.196 r0 = r4.A05
            r0.A0Q(r3)
        L_0x0424:
            X.005 r0 = r4.A0E
            java.lang.Object r0 = r0.get()
            X.17j r0 = (X.C231517j) r0
            X.0wy r0 = r0.A04()
            int r1 = r0.size()
            r0 = 0
            if (r1 <= 0) goto L_0x0438
            r0 = 1
        L_0x0438:
            r0 = r0 ^ 1
            r4.A0I(r0)
            return
        L_0x043e:
            java.lang.Object r1 = r0.A00
            X.12t r1 = (X.C220712t) r1
            java.lang.Object r4 = r0.A01
            X.3Qp r4 = (X.C65073Qp) r4
            boolean r3 = r0.A02
            X.005 r2 = r1.A01
            java.lang.Object r0 = r2.get()
            X.1Do r0 = (X.C24731Do) r0
            X.196 r1 = r0.A04
            X.11F r0 = r4.A0q
            java.util.Set r1 = r1.A04(r0, r3)
            java.lang.Object r0 = r2.get()
            X.1Do r0 = (X.C24731Do) r0
            X.163 r0 = r0.A0C
            r0.A0E(r4)
            java.lang.Object r0 = r2.get()
            X.1Do r0 = (X.C24731Do) r0
            X.196 r0 = r0.A04
            r0.A0Q(r1)
            return
        L_0x046f:
            java.lang.Object r6 = r0.A00
            X.12t r6 = (X.C220712t) r6
            java.lang.Object r1 = r0.A01
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r5 = r0.A02
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x0482:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04a6
            java.lang.Object r2 = r4.next()
            X.3Qp r2 = (X.C65073Qp) r2
            boolean r0 = r2.A0j
            if (r0 != 0) goto L_0x0482
            X.005 r0 = r6.A01
            java.lang.Object r0 = r0.get()
            X.1Do r0 = (X.C24731Do) r0
            X.196 r1 = r0.A04
            X.11F r0 = r2.A0q
            java.util.Set r0 = r1.A04(r0, r5)
            r3.addAll(r0)
            goto L_0x0482
        L_0x04a6:
            X.005 r4 = r6.A01
            java.lang.Object r0 = r4.get()
            X.1Do r0 = (X.C24731Do) r0
            X.163 r0 = r0.A0C
            X.12P r0 = r0.A04
            X.1M0 r2 = r0.A05()
            r0 = 1
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x04e0 }
            r6.<init>(r0)     // Catch:{ all -> 0x04e0 }
            java.lang.String r1 = "archived"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x04e0 }
            r6.put(r1, r0)     // Catch:{ all -> 0x04e0 }
            X.14e r5 = r2.A02     // Catch:{ all -> 0x04e0 }
            java.lang.String r7 = "chat"
            java.lang.String r8 = "chat_lock = 0"
            r10 = 0
            java.lang.String r9 = "updateAllChatsArchivedInChatList/UPDATE_CHAT"
            r5.A01(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x04e0 }
            r2.close()
            java.lang.Object r0 = r4.get()
            X.1Do r0 = (X.C24731Do) r0
            X.196 r0 = r0.A04
            r0.A0Q(r3)
            return
        L_0x04e0:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x04e5 }
            throw r1
        L_0x04e5:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x04ea:
            java.lang.Object r2 = r0.A00
            X.1SR r2 = (X.AnonymousClass1SR) r2
            java.lang.Object r1 = r0.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            boolean r0 = r0.A02
            r2.A04(r1, r0)
            return
        L_0x04f8:
            java.lang.Object r1 = r0.A00
            X.1NO r1 = (X.AnonymousClass1NO) r1
            java.lang.Object r3 = r0.A01
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r2 = r0.A02
            X.16J r1 = r1.A07
            r0 = 0
            r1.A02(r0, r3, r2)
            return
        L_0x0509:
            java.lang.Object r7 = r0.A00
            X.1H5 r7 = (X.AnonymousClass1H5) r7
            java.lang.Object r6 = r0.A01
            X.6Pw r6 = (X.C131636Pw) r6
            boolean r5 = r0.A02
            r3 = 987(0x3db, double:4.876E-321)
            r1 = 1
            X.1Bd r0 = new X.1Bd
            r0.<init>(r1, r3)
            X.AnonymousClass1H5.A04(r6, r7, r0, r5)
            return
        L_0x0520:
            java.lang.Object r4 = r0.A00
            X.1Yg r4 = (X.C29861Yg) r4
            java.lang.Object r3 = r0.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            boolean r2 = r0.A02
            X.1SQ r1 = r4.A05
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.1SR r0 = r1.A02
            boolean r0 = r0.A04(r3, r2)
            if (r0 != 0) goto L_0x0540
            X.1SM r0 = r1.A06
            boolean r0 = r0.A06(r3)
            if (r0 == 0) goto L_0x0545
        L_0x0540:
            X.1SM r0 = r1.A06
            r0.A04(r3)
        L_0x0545:
            r4.A01(r3)
            return
        L_0x0549:
            java.lang.Object r2 = r0.A00
            X.0wj r2 = (X.C19920wj) r2
            java.lang.Object r4 = r0.A01
            X.15N r4 = (X.AnonymousClass15N) r4
            boolean r10 = r0.A02
            java.lang.Object r3 = r2.A0A
            monitor-enter(r3)
            X.0wi r9 = r2.A07     // Catch:{ all -> 0x0761 }
            java.io.File r7 = r9.A01     // Catch:{ all -> 0x0761 }
            boolean r0 = r7.exists()     // Catch:{ all -> 0x0761 }
            if (r0 == 0) goto L_0x0586
            long r0 = r2.A02     // Catch:{ all -> 0x0761 }
            long r5 = r4.A01     // Catch:{ all -> 0x0761 }
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x057c
            if (r10 != 0) goto L_0x0586
            java.lang.Object r10 = r2.A09     // Catch:{ all -> 0x0761 }
            monitor-enter(r10)     // Catch:{ all -> 0x0761 }
            long r0 = r2.A01     // Catch:{ all -> 0x0579 }
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 0
            if (r8 != 0) goto L_0x0575
            r0 = 1
        L_0x0575:
            monitor-exit(r10)     // Catch:{ all -> 0x0579 }
            if (r0 != 0) goto L_0x0586
            goto L_0x057c
        L_0x0579:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0579 }
            throw r0     // Catch:{ all -> 0x0761 }
        L_0x057c:
            r0 = 1
            r4.A04 = r0     // Catch:{ all -> 0x0761 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ all -> 0x0761 }
            r0.countDown()     // Catch:{ all -> 0x0761 }
            goto L_0x0752
        L_0x0586:
            java.util.Map r12 = r4.A02     // Catch:{ Exception -> 0x0744 }
            java.lang.Object r5 = r9.A02     // Catch:{ Exception -> 0x0744 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x0744 }
            boolean r0 = r7.exists()     // Catch:{ all -> 0x0741 }
            if (r0 == 0) goto L_0x05ca
            java.io.File r6 = r9.A00     // Catch:{ all -> 0x0741 }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x0741 }
            if (r0 == 0) goto L_0x059d
            r7.delete()     // Catch:{ all -> 0x0741 }
            goto L_0x05ca
        L_0x059d:
            boolean r0 = r7.renameTo(r6)     // Catch:{ all -> 0x0741 }
            if (r0 != 0) goto L_0x05ca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0741 }
            r1.<init>()     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Couldn't rename file "
            r1.append(r0)     // Catch:{ all -> 0x0741 }
            r1.append(r7)     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = " to backup file "
            r1.append(r0)     // Catch:{ all -> 0x0741 }
            r1.append(r6)     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0741 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0741 }
            monitor-exit(r5)     // Catch:{ all -> 0x0741 }
            r0 = 0
            r4.A04 = r0     // Catch:{ Exception -> 0x0744 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ Exception -> 0x0744 }
            r0.countDown()     // Catch:{ Exception -> 0x0744 }
            goto L_0x0752
        L_0x05ca:
            java.lang.String r10 = "DefaultSharedPreferencesStorage/Couldn't create directory for SharedPreferences file "
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x05d2 }
            r8.<init>(r7)     // Catch:{ FileNotFoundException -> 0x05d2 }
            goto L_0x05f7
        L_0x05d2:
            r6 = move-exception
            java.io.File r8 = r7.getParentFile()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r8.mkdir()     // Catch:{ SecurityException -> 0x06d8 }
            boolean r0 = r8.exists()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            if (r0 == 0) goto L_0x068c
            boolean r0 = r8.isDirectory()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            if (r0 == 0) goto L_0x069f
            boolean r0 = r8.canRead()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            if (r0 == 0) goto L_0x069f
            boolean r0 = r8.canWrite()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            if (r0 == 0) goto L_0x069f
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0676 }
            r8.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0676 }
        L_0x05f7:
            java.io.File r9 = r9.A00     // Catch:{ all -> 0x066c }
            long r14 = r9.length()     // Catch:{ all -> 0x066c }
            r13 = 2048(0x800, float:2.87E-42)
            r10 = 2048(0x800, double:1.0118E-320)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0618
            r10 = 32768(0x8000, double:1.61895E-319)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0610
            r13 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0618
        L_0x0610:
            long r0 = (long) r13     // Catch:{ all -> 0x066c }
            int r6 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x0618
            int r13 = r13 * 2
            goto L_0x0610
        L_0x0618:
            X.1c5 r10 = new X.1c5     // Catch:{ all -> 0x066c }
            r10.<init>(r13)     // Catch:{ all -> 0x066c }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x066c }
            r10.setOutput(r8, r0)     // Catch:{ all -> 0x066c }
            r6 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x066c }
            r1 = 0
            r10.startDocument(r1, r0)     // Catch:{ all -> 0x066c }
            java.lang.String r0 = "http://xmlpull.org/v1/doc/features.html#indent-output"
            r10.setFeature(r0, r6)     // Catch:{ all -> 0x066c }
            X.AnonymousClass6R6.A06(r1, r12, r10)     // Catch:{ all -> 0x066c }
            r10.endDocument()     // Catch:{ all -> 0x066c }
            java.io.FileDescriptor r0 = r8.getFD()     // Catch:{ IOException -> 0x063e }
            r0.sync()     // Catch:{ IOException -> 0x063e }
            goto L_0x0657
        L_0x063e:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x066c }
            r1.<init>()     // Catch:{ all -> 0x066c }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while syncing preferences, file= "
            r1.append(r0)     // Catch:{ all -> 0x066c }
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x066c }
            r1.append(r0)     // Catch:{ all -> 0x066c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x066c }
            com.whatsapp.util.Log.w(r0, r6)     // Catch:{ all -> 0x066c }
        L_0x0657:
            r9.delete()     // Catch:{ all -> 0x066c }
            r8.close()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            monitor-exit(r5)     // Catch:{ all -> 0x0741 }
            long r0 = r4.A01     // Catch:{ Exception -> 0x0744 }
            r2.A02 = r0     // Catch:{ Exception -> 0x0744 }
            r0 = 1
            r4.A04 = r0     // Catch:{ Exception -> 0x0744 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ Exception -> 0x0744 }
            r0.countDown()     // Catch:{ Exception -> 0x0744 }
            goto L_0x0752
        L_0x066c:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0671 }
            goto L_0x06eb
        L_0x0671:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            goto L_0x06eb
        L_0x0676:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Couldn't create SharedPreferences file "
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r1.append(r7)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            java.lang.String r0 = r1.toString()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            goto L_0x06d7
        L_0x068c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r0.append(r10)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r0.append(r7)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            goto L_0x06d7
        L_0x069f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Invalid directory for SharedPreferences file "
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r1.append(r7)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            java.lang.String r0 = ", isDirectory="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            boolean r0 = r8.isDirectory()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            java.lang.String r0 = ", canRead="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            boolean r0 = r8.canRead()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            java.lang.String r0 = ", canWrite="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            boolean r0 = r8.canWrite()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            java.lang.String r0 = r1.toString()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
        L_0x06d7:
            throw r6     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
        L_0x06d8:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r0.append(r10)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            r0.append(r7)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
        L_0x06eb:
            throw r1     // Catch:{ XmlPullParserException -> 0x06ee, IOException -> 0x06ec }
        L_0x06ec:
            r6 = move-exception
            goto L_0x0708
        L_0x06ee:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0741 }
            r1.<init>()     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while serializing to XML, file= "
            r1.append(r0)     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x0741 }
            r1.append(r0)     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0741 }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x0741 }
            goto L_0x0720
        L_0x0708:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0741 }
            r1.<init>()     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while saving preferences, file= "
            r1.append(r0)     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x0741 }
            r1.append(r0)     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0741 }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x0741 }
        L_0x0720:
            boolean r0 = r7.exists()     // Catch:{ all -> 0x0741 }
            if (r0 == 0) goto L_0x0740
            boolean r0 = r7.delete()     // Catch:{ all -> 0x0741 }
            if (r0 != 0) goto L_0x0740
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0741 }
            r1.<init>()     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Couldn't clean up partially-written file "
            r1.append(r0)     // Catch:{ all -> 0x0741 }
            r1.append(r7)     // Catch:{ all -> 0x0741 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0741 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0741 }
        L_0x0740:
            throw r6     // Catch:{ all -> 0x0741 }
        L_0x0741:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0741 }
            throw r0     // Catch:{ Exception -> 0x0744 }
        L_0x0744:
            r1 = move-exception
            java.lang.String r0 = "LightSharedPreferencesImpl/writeToFile: Got exception:"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0761 }
            r0 = 0
            r4.A04 = r0     // Catch:{ all -> 0x0761 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ all -> 0x0761 }
            r0.countDown()     // Catch:{ all -> 0x0761 }
        L_0x0752:
            monitor-exit(r3)     // Catch:{ all -> 0x0761 }
            java.lang.Object r1 = r2.A09
            monitor-enter(r1)
            int r0 = r2.A00     // Catch:{ all -> 0x075e }
            int r0 = r0 + -1
            r2.A00 = r0     // Catch:{ all -> 0x075e }
            monitor-exit(r1)     // Catch:{ all -> 0x075e }
            return
        L_0x075e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x075e }
            throw r0
        L_0x0761:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0761 }
            throw r0
        L_0x0764:
            java.lang.Object r8 = r0.A00
            X.1Ww r8 = (X.C29501Ww) r8
            java.lang.Object r2 = r0.A01
            X.3Ip r2 = (X.C63063Ip) r2
            boolean r1 = r0.A02
            X.1Uu r0 = r8.A07
            r0.A01(r2)
            X.0zA r0 = r8.A02
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0781
            if (r1 == 0) goto L_0x0781
            java.lang.String r0 = "RegistrationManager/showDeviceConfirmationOverlayAlertOrNotify/App is no longer in background - skipping notification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0781:
            X.0wG r0 = r8.A0D
            android.content.Context r7 = r0.A00
            r0 = 2131896687(0x7f12296f, float:1.9428242E38)
            java.lang.String r6 = r7.getString(r0)
            X.1Fq r5 = r8.A0E
            r1 = 2131891677(0x7f1215dd, float:1.941808E38)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3 = 0
            r0[r3] = r6
            java.lang.String r2 = r7.getString(r1, r0)
            r1 = 2131891678(0x7f1215de, float:1.9418083E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r6
            r0[r4] = r6
            java.lang.String r0 = r7.getString(r1, r0)
            X.0Yy r0 = X.C29501Ww.A00(r8, r6, r2, r0)
            android.app.Notification r1 = r0.A05()
            r0 = 52
            r5.A02(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35291iS.run():void");
    }
}
