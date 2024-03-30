package X;

import android.os.Handler;

/* renamed from: X.3wC  reason: invalid class name and case insensitive filesystem */
public class C80933wC implements Runnable {
    public int A00 = 0;
    public long A01 = 0;
    public Handler A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final C19460v5 A05;
    public final C19460v5 A06;
    public final C19460v5 A07;
    public final C19730wQ A08;
    public final C27341Nv A09;
    public final AnonymousClass164 A0A;
    public final AnonymousClass3D0 A0B;
    public final AnonymousClass36G A0C;
    public final AnonymousClass16D A0D;
    public final AnonymousClass171 A0E;
    public final C20430xY A0F;
    public final AnonymousClass1O6 A0G;
    public final C27301Nr A0H;
    public final AnonymousClass1DH A0I;
    public final C19420v0 A0J;
    public final C18820ts A0K;
    public final AnonymousClass1A5 A0L;
    public final AnonymousClass15x A0M;
    public final AnonymousClass16E A0N;
    public final C27371Ny A0O;
    public final AnonymousClass1DY A0P;
    public final C20810yC A0Q;
    public final C21010yW A0R;
    public final C20350xQ A0S;
    public final C20280xJ A0T;
    public final C27331Nu A0U;
    public final AnonymousClass1XA A0V;
    public final AnonymousClass1O8 A0W;
    public final C29501Ww A0X;
    public final AnonymousClass1AQ A0Y;
    public final C19460v5 A0Z;
    public final C19460v5 A0a;
    public final C19900wh A0b;
    public final C590232i A0c;
    public final C590332j A0d;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r13 = this;
            r3 = 0
            r4 = 1
            X.2My r0 = new X.2My     // Catch:{ all -> 0x039d }
            r0.<init>()     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "registername/initializer/run"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x039d }
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x039d }
            long r1 = r13.A01     // Catch:{ all -> 0x039d }
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
            r13.A01 = r5     // Catch:{ all -> 0x039d }
        L_0x001a:
            r9 = 3
            X.1O6 r0 = r13.A0G     // Catch:{ all -> 0x039d }
            r0.A01()     // Catch:{ all -> 0x039d }
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x039d }
            X.5Tu r0 = X.C108515Tu.A0J     // Catch:{ all -> 0x039d }
            X.6Pz r1 = new X.6Pz     // Catch:{ all -> 0x039d }
            r1.<init>(r0)     // Catch:{ all -> 0x039d }
            r1.A02 = r4     // Catch:{ all -> 0x039d }
            X.6NS r0 = X.AnonymousClass6NS.A0C     // Catch:{ all -> 0x039d }
            r1.A00 = r0     // Catch:{ all -> 0x039d }
            r1.A01 = r4     // Catch:{ all -> 0x039d }
            X.6Pq r2 = r1.A01()     // Catch:{ all -> 0x039d }
            android.os.Handler r1 = r13.A02     // Catch:{ all -> 0x039d }
            X.0xY r0 = r13.A0F     // Catch:{ all -> 0x039d }
            if (r1 == 0) goto L_0x0095
            X.6Pu r2 = r0.A02(r2)     // Catch:{ all -> 0x039d }
        L_0x0040:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x039d }
            X.1Nr r1 = r13.A0H     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "DeviceSyncManager/syncAllNonContactUsersFromConversations"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x039d }
            java.util.HashSet r5 = X.C36441kJ.A16()     // Catch:{ all -> 0x039d }
            X.1A6 r0 = r1.A03     // Catch:{ all -> 0x039d }
            java.util.HashSet r7 = r0.A0C()     // Catch:{ all -> 0x039d }
            X.16D r0 = r1.A01     // Catch:{ all -> 0x039d }
            java.util.ArrayList r0 = r0.A0H()     // Catch:{ all -> 0x039d }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x039d }
        L_0x005e:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x00a3
            X.141 r8 = X.C36391kE.A0f(r10)     // Catch:{ all -> 0x039d }
            X.11F r0 = r8.A0H     // Catch:{ all -> 0x039d }
            boolean r0 = X.C202329lb.A04(r0)     // Catch:{ all -> 0x039d }
            if (r0 != 0) goto L_0x005e
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r8.A06(r6)     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x005e
            X.3IL r0 = r8.A0F     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x039d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x039d }
            if (r0 != 0) goto L_0x0085
            goto L_0x005e
        L_0x0085:
            X.11F r0 = r8.A0H     // Catch:{ all -> 0x039d }
            boolean r0 = r7.contains(r0)     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x005e
            com.whatsapp.jid.Jid r0 = X.C36381kD.A0e(r8, r6)     // Catch:{ all -> 0x039d }
            r5.add(r0)     // Catch:{ all -> 0x039d }
            goto L_0x005e
        L_0x0095:
            X.5Lg r0 = X.C20430xY.A00(r0, r2, r4)     // Catch:{ all -> 0x039d }
            java.lang.Object r2 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x00a0 }
            X.6Pu r2 = (X.C131626Pu) r2     // Catch:{ InterruptedException | ExecutionException -> 0x00a0 }
            goto L_0x0040
        L_0x00a0:
            X.6Pu r2 = X.C131626Pu.A03     // Catch:{ all -> 0x039d }
            goto L_0x0040
        L_0x00a3:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x039d }
            if (r0 != 0) goto L_0x00b4
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r3]     // Catch:{ all -> 0x039d }
            java.lang.Object[] r0 = r5.toArray(r0)     // Catch:{ all -> 0x039d }
            com.whatsapp.jid.UserJid[] r0 = (com.whatsapp.jid.UserJid[]) r0     // Catch:{ all -> 0x039d }
            r1.A01(r0, r9)     // Catch:{ all -> 0x039d }
        L_0x00b4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "registername/initializer/sync/done result="
            X.C36321k7.A1K(r2, r0, r1)     // Catch:{ all -> 0x039d }
            if (r2 == 0) goto L_0x00d1
            int r1 = r2.A00     // Catch:{ all -> 0x039d }
            if (r1 != 0) goto L_0x00c7
            r13.A00 = r4     // Catch:{ all -> 0x039d }
            goto L_0x0393
        L_0x00c7:
            r0 = 4
            if (r1 == r0) goto L_0x00cd
            r0 = 6
            if (r1 != r0) goto L_0x00d1
        L_0x00cd:
            r13.A00 = r9     // Catch:{ all -> 0x039d }
            goto L_0x0393
        L_0x00d1:
            java.lang.String r0 = "registername/setconnection/active"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x039d }
            X.0xJ r0 = r13.A0T     // Catch:{ all -> 0x039d }
            r0.A04(r4)     // Catch:{ all -> 0x039d }
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x039d }
            long r0 = r13.A01     // Catch:{ all -> 0x039d }
            long r10 = r10 - r0
            X.0xQ r8 = r13.A0S     // Catch:{ all -> 0x039d }
            X.0xR r7 = r8.A0d     // Catch:{ all -> 0x039d }
            boolean r0 = r7.A01     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x00ee
            r5 = 90000(0x15f90, double:4.4466E-319)
            goto L_0x00f1
        L_0x00ee:
            r5 = 45000(0xafc8, double:2.2233E-319)
        L_0x00f1:
            boolean r0 = r7.A02     // Catch:{ all -> 0x039d }
            r1 = 200(0xc8, double:9.9E-322)
            if (r0 == 0) goto L_0x0100
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0100
            long r10 = r10 + r1
            android.os.SystemClock.sleep(r1)     // Catch:{ all -> 0x039d }
            goto L_0x00f1
        L_0x0100:
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x010f
            boolean r0 = r7.A02     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x010f
            boolean r0 = r7.A01     // Catch:{ all -> 0x039d }
            if (r0 != 0) goto L_0x010f
            r8.A0S(r9)     // Catch:{ all -> 0x039d }
        L_0x010f:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "registername/shouldrefreshlists"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x039d }
            X.0v0 r7 = r13.A0J     // Catch:{ all -> 0x039d }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r7)     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "refresh_broadcast_lists"
            X.C36331k8.A0w(r1, r0, r4)     // Catch:{ all -> 0x039d }
            X.1Nu r0 = r13.A0U     // Catch:{ all -> 0x039d }
            r0.A00()     // Catch:{ all -> 0x039d }
            X.1Nv r1 = r13.A09     // Catch:{ all -> 0x039d }
            r0 = 0
            r1.A01(r0)     // Catch:{ all -> 0x039d }
            X.0v5 r1 = r13.A06     // Catch:{ all -> 0x039d }
            boolean r0 = r1.A05()     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x013f
            r1.A02()     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "loadSettingToSharedPreferences"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x039d }
        L_0x013e:
            throw r0     // Catch:{ all -> 0x039d }
        L_0x013f:
            X.1Ny r0 = r13.A0O     // Catch:{ all -> 0x039d }
            r0.A00()     // Catch:{ all -> 0x039d }
            X.15x r0 = r13.A0M     // Catch:{ all -> 0x039d }
            X.12P r0 = r0.A00     // Catch:{ all -> 0x039d }
            r0.A06()     // Catch:{ all -> 0x039d }
            java.io.File r0 = r0.A03     // Catch:{ all -> 0x039d }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x0166
            X.16E r0 = r13.A0N     // Catch:{ all -> 0x039d }
            boolean r0 = r0.A0H()     // Catch:{ all -> 0x039d }
            if (r0 != 0) goto L_0x0166
            X.164 r1 = r13.A0A     // Catch:{ all -> 0x039d }
            X.0v5 r0 = r13.A07     // Catch:{ all -> 0x039d }
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = X.C110985bY.A00(r0)     // Catch:{ all -> 0x039d }
            r1.A01(r0)     // Catch:{ all -> 0x039d }
        L_0x0166:
            X.1XA r0 = r13.A0V     // Catch:{ all -> 0x039d }
            r0.A01(r4, r3)     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "registername/reintialized payments"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x039d }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r7)     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "registration_biz_registered_on_device"
            X.C36331k8.A0w(r1, r0, r3)     // Catch:{ all -> 0x039d }
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x039d }
            java.util.HashMap r8 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x039d }
            X.1A5 r0 = r13.A0L     // Catch:{ all -> 0x039d }
            r9 = 50
            java.util.ArrayList r0 = r0.A02(r9)     // Catch:{ all -> 0x039d }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x039d }
        L_0x018c:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x039d }
            r6 = 2
            if (r0 == 0) goto L_0x01b1
            X.141 r5 = X.C36391kE.A0f(r10)     // Catch:{ all -> 0x039d }
            java.lang.Class<X.11F> r2 = X.AnonymousClass11F.class
            X.11F r1 = X.C36441kJ.A0k(r5, r2)     // Catch:{ all -> 0x039d }
            if (r1 == 0) goto L_0x018c
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x01a7
            X.C36341k9.A1K(r1, r8, r3)     // Catch:{ all -> 0x039d }
            goto L_0x018c
        L_0x01a7:
            X.1O8 r1 = r13.A0W     // Catch:{ all -> 0x039d }
            X.11F r0 = X.C36441kJ.A0k(r5, r2)     // Catch:{ all -> 0x039d }
            r1.A01(r0, r3, r6)     // Catch:{ all -> 0x039d }
            goto L_0x018c
        L_0x01b1:
            X.16D r0 = r13.A0D     // Catch:{ all -> 0x039d }
            java.util.ArrayList r5 = r0.A0H()     // Catch:{ all -> 0x039d }
            X.0yC r1 = r13.A0Q     // Catch:{ all -> 0x039d }
            r0 = 5819(0x16bb, float:8.154E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x01de
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x039d }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x039d }
        L_0x01c9:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x01dd
            X.141 r0 = X.C36391kE.A0f(r1)     // Catch:{ all -> 0x039d }
            X.141 r0 = r0.A04()     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x01c9
            r2.add(r0)     // Catch:{ all -> 0x039d }
            goto L_0x01c9
        L_0x01dd:
            r5 = r2
        L_0x01de:
            X.171 r2 = r13.A0E     // Catch:{ Exception -> 0x0234 }
            X.0ts r1 = r13.A0K     // Catch:{ Exception -> 0x0234 }
            X.3xD r0 = new X.3xD     // Catch:{ Exception -> 0x0234 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0234 }
            java.util.Collections.sort(r5, r0)     // Catch:{ Exception -> 0x0234 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0234 }
            r2 = 0
        L_0x01ef:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0234 }
            if (r0 == 0) goto L_0x0210
            X.141 r0 = X.C36391kE.A0f(r5)     // Catch:{ Exception -> 0x0234 }
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r0)     // Catch:{ Exception -> 0x0234 }
            boolean r0 = r0.A0z     // Catch:{ Exception -> 0x0234 }
            if (r0 == 0) goto L_0x01ef
            if (r1 == 0) goto L_0x01ef
            boolean r0 = r8.containsKey(r1)     // Catch:{ Exception -> 0x0234 }
            if (r0 != 0) goto L_0x01ef
            int r2 = r2 + 1
            X.C36341k9.A1K(r1, r8, r3)     // Catch:{ Exception -> 0x0234 }
            if (r2 <= r9) goto L_0x01ef
        L_0x0210:
            X.1O8 r5 = r13.A0W     // Catch:{ Exception -> 0x0234 }
            java.util.Iterator r2 = X.C36371kC.A10(r8)     // Catch:{ Exception -> 0x0234 }
        L_0x0216:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0234 }
            if (r0 == 0) goto L_0x023e
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r2)     // Catch:{ Exception -> 0x0234 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ Exception -> 0x0234 }
            X.11F r1 = (X.AnonymousClass11F) r1     // Catch:{ Exception -> 0x0234 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x0234 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0234 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0234 }
            r5.A01(r1, r0, r6)     // Catch:{ Exception -> 0x0234 }
            goto L_0x0216
        L_0x0234:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "RegistrationInitializer/prefetchPhotos failed - "
            X.C36321k7.A1W(r0, r1, r2)     // Catch:{ all -> 0x039d }
        L_0x023e:
            X.0wQ r2 = r13.A08     // Catch:{ all -> 0x039d }
            r2.A0G()     // Catch:{ all -> 0x039d }
            X.142 r0 = r2.A0E     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x0254
            int r0 = r0.A05     // Catch:{ all -> 0x039d }
            if (r0 != 0) goto L_0x0254
            X.1O8 r1 = r13.A0W     // Catch:{ all -> 0x039d }
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r2)     // Catch:{ all -> 0x039d }
            r1.A01(r0, r3, r4)     // Catch:{ all -> 0x039d }
        L_0x0254:
            r8 = 0
        L_0x0255:
            X.1AQ r0 = r13.A0Y     // Catch:{ all -> 0x039d }
            X.1AT r1 = r0.A02     // Catch:{ all -> 0x039d }
            monitor-enter(r1)     // Catch:{ all -> 0x039d }
            java.util.HashMap r0 = r1.A00     // Catch:{ all -> 0x0306 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0306 }
            monitor-exit(r1)     // Catch:{ all -> 0x039d }
            r5 = 10000(0x2710, double:4.9407E-320)
            if (r0 != 0) goto L_0x0272
            long r1 = (long) r8     // Catch:{ all -> 0x039d }
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0272
            r0 = 200(0xc8, double:9.9E-322)
            android.os.SystemClock.sleep(r0)     // Catch:{ all -> 0x039d }
            int r8 = r8 + 200
            goto L_0x0255
        L_0x0272:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x039d }
            r13.A04 = r4     // Catch:{ all -> 0x039d }
            X.1DY r2 = r13.A0P     // Catch:{ all -> 0x039d }
            X.0wQ r0 = r2.A00     // Catch:{ all -> 0x039d }
            boolean r0 = r0.A0L()     // Catch:{ all -> 0x039d }
            if (r0 != 0) goto L_0x029d
            X.0zN r1 = r2.A03     // Catch:{ all -> 0x039d }
            r0 = 5697(0x1641, float:7.983E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x029d
            r0 = 6114(0x17e2, float:8.568E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x039d }
            if (r0 != 0) goto L_0x029d
            X.1DZ r1 = r2.A02     // Catch:{ all -> 0x039d }
            X.4Yz r0 = new X.4Yz     // Catch:{ all -> 0x039d }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x039d }
            r1.A01(r0)     // Catch:{ all -> 0x039d }
        L_0x029d:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x039d }
            android.content.SharedPreferences$Editor r5 = X.C19420v0.A00(r7)     // Catch:{ all -> 0x039d }
            java.lang.String r2 = "registration_initialized_time"
            X.C36341k9.A0w(r5, r2, r0)     // Catch:{ all -> 0x039d }
            X.1Ww r1 = r13.A0X     // Catch:{ all -> 0x039d }
            r0 = 3
            X.C29501Ww.A02(r1, r0, r4)     // Catch:{ all -> 0x039d }
            X.0v5 r1 = r13.A05     // Catch:{ all -> 0x039d }
            boolean r0 = r1.A05()     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x02c3
            r1.A02()     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "setReceivedCertRelatedNack"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x039d }
            goto L_0x013e
        L_0x02c3:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "registername/setregverified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x039d }
            r0 = 0
            r13.A01 = r0     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "registername/fin/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x039d }
            boolean r0 = r7.A2F()     // Catch:{ all -> 0x039d }
            if (r0 != 0) goto L_0x02e4
            java.lang.String r0 = "RegistrationInitializer/Enabling archive2.0"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x039d }
            X.1DH r0 = r13.A0I     // Catch:{ all -> 0x039d }
            r0.A03()     // Catch:{ all -> 0x039d }
        L_0x02e4:
            X.36G r1 = r13.A0C     // Catch:{ all -> 0x039d }
            monitor-enter(r1)     // Catch:{ all -> 0x039d }
            X.19l r0 = r1.A02     // Catch:{ all -> 0x0306 }
            X.0v0 r0 = r0.A01     // Catch:{ all -> 0x0306 }
            boolean r0 = r0.A2H()     // Catch:{ all -> 0x0306 }
            if (r0 != 0) goto L_0x030a
            java.lang.String r0 = "MDOptInInitializer/forceOptIn updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0306 }
            monitor-enter(r1)     // Catch:{ all -> 0x0306 }
            java.lang.String r0 = "MDOptInInitializer/Opting In"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0303 }
            X.3Dd r0 = r1.A00     // Catch:{ all -> 0x0303 }
            r0.A00()     // Catch:{ all -> 0x0303 }
            monitor-exit(r1)     // Catch:{ all -> 0x0306 }
            goto L_0x030a
        L_0x0303:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0306 }
            throw r0     // Catch:{ all -> 0x0306 }
        L_0x0306:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x039d }
            goto L_0x013e
        L_0x030a:
            monitor-exit(r1)     // Catch:{ all -> 0x039d }
            X.3D0 r2 = r13.A0B     // Catch:{ all -> 0x039d }
            X.3Ae r0 = r2.A01()     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x0393
            java.lang.String r0 = r7.A0k()     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x033f
            java.lang.String r0 = r7.A0j()     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x033f
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r7)     // Catch:{ all -> 0x039d }
            java.lang.String r0 = "pref_wfs_id_sign"
            java.lang.String r0 = X.C36371kC.A0t(r1, r0)     // Catch:{ all -> 0x039d }
            if (r0 == 0) goto L_0x033f
            X.3Ae r0 = r2.A01()     // Catch:{ all -> 0x039d }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x039d }
            X.5xU r6 = r0.A08     // Catch:{ all -> 0x039d }
            X.0wU r5 = r6.A02     // Catch:{ all -> 0x039d }
            r1 = 4
            X.74f r0 = new X.74f     // Catch:{ all -> 0x039d }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x039d }
            r5.Boy(r0)     // Catch:{ all -> 0x039d }
        L_0x033f:
            r7.A0m()     // Catch:{ all -> 0x039d }
            java.util.ArrayList r0 = r7.A0m()     // Catch:{ all -> 0x039d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x039d }
            if (r0 != 0) goto L_0x0393
            X.005 r1 = r7.A00     // Catch:{ all -> 0x039d }
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r1)     // Catch:{ all -> 0x039d }
            java.lang.String r7 = "pref_nta_source"
            r6 = -1
            int r0 = r0.getInt(r7, r6)     // Catch:{ all -> 0x039d }
            if (r0 == r6) goto L_0x0393
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r1)     // Catch:{ all -> 0x039d }
            java.lang.String r5 = "pref_nta_disclosure_id"
            int r0 = r0.getInt(r5, r6)     // Catch:{ all -> 0x039d }
            if (r0 == r6) goto L_0x0393
            X.3Ae r0 = r2.A01()     // Catch:{ all -> 0x039d }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x039d }
            X.5xx r8 = r0.A07     // Catch:{ all -> 0x039d }
            X.0v0 r2 = r0.A05     // Catch:{ all -> 0x039d }
            X.005 r1 = r2.A00     // Catch:{ all -> 0x039d }
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r1)     // Catch:{ all -> 0x039d }
            int r9 = r0.getInt(r5, r6)     // Catch:{ all -> 0x039d }
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r1)     // Catch:{ all -> 0x039d }
            int r11 = r0.getInt(r7, r6)     // Catch:{ all -> 0x039d }
            java.util.ArrayList r10 = r2.A0m()     // Catch:{ all -> 0x039d }
            X.0wU r0 = r8.A02     // Catch:{ all -> 0x039d }
            r12 = 7
            X.3wn r7 = new X.3wn     // Catch:{ all -> 0x039d }
            r7.<init>((java.lang.Object) r8, (int) r9, (java.lang.Object) r10, (int) r11, (int) r12)     // Catch:{ all -> 0x039d }
            r0.Boy(r7)     // Catch:{ all -> 0x039d }
        L_0x0393:
            r13.A03 = r4
            android.os.Handler r0 = r13.A02
            if (r0 == 0) goto L_0x039c
            r0.sendEmptyMessage(r3)
        L_0x039c:
            return
        L_0x039d:
            r1 = move-exception
            r13.A03 = r4
            android.os.Handler r0 = r13.A02
            if (r0 == 0) goto L_0x03a7
            r0.sendEmptyMessage(r3)
        L_0x03a7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80933wC.run():void");
    }

    public C80933wC(Handler handler, C19460v5 r4, C19460v5 r5, C19460v5 r6, C19460v5 r7, C19460v5 r8, C19730wQ r9, C27341Nv r10, AnonymousClass164 r11, AnonymousClass3D0 r12, AnonymousClass36G r13, AnonymousClass16D r14, AnonymousClass171 r15, C20430xY r16, AnonymousClass1O6 r17, C27301Nr r18, AnonymousClass1DH r19, C19420v0 r20, C19900wh r21, C18820ts r22, AnonymousClass1A5 r23, AnonymousClass15x r24, AnonymousClass16E r25, C27371Ny r26, AnonymousClass1DY r27, C20810yC r28, C21010yW r29, C20350xQ r30, C20280xJ r31, C27331Nu r32, AnonymousClass1XA r33, AnonymousClass1O8 r34, C590232i r35, C29501Ww r36, C590332j r37, AnonymousClass1AQ r38) {
        this.A0c = r35;
        this.A02 = handler;
        this.A0Q = r28;
        this.A0Z = r4;
        this.A08 = r9;
        this.A0R = r29;
        this.A0I = r19;
        this.A0N = r25;
        this.A0A = r11;
        this.A0D = r14;
        this.A0E = r15;
        this.A0K = r22;
        this.A0a = r5;
        this.A0Y = r38;
        this.A0S = r30;
        this.A0H = r18;
        this.A0F = r16;
        this.A0T = r31;
        this.A0W = r34;
        this.A0X = r36;
        this.A0J = r20;
        this.A0U = r32;
        this.A09 = r10;
        this.A07 = r6;
        this.A0O = r26;
        this.A0P = r27;
        this.A0V = r33;
        this.A05 = r7;
        this.A06 = r8;
        this.A0M = r24;
        this.A0L = r23;
        this.A0b = r21;
        this.A0C = r13;
        this.A0G = r17;
        this.A0B = r12;
        this.A0d = r37;
    }
}
