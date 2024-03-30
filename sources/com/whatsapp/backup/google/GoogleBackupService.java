package com.whatsapp.backup.google;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass12P;
import X.AnonymousClass13I;
import X.AnonymousClass13R;
import X.AnonymousClass179;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1DF;
import X.AnonymousClass1DG;
import X.AnonymousClass1Q9;
import X.AnonymousClass1QB;
import X.AnonymousClass1QC;
import X.AnonymousClass1WC;
import X.AnonymousClass3S1;
import X.AnonymousClass3T0;
import X.AnonymousClass6DP;
import X.AnonymousClass6FS;
import X.AnonymousClass6UR;
import X.C023109s;
import X.C131096Ns;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19630wG;
import X.C19700wN;
import X.C19730wQ;
import X.C19970wo;
import X.C20690y0;
import X.C20810yC;
import X.C20830yE;
import X.C21010yW;
import X.C21060yb;
import X.C21380z9;
import X.C21520zN;
import X.C21570zS;
import X.C220612s;
import X.C24341Cb;
import X.C24431Ck;
import X.C24461Cn;
import X.C31131bK;
import X.C31141bL;
import X.C33101ei;
import X.C33121ek;
import X.C33161ep;
import X.C33171eq;
import X.C34091gR;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C47172dd;
import X.C90514aH;
import android.app.Notification;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GoogleBackupService extends C47172dd {
    public C19700wN A00;
    public C20690y0 A01;
    public AnonymousClass17Y A02;
    public C19730wQ A03;
    public C24461Cn A04;
    public C24431Ck A05;
    public AnonymousClass3S1 A06;
    public C33101ei A07;
    public AnonymousClass6FS A08;
    public C33121ek A09;
    public C33171eq A0A;
    public C33161ep A0B;
    public C131096Ns A0C;
    public AnonymousClass179 A0D;
    public C24341Cb A0E;
    public C21060yb A0F;
    public C19970wo A0G;
    public C19630wG A0H;
    public C20830yE A0I;
    public C19420v0 A0J;
    public AnonymousClass1DG A0K;
    public AnonymousClass1DF A0L;
    public AnonymousClass1Q9 A0M;
    public C220612s A0N;
    public AnonymousClass12P A0O;
    public AnonymousClass13R A0P;
    public C21520zN A0Q;
    public C20810yC A0R;
    public C21010yW A0S;
    public AnonymousClass1QB A0T;
    public AnonymousClass19A A0U;
    public AnonymousClass13I A0V;
    public AnonymousClass1QC A0W;
    public AnonymousClass3T0 A0X;
    public C21380z9 A0Y;
    public C21570zS A0Z;
    public AnonymousClass005 A0a;
    public Map A0b;
    public Random A0c;
    public boolean A0d = false;
    public boolean A0e = false;
    public int A0f;
    public final ArrayList A0g = AnonymousClass001.A0I();
    public final AtomicBoolean A0h = new AtomicBoolean(false);
    public final Binder A0i = new Binder();
    public final Object A0j = C36441kJ.A11();

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:445:0x0bf1=Splitter:B:445:0x0bf1, B:430:0x0ba9=Splitter:B:430:0x0ba9, B:426:0x0b9a=Splitter:B:426:0x0b9a, B:422:0x0b8b=Splitter:B:422:0x0b8b, B:410:0x0b5c=Splitter:B:410:0x0b5c, B:414:0x0b6c=Splitter:B:414:0x0b6c, B:418:0x0b7c=Splitter:B:418:0x0b7c} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:539:0x0e91=Splitter:B:539:0x0e91, B:531:0x0e83=Splitter:B:531:0x0e83, B:535:0x0e8a=Splitter:B:535:0x0e8a} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:683:0x1236=Splitter:B:683:0x1236, B:447:0x0bfd=Splitter:B:447:0x0bfd} */
    public void onHandleIntent(android.content.Intent r52) {
        /*
            r51 = this;
            r8 = 0
            r2 = r52
            if (r52 == 0) goto L_0x0015
            java.lang.String r4 = r2.getAction()
        L_0x0009:
            java.lang.String r11 = "gdrive-service/handle-intent started without an action."
            r0 = r51
            if (r4 == 0) goto L_0x002f
            X.6FS r3 = r0.A08
            java.lang.Object r1 = r3.A0B
            monitor-enter(r1)
            goto L_0x0017
        L_0x0015:
            r4 = r8
            goto L_0x0009
        L_0x0017:
            r3.A02 = r4     // Catch:{ all -> 0x001c }
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            goto L_0x115c
        L_0x001c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r0
        L_0x001f:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "gdrive-service/handle-intent action is "
            X.C36321k7.A1Q(r3, r4, r7)
            int r3 = r4.hashCode()
            switch(r3) {
                case -1755890518: goto L_0x0034;
                case -818191995: goto L_0x06ea;
                case 1035381739: goto L_0x0c4f;
                case 1096596436: goto L_0x0e0c;
                case 1122735421: goto L_0x0eac;
                case 1461510777: goto L_0x0f89;
                case 1583504647: goto L_0x1020;
                case 1996912751: goto L_0x1088;
                default: goto L_0x002f;
            }
        L_0x002f:
            com.whatsapp.util.Log.e((java.lang.String) r11)
            goto L_0x1176
        L_0x0034:
            java.lang.String r3 = "action_restore_media"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x002f
            X.0v0 r2 = r0.A0J
            java.lang.String r35 = r2.A0g()
            boolean r2 = android.text.TextUtils.isEmpty(r35)
            if (r2 == 0) goto L_0x004c
            java.lang.String r1 = "restore>google-service/restore-messages jidUser is null"
            goto L_0x0700
        L_0x004c:
            X.0wo r2 = r0.A0G
            r27 = r2
            X.0wN r2 = r0.A00
            r18 = r2
            X.0y0 r2 = r0.A01
            r19 = r2
            X.0yW r2 = r0.A0S
            r31 = r2
            X.179 r2 = r0.A0D
            r26 = r2
            X.6FS r3 = r0.A08
            java.lang.String r2 = "restore"
            X.6Xi r25 = r3.A01(r5, r2)
            X.1QB r15 = r0.A0T
            X.1Ck r14 = r0.A05
            X.1DF r13 = r0.A0L
            X.1QC r12 = r0.A0W
            X.6FS r11 = r0.A08
            X.0yE r10 = r0.A0I
            X.0v0 r9 = r0.A0J
            X.1ei r7 = r0.A07
            X.1ek r6 = r0.A09
            X.58l r32 = r11.A02()
            X.1eq r2 = r0.A0A
            java.util.concurrent.atomic.AtomicLong r5 = r2.A05
            java.util.concurrent.atomic.AtomicLong r3 = r2.A04
            X.6FS r2 = r0.A08
            X.1el r2 = r2.A07
            X.5zJ r4 = new X.5zJ
            r16 = r4
            r17 = r0
            r20 = r14
            r21 = r7
            r22 = r11
            r23 = r6
            r24 = r2
            r28 = r10
            r29 = r9
            r30 = r13
            r33 = r15
            r34 = r12
            r36 = r5
            r37 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            java.util.Map r2 = r0.A0b
            r33 = r2
            X.0v0 r2 = r4.A0B
            r50 = r2
            boolean r2 = X.AnonymousClass6Y6.A05(r50)
            if (r2 != 0) goto L_0x00bb
            java.lang.String r1 = "restore>MediaRestoreAction/restore media called but media restore is not pending, request ignored."
            goto L_0x1158
        L_0x00bb:
            X.1ei r2 = r4.A04
            r49 = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.A0S
            r48 = r2
            boolean r2 = r2.getAndSet(r1)
            if (r2 == 0) goto L_0x00cd
            java.lang.String r1 = "restore>MediaRestoreAction/media restore is already running, request ignored."
            goto L_0x10a0
        L_0x00cd:
            int r2 = r50.A0E()
            r3 = 10
            if (r2 == r3) goto L_0x00da
            X.6FS r2 = r4.A05
            r2.A06(r3)
        L_0x00da:
            X.1QC r2 = r4.A0G
            r2.A02()
            X.1ek r2 = r4.A06
            r47 = r2
            r3 = 0
            r2.A01 = r3
            java.util.Iterator r3 = X.C36361kB.A0s(r47)
        L_0x00ea:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00fa
            java.lang.Object r2 = r3.next()
            X.1eo r2 = (X.C33151eo) r2
            r2.Baj()
            goto L_0x00ea
        L_0x00fa:
            X.58l r5 = r4.A0E
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r5.A01 = r2
            r19 = 0
            java.lang.String r31 = "gdrive_restore_start_timestamp"
            r3 = r50
            r2 = r31
            long r6 = r3.A0V(r2)     // Catch:{ all -> 0x1225 }
            r9 = 0
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0119
            r2 = r31
            r3.A1Z(r2)     // Catch:{ all -> 0x1225 }
        L_0x0119:
            X.6Xi r3 = r4.A08     // Catch:{ all -> 0x1225 }
            X.782 r2 = r3.A06     // Catch:{ all -> 0x1225 }
            r46 = r2
            r6 = 0
            r2.A00 = r6     // Catch:{ all -> 0x1225 }
            java.util.concurrent.atomic.AtomicInteger r2 = r3.A0A     // Catch:{ all -> 0x1225 }
            r45 = r2
            r2.set(r6)     // Catch:{ all -> 0x1225 }
            r6 = 2
            r2 = r50
            r2.A1A(r6)     // Catch:{ all -> 0x1225 }
            java.lang.String r2 = "restore>MediaRestoreAction/stage: authenticating with google servers"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.1el r2 = r4.A07     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r44 = r2
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6 = 14
            boolean r2 = X.AnonymousClass6YN.A0C(r2, r3, r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 != 0) goto L_0x014c
            X.6FS r2 = r4.A05     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r1 = 11
        L_0x0147:
            r2.A06(r1)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x06dd
        L_0x014c:
            java.lang.String r2 = "restore>MediaRestoreAction/stage: requesting backup"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r7 = r4.A0H     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r6 = "gdrive/restore-media"
            r2 = r44
            X.6Te r20 = X.AnonymousClass6YN.A01(r2, r3, r7, r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r16 = 1
            if (r20 == 0) goto L_0x0190
            if (r33 == 0) goto L_0x0167
            boolean r2 = r33.isEmpty()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 == 0) goto L_0x0197
        L_0x0167:
            r2 = r20
            org.json.JSONObject r6 = r2.A0B     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r6 == 0) goto L_0x0179
            java.lang.String r3 = "encryptedBackupEnabled"
            r2 = 0
            boolean r2 = r6.optBoolean(r3, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 == 0) goto L_0x0179
            r2 = 1
            goto L_0x017b
        L_0x0179:
            r2 = 0
        L_0x017b:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A0B = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "restore>MediaRestoreAction/stage: loading files from backup"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r49
            X.1el r3 = r2.A0I     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r20
            java.util.Map r33 = X.AnonymousClass6YN.A05(r3, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x0190:
            if (r33 != 0) goto L_0x0197
            X.6FS r2 = r4.A05     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r1 = 14
            goto L_0x0147
        L_0x0197:
            X.1Ck r3 = r4.A03     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.Collection r2 = r33.values()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.AnonymousClass6YN.A08(r3, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            boolean r43 = r50.A2B()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.HashSet r32 = X.C36441kJ.A16()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.0y0 r2 = r4.A02     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.io.File r2 = r2.A0H()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r3 = r2.getName()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r32
            r2.add(r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r49
            int r3 = r2.A00     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = 2
            if (r3 != r2) goto L_0x01c7
            X.C18740tg.A06(r5)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A0C = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x01c7:
            java.lang.String r30 = ","
            r3 = r30
            r2 = r32
            android.text.TextUtils.join(r3, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "restore>MediaRestoreAction/stage: collect files to download from the backup"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.List r29 = java.util.Collections.synchronizedList(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r3 = "restore>MediaRestoreAction/get-files-to-be-downloaded"
            X.14g r28 = new X.14g     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r28
            r2.<init>((java.lang.String) r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.0yE r2 = r4.A0A     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            boolean r2 = r2.A0H()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 != 0) goto L_0x0519
            java.util.concurrent.atomic.AtomicReference r27 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r27
            r2.<init>(r8)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.Set r6 = r33.keySet()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.atomic.AtomicBoolean r26 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r26
            r2.<init>(r1)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r3 = r6.size()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.CountDownLatch r25 = new java.util.concurrent.CountDownLatch     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r25
            r2.<init>(r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r24 = r6.size()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.Iterator r23 = r6.iterator()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r11 = 0
        L_0x0214:
            boolean r2 = r23.hasNext()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 == 0) goto L_0x02f9
            java.lang.String r15 = X.AnonymousClass001.A0C(r23)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = r11 % 100
            if (r2 != 0) goto L_0x0235
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "restore>MediaRestoreAction/get-files-to-be-downloaded "
            r6.append(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6.append(r11)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r3 = "/"
            r2 = r24
            X.C36321k7.A1T(r3, r6, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x0235:
            int r11 = r11 + 1
            boolean r2 = r44.A00()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 == 0) goto L_0x052b
            java.lang.Object r2 = r27.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.5VQ r2 = (X.AnonymousClass5VQ) r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 == 0) goto L_0x024f
            boolean r1 = r2 instanceof X.C101864yP     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r1 != 0) goto L_0x030a
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r3.<init>(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x024e:
            throw r3     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x024f:
            long r2 = (long) r11     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r21 = r2
            r2 = r24
            long r6 = (long) r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r47
            int r12 = r2.A01     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0263
            r2 = 100
            long r2 = r2 * r21
            long r2 = r2 / r6
            int r12 = (int) r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x0263:
            r2 = r47
            int r2 = r2.A01     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r12 == r2) goto L_0x029f
            java.util.Locale r18 = java.util.Locale.ENGLISH     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Object[] r14 = X.C36441kJ.A1Q()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r13 = 0
            r2 = r21
            X.AnonymousClass000.A1M(r14, r13, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.AnonymousClass000.A1M(r14, r1, r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = 2
            X.AnonymousClass000.A1L(r14, r12, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r3 = "restore>GoogleBackupRestoreObservable/media-restore-preparation-progress %d/%d (%d%%)"
            r2 = r18
            X.C90494aF.A1J(r3, r2, r14)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r47
            r2.A01 = r12     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.Iterator r6 = X.C36361kB.A0s(r47)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x028b:
            boolean r2 = r6.hasNext()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 == 0) goto L_0x029f
            java.lang.Object r3 = r6.next()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.1eo r3 = (X.C33151eo) r3     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r47
            int r2 = r2.A01     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r3.Bai(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x028b
        L_0x029f:
            r2 = r33
            java.lang.Object r2 = r2.get(r15)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.6Pk r2 = (X.C131526Pk) r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.179 r3 = r4.A09     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r3 = X.C34191gb.A06(r3, r15)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r3 != 0) goto L_0x02bd
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "restore>MediaRestoreAction/get-files-to-be-downloaded/skipping-null-download-path relative path: "
            X.C36321k7.A1P(r2, r15, r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x02b8:
            r25.countDown()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x0214
        L_0x02bd:
            java.io.File r37 = X.C90524aI.A0S(r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.Iterator r6 = r32.iterator()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x02c5:
            boolean r3 = r6.hasNext()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r3 == 0) goto L_0x02f1
            java.lang.String r3 = X.AnonymousClass001.A0C(r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            boolean r3 = r15.startsWith(r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r3 == 0) goto L_0x02c5
            X.748 r3 = new X.748     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r34 = r3
            r35 = r4
            r36 = r2
            r38 = r15
            r39 = r29
            r40 = r25
            r41 = r26
            r42 = r27
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.ThreadPoolExecutor r2 = X.C113925gM.A00     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2.execute(r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x0214
        L_0x02f1:
            r3 = r30
            r2 = r32
            android.text.TextUtils.join(r3, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x02b8
        L_0x02f9:
            java.lang.Object r3 = r27.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.5VQ r3 = (X.AnonymousClass5VQ) r3     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r3 == 0) goto L_0x030b
            boolean r1 = r3 instanceof X.C101864yP     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r1 != 0) goto L_0x024e
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2.<init>(r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x030a:
            throw r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x030b:
            java.lang.String r2 = "restore>MediaRestoreAction/get-files-to-be-downloaded waiting for all files to be processed."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ InterruptedException -> 0x0527 }
            r25.await()     // Catch:{ InterruptedException -> 0x0527 }
            boolean r2 = r26.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 == 0) goto L_0x052b
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "restore>MediaRestoreAction/restore-files/num-files-to-be-downloaded/"
            r3.append(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = r29.size()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.C36321k7.A1Y(r3, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.atomic.AtomicInteger r3 = r4.A0I     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = r29.size()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = r2 / 10
            r3.set(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r28.A01()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            android.content.SharedPreferences r3 = X.C36341k9.A0E(r50)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "gdrive_already_downloaded_bytes"
            long r2 = r3.getLong(r2, r9)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.atomic.AtomicLong r12 = r4.A0L     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r12.set(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.Iterator r11 = r29.iterator()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x034a:
            boolean r6 = r11.hasNext()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r6 == 0) goto L_0x0364
            java.lang.Object r7 = r11.next()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6 = r33
            java.lang.Object r6 = r6.get(r7)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.6Pk r6 = (X.C131526Pk) r6     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r6 == 0) goto L_0x034a
            long r6 = r6.A00     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r12.addAndGet(r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x034a
        L_0x0364:
            X.76J r7 = new X.76J     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r7.<init>()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6 = r29
            java.util.Collections.sort(r6, r7)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6 = r49
            X.0wg r7 = r6.A0N     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.0yb r6 = r6.A0J     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r7 = X.AnonymousClass1K2.A01(r6, r7)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r6 = "GoogleBackupConditionsManager/calc-max-concurrent-reads/network_type="
            r11.append(r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6 = r49
            int r6 = r6.A00     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r11.append(r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r6 = ", year class = "
            X.C36321k7.A1T(r6, r11, r7)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6 = r49
            int r6 = r6.A00     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r13 = 4
            if (r6 != r1) goto L_0x0399
            r6 = 2011(0x7db, float:2.818E-42)
            r11 = 4
            if (r7 >= r6) goto L_0x039e
        L_0x0399:
            r6 = 2
            int r11 = java.lang.Math.min(r13, r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x039e:
            int r6 = r29.size()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            double r6 = (double) r6     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A03 = r6     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Long r6 = X.C36441kJ.A0y(r11)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A0F = r6     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.ArrayList r25 = X.AnonymousClass001.A0I()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.atomic.AtomicInteger r18 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r7 = 0
            r6 = r18
            r6.<init>(r7)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.atomic.AtomicLong r6 = r4.A0K     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r32 = r6
            r6.set(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0J     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r30 = r2
            r2.set(r9)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r3 = r29.size()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.CountDownLatch r15 = new java.util.concurrent.CountDownLatch     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r15.<init>(r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r3.<init>(r8)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "gdrive-util/max concurrent reads "
            X.C36321k7.A1T(r2, r6, r11)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.TimeUnit r39 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "Google Drive Read Worker #"
            X.79S r40 = new X.79S     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r40.<init>()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            long r7 = (long) r1     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.77J r6 = new X.77J     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6.<init>(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r35 = 0
            r34 = r2
            r36 = r11
            r37 = r7
            r41 = r6
            r34.<init>(r35, r36, r37, r39, r40, r41)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.77B r6 = X.AnonymousClass77B.A00     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2.setRejectedExecutionHandler(r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r6 = "restore>MediaRestoreAction/stage: start downloading files from google"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.Iterator r14 = r29.iterator()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r8 = 0
        L_0x040d:
            boolean r6 = r14.hasNext()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r7 = "/"
            if (r6 == 0) goto L_0x045f
            java.lang.String r11 = X.AnonymousClass001.A0C(r14)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r8 = r8 + 1
            int r6 = r8 % 100
            if (r6 != 0) goto L_0x0435
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r6 = "restore>MediaRestoreAction/restore-files enqueuing download  "
            r13.append(r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r13.append(r8)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6 = r29
            X.C36371kC.A1R(r7, r13, r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r6 = ": "
            X.C36321k7.A1Q(r6, r11, r13)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x0435:
            r6 = r33
            java.lang.Object r7 = r6.get(r11)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.6Pk r7 = (X.C131526Pk) r7     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r7 == 0) goto L_0x0456
            r28 = 4
            X.75A r6 = new X.75A     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r21 = r6
            r22 = r4
            r23 = r7
            r24 = r3
            r26 = r18
            r27 = r15
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2.execute(r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x040d
        L_0x0456:
            java.lang.String r6 = "restore>MediaRestoreAction/restore-files resId cannot be null, skipping."
            com.whatsapp.util.Log.e((java.lang.String) r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r15.countDown()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x040d
        L_0x045f:
            java.lang.String r2 = "restore>MediaRestoreAction/restore-files waiting for all files to be restored."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ InterruptedException -> 0x0522 }
            r15.await()     // Catch:{ InterruptedException -> 0x0522 }
            java.lang.Object r3 = r3.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.5VQ r3 = (X.AnonymousClass5VQ) r3     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r3 == 0) goto L_0x0487
            boolean r2 = r3 instanceof X.C101884yR     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 != 0) goto L_0x024e
            boolean r2 = r3 instanceof X.C101874yQ     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 != 0) goto L_0x024e
            boolean r2 = r3 instanceof X.C101824yL     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 != 0) goto L_0x024e
            boolean r2 = r3 instanceof X.C101804yJ     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 != 0) goto L_0x024e
            boolean r2 = r3 instanceof X.C101784yH     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 != 0) goto L_0x024e
            boolean r2 = r3 instanceof X.C101864yP     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 != 0) goto L_0x024e
        L_0x0487:
            int r2 = r25.size()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 <= 0) goto L_0x04ba
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "restore>MediaRestoreAction/restore-files/failed-files/"
            r3.append(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = r25.size()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.C36321k7.A1Y(r3, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.0wN r6 = r4.A01     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = r25.size()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r8.append(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r3 = " files  out of total "
            r2 = r29
            X.C36371kC.A1R(r3, r8, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r3 = r8.toString()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "gdrive/restore-media/failed to restore files"
            r6.A0E(r2, r3, r1)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x04ba:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "restore>MediaRestoreAction/restore-files waiting for restore to finish: "
            r6.append(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            long r2 = r32.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6.append(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6.append(r7)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            long r2 = r12.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6.append(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = " ("
            r6.append(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            long r2 = r30.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6.append(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = " failed)"
            X.C36321k7.A1a(r6, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            long r6 = r32.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x04f5
            long r6 = r30.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0520
        L_0x04f5:
            long r6 = r12.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0520
            long r6 = r32.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            long r2 = r12.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.Iterator r11 = X.C36361kB.A0s(r47)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x0509:
            boolean r8 = r11.hasNext()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r8 == 0) goto L_0x0520
            java.lang.Object r8 = r11.next()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.1eo r8 = (X.C33151eo) r8     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r8.Bak(r6, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x0509
        L_0x0519:
            X.4yP r3 = new X.4yP     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r3.<init>()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x024e
        L_0x0520:
            r8 = 1
            goto L_0x0534
        L_0x0522:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x0533
        L_0x0527:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x052b:
            java.lang.String r2 = "restore>MediaRestoreAction/restore-files failed to get list of files to be restored."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r28.A01()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x0533:
            r8 = 0
        L_0x0534:
            r3 = 0
            r2 = r50
            r2.A1A(r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "restore>MediaRestoreAction/stage: restoring files finished with "
            r3.append(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r8 == 0) goto L_0x0546
            goto L_0x0549
        L_0x0546:
            java.lang.String r2 = "failure"
            goto L_0x054b
        L_0x0549:
            java.lang.String r2 = "success"
        L_0x054b:
            X.C36321k7.A1a(r3, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r8 == 0) goto L_0x0551
            goto L_0x0559
        L_0x0551:
            X.6FS r3 = r4.A05     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = 14
            r3.A06(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x055f
        L_0x0559:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A0A = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x055f:
            r2 = r49
            int r3 = r2.A00     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r3 != r1) goto L_0x05a8
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A0C = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x056b:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r3 = r50
            r2 = r31
            long r2 = r3.A0V(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Long r2 = X.C90504aG.A0h(r6, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A0D = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0L     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            long r2 = r2.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Double r2 = X.C90524aI.A0Z(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A08 = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0J     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            long r2 = r2.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Double r2 = X.C90524aI.A0Z(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A07 = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.Locale r12 = java.util.Locale.ENGLISH     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r7 = "restore>MediaRestoreAction/total wall time for media + message restore: %.1f seconds."
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Long r2 = r5.A0D     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            long r2 = r2.longValue()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.C90494aF.A1S(r6, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String.format(r12, r7, r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x05b2
        L_0x05a8:
            r2 = 2
            if (r3 != r2) goto L_0x056b
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A0C = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x056b
        L_0x05b2:
            if (r20 == 0) goto L_0x0620
            r2 = r20
            long r2 = r2.A04     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            double r6 = (double) r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A06 = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r20
            org.json.JSONObject r11 = r2.A0B     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = -1
            if (r11 == 0) goto L_0x05cd
            java.lang.String r9 = "chatdbSize"
            long r2 = r11.optLong(r9, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x05cd:
            java.lang.Double r2 = X.C90524aI.A0Z(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A02 = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = -1
            if (r11 == 0) goto L_0x05dd
            java.lang.String r9 = "chatdbSize"
            long r2 = r11.optLong(r9, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x05dd:
            double r9 = (double) r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            double r6 = r6 - r9
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A04 = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = r46
            int r6 = r2.A00     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r2 = r45.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            int r6 = r6 + r2
            double r2 = (double) r6     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A05 = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r3 = "includeVideosInBackup"
            if (r11 == 0) goto L_0x061e
            boolean r2 = r11.has(r3)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 == 0) goto L_0x0613
            boolean r2 = r11.optBoolean(r3, r1)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x0603:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r5.A00 = r2     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r2 = "restore>MediaRestoreAction/total-requests-in-restore-session/"
            X.C36321k7.A1T(r2, r3, r6)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x0620
        L_0x0613:
            org.json.JSONObject r2 = X.C132346Te.A01(r20)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 == 0) goto L_0x061e
            boolean r2 = r2.optBoolean(r3, r1)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x0603
        L_0x061e:
            r2 = 1
            goto L_0x0603
        L_0x0620:
            if (r8 == 0) goto L_0x0625
            r50.A0q()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x0625:
            boolean r2 = r48.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r2 == 0) goto L_0x0667
            int r3 = r50.A0E()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r2 = 10
            if (r3 != r2) goto L_0x06dd
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0K     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            long r2 = r2.get()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.Object[] r7 = X.AnonymousClass001.A0M()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r8 == 0) goto L_0x0664
            java.lang.String r6 = "successful"
        L_0x0641:
            r7[r19] = r6     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.AnonymousClass000.A1M(r7, r1, r2)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.lang.String r1 = "restore>GoogleBackupRestoreObservable/notify-media-restore-end result:%s restored:%d"
            java.lang.String.format(r12, r1, r7)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r6 = -1
            r1 = r47
            r1.A01 = r6     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            java.util.Iterator r6 = X.C36361kB.A0s(r47)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
        L_0x0654:
            boolean r1 = r6.hasNext()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            if (r1 == 0) goto L_0x06dd
            java.lang.Object r1 = r6.next()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            X.1eo r1 = (X.C33151eo) r1     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            r1.Bac(r2, r8)     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x0654
        L_0x0664:
            java.lang.String r6 = "failed"
            goto L_0x0641
        L_0x0667:
            r47.A01()     // Catch:{ 4yQ -> 0x06d0, 4yR -> 0x06a3, 4yL -> 0x0695, 4yJ -> 0x0687, 4yP -> 0x0679, 4yH -> 0x066b }
            goto L_0x06dd
        L_0x066b:
            r3 = move-exception
            X.6FS r2 = r4.A05     // Catch:{ all -> 0x1225 }
            r1 = 25
            r2.A06(r1)     // Catch:{ all -> 0x1225 }
            java.lang.String r1 = "restore>MediaRestoreAction/failure: google drive service is disabled"
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x1225 }
            goto L_0x06dd
        L_0x0679:
            r3 = move-exception
            X.6FS r2 = r4.A05     // Catch:{ all -> 0x1225 }
            r1 = 23
            r2.A06(r1)     // Catch:{ all -> 0x1225 }
            java.lang.String r1 = "restore>MediaRestoreAction/failure: access denied to external storage"
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x1225 }
            goto L_0x06dd
        L_0x0687:
            r3 = move-exception
            X.6FS r2 = r4.A05     // Catch:{ all -> 0x1225 }
            r1 = 19
            r2.A06(r1)     // Catch:{ all -> 0x1225 }
            java.lang.String r1 = "restore>MediaRestoreAction/failure: google servers' are not working"
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x1225 }
            goto L_0x06dd
        L_0x0695:
            r3 = move-exception
            X.6FS r2 = r4.A05     // Catch:{ all -> 0x1225 }
            r1 = 15
            r2.A06(r1)     // Catch:{ all -> 0x1225 }
            java.lang.String r1 = "restore>MediaRestoreAction/failure: local storage is full"
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x1225 }
            goto L_0x06dd
        L_0x06a3:
            r2 = move-exception
            java.lang.String r1 = "restore>MediaRestoreAction/failure: access permission is mission for the provided google account"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x1225 }
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ all -> 0x1225 }
            if (r1 != 0) goto L_0x06bc
            java.lang.String r1 = "restore>MediaRestoreAction/failure: auth-failed/unknown-cause"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x1225 }
            X.6FS r2 = r4.A05     // Catch:{ all -> 0x1225 }
            r1 = 11
            r2.A06(r1)     // Catch:{ all -> 0x1225 }
            goto L_0x06dd
        L_0x06bc:
            boolean r1 = r1 instanceof X.C03930Im     // Catch:{ all -> 0x1225 }
            if (r1 == 0) goto L_0x06c8
            X.6FS r2 = r4.A05     // Catch:{ all -> 0x1225 }
            r1 = 21
            r2.A06(r1)     // Catch:{ all -> 0x1225 }
            goto L_0x06dd
        L_0x06c8:
            X.6FS r2 = r4.A05     // Catch:{ all -> 0x1225 }
            r1 = 11
            r2.A06(r1)     // Catch:{ all -> 0x1225 }
            goto L_0x06dd
        L_0x06d0:
            r3 = move-exception
            X.6FS r2 = r4.A05     // Catch:{ all -> 0x1225 }
            r1 = 12
            r2.A06(r1)     // Catch:{ all -> 0x1225 }
            java.lang.String r1 = "restore>MediaRestoreAction/failure: account not present on the device anymore"
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x1225 }
        L_0x06dd:
            X.0yW r1 = r4.A0D
            r1.Bly(r5)
            r2 = 0
            r1 = r48
            r1.getAndSet(r2)
            goto L_0x1178
        L_0x06ea:
            java.lang.String r3 = "action_restore"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x002f
            X.0v0 r2 = r0.A0J
            java.lang.String r35 = r2.A0g()
            boolean r2 = android.text.TextUtils.isEmpty(r35)
            if (r2 == 0) goto L_0x0709
            java.lang.String r1 = "restore>google-service/restore-messages jid is null"
        L_0x0700:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.6FS r2 = r0.A08
            r1 = 18
            goto L_0x0ca2
        L_0x0709:
            X.0wo r2 = r0.A0G
            r27 = r2
            X.0wN r2 = r0.A00
            r18 = r2
            X.179 r15 = r0.A0D
            X.6FS r2 = r0.A08
            X.58l r33 = r2.A02()
            X.6FS r3 = r0.A08
            X.1el r14 = r3.A08
            X.0zN r13 = r0.A0Q
            java.lang.String r2 = "restore"
            X.6Xi r25 = r3.A01(r5, r2)
            X.3T0 r12 = r0.A0X
            X.1Q9 r11 = r0.A0M
            X.0yC r3 = r0.A0R
            X.13R r2 = r0.A0P
            X.6Uy r20 = X.C132716Uy.A00(r2, r3)
            X.6FS r10 = r0.A08
            X.0yE r9 = r0.A0I
            X.0v0 r7 = r0.A0J
            X.1eq r2 = r0.A0A
            java.util.concurrent.atomic.AtomicLong r2 = r2.A04
            java.util.Objects.requireNonNull(r2)
            X.6pU r5 = new X.6pU
            r5.<init>(r2)
            X.1Cn r4 = r0.A04
            X.12s r3 = r0.A0N
            X.1ei r2 = r0.A07
            X.6Lu r6 = new X.6Lu
            r16 = r6
            r17 = r0
            r19 = r4
            r21 = r5
            r22 = r2
            r23 = r10
            r24 = r14
            r26 = r15
            r28 = r9
            r29 = r7
            r30 = r11
            r31 = r3
            r32 = r13
            r34 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.1ek r9 = r0.A09
            java.lang.String r19 = "restore>RestoreAction/total-requests-till-restore-messages/"
            X.12s r2 = r6.A0C
            X.12P r2 = r2.A00
            r5 = 0
            boolean r2 = r2.A0A(r8, r5)
            r4 = 0
            if (r2 == 0) goto L_0x0786
            java.lang.String r2 = "restore>RestoreAction/media restore is pending, end message store download"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r9.A08(r1)
        L_0x0782:
            r0.A0b = r4
            goto L_0x1178
        L_0x0786:
            X.1ei r3 = r6.A04
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A0T
            r24 = r2
            boolean r2 = r2.getAndSet(r1)
            if (r2 == 0) goto L_0x0798
            java.lang.String r1 = "restore>RestoreAction/restore is already running"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0782
        L_0x0798:
            r14 = 0
            X.0v0 r2 = r6.A0A     // Catch:{ all -> 0x123a }
            r23 = r2
            java.lang.String r20 = "gdrive_restore_start_timestamp"
            r7 = r20
            long r12 = r2.A0V(r7)     // Catch:{ all -> 0x123a }
            r10 = 0
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x07b0
            r2 = r23
            r2.A1Z(r7)     // Catch:{ all -> 0x123a }
        L_0x07b0:
            java.util.Iterator r7 = X.C36361kB.A0s(r9)     // Catch:{ all -> 0x123a }
        L_0x07b4:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x123a }
            if (r2 == 0) goto L_0x07c4
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x123a }
            X.1eo r2 = (X.C33151eo) r2     // Catch:{ all -> 0x123a }
            r2.Bb3()     // Catch:{ all -> 0x123a }
            goto L_0x07b4
        L_0x07c4:
            r7 = 3
            r2 = r23
            r2.A1A(r7)     // Catch:{ all -> 0x123a }
            X.6Xi r10 = r6.A07     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.1el r11 = r6.A06     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.AnonymousClass00C.A0D(r11, r1)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r2 = 14
            boolean r2 = X.AnonymousClass6YN.A0C(r11, r10, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 != 0) goto L_0x07e5
            X.6FS r3 = r6.A05     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r2 = 11
            r3.A06(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r9.A08(r5)     // Catch:{ all -> 0x123a }
            goto L_0x0c36
        L_0x07e5:
            r6.A00 = r8     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restore-messages/stage: get backup from google"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r15 = r6.A0G     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "gdrive-service/fetch-account-data-v2"
            X.6Te r12 = X.AnonymousClass6YN.A01(r11, r10, r15, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r12 != 0) goto L_0x07fd
            java.lang.String r2 = "restore>RestoreAction/restore-messages/backup doesn't exist(null), aborting restore."
        L_0x07f8:
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x0b3a
        L_0x07fd:
            org.json.JSONObject r5 = r12.A0B     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r5 == 0) goto L_0x0824
            java.lang.String r4 = "backupVersion"
            int r2 = r5.optInt(r4, r1)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 <= r1) goto L_0x0829
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "/restore-messages/backup version is newer than the app can support. Backup version: "
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            int r2 = r5.optInt(r4, r1)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = ", supported version: "
            X.C36321k7.A1S(r2, r3, r1)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.4yO r3 = new X.4yO     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.<init>()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x0823:
            throw r3     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x0824:
            java.lang.String r2 = "gdrive-api-v2/backup-version metadata is null."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x0829:
            X.6Uy r4 = r6.A02     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            org.json.JSONObject r2 = r12.A02()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            boolean r2 = r4.A03(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 != 0) goto L_0x083f
            X.0wN r3 = r6.A01     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "gdrive/restore/message backup is expired"
            r3.A0E(r2, r8, r14)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restore-messages/backup is expired(not supported anymore)."
            goto L_0x07f8
        L_0x083f:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "/restore-messages/version of app at time of backup was: "
            r7.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r4 = "unknown"
            if (r5 == 0) goto L_0x0855
            java.lang.String r2 = "versionOfAppWhenBackup"
            java.lang.String r4 = r5.optString(r2, r4)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.AnonymousClass00C.A08(r4)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x0855:
            X.C36321k7.A1a(r7, r4)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            int r2 = r23.A0F()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 != r1) goto L_0x0861
            java.lang.String r2 = "restore>RestoreAction/restore-messages/cannot start restore, backup in progress."
            goto L_0x07f8
        L_0x0861:
            java.lang.String r2 = "restore>RestoreAction/restore-messages/stage: load files from google"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.1el r2 = r3.A0I     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.util.Map r2 = X.AnonymousClass6YN.A05(r2, r12)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r6.A00 = r2     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0b3a
            boolean r2 = r23.A2B()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0b33
            X.0zN r3 = r6.A0D     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.AnonymousClass00C.A0D(r3, r14)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r2 = 5284(0x14a4, float:7.404E-42)
            boolean r2 = r3.A0E(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.util.Map r13 = r6.A00     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0944
            java.util.ArrayList r18 = X.AnonymousClass6YN.A04(r13)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            int r2 = r18.size()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r7 = 1
            X.58l r8 = r6.A0E     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 <= r1) goto L_0x08f0
            java.lang.Integer r2 = X.C36361kB.A0j()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r8.A09 = r2     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            int r2 = r18.size()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            long r2 = (long) r2     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r16 = 1
            r4 = r2
            r2 = r16
            java.lang.Long r2 = X.C90504aG.A0h(r4, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r8.A0E = r2     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x08a8:
            boolean r2 = r11.A00()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0b3a
            java.lang.String r2 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/stage: restore user settings"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.C130626Lu.A00(r12, r6, r13)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.5U6 r2 = X.AnonymousClass5U6.A00()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            int r4 = r2.version     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.util.Iterator r3 = r18.iterator()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x08c0:
            boolean r2 = r3.hasNext()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x08f7
            java.lang.Object r2 = r3.next()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.6Pk r2 = (X.C131526Pk) r2     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r5 = r2.A01()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "msgstore.db"
            int r2 = X.AnonymousClass6YO.A01(r5, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 <= r4) goto L_0x08c0
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/contains-newer-backup/true "
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.append(r5)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = " is newer than the supported"
            X.C36321k7.A1S(r2, r3, r4)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.4yO r3 = new X.4yO     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.<init>()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x0823
        L_0x08f0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r8.A09 = r2     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x08a8
        L_0x08f7:
            boolean r2 = r18.isEmpty()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 != 0) goto L_0x091f
            X.1Q9 r2 = r6.A0B     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r2.A0P(r14)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.util.Iterator r8 = r18.iterator()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r4 = 0
        L_0x0908:
            boolean r2 = r8.hasNext()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0a1f
            java.lang.Object r3 = r8.next()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.6Pk r3 = (X.C131526Pk) r3     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.6Cl r2 = r3.A02     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x091b
            long r2 = r2.A00     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x091d
        L_0x091b:
            long r2 = r3.A00     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x091d:
            long r4 = r4 + r2
            goto L_0x0908
        L_0x091f:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/weird situation, no message backup file found for \""
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.append(r15)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "\" (while remote file list size is: "
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.C18740tg.A06(r13)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.C90504aG.A1N(r3, r13)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = ")"
            X.C36321k7.A1Z(r3, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "no message backup file found in remote file list"
            X.4yT r3 = new X.4yT     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.<init>(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x0823
        L_0x0944:
            X.58l r3 = r6.A0E     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r7 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.A09 = r2     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.1Q9 r2 = r6.A0B     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r10 = r2
            java.io.File[] r3 = r2.A0R()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            int r2 = r3.length     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r8 = r2
            r4 = 0
            r5 = 0
        L_0x0958:
            if (r5 >= r8) goto L_0x0975
            r4 = r3[r5]     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.179 r2 = r6.A08     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = X.C34191gb.A05(r2, r4)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0a17
            java.lang.Object r4 = r13.get(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.6Pk r4 = (X.C131526Pk) r4     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r4 == 0) goto L_0x0984
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restore-messages/found backup file: "
            X.C36321k7.A1K(r4, r2, r3)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x0975:
            boolean r2 = r11.A00()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0b3a
            java.lang.String r2 = "restore>RestoreAction/restore-messages/stage: restore user settings"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.C130626Lu.A00(r12, r6, r13)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x0987
        L_0x0984:
            int r5 = r5 + 1
            goto L_0x0958
        L_0x0987:
            if (r4 != 0) goto L_0x0a68
            X.5U6 r2 = X.AnonymousClass5U6.A00()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            int r5 = r2.version     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.util.Map r2 = r6.A00     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.C18740tg.A06(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.util.Iterator r7 = X.AnonymousClass000.A10(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x0998:
            boolean r2 = r7.hasNext()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x09ca
            java.lang.String r4 = X.AnonymousClass001.A0C(r7)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.179 r2 = r6.A08     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r3 = X.C34191gb.A06(r2, r4)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r3 == 0) goto L_0x0998
            java.lang.String r2 = "msgstore.db"
            int r2 = X.AnonymousClass6YO.A01(r3, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 <= r5) goto L_0x0998
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/contains-newer-backup/true "
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.append(r4)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = " is newer than "
            X.C36321k7.A1T(r2, r3, r5)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.4yO r3 = new X.4yO     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.<init>()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x0823
        L_0x09ca:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restore-messages/weird situation, no message backup file found for paths ["
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.io.File[] r2 = r10.A0R()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r4 = ", "
            java.lang.String r2 = android.text.TextUtils.join(r4, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "] in backup for \""
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.append(r15)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "\" (while looking in gdrive_file_map (size: "
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.C18740tg.A06(r13)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.C90504aG.A1N(r3, r13)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = ")"
            X.C36321k7.A1Z(r3, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "no message backup file found for paths ["
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.io.File[] r2 = r10.A0R()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = android.text.TextUtils.join(r4, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = X.C90474aD.A0g(r3)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.4yT r3 = new X.4yT     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.<init>(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x0823
        L_0x0a17:
            java.lang.String r2 = "/restore-messages/upload title for database is null"
            java.lang.IllegalStateException r3 = X.AnonymousClass001.A09(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x0823
        L_0x0a1f:
            X.6pW r8 = new X.6pW     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r8.<init>(r9, r6, r4)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.util.Iterator r12 = r18.iterator()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x0a28:
            boolean r2 = r12.hasNext()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0a8d
            java.lang.Object r4 = r12.next()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.6Pk r4 = (X.C131526Pk) r4     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            X.179 r2 = r6.A08     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r13 = r4.A06     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r5 = X.C34191gb.A06(r2, r13)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0a49
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/no local path for message store backup "
            goto L_0x0a7c
        L_0x0a49:
            java.io.File r3 = X.C90524aI.A0S(r5)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            boolean r2 = X.AnonymousClass6YN.A0B(r8, r11, r10, r4, r3)     // Catch:{ 4yT -> 0x0a82 }
            r7 = r7 & r2
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ 4yT -> 0x0a82 }
            java.lang.String r2 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/restore file succeeded "
            X.C90464aC.A1A(r3, r2, r4)     // Catch:{ 4yT -> 0x0a82 }
            java.lang.String r2 = " size: "
            r4.append(r2)     // Catch:{ 4yT -> 0x0a82 }
            long r2 = r3.length()     // Catch:{ 4yT -> 0x0a82 }
            X.C36351kA.A1S(r4, r2)     // Catch:{ 4yT -> 0x0a82 }
            goto L_0x0a28
        L_0x0a68:
            X.179 r12 = r6.A08     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r13 = r4.A06     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r3 = X.C34191gb.A06(r12, r13)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0aa4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restore-messages/no local path for message store backup "
        L_0x0a7c:
            java.lang.String r2 = X.AnonymousClass000.A0p(r2, r13, r3)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x07f8
        L_0x0a82:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/file-not-found "
            X.C90464aC.A1L(r2, r5, r3, r4)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            throw r4     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x0a8d:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/stage: restoring message store backup files finished with "
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r7 == 0) goto L_0x0a9b
            java.lang.String r2 = "success"
            goto L_0x0a9d
        L_0x0a9b:
            java.lang.String r2 = "failure"
        L_0x0a9d:
            X.C36321k7.A1a(r3, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r7 != 0) goto L_0x0b40
            goto L_0x0b3b
        L_0x0aa4:
            java.io.File r5 = X.C90524aI.A0S(r3)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            boolean r2 = r5.exists()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0b04
            long r17 = r5.length()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r15 = 0
            int r2 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0b04
            X.6Cl r2 = r4.A02     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0ae0
            java.lang.String r10 = r2.A03     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
        L_0x0abe:
            X.0yE r8 = r6.A09     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            long r2 = r5.length()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = X.C34191gb.A04(r12, r8, r5, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            boolean r2 = r10.equals(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0ae3
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restore-messages/file "
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.append(r5)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = " is same as remote file, no need to download"
            X.C36321k7.A1a(r3, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x0b40
        L_0x0ae0:
            java.lang.String r10 = r4.A03     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            goto L_0x0abe
        L_0x0ae3:
            java.lang.String r2 = "restore>RestoreAction/restore-messages/rotate-current-backup-file-to-preserve-it"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r3 = ""
            boolean r2 = r5.exists()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0b04
            java.util.Date r2 = new java.util.Date     // Catch:{ SecurityException -> 0x0b04 }
            r2.<init>()     // Catch:{ SecurityException -> 0x0b04 }
            java.lang.String r3 = X.AnonymousClass6UF.A00(r5, r3, r2)     // Catch:{ SecurityException -> 0x0b04 }
            java.io.File r2 = r5.getParentFile()     // Catch:{ SecurityException -> 0x0b04 }
            java.io.File r2 = X.C36441kJ.A0w(r2, r3)     // Catch:{ SecurityException -> 0x0b04 }
            r5.renameTo(r2)     // Catch:{ SecurityException -> 0x0b04 }
        L_0x0b04:
            X.4y6 r3 = new X.4y6     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r3.<init>(r9, r4, r6, r5)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "/restore-messages/download and save message store"
            java.lang.Object r4 = X.AnonymousClass6UR.A00(r3, r11, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            java.lang.String r2 = "restore>RestoreAction/restore-messages/stage: restoring messages finished with "
            r3.append(r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r4 == 0) goto L_0x0b25
            boolean r2 = r4.booleanValue()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0b25
            java.lang.String r2 = "success"
            goto L_0x0b27
        L_0x0b25:
            java.lang.String r2 = "failure"
        L_0x0b27:
            X.C36321k7.A1a(r3, r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r4 == 0) goto L_0x0b3a
            boolean r2 = r4.booleanValue()     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            if (r2 == 0) goto L_0x0b3a
            goto L_0x0b40
        L_0x0b33:
            java.lang.String r2 = "restore>RestoreAction/restore-messages/skipping google drive db download, we are using local"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 4yQ -> 0x0bef, 4yR -> 0x0bc1, 4yT -> 0x0ba7, 4yL -> 0x0b98, 4yJ -> 0x0b89, 4yP -> 0x0b7a, 4yO -> 0x0b6a, 4yH -> 0x0b5a, all -> 0x1232 }
            r7 = 1
            goto L_0x0b40
        L_0x0b3a:
            r7 = 0
        L_0x0b3b:
            X.6FS r3 = r6.A05     // Catch:{ 4yQ -> 0x0b57, 4yR -> 0x0b55, 4yT -> 0x0b53, 4yL -> 0x0b51, 4yJ -> 0x0b4f, 4yP -> 0x0b4d, 4yO -> 0x0b4b, 4yH -> 0x0b49 }
            r2 = 14
            goto L_0x0b44
        L_0x0b40:
            X.6FS r3 = r6.A05     // Catch:{ 4yQ -> 0x0b57, 4yR -> 0x0b55, 4yT -> 0x0b53, 4yL -> 0x0b51, 4yJ -> 0x0b4f, 4yP -> 0x0b4d, 4yO -> 0x0b4b, 4yH -> 0x0b49 }
            r2 = 10
        L_0x0b44:
            r3.A06(r2)     // Catch:{ 4yQ -> 0x0b57, 4yR -> 0x0b55, 4yT -> 0x0b53, 4yL -> 0x0b51, 4yJ -> 0x0b4f, 4yP -> 0x0b4d, 4yO -> 0x0b4b, 4yH -> 0x0b49 }
            goto L_0x0bfd
        L_0x0b49:
            r4 = move-exception
            goto L_0x0b5c
        L_0x0b4b:
            r4 = move-exception
            goto L_0x0b6c
        L_0x0b4d:
            r4 = move-exception
            goto L_0x0b7c
        L_0x0b4f:
            r4 = move-exception
            goto L_0x0b8b
        L_0x0b51:
            r4 = move-exception
            goto L_0x0b9a
        L_0x0b53:
            r5 = move-exception
            goto L_0x0ba9
        L_0x0b55:
            r3 = move-exception
            goto L_0x0bc3
        L_0x0b57:
            r4 = move-exception
            goto L_0x0bf1
        L_0x0b5a:
            r4 = move-exception
            r7 = 0
        L_0x0b5c:
            X.6FS r3 = r6.A05     // Catch:{ all -> 0x1235 }
            r2 = 25
            r3.A06(r2)     // Catch:{ all -> 0x1235 }
            java.lang.String r2 = "restore>RestoreAction/failure: google drive service is disabled"
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x1235 }
            goto L_0x0bfd
        L_0x0b6a:
            r4 = move-exception
            r7 = 0
        L_0x0b6c:
            X.6FS r3 = r6.A05     // Catch:{ all -> 0x1235 }
            r2 = 24
            r3.A06(r2)     // Catch:{ all -> 0x1235 }
            java.lang.String r2 = "restore>RestoreAction/failure: backup generated by a newer version of the app"
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x1235 }
            goto L_0x0bfd
        L_0x0b7a:
            r4 = move-exception
            r7 = 0
        L_0x0b7c:
            X.6FS r3 = r6.A05     // Catch:{ all -> 0x1235 }
            r2 = 23
            r3.A06(r2)     // Catch:{ all -> 0x1235 }
            java.lang.String r2 = "restore>RestoreAction/failure: access denied to external storage"
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x1235 }
            goto L_0x0bfd
        L_0x0b89:
            r4 = move-exception
            r7 = 0
        L_0x0b8b:
            X.6FS r3 = r6.A05     // Catch:{ all -> 0x1235 }
            r2 = 19
            r3.A06(r2)     // Catch:{ all -> 0x1235 }
            java.lang.String r2 = "restore>RestoreAction/failure: google servers' are not working"
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x1235 }
            goto L_0x0bfd
        L_0x0b98:
            r4 = move-exception
            r7 = 0
        L_0x0b9a:
            X.6FS r3 = r6.A05     // Catch:{ all -> 0x1235 }
            r2 = 15
            r3.A06(r2)     // Catch:{ all -> 0x1235 }
            java.lang.String r2 = "restore>RestoreAction/failure: local storage is full"
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x1235 }
            goto L_0x0bfd
        L_0x0ba7:
            r5 = move-exception
            r7 = 0
        L_0x0ba9:
            X.6FS r3 = r6.A05     // Catch:{ all -> 0x1235 }
            r2 = 17
            r3.A06(r2)     // Catch:{ all -> 0x1235 }
            java.lang.String r2 = "restore>RestoreAction/failure: backup file not found"
            com.whatsapp.util.Log.e(r2, r5)     // Catch:{ all -> 0x1235 }
            X.0wN r4 = r6.A01     // Catch:{ all -> 0x1235 }
            java.lang.String r3 = "/google drive msgstore backup file not found "
            java.lang.String r2 = r5.getMessage()     // Catch:{ all -> 0x1235 }
            r4.A0E(r3, r2, r1)     // Catch:{ all -> 0x1235 }
            goto L_0x0bfd
        L_0x0bc1:
            r3 = move-exception
            r7 = 0
        L_0x0bc3:
            java.lang.String r2 = "restore>RestoreAction/failure: auth failed because accessing google account permission is missing"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x1235 }
            java.lang.Throwable r2 = r3.getCause()     // Catch:{ all -> 0x1235 }
            if (r2 != 0) goto L_0x0bdb
            java.lang.String r2 = "restore>RestoreAction/failure: auth-failed/unknown-cause"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1235 }
            X.6FS r3 = r6.A05     // Catch:{ all -> 0x1235 }
            r2 = 11
            r3.A06(r2)     // Catch:{ all -> 0x1235 }
            goto L_0x0bfd
        L_0x0bdb:
            boolean r2 = r2 instanceof X.C03930Im     // Catch:{ all -> 0x1235 }
            if (r2 == 0) goto L_0x0be7
            X.6FS r3 = r6.A05     // Catch:{ all -> 0x1235 }
            r2 = 21
            r3.A06(r2)     // Catch:{ all -> 0x1235 }
            goto L_0x0bfd
        L_0x0be7:
            X.6FS r3 = r6.A05     // Catch:{ all -> 0x1235 }
            r2 = 11
            r3.A06(r2)     // Catch:{ all -> 0x1235 }
            goto L_0x0bfd
        L_0x0bef:
            r4 = move-exception
            r7 = 0
        L_0x0bf1:
            X.6FS r3 = r6.A05     // Catch:{ all -> 0x1235 }
            r2 = 12
            r3.A06(r2)     // Catch:{ all -> 0x1235 }
            java.lang.String r2 = "restore>RestoreAction/failure: account not present on device anymore"
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x1235 }
        L_0x0bfd:
            r9.A08(r7)     // Catch:{ all -> 0x123a }
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x123a }
            java.lang.String r8 = "total wall time for message restore: %.1f seconds."
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x123a }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x123a }
            r4 = r20
            r3 = r23
            long r3 = r3.A0V(r4)     // Catch:{ all -> 0x123a }
            long r1 = r1 - r3
            X.C90494aF.A1S(r5, r1)     // Catch:{ all -> 0x123a }
            X.C90494aF.A1J(r8, r9, r5)     // Catch:{ all -> 0x123a }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x123a }
            java.lang.String r1 = "restore>RestoreAction/finished with success status: "
            X.C36321k7.A1X(r1, r2, r7)     // Catch:{ all -> 0x123a }
            java.util.Map r4 = r6.A00     // Catch:{ all -> 0x123a }
            r1 = r24
            r1.getAndSet(r14)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r19)
            X.6Xi r3 = r6.A07
            X.782 r1 = r3.A06
            int r2 = r1.A00
            java.util.concurrent.atomic.AtomicInteger r1 = r3.A0A
            goto L_0x0c45
        L_0x0c36:
            r1 = r24
            r1.getAndSet(r5)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r19)
            X.782 r1 = r10.A06
            int r2 = r1.A00
            java.util.concurrent.atomic.AtomicInteger r1 = r10.A0A
        L_0x0c45:
            int r1 = r1.get()
            int r2 = r2 + r1
            X.C36321k7.A1Y(r5, r2)
            goto L_0x0782
        L_0x0c4f:
            java.lang.String r3 = "action_backup"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = "only_if_pending"
            r4 = 0
            boolean r11 = r2.getBooleanExtra(r3, r4)
            java.lang.String r2 = "gdrive-service/handle-intent/backup"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            long r8 = java.lang.System.currentTimeMillis()
            X.0v0 r2 = r0.A0J
            long r2 = r2.A0T(r5)
            long r8 = r8 - r2
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            boolean r6 = X.AnonymousClass000.A1R(r2)
            if (r11 == 0) goto L_0x0c83
            X.0v0 r3 = r0.A0J
            java.util.concurrent.Executor r2 = X.AnonymousClass6Y6.A00
            int r2 = r3.A0F()
            if (r2 != r1) goto L_0x0e08
        L_0x0c83:
            if (r10 != 0) goto L_0x0c87
            if (r6 == 0) goto L_0x0e08
        L_0x0c87:
            X.13I r2 = r0.A0V
            boolean r2 = r2.A00
            if (r2 == 0) goto L_0x0c91
            java.lang.String r1 = "gdrive-service/handle-intent/backup WhatsApp Login has failed, google drive backup aborted"
            goto L_0x10a0
        L_0x0c91:
            X.0yE r2 = r0.A0I
            boolean r2 = r2.A0H()
            if (r2 == 0) goto L_0x0ca7
            java.lang.String r1 = "gdrive-service/handle-intent/backup/read-storage-permission-denied/aborting-backup"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.6FS r2 = r0.A08
            r1 = 23
        L_0x0ca2:
            r2.A06(r1)
            goto L_0x1178
        L_0x0ca7:
            X.0v0 r2 = r0.A0J
            boolean r2 = X.AnonymousClass6Y6.A05(r2)
            if (r2 == 0) goto L_0x0cb3
            java.lang.String r1 = "gdrive-service/handle-intent/backup cannot start backup, media restore in pending"
            goto L_0x10a0
        L_0x0cb3:
            X.1ei r2 = r0.A07
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.A0Q
            boolean r2 = r2.getAndSet(r1)
            if (r2 == 0) goto L_0x0cc1
            java.lang.String r1 = "gdrive-service/handle-intent/backup another backup is already running."
            goto L_0x10a0
        L_0x0cc1:
            X.0v0 r2 = r0.A0J
            int r2 = r2.A0E()
            r3 = 10
            if (r2 == r3) goto L_0x0cd0
            X.6FS r2 = r0.A08
            r2.A06(r3)
        L_0x0cd0:
            X.0z9 r2 = r0.A0Y
            java.lang.String r11 = "gdrive_backup"
            r2.A01(r11, r1)
            X.1ei r2 = r0.A07     // Catch:{ all -> 0x1258 }
            r2.A03()     // Catch:{ all -> 0x1258 }
            java.lang.String r40 = r0.A00()     // Catch:{ all -> 0x1258 }
            if (r40 != 0) goto L_0x0cf8
            java.lang.String r1 = "gdrive-service/handle-intent/backup jid is null."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x1258 }
            X.1ei r1 = r0.A07
            r1.A07()
            X.0z9 r1 = r0.A0Y
            r1.A01(r11, r4)
            X.6FS r1 = r0.A08
            r1.A05()
            goto L_0x1178
        L_0x0cf8:
            boolean r2 = r0.A0e     // Catch:{ all -> 0x1258 }
            if (r2 != 0) goto L_0x0d09
            java.util.ArrayList r3 = r0.A0g     // Catch:{ all -> 0x1258 }
            X.0y0 r2 = r0.A01     // Catch:{ all -> 0x1258 }
            java.util.ArrayList r2 = X.AnonymousClass6Y6.A02(r2)     // Catch:{ all -> 0x1258 }
            r3.addAll(r2)     // Catch:{ all -> 0x1258 }
            r0.A0e = r1     // Catch:{ all -> 0x1258 }
        L_0x0d09:
            X.0wG r2 = r0.A0H     // Catch:{ all -> 0x1258 }
            r29 = r2
            X.0wo r2 = r0.A0G     // Catch:{ all -> 0x1258 }
            r28 = r2
            X.0yC r9 = r0.A0R     // Catch:{ all -> 0x1258 }
            X.0y0 r8 = r0.A01     // Catch:{ all -> 0x1258 }
            X.0yW r2 = r0.A0S     // Catch:{ all -> 0x1258 }
            r35 = r2
            X.179 r2 = r0.A0D     // Catch:{ all -> 0x1258 }
            r26 = r2
            X.19A r2 = r0.A0U     // Catch:{ all -> 0x1258 }
            r37 = r2
            X.0zS r2 = r0.A0Z     // Catch:{ all -> 0x1258 }
            r38 = r2
            X.1Ck r2 = r0.A05     // Catch:{ all -> 0x1258 }
            r47 = r2
            X.0v0 r2 = r0.A0J     // Catch:{ all -> 0x1258 }
            X.67v r7 = new X.67v     // Catch:{ all -> 0x1258 }
            r7.<init>(r8, r2, r9)     // Catch:{ all -> 0x1258 }
            X.1Cb r2 = r0.A0E     // Catch:{ all -> 0x1258 }
            r27 = r2
            X.1Q9 r2 = r0.A0M     // Catch:{ all -> 0x1258 }
            r32 = r2
            X.12P r2 = r0.A0O     // Catch:{ all -> 0x1258 }
            r33 = r2
            X.6Ns r2 = r0.A0C     // Catch:{ all -> 0x1258 }
            r22 = r2
            X.0yE r2 = r0.A0I     // Catch:{ all -> 0x1258 }
            r30 = r2
            X.0v0 r2 = r0.A0J     // Catch:{ all -> 0x1258 }
            r31 = r2
            X.005 r2 = r0.A0a     // Catch:{ all -> 0x1258 }
            r39 = r2
            X.1Cn r2 = r0.A04     // Catch:{ all -> 0x1258 }
            r46 = r2
            X.3S1 r2 = r0.A06     // Catch:{ all -> 0x1258 }
            r45 = r2
            X.1ei r2 = r0.A07     // Catch:{ all -> 0x1258 }
            r19 = r2
            java.util.ArrayList r2 = r0.A0g     // Catch:{ all -> 0x1258 }
            r18 = r2
            X.1eq r3 = r0.A0A     // Catch:{ all -> 0x1258 }
            java.util.concurrent.atomic.AtomicLong r2 = r3.A07     // Catch:{ all -> 0x1258 }
            r17 = r2
            java.util.concurrent.atomic.AtomicLong r15 = r3.A06     // Catch:{ all -> 0x1258 }
            X.6FS r3 = r0.A08     // Catch:{ all -> 0x1258 }
            java.lang.String r2 = "backup"
            X.6Xi r24 = r3.A01(r5, r2)     // Catch:{ all -> 0x1258 }
            X.6FS r13 = r0.A08     // Catch:{ all -> 0x1258 }
            X.1ei r3 = r0.A07     // Catch:{ all -> 0x1258 }
            X.1eq r2 = r0.A0A     // Catch:{ all -> 0x1258 }
            X.4yB r6 = new X.4yB     // Catch:{ all -> 0x1258 }
            r6.<init>(r3, r13, r2)     // Catch:{ all -> 0x1258 }
            X.1ek r14 = r0.A09     // Catch:{ all -> 0x1258 }
            java.lang.Object r12 = r13.A0B     // Catch:{ all -> 0x1258 }
            monitor-enter(r12)     // Catch:{ all -> 0x1258 }
            X.58y r4 = new X.58y     // Catch:{ all -> 0x1255 }
            r4.<init>()     // Catch:{ all -> 0x1255 }
            r13.A01 = r4     // Catch:{ all -> 0x1255 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1255 }
            r4.A0X = r2     // Catch:{ all -> 0x1255 }
            X.0v0 r3 = r13.A09     // Catch:{ all -> 0x1255 }
            int r2 = X.AnonymousClass6Y6.A00(r3, r10)     // Catch:{ all -> 0x1255 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1255 }
            r4.A0Y = r2     // Catch:{ all -> 0x1255 }
            X.58y r2 = r13.A01     // Catch:{ all -> 0x1255 }
            int r3 = r3.A0D()     // Catch:{ all -> 0x1255 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x1255 }
            r2.A0U = r3     // Catch:{ all -> 0x1255 }
            X.58y r4 = r13.A01     // Catch:{ all -> 0x1255 }
            monitor-exit(r12)     // Catch:{ all -> 0x1255 }
            X.0yC r3 = r0.A0R     // Catch:{ all -> 0x1258 }
            X.13R r2 = r0.A0P     // Catch:{ all -> 0x1258 }
            X.6Uy r16 = X.C132716Uy.A00(r2, r3)     // Catch:{ all -> 0x1258 }
            r3 = 0
            X.7rE r2 = new X.7rE     // Catch:{ all -> 0x1258 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x1258 }
            X.6VL r13 = new X.6VL     // Catch:{ all -> 0x1258 }
            r20 = r14
            r21 = r7
            r23 = r6
            r25 = r2
            r34 = r9
            r36 = r4
            r41 = r18
            r42 = r17
            r43 = r15
            r44 = r10
            r14 = r8
            r15 = r46
            r17 = r47
            r18 = r45
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x1258 }
            boolean r4 = r13.A05()     // Catch:{ all -> 0x1258 }
            X.1ei r2 = r0.A07
            r2.A07()
            X.0z9 r2 = r0.A0Y
            r2.A01(r11, r3)
            X.6FS r2 = r0.A08
            r2.A05()
            if (r4 == 0) goto L_0x1178
            X.1Ck r2 = r0.A05
            X.0v0 r2 = r2.A03
            boolean r2 = r2.A2I()
            if (r2 == 0) goto L_0x1178
            X.0v0 r2 = r0.A0J
            int r2 = r2.A0N(r5)
            if (r2 != r1) goto L_0x1178
            X.0zS r5 = r0.A0Z
            java.util.Random r4 = r0.A0c
            X.0v0 r3 = r0.A0J
            r2 = r10 ^ 1
            java.lang.Integer r1 = X.C023109s.A01
            com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A02(r3, r5, r1, r4, r2)
            goto L_0x1178
        L_0x0e08:
            java.lang.String r1 = "gdrive-service/handle-intent/backup automated backup called too early, ignored"
            goto L_0x1158
        L_0x0e0c:
            if (r9 == 0) goto L_0x002f
            java.lang.String r3 = "success"
            java.lang.String r12 = "failed"
            java.lang.String r7 = "gdrive-service/handle-intent"
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.A0h
            boolean r1 = r6.getAndSet(r1)
            if (r1 == 0) goto L_0x0e20
            java.lang.String r1 = "gdrive-service/handle-intent another deletion is already running."
            goto L_0x10a0
        L_0x0e20:
            r4 = 0
            java.lang.String r1 = "jid_user"
            java.lang.String r10 = r2.getStringExtra(r1)     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            if (r10 != 0) goto L_0x0e2f
            java.lang.String r1 = "gdrive-service/handle-intent DELETE called with no number."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            goto L_0x0ea1
        L_0x0e2f:
            X.6FS r1 = r0.A08     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            X.6Xi r11 = r1.A01(r5, r8)     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            X.1ei r1 = r0.A07     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            X.1el r2 = r1.A0I     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            r1 = 1
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            r9 = 14
            boolean r1 = X.AnonymousClass6YN.A0C(r2, r11, r9)     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            r5 = 0
            if (r1 != 0) goto L_0x0e4c
            java.lang.String r1 = "gdrive-service/delete-backup/failed-to-fetch-auth-token"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            goto L_0x0e66
        L_0x0e4c:
            X.1ei r1 = r0.A07     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            X.1el r8 = r1.A0I     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            X.4xv r2 = new X.4xv     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            r2.<init>(r0, r11, r10)     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            java.lang.String r1 = "gdrive-service/delete-backup"
            java.lang.Object r1 = X.AnonymousClass6UR.A01(r2, r8, r1, r9)     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            if (r1 == 0) goto L_0x0e66
            boolean r1 = r1.booleanValue()     // Catch:{ 4yQ -> 0x0e8f, 4yR -> 0x0e88, 4yJ -> 0x0e81, 4yH -> 0x0e7e, all -> 0x126c }
            if (r1 == 0) goto L_0x0e66
            r5 = 1
        L_0x0e66:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x0e7c, 4yR -> 0x0e7a, 4yJ -> 0x0e78, 4yH -> 0x0e76 }
            java.lang.String r1 = "gdrive-service/handle-intent/delete-all-files/"
            r2.append(r1)     // Catch:{ 4yQ -> 0x0e7c, 4yR -> 0x0e7a, 4yJ -> 0x0e78, 4yH -> 0x0e76 }
            if (r5 != 0) goto L_0x0e72
            r3 = r12
        L_0x0e72:
            X.C36321k7.A1a(r2, r3)     // Catch:{ 4yQ -> 0x0e7c, 4yR -> 0x0e7a, 4yJ -> 0x0e78, 4yH -> 0x0e76 }
            goto L_0x0ea2
        L_0x0e76:
            r3 = move-exception
            goto L_0x0e96
        L_0x0e78:
            r3 = move-exception
            goto L_0x0e83
        L_0x0e7a:
            r3 = move-exception
            goto L_0x0e8a
        L_0x0e7c:
            r3 = move-exception
            goto L_0x0e91
        L_0x0e7e:
            r3 = move-exception
            r5 = 0
            goto L_0x0e96
        L_0x0e81:
            r3 = move-exception
            r5 = 0
        L_0x0e83:
            X.6FS r2 = r0.A08     // Catch:{ all -> 0x126a }
            r1 = 19
            goto L_0x0e9a
        L_0x0e88:
            r3 = move-exception
            r5 = 0
        L_0x0e8a:
            X.6FS r2 = r0.A08     // Catch:{ all -> 0x126a }
            r1 = 11
            goto L_0x0e9a
        L_0x0e8f:
            r3 = move-exception
            r5 = 0
        L_0x0e91:
            X.6FS r2 = r0.A08     // Catch:{ all -> 0x126a }
            r1 = 12
            goto L_0x0e9a
        L_0x0e96:
            X.6FS r2 = r0.A08     // Catch:{ all -> 0x126a }
            r1 = 25
        L_0x0e9a:
            r2.A06(r1)     // Catch:{ all -> 0x126a }
            com.whatsapp.util.Log.e(r7, r3)     // Catch:{ all -> 0x126a }
            goto L_0x0ea2
        L_0x0ea1:
            r5 = 0
        L_0x0ea2:
            r6.set(r4)
            X.1ek r1 = r0.A09
            r1.A06(r5)
            goto L_0x1178
        L_0x0eac:
            java.lang.String r1 = "action_fetch_backup_info"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x002f
            android.os.Bundle r1 = r2.getExtras()
            X.C18740tg.A06(r1)
            java.lang.String r5 = r1.getString(r6)
            if (r5 != 0) goto L_0x0ec5
            java.lang.String r1 = "gdrive-service/handle-intent/ action action_fetch_backup_info called without account_name"
            goto L_0x10a0
        L_0x0ec5:
            X.C18740tg.A00()     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.0v0 r1 = r0.A0J     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            android.content.SharedPreferences r3 = X.C36341k9.A0E(r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            java.lang.String r1 = "gdrive_last_successful_backup_timestamp:"
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r5, r2)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            boolean r1 = r3.contains(r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            r4 = 0
            if (r1 != 0) goto L_0x1178
            X.6FS r1 = r0.A08     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.6Xi r6 = r1.A01(r5, r8)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.1ei r1 = r0.A07     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.1el r2 = r1.A0I     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            r1 = 1
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            r1 = 14
            boolean r1 = X.AnonymousClass6YN.A0C(r2, r6, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            if (r1 != 0) goto L_0x0f00
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2/auth-failed/"
            X.C90464aC.A1I(r1, r5, r2)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            goto L_0x1178
        L_0x0f00:
            java.lang.String r3 = r0.A00()     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            if (r3 == 0) goto L_0x1178
            X.1ei r1 = r0.A07     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.1el r2 = r1.A0I     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2"
            X.6Te r6 = X.AnonymousClass6YN.A01(r2, r6, r3, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            if (r6 != 0) goto L_0x0f2c
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2/no backup found/"
            r2.append(r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            r2.append(r3)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            java.lang.String r1 = "/"
            X.C90464aC.A1I(r1, r5, r2)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.0v0 r3 = r0.A0J     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            r1 = 0
            r3.A1e(r5, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            goto L_0x1178
        L_0x0f2c:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2/setting-backup-data-for "
            X.C90474aD.A1J(r1, r5, r2)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            java.lang.String r1 = " data: "
            X.C36321k7.A1K(r6, r1, r2)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.0v0 r3 = r0.A0J     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            long r1 = r6.A05     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            r3.A1e(r5, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.0v0 r3 = r0.A0J     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            long r1 = r6.A04     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            r3.A1f(r5, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.0v0 r3 = r0.A0J     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            java.lang.String r1 = "mediaSize"
            long r1 = X.C132346Te.A00(r6, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            r3.A1d(r5, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.0v0 r3 = r0.A0J     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            java.lang.String r1 = "videoSize"
            long r1 = X.C132346Te.A00(r6, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            r3.A1g(r5, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.0v0 r3 = r0.A0J     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            org.json.JSONObject r2 = r6.A0B     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            r1 = 0
            if (r2 == 0) goto L_0x0f6b
            java.lang.String r1 = "encryptedBackupEnabled"
            boolean r1 = r2.optBoolean(r1, r4)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
        L_0x0f6b:
            r3.A1o(r5, r1)     // Catch:{ 4yH | 4yJ | 4yQ | 4yR -> 0x0f84 }
            X.1ek r1 = r0.A09
            java.util.Iterator r2 = X.C36361kB.A0s(r1)
        L_0x0f74:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x1178
            java.lang.Object r1 = r2.next()
            X.1eo r1 = (X.C33151eo) r1
            r1.Bjt()
            goto L_0x0f74
        L_0x0f84:
            r2 = move-exception
            java.lang.String r1 = "gdrive-service/handle-intent/action_fetch_backup_info"
            goto L_0x1083
        L_0x0f89:
            java.lang.String r1 = "action_remove_backup_info"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x002f
            android.os.Bundle r1 = r2.getExtras()
            X.C18740tg.A06(r1)
            java.lang.String r5 = r1.getString(r6)
            if (r5 != 0) goto L_0x0fa2
            java.lang.String r1 = "gdrive-service/handle-intent/ action action_remove_backup_info called without account_name"
            goto L_0x10a0
        L_0x0fa2:
            X.0v0 r1 = r0.A0J
            android.content.SharedPreferences$Editor r4 = X.C19420v0.A00(r1)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "gdrive_last_successful_backup_timestamp:"
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r5, r3)
            android.content.SharedPreferences$Editor r4 = r4.remove(r1)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "gdrive_last_successful_backup_total_size:"
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r5, r3)
            android.content.SharedPreferences$Editor r4 = r4.remove(r1)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "gdrive_last_successful_backup_media_size:"
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r5, r3)
            android.content.SharedPreferences$Editor r4 = r4.remove(r1)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "gdrive_last_successful_backup_video_size:"
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r5, r3)
            android.content.SharedPreferences$Editor r4 = r4.remove(r1)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "gdrive_last_successful_backup_encrypted:"
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r5, r3)
            X.C36341k9.A0u(r4, r1)
            X.0v0 r1 = r0.A0J
            java.lang.String r1 = r1.A0c()
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x100a
            android.os.Bundle r2 = r2.getExtras()
            java.lang.String r1 = "remove_account_name"
            boolean r1 = r2.getBoolean(r1)
            if (r1 == 0) goto L_0x100a
            X.0v0 r1 = r0.A0J
            r1.A1R(r8)
        L_0x100a:
            X.1ek r1 = r0.A09
            java.util.Iterator r2 = X.C36361kB.A0s(r1)
        L_0x1010:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x1178
            java.lang.Object r1 = r2.next()
            X.1eo r1 = (X.C33151eo) r1
            r1.Bjt()
            goto L_0x1010
        L_0x1020:
            java.lang.String r1 = "action_list"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x002f
            X.6FS r1 = r0.A08
            X.6Xi r5 = r1.A01(r5, r8)
            boolean r1 = r5.A0C()     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            if (r1 != 0) goto L_0x103b
            java.lang.String r1 = "gdrive-service/v2/list-files failed to make auth"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            goto L_0x1178
        L_0x103b:
            java.lang.String r3 = r0.A00()     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            if (r3 != 0) goto L_0x1048
            java.lang.String r1 = "gdrive-service/v2/list-files no jid"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            goto L_0x1178
        L_0x1048:
            X.6Te r4 = r5.A07(r3)     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            if (r4 != 0) goto L_0x1059
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            java.lang.String r1 = "gdrive-service/v2/list-files no backup for "
            X.C36321k7.A1P(r1, r3, r2)     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            goto L_0x1178
        L_0x1059:
            r3 = r8
        L_0x105a:
            java.lang.String r2 = r4.A0A     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            r1 = 1000(0x3e8, float:1.401E-42)
            android.util.Pair r1 = r5.A06(r2, r3, r8, r1)     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            if (r1 == 0) goto L_0x1178
            java.lang.Object r3 = r1.second     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            java.lang.Object r1 = r1.first     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            java.util.Iterator r2 = X.C90514aH.A13(r1)     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
        L_0x106e:
            boolean r1 = r2.hasNext()     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            if (r1 == 0) goto L_0x1078
            r2.next()     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            goto L_0x106e
        L_0x1078:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 4yF | 4yH | 4yQ | 4yR | 4yS -> 0x1080 }
            if (r1 == 0) goto L_0x105a
            goto L_0x1178
        L_0x1080:
            r2 = move-exception
            java.lang.String r1 = "gdrive-service/v2/list-files failed"
        L_0x1083:
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x1178
        L_0x1088:
            java.lang.String r1 = "action_change_number"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = "old_phone_number"
            java.lang.String r7 = r2.getStringExtra(r1)
            java.lang.String r1 = "new_phone_number"
            java.lang.String r6 = r2.getStringExtra(r1)
            if (r7 != 0) goto L_0x10a5
            java.lang.String r1 = "gdrive-service/handle-intent change number requested but old phone number was not passed in the request."
        L_0x10a0:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x1178
        L_0x10a5:
            if (r6 != 0) goto L_0x10aa
            java.lang.String r1 = "gdrive-service/handle-intent change number requested but new phone number was not passed in the request."
            goto L_0x10a0
        L_0x10aa:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "gdrive-service/handle-intent about to change number from "
            r2.append(r1)
            r2.append(r7)
            java.lang.String r4 = " to "
            X.C36321k7.A1Q(r4, r6, r2)
            java.lang.String r9 = "gdrive-service/change-number-v2"
            r11 = 19
            r10 = 11
            r12 = 0
            X.6FS r1 = r0.A08     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            X.6Xi r3 = r1.A01(r5, r8)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            X.1ei r1 = r0.A07     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            X.1el r2 = r1.A0I     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            r1 = 1
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            r5 = 14
            boolean r1 = X.AnonymousClass6YN.A0C(r2, r3, r5)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            if (r1 != 0) goto L_0x10e3
            java.lang.String r1 = "gdrive-service/change-number/failed-to-fetch-auth-token"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            X.6FS r1 = r0.A08     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            r1.A06(r10)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            goto L_0x1144
        L_0x10e3:
            X.1ei r1 = r0.A07     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            X.1el r1 = r1.A0I     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            X.6Te r3 = X.AnonymousClass6YN.A01(r1, r3, r7, r9)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            if (r3 != 0) goto L_0x10ff
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            java.lang.String r1 = "gdrive-service/change-number-v2 fetching backup name "
            r2.append(r1)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            r2.append(r7)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            java.lang.String r1 = " returned null, unexpected."
            X.C36321k7.A1Z(r2, r1)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            goto L_0x1144
        L_0x10ff:
            X.1ei r1 = r0.A07     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            X.1el r2 = r1.A0I     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            X.4y3 r1 = new X.4y3     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            r1.<init>(r0, r3, r6, r7)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            java.lang.Object r1 = X.AnonymousClass6UR.A01(r1, r2, r9, r5)     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            if (r1 == 0) goto L_0x1144
            boolean r1 = r1.booleanValue()     // Catch:{ 4yQ -> 0x1137, 4yR -> 0x1124, 4yG | 4yJ -> 0x111d, 4yT -> 0x1117, 4yH -> 0x112b }
            if (r1 == 0) goto L_0x1144
            goto L_0x1143
        L_0x1117:
            r3 = move-exception
            X.6FS r2 = r0.A08
            r1 = 17
            goto L_0x1130
        L_0x111d:
            r3 = move-exception
            X.6FS r1 = r0.A08
            r1.A06(r11)
            goto L_0x1133
        L_0x1124:
            r3 = move-exception
            X.6FS r1 = r0.A08
            r1.A06(r10)
            goto L_0x1133
        L_0x112b:
            r3 = move-exception
            X.6FS r2 = r0.A08
            r1 = 25
        L_0x1130:
            r2.A06(r1)
        L_0x1133:
            com.whatsapp.util.Log.e(r9, r3)
            goto L_0x1144
        L_0x1137:
            r3 = move-exception
            X.6FS r2 = r0.A08
            r1 = 12
            r2.A06(r1)
            com.whatsapp.util.Log.e((java.lang.Throwable) r3)
            goto L_0x1144
        L_0x1143:
            r12 = 1
        L_0x1144:
            java.lang.String r1 = "gdrive-service/handle-intent change number (from old number "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            X.AnonymousClass000.A1D(r1, r7, r4, r2)
            if (r12 == 0) goto L_0x121a
            r2.append(r6)
            java.lang.String r1 = ") succeeded."
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r2)
        L_0x1158:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x1178
        L_0x115c:
            X.1ei r3 = r0.A07
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.A0X
            r3.set(r1)
            X.0wG r3 = r0.A0H
            android.content.Context r3 = r3.A00
            boolean r3 = X.C34191gb.A08(r3)
            r7 = 0
            if (r3 != 0) goto L_0x117d
            X.1ei r1 = r0.A07
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0X
            r1.set(r7)
        L_0x1176:
            if (r52 == 0) goto L_0x1289
        L_0x1178:
            java.lang.Object r3 = r0.A0j
            monitor-enter(r3)
            goto L_0x1277
        L_0x117d:
            X.1ei r3 = r0.A07
            r3.A06()
            X.1ei r3 = r0.A07
            r3.A05()
            X.1ei r3 = r0.A07
            r3.A08()
            java.lang.String r3 = "backup_mode"
            java.lang.String r5 = r2.getStringExtra(r3)
            java.lang.String r3 = "user_initiated"
            boolean r10 = r3.equals(r5)
            X.0v0 r3 = r0.A0J
            if (r10 == 0) goto L_0x11a9
            android.content.SharedPreferences$Editor r5 = X.C19420v0.A00(r3)
            java.lang.String r3 = "gdrive_user_initiated_backup"
            X.C36331k8.A0w(r5, r3, r1)
        L_0x11a5:
            X.1ep r3 = r0.A0B
            monitor-enter(r3)
            goto L_0x11b4
        L_0x11a9:
            android.content.SharedPreferences r5 = X.C36341k9.A0E(r3)
            java.lang.String r3 = "gdrive_user_initiated_backup"
            boolean r10 = r5.getBoolean(r3, r7)
            goto L_0x11a5
        L_0x11b4:
            r3.A02 = r10     // Catch:{ all -> 0x128a }
            monitor-exit(r3)
            java.lang.String r3 = "action_delete"
            boolean r9 = r4.equals(r3)
            java.lang.String r6 = "account_name"
            if (r9 == 0) goto L_0x11d8
            java.lang.String r5 = r2.getStringExtra(r6)
        L_0x11c5:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x001f
            if (r9 == 0) goto L_0x11df
            java.lang.String r2 = "gdrive-service/handle-intent accountName is null or empty => user has never configured Google Drive backup and is now deleting WhatsApp account, nothing to delete."
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.1ek r2 = r0.A09
            r2.A06(r1)
            goto L_0x1178
        L_0x11d8:
            X.0v0 r3 = r0.A0J
            java.lang.String r5 = r3.A0c()
            goto L_0x11c5
        L_0x11df:
            X.0v0 r1 = r0.A0J
            int r4 = r1.A0F()
            java.lang.String r1 = "gdrive-service/handle-intent "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r1)
            if (r4 == 0) goto L_0x120f
            r3.append(r2)
            java.lang.String r1 = " accountName is null or empty, cannot proceed further also, change google drive state from "
            r3.append(r1)
            X.0v0 r1 = r0.A0J
            int r1 = r1.A0F()
            r3.append(r1)
            java.lang.String r1 = " to clean_state"
            X.C36321k7.A1Z(r3, r1)
            X.0v0 r1 = r0.A0J
            r1.A1A(r7)
            X.1ep r1 = r0.A0B
            r1.A04()
            goto L_0x1178
        L_0x120f:
            r3.append(r2)
            java.lang.String r1 = " accountName is null or empty, cannot proceed further."
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r3)
            goto L_0x10a0
        L_0x121a:
            r2.append(r6)
            java.lang.String r1 = ") failed."
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r2)
            goto L_0x10a0
        L_0x1225:
            r7 = move-exception
            X.0yW r0 = r4.A0D
            r0.Bly(r5)
            r1 = 0
            r0 = r48
            r0.getAndSet(r1)
            throw r7
        L_0x1232:
            r0 = move-exception
            r7 = 0
            goto L_0x1236
        L_0x1235:
            r0 = move-exception
        L_0x1236:
            r9.A08(r7)     // Catch:{ all -> 0x123a }
            throw r0     // Catch:{ all -> 0x123a }
        L_0x123a:
            r7 = move-exception
            r0 = r24
            r0.getAndSet(r14)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r19)
            X.6Xi r2 = r6.A07
            X.782 r0 = r2.A06
            int r1 = r0.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0A
            int r0 = r0.get()
            int r1 = r1 + r0
            X.C36321k7.A1Y(r3, r1)
            throw r7
        L_0x1255:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x1255 }
            throw r1     // Catch:{ all -> 0x1258 }
        L_0x1258:
            r3 = move-exception
            r2 = 0
            X.1ei r1 = r0.A07
            r1.A07()
            X.0z9 r1 = r0.A0Y
            r1.A01(r11, r2)
            X.6FS r0 = r0.A08
            r0.A05()
            throw r3
        L_0x126a:
            r1 = move-exception
            goto L_0x126e
        L_0x126c:
            r1 = move-exception
            r5 = 0
        L_0x126e:
            r6.set(r4)
            X.1ek r0 = r0.A09
            r0.A06(r5)
            throw r1
        L_0x1277:
            int r2 = r0.A0f     // Catch:{ all -> 0x1286 }
            if (r2 <= 0) goto L_0x1284
            r1 = 1
            int r2 = r2 - r1
            r0.A0f = r2     // Catch:{ all -> 0x1286 }
            if (r2 != 0) goto L_0x1284
            r0.stopForeground(r1)     // Catch:{ all -> 0x1286 }
        L_0x1284:
            monitor-exit(r3)     // Catch:{ all -> 0x1286 }
            return
        L_0x1286:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x1286 }
            throw r0
        L_0x1289:
            return
        L_0x128a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.onHandleIntent(android.content.Intent):void");
    }

    public GoogleBackupService() {
        super(GoogleBackupService.class.getCanonicalName());
    }

    private String A00() {
        C19730wQ r0 = this.A03;
        r0.A0G();
        Me me = r0.A00;
        if (me == null) {
            Log.i("gdrive-service/my-jid/me is null, can't proceed");
            return null;
        }
        String str = me.jabber_id;
        if (str != null) {
            return str;
        }
        Log.e("gdrive-service/my-jid/jidUser is null, fatal error.");
        return null;
    }

    public void A04() {
        if (!this.A0d) {
            this.A0d = true;
            this.A0c = AnonymousClass1WC.A00();
            C18800tq r1 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            this.A0G = C36351kA.A0V(r1);
            this.A0R = C36341k9.A0V(r1);
            this.A02 = C36351kA.A0M(r1);
            this.A00 = C36391kE.A0V(r1);
            this.A03 = C36351kA.A0N(r1);
            this.A0H = C36351kA.A0W(r1);
            this.A01 = (C20690y0) r1.A6r.get();
            this.A0S = C36351kA.A0g(r1);
            this.A0D = (AnonymousClass179) r1.A3D.get();
            this.A0V = (AnonymousClass13I) r1.A4a.get();
            this.A0U = C36361kB.A0c(r1);
            this.A0F = C36351kA.A0U(r1);
            this.A0T = r1.AFK();
            this.A0Z = (C21570zS) r1.A9Z.get();
            this.A05 = (C24431Ck) r1.A2z.get();
            C18830tt r2 = r1.A00;
            this.A0X = (AnonymousClass3T0) r2.A4L.get();
            this.A0E = C36431kI.A0a(r1);
            this.A0P = (AnonymousClass13R) r1.A5P.get();
            this.A0L = (AnonymousClass1DF) r1.A4m.get();
            this.A0W = (AnonymousClass1QC) r1.AR8.get();
            this.A0M = (AnonymousClass1Q9) r1.A5D.get();
            this.A08 = (AnonymousClass6FS) r1.A3g.get();
            this.A0O = (AnonymousClass12P) r1.A5G.get();
            this.A0C = (C131096Ns) r1.A7N.get();
            this.A0I = C36351kA.A0X(r1);
            this.A0J = C36351kA.A0Y(r1);
            this.A0K = (AnonymousClass1DG) r1.AQr.get();
            this.A0Y = (C21380z9) r1.A4b.get();
            this.A04 = (C24461Cn) r1.A0c.get();
            this.A06 = (AnonymousClass3S1) r2.A0J.get();
            this.A0N = (C220612s) r1.A5F.get();
            this.A07 = (C33101ei) r1.A3f.get();
            this.A09 = (C33121ek) r1.A3h.get();
            this.A0B = (C33161ep) r1.A3j.get();
            this.A0A = (C33171eq) r1.A3i.get();
            this.A0Q = (C21520zN) r1.A01.get();
            this.A0a = C18840tu.A00(r1.A7g);
        }
    }

    public void onCreate() {
        A04();
        super.onCreate();
        this.A0B.A05();
    }

    public void onDestroy() {
        super.onDestroy();
        C33121ek r1 = this.A09;
        r1.A00 = -1;
        r1.A01 = -1;
        C33171eq r3 = this.A0A;
        r3.A06.set(0);
        r3.A05.set(0);
        r3.A04.set(0);
        r3.A07.set(0);
        r3.A03.set(0);
        this.A0B.A06();
        try {
            Iterator A13 = C90514aH.A13(C90514aH.A0V(this.A0Z).A04("com.whatsapp.backup.google.google-backup-worker").get());
            while (true) {
                if (A13.hasNext()) {
                    if (((AnonymousClass6DP) A13.next()).A00 == C023109s.A01) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        this.A08.A03();
        AnonymousClass6UR.A02();
        this.A07.A07();
        this.A07.A0X.set(false);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Notification notification;
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (intent == null) {
            return onStartCommand;
        }
        synchronized (this.A0j) {
            C34091gR.A00(this.A0H.A00, this.A0F);
            Notification A032 = this.A0B.A03(C36421kH.A0B(this.A0H), intent.getAction());
            if (!(this.A0f == 0 || (notification = this.A0B.A0S) == null)) {
                A032 = notification;
            }
            this.A0B.A04();
            try {
                startForeground(5, A032);
                this.A0f++;
            } catch (IllegalStateException e) {
                Log.w("Failed to start foreground service GoogleBackupService", e);
                stopSelf();
            }
        }
        return onStartCommand;
    }

    public IBinder onBind(Intent intent) {
        return this.A0i;
    }
}
