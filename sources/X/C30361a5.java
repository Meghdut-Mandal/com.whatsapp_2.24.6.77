package X;

/* renamed from: X.1a5  reason: invalid class name and case insensitive filesystem */
public class C30361a5 implements C236319f {
    public final C25951Ih A00;

    public int[] BCF() {
        return new int[]{242, 243, 244, 245};
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public boolean BJl(android.os.Message r17, int r18) {
        /*
            r16 = this;
            r2 = 1
            r0 = 242(0xf2, float:3.39E-43)
            r5 = r16
            r3 = r17
            r1 = r18
            if (r1 != r0) goto L_0x0175
            java.lang.Object r4 = r3.obj
            X.C18740tg.A06(r4)
            X.9nx r4 = (X.C203399nx) r4
            java.lang.String r0 = "pair-device"
            X.9nx r1 = r4.A0c(r0)
            if (r1 == 0) goto L_0x0568
            java.lang.String r0 = "ref"
            java.util.List r0 = r1.A0j(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0029:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r3.next()
            X.9nx r1 = (X.C203399nx) r1
            java.lang.String r0 = r1.A0e()
            r10.add(r0)
            r1.A0e()
            goto L_0x0029
        L_0x0040:
            java.lang.String r1 = "id"
            r0 = 0
            java.lang.String r1 = r4.A0i(r1, r0)
            if (r1 == 0) goto L_0x0568
            X.1Ih r0 = r5.A00
            X.0xH r6 = X.C25951Ih.A00(r0)
            monitor-enter(r6)
            X.13g r4 = r6.A0P     // Catch:{ all -> 0x0172 }
            int r3 = r4.A00()     // Catch:{ all -> 0x0172 }
            r0 = 10
            if (r3 < r0) goto L_0x0081
            r0 = 14
            if (r3 > r0) goto L_0x0088
            X.60q r0 = r6.A0R     // Catch:{ all -> 0x0172 }
            r0.A00(r1)     // Catch:{ all -> 0x0172 }
            r0 = 10
            if (r3 != r0) goto L_0x006d
            r0 = 0
            X.C20260xH.A03(r6, r0)     // Catch:{ all -> 0x0172 }
            goto L_0x0567
        L_0x006d:
            r1 = 14
            if (r3 == r1) goto L_0x007c
            java.lang.String r0 = "companion/registration/refs/reconnected during link code registration"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            X.C20260xH.A02(r6)     // Catch:{ all -> 0x0172 }
            r4.A01(r1)     // Catch:{ all -> 0x0172 }
        L_0x007c:
            X.C20260xH.A03(r6, r2)     // Catch:{ all -> 0x0172 }
            goto L_0x0567
        L_0x0081:
            r11 = 3
            r9 = 2
            if (r3 != r11) goto L_0x0086
            goto L_0x008f
        L_0x0086:
            if (r3 == r9) goto L_0x009a
        L_0x0088:
            java.lang.String r0 = "companion/registration/refs/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            goto L_0x0567
        L_0x008f:
            java.lang.String r0 = "companion/registration/refs/reconnected"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            r4.A01(r9)     // Catch:{ all -> 0x0172 }
            X.C20260xH.A01(r6)     // Catch:{ all -> 0x0172 }
        L_0x009a:
            int r0 = r10.size()     // Catch:{ all -> 0x0172 }
            r8 = 6
            if (r0 != r8) goto L_0x016d
            r4.A01(r11)     // Catch:{ all -> 0x0172 }
            X.60q r0 = r6.A0R     // Catch:{ all -> 0x0172 }
            r0.A00(r1)     // Catch:{ all -> 0x0172 }
            java.lang.Runnable r1 = r6.A0B     // Catch:{ all -> 0x0172 }
            if (r1 == 0) goto L_0x00b2
            X.0wU r0 = r6.A0k     // Catch:{ all -> 0x0172 }
            r0.Bnx(r1)     // Catch:{ all -> 0x0172 }
        L_0x00b2:
            X.0wU r7 = r6.A0k     // Catch:{ all -> 0x0172 }
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r3 = 39
            X.1j4 r4 = new X.1j4     // Catch:{ all -> 0x0172 }
            r4.<init>(r6, r3)     // Catch:{ all -> 0x0172 }
            java.lang.String r3 = "CompanionRegistrationManager/qrRefTimeoutRunnable"
            X.1jE r0 = r7.BpM(r4, r3, r0)     // Catch:{ all -> 0x0172 }
            r6.A0B = r0     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "HmacSHA256"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0168 }
            javax.crypto.SecretKey r0 = r0.generateKey()     // Catch:{ NoSuchAlgorithmException -> 0x0168 }
            byte[] r0 = r0.getEncoded()     // Catch:{ NoSuchAlgorithmException -> 0x0168 }
            r6.A0G = r0     // Catch:{ NoSuchAlgorithmException -> 0x0168 }
            X.130 r0 = r6.A0I     // Catch:{ all -> 0x0172 }
            X.AZA r0 = r0.A0E()     // Catch:{ all -> 0x0172 }
            X.AZ8 r13 = r0.A02     // Catch:{ all -> 0x0172 }
            r12 = 0
            r5 = 0
        L_0x00e0:
            java.lang.String r3 = "%s,%s,%s,%s,%s"
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0172 }
            java.lang.Object r0 = r10.get(r5)     // Catch:{ all -> 0x0172 }
            r1[r12] = r0     // Catch:{ all -> 0x0172 }
            byte[] r0 = r13.A01     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x0172 }
            r1[r2] = r0     // Catch:{ all -> 0x0172 }
            X.34P r0 = r6.A05     // Catch:{ all -> 0x0172 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0172 }
            X.3FZ r0 = r0.A01     // Catch:{ all -> 0x0172 }
            X.3IG r0 = r0.A00     // Catch:{ all -> 0x0172 }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x0172 }
            r1[r9] = r0     // Catch:{ all -> 0x0172 }
            byte[] r0 = r6.A0G     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x0172 }
            r1[r11] = r0     // Catch:{ all -> 0x0172 }
            r4 = 4
            X.1Pe r0 = r6.A0Q     // Catch:{ all -> 0x0172 }
            X.2nr r0 = r0.A00()     // Catch:{ all -> 0x0172 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0172 }
            if (r0 == r12) goto L_0x011e
            if (r0 == r9) goto L_0x0121
            java.lang.String r0 = "d"
            goto L_0x0123
        L_0x011e:
            java.lang.String r0 = "e"
            goto L_0x0123
        L_0x0121:
            java.lang.String r0 = "f"
        L_0x0123:
            r1[r4] = r0     // Catch:{ all -> 0x0172 }
            java.lang.String r15 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x0172 }
            int r14 = r5 * 20000
            long r3 = (long) r14     // Catch:{ all -> 0x0172 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0172 }
            r1.<init>()     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "CompanionRegistrationManager/refChangeRunnable"
            r1.append(r0)     // Catch:{ all -> 0x0172 }
            r1.append(r14)     // Catch:{ all -> 0x0172 }
            java.lang.String r14 = r1.toString()     // Catch:{ all -> 0x0172 }
            r1 = 7
            X.1il r0 = new X.1il     // Catch:{ all -> 0x0172 }
            r0.<init>(r1, r15, r6)     // Catch:{ all -> 0x0172 }
            X.1jE r1 = r7.BpM(r0, r14, r3)     // Catch:{ all -> 0x0172 }
            java.util.List r0 = r6.A0o     // Catch:{ all -> 0x0172 }
            r0.add(r1)     // Catch:{ all -> 0x0172 }
            int r5 = r5 + 1
            if (r5 < r8) goto L_0x00e0
            X.005 r0 = r6.A0m     // Catch:{ all -> 0x0172 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0172 }
            X.9Sk r0 = (X.C195079Sk) r0     // Catch:{ all -> 0x0172 }
            r0.A00()     // Catch:{ all -> 0x0172 }
            X.005 r0 = r6.A0l     // Catch:{ all -> 0x0172 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0172 }
            X.9Sc r0 = (X.C195009Sc) r0     // Catch:{ all -> 0x0172 }
            r0.A00()     // Catch:{ all -> 0x0172 }
            goto L_0x0567
        L_0x0168:
            java.lang.String r0 = "companion/registration/qr/failed to get keys"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
        L_0x016d:
            r6.A05()     // Catch:{ all -> 0x0172 }
            goto L_0x0567
        L_0x0172:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0175:
            r0 = 243(0xf3, float:3.4E-43)
            if (r1 != r0) goto L_0x0569
            java.lang.Object r6 = r3.obj
            X.C18740tg.A06(r6)
            X.9nx r6 = (X.C203399nx) r6
            java.lang.String r0 = "pair-success"
            X.9nx r1 = r6.A0c(r0)
            if (r1 == 0) goto L_0x0568
            java.lang.String r7 = "device-identity"
            X.9nx r4 = r1.A0c(r7)
            java.lang.String r0 = "device"
            X.9nx r3 = r1.A0c(r0)
            if (r4 == 0) goto L_0x0568
            if (r3 == 0) goto L_0x0568
            java.lang.String r11 = "id"
            r1 = 0
            java.lang.String r10 = r6.A0i(r11, r1)
            byte[] r9 = r4.A01
            java.lang.String r0 = "jid"
            java.lang.String r4 = r3.A0i(r0, r1)
            if (r10 == 0) goto L_0x0568
            if (r9 == 0) goto L_0x0568
            if (r4 == 0) goto L_0x0568
            X.1Ih r0 = r5.A00
            X.0xH r5 = X.C25951Ih.A00(r0)
            monitor-enter(r5)
            X.13g r3 = r5.A0P     // Catch:{ all -> 0x08c9 }
            int r1 = r3.A00()     // Catch:{ all -> 0x08c9 }
            r0 = 3
            if (r1 == r0) goto L_0x01c8
            r0 = 13
            if (r1 == r0) goto L_0x01c8
            java.lang.String r0 = "companion/registration/pair-success/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08c9 }
            goto L_0x08c7
        L_0x01c8:
            com.whatsapp.jid.DeviceJid r4 = com.whatsapp.jid.DeviceJid.getNullable(r4)     // Catch:{ all -> 0x08c9 }
            if (r4 == 0) goto L_0x0210
            X.1RU r6 = r5.A0L     // Catch:{ all -> 0x08c9 }
            com.whatsapp.jid.UserJid r12 = r4.userJid     // Catch:{ all -> 0x08c9 }
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)     // Catch:{ all -> 0x08c9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x08c9 }
            r8.<init>()     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = "AccountSwitcher/isUserJidAlreadyRegistered/"
            r8.append(r0)     // Catch:{ all -> 0x08c9 }
            java.lang.String r1 = r12.user     // Catch:{ all -> 0x08c9 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x08c9 }
            r0 = 4
            java.lang.String r0 = X.AnonymousClass14B.A0B(r1, r0)     // Catch:{ all -> 0x08c9 }
            if (r0 == 0) goto L_0x01ee
            r1 = r0
        L_0x01ee:
            r8.append(r1)     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x08c9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08c9 }
            X.005 r0 = r6.A0D     // Catch:{ all -> 0x08c9 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x08c9 }
            X.1Z0 r0 = (X.AnonymousClass1Z0) r0     // Catch:{ all -> 0x08c9 }
            X.6C2 r0 = X.AnonymousClass1Z0.A00(r0)     // Catch:{ all -> 0x08c9 }
            java.util.List r1 = r0.A01     // Catch:{ all -> 0x08c9 }
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ all -> 0x08c9 }
            if (r0 == 0) goto L_0x021e
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x08c9 }
            if (r0 == 0) goto L_0x021e
        L_0x0210:
            r0 = 4
            r3.A01(r0)     // Catch:{ all -> 0x08c9 }
            java.lang.Runnable r1 = r5.A09     // Catch:{ all -> 0x08c9 }
            if (r1 == 0) goto L_0x0243
            X.0wU r0 = r5.A0k     // Catch:{ all -> 0x08c9 }
            r0.Bnx(r1)     // Catch:{ all -> 0x08c9 }
            goto L_0x0243
        L_0x021e:
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x08c9 }
            r8 = 0
        L_0x0223:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x08c9 }
            if (r0 == 0) goto L_0x023f
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x08c9 }
            X.3KU r0 = (X.AnonymousClass3KU) r0     // Catch:{ all -> 0x08c9 }
            java.lang.String r1 = r0.A07     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = r12.user     // Catch:{ all -> 0x08c9 }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x08c9 }
            if (r0 == 0) goto L_0x0223
            int r8 = r8 + 1
            if (r8 >= 0) goto L_0x0223
            goto L_0x054f
        L_0x023f:
            if (r8 <= 0) goto L_0x0210
            goto L_0x055a
        L_0x0243:
            X.8Po r0 = X.C172888Po.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0548 }
            X.8Hz r1 = X.C170918Hz.A08(r0, r9)     // Catch:{ 186 -> 0x0548 }
            X.8Po r1 = (X.C172888Po) r1     // Catch:{ 186 -> 0x0548 }
            r6 = 0
            if (r1 != 0) goto L_0x0252
            java.lang.String r0 = "companion/registration/pair-success/invalid device identity hmac"
            goto L_0x04cd
        L_0x0252:
            X.AUx r0 = r1.hmac_     // Catch:{ all -> 0x08c9 }
            byte[] r9 = r0.A06()     // Catch:{ all -> 0x08c9 }
            X.AUx r0 = r1.details_     // Catch:{ all -> 0x08c9 }
            byte[] r8 = r0.A06()     // Catch:{ all -> 0x08c9 }
            int r0 = r1.accountType_     // Catch:{ all -> 0x08c9 }
            X.2q9 r1 = X.C52772q9.A00(r0)     // Catch:{ all -> 0x08c9 }
            if (r1 != 0) goto L_0x0268
            X.2q9 r1 = X.C52772q9.E2EE     // Catch:{ all -> 0x08c9 }
        L_0x0268:
            byte[] r12 = r5.A0G     // Catch:{ all -> 0x08c9 }
            X.0zN r14 = r5.A0d     // Catch:{ all -> 0x08c9 }
            r13 = r8
            X.AnonymousClass00C.A0D(r9, r6)     // Catch:{ all -> 0x08c9 }
            X.AnonymousClass00C.A0D(r8, r2)     // Catch:{ all -> 0x08c9 }
            r0 = 4
            X.AnonymousClass00C.A0D(r14, r0)     // Catch:{ all -> 0x08c9 }
            if (r12 == 0) goto L_0x04c3
            X.2q9 r0 = X.C52772q9.HOSTED     // Catch:{ all -> 0x08c9 }
            if (r1 != r0) goto L_0x0297
            r1 = 7074(0x1ba2, float:9.913E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x08c9 }
            boolean r0 = X.C20800yB.A01(r0, r14, r1)     // Catch:{ all -> 0x08c9 }
            if (r0 == 0) goto L_0x0297
            r0 = 2
            byte[][] r1 = new byte[r0][]     // Catch:{ all -> 0x08c9 }
            byte[] r0 = X.C19430v1.A0G     // Catch:{ all -> 0x08c9 }
            r1[r6] = r0     // Catch:{ all -> 0x08c9 }
            r1[r2] = r8     // Catch:{ all -> 0x08c9 }
            byte[] r13 = X.C203239na.A05(r1)     // Catch:{ all -> 0x08c9 }
            X.AnonymousClass00C.A08(r13)     // Catch:{ all -> 0x08c9 }
        L_0x0297:
            byte[] r0 = X.C110525ao.A00(r13, r12)     // Catch:{ Exception -> 0x04bd }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ all -> 0x08c9 }
            byte[] r1 = android.util.Base64.encode(r9, r6)     // Catch:{ all -> 0x08c9 }
            byte[] r0 = android.util.Base64.encode(r0, r6)     // Catch:{ all -> 0x08c9 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x08c9 }
            if (r0 == 0) goto L_0x04c3
            X.8Qc r0 = X.C173028Qc.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x04ba }
            X.8Hz r9 = X.C170918Hz.A08(r0, r8)     // Catch:{ 186 -> 0x04ba }
            X.8Qc r9 = (X.C173028Qc) r9     // Catch:{ 186 -> 0x04ba }
            X.AUx r0 = r9.accountSignatureKey_     // Catch:{ all -> 0x08c9 }
            byte[] r8 = r0.A06()     // Catch:{ all -> 0x08c9 }
            X.1VR r12 = r5.A0O     // Catch:{ all -> 0x08c9 }
            r1 = 5
            X.3IG r0 = new X.3IG     // Catch:{ all -> 0x08c9 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x08c9 }
            X.3FZ r13 = new X.3FZ     // Catch:{ all -> 0x08c9 }
            r13.<init>(r0)     // Catch:{ all -> 0x08c9 }
            X.0wo r0 = r12.A03     // Catch:{ all -> 0x08c9 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x08c9 }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r14
            r12.A00 = r0     // Catch:{ all -> 0x08c9 }
            X.1AB r0 = r12.A02     // Catch:{ all -> 0x08c9 }
            X.189 r0 = r0.A03     // Catch:{ all -> 0x08c9 }
            X.18u r0 = r0.A00     // Catch:{ all -> 0x08c9 }
            X.34P r0 = r0.A04()     // Catch:{ all -> 0x08c9 }
            X.3FZ r0 = r0.A01     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = X.AnonymousClass1AB.A04(r0, r13)     // Catch:{ all -> 0x08c9 }
            r12.A01 = r0     // Catch:{ all -> 0x08c9 }
            X.34P r0 = r5.A05     // Catch:{ all -> 0x08c9 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x08c9 }
            X.3FZ r0 = r0.A01     // Catch:{ all -> 0x08c9 }
            X.3IG r0 = r0.A00     // Catch:{ all -> 0x08c9 }
            byte[] r12 = r0.A01     // Catch:{ all -> 0x08c9 }
            X.AnonymousClass00C.A0D(r12, r2)     // Catch:{ all -> 0x08c9 }
            X.AUx r0 = r9.accountSignature_     // Catch:{ all -> 0x08c9 }
            byte[] r13 = r0.A06()     // Catch:{ all -> 0x08c9 }
            X.AUx r0 = r9.accountSignatureKey_     // Catch:{ all -> 0x08c9 }
            byte[] r15 = r0.A06()     // Catch:{ all -> 0x08c9 }
            r0 = 3
            byte[][] r1 = new byte[r0][]     // Catch:{ all -> 0x08c9 }
            byte[] r0 = X.C19430v1.A0F     // Catch:{ all -> 0x08c9 }
            r1[r6] = r0     // Catch:{ all -> 0x08c9 }
            X.AUx r0 = r9.details_     // Catch:{ all -> 0x08c9 }
            byte[] r0 = r0.A06()     // Catch:{ all -> 0x08c9 }
            r1[r2] = r0     // Catch:{ all -> 0x08c9 }
            r0 = 2
            r1[r0] = r12     // Catch:{ all -> 0x08c9 }
            byte[] r12 = X.C203239na.A05(r1)     // Catch:{ all -> 0x08c9 }
            byte[][] r14 = new byte[r0][]     // Catch:{ 110 -> 0x04c6 }
            byte[] r1 = new byte[r2]     // Catch:{ 110 -> 0x04c6 }
            r0 = 5
            r1[r6] = r0     // Catch:{ 110 -> 0x04c6 }
            r14[r6] = r1     // Catch:{ 110 -> 0x04c6 }
            r14[r2] = r15     // Catch:{ 110 -> 0x04c6 }
            byte[] r0 = X.C203239na.A05(r14)     // Catch:{ 110 -> 0x04c6 }
            X.3IG r0 = X.C133256Xm.A01(r0)     // Catch:{ 110 -> 0x04c6 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ 110 -> 0x04c6 }
            boolean r0 = X.C133256Xm.A06(r0, r12, r13)     // Catch:{ all -> 0x08c9 }
            if (r0 == 0) goto L_0x04cb
            r5.A08 = r9     // Catch:{ all -> 0x08c9 }
            r5.A0F = r8     // Catch:{ all -> 0x08c9 }
            r0 = 5
            r3.A01(r0)     // Catch:{ all -> 0x08c9 }
            r5.A06 = r4     // Catch:{ all -> 0x08c9 }
            X.8Qc r0 = r5.A08     // Catch:{ 186 -> 0x08bf }
            X.AUx r0 = r0.details_     // Catch:{ 186 -> 0x08bf }
            byte[] r1 = r0.A06()     // Catch:{ 186 -> 0x08bf }
            X.8R5 r0 = X.AnonymousClass8R5.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x08bf }
            X.8Hz r3 = X.C170918Hz.A08(r0, r1)     // Catch:{ 186 -> 0x08bf }
            X.8R5 r3 = (X.AnonymousClass8R5) r3     // Catch:{ 186 -> 0x08bf }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x08c9 }
            X.8Qc r8 = r5.A08     // Catch:{ all -> 0x08c9 }
            X.34P r1 = r5.A05     // Catch:{ all -> 0x08c9 }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x08c9 }
            X.3FZ r0 = r1.A01     // Catch:{ all -> 0x08c9 }
            X.3IG r12 = r0.A00     // Catch:{ all -> 0x08c9 }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x08c9 }
            X.66J r4 = r1.A00     // Catch:{ all -> 0x08c9 }
            X.AnonymousClass00C.A0D(r8, r6)     // Catch:{ all -> 0x08c9 }
            X.AnonymousClass00C.A0D(r12, r2)     // Catch:{ all -> 0x08c9 }
            r1 = 2
            r0 = 4
            byte[][] r9 = new byte[r0][]     // Catch:{ all -> 0x08c9 }
            byte[] r0 = X.C19430v1.A0H     // Catch:{ all -> 0x08c9 }
            r9[r6] = r0     // Catch:{ all -> 0x08c9 }
            X.AUx r0 = r8.details_     // Catch:{ all -> 0x08c9 }
            byte[] r0 = r0.A06()     // Catch:{ all -> 0x08c9 }
            r9[r2] = r0     // Catch:{ all -> 0x08c9 }
            byte[] r0 = r12.A01     // Catch:{ all -> 0x08c9 }
            r9[r1] = r0     // Catch:{ all -> 0x08c9 }
            X.AUx r0 = r8.accountSignatureKey_     // Catch:{ all -> 0x08c9 }
            byte[] r1 = r0.A06()     // Catch:{ all -> 0x08c9 }
            r0 = 3
            r9[r0] = r1     // Catch:{ all -> 0x08c9 }
            byte[] r0 = X.C203239na.A05(r9)     // Catch:{ all -> 0x08c9 }
            X.8NN r8 = r8.A0q()     // Catch:{ all -> 0x08c9 }
            X.8Il r8 = (X.C171038Il) r8     // Catch:{ all -> 0x08c9 }
            byte[] r1 = X.C133256Xm.A08(r4, r0)     // Catch:{ all -> 0x08c9 }
            int r0 = r1.length     // Catch:{ all -> 0x08c9 }
            X.8I5 r4 = X.C21674AUx.A01(r1, r6, r0)     // Catch:{ all -> 0x08c9 }
            r8.A0S()     // Catch:{ all -> 0x08c9 }
            X.8Hz r1 = r8.A00     // Catch:{ all -> 0x08c9 }
            X.8Qc r1 = (X.C173028Qc) r1     // Catch:{ all -> 0x08c9 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x08c9 }
            r0 = r0 | 8
            r1.bitField0_ = r0     // Catch:{ all -> 0x08c9 }
            r1.deviceSignature_ = r4     // Catch:{ all -> 0x08c9 }
            X.8Hz r0 = r8.A0R()     // Catch:{ all -> 0x08c9 }
            X.8Qc r0 = (X.C173028Qc) r0     // Catch:{ all -> 0x08c9 }
            r5.A08 = r0     // Catch:{ all -> 0x08c9 }
            X.8NN r4 = r0.A0q()     // Catch:{ all -> 0x08c9 }
            X.8Il r4 = (X.C171038Il) r4     // Catch:{ all -> 0x08c9 }
            r4.A0S()     // Catch:{ all -> 0x08c9 }
            X.8Hz r1 = r4.A00     // Catch:{ all -> 0x08c9 }
            X.8Qc r1 = (X.C173028Qc) r1     // Catch:{ all -> 0x08c9 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x08c9 }
            r0 = r0 & -3
            r1.bitField0_ = r0     // Catch:{ all -> 0x08c9 }
            X.8Qc r0 = X.C173028Qc.DEFAULT_INSTANCE     // Catch:{ all -> 0x08c9 }
            X.AUx r0 = r0.accountSignatureKey_     // Catch:{ all -> 0x08c9 }
            r1.accountSignatureKey_ = r0     // Catch:{ all -> 0x08c9 }
            X.8Hz r0 = r4.A0R()     // Catch:{ all -> 0x08c9 }
            byte[] r8 = r0.A0o()     // Catch:{ all -> 0x08c9 }
            X.005 r0 = r5.A0m     // Catch:{ all -> 0x08c9 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x08c9 }
            X.9Sk r12 = (X.C195079Sk) r12     // Catch:{ all -> 0x08c9 }
            X.0zN r1 = r12.A08     // Catch:{ all -> 0x08c9 }
            r0 = 6430(0x191e, float:9.01E-42)
            X.0yV r9 = X.C21000yV.A02     // Catch:{ all -> 0x08c9 }
            boolean r13 = X.C20800yB.A01(r9, r1, r0)     // Catch:{ all -> 0x08c9 }
            int r6 = r12.A03     // Catch:{ all -> 0x08c9 }
            r0 = 7217(0x1c31, float:1.0113E-41)
            int r4 = X.C20800yB.A00(r9, r1, r0)     // Catch:{ all -> 0x08c9 }
            r1 = 1
            r0 = 0
            if (r6 >= r4) goto L_0x03ea
            r0 = 1
        L_0x03ea:
            if (r13 == 0) goto L_0x03f2
            if (r0 == 0) goto L_0x03f2
        L_0x03ee:
            r6 = 0
            if (r1 == 0) goto L_0x0404
            goto L_0x03f4
        L_0x03f2:
            r1 = 0
            goto L_0x03ee
        L_0x03f4:
            r12.A00()     // Catch:{ all -> 0x08c9 }
            com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1 r1 = new com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1     // Catch:{ all -> 0x08c9 }
            r1.<init>(r12, r6)     // Catch:{ all -> 0x08c9 }
            X.03u r0 = X.C008903u.A00     // Catch:{ all -> 0x08c9 }
            java.lang.Object r6 = X.C110515an.A00(r0, r1)     // Catch:{ all -> 0x08c9 }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x08c9 }
        L_0x0404:
            X.005 r0 = r5.A0l     // Catch:{ all -> 0x08c9 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x08c9 }
            X.9Sc r4 = (X.C195009Sc) r4     // Catch:{ all -> 0x08c9 }
            X.0zN r1 = r4.A05     // Catch:{ all -> 0x08c9 }
            r0 = 7006(0x1b5e, float:9.817E-42)
            boolean r1 = X.C20800yB.A01(r9, r1, r0)     // Catch:{ all -> 0x08c9 }
            r0 = 0
            if (r1 == 0) goto L_0x0427
            r4.A00()     // Catch:{ all -> 0x08c9 }
            com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1 r1 = new com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1     // Catch:{ all -> 0x08c9 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x08c9 }
            X.03u r0 = X.C008903u.A00     // Catch:{ all -> 0x08c9 }
            java.lang.Object r0 = X.C110515an.A00(r0, r1)     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x08c9 }
        L_0x0427:
            int r1 = r3.rawId_     // Catch:{ all -> 0x08c9 }
            r5.A02 = r1     // Catch:{ all -> 0x08c9 }
            int r9 = r3.keyIndex_     // Catch:{ all -> 0x08c9 }
            r5.A00 = r9     // Catch:{ all -> 0x08c9 }
            long r3 = r3.timestamp_     // Catch:{ all -> 0x08c9 }
            r5.A03 = r3     // Catch:{ all -> 0x08c9 }
            X.60q r1 = r5.A0R     // Catch:{ all -> 0x08c9 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x08c9 }
            X.19A r4 = r1.A00     // Catch:{ all -> 0x08c9 }
            X.1AL[] r13 = new X.AnonymousClass1AL[r2]     // Catch:{ all -> 0x08c9 }
            java.lang.String r3 = "key-index"
            X.1AL r1 = new X.1AL     // Catch:{ all -> 0x08c9 }
            r1.<init>((java.lang.String) r3, (java.lang.String) r9)     // Catch:{ all -> 0x08c9 }
            r9 = 0
            r13[r9] = r1     // Catch:{ all -> 0x08c9 }
            X.9nx r12 = new X.9nx     // Catch:{ all -> 0x08c9 }
            r12.<init>((java.lang.String) r7, (byte[]) r8, (X.AnonymousClass1AL[]) r13)     // Catch:{ all -> 0x08c9 }
            X.1AL[] r3 = new X.AnonymousClass1AL[r9]     // Catch:{ all -> 0x08c9 }
            java.lang.String r1 = "key_attestation"
            X.9nx r8 = new X.9nx     // Catch:{ all -> 0x08c9 }
            r8.<init>((java.lang.String) r1, (byte[]) r6, (X.AnonymousClass1AL[]) r3)     // Catch:{ all -> 0x08c9 }
            X.1AL[] r3 = new X.AnonymousClass1AL[r9]     // Catch:{ all -> 0x08c9 }
            java.lang.String r1 = "gpia"
            X.9nx r7 = new X.9nx     // Catch:{ all -> 0x08c9 }
            r7.<init>((java.lang.String) r1, (java.lang.String) r0, (X.AnonymousClass1AL[]) r3)     // Catch:{ all -> 0x08c9 }
            X.1AL[] r6 = new X.AnonymousClass1AL[r9]     // Catch:{ all -> 0x08c9 }
            r3 = 3
            X.9nx[] r1 = new X.C203399nx[r3]     // Catch:{ all -> 0x08c9 }
            r1[r9] = r12     // Catch:{ all -> 0x08c9 }
            r1[r2] = r8     // Catch:{ all -> 0x08c9 }
            r8 = 2
            r1[r8] = r7     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = "pair-device-sign"
            X.9nx r7 = new X.9nx     // Catch:{ all -> 0x08c9 }
            r7.<init>((java.lang.String) r0, (X.AnonymousClass1AL[]) r6, (X.C203399nx[]) r1)     // Catch:{ all -> 0x08c9 }
            X.1AL[] r6 = new X.AnonymousClass1AL[r3]     // Catch:{ all -> 0x08c9 }
            X.8e2 r3 = X.C177588e2.A00     // Catch:{ all -> 0x08c9 }
            java.lang.String r1 = "to"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x08c9 }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)     // Catch:{ all -> 0x08c9 }
            r6[r9] = r0     // Catch:{ all -> 0x08c9 }
            java.lang.String r3 = "type"
            java.lang.String r1 = "result"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x08c9 }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ all -> 0x08c9 }
            r6[r2] = r0     // Catch:{ all -> 0x08c9 }
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x08c9 }
            r0.<init>((java.lang.String) r11, (java.lang.String) r10)     // Catch:{ all -> 0x08c9 }
            r6[r8] = r0     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = "iq"
            X.9nx r1 = new X.9nx     // Catch:{ all -> 0x08c9 }
            r1.<init>((X.C203399nx) r7, (java.lang.String) r0, (X.AnonymousClass1AL[]) r6)     // Catch:{ all -> 0x08c9 }
            r0 = 307(0x133, float:4.3E-43)
            r4.A0G(r1, r0)     // Catch:{ all -> 0x08c9 }
            java.lang.Runnable r1 = r5.A0C     // Catch:{ all -> 0x08c9 }
            if (r1 == 0) goto L_0x04a5
            X.0wU r0 = r5.A0k     // Catch:{ all -> 0x08c9 }
            r0.Bnx(r1)     // Catch:{ all -> 0x08c9 }
        L_0x04a5:
            X.0wU r6 = r5.A0k     // Catch:{ all -> 0x08c9 }
            r3 = 3000(0xbb8, double:1.482E-320)
            r0 = 40
            X.1j4 r1 = new X.1j4     // Catch:{ all -> 0x08c9 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = "CompanionRegistrationManager/serverRegistrationTimeoutRunnable"
            X.1jE r0 = r6.BpM(r1, r0, r3)     // Catch:{ all -> 0x08c9 }
            r5.A0C = r0     // Catch:{ all -> 0x08c9 }
            goto L_0x08c7
        L_0x04ba:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity"
            goto L_0x04cd
        L_0x04bd:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegistrationAdvUtil/verifyDeviceIdentityHMAC/Failed to calculate hmac-sha256"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x08c9 }
        L_0x04c3:
            java.lang.String r0 = "companion/registration/pair-success/hmac verification failed"
            goto L_0x04cd
        L_0x04c6:
            java.lang.String r0 = "CompanionRegistrationAdvUtil/verifyDeviceIdentityAccountSignature/invalidKeyException"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08c9 }
        L_0x04cb:
            java.lang.String r0 = "companion/registration/pair-success/account signature verification failed"
        L_0x04cd:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08c9 }
            r0 = 6
            r3.A01(r0)     // Catch:{ all -> 0x08c9 }
            X.1VR r3 = r5.A0O     // Catch:{ all -> 0x08c9 }
            r0 = 401(0x191, double:1.98E-321)
            r3.A00(r2, r0)     // Catch:{ all -> 0x08c9 }
            X.60q r0 = r5.A0R     // Catch:{ all -> 0x08c9 }
            X.19A r8 = r0.A00     // Catch:{ all -> 0x08c9 }
            r9 = 2
            X.1AL[] r4 = new X.AnonymousClass1AL[r9]     // Catch:{ all -> 0x08c9 }
            java.lang.String r3 = "code"
            r1 = 401(0x191, float:5.62E-43)
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x08c9 }
            r0.<init>((java.lang.String) r3, (int) r1)     // Catch:{ all -> 0x08c9 }
            r12 = 0
            r4[r6] = r0     // Catch:{ all -> 0x08c9 }
            java.lang.String r3 = "text"
            java.lang.String r1 = "not-authorized"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x08c9 }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ all -> 0x08c9 }
            r4[r2] = r0     // Catch:{ all -> 0x08c9 }
            java.lang.String r7 = "error"
            X.9nx r6 = new X.9nx     // Catch:{ all -> 0x08c9 }
            r6.<init>(r7, r4)     // Catch:{ all -> 0x08c9 }
            r0 = 3
            X.1AL[] r4 = new X.AnonymousClass1AL[r0]     // Catch:{ all -> 0x08c9 }
            X.8e2 r3 = X.C177588e2.A00     // Catch:{ all -> 0x08c9 }
            java.lang.String r1 = "to"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x08c9 }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)     // Catch:{ all -> 0x08c9 }
            r4[r12] = r0     // Catch:{ all -> 0x08c9 }
            java.lang.String r1 = "type"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x08c9 }
            r0.<init>((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ all -> 0x08c9 }
            r4[r2] = r0     // Catch:{ all -> 0x08c9 }
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x08c9 }
            r0.<init>((java.lang.String) r11, (java.lang.String) r10)     // Catch:{ all -> 0x08c9 }
            r4[r9] = r0     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = "iq"
            X.9nx r1 = new X.9nx     // Catch:{ all -> 0x08c9 }
            r1.<init>((X.C203399nx) r6, (java.lang.String) r0, (X.AnonymousClass1AL[]) r4)     // Catch:{ all -> 0x08c9 }
            r0 = 306(0x132, float:4.29E-43)
            r8.A0G(r1, r0)     // Catch:{ all -> 0x08c9 }
            java.lang.Runnable r1 = r5.A0D     // Catch:{ all -> 0x08c9 }
            if (r1 == 0) goto L_0x0533
            X.0wU r0 = r5.A0k     // Catch:{ all -> 0x08c9 }
            r0.Bnx(r1)     // Catch:{ all -> 0x08c9 }
        L_0x0533:
            X.0wU r6 = r5.A0k     // Catch:{ all -> 0x08c9 }
            r3 = 1000(0x3e8, double:4.94E-321)
            r0 = 35
            X.1j4 r1 = new X.1j4     // Catch:{ all -> 0x08c9 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = "CompanionRegistrationManager/verificationErrorRunnable"
            X.1jE r0 = r6.BpM(r1, r0, r3)     // Catch:{ all -> 0x08c9 }
            r5.A0D = r0     // Catch:{ all -> 0x08c9 }
            goto L_0x08c7
        L_0x0548:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity HMAC"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08c9 }
            goto L_0x08c4
        L_0x054f:
            X.AnonymousClass03T.A04()     // Catch:{ all -> 0x08c9 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x08c9 }
            r0.<init>(r1)     // Catch:{ all -> 0x08c9 }
            throw r0     // Catch:{ all -> 0x08c9 }
        L_0x055a:
            java.lang.String r0 = "companion/registration/pair-success/account already registered on device, cancelling registration"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08c9 }
            com.whatsapp.jid.UserJid r0 = r4.userJid     // Catch:{ all -> 0x08c9 }
            java.lang.String r0 = r0.user     // Catch:{ all -> 0x08c9 }
            r6.A01 = r0     // Catch:{ all -> 0x08c9 }
            goto L_0x08c4
        L_0x0567:
            monitor-exit(r6)
        L_0x0568:
            return r2
        L_0x0569:
            r0 = 244(0xf4, float:3.42E-43)
            if (r1 != r0) goto L_0x089a
            X.1Ih r0 = r5.A00
            X.0xH r3 = X.C25951Ih.A00(r0)
            monitor-enter(r3)
            X.13g r4 = r3.A0P     // Catch:{ all -> 0x0897 }
            int r0 = r4.A00()     // Catch:{ all -> 0x0897 }
            r9 = 5
            if (r0 != r9) goto L_0x0890
            X.8Qc r0 = r3.A08     // Catch:{ all -> 0x0897 }
            if (r0 == 0) goto L_0x0890
            X.1C4 r0 = r3.A0g     // Catch:{ all -> 0x0897 }
            r0.A00()     // Catch:{ all -> 0x0897 }
            X.005 r7 = r3.A0n     // Catch:{ all -> 0x0897 }
            java.lang.Object r1 = r7.get()     // Catch:{ all -> 0x0897 }
            X.0y3 r1 = (X.C20720y3) r1     // Catch:{ all -> 0x0897 }
            r0 = 16
            r5 = 0
            r1.A0G(r5, r0)     // Catch:{ all -> 0x0897 }
            X.C20260xH.A01(r3)     // Catch:{ all -> 0x0897 }
            java.lang.Runnable r1 = r3.A0C     // Catch:{ all -> 0x0897 }
            if (r1 == 0) goto L_0x05a0
            X.0wU r0 = r3.A0k     // Catch:{ all -> 0x0897 }
            r0.Bnx(r1)     // Catch:{ all -> 0x0897 }
        L_0x05a0:
            r0 = 7
            r4.A01(r0)     // Catch:{ all -> 0x0897 }
            com.whatsapp.jid.DeviceJid r10 = r3.A06     // Catch:{ all -> 0x0897 }
            X.C18740tg.A06(r10)     // Catch:{ all -> 0x0897 }
            X.0v0 r6 = r3.A0X     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = r10.user     // Catch:{ all -> 0x0897 }
            r6.A1V(r0)     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = r10.user     // Catch:{ all -> 0x0897 }
            java.lang.String r11 = X.AnonymousClass3SI.A02(r0)     // Catch:{ all -> 0x0897 }
            X.C18740tg.A06(r11)     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = r10.user     // Catch:{ all -> 0x0897 }
            java.lang.String r1 = X.AnonymousClass3U2.A03(r0)     // Catch:{ all -> 0x0897 }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x0897 }
            int r0 = r11.length()     // Catch:{ all -> 0x0897 }
            java.lang.String r8 = r1.substring(r0)     // Catch:{ all -> 0x0897 }
            r6.A1l(r11, r8)     // Catch:{ all -> 0x0897 }
            r6.A1w(r5)     // Catch:{ all -> 0x0897 }
            r6.A1v(r5)     // Catch:{ all -> 0x0897 }
            X.0wq r1 = r3.A0S     // Catch:{ all -> 0x0897 }
            int r0 = r10.getDevice()     // Catch:{ all -> 0x0897 }
            r1.A00(r0)     // Catch:{ all -> 0x0897 }
            X.0wp r12 = r3.A0T     // Catch:{ all -> 0x0897 }
            X.8Qc r0 = r3.A08     // Catch:{ all -> 0x0897 }
            byte[] r1 = r0.A0o()     // Catch:{ all -> 0x0897 }
            r0 = 3
            java.lang.String r4 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0897 }
            android.content.SharedPreferences r0 = X.C19980wp.A00(r12)     // Catch:{ all -> 0x0897 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = "adv_signed_identity"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r4)     // Catch:{ all -> 0x0897 }
            r0.apply()     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = r10.user     // Catch:{ all -> 0x0897 }
            com.whatsapp.Me r1 = new com.whatsapp.Me     // Catch:{ all -> 0x0897 }
            r1.<init>(r11, r8, r0)     // Catch:{ all -> 0x0897 }
            X.0wQ r8 = r3.A0J     // Catch:{ all -> 0x0897 }
            r8.A0G()     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = "me"
            boolean r0 = X.C19730wQ.A03(r1, r8, r0)     // Catch:{ all -> 0x0897 }
            if (r0 != 0) goto L_0x0618
            java.lang.String r0 = "companion/registration/complete/save me object failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0897 }
            r3.A05()     // Catch:{ all -> 0x0897 }
            goto L_0x0895
        L_0x0618:
            r8.A0G()     // Catch:{ all -> 0x0897 }
            X.C19730wQ.A01(r1, r8)     // Catch:{ all -> 0x0897 }
            java.lang.Object r4 = r7.get()     // Catch:{ all -> 0x0897 }
            X.0y3 r4 = (X.C20720y3) r4     // Catch:{ all -> 0x0897 }
            com.whatsapp.jid.UserJid r1 = r10.userJid     // Catch:{ all -> 0x0897 }
            boolean r0 = r4.A10     // Catch:{ all -> 0x0897 }
            if (r0 == 0) goto L_0x062c
            r4.A04 = r1     // Catch:{ all -> 0x0897 }
        L_0x062c:
            X.1O8 r1 = r3.A0h     // Catch:{ all -> 0x0897 }
            com.whatsapp.jid.UserJid r0 = r10.userJid     // Catch:{ all -> 0x0897 }
            r1.A01(r0, r5, r2)     // Catch:{ all -> 0x0897 }
            X.12s r0 = r3.A0a     // Catch:{ all -> 0x0897 }
            r0.A00()     // Catch:{ all -> 0x0897 }
            X.1Hq r1 = r3.A0f     // Catch:{ all -> 0x0897 }
            boolean r0 = r8.A0L()     // Catch:{ all -> 0x0897 }
            X.0yN r4 = r1.A08     // Catch:{ all -> 0x0897 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0897 }
            X.AnonymousClass00C.A0D(r4, r5)     // Catch:{ all -> 0x0897 }
            r0 = 12027(0x2efb, float:1.6853E-41)
            r4.BqE(r1, r0, r5)     // Catch:{ all -> 0x0897 }
            r4.BqE(r1, r0, r2)     // Catch:{ all -> 0x0897 }
            r0 = 2
            byte[][] r1 = new byte[r0][]     // Catch:{ 110 -> 0x0886 }
            byte[] r0 = new byte[r2]     // Catch:{ 110 -> 0x0886 }
            r0[r5] = r9     // Catch:{ 110 -> 0x0886 }
            r1[r5] = r0     // Catch:{ 110 -> 0x0886 }
            byte[] r0 = r3.A0F     // Catch:{ 110 -> 0x0886 }
            r1[r2] = r0     // Catch:{ 110 -> 0x0886 }
            byte[] r0 = X.C203239na.A05(r1)     // Catch:{ 110 -> 0x0886 }
            X.3IG r0 = X.C133256Xm.A01(r0)     // Catch:{ 110 -> 0x0886 }
            X.3FZ r9 = new X.3FZ     // Catch:{ all -> 0x0897 }
            r9.<init>(r0)     // Catch:{ all -> 0x0897 }
            X.189 r1 = r3.A0Y     // Catch:{ all -> 0x0897 }
            boolean r0 = r1.A0X()     // Catch:{ all -> 0x0897 }
            if (r0 == 0) goto L_0x0707
            com.whatsapp.jid.UserJid r0 = r10.userJid     // Catch:{ all -> 0x0897 }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x0897 }
            X.6EZ r0 = X.C133256Xm.A02(r0)     // Catch:{ all -> 0x0897 }
            r1.A0Q(r9, r0)     // Catch:{ all -> 0x0897 }
        L_0x067e:
            int r4 = r3.A02     // Catch:{ all -> 0x0897 }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r6)     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = "adv_raw_id"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r4)     // Catch:{ all -> 0x0897 }
            r0.apply()     // Catch:{ all -> 0x0897 }
            int r4 = r3.A00     // Catch:{ all -> 0x0897 }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r6)     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = "adv_current_key_index"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r4)     // Catch:{ all -> 0x0897 }
            r0.apply()     // Catch:{ all -> 0x0897 }
            long r0 = r3.A03     // Catch:{ all -> 0x0897 }
            android.content.SharedPreferences$Editor r9 = X.C19420v0.A00(r6)     // Catch:{ all -> 0x0897 }
            java.lang.String r4 = "adv_timestamp_sec"
            android.content.SharedPreferences$Editor r0 = r9.putLong(r4, r0)     // Catch:{ all -> 0x0897 }
            r0.apply()     // Catch:{ all -> 0x0897 }
            X.0wo r0 = r3.A0V     // Catch:{ all -> 0x0897 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0897 }
            android.content.SharedPreferences$Editor r6 = X.C19420v0.A00(r6)     // Catch:{ all -> 0x0897 }
            java.lang.String r4 = "registration_success_time_ms"
            android.content.SharedPreferences$Editor r0 = r6.putLong(r4, r0)     // Catch:{ all -> 0x0897 }
            r0.apply()     // Catch:{ all -> 0x0897 }
            X.13I r0 = r3.A0i     // Catch:{ all -> 0x0897 }
            r0.A00(r5)     // Catch:{ all -> 0x0897 }
            X.0x0 r6 = new X.0x0     // Catch:{ all -> 0x0897 }
            r6.<init>()     // Catch:{ all -> 0x0897 }
            r8.A0G()     // Catch:{ all -> 0x0897 }
            com.whatsapp.jid.PhoneUserJid r0 = r8.A03     // Catch:{ all -> 0x0897 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0897 }
            com.whatsapp.jid.DeviceJid r4 = r0.getPrimaryDevice()     // Catch:{ all -> 0x0897 }
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0897 }
            r6.put(r4, r0)     // Catch:{ all -> 0x0897 }
            X.0wy r1 = r6.build()     // Catch:{ all -> 0x0897 }
            X.19g r0 = r3.A0b     // Catch:{ all -> 0x0897 }
            r0.A0E(r1, r5, r5)     // Catch:{ all -> 0x0897 }
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x0897 }
            X.0y3 r0 = (X.C20720y3) r0     // Catch:{ all -> 0x0897 }
            r0.A07()     // Catch:{ all -> 0x0897 }
            java.lang.Iterable r0 = r3.getObservers()     // Catch:{ all -> 0x0897 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0897 }
        L_0x06f7:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0897 }
            if (r0 == 0) goto L_0x0717
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0897 }
            X.3LD r0 = (X.AnonymousClass3LD) r0     // Catch:{ all -> 0x0897 }
            r0.A03()     // Catch:{ all -> 0x0897 }
            goto L_0x06f7
        L_0x0707:
            X.187 r4 = r3.A0Z     // Catch:{ all -> 0x0897 }
            r0 = 28
            X.1iV r1 = new X.1iV     // Catch:{ all -> 0x0897 }
            r1.<init>(r3, r10, r9, r0)     // Catch:{ all -> 0x0897 }
            java.util.concurrent.ThreadPoolExecutor r0 = r4.A00     // Catch:{ all -> 0x0897 }
            r0.submit(r1)     // Catch:{ all -> 0x0897 }
            goto L_0x067e
        L_0x0717:
            X.2ZE r12 = r3.A0N     // Catch:{ all -> 0x0897 }
            java.util.concurrent.atomic.AtomicInteger r0 = r12.A09     // Catch:{ all -> 0x0897 }
            r0.set(r5)     // Catch:{ all -> 0x0897 }
            X.3ty r4 = new X.3ty     // Catch:{ all -> 0x0897 }
            r4.<init>()     // Catch:{ all -> 0x0897 }
            X.1aS r8 = r12.A02     // Catch:{ all -> 0x0897 }
            X.3ty r11 = new X.3ty     // Catch:{ all -> 0x0897 }
            r11.<init>()     // Catch:{ all -> 0x0897 }
            r1 = 2
            X.413 r0 = new X.413     // Catch:{ all -> 0x0897 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x0897 }
            r11.A0A(r0)     // Catch:{ all -> 0x0897 }
            X.5pu r0 = new X.5pu     // Catch:{ all -> 0x0897 }
            r0.<init>(r11, r8)     // Catch:{ all -> 0x0897 }
            X.1aV r7 = r8.A03     // Catch:{ all -> 0x0897 }
            monitor-enter(r7)     // Catch:{ all -> 0x0897 }
            r7.A00 = r0     // Catch:{ all -> 0x0883 }
            monitor-exit(r7)     // Catch:{ all -> 0x0897 }
            r6 = 0
            X.7sf r0 = new X.7sf     // Catch:{ all -> 0x0897 }
            r0.<init>(r8, r5)     // Catch:{ all -> 0x0897 }
            r11.A0A(r0)     // Catch:{ all -> 0x0897 }
            X.0wp r0 = r8.A05     // Catch:{ JSONException -> 0x0773 }
            org.json.JSONObject r8 = r0.A01()     // Catch:{ JSONException -> 0x0773 }
            android.content.SharedPreferences r7 = X.C19980wp.A00(r0)     // Catch:{ JSONException -> 0x0773 }
            java.lang.String r0 = "HAS_COMPANION_HISTORY_SYNC_FAILED"
            boolean r0 = r7.getBoolean(r0, r5)     // Catch:{ JSONException -> 0x0773 }
            if (r0 == 0) goto L_0x0761
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x0773 }
            r11.A0C(r0)     // Catch:{ JSONException -> 0x0773 }
            goto L_0x0778
        L_0x0761:
            if (r8 == 0) goto L_0x0778
            java.lang.String r0 = "sync_type"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x0773 }
            if (r0 <= 0) goto L_0x0778
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ JSONException -> 0x0773 }
            r11.A0C(r0)     // Catch:{ JSONException -> 0x0773 }
            goto L_0x0778
        L_0x0773:
            java.lang.String r0 = "ReceiveHistorySyncManager/ unable to parse history sync companion state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0897 }
        L_0x0778:
            X.39p r9 = r12.A01     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = "CompanionSyncdBootstrapManager/startCriticalBootstrapPhase started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0897 }
            X.3ty r13 = new X.3ty     // Catch:{ all -> 0x0897 }
            r13.<init>()     // Catch:{ all -> 0x0897 }
            X.413 r0 = new X.413     // Catch:{ all -> 0x0897 }
            r0.<init>(r9, r2)     // Catch:{ all -> 0x0897 }
            r13.A0A(r0)     // Catch:{ all -> 0x0897 }
            X.0wQ r0 = r9.A00     // Catch:{ all -> 0x0897 }
            boolean r0 = r0.A0L()     // Catch:{ all -> 0x0897 }
            r10 = 0
            if (r0 == 0) goto L_0x07af
            X.0wp r8 = r9.A03     // Catch:{ all -> 0x0897 }
            android.content.SharedPreferences r0 = X.C19980wp.A00(r8)     // Catch:{ all -> 0x0897 }
            java.lang.String r7 = "companion_syncd_critical_bootstrap_state"
            int r0 = r0.getInt(r7, r5)     // Catch:{ all -> 0x0897 }
            if (r0 == 0) goto L_0x07b7
            android.content.SharedPreferences r0 = X.C19980wp.A00(r8)     // Catch:{ all -> 0x0897 }
            int r7 = r0.getInt(r7, r5)     // Catch:{ all -> 0x0897 }
            r0 = 3
            if (r7 < r0) goto L_0x07af
            r10 = 1
        L_0x07af:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0897 }
            r13.A0C(r0)     // Catch:{ all -> 0x0897 }
            goto L_0x07d4
        L_0x07b7:
            X.2rq r7 = new X.2rq     // Catch:{ all -> 0x0897 }
            r7.<init>(r13, r9, r5)     // Catch:{ all -> 0x0897 }
            X.1Ic r0 = r9.A01     // Catch:{ all -> 0x0897 }
            r0.registerObserver(r7)     // Catch:{ all -> 0x0897 }
            X.3oS r0 = new X.3oS     // Catch:{ all -> 0x0897 }
            r0.<init>(r7, r9, r5)     // Catch:{ all -> 0x0897 }
            r13.A0A(r0)     // Catch:{ all -> 0x0897 }
            X.0wU r8 = r9.A05     // Catch:{ all -> 0x0897 }
            r7 = 3
            X.3v2 r0 = new X.3v2     // Catch:{ all -> 0x0897 }
            r0.<init>(r9, r7)     // Catch:{ all -> 0x0897 }
            r8.Boy(r0)     // Catch:{ all -> 0x0897 }
        L_0x07d4:
            X.1aj r9 = r12.A03     // Catch:{ all -> 0x0897 }
            X.3ty r14 = new X.3ty     // Catch:{ all -> 0x0897 }
            r14.<init>()     // Catch:{ all -> 0x0897 }
            X.3tz r0 = X.C79603tz.A00     // Catch:{ all -> 0x0897 }
            r14.A0A(r0)     // Catch:{ all -> 0x0897 }
            X.349 r0 = new X.349     // Catch:{ all -> 0x0897 }
            r0.<init>(r14, r9)     // Catch:{ all -> 0x0897 }
            X.1ak r7 = r9.A01     // Catch:{ all -> 0x0897 }
            monitor-enter(r7)     // Catch:{ all -> 0x0897 }
            r7.A00 = r0     // Catch:{ all -> 0x0883 }
            monitor-exit(r7)     // Catch:{ all -> 0x0897 }
            r7 = 3
            X.413 r0 = new X.413     // Catch:{ all -> 0x0897 }
            r0.<init>(r9, r7)     // Catch:{ all -> 0x0897 }
            r14.A0A(r0)     // Catch:{ all -> 0x0897 }
            java.lang.Object r8 = r9.A04     // Catch:{ all -> 0x0897 }
            monitor-enter(r8)     // Catch:{ all -> 0x0897 }
            X.0wp r0 = r9.A02     // Catch:{ all -> 0x0880 }
            android.content.SharedPreferences r9 = X.C19980wp.A00(r0)     // Catch:{ all -> 0x0880 }
            java.lang.String r0 = "has_received_security_notification_setting"
            boolean r0 = r9.getBoolean(r0, r5)     // Catch:{ all -> 0x0880 }
            if (r0 == 0) goto L_0x080c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0880 }
            r14.A0C(r0)     // Catch:{ all -> 0x0880 }
        L_0x080c:
            monitor-exit(r8)     // Catch:{ all -> 0x0880 }
            X.413 r0 = new X.413     // Catch:{ all -> 0x0897 }
            r0.<init>(r12, r5)     // Catch:{ all -> 0x0897 }
            r11.A0A(r0)     // Catch:{ all -> 0x0897 }
            X.413 r0 = new X.413     // Catch:{ all -> 0x0897 }
            r0.<init>(r12, r5)     // Catch:{ all -> 0x0897 }
            r13.A0A(r0)     // Catch:{ all -> 0x0897 }
            X.413 r0 = new X.413     // Catch:{ all -> 0x0897 }
            r0.<init>(r12, r5)     // Catch:{ all -> 0x0897 }
            r14.A0A(r0)     // Catch:{ all -> 0x0897 }
            X.3ty[] r0 = new X.C79593ty[r7]     // Catch:{ all -> 0x0897 }
            r0[r5] = r13     // Catch:{ all -> 0x0897 }
            r0[r2] = r11     // Catch:{ all -> 0x0897 }
            r0[r1] = r14     // Catch:{ all -> 0x0897 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0897 }
            X.8UW r5 = new X.8UW     // Catch:{ all -> 0x0897 }
            r5.<init>(r0)     // Catch:{ all -> 0x0897 }
            java.io.PrintStream r8 = java.lang.System.out     // Catch:{ all -> 0x0897 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0897 }
            r1.<init>()     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = "before schedule: waWorker="
            r1.append(r0)     // Catch:{ all -> 0x0897 }
            X.0wU r7 = r12.A08     // Catch:{ all -> 0x0897 }
            int r0 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x0897 }
            r1.append(r0)     // Catch:{ all -> 0x0897 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0897 }
            r8.println(r0)     // Catch:{ all -> 0x0897 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0897 }
            X.0yf r1 = r12.A00     // Catch:{ all -> 0x0897 }
            X.0yh r0 = X.C21100yf.A1b     // Catch:{ all -> 0x0897 }
            int r0 = r1.A04(r0)     // Catch:{ all -> 0x0897 }
            long r0 = (long) r0     // Catch:{ all -> 0x0897 }
            long r0 = r8.toMillis(r0)     // Catch:{ all -> 0x0897 }
            r15 = 25
            X.74x r10 = new X.74x     // Catch:{ all -> 0x0897 }
            r10.<init>((java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (int) r15)     // Catch:{ all -> 0x0897 }
            java.lang.String r8 = "CompanionBootstrapManager/critical-bootstrap"
            X.1jE r1 = r7.BpM(r10, r8, r0)     // Catch:{ all -> 0x0897 }
            X.4KQ r0 = new X.4KQ     // Catch:{ all -> 0x0897 }
            r0.<init>(r4, r12, r1, r6)     // Catch:{ all -> 0x0897 }
            r5.A0A(r0)     // Catch:{ all -> 0x0897 }
            r1 = 4
            X.413 r0 = new X.413     // Catch:{ all -> 0x0897 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0897 }
            r4.A0A(r0)     // Catch:{ all -> 0x0897 }
            goto L_0x0895
        L_0x0880:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0880 }
            goto L_0x0885
        L_0x0883:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0897 }
        L_0x0885:
            throw r0     // Catch:{ all -> 0x0897 }
        L_0x0886:
            java.lang.String r0 = "companion/registration/complete/failed to save primary public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0897 }
            r0 = 0
            r3.A09(r0, r2, r2)     // Catch:{ all -> 0x0897 }
            goto L_0x0895
        L_0x0890:
            java.lang.String r0 = "companion/registration/complete/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0897 }
        L_0x0895:
            monitor-exit(r3)
            return r2
        L_0x0897:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x089a:
            r0 = 245(0xf5, float:3.43E-43)
            if (r1 != r0) goto L_0x08cc
            X.1Ih r0 = r5.A00
            X.0xH r5 = X.C25951Ih.A00(r0)
            monitor-enter(r5)
            X.1VR r4 = r5.A0O     // Catch:{ all -> 0x08c9 }
            r3 = 2
            r0 = 516(0x204, double:2.55E-321)
            r4.A00(r3, r0)     // Catch:{ all -> 0x08c9 }
            X.13g r0 = r5.A0P     // Catch:{ all -> 0x08c9 }
            int r1 = r0.A00()     // Catch:{ all -> 0x08c9 }
            r0 = 5
            if (r1 == r0) goto L_0x08c4
            r0 = 6
            if (r1 == r0) goto L_0x08c4
            java.lang.String r0 = "companion/registration/complete/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08c9 }
            goto L_0x08c7
        L_0x08bf:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08c9 }
        L_0x08c4:
            r5.A05()     // Catch:{ all -> 0x08c9 }
        L_0x08c7:
            monitor-exit(r5)
            return r2
        L_0x08c9:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x08cc:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30361a5.BJl(android.os.Message, int):boolean");
    }

    public C30361a5(C25951Ih r1) {
        this.A00 = r1;
    }
}
