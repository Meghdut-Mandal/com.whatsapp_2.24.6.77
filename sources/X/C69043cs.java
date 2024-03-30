package X;

import android.content.Context;

/* renamed from: X.3cs  reason: invalid class name and case insensitive filesystem */
public class C69043cs implements C19710wO {
    public final Context A00;

    public String BIB() {
        return "LegacyAsyncInit";
    }

    public /* synthetic */ void BRM() {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0440  */
    public void BRL() {
        /*
            r67 = this;
            r0 = r67
            android.content.Context r0 = r0.A00
            r66 = r0
            java.lang.String r0 = "app-init/async/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tq r0 = X.C36371kC.A0P(r66)
            X.0wG r53 = X.C36351kA.A0W(r0)
            X.0yC r32 = r0.Azp()
            X.17Y r18 = X.C36351kA.A0M(r0)
            X.0wQ r31 = X.C36351kA.A0N(r0)
            X.004 r1 = r0.A8i
            java.lang.Object r12 = r1.get()
            X.0wt r12 = (X.C20020wt) r12
            X.0wU r33 = X.C36341k9.A0Z(r0)
            X.0yW r52 = X.C36351kA.A0g(r0)
            X.0ww r55 = X.C36381kD.A0U(r0)
            X.004 r1 = r0.A3D
            java.lang.Object r51 = r1.get()
            X.004 r1 = r0.A8Y
            java.lang.Object r50 = r1.get()
            r1 = r50
            X.1bN r1 = (X.C31161bN) r1
            r50 = r1
            X.004 r1 = r0.A9C
            java.lang.Object r11 = r1.get()
            X.12u r11 = (X.C220812u) r11
            X.004 r1 = r0.A4a
            java.lang.Object r10 = r1.get()
            X.13I r10 = (X.AnonymousClass13I) r10
            X.004 r1 = r0.A6V
            java.lang.Object r49 = r1.get()
            r1 = r49
            X.1Vf r1 = (X.C29071Vf) r1
            r49 = r1
            X.004 r1 = r0.A8B
            java.lang.Object r16 = r1.get()
            r1 = r16
            X.0wx r1 = (X.C20060wx) r1
            r16 = r1
            X.004 r1 = r0.A1Q
            r1.get()
            X.004 r1 = r0.A2g
            java.lang.Object r48 = r1.get()
            X.0tq r1 = r0.AfI
            X.0tt r9 = r1.A00
            X.004 r1 = r9.A1q
            java.lang.Object r8 = r1.get()
            X.39B r8 = (X.AnonymousClass39B) r8
            X.004 r1 = r0.A7n
            java.lang.Object r29 = r1.get()
            r1 = r29
            X.187 r1 = (X.AnonymousClass187) r1
            r29 = r1
            X.0yb r17 = X.C36351kA.A0U(r0)
            X.0ts r58 = r0.BxU()
            X.004 r1 = r0.A2c
            java.lang.Object r30 = r1.get()
            r1 = r30
            X.1Lu r1 = (X.C26861Lu) r1
            r30 = r1
            X.004 r1 = r9.A2e
            java.lang.Object r47 = r1.get()
            X.004 r1 = r0.A4e
            r1.get()
            X.1NG r7 = X.C36381kD.A0V(r0)
            X.1CR r19 = X.C36371kC.A0j(r0)
            X.004 r1 = r0.A7U
            java.lang.Object r46 = r1.get()
            r1 = r46
            X.0yd r1 = (X.C21080yd) r1
            r46 = r1
            X.004 r1 = r0.A8X
            java.lang.Object r45 = r1.get()
            r1 = r45
            X.1MP r1 = (X.AnonymousClass1MP) r1
            r45 = r1
            X.004 r1 = r0.A9H
            java.lang.Object r26 = r1.get()
            r1 = r26
            X.1Wn r1 = (X.C29411Wn) r1
            r26 = r1
            X.004 r1 = r0.A9W
            java.lang.Object r44 = r1.get()
            r1 = r44
            com.whatsapp.nativelibloader.WhatsAppLibLoader r1 = (com.whatsapp.nativelibloader.WhatsAppLibLoader) r1
            r44 = r1
            X.004 r1 = r0.A0M
            java.lang.Object r37 = r1.get()
            r1 = r37
            X.1C7 r1 = (X.AnonymousClass1C7) r1
            r37 = r1
            X.0xY r43 = X.C36421kH.A0K(r0)
            X.004 r1 = r9.A2f
            java.lang.Object r20 = r1.get()
            r1 = r20
            X.3Nq r1 = (X.C64353Nq) r1
            r20 = r1
            X.004 r1 = r0.A5G
            java.lang.Object r34 = r1.get()
            r1 = r34
            X.12P r1 = (X.AnonymousClass12P) r1
            r34 = r1
            X.004 r1 = r0.A7K
            java.lang.Object r42 = r1.get()
            X.0yE r21 = X.C36351kA.A0X(r0)
            X.0v0 r22 = X.C36351kA.A0Y(r0)
            X.1Fq r41 = X.C36391kE.A0d(r0)
            X.004 r1 = r0.A2d
            java.lang.Object r36 = r1.get()
            r1 = r36
            X.1aJ r1 = (X.C30501aJ) r1
            r36 = r1
            X.004 r1 = r0.A34
            java.lang.Object r40 = r1.get()
            r1 = r40
            X.1QH r1 = (X.AnonymousClass1QH) r1
            r40 = r1
            X.1P5 r23 = X.C36411kG.A0l(r0)
            X.004 r1 = r9.A2p
            java.lang.Object r6 = r1.get()
            X.6NJ r6 = (X.AnonymousClass6NJ) r6
            X.004 r1 = r0.A2a
            java.lang.Object r63 = r1.get()
            X.004 r1 = r0.A7L
            java.lang.Object r15 = r1.get()
            X.12U r15 = (X.AnonymousClass12U) r15
            X.0wg r25 = X.C36351kA.A0m(r0)
            X.004 r1 = r0.A0J
            java.lang.Object r24 = r1.get()
            r1 = r24
            X.0zA r1 = (X.C21390zA) r1
            r24 = r1
            X.004 r1 = r9.A32
            java.lang.Object r64 = r1.get()
            X.004 r1 = r0.A9J
            X.005 r1 = X.C18840tu.A00(r1)
            java.lang.Object r35 = r1.get()
            r1 = r35
            X.0wh r1 = (X.C19900wh) r1
            r35 = r1
            X.004 r1 = r9.A09
            java.lang.Object r27 = r1.get()
            r1 = r27
            X.6OP r1 = (X.AnonymousClass6OP) r1
            r27 = r1
            X.004 r1 = r0.A2L
            java.lang.Object r5 = r1.get()
            X.1Fj r5 = (X.C25201Fj) r5
            X.004 r1 = r0.A1z
            java.lang.Object r39 = r1.get()
            r1 = r39
            X.1Ih r1 = (X.C25951Ih) r1
            r39 = r1
            X.004 r1 = r9.A1V
            java.lang.Object r4 = r1.get()
            X.3Nt r4 = (X.C64383Nt) r4
            X.1Bk r3 = r0.Azf()
            X.004 r1 = r0.A3f
            java.lang.Object r2 = r1.get()
            X.1ei r2 = (X.C33101ei) r2
            X.004 r1 = r0.A8Z
            java.lang.Object r38 = r1.get()
            X.004 r1 = r9.A0A
            java.lang.Object r13 = r1.get()
            X.3E0 r13 = (X.AnonymousClass3E0) r13
            X.004 r0 = r0.A4v
            java.lang.Object r28 = r0.get()
            java.lang.String r14 = "_has_set_default_values"
            r1 = 0
            r0 = r66
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r14, r1)
            if (r0 == 0) goto L_0x01db
            boolean r0 = r0.getBoolean(r14, r1)
            if (r0 != 0) goto L_0x01db
            r14 = 44
            r1 = r18
            r0 = r48
            X.C80253v6.A00(r1, r0, r14)
        L_0x01db:
            boolean r0 = r44.A04()
            if (r0 == 0) goto L_0x0284
            r52.Buf()
            boolean r0 = r15.A03()
            if (r0 == 0) goto L_0x01f3
            r31.A0G()
            r0 = r31
            com.whatsapp.Me r0 = r0.A00
            if (r0 != 0) goto L_0x0215
        L_0x01f3:
            X.61Z r0 = r49.BFs()
            java.lang.String r0 = r0.A01
            r54 = r11
            r56 = r53
            r57 = r22
            r59 = r46
            r60 = r12
            r61 = r33
            r62 = r0
            boolean r0 = r54.A03(r55, r56, r57, r58, r59, r60, r61, r62)
            if (r0 != 0) goto L_0x0215
            java.lang.String r0 = "LegacyAppAsyncInit/runAsyncInits/waMsysSetup.bootstrapForReg failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.C55232uI.A00(r18)
        L_0x0215:
            monitor-enter(r11)
            boolean r0 = r11.A00     // Catch:{ all -> 0x0257 }
            if (r0 != 0) goto L_0x025a
            java.lang.String r0 = "WaMsysSetup/bootstrapForMMS"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0257 }
            r0 = 32
            byte[] r1 = new byte[r0]     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r0)     // Catch:{ Exception -> 0x0250 }
            r0.nextBytes(r1)     // Catch:{ Exception -> 0x0250 }
            r0 = r53
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0257 }
            r54 = r0
            r56 = r46
            r57 = r12
            r58 = r33
            r59 = r11
            X.C220812u.A00(r54, r55, r56, r57, r58, r59)     // Catch:{ all -> 0x0257 }
            X.13F r0 = r11.A09     // Catch:{ all -> 0x0257 }
            com.facebook.msys.mci.NetworkSession r15 = r0.A00()     // Catch:{ all -> 0x0257 }
            r14 = 0
            r0 = r47
            com.whatsapp.wamsys.JniBridge.jvidispatchIOOO(r14, r15, r0, r1)     // Catch:{ all -> 0x0257 }
            com.facebook.msys.mci.JsonSerialization.initialize()     // Catch:{ all -> 0x0257 }
            r0 = 1
            r11.A00 = r0     // Catch:{ all -> 0x0257 }
            goto L_0x025a
        L_0x0250:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0257 }
            r0.<init>(r1)     // Catch:{ all -> 0x0257 }
            throw r0     // Catch:{ all -> 0x0257 }
        L_0x0257:
            r1 = move-exception
            monitor-exit(r11)
            throw r1
        L_0x025a:
            monitor-exit(r11)
            r31.A0G()
            r0 = r31
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0284
            r34.A06()
            r0 = r34
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0284
            r0 = r17
            r13.A00(r0)
            r0 = r43
            X.1Nz r13 = r0.A05
            X.0wk r11 = r13.A0R
            r1 = 1
            X.1j6 r0 = new X.1j6
            r0.<init>(r13, r1)
            r11.execute(r0)
            r43.A05()
        L_0x0284:
            X.0ts r0 = r12.A06
            java.util.Set r0 = r0.A09
            r0.add(r12)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x029c
            r0 = 32
            if (r1 > r0) goto L_0x029c
            r1 = r66
            r0 = r17
            X.C34091gR.A00(r1, r0)
        L_0x029c:
            X.0wk r11 = r4.A04
            r1 = 47
            X.3wZ r0 = new X.3wZ
            r0.<init>((java.lang.Object) r4, (int) r1)
            r11.execute(r0)
            r1 = 3005(0xbbd, float:4.211E-42)
            r0 = r32
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x02c8
            X.66S r4 = r6.A03
            X.2o1 r0 = X.C51562o1.EAGER
            java.util.List r1 = r4.A01(r0)
            r0 = 1
            X.AnonymousClass6NJ.A00(r6, r1, r0)
            X.2o1 r0 = X.C51562o1.LAZY
            java.util.List r1 = r4.A01(r0)
            r0 = 0
            X.AnonymousClass6NJ.A00(r6, r1, r0)
        L_0x02c8:
            r4 = 2
            java.lang.String r1 = "AppInit2"
            r0 = r41
            r0.A03(r4, r1)
            java.lang.String r15 = "app-init/permissions/"
            r13 = 4
            java.io.File[] r12 = new java.io.File[r13]     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.io.File r0 = r66.getFilesDir()     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            r11 = 0
            r12[r11] = r0     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.io.File r0 = r66.getFilesDir()     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            r6 = 1
            r12[r6] = r0     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.io.File r1 = r66.getFilesDir()     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.lang.String r0 = "Logs"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            r12[r4] = r0     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            r14 = 3
            java.lang.String r1 = "msgstore.db"
            r0 = r66
            java.io.File r0 = r0.getDatabasePath(r1)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            r12[r14] = r0     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
        L_0x0302:
            r14 = r12[r11]     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r15)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.lang.String r0 = r14.getName()     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            r1.append(r0)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.lang.String r0 = " w="
            r1.append(r0)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            boolean r0 = r14.canWrite()     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            X.C36331k8.A1S(r1, r0)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            boolean r0 = r14.canWrite()     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            if (r0 != 0) goto L_0x0338
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r15)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.lang.String r0 = r14.getName()     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            r1.append(r0)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            java.lang.String r0 = " set w="
            r1.append(r0)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            boolean r0 = r14.setWritable(r6, r6)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
            X.C36331k8.A1S(r1, r0)     // Catch:{ Exception -> 0x033d, NoSuchMethodError -> 0x0341 }
        L_0x0338:
            int r11 = r11 + 1
            if (r11 >= r13) goto L_0x0359
            goto L_0x0302
        L_0x033d:
            r6 = move-exception
            java.lang.String r0 = "app-init/checkpermissions/error "
            goto L_0x0356
        L_0x0341:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "app-init/checkpermissions/nomethod ("
            r1.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.append(r0)
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0356:
            com.whatsapp.util.Log.i(r0, r6)
        L_0x0359:
            r45.A00()
            r12 = 48
            X.3vL r11 = new X.3vL
            r6 = r66
            r1 = r51
            r0 = r38
            r11.<init>(r6, r1, r0, r12)
            r0 = r30
            r0.A01(r11)
            boolean r1 = r10.A00
            java.util.Iterator r6 = X.C36361kB.A0s(r10)
        L_0x0374:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0386
            java.lang.Object r0 = r6.next()
            X.1X9 r0 = (X.AnonymousClass1X9) r0
            if (r0 == 0) goto L_0x0374
            r0.BaM(r1)
            goto L_0x0374
        L_0x0386:
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x03a1
            boolean r6 = r31.A0L()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "app-init/async/loginfailed + inCompanion="
            X.C36321k7.A1X(r0, r1, r6)
            if (r6 == 0) goto L_0x03a7
            r10 = 0
            r6 = 0
            r1 = 1
            r0 = r39
            r0.A01(r6, r10, r1)
        L_0x03a1:
            X.3E5 r0 = r8.A03
            if (r0 != 0) goto L_0x03ce
            monitor-enter(r8)
            goto L_0x03b8
        L_0x03a7:
            r1 = 46
            X.3v6 r10 = new X.3v6
            r0 = r42
            r10.<init>(r0, r1)
            r0 = 2600(0xa28, double:1.2846E-320)
            r6 = r18
            r6.A0I(r10, r0)
            goto L_0x03a1
        L_0x03b8:
            X.3E5 r0 = r8.A03     // Catch:{ all -> 0x03cb }
            if (r0 != 0) goto L_0x03c9
            X.0yF r0 = r8.A01     // Catch:{ all -> 0x03cb }
            X.0yG r6 = r0.A00     // Catch:{ all -> 0x03cb }
            X.0wU r1 = r8.A02     // Catch:{ all -> 0x03cb }
            X.3E5 r0 = new X.3E5     // Catch:{ all -> 0x03cb }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x03cb }
            r8.A03 = r0     // Catch:{ all -> 0x03cb }
        L_0x03c9:
            monitor-exit(r8)     // Catch:{ all -> 0x03cb }
            goto L_0x03ce
        L_0x03cb:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03cb }
            throw r1
        L_0x03ce:
            X.3E5 r6 = r8.A03
            java.util.concurrent.locks.Lock r1 = r6.A03
            r1.lock()
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0440
            r1.unlock()
            X.0wU r1 = r6.A02
            r0 = 23
            X.C80243v5.A01(r1, r6, r0)
        L_0x03e3:
            r0 = r50
            X.0wU r1 = r0.A01
            X.1bP r0 = r0.A00
            r1.Boy(r0)
            java.io.File r1 = r66.getFilesDir()
            java.lang.String r0 = "last_warning"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            r0.delete()
            java.lang.String r0 = "expiration_date"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            r0.delete()
            java.lang.String r0 = "account_type"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            r0.delete()
            X.0wU r6 = r2.A0O
            r1 = 9
            X.1j4 r0 = new X.1j4
            r0.<init>(r2, r1)
            r6.Boy(r0)
            r0 = r53
            android.content.Context r6 = r0.A00
            boolean r0 = X.C34191gb.A08(r6)
            if (r0 == 0) goto L_0x0424
            r2.A04()
        L_0x0424:
            r34.A06()
            r0 = r34
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x04a0
            r23.A0Q()
            X.AnonymousClass1P5.A09(r23)
            X.1FD r11 = r5.A01
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            X.12P r0 = r11.A02
            X.1M0 r8 = r0.get()
            goto L_0x0444
        L_0x0440:
            r1.unlock()
            goto L_0x03e3
        L_0x0444:
            X.14e r12 = r8.A02     // Catch:{ all -> 0x0476 }
            java.lang.String r2 = "SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job"
            r1 = 0
            java.lang.String r0 = "GET_DELETED_CHAT_JOB_SQL"
            android.database.Cursor r1 = r12.A09(r2, r0, r1)     // Catch:{ all -> 0x0476 }
        L_0x044f:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x046a }
            if (r0 == 0) goto L_0x045f
            X.3B8 r0 = X.AnonymousClass1FD.A00(r1, r11)     // Catch:{ all -> 0x046a }
            if (r0 == 0) goto L_0x044f
            r10.add(r0)     // Catch:{ all -> 0x046a }
            goto L_0x044f
        L_0x045f:
            r1.close()     // Catch:{ all -> 0x0476 }
            r8.close()
            java.util.Iterator r12 = r10.iterator()
            goto L_0x04a7
        L_0x046a:
            r2 = move-exception
            if (r1 == 0) goto L_0x0475
            r1.close()     // Catch:{ all -> 0x0471 }
            goto L_0x0475
        L_0x0471:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x0476 }
        L_0x0475:
            throw r2     // Catch:{ all -> 0x0476 }
        L_0x0476:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x047b }
            throw r1
        L_0x047b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0480:
            java.util.List r0 = r2.A09
            if (r0 == 0) goto L_0x04a2
            long r0 = r2.A04
            r10 = -9223372036854775808
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x04a2
            java.lang.String r0 = "action_singular_delete"
            r5.A00(r2, r0)
        L_0x0491:
            java.util.Objects.requireNonNull(r40)
            r2 = 45
            r1 = r18
            r0 = r40
            X.C80253v6.A00(r1, r0, r2)
            r40.A01()
        L_0x04a0:
            monitor-enter(r7)
            goto L_0x04c0
        L_0x04a2:
            java.lang.String r0 = "action_clear"
        L_0x04a4:
            r5.A00(r2, r0)
        L_0x04a7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0491
            java.lang.Object r2 = r12.next()
            X.3B8 r2 = (X.AnonymousClass3B8) r2
            X.12q r1 = r5.A00
            X.11F r0 = r2.A07
            boolean r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x0480
            java.lang.String r0 = "action_delete"
            goto L_0x04a4
        L_0x04c0:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0M     // Catch:{ all -> 0x071c }
            boolean r0 = r0.get()     // Catch:{ all -> 0x071c }
            if (r0 != 0) goto L_0x04dc
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.A0L     // Catch:{ all -> 0x071c }
            r1 = 1
            r0 = 0
            boolean r0 = r2.compareAndSet(r0, r1)     // Catch:{ all -> 0x071c }
            if (r0 == 0) goto L_0x04dc
            X.0wU r2 = r7.A0J     // Catch:{ all -> 0x071c }
            X.4WP r0 = new X.4WP     // Catch:{ all -> 0x071c }
            r0.<init>((java.lang.Object) r7, (int) r1)     // Catch:{ all -> 0x071c }
            X.C36391kE.A1Q(r0, r2)     // Catch:{ all -> 0x071c }
        L_0x04dc:
            monitor-exit(r7)
            r7.A0D()
            long r10 = java.lang.System.currentTimeMillis()
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            X.0v0 r0 = r3.A00
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "sticker_store_last_fetch_time"
            long r0 = X.C36341k9.A0B(r1, r0)
            long r7 = r7 + r0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0542
            X.0yC r1 = r3.A01
            r0 = 1944(0x798, float:2.724E-42)
            int r2 = r1.A07(r0)
            r1 = 0
            r0 = 120(0x78, float:1.68E-43)
            if (r2 < r1) goto L_0x060b
            if (r2 <= r0) goto L_0x0607
            r2 = 120(0x78, float:1.68E-43)
        L_0x0509:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r0.nextInt(r2)
            X.67f r0 = new X.67f
            r0.<init>()
            java.lang.Integer r7 = X.C023109s.A01
            r0.A00 = r7
            X.6Tb r8 = r0.A00()
            java.lang.Class<com.whatsapp.stickers.stickerpack.FetchDownloadableStickerPackWorker> r0 = com.whatsapp.stickers.stickerpack.FetchDownloadableStickerPackWorker.class
            X.4pE r5 = new X.4pE
            r5.<init>(r0)
            long r0 = (long) r1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r5.A02(r0, r2)
            r5.A03(r8)
            X.5s0 r2 = r5.A00()
            X.4pG r2 = (X.C97404pG) r2
            X.0zS r0 = r3.A07
            java.lang.Object r1 = r0.get()
            X.6VR r1 = (X.AnonymousClass6VR) r1
            java.lang.String r0 = "fetch_sticker_pack_data"
            r1.A07(r2, r7, r0)
        L_0x0542:
            X.004 r0 = r9.A45
            java.lang.Object r2 = r0.get()
            X.6Tf r2 = (X.C132356Tf) r2
            java.util.Objects.requireNonNull(r2)
            r3 = 11
            X.4Yd r1 = new X.4Yd
            r1.<init>(r2, r3)
            r0 = r37
            android.os.Handler r0 = r0.A00
            r1.accept(r0)
            java.util.Objects.requireNonNull(r2)
            X.4Yd r1 = new X.4Yd
            r1.<init>(r2, r3)
            r0 = r37
            android.os.Handler r0 = r0.A01
            r1.accept(r0)
            android.os.Handler r0 = r30.A00()
            r2.A02(r0)
            r0 = r29
            java.util.concurrent.ThreadPoolExecutor r1 = r0.A00
            java.lang.String r0 = "Signal Protocol"
            r2.A03(r0, r1)
            r0 = r36
            java.util.concurrent.ThreadPoolExecutor r1 = r0.A01
            if (r1 == 0) goto L_0x0585
            java.lang.String r0 = "DecryptMessageExecutor"
            r2.A03(r0, r1)
        L_0x0585:
            r2.A01()
            r65 = 47
            X.74x r60 = new X.74x
            r61 = r32
            r62 = r34
            r60.<init>((java.lang.Object) r61, (java.lang.Object) r62, (java.lang.Object) r63, (java.lang.Object) r64, (int) r65)
            r60.run()
            boolean r0 = X.C19550w8.A09()
            if (r0 == 0) goto L_0x05b6
            android.content.pm.ApplicationInfo r0 = r66.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 33
            if (r1 >= r0) goto L_0x05b6
            r2 = 0
            r0 = r35
            android.content.SharedPreferences r1 = r0.A01
            java.lang.String r0 = "registration_state"
            int r0 = r1.getInt(r0, r2)
            if (r0 != 0) goto L_0x05b6
        L_0x05b3:
            java.lang.String r3 = "fixed"
            goto L_0x0619
        L_0x05b6:
            X.34v r8 = new X.34v
            r1 = r66
            r0 = r26
            r8.<init>(r1, r0)
            boolean r0 = X.C19550w8.A07()
            if (r0 == 0) goto L_0x05b3
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r22)
            java.lang.String r9 = "notification_channel_upgrade_version"
            int r0 = X.C36371kC.A01(r0, r9)
            r7 = 1
            if (r0 == r7) goto L_0x05b3
            java.util.LinkedHashSet r0 = X.AnonymousClass1CR.A04(r19)
            java.util.Iterator r10 = r0.iterator()
        L_0x05da:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0601
            X.11F r5 = X.C36401kF.A0a(r10)
            r0 = r19
            X.3LI r1 = X.C36361kB.A0d(r5, r0)
            X.AnonymousClass1CR.A06(r1, r0)
            X.16D r0 = r0.A05
            X.141 r3 = r0.A08(r5)
            X.1Wn r2 = r8.A01
            android.content.Context r1 = r8.A00
            r2.A07(r5)
            if (r3 == 0) goto L_0x05da
            r0 = 0
            r2.A04(r1, r3, r0)
            goto L_0x05da
        L_0x0601:
            r0 = r22
            X.C36321k7.A0q(r0, r9, r7)
            goto L_0x05b3
        L_0x0607:
            if (r2 <= 0) goto L_0x060b
            goto L_0x0509
        L_0x060b:
            X.0wU r2 = r3.A06
            r1 = 42
            X.1jA r0 = new X.1jA
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Boy(r0)
            goto L_0x0542
        L_0x0619:
            java.lang.String r0 = "google_bug_154855417"
            r1 = r25
            android.content.SharedPreferences r5 = r1.A00(r0)     // Catch:{ Exception -> 0x066b }
            boolean r0 = r5.contains(r3)     // Catch:{ Exception -> 0x066b }
            if (r0 != 0) goto L_0x0670
            java.io.File r1 = r6.getFilesDir()     // Catch:{ Exception -> 0x066b }
            java.lang.String r0 = "ZoomTables.data"
            java.io.File r8 = X.C36441kJ.A0w(r1, r0)     // Catch:{ Exception -> 0x066b }
            java.io.File r1 = r6.getFilesDir()     // Catch:{ Exception -> 0x066b }
            java.lang.String r0 = "SavedClientParameters.data.cs"
            java.io.File r7 = X.C36441kJ.A0w(r1, r0)     // Catch:{ Exception -> 0x066b }
            java.io.File r2 = r6.getFilesDir()     // Catch:{ Exception -> 0x066b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x066b }
            java.lang.String r0 = "DATA_ServerControlledParametersManager.data.v1."
            r1.append(r0)     // Catch:{ Exception -> 0x066b }
            java.lang.String r0 = r6.getPackageName()     // Catch:{ Exception -> 0x066b }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception -> 0x066b }
            java.io.File r0 = X.C36441kJ.A0w(r2, r0)     // Catch:{ Exception -> 0x066b }
            r8.delete()     // Catch:{ Exception -> 0x066b }
            r7.delete()     // Catch:{ Exception -> 0x066b }
            r0.delete()     // Catch:{ Exception -> 0x066b }
            android.content.SharedPreferences$Editor r1 = r5.edit()     // Catch:{ Exception -> 0x066b }
            r0 = 1
            X.C36331k8.A0w(r1, r3, r0)     // Catch:{ Exception -> 0x066b }
            java.lang.String r0 = "app-init/async/fixGoogleMapsCrash154855417 applied"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x066b }
            goto L_0x0670
        L_0x066b:
            java.lang.String r0 = "app-init/async/fixGoogleMapsCrash154855417 failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0670:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x06fb
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            r0 = r21
            int r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x06fb
            java.lang.String r0 = "appinit/async sdk>=31, no read_phone_state permission"
        L_0x0682:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0685:
            r31.A0G()
            r0 = r31
            X.13x r0 = r0.A02
            if (r0 == 0) goto L_0x069f
            boolean r0 = X.C19550w8.A0A()
            if (r0 == 0) goto L_0x069a
            r0 = r24
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x069f
        L_0x069a:
            r0 = r23
            com.whatsapp.location.LocationSharingService.A02(r6, r0)
        L_0x069f:
            r27.A02()
            X.C64353Nq.A00(r20)
            r0 = r20
            X.005 r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.6sV r0 = (X.C144596sV) r0
            r0.A01()
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.Object[] r2 = new java.lang.Object[r4]
            long r0 = r16.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6 = 0
            r2[r6] = r0
            long r0 = r16.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "StorageUtils/log-available-space/internal-storage available:%,d total:%,d"
            java.lang.String r0 = java.lang.String.format(r5, r0, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            long r0 = r16.A01()
            X.AnonymousClass000.A1M(r2, r6, r0)
            long r0 = r16.A03()
            X.AnonymousClass000.A1M(r2, r3, r0)
            java.lang.String r0 = "StorageUtils/log-available-space/external-storage available: %,d total: %,d"
            java.lang.String r0 = java.lang.String.format(r5, r0, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "app-init/async/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 444(0x1bc, float:6.22E-43)
            r0 = r32
            r0.A0E(r1)
            return
        L_0x06fb:
            android.telephony.TelephonyManager r3 = r17.A0K()
            if (r3 != 0) goto L_0x0705
            java.lang.String r0 = "appinit/async tm=null"
            goto L_0x0682
        L_0x0705:
            java.lang.String r0 = "appinit/async set listener for call state"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 49
            X.3vL r1 = new X.3vL
            r5 = r28
            r0 = r33
            r1.<init>(r5, r0, r3, r2)
            r0 = r18
            r0.A0H(r1)
            goto L_0x0685
        L_0x071c:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69043cs.BRL():void");
    }

    public C69043cs(Context context) {
        this.A00 = context;
    }
}
