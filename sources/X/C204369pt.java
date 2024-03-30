package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.util.AbstractList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9pt  reason: invalid class name and case insensitive filesystem */
public class C204369pt implements Handler.Callback {
    public static int A17;
    public static final AtomicBoolean A18 = C36431kI.A1H();
    public static final AtomicReference A19 = new AtomicReference();
    public float A00 = 1.0f;
    public float A01;
    public int A02 = 1;
    public int A03 = 10;
    public int A04 = 1;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public Context A0D;
    public Handler A0E;
    public HandlerThread A0F;
    public Surface A0G;
    public Surface A0H;
    public Surface A0I;
    public AnonymousClass9L6 A0J;
    public AnonymousClass9OH A0K = null;
    public C201619jy A0L;
    public C22792Aw3 A0M;
    public C109585Yd A0N;
    public C141026mY A0O;
    public AnonymousClass9UR A0P;
    public AnonymousClass7cI A0Q;
    public Integer A0R = null;
    public Integer A0S = C023109s.A0G;
    public String A0T = "";
    public String A0U;
    public Map A0V;
    public AtomicReference A0W;
    public boolean A0X = false;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a = false;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public final long A0k;
    public final Handler A0l;
    public final AnonymousClass9OD A0m;
    public final AnonymousClass9D5 A0n;
    public final C20992A2g A0o;
    public final AUR A0p;
    public final AtomicBoolean A0q;
    public final AtomicBoolean A0r;
    public final AtomicBoolean A0s;
    public final AtomicBoolean A0t;
    public final AtomicInteger A0u = new AtomicInteger();
    public final Map A0v = AnonymousClass001.A0J();
    public final AtomicInteger A0w = new AtomicInteger(0);
    public final AtomicReference A0x;
    public volatile C207019uQ A0y = C207019uQ.A0D;
    public volatile C207179ug A0z = new C207179ug();
    public volatile C195979Xa A10;
    public volatile C199429fI A11 = new C199429fI();
    public volatile C202979n2 A12;
    public volatile boolean A13;
    public volatile boolean A14;
    public volatile boolean A15;
    public volatile boolean A16;

    private void A05() {
        this.A10 = null;
        this.A0Z = false;
        this.A0S = C023109s.A0G;
        this.A0b = false;
        this.A0a = false;
        this.A15 = false;
        this.A0j = false;
        this.A0f = false;
        this.A01 = 0.0f;
        this.A00 = 1.0f;
        this.A02 = 1;
        this.A0e = false;
        this.A04 = 1;
        this.A03 = 10;
        this.A08 = -1;
        this.A0Y = false;
        this.A13 = false;
        this.A0A = 0;
        this.A0z = new C207179ug();
        this.A0y = C207019uQ.A0D;
        C202979n2 r3 = this.A12;
        r3.A0P.clear();
        r3.A01.A0M.clear();
        this.A0g = false;
        this.A0q.set(true);
        this.A0i = false;
        this.A09 = -1;
        this.A0K = null;
        this.A0T = "";
        this.A0U = null;
        this.A12.A04 = null;
        if (this.A0p.improveLooping) {
            this.A12.A01.A08(0);
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private void A06(int r39, long r40, boolean r42, boolean r43) {
        /*
            r38 = this;
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r23 = r42
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r23)
            r7 = 0
            r14 = r39
            r0 = r22
            java.lang.Integer r21 = X.C165617ti.A0X(r0, r2, r7, r14)
            r6 = 1
            r2[r6] = r21
            r5 = r38
            boolean r0 = r5.A15
            X.C165587tf.A1X(r2, r0)
            boolean r0 = r5.A0b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 3
            r2[r0] = r1
            java.lang.String r0 = "onPlayerStateChanged start: play=%b, state=%d, startedPlaying=%b, isPrepared=%b"
            A0F(r5, r0, r2)
            boolean r0 = r5.A16
            if (r0 == 0) goto L_0x0037
            if (r14 != r6) goto L_0x0037
            r5.A16 = r7
            X.A2g r0 = r5.A0o
            r0.Bhv()
        L_0x0037:
            X.9Xa r0 = r5.A10
            if (r0 != 0) goto L_0x0043
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "onPlayerStateChanged, play request not set yet, skip the state change"
            A0F(r5, r0, r1)
            return
        L_0x0043:
            java.lang.String r25 = r5.A04()
            boolean r0 = android.text.TextUtils.isEmpty(r25)
            java.lang.String r24 = ""
            r37 = r24
            if (r0 == 0) goto L_0x0053
            r25 = r24
        L_0x0053:
            X.AUR r0 = r5.A0p
            r36 = r0
            boolean r0 = r0.enableSecondaryChannelLoggingForLite
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r5.A04()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03e2
            r2 = r24
        L_0x0067:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0074
            X.A2g r1 = r5.A0o
            r0 = r25
            r1.BWR(r0, r2)
        L_0x0074:
            r0 = 3
            if (r14 != r0) goto L_0x007a
            r0 = 1
            if (r42 != 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r5.A0j = r0
            r2 = 0
            r10 = 0
            r0 = r40
            if (r42 != 0) goto L_0x03d7
            boolean r4 = r5.A15
            if (r4 == 0) goto L_0x0343
            r5.A15 = r7
            X.9ug r4 = r5.A01(r0, r6)
            A0G(r5, r6)
            X.A2g r15 = r5.A0o
            long r8 = r5.A07
            java.lang.String r13 = r5.A0T
            java.lang.String r11 = r5.A0U
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x033f
            java.lang.String r12 = r5.A0U
        L_0x00a1:
            X.9Xa r11 = r5.A10
            java.lang.String r11 = r11.A08
            r32 = r43
            r25 = r15
            r26 = r4
            r27 = r13
            r28 = r12
            r29 = r11
            r30 = r8
            r25.BcK(r26, r27, r28, r29, r30, r32)
            r5.A07 = r2
            r2 = r24
            r5.A0T = r2
            r5.A0U = r10
        L_0x00be:
            if (r14 == r6) goto L_0x0335
            r2 = 2
            if (r14 == r2) goto L_0x02ae
            r2 = 3
            if (r14 == r2) goto L_0x0158
            r2 = 4
            if (r14 != r2) goto L_0x063f
            boolean r3 = r5.A15
            boolean r2 = r5.A0f
            if (r2 != 0) goto L_0x00d1
            r5.A15 = r7
        L_0x00d1:
            X.9ug r4 = r5.A01(r0, r6)
            if (r3 == 0) goto L_0x00e0
            X.A2g r3 = r5.A0o
            X.9Xa r2 = r5.A10
            java.lang.String r2 = r2.A08
            r3.BU8(r4, r2, r7)
        L_0x00e0:
            boolean r2 = r5.A0f
            if (r2 == 0) goto L_0x00f1
            r2 = r36
            boolean r2 = r2.improveLooping
            if (r2 != 0) goto L_0x00f1
            X.9n2 r8 = r5.A12
            r2 = 0
            r8.A08(r2, r7)
        L_0x00f1:
            r5.A0U = r10
        L_0x00f3:
            r2 = r36
            int r2 = r2.checkPlayerStateMinIntervalMs
            r5.A03 = r2
            if (r4 != 0) goto L_0x014b
            r5.A07(r0)
        L_0x00fe:
            r5.A04 = r14
            r0 = r23
            r5.A0e = r0
            X.9L6 r0 = r5.A0J
            if (r0 == 0) goto L_0x0124
            if (r14 == r6) goto L_0x0110
            r0 = 2
            if (r14 == r0) goto L_0x0144
            r0 = 3
            if (r14 == r0) goto L_0x0144
        L_0x0110:
            r2 = 0
        L_0x0111:
            X.9L6 r0 = r5.A0J
            if (r0 == 0) goto L_0x0124
            r0.A02 = r2
            android.os.PowerManager$WakeLock r1 = r0.A00
            if (r1 == 0) goto L_0x0124
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0140
            if (r2 == 0) goto L_0x0140
            r1.acquire()
        L_0x0124:
            r2 = 4
            r1 = r22
            r0 = r21
            java.lang.Object[] r2 = X.C36431kI.A1a(r1, r0, r2)
            boolean r0 = r5.A15
            X.C165587tf.A1X(r2, r0)
            boolean r1 = r5.A0b
            r0 = 3
            X.AnonymousClass000.A1N(r2, r0, r1)
            java.lang.String r1 = "onPlayerStateChanged end: play=%b, state=%d, startedPlaying=%b, isPrepared=%b"
            java.lang.String r0 = "HeroService"
            X.C200599hh.A00(r5, r0, r1, r2)
            return
        L_0x0140:
            r1.release()
            goto L_0x0124
        L_0x0144:
            X.9n2 r0 = r5.A12
            X.9mU r0 = r0.A01
            boolean r2 = r0.A0E
            goto L_0x0111
        L_0x014b:
            r5.A0z = r4
            android.os.Handler r3 = r5.A0l
            r2 = 10
            int r0 = r5.A03
            long r0 = (long) r0
            r3.sendEmptyMessageDelayed(r2, r0)
            goto L_0x00fe
        L_0x0158:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r2 = "Player is ready"
            A0F(r5, r2, r3)
            r2 = r36
            boolean r2 = r2.clearBufferingWhenInWarmup
            if (r2 == 0) goto L_0x0171
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A0t
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x0171
            r2 = -1
            r5.A08 = r2
        L_0x0171:
            X.9n2 r2 = r5.A12
            X.B5Q[] r2 = r2.A0D
            r8 = 0
            if (r2 == 0) goto L_0x0184
            r2 = r2[r7]
            X.9zD r2 = (X.C208949zD) r2
            int r3 = r2.A01
            if (r3 == r6) goto L_0x0183
            r2 = 2
            if (r3 != r2) goto L_0x0184
        L_0x0183:
            r8 = 1
        L_0x0184:
            boolean r2 = r5.A0b
            if (r2 != 0) goto L_0x01a3
            android.view.Surface r2 = r5.A0G
            if (r2 != 0) goto L_0x0196
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A0t
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x0196
            if (r8 != 0) goto L_0x01a3
        L_0x0196:
            r5.A0b = r6
            X.9ug r4 = r5.A01(r0, r7)
            X.A2g r3 = r5.A0o
            r2 = r37
            r3.BdP(r4, r2)
        L_0x01a3:
            if (r42 == 0) goto L_0x0295
            boolean r2 = r5.A15
            if (r2 != 0) goto L_0x0295
            r5.A15 = r6
            X.9ug r4 = r5.A01(r0, r6)
            X.9n2 r2 = r5.A12
            X.9mU r2 = r2.A01
            X.9jS r2 = r2.A07
            java.lang.Integer r2 = r2.A07
            int r2 = r2.intValue()
            switch(r2) {
                case 1: goto L_0x027d;
                case 2: goto L_0x0281;
                case 3: goto L_0x0285;
                case 4: goto L_0x0289;
                case 5: goto L_0x028d;
                case 6: goto L_0x0291;
                default: goto L_0x01be;
            }
        L_0x01be:
            java.lang.String r11 = "unknown"
        L_0x01c0:
            java.lang.String r2 = "buffer_below_threshold"
            boolean r3 = r11.equals(r2)
            java.lang.String r2 = ":"
            if (r3 == 0) goto L_0x01db
            java.lang.StringBuilder r8 = X.C90524aI.A0i(r11)
            r8.append(r2)
            X.AUJ r3 = r5.A02()
            int r3 = r3.minBufferMs
            java.lang.String r11 = X.C36381kD.A10(r8, r3)
        L_0x01db:
            X.9n2 r3 = r5.A12
            X.9mU r3 = r3.A01
            X.9jS r3 = r3.A07
            boolean r8 = r3.A09
            r9 = 2
            if (r8 == 0) goto L_0x0207
            java.lang.StringBuilder r3 = X.C90524aI.A0i(r11)
            r3.append(r2)
            java.lang.String r2 = "audio_stall"
            java.lang.String r11 = X.AnonymousClass000.A0q(r2, r3)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            X.AnonymousClass000.A1N(r3, r7, r8)
            java.lang.String r2 = r5.A04()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3[r6] = r2
            java.lang.String r2 = "handleStartedPlaying isAudioStall: %s %s"
            A0F(r5, r2, r3)
        L_0x0207:
            java.lang.String r8 = r5.A0U
            if (r8 == 0) goto L_0x022e
            int r2 = r11.length()
            if (r2 <= 0) goto L_0x027b
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r11)
            java.lang.String r2 = "; "
            java.lang.String r11 = X.AnonymousClass000.A0p(r2, r8, r3)
        L_0x021b:
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r3[r7] = r8
            java.lang.String r2 = r5.A04()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3[r6] = r2
            java.lang.String r2 = "handleStartedPlaying: %s %s"
            A0F(r5, r2, r3)
        L_0x022e:
            X.A2g r13 = r5.A0o
            long r2 = r4.A0H
            long r8 = r5.A0B
            long r2 = r2 - r8
            java.lang.String r12 = r5.A0T
            java.lang.String r9 = r5.A0U
            X.9Xa r8 = r5.A10
            if (r8 == 0) goto L_0x0278
            X.9Xa r8 = r5.A10
            java.lang.String r8 = r8.A08
        L_0x0241:
            r33 = 0
            r34 = 0
            r24 = r13
            r25 = r4
            r26 = r11
            r27 = r10
            r28 = r12
            r29 = r9
            r30 = r8
            r31 = r2
            r24.BhK(r25, r26, r27, r28, r29, r30, r31, r33, r34)
            r5.A0a = r7
            r2 = r37
            r5.A0T = r2
            r5.A0U = r10
            A17 = r7
            android.view.Surface r3 = r5.A0G
            if (r3 == 0) goto L_0x0270
            android.view.Surface r2 = r5.A0I
            if (r2 != r3) goto L_0x0270
            boolean r2 = r2.isValid()
            if (r2 != 0) goto L_0x00f3
        L_0x0270:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r5.A0C = r2
            goto L_0x00f3
        L_0x0278:
            r8 = r37
            goto L_0x0241
        L_0x027b:
            r11 = r8
            goto L_0x021b
        L_0x027d:
            java.lang.String r11 = "null_format"
            goto L_0x01c0
        L_0x0281:
            java.lang.String r11 = "waiting_for_keys"
            goto L_0x01c0
        L_0x0285:
            java.lang.String r11 = "no_output_buffer"
            goto L_0x01c0
        L_0x0289:
            java.lang.String r11 = "surface_not_ready"
            goto L_0x01c0
        L_0x028d:
            java.lang.String r11 = "force_end"
            goto L_0x01c0
        L_0x0291:
            java.lang.String r11 = "buffer_below_threshold"
            goto L_0x01c0
        L_0x0295:
            if (r4 != 0) goto L_0x00f3
            X.9ug r4 = r5.A01(r0, r6)
            android.view.Surface r3 = r5.A0I
            android.view.Surface r2 = r5.A0G
            boolean r3 = X.C36371kC.A1W(r3, r2)
            X.A2g r2 = r5.A0o
            r2.BSL(r4, r3)
            X.9b8 r2 = X.C197099b8.A02
            monitor-enter(r2)
            monitor-exit(r2)
            goto L_0x00f3
        L_0x02ae:
            boolean r2 = r5.A15
            if (r2 != 0) goto L_0x02b8
            r2 = r36
            boolean r2 = r2.includeAllBufferingEvents
            if (r2 == 0) goto L_0x02f9
        L_0x02b8:
            r5.A08 = r0
            X.9n2 r2 = r5.A12
            X.9mU r2 = r2.A01
            X.9jS r2 = r2.A07
            boolean r2 = r2.A09
            r5.A0Y = r2
            X.9ug r4 = r5.A01(r0, r7)
            android.view.Surface r3 = r5.A0I
            android.view.Surface r2 = r5.A0G
            boolean r8 = X.C36371kC.A1W(r3, r2)
            X.A2g r3 = r5.A0o
            X.9uQ r2 = r5.A0y
            r3.BSK(r4, r2, r8)
            X.9b8 r9 = X.C197099b8.A02
            monitor-enter(r9)
            boolean r2 = X.C197099b8.A00     // Catch:{ all -> 0x0649 }
            if (r2 == 0) goto L_0x02f8
            java.util.Deque r8 = X.C197099b8.A03     // Catch:{ all -> 0x0649 }
            monitor-enter(r9)     // Catch:{ all -> 0x0649 }
            int r3 = r8.size()     // Catch:{ all -> 0x0646 }
            r2 = 20
            if (r3 < r2) goto L_0x02ec
            r8.poll()     // Catch:{ all -> 0x0646 }
        L_0x02ec:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0646 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0646 }
            r8.offer(r2)     // Catch:{ all -> 0x0646 }
            monitor-exit(r9)     // Catch:{ all -> 0x0649 }
        L_0x02f8:
            monitor-exit(r9)
        L_0x02f9:
            boolean r2 = r5.A0g
            if (r2 == 0) goto L_0x030d
            if (r42 != 0) goto L_0x030d
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r2 = "Sending delayed play now due to seek"
            A0F(r5, r2, r3)
            X.9n2 r2 = r5.A12
            r2.A0A(r6)
            r5.A0g = r7
        L_0x030d:
            r2 = r36
            boolean r2 = r2.setPlayWhenReadyOnRetry
            if (r2 == 0) goto L_0x00f3
            java.lang.Integer r3 = r5.A0S
            java.lang.Integer r2 = X.C023109s.A0C
            if (r3 != r2) goto L_0x00f3
            if (r42 == 0) goto L_0x00f3
            boolean r2 = r5.A15
            if (r2 != 0) goto L_0x00f3
            boolean r2 = r5.A0b
            if (r2 == 0) goto L_0x00f3
            java.lang.String r2 = r5.A0U
            if (r2 == 0) goto L_0x00f3
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r2 = "Sending play for retry after error"
            A0F(r5, r2, r3)
            X.9n2 r2 = r5.A12
            r2.A0A(r6)
            goto L_0x00f3
        L_0x0335:
            r2 = r36
            boolean r2 = r2.setPlayWhenReadyOnError
            if (r2 != 0) goto L_0x00f3
            r5.A15 = r7
            goto L_0x00f3
        L_0x033f:
            r12 = r24
            goto L_0x00a1
        L_0x0343:
            boolean r2 = r5.A0e
            if (r2 == 0) goto L_0x03d7
            r2 = 4
            if (r14 == r2) goto L_0x03d7
            boolean r2 = r5.A0a
            if (r2 != 0) goto L_0x03d7
            X.9ug r4 = r5.A01(r0, r6)
            X.9n2 r2 = r5.A12
            X.9mU r2 = r2.A01
            X.9jS r2 = r2.A07
            boolean r15 = r2.A09
            boolean r2 = r5.A0i
            if (r2 != 0) goto L_0x03a4
            r2 = r36
            boolean r2 = r2.enableRetryErrorLoggingInCancel
            if (r2 == 0) goto L_0x03a1
            java.lang.String r2 = r5.A0T
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x03a1
            java.lang.String r29 = "cancel with error thrown"
        L_0x036e:
            X.A2g r13 = r5.A0o
            java.lang.String r12 = r5.A0T
            java.lang.String r2 = r5.A0U
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x039e
            java.lang.String r11 = r5.A0U
        L_0x037c:
            long r2 = r4.A0H
            long r8 = r5.A0B
            long r2 = r2 - r8
            X.9Xa r8 = r5.A10
            java.lang.String r8 = r8.A08
            r25 = r13
            r26 = r4
            r27 = r12
            r28 = r11
            r30 = r8
            r31 = r2
            r33 = r15
            r25.BT6(r26, r27, r28, r29, r30, r31, r33)
            r2 = r24
            r5.A0T = r2
        L_0x039a:
            r5.A0U = r10
            goto L_0x00be
        L_0x039e:
            r11 = r24
            goto L_0x037c
        L_0x03a1:
            r29 = r24
            goto L_0x036e
        L_0x03a4:
            X.A2g r3 = r5.A0o
            java.lang.String r27 = "force_end"
            r32 = -1
            java.lang.String r8 = r5.A0T
            java.lang.String r2 = r5.A0U
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x03b8
            java.lang.String r2 = r5.A0U
            r24 = r2
        L_0x03b8:
            X.9Xa r2 = r5.A10
            java.lang.String r2 = r2.A08
            r34 = 0
            r35 = 0
            r25 = r3
            r26 = r4
            r28 = r10
            r29 = r8
            r30 = r24
            r31 = r2
            r25.BhK(r26, r27, r28, r29, r30, r31, r32, r34, r35)
            X.9Xa r2 = r5.A10
            java.lang.String r2 = r2.A08
            r3.BU8(r4, r2, r6)
            goto L_0x039a
        L_0x03d7:
            boolean r2 = r5.A0e
            if (r2 != 0) goto L_0x03df
            if (r42 == 0) goto L_0x03df
            r5.A0B = r0
        L_0x03df:
            r4 = r10
            goto L_0x00be
        L_0x03e2:
            X.9n2 r11 = r5.A12
            boolean r0 = r11.A0Q
            r2 = r24
            if (r0 == 0) goto L_0x0067
            X.9bF r0 = r11.A07
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.concurrent.BlockingDeque r0 = r0.A00
            r0.drainTo(r3)
            java.lang.StringBuilder r20 = X.AnonymousClass000.A0u()
            r2 = 0
        L_0x03fa:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x0602
            int r1 = r3.size()
            int r1 = r1 - r2
            r0 = 2000(0x7d0, float:2.803E-42)
            int r8 = java.lang.Math.min(r1, r0)
            r13 = r2
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0602
            if (r2 < 0) goto L_0x0602
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x0602
            if (r8 <= 0) goto L_0x0602
            int r19 = r2 + r8
            int r1 = r3.size()
            r0 = r19
            if (r0 > r1) goto L_0x0602
            java.util.HashMap r12 = X.AnonymousClass001.A0J()
            X.9LQ r9 = A00(r3, r2)
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]
            long r0 = r9.A03
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4[r7] = r0
            long r0 = r9.A01
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4[r6] = r0
            long r0 = r9.A02
            java.lang.String r1 = java.lang.Long.toString(r0)
            r0 = 2
            java.util.List r1 = X.C90524aI.A0p(r1, r4, r0)
            java.lang.String r0 = "f0"
            r12.put(r0, r1)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = "version"
            r0 = r17
            r12.put(r1, r0)
            r18 = 0
            if (r8 <= r6) goto L_0x05d8
            r4 = r19
        L_0x0462:
            int r4 = r4 + -1
            if (r4 <= r2) goto L_0x04d7
            X.9LQ r15 = A00(r3, r4)
            X.9LQ r0 = A00(r3, r4)
            long r0 = r0.A03
            int r8 = r4 + -1
            X.9LQ r9 = A00(r3, r8)
            long r9 = r9.A03
            long r0 = r0 - r9
            r15.A03 = r0
            X.9LQ r15 = A00(r3, r4)
            X.9LQ r0 = A00(r3, r4)
            long r0 = r0.A01
            X.9LQ r9 = A00(r3, r8)
            long r9 = r9.A01
            long r0 = r0 - r9
            r15.A01 = r0
            X.9LQ r15 = A00(r3, r4)
            X.9LQ r0 = A00(r3, r4)
            long r0 = r0.A02
            X.9LQ r9 = A00(r3, r8)
            long r9 = r9.A02
            long r0 = r0 - r9
            r15.A02 = r0
            X.9LQ r10 = A00(r3, r4)
            X.9LQ r0 = A00(r3, r8)
            long r0 = r0.A00
            r15 = -1
            int r9 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x04c9
            r0 = 0
        L_0x04b3:
            r10.A00 = r0
            X.9LQ r10 = A00(r3, r4)
            X.9LQ r0 = A00(r3, r4)
            long r0 = r0.A02
            X.9LQ r8 = A00(r3, r4)
            long r8 = r8.A01
            long r0 = r0 - r8
            r10.A02 = r0
            goto L_0x0462
        L_0x04c9:
            X.9LQ r0 = A00(r3, r4)
            long r0 = r0.A00
            X.9LQ r8 = A00(r3, r8)
            long r8 = r8.A00
            long r0 = r0 - r8
            goto L_0x04b3
        L_0x04d7:
            java.util.HashMap r15 = X.AnonymousClass001.A0J()
            int r4 = r2 + 1
            r10 = r4
        L_0x04de:
            r0 = r19
            if (r10 >= r0) goto L_0x052f
            X.9LQ r0 = A00(r3, r10)
            long r8 = r0.A03
            X.9LQ r0 = A00(r3, r10)
            long r0 = r0.A01
            r26 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            boolean r0 = r15.containsKey(r1)
            if (r0 == 0) goto L_0x052c
            java.lang.Object r0 = r15.get(r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0508:
            r15.put(r1, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r26)
            boolean r0 = r15.containsKey(r1)
            if (r0 == 0) goto L_0x0529
            java.lang.Object r0 = r15.get(r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0523:
            r15.put(r1, r0)
            int r10 = r10 + 1
            goto L_0x04de
        L_0x0529:
            r0 = r17
            goto L_0x0523
        L_0x052c:
            r0 = r17
            goto L_0x0508
        L_0x052f:
            r16 = 3333(0xd05, double:1.6467E-320)
            r9 = 0
            java.util.Iterator r8 = X.C36371kC.A10(r15)
        L_0x0536:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0550
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r8)
            int r1 = X.C90484aE.A0G(r0)
            if (r9 >= r1) goto L_0x0536
            java.lang.Object r0 = r0.getKey()
            long r16 = X.C36431kI.A09(r0)
            r9 = r1
            goto L_0x0536
        L_0x0550:
            r0 = r19
            if (r4 >= r0) goto L_0x0573
            X.9LQ r8 = A00(r3, r4)
            X.9LQ r0 = A00(r3, r4)
            long r0 = r0.A03
            long r0 = r0 - r16
            r8.A03 = r0
            X.9LQ r8 = A00(r3, r4)
            X.9LQ r0 = A00(r3, r4)
            long r0 = r0.A01
            long r0 = r0 - r16
            r8.A01 = r0
            int r4 = r4 + 1
            goto L_0x0550
        L_0x0573:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "baseDelta"
            r12.put(r0, r1)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
        L_0x0584:
            int r13 = r13 + 1
            r0 = r19
            if (r13 >= r0) goto L_0x05bd
            X.9LQ r0 = A00(r3, r13)
            long r0 = r0.A03
            X.C36391kE.A1W(r4, r0)
            X.9LQ r0 = A00(r3, r13)
            long r0 = r0.A01
            X.C36391kE.A1W(r4, r0)
            X.9LQ r0 = A00(r3, r13)
            long r0 = r0.A02
            X.C36391kE.A1W(r4, r0)
            X.9LQ r0 = A00(r3, r13)
            long r0 = r0.A00
            X.C36391kE.A1W(r8, r0)
            X.9LQ r0 = A00(r3, r13)
            long r0 = r0.A00
            r15 = 0
            int r9 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r9 == 0) goto L_0x0584
            r18 = 1
            goto L_0x0584
        L_0x05bd:
            java.lang.String r1 = X.C197169bF.A00(r4)
            java.lang.String r0 = "fn"
            r12.put(r0, r1)
            java.lang.String r1 = X.C197169bF.A00(r8)
            java.lang.String r0 = "fAudio"
            r12.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r18)
            java.lang.String r0 = "isSoundOn"
            r12.put(r0, r1)
        L_0x05d8:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r12)
            java.lang.String r4 = r0.toString()
            int r1 = r4.length()
            r0 = 900000(0xdbba0, float:1.261169E-39)
            if (r1 <= r0) goto L_0x05ec
            java.lang.String r4 = "{\"err\":\"SIZE_EXCEED_MAX_CAP\"}"
        L_0x05ec:
            int r0 = r20.length()
            if (r0 == 0) goto L_0x05f9
            java.lang.String r1 = "|"
            r0 = r20
            r0.append(r1)
        L_0x05f9:
            r0 = r20
            r0.append(r4)
            int r2 = r2 + 2000
            goto L_0x03fa
        L_0x0602:
            java.lang.String r2 = r20.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0637
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0637
            java.lang.String r0 = r11.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x062b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r11.A0C
            r1.append(r0)
            java.lang.String r0 = "|"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r11.A0C = r0
        L_0x062b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r11.A0C
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            r11.A0C = r0
        L_0x0637:
            java.lang.String r2 = r11.A0C
            r0 = r24
            r11.A0C = r0
            goto L_0x0067
        L_0x063f:
            java.lang.String r0 = "Invalid playbackState"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0646:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0649 }
            throw r0     // Catch:{ all -> 0x0649 }
        L_0x0649:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204369pt.A06(int, long, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r1 > r0) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(long r12) {
        /*
            r11 = this;
            r0 = 0
            X.9ug r7 = r11.A01(r12, r0)
            X.9ug r8 = r11.A0z
            X.AUR r6 = r11.A0p
            int r0 = r6.needUpdatePlayerStateThresholdMs
            long r2 = (long) r0
            int r0 = r6.needUpdateStateByPositionOffsetThresholdMs
            long r9 = (long) r0
            long r4 = r7.A0H
            long r0 = r8.A0H
            long r4 = r4 - r0
            boolean r1 = r7.A0R
            boolean r0 = r8.A0R
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r7.A0U
            boolean r0 = r8.A0U
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r7.A0P
            boolean r0 = r8.A0P
            if (r1 != r0) goto L_0x00b2
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b2
            float r1 = r7.A00
            float r0 = r8.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00b2
            long r2 = r7.A08
            long r0 = r8.A08
            long r2 = r2 - r0
            long r2 = r2 - r4
            long r1 = java.lang.Math.abs(r2)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00b2
            long r2 = r7.A0E
            long r0 = r8.A0E
            long r2 = r2 - r0
            long r2 = r2 - r4
            long r1 = java.lang.Math.abs(r2)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00b2
            int r1 = r11.A03
            int r0 = r6.checkPlayerStateIntervalIncreaseMs
            int r1 = r1 + r0
            r11.A03 = r1
            int r0 = r6.checkPlayerStateMaxIntervalMs
            if (r1 <= r0) goto L_0x005b
        L_0x0059:
            r11.A03 = r0
        L_0x005b:
            X.9Xa r0 = r11.A10
            if (r0 == 0) goto L_0x0089
            X.9Xa r0 = r11.A10
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0089
            boolean r0 = r6.enableLiveBroadcastErrorUI
            if (r0 == 0) goto L_0x0089
            X.9uQ r0 = r11.A0y
            int r1 = r0.A00
            int r0 = r6.staleManifestThresholdToShowInterruptUI
            r3 = 1
            r2 = 0
            boolean r1 = X.C36371kC.A1T(r1, r0)
            boolean r0 = r11.A0c
            if (r0 != 0) goto L_0x00a3
            if (r1 == 0) goto L_0x0089
            int r1 = r11.A04
            r0 = 2
            if (r1 != r0) goto L_0x0089
            X.A2g r0 = r11.A0o
            r0.BZm(r3)
            r11.A0c = r3
        L_0x0089:
            X.9Xa r1 = r11.A10
            android.os.Handler r3 = r11.A0l
            r2 = 10
            r3.removeMessages(r2)
            boolean r0 = r11.A15
            if (r0 == 0) goto L_0x00a2
            if (r1 == 0) goto L_0x00bc
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x00bc
            int r1 = android.os.Build.VERSION.SDK_INT
            int r0 = r6.sdkVersionToBypassHeroStateRefresh
            if (r1 > r0) goto L_0x00bc
        L_0x00a2:
            return
        L_0x00a3:
            if (r1 == 0) goto L_0x00aa
            int r1 = r11.A04
            r0 = 3
            if (r1 != r0) goto L_0x0089
        L_0x00aa:
            X.A2g r0 = r11.A0o
            r0.BZm(r2)
            r11.A0c = r2
            goto L_0x0089
        L_0x00b2:
            X.A2g r0 = r11.A0o
            r0.Bcu(r7)
            r11.A0z = r7
            int r0 = r6.checkPlayerStateMinIntervalMs
            goto L_0x0059
        L_0x00bc:
            int r0 = r11.A03
            long r0 = (long) r0
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204369pt.A07(long):void");
    }

    private void A0I(boolean z) {
        A0F(this, "enableVideoTrackInternal", new Object[0]);
        if (this.A12.A03(0) == -1 && z) {
            C200599hh.A00(this, "HeroService", "Enable video track", new Object[0]);
            this.A12.A06(0, 0);
        } else if (this.A12.A03(0) != -1 && !z) {
            C200599hh.A00(this, "HeroService", "Disable video track", new Object[0]);
            this.A12.A06(0, -1);
        }
    }

    private void A0J(boolean z) {
        A0F(this, "resetInternal", new Object[0]);
        if (this.A14) {
            this.A0o.Bkb("EXOPLAYER2_UNEXPECTED", "RESET_INTERNAL_REQUESTED_AFTER_RELEASED", "resetInternal requested after released");
        }
        A0L(false, (String) null);
        AUR aur = this.A0p;
        if (!aur.enablePauseNow) {
            A06(this.A04, SystemClock.elapsedRealtime(), false, false);
        }
        Surface surface = this.A0H;
        if (aur.releaseSurfaceInServicePlayerReset) {
            this.A0I = null;
            this.A0G = null;
            this.A0H = null;
            this.A0C = -1;
            this.A07 = -1;
            A0A((Surface) null, this, true);
        }
        this.A0H = surface;
        this.A12.A01.A0C(true);
        C209329zp r3 = this.A12.A01.A0I;
        if (r3.A0n) {
            r3.A0h.A01(0);
        }
        r3.A0f.A01(0);
        A05();
        this.A12.A09(this.A0O);
        if (z) {
            this.A0l.removeMessages(9);
        }
    }

    private void A0K(boolean z) {
        C202709mU r0;
        A0F(this, "retryInternal", new Object[0]);
        if (!(!z || (r0 = this.A12.A01) == null || r0.A07.A00 == 1)) {
            A0F(this, "Stopping non idle exoplayer", new Object[0]);
            this.A12.A01.A0C(false);
        }
        C202709mU r3 = this.A12.A01;
        B38 b38 = r3.A09;
        if (b38 != null && r3.A07.A00 == 1) {
            r3.A0B(b38, false, false);
        }
    }

    public void A0M() {
        A0F(this, C36371kC.A0z("Enabling Text Track: ", AnonymousClass000.A0u(), false), new Object[0]);
        A08(this.A0l, this, false, 34);
    }

    public void A0N(long j, boolean z) {
        A0F(this, "Play", new Object[0]);
        this.A0q.set(false);
        this.A0r.compareAndSet(false, z);
        Handler handler = this.A0l;
        Object[] A0L2 = AnonymousClass001.A0L();
        AnonymousClass000.A1M(A0L2, 0, j);
        A08(handler, this, A0L2, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r0.A15 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011a, code lost:
        if (r5.A09(r2.A0J, r2.A04(), 0).A0A == false) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C207179ug A01(long r59, boolean r61) {
        /*
            r58 = this;
            r7 = 0
            r2 = -1
            r4 = 0
            r0 = r58
            r26 = r59
            if (r61 == 0) goto L_0x015b
            long r5 = r0.A08
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x015b
            boolean r11 = r0.A0Y
            r0.A08 = r2
            r0.A0Y = r4
            r44 = r26
        L_0x0019:
            long r2 = r0.A09
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0029
            X.9n2 r1 = r0.A12
            X.9mU r1 = r1.A01
            long r1 = r1.A05()
            r0.A09 = r1
        L_0x0029:
            X.9n2 r1 = r0.A12
            X.9fS r9 = r1.A03
            X.9n2 r1 = r0.A12
            X.9mU r1 = r1.A01
            boolean r1 = r1.A0E
            if (r1 == 0) goto L_0x003b
            boolean r1 = r0.A15
            r52 = 1
            if (r1 != 0) goto L_0x003d
        L_0x003b:
            r52 = 0
        L_0x003d:
            boolean r1 = r0.A0j
            r17 = r1
            long r1 = r0.A08
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            boolean r54 = X.AnonymousClass000.A1R(r3)
            long r1 = r0.A09
            r20 = r1
            X.9n2 r1 = r0.A12
            long r32 = r1.A04()
            X.9n2 r1 = r0.A12
            X.9mU r1 = r1.A01
            X.9zp r4 = r1.A0I
            boolean r1 = r4.A0n
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r1 == 0) goto L_0x0153
            X.A0c r1 = r4.A0h
            long r34 = r1.BG6()
        L_0x0065:
            long r34 = r34 / r2
            X.9n2 r2 = r0.A12
            X.AUR r1 = r2.A0O
            boolean r1 = r1.isExo2UseAbsolutePosition
            if (r1 == 0) goto L_0x013d
            X.9mU r1 = r2.A01
            X.9jS r1 = r1.A07
            long r1 = r1.A0C
            java.util.UUID r3 = X.AnonymousClass9B7.A04
            long r3 = com.facebook.android.exoplayer2.util.Util.A05(r1)
        L_0x007b:
            X.9n2 r1 = r0.A12
            X.9mU r1 = r1.A01
            X.9jS r1 = r1.A07
            long r1 = r1.A0B
            java.util.UUID r7 = X.AnonymousClass9B7.A04
            long r38 = com.facebook.android.exoplayer2.util.Util.A05(r1)
            X.9n2 r1 = r0.A12
            X.B3Y r1 = r1.A02
            if (r1 == 0) goto L_0x013a
            X.9Ws r1 = r1.B8a()
            if (r1 == 0) goto L_0x013a
            int r1 = r1.A00()
        L_0x0099:
            long r14 = (long) r1
            java.lang.Integer r1 = r0.A0S
            int r1 = r1.intValue()
            switch(r1) {
                case 1: goto L_0x0126;
                case 2: goto L_0x012a;
                case 3: goto L_0x012e;
                case 4: goto L_0x0132;
                case 5: goto L_0x0136;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            java.lang.String r16 = "UNKNOWN"
        L_0x00a5:
            r18 = 0
            long r12 = r0.A0A
            r48 = -1
            X.9OH r1 = r0.A0K
            if (r1 == 0) goto L_0x0122
            int r2 = r1.A03
            int r7 = r1.A0A
            int r2 = r2 + r7
            int r10 = r1.A07
            int r8 = r1.A00
        L_0x00b8:
            float r9 = r9.A01
            X.9n2 r1 = r0.A12
            X.9mU r1 = r1.A01
            int r25 = r1.A04()
            X.9n2 r1 = r0.A12
            if (r1 == 0) goto L_0x0120
            X.9XZ r1 = r1.A05
            if (r1 == 0) goto L_0x0120
            boolean r7 = r1.A0D
        L_0x00cc:
            r30 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.9ug r1 = new X.9ug
            r19 = 0
            r22 = 0
            r24 = 0
            r50 = -1
            r57 = 0
            r28 = r20
            r36 = r3
            r40 = r14
            r42 = r5
            r46 = r12
            r53 = r17
            r55 = r11
            r56 = r7
            r15 = r1
            r17 = r9
            r20 = r2
            r21 = r10
            r23 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r54, r55, r56, r57)
            X.9n2 r0 = r0.A12
            X.9mU r2 = r0.A01
            X.9jS r0 = r2.A07
            com.facebook.android.exoplayer2.Timeline r5 = r0.A03
            int r0 = r5.A01()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 != 0) goto L_0x011c
            int r4 = r2.A04()
            X.9fY r0 = r2.A0J
            r2 = 0
            X.9fY r0 = r5.A09(r0, r4, r2)
            boolean r2 = r0.A0A
            r0 = 1
            if (r2 != 0) goto L_0x011d
        L_0x011c:
            r0 = 0
        L_0x011d:
            r1.A0T = r0
            return r1
        L_0x0120:
            r7 = 0
            goto L_0x00cc
        L_0x0122:
            r2 = 0
            r10 = 0
            r8 = 0
            goto L_0x00b8
        L_0x0126:
            java.lang.String r16 = "DASH"
            goto L_0x00a5
        L_0x012a:
            java.lang.String r16 = "DASH_LIVE"
            goto L_0x00a5
        L_0x012e:
            java.lang.String r16 = "PROGRESSIVE_DOWNLOAD"
            goto L_0x00a5
        L_0x0132:
            java.lang.String r16 = "RTC_LIVE"
            goto L_0x00a5
        L_0x0136:
            java.lang.String r16 = "HLS"
            goto L_0x00a5
        L_0x013a:
            r1 = 0
            goto L_0x0099
        L_0x013d:
            X.9mU r3 = r2.A01
            boolean r1 = X.C202709mU.A03(r3)
            if (r1 == 0) goto L_0x0149
            long r3 = r3.A05
            goto L_0x007b
        L_0x0149:
            X.9jS r1 = r3.A07
            long r1 = r1.A0C
            long r3 = X.C202709mU.A00(r3, r1)
            goto L_0x007b
        L_0x0153:
            X.A0b r1 = r4.A0f
            long r34 = r1.BG6()
            goto L_0x0065
        L_0x015b:
            r5 = -1
            r44 = -1
            r11 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204369pt.A01(long, boolean):X.9ug");
    }

    private AUJ A02() {
        C202509m3 r4;
        int A002;
        int i;
        AUR aur = this.A0p;
        if (aur.useNetworkAwareSettingsForUnstallBuffer && (r4 = (C202509m3) this.A0x.get()) != null) {
            if (this.A10 != null && this.A10.A00()) {
                A002 = C202509m3.A00(r4, 4);
                i = 5;
            } else if (this.A10 == null || !"fb_stories".equalsIgnoreCase(this.A10.A0F.A0B) || aur.disableStoriesCustomizedUnstallBuffer) {
                A002 = C202509m3.A00(r4, 2);
                i = 3;
            } else {
                A002 = C202509m3.A00(r4, 6);
                i = 7;
            }
            AUJ auj = new AUJ(A002, C202509m3.A00(r4, i));
            if (auj.minBufferMs > 0 && auj.minRebufferMs > 0) {
                return auj;
            }
        }
        if (this.A10 != null && this.A10.A00()) {
            AUJ auj2 = aur.unstallBufferSettingLive;
            if (auj2.minBufferMs > 0 && auj2.minRebufferMs > 0) {
                return auj2;
            }
        }
        return aur.unstallBufferSetting;
    }

    private String A03() {
        if (this.A10 == null || this.A10.A0F.A05 == null) {
            return "";
        }
        return this.A10.A0F.A05.toString();
    }

    private String A04() {
        C195979Xa r0 = this.A10;
        if (r0 != null) {
            return r0.A0F.A0H;
        }
        return null;
    }

    public static void A09(Message message, C204369pt r2) {
        if (!r2.A14) {
            r2.A0l.sendMessage(message);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        X.C90484aE.A0z();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(android.view.Surface r3, X.C204369pt r4, boolean r5) {
        /*
            X.9n2 r0 = r4.A12
            X.9mU r2 = r0.A01
            X.B5Q[] r1 = r0.A0D
            r0 = 0
            r0 = r1[r0]
            X.9Xx r2 = r2.A06(r0)
            r0 = 1
            r2.A01(r0)
            r2.A02(r3)
            r2.A00()
            if (r5 == 0) goto L_0x0040
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x003d }
            boolean r0 = r2.A07     // Catch:{ all -> 0x003a }
            X.C200319h9.A02(r0)     // Catch:{ all -> 0x003a }
            android.os.Looper r0 = r2.A03     // Catch:{ all -> 0x003a }
            java.lang.Thread r1 = r0.getThread()     // Catch:{ all -> 0x003a }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003a }
            boolean r0 = X.C36371kC.A1W(r1, r0)
            X.C200319h9.A02(r0)     // Catch:{ all -> 0x003a }
        L_0x0030:
            boolean r0 = r2.A06     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
            r2.wait()     // Catch:{ all -> 0x003a }
            goto L_0x0030
        L_0x0038:
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x003d }
            goto L_0x0040
        L_0x003a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x003d }
            throw r0     // Catch:{ InterruptedException -> 0x003d }
        L_0x003d:
            X.C90484aE.A0z()
        L_0x0040:
            r4.A0G = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204369pt.A0A(android.view.Surface, X.9pt, boolean):void");
    }

    public static void A0B(C204369pt r6) {
        if (r6.A0Z && r6.A13) {
            A0F(r6, "Call ExoPlayer.prepare()", new Object[0]);
            C202979n2 r0 = r6.A12;
            boolean z = r6.A0h;
            B38 b38 = r0.A04;
            if (b38 != null) {
                r0.A01.A0B(b38, z, true);
            }
            if (r6.A0h) {
                r6.A0h = false;
            }
            AUR aur = r6.A0p;
            if (aur.forceStereoToMonoConversion) {
                A0F(r6, "convertStereoToMono", new Object[0]);
                A08(r6.A0l, r6, true, 32);
            }
            if (aur.enableWifiLockManager) {
                throw AnonymousClass001.A0A("isOnWifi");
            }
            C195979Xa r3 = r6.A10;
            Set set = aur.wakelockOriginLists;
            if (!set.isEmpty() && r3 != null && (set.contains("all_origin") || set.contains(r3.A0F.A0C))) {
                r6.A0P(true);
            }
            r6.A13 = false;
        }
    }

    public static void A0F(C204369pt r1, String str, Object... objArr) {
        C200599hh.A00(r1, "HeroServicePlayer", str, objArr);
    }

    public static void A0G(C204369pt r9, boolean z) {
        long j = r9.A0C;
        if (j != -1 && z) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            r9.A07 = elapsedRealtime;
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass000.A1M(A0L2, 0, elapsedRealtime);
            C200599hh.A00(r9, "HeroService", "blackscreen detected for %d ms", A0L2);
            r9.A0C = -1;
        }
    }

    private void A0H(String str) {
        String str2 = this.A0U;
        if (str2 != null) {
            str = AnonymousClass000.A0p("; ", str, AnonymousClass000.A0v(str2));
        }
        this.A0U = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        r1 = X.C90524aI.A0o("Proxy-Status", r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(X.AnonymousClass927 r18, X.AnonymousClass902 r19) {
        /*
            r17 = this;
            r10 = r19
            X.906 r7 = X.AnonymousClass906.A07
            r11 = r18
            java.lang.String r12 = r11.getMessage()
            java.lang.Throwable r0 = r11.getCause()
            boolean r0 = r0 instanceof java.io.IOException
            r13 = 0
            r9 = 1
            java.lang.String r3 = ""
            r16 = r3
            r5 = r17
            if (r0 == 0) goto L_0x0244
            java.lang.Throwable r2 = r11.getCause()
            boolean r0 = r2 instanceof X.C187398xn
            if (r0 == 0) goto L_0x0026
            X.902 r10 = X.AnonymousClass902.A01
            X.906 r7 = X.AnonymousClass906.A01
        L_0x0026:
            boolean r0 = r2 instanceof X.AnonymousClass83K
            if (r0 != 0) goto L_0x0036
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass83K
            if (r0 == 0) goto L_0x0077
            java.lang.Throwable r2 = r2.getCause()
        L_0x0036:
            X.83K r2 = (X.AnonymousClass83K) r2
            if (r2 == 0) goto L_0x0077
            int r1 = r2.responseCode
            r0 = 200(0xc8, float:2.8E-43)
            r3 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x021d
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 == r0) goto L_0x0219
            r0 = 410(0x19a, float:5.75E-43)
            if (r1 == r0) goto L_0x0215
            if (r1 == r3) goto L_0x021d
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x0211
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x020d
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x0209
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0205
            switch(r1) {
                case 502: goto L_0x0201;
                case 503: goto L_0x01fd;
                case 504: goto L_0x01f9;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.util.Map r1 = r2.headerFields
            if (r1 == 0) goto L_0x01f6
            java.lang.String r0 = "Proxy-Status"
            java.util.List r1 = X.C90524aI.A0o(r0, r1)
            if (r1 == 0) goto L_0x01f6
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01f6
            java.lang.Object r3 = X.C36391kE.A0t(r1)
            java.lang.String r3 = (java.lang.String) r3
        L_0x0077:
            r6 = 5
            r2 = 0
            if (r12 == 0) goto L_0x01c6
            java.lang.String r0 = "TigonError"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x01c6
            X.902 r10 = X.AnonymousClass902.A0A
            java.lang.String r0 = "TigonLigerErrorDomain"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x01ae
            X.906 r7 = X.AnonymousClass906.A0P
        L_0x008f:
            X.902 r0 = X.AnonymousClass902.A02
            if (r10 != r0) goto L_0x00a0
            r14 = r11
            java.lang.String r12 = r11.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x010b
            java.lang.String r12 = "Decoder init failed"
        L_0x00a0:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r8 = 2
            if (r0 == 0) goto L_0x00c5
            java.lang.Throwable r0 = r11.getCause()
            if (r0 == 0) goto L_0x0106
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = X.C90484aE.A0k(r11)
            r1[r2] = r0
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r0 = X.C90484aE.A0k(r0)
            r1[r9] = r0
            java.lang.String r0 = "%s. Cause: %s"
            java.lang.String r12 = java.lang.String.format(r0, r1)
        L_0x00c5:
            X.906 r0 = X.AnonymousClass906.A09
            if (r7 != r0) goto L_0x02c9
            java.lang.Throwable r15 = r11.getCause()
            r14 = 1
        L_0x00ce:
            if (r15 == 0) goto L_0x02c9
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x02c9
            java.lang.Throwable r0 = r15.getCause()
            java.lang.String r1 = X.C90484aE.A0k(r0)
            boolean r0 = r12.contains(r1)
            if (r0 != 0) goto L_0x00fd
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Integer r0 = X.C165617ti.A0X(r12, r4, r2, r14)
            r4[r9] = r0
            X.C90514aH.A1O(r1, r0, r4)
            r1 = 4
            java.lang.Throwable r0 = r15.getCause()
            X.C90514aH.A1U(r0, r4, r1)
            java.lang.String r0 = "%s [Cause%d: %s; Message%d: %s]"
            java.lang.String r12 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r4)
        L_0x00fd:
            java.lang.Throwable r15 = r15.getCause()
            int r14 = r14 + 1
            if (r14 >= r6) goto L_0x02c9
            goto L_0x00ce
        L_0x0106:
            java.lang.String r12 = X.C90484aE.A0k(r11)
            goto L_0x00c5
        L_0x010b:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r12.split(r0)
            r1 = r0[r2]
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x011a
            r12 = r1
        L_0x011a:
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r8 = "%s. Cause: %s"
            r1 = 2
            if (r0 == 0) goto L_0x01a5
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x01a5
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r12
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r0 = r0.getMessage()
        L_0x0139:
            r4[r9] = r0
            java.lang.String r12 = java.lang.String.format(r8, r4)
            X.AUR r0 = r5.A0p
            boolean r0 = r0.enableAdditionalDecoderInitFailureMessage
            if (r0 == 0) goto L_0x0171
            java.lang.Throwable r0 = r11.getCause()
            if (r0 == 0) goto L_0x01a0
            java.lang.Throwable r0 = r11.getCause()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            if (r0 == 0) goto L_0x01a0
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r8 = android.util.Log.getStackTraceString(r0)
        L_0x015d:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0171
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0v(r12)
            java.lang.String r0 = ". Stack Track: "
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r4)
            java.lang.String r12 = X.C36321k7.A0D(r0, r8)
        L_0x0171:
            java.lang.Throwable r0 = r14.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass929
            if (r0 == 0) goto L_0x0199
            java.lang.Throwable r0 = r14.getCause()
            X.929 r0 = (X.AnonymousClass929) r0
            java.lang.String r0 = r0.diagnosticInfo
            if (r0 == 0) goto L_0x0199
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r12
            java.lang.Throwable r0 = r14.getCause()
            X.929 r0 = (X.AnonymousClass929) r0
            java.lang.String r0 = r0.diagnosticInfo
            r1[r9] = r0
            java.lang.String r0 = "%s. DiagnosticInfo: %s"
            java.lang.String r12 = java.lang.String.format(r13, r0, r1)
            goto L_0x00a0
        L_0x0199:
            java.lang.Throwable r14 = r14.getCause()
            if (r14 == 0) goto L_0x00a0
            goto L_0x0171
        L_0x01a0:
            java.lang.String r8 = android.util.Log.getStackTraceString(r11)
            goto L_0x015d
        L_0x01a5:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r12
            java.lang.Throwable r0 = r11.getCause()
            goto L_0x0139
        L_0x01ae:
            java.lang.String r0 = "TigonIdleTimeoutDomain"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x01ba
            X.906 r7 = X.AnonymousClass906.A0O
            goto L_0x008f
        L_0x01ba:
            java.lang.String r0 = "TigonConnectionTimeoutDomain"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x008f
            X.906 r7 = X.AnonymousClass906.A0N
            goto L_0x008f
        L_0x01c6:
            X.906 r8 = X.AnonymousClass906.A05
            if (r7 != r8) goto L_0x01ce
            X.902 r10 = X.AnonymousClass902.A02
            goto L_0x008f
        L_0x01ce:
            X.906 r0 = X.AnonymousClass906.A08
            if (r7 != r0) goto L_0x01d6
            X.902 r10 = X.AnonymousClass902.A09
            goto L_0x008f
        L_0x01d6:
            r4 = r11
            r1 = 0
        L_0x01d8:
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L_0x008f
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass929
            if (r0 == 0) goto L_0x01eb
            X.902 r10 = X.AnonymousClass902.A02
            r7 = r8
            goto L_0x008f
        L_0x01eb:
            java.lang.Throwable r4 = r4.getCause()
            int r1 = r1 + 1
            if (r1 >= r6) goto L_0x008f
            if (r4 == 0) goto L_0x008f
            goto L_0x01d8
        L_0x01f6:
            r3 = 0
            goto L_0x0077
        L_0x01f9:
            X.906 r7 = X.AnonymousClass906.A0M
            goto L_0x005f
        L_0x01fd:
            X.906 r7 = X.AnonymousClass906.A0L
            goto L_0x005f
        L_0x0201:
            X.906 r7 = X.AnonymousClass906.A0K
            goto L_0x005f
        L_0x0205:
            X.906 r7 = X.AnonymousClass906.A0F
            goto L_0x005f
        L_0x0209:
            X.906 r7 = X.AnonymousClass906.A0E
            goto L_0x005f
        L_0x020d:
            X.906 r7 = X.AnonymousClass906.A0J
            goto L_0x005f
        L_0x0211:
            X.906 r7 = X.AnonymousClass906.A0I
            goto L_0x005f
        L_0x0215:
            X.906 r7 = X.AnonymousClass906.A0G
            goto L_0x005f
        L_0x0219:
            X.906 r7 = X.AnonymousClass906.A0D
            goto L_0x005f
        L_0x021d:
            r5.A0a = r9
            java.util.Map r1 = r2.headerFields
            java.lang.String r0 = "x-fb-video-replica"
            java.util.List r1 = X.C90524aI.A0o(r0, r1)
            if (r1 == 0) goto L_0x023d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x023d
            java.lang.Object r12 = X.C36391kE.A0t(r1)
            java.lang.String r12 = (java.lang.String) r12
        L_0x0235:
            int r0 = r2.responseCode
            if (r0 != r3) goto L_0x0240
            X.906 r7 = X.AnonymousClass906.A0H
            goto L_0x005f
        L_0x023d:
            java.lang.String r12 = "invalid-replica-number"
            goto L_0x0235
        L_0x0240:
            X.906 r7 = X.AnonymousClass906.A08
            goto L_0x005f
        L_0x0244:
            java.lang.String r0 = r11.getMessage()
            java.lang.String r1 = "Decoder init failed"
            if (r0 == 0) goto L_0x025a
            java.lang.String r0 = r11.getMessage()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x025a
        L_0x0256:
            X.906 r7 = X.AnonymousClass906.A05
            goto L_0x0077
        L_0x025a:
            java.lang.Throwable r0 = r11.getCause()
            if (r0 == 0) goto L_0x0287
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x0287
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r0 = r0.getMessage()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0287
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r0 = r0.getMessage()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0287
            goto L_0x0256
        L_0x0287:
            java.lang.Throwable r0 = r11.getCause()
            boolean r0 = r0 instanceof X.C1889991q
            if (r0 == 0) goto L_0x0293
            X.906 r7 = X.AnonymousClass906.A02
            goto L_0x0077
        L_0x0293:
            java.lang.Throwable r0 = r11.getCause()
            boolean r1 = r0 instanceof java.lang.IllegalStateException
            java.lang.Throwable r0 = r11.getCause()
            if (r1 == 0) goto L_0x02bd
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x02b9
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "Media source is null"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x02b9
            X.906 r7 = X.AnonymousClass906.A0B
            goto L_0x0077
        L_0x02b9:
            X.906 r7 = X.AnonymousClass906.A09
            goto L_0x0077
        L_0x02bd:
            boolean r0 = r0 instanceof X.AnonymousClass92Q
            if (r0 == 0) goto L_0x02c5
            X.906 r7 = X.AnonymousClass906.A0R
            goto L_0x0077
        L_0x02c5:
            X.906 r7 = X.AnonymousClass906.A0C
            goto L_0x0077
        L_0x02c9:
            boolean r0 = r11 instanceof X.AnonymousClass82J
            if (r0 == 0) goto L_0x0333
            r4 = r11
            X.82J r4 = (X.AnonymousClass82J) r4
            int r0 = r4.type
            if (r0 != r9) goto L_0x0333
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r12)
            java.lang.String r0 = ". Renderer index="
            r1.append(r0)
            int r12 = r4.rendererIndex
            r1.append(r12)
            java.lang.String r0 = ", type="
            r1.append(r0)
            X.9n2 r0 = r5.A12
            if (r0 == 0) goto L_0x03ff
            X.B5Q[] r0 = r0.A0D
            if (r0 != 0) goto L_0x03e9
            java.lang.String r0 = "?"
        L_0x02f1:
            r1.append(r0)
            java.lang.String r0 = ", format="
            r1.append(r0)
            X.9uY r0 = r4.rendererFormat
            r1.append(r0)
            java.lang.String r0 = ", rendererSupport="
            r1.append(r0)
            int r0 = r4.rendererFormatSupport
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A08(r0)
            java.lang.String r12 = X.AnonymousClass000.A0q(r0, r1)
            int r1 = r4.type
            r0 = 1
            if (r1 == r9) goto L_0x0313
            r0 = 0
        L_0x0313:
            X.C200319h9.A02(r0)
            java.lang.Throwable r1 = r4.getCause()
            java.util.Objects.requireNonNull(r1)
            java.lang.Exception r1 = (java.lang.Exception) r1
            boolean r0 = r1 instanceof X.AnonymousClass929
            if (r0 == 0) goto L_0x03d8
            X.929 r1 = (X.AnonymousClass929) r1
            X.9l7 r0 = r1.codecInfo
            if (r0 != 0) goto L_0x03d4
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass5UT
            if (r0 == 0) goto L_0x03c8
            java.lang.String r13 = "error querying decoder"
        L_0x0333:
            X.AUR r4 = r5.A0p
            boolean r0 = r4.enableUnexpectedExoExceptionLogging
            if (r0 == 0) goto L_0x0357
            X.906 r0 = X.AnonymousClass906.A0C
            if (r7 != r0) goto L_0x0357
            X.902 r0 = X.AnonymousClass902.A07
            if (r10 != r0) goto L_0x0357
            java.lang.String r11 = android.util.Log.getStackTraceString(r11)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "message: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " stacktrace: "
            java.lang.String r12 = X.AnonymousClass000.A0p(r0, r11, r1)
        L_0x0357:
            X.9iQ r11 = new X.9iQ
            r11.<init>(r7, r10, r12, r3)
            if (r13 == 0) goto L_0x0360
            r11.A00 = r13
        L_0x0360:
            java.lang.String r3 = r11.A03
            r5.A0T = r3
            android.os.Handler r10 = r5.A0l
            java.lang.Object[] r7 = new java.lang.Object[r6]
            X.902 r6 = r11.A02
            java.lang.String r0 = r6.value
            r7[r2] = r0
            X.906 r0 = r11.A01
            java.lang.String r2 = r0.name()
            r7[r9] = r2
            r7[r8] = r3
            java.lang.String r1 = r11.A04
            if (r1 != 0) goto L_0x037e
            r1 = r16
        L_0x037e:
            r0 = 3
            r7[r0] = r1
            r1 = 4
            java.lang.String r0 = r11.A00
            if (r0 == 0) goto L_0x0388
            r16 = r0
        L_0x0388:
            r7[r1] = r16
            r0 = 12
            A08(r10, r5, r7, r0)
            boolean r0 = r4.reportExceptionsAsSoftErrors
            if (r0 == 0) goto L_0x03c7
            java.util.Set r1 = r4.softErrorErrorDomainBlacklist
            java.lang.String r0 = r6.name()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x03c7
            java.util.Set r0 = r4.softErrorErrorCodeBlacklist
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x03c7
            if (r3 == 0) goto L_0x03c7
            java.util.Set r0 = r4.softErrorErrorMessageBlacklist
            java.util.Iterator r2 = r0.iterator()
        L_0x03af:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03c7
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            if (r1 == 0) goto L_0x03af
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x03af
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x03af
        L_0x03c7:
            return
        L_0x03c8:
            boolean r0 = r1.secureDecoderRequired
            if (r0 == 0) goto L_0x03d0
            java.lang.String r13 = "error no secure decoder"
            goto L_0x0333
        L_0x03d0:
            java.lang.String r13 = "no secure decoder"
            goto L_0x0333
        L_0x03d4:
            java.lang.String r13 = "error instantiating decoder"
            goto L_0x0333
        L_0x03d8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "exoplayer_error_type_"
            r1.append(r0)
            int r0 = r4.type
            java.lang.String r13 = X.C36381kD.A10(r1, r0)
            goto L_0x0333
        L_0x03e9:
            r0 = r0[r12]
            X.9zD r0 = (X.C208949zD) r0
            int r0 = r0.A0B
            if (r0 == r9) goto L_0x03fb
            if (r0 == r8) goto L_0x03f7
            java.lang.String r0 = "text"
            goto L_0x02f1
        L_0x03f7:
            java.lang.String r0 = "video"
            goto L_0x02f1
        L_0x03fb:
            java.lang.String r0 = "audio"
            goto L_0x02f1
        L_0x03ff:
            r0 = r16
            goto L_0x02f1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204369pt.A0O(X.927, X.902):void");
    }

    public void A0P(boolean z) {
        AnonymousClass9L6 r3 = this.A0J;
        if (r3 == null) {
            r3 = new AnonymousClass9L6(this.A0D);
            this.A0J = r3;
        }
        if (z && r3.A00 == null) {
            PowerManager powerManager = r3.A03;
            if (powerManager == null) {
                Log.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            r3.A00 = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        r3.A01 = z;
        PowerManager.WakeLock wakeLock = r3.A00;
        if (wakeLock == null) {
            return;
        }
        if (!z || !r3.A02) {
            wakeLock.release();
        } else {
            wakeLock.acquire();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03d2, code lost:
        if (r5 != 3) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05c0, code lost:
        if (r12 == X.AnonymousClass902.A01) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0686, code lost:
        if (r8.enableKillVideoProcessForAudioTrackInitFailed == false) goto L_0x0688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0688, code lost:
        r6 = r0.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x068c, code lost:
        if (r6.disableAudioRendererOnAudioTrackInitFailed == false) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0690, code lost:
        if (r0.A10 == null) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x069a, code lost:
        if (r0.A10.A0F.A07 == X.C023109s.A00) goto L_0x06a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06a4, code lost:
        if (r0.A10.A0F.A07 != X.C023109s.A0C) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06a6, code lost:
        r3 = A17 + 1;
        A17 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06ae, code lost:
        if (r3 < r6.audioTrackInitFailedFallbackApplyThreshold) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06b0, code lost:
        A0H("disableAudioTrack");
        r6 = r0.A0o;
        r6.BX3(r12.value, r5.name(), r25, r24, A03(), "disableAudioTrack", r0.A10.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x06d9, code lost:
        if (r0.A12.A03(1) == -1) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06db, code lost:
        A0F(r0, "disable AudioTrack", new java.lang.Object[0]);
        r0.A12.A06(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06e7, code lost:
        r0.A0X = true;
        A0K(true);
        r6.Bkb(r12.name(), "AUDIO_TRACK_INIT_FAILED_VIDEO_ONLY_FALLBACK", r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0718, code lost:
        if (r8.enableKillVideoProcessForIllegalStateException != false) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0763, code lost:
        if ((r18 - r15) >= r8.killVideoProcessOnExoPlaybackExceptionRetryTimeMs) goto L_0x0765;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07ac, code lost:
        if (r5 != r22) goto L_0x07ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07ae, code lost:
        r6 = r0.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07b2, code lost:
        if (r6.enableCheckAudioError == false) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07b4, code lost:
        if (r5 != r14) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07b8, code lost:
        if (r12 != X.AnonymousClass902.A05) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x07ba, code lost:
        if (r25 == null) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07c4, code lost:
        if (r25.contains("Audio") == false) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0848, code lost:
        if (r6.setPlayWhenReadyOnError == false) goto L_0x0857;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0850, code lost:
        if (r0.A12.A01.A0E == false) goto L_0x0857;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0852, code lost:
        r0.A12.A0A(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0857, code lost:
        r3 = r0.A0o;
        r4 = r12.name();
        r5 = r5.name();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0863, code lost:
        if (r0.A10 == null) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0865, code lost:
        r0 = r0.A10.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0869, code lost:
        r3.BWs(r4, r5, r25, r24, r0, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0873, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0874, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0884, code lost:
        r0 = r0.A01.A06(r0.A0D[1]);
        r0.A01(r3);
        r0.A02(r4);
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0897, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08e9, code lost:
        if (r10.equals(r0.A0y) != false) goto L_0x0ce7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08eb, code lost:
        r0.A0y = r10;
        r0.A0o.BZn(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08f2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0921, code lost:
        A07(android.os.SystemClock.elapsedRealtime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0928, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x099c, code lost:
        if (r5.equals(r0.A11) != false) goto L_0x0ce7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x099e, code lost:
        r0.A11 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x09a0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0b65, code lost:
        A0F(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0b68, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0ce7, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0d1b, code lost:
        r0.A09(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0d1e, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0682  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0712  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0757  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x075c  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0816  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0842  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r58) {
        /*
            r57 = this;
            r7 = r58
            int r2 = r7.what
            r5 = 4
            r6 = 3
            r4 = 2
            r1 = 1
            r3 = 0
            r0 = r57
            switch(r2) {
                case 1: goto L_0x0015;
                case 2: goto L_0x037d;
                case 3: goto L_0x03ee;
                case 4: goto L_0x0401;
                case 5: goto L_0x0439;
                case 6: goto L_0x0443;
                case 7: goto L_0x0458;
                case 8: goto L_0x0326;
                case 9: goto L_0x047c;
                case 10: goto L_0x0921;
                case 11: goto L_0x049f;
                case 12: goto L_0x04a3;
                case 13: goto L_0x087e;
                case 14: goto L_0x0877;
                case 15: goto L_0x089d;
                case 16: goto L_0x08f3;
                case 17: goto L_0x092e;
                case 18: goto L_0x09a1;
                case 19: goto L_0x09c6;
                case 20: goto L_0x000e;
                case 21: goto L_0x0a04;
                case 22: goto L_0x0a3e;
                case 23: goto L_0x0a44;
                case 24: goto L_0x0898;
                case 25: goto L_0x0ce7;
                case 26: goto L_0x0a4e;
                case 27: goto L_0x0a79;
                case 28: goto L_0x0a83;
                case 29: goto L_0x0a87;
                case 30: goto L_0x0ce7;
                case 31: goto L_0x0ce7;
                case 32: goto L_0x0a91;
                case 33: goto L_0x0abd;
                case 34: goto L_0x0b21;
                case 35: goto L_0x0b61;
                case 36: goto L_0x000f;
                case 37: goto L_0x0929;
                case 38: goto L_0x0b69;
                case 39: goto L_0x000e;
                case 40: goto L_0x0c29;
                case 41: goto L_0x0c36;
                case 42: goto L_0x0c43;
                case 43: goto L_0x0c9d;
                case 44: goto L_0x000e;
                case 45: goto L_0x0cc6;
                case 46: goto L_0x0cd0;
                case 47: goto L_0x0ce8;
                case 48: goto L_0x0d0c;
                case 49: goto L_0x0cf9;
                case 50: goto L_0x0ce0;
                case 51: goto L_0x0d1f;
                default: goto L_0x000e;
            }
        L_0x000e:
            return r3
        L_0x000f:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = "onRenderInternal"
            goto L_0x0b65
        L_0x0015:
            java.lang.Object r2 = r7.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r7 = r2[r3]
            X.9Xa r7 = (X.C195979Xa) r7
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r2 = "prepareInternal"
            A0F(r0, r2, r5)
            java.util.Objects.requireNonNull(r7)
            X.9um r2 = r7.A0F
            java.util.Objects.requireNonNull(r2)
            X.9Xa r5 = r0.A10
            if (r5 == 0) goto L_0x0066
            X.9Xa r5 = r0.A10
            X.9um r5 = r5.A0F
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0066
            X.9Xa r2 = r0.A10
            if (r2 == 0) goto L_0x004c
            X.9Xa r2 = r0.A10
            X.5RZ r4 = r2.A05
            X.5RZ r2 = r7.A05
            if (r4 == r2) goto L_0x004c
            X.9Xa r4 = r0.A10
            X.5RZ r2 = r7.A05
            r4.A05 = r2
        L_0x004c:
            X.9Xa r2 = r0.A10
            if (r2 == 0) goto L_0x0060
            X.9Xa r2 = r0.A10
            java.lang.String r2 = r2.A08
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0060
            X.9Xa r4 = r0.A10
            java.lang.String r2 = r7.A08
            r4.A08 = r2
        L_0x0060:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = "skip prepareInternal due to same request"
            goto L_0x0b65
        L_0x0066:
            r0.A10 = r7
            X.9n2 r5 = r0.A12
            X.9mU r5 = r5.A01
            if (r5 == 0) goto L_0x0082
            X.9jS r5 = r5.A07
            int r5 = r5.A00
            if (r5 == r1) goto L_0x0082
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r5 = "Stopping non idle exoplayer"
            A0F(r0, r5, r6)
            X.9n2 r5 = r0.A12
            X.9mU r5 = r5.A01
            r5.A0C(r1)
        L_0x0082:
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.A0s
            boolean r5 = r5.get()
            if (r5 == 0) goto L_0x00cb
            r8 = 19
            monitor-enter(r0)
            java.lang.String r6 = "downgradePlaybackPriority"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x00c2 }
            A0F(r0, r6, r5)     // Catch:{ all -> 0x00c2 }
            java.lang.Integer r5 = r0.A0R     // Catch:{ all -> 0x00c2 }
            if (r5 != 0) goto L_0x00c5
            X.9n2 r5 = r0.A12     // Catch:{ all -> 0x00c2 }
            if (r5 == 0) goto L_0x00c5
            X.9n2 r5 = r0.A12     // Catch:{ all -> 0x00c2 }
            X.9mU r5 = r5.A01     // Catch:{ all -> 0x00c2 }
            X.9zp r5 = r5.A0I     // Catch:{ all -> 0x00c2 }
            android.os.HandlerThread r5 = r5.A0W     // Catch:{ all -> 0x00c2 }
            if (r5 == 0) goto L_0x00c5
            int r5 = r5.getThreadId()     // Catch:{ all -> 0x00c2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00c2 }
            if (r5 == 0) goto L_0x00c5
            int r6 = r5.intValue()     // Catch:{ Exception | IllegalArgumentException -> 0x00c5 }
            int r5 = android.os.Process.getThreadPriority(r6)     // Catch:{ Exception | IllegalArgumentException -> 0x00c5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception | IllegalArgumentException -> 0x00c5 }
            r0.A0R = r5     // Catch:{ Exception | IllegalArgumentException -> 0x00c5 }
            android.os.Process.setThreadPriority(r6, r8)     // Catch:{ Exception | IllegalArgumentException -> 0x00c5 }
            goto L_0x00c5
        L_0x00c2:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00c5:
            monitor-exit(r0)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.A0u
            r5.set(r8)
        L_0x00cb:
            X.AUJ r8 = r0.A02()
            X.9n2 r5 = r0.A12
            if (r5 == 0) goto L_0x00e9
            int r6 = r8.minBufferMs
            int r9 = r8.minRebufferMs
            X.B3Y r8 = r5.A02
            boolean r5 = r8 instanceof X.C208929zB
            if (r5 == 0) goto L_0x00e9
            X.9zB r8 = (X.C208929zB) r8
            int r5 = r6 * 1000
            long r5 = (long) r5
            r8.A04 = r5
            int r5 = r9 * 1000
            long r5 = (long) r5
            r8.A03 = r5
        L_0x00e9:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r5 = "buildMediaSource"
            A0F(r0, r5, r6)
            r0.A13 = r1
            X.9n2 r8 = r0.A12
            long r5 = r0.A0k
            r24 = r5
            X.9QR r6 = new X.9QR
            r6.<init>(r7, r0)
            X.9Xa r5 = r8.A08
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x0134
            r5 = 0
            r8.A05 = r5
            java.lang.String r5 = r2.A0A     // Catch:{ 91X | IOException -> 0x0115 }
            if (r5 == 0) goto L_0x0134
            X.AUR r5 = r8.A0O     // Catch:{ 91X | IOException -> 0x0115 }
            X.9XZ r5 = X.C203139nN.A01(r7, r5)     // Catch:{ 91X | IOException -> 0x0115 }
            r8.A05 = r5     // Catch:{ 91X | IOException -> 0x0115 }
            goto L_0x0134
        L_0x0115:
            r14 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r13 = r8.A09
            java.lang.String r12 = r2.A0H
            java.lang.String r11 = "MANIFEST"
            java.lang.String r10 = "MANIFEST_PARSE_ERROR"
            java.lang.String r5 = "Exception: "
            java.lang.StringBuilder r9 = X.C90524aI.A0i(r5)
            java.lang.String r5 = r14.getMessage()
            java.lang.String r9 = X.AnonymousClass000.A0q(r5, r9)
            X.89B r5 = new X.89B
            r5.<init>(r12, r11, r10, r9)
            r13.B2I(r5)
        L_0x0134:
            X.AUR r11 = r8.A0O
            boolean r5 = r11.playerRespawnExo2
            if (r5 != 0) goto L_0x013e
            boolean r5 = r11.isExo2Vp9Enabled
            if (r5 == 0) goto L_0x0161
        L_0x013e:
            X.9Xa r5 = r8.A08
            if (r5 == 0) goto L_0x0161
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0161
            X.9mU r5 = r8.A01
            if (r5 == 0) goto L_0x015e
            r5.A07()
            r8.A05()
            X.9nN r10 = r8.A0A
            X.9pt r9 = r8.A0M
            X.9XZ r5 = r8.A05
            X.B5Q[] r5 = r10.A07(r5, r7, r9)
            r8.A0D = r5
        L_0x015e:
            X.C202979n2.A01(r7, r8, r1)
        L_0x0161:
            boolean r5 = r11.checkLiveSourceUri
            if (r5 == 0) goto L_0x018e
            boolean r5 = r7.A00()
            if (r5 == 0) goto L_0x018e
            android.net.Uri r5 = r2.A05
            if (r5 != 0) goto L_0x018e
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "Media source is null, Null source video Uri for live video Manifest: "
            r5.append(r4)
            java.lang.String r2 = r2.A0A
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0g(r2, r5)
        L_0x017e:
            r6.A00(r2)
        L_0x0181:
            r4 = -1
            r0.A08 = r4
            r0.A0Y = r3
            X.AUR r2 = r0.A0p
            int r2 = r2.checkPlayerStateMinIntervalMs
            r0.A03 = r2
            return r1
        L_0x018e:
            X.9ej r12 = r8.A0B
            X.9nN r9 = r8.A0A
            X.9zx r5 = r8.A0N
            r23 = r5
            r9.A06(r2)
            android.net.Uri r5 = r2.A05
            r13 = 0
            if (r5 != 0) goto L_0x01ab
            java.lang.Integer r9 = r2.A07
            java.lang.Integer r5 = X.C023109s.A0R
            if (r9 == r5) goto L_0x01ab
        L_0x01a4:
            java.lang.String r2 = "Media source is null"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r2)
            goto L_0x017e
        L_0x01ab:
            java.lang.String r9 = "HeroExo2VodInitHelper"
            java.lang.String r5 = "creating Progressive MediaSource"
            android.util.Log.d(r9, r5)
            X.AUR r11 = r12.A07
            boolean r5 = r11.enableMP3Extractor
            if (r5 == 0) goto L_0x01eb
            android.net.Uri r5 = r2.A05
            if (r5 == 0) goto L_0x01de
            java.lang.String r5 = r5.getLastPathSegment()
            if (r5 == 0) goto L_0x01de
            android.net.Uri r5 = r2.A05
            java.lang.String r9 = r5.getLastPathSegment()
            java.lang.String r5 = ".mp3"
            boolean r5 = r9.endsWith(r5)
            if (r5 == 0) goto L_0x01de
        L_0x01d0:
            X.B91 r10 = new X.B91
            r10.<init>(r7, r12, r3)
        L_0x01d5:
            java.lang.Integer r9 = r2.A07
            java.lang.Integer r5 = X.C023109s.A0R
            if (r9 != r5) goto L_0x0216
            byte[] r9 = r2.A0S
            goto L_0x01f1
        L_0x01de:
            java.lang.String r9 = r2.A0G
            if (r9 == 0) goto L_0x01eb
            java.lang.String r5 = "undefined"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x01eb
            goto L_0x01d0
        L_0x01eb:
            X.B91 r10 = new X.B91
            r10.<init>(r7, r12, r1)
            goto L_0x01d5
        L_0x01f1:
            java.lang.String r15 = "bytes:///video"
            X.Abj r14 = new X.Abj     // Catch:{ MalformedURLException -> 0x0320, URISyntaxException -> 0x031a }
            r14.<init>(r9)     // Catch:{ MalformedURLException -> 0x0320, URISyntaxException -> 0x031a }
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0320, URISyntaxException -> 0x031a }
            r5.<init>(r13, r15, r14)     // Catch:{ MalformedURLException -> 0x0320, URISyntaxException -> 0x031a }
            java.net.URI r5 = r5.toURI()     // Catch:{ MalformedURLException -> 0x0320, URISyntaxException -> 0x031a }
            java.lang.String r5 = r5.toString()     // Catch:{ MalformedURLException -> 0x0320, URISyntaxException -> 0x031a }
            android.net.Uri r5 = X.C133036Wk.A01(r5)     // Catch:{ MalformedURLException -> 0x0320, URISyntaxException -> 0x031a }
            r2.A05 = r5
            X.83F r5 = new X.83F
            r5.<init>(r9)
            X.A0F r15 = new X.A0F
            r15.<init>(r5)
            goto L_0x0231
        L_0x0216:
            X.9NV r14 = r12.A06
            X.904 r16 = X.AnonymousClass904.PROGRESSIVE
            java.util.concurrent.atomic.AtomicBoolean r9 = r12.A0A
            java.util.concurrent.atomic.AtomicBoolean r5 = r12.A09
            X.AxD r15 = r7.A03
            if (r15 != 0) goto L_0x0231
            X.A0G r15 = new X.A0G
            r17 = r7
            r18 = r14
            r19 = r9
            r20 = r5
            r21 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21)
        L_0x0231:
            android.net.Uri r5 = r2.A05
            if (r5 == 0) goto L_0x01a4
            X.82s r9 = new X.82s
            r9.<init>(r5, r10, r15)
            boolean r5 = r11.enableHeroPlayerMaxLoopCount
            if (r5 == 0) goto L_0x024a
            boolean r5 = r7.A0A
            if (r5 == 0) goto L_0x024a
            int r10 = r7.A00
            X.82t r5 = new X.82t
            r5.<init>(r9, r10)
            r9 = r5
        L_0x024a:
            android.net.Uri r10 = r2.A04
            if (r10 == 0) goto L_0x029b
            java.lang.String r15 = "0"
            java.lang.String r5 = "application/x-subrip"
            X.7c0 r14 = X.C207099uY.CREATOR
            X.9en r14 = new X.9en
            r14.<init>()
            r14.A0P = r15
            r14.A0R = r5
            r14.A0F = r4
            r14.A0Q = r13
            X.9uY r5 = new X.9uY
            r5.<init>(r14)
            X.9NV r14 = r12.A06
            X.904 r16 = X.AnonymousClass904.DASH_TEXT
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.A0A
            java.util.concurrent.atomic.AtomicBoolean r12 = r12.A09
            X.A0G r15 = new X.A0G
            r17 = r7
            r18 = r14
            r19 = r13
            r20 = r12
            r21 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.util.Objects.requireNonNull(r15)
            boolean r11 = r11.subtitleDurationToMaxValue
            if (r11 == 0) goto L_0x0316
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0289:
            X.82r r12 = new X.82r
            r13 = r10
            r14 = r5
            r12.<init>(r13, r14, r15, r16)
            X.B38[] r4 = new X.B38[r4]
            r4[r3] = r9
            r4[r1] = r12
            X.82u r9 = new X.82u
            r9.<init>(r4)
        L_0x029b:
            boolean r2 = r2.A0R
            if (r2 == 0) goto L_0x02b4
            X.B38[] r10 = new X.B38[r1]
            r10[r3] = r9
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            int[] r4 = new int[r3]
            X.A05 r2 = new X.A05
            r2.<init>(r5, r4)
            X.82v r9 = new X.82v
            r9.<init>(r2, r10)
        L_0x02b4:
            java.lang.Integer r2 = X.C023109s.A0G
            X.9Gw r10 = new X.9Gw
            r10.<init>(r9, r2)
            r2 = r23
            r2.A00 = r7
            X.B38 r11 = r10.A00
            android.os.Handler r9 = r8.A0K
            r2 = r11
            X.9zw r2 = (X.C209399zw) r2
            X.9lP r4 = r2.A03
            boolean r2 = X.AnonymousClass000.A1V(r9)
            X.C200319h9.A01(r2)
            java.util.concurrent.CopyOnWriteArrayList r5 = r4.A02
            X.9GI r4 = new X.9GI
            r2 = r23
            r4.<init>(r9, r2)
            r5.add(r4)
            r8.A04 = r11
            r8.A08 = r7
            X.9XZ r2 = r8.A05
            X.AnonymousClass9Z1.A03(r2)
            java.lang.Integer r5 = r10.A01
            X.9pt r7 = r6.A01
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r2 = "prepareMediaSource onCompleted"
            A0F(r7, r2, r4)
            X.9Xa r2 = r6.A00
            X.74y r6 = new X.74y
            r6.<init>(r2, r7, r5)
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Handler r4 = r7.A0l
            android.os.Looper r2 = r4.getLooper()
            if (r5 == r2) goto L_0x0312
            r4.post(r6)
        L_0x0305:
            boolean r2 = r8.A0Q
            if (r2 == 0) goto L_0x0181
            X.9bF r2 = new X.9bF
            r2.<init>()
            r8.A07 = r2
            goto L_0x0181
        L_0x0312:
            r6.run()
            goto L_0x0305
        L_0x0316:
            r16 = -2
            goto L_0x0289
        L_0x031a:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x0320:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x0326:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r2 = "releaseInternal"
            A0F(r0, r2, r4)
            boolean r2 = r0.A14
            if (r2 != 0) goto L_0x0921
            boolean r2 = r0.A15
            if (r2 == 0) goto L_0x033f
            X.AUR r2 = r0.A0p
            boolean r2 = r2.pausePlayingVideoWhenRelease
            if (r2 == 0) goto L_0x033f
            r2 = 0
            r0.A0L(r3, r2)
        L_0x033f:
            X.9n2 r4 = r0.A12
            java.util.List r2 = r4.A0P
            r2.clear()
            X.9mU r2 = r4.A01
            r2.A07()
            android.os.HandlerThread r4 = r0.A0F
            if (r4 == 0) goto L_0x0358
            X.AUR r2 = r0.A0p
            boolean r2 = r2.quitHandlerSafely
            if (r2 == 0) goto L_0x0379
            r4.quitSafely()
        L_0x0358:
            r0.A14 = r1
            r0.A05()
            r2 = 0
            r0.A0I = r2
            r0.A0G = r2
            r0.A0H = r2
            r4 = -1
            r0.A0C = r4
            r0.A07 = r4
            X.9L6 r2 = r0.A0J
            if (r2 == 0) goto L_0x0921
            r2.A02 = r3
            android.os.PowerManager$WakeLock r2 = r2.A00
            if (r2 == 0) goto L_0x0921
            r2.release()
            goto L_0x0921
        L_0x0379:
            r4.quit()
            goto L_0x0358
        L_0x037d:
            java.lang.Object r2 = r7.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            long r3 = X.C165587tf.A0C(r2, r3)
            r10 = 0
            X.9n2 r7 = r0.A12
            java.lang.Object[] r5 = new java.lang.Object[r1]
            X.AnonymousClass000.A1M(r5, r10, r3)
            java.lang.String r2 = "playInternal: %d"
            A0F(r0, r2, r5)
            boolean r2 = r0.A0X
            if (r2 == 0) goto L_0x03ad
            X.9n2 r2 = r0.A12
            int r5 = r2.A03(r1)
            r2 = -1
            if (r5 != r2) goto L_0x03ab
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.String r2 = "enable AudioTrack"
            A0F(r0, r2, r5)
            X.9n2 r2 = r0.A12
            r2.A06(r1, r10)
        L_0x03ab:
            r0.A0X = r10
        L_0x03ad:
            boolean r2 = r0.A0d
            if (r2 == 0) goto L_0x03b6
            r0.A0I(r1)
            r0.A0d = r10
        L_0x03b6:
            A0B(r0)
            r8 = 0
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x03e5
            long r8 = r7.A04()
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x03e5
            X.9n2 r2 = r0.A12
            X.9mU r2 = r2.A01
            if (r2 == 0) goto L_0x03d4
            X.9jS r2 = r2.A07
            int r5 = r2.A00
            r2 = 1
            if (r5 == r6) goto L_0x03d5
        L_0x03d4:
            r2 = 0
        L_0x03d5:
            r0.A0g = r2
            r7.A07(r3)
            boolean r2 = r0.A0g
            if (r2 == 0) goto L_0x03e5
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r2 = "Delay sending play due to seek"
            A0F(r0, r2, r3)
        L_0x03e5:
            boolean r2 = r0.A0g
            if (r2 != 0) goto L_0x0921
            r7.A0A(r1)
            goto L_0x0921
        L_0x03ee:
            java.lang.Object r4 = r7.obj
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r2 = r4[r3]
            boolean r3 = X.AnonymousClass000.A1X(r2)
            r2 = r4[r1]
            java.lang.String r2 = (java.lang.String) r2
            r0.A0L(r3, r2)
            goto L_0x0921
        L_0x0401:
            java.lang.Object r2 = r7.obj
            long[] r2 = (long[]) r2
            r5 = r2[r3]
            r7 = r2[r1]
            r11 = 1
            r9 = r2[r4]
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0412
            r3 = 1
        L_0x0412:
            java.lang.Object[] r4 = X.C90524aI.A0w()
            java.lang.String r2 = "seekToInternal"
            A0F(r0, r2, r4)
            boolean r4 = r0.A0e
            X.9n2 r2 = r0.A12
            if (r4 == 0) goto L_0x0435
            r2.A08(r5, r3)
        L_0x0424:
            r0.A0A = r7
            X.A2g r4 = r0.A0o
            long r2 = android.os.SystemClock.elapsedRealtime()
            X.9ug r2 = r0.A01(r2, r1)
            r4.Bg5(r2, r5)
            goto L_0x0921
        L_0x0435:
            r2.A07(r5)
            goto L_0x0424
        L_0x0439:
            java.lang.Object r2 = r7.obj
            float r2 = X.C36441kJ.A03(r2)
            A0D(r0, r2)
            return r1
        L_0x0443:
            java.lang.Object r4 = r7.obj
            android.view.Surface r4 = (android.view.Surface) r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = "setSurfaceInternal"
            A0F(r0, r2, r3)
            r0.A0H = r4
            X.AUR r2 = r0.A0p
            boolean r2 = r2.useBlockingSetSurfaceExo2
            A0A(r4, r0, r2)
            return r1
        L_0x0458:
            java.lang.Object r5 = r7.obj
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = "releaseSurfaceInternal"
            A0F(r0, r2, r3)
            r4 = 0
            r0.A0I = r4     // Catch:{ all -> 0x0477 }
            r0.A0G = r4     // Catch:{ all -> 0x0477 }
            r0.A0H = r4     // Catch:{ all -> 0x0477 }
            r2 = -1
            r0.A0C = r2     // Catch:{ all -> 0x0477 }
            r0.A07 = r2     // Catch:{ all -> 0x0477 }
            A0A(r4, r0, r1)     // Catch:{ all -> 0x0477 }
            r5.send(r1, r4)
            return r1
        L_0x0477:
            r0 = move-exception
            r5.send(r1, r4)
            throw r0
        L_0x047c:
            java.lang.Object r5 = r7.obj
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r2 = r5[r3]
            int r2 = X.AnonymousClass000.A0I(r2)
            boolean r10 = X.AnonymousClass000.A1S(r2, r1)
            r2 = r5[r1]
            int r7 = X.AnonymousClass000.A0I(r2)
            long r8 = X.C165587tf.A0C(r5, r4)
            r2 = r5[r6]
            boolean r11 = X.AnonymousClass000.A1X(r2)
            r6 = r0
            r6.A06(r7, r8, r10, r11)
            return r1
        L_0x049f:
            r0.A0J(r1)
            return r1
        L_0x04a3:
            java.lang.Object r8 = r7.obj
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            r7 = r8[r3]
            java.lang.String r7 = (java.lang.String) r7
            r3 = r8[r1]
            java.lang.String r3 = (java.lang.String) r3
            r25 = r8[r4]
            r2 = r25
            java.lang.String r2 = (java.lang.String) r2
            r25 = r2
            r24 = r8[r6]
            r2 = r24
            java.lang.String r2 = (java.lang.String) r2
            r24 = r2
            r23 = r8[r5]
            r2 = r23
            java.lang.String r2 = (java.lang.String) r2
            r23 = r2
            X.902 r12 = X.AnonymousClass902.A00(r7)
            X.906 r5 = X.AnonymousClass906.A00(r3)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            X.C36341k9.A1I(r12, r5, r3)
            java.lang.String r2 = r0.A04()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3[r4] = r2
            java.lang.String r2 = "onPlayerError: %s, %s, %s"
            A0F(r0, r2, r3)
            X.906 r22 = X.AnonymousClass906.A02
            r4 = 0
            r2 = r22
            if (r5 != r2) goto L_0x05b2
            X.AUR r6 = r0.A0p
            boolean r2 = r6.enableEvictPlayerOnAudioTrackInitFailed
            if (r2 == 0) goto L_0x05b2
            int r3 = r0.A06
            int r2 = r6.maxRetryCountByEvictPlayerOnAudioTrackInitFailed
            if (r3 >= r2) goto L_0x05b2
            java.lang.String r2 = "evictPlayer"
            r0.A0H(r2)
            X.A2g r6 = r0.A0o
            java.lang.String r7 = r12.value
            java.lang.String r15 = "AUDIO_TRACK_INIT_FAILED"
            java.lang.String r18 = r0.A03()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "evictPlayer:"
            r3.append(r2)
            int r2 = r0.A06
            java.lang.String r19 = X.C36381kD.A10(r3, r2)
            X.9Xa r2 = r0.A10
            if (r2 == 0) goto L_0x0539
            X.9Xa r2 = r0.A10
            java.lang.String r2 = r2.A08
        L_0x051c:
            r13 = r6
            r14 = r7
            r16 = r25
            r17 = r24
            r20 = r2
            r13.BX3(r14, r15, r16, r17, r18, r19, r20)
            int r2 = r0.A06
            int r2 = r2 + 1
            r0.A06 = r2
            java.util.concurrent.atomic.AtomicInteger r18 = com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0h
            int r9 = r18.get()
            X.9UR r11 = r0.A0P
            long r2 = r0.A0k
            monitor-enter(r11)
            goto L_0x053c
        L_0x0539:
            java.lang.String r2 = ""
            goto L_0x051c
        L_0x053c:
            android.util.LruCache r13 = r11.A00     // Catch:{ all -> 0x05ae }
            java.util.Map r7 = r13.snapshot()     // Catch:{ all -> 0x05ae }
            java.util.Iterator r17 = X.AnonymousClass000.A0y(r7)     // Catch:{ all -> 0x05ae }
        L_0x0546:
            boolean r7 = r17.hasNext()     // Catch:{ all -> 0x05ae }
            if (r7 == 0) goto L_0x05b1
            java.util.Map$Entry r8 = X.AnonymousClass000.A11(r17)     // Catch:{ all -> 0x05ae }
            if (r8 == 0) goto L_0x0546
            java.lang.Object r7 = r8.getValue()     // Catch:{ all -> 0x05ae }
            if (r7 == 0) goto L_0x0546
            java.lang.Object r14 = r8.getValue()     // Catch:{ all -> 0x05ae }
            X.9pt r14 = (X.C204369pt) r14     // Catch:{ all -> 0x05ae }
            java.lang.Object r10 = r8.getKey()     // Catch:{ all -> 0x05ae }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x05ae }
            long r15 = r10.longValue()     // Catch:{ all -> 0x05ae }
            int r7 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x05b1
            X.9n2 r7 = r14.A12     // Catch:{ all -> 0x05ae }
            X.B5Q[] r7 = r7.A0D     // Catch:{ all -> 0x05ae }
            if (r7 == 0) goto L_0x0546
            r7 = r7[r1]     // Catch:{ all -> 0x05ae }
            X.9zD r7 = (X.C208949zD) r7     // Catch:{ all -> 0x05ae }
            int r8 = r7.A01     // Catch:{ all -> 0x05ae }
            if (r8 == r1) goto L_0x057d
            r7 = 2
            if (r8 != r7) goto L_0x0546
        L_0x057d:
            boolean r7 = r14.A15     // Catch:{ all -> 0x05ae }
            if (r7 != 0) goto L_0x0546
            java.lang.String r8 = "id [%d]: Evict player, id=%d"
            java.lang.Object[] r7 = X.AnonymousClass001.A0M()     // Catch:{ all -> 0x05ae }
            X.AnonymousClass000.A1M(r7, r4, r2)     // Catch:{ all -> 0x05ae }
            r7[r1] = r10     // Catch:{ all -> 0x05ae }
            X.C200599hh.A02(r8, r7)     // Catch:{ all -> 0x05ae }
            r13.remove(r10)     // Catch:{ all -> 0x05ae }
            monitor-exit(r11)
            r7 = 0
            int r2 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x05b2
            r7 = 0
        L_0x059a:
            r2 = 50
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x059f }
        L_0x059f:
            int r2 = r18.get()
            if (r2 < r9) goto L_0x0675
            if (r2 > r9) goto L_0x05b2
            int r7 = r7 + 1
            r2 = 20
            if (r7 >= r2) goto L_0x05b2
            goto L_0x059a
        L_0x05ae:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x05b1:
            monitor-exit(r11)
        L_0x05b2:
            X.906 r14 = X.AnonymousClass906.A09
            if (r5 != r14) goto L_0x05ba
            X.902 r2 = X.AnonymousClass902.A05
            if (r12 == r2) goto L_0x05c2
        L_0x05ba:
            X.906 r2 = X.AnonymousClass906.A01
            if (r5 != r2) goto L_0x067e
            X.902 r2 = X.AnonymousClass902.A01
            if (r12 != r2) goto L_0x07ae
        L_0x05c2:
            X.9Xa r2 = r0.A10
            if (r2 == 0) goto L_0x067e
            X.9Xa r2 = r0.A10
            X.9um r2 = r2.A0F
            java.lang.Integer r3 = r2.A07
            java.lang.Integer r2 = X.C023109s.A00
            if (r3 == r2) goto L_0x05da
            X.9Xa r2 = r0.A10
            X.9um r2 = r2.A0F
            java.lang.Integer r3 = r2.A07
            java.lang.Integer r2 = X.C023109s.A0C
            if (r3 != r2) goto L_0x067e
        L_0x05da:
            X.AUR r6 = r0.A0p
            boolean r2 = r6.enableEvictCacheOnExoplayerErrors
            if (r2 == 0) goto L_0x067e
            int r3 = r0.A05
            int r2 = r6.maxRetryCountByEvictCacheOnExoplayerErrors
            if (r3 >= r2) goto L_0x067e
            java.lang.String r2 = "evictCache"
            r0.A0H(r2)
            X.A2g r6 = r0.A0o
            java.lang.String r7 = r12.value
            java.lang.String r15 = r5.name()
            java.lang.String r18 = r0.A03()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "evictCache:"
            r3.append(r2)
            int r2 = r0.A05
            java.lang.String r19 = X.C36381kD.A10(r3, r2)
            X.9Xa r2 = r0.A10
            java.lang.String r2 = r2.A08
            r13 = r6
            r14 = r7
            r16 = r25
            r17 = r24
            r20 = r2
            r13.BX3(r14, r15, r16, r17, r18, r19, r20)
            int r2 = r0.A05
            int r2 = r2 + 1
            r0.A05 = r2
            X.9jy r8 = r0.A0L
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r2 = r0.A04()
            java.util.List r3 = X.C90524aI.A0p(r2, r3, r4)
            X.B5Y r11 = r8.A03()
            if (r11 == 0) goto L_0x0675
            r11.B97()
            java.util.Set r2 = r11.BDP()
            java.util.HashSet r9 = X.C90524aI.A0k(r3)
            java.util.Iterator r10 = r2.iterator()
        L_0x063c:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0672
            java.lang.String r3 = X.AnonymousClass001.A0C(r10)
            java.lang.String r2 = X.C1895394e.A00(r3)
            boolean r2 = r9.contains(r2)
            if (r2 == 0) goto L_0x063c
            X.B5Y r7 = r8.A03()
            if (r7 == 0) goto L_0x063c
            java.util.NavigableSet r2 = r7.B9B(r3)
            if (r2 == 0) goto L_0x063c
            java.util.Iterator r4 = r2.iterator()
        L_0x0660:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x063c
            java.lang.Object r3 = r4.next()
            X.AUg r3 = (X.C21664AUg) r3
            java.lang.String r2 = "api_eviction"
            r7.Bnz(r3, r2)
            goto L_0x0660
        L_0x0672:
            r11.B97()
        L_0x0675:
            r0.A0K(r1)
            float r2 = r0.A01
            A0D(r0, r2)
            goto L_0x06f7
        L_0x067e:
            r2 = r22
            if (r5 != r2) goto L_0x0712
            X.AUR r8 = r0.A0p
            boolean r2 = r8.enableKillVideoProcessForAudioTrackInitFailed
            if (r2 != 0) goto L_0x071a
        L_0x0688:
            X.AUR r6 = r0.A0p
            boolean r2 = r6.disableAudioRendererOnAudioTrackInitFailed
            if (r2 == 0) goto L_0x0846
            X.9Xa r2 = r0.A10
            if (r2 == 0) goto L_0x0846
            X.9Xa r2 = r0.A10
            X.9um r2 = r2.A0F
            java.lang.Integer r3 = r2.A07
            java.lang.Integer r2 = X.C023109s.A00
            if (r3 == r2) goto L_0x06a6
            X.9Xa r2 = r0.A10
            X.9um r2 = r2.A0F
            java.lang.Integer r3 = r2.A07
            java.lang.Integer r2 = X.C023109s.A0C
            if (r3 != r2) goto L_0x0846
        L_0x06a6:
            int r2 = A17
            int r3 = r2 + 1
            A17 = r3
            int r2 = r6.audioTrackInitFailedFallbackApplyThreshold
            if (r3 < r2) goto L_0x0846
            java.lang.String r7 = "disableAudioTrack"
            r0.A0H(r7)
            X.A2g r6 = r0.A0o
            java.lang.String r3 = r12.value
            java.lang.String r15 = r5.name()
            java.lang.String r18 = r0.A03()
            X.9Xa r2 = r0.A10
            java.lang.String r2 = r2.A08
            r13 = r6
            r14 = r3
            r16 = r25
            r17 = r24
            r19 = r7
            r20 = r2
            r13.BX3(r14, r15, r16, r17, r18, r19, r20)
            X.9n2 r2 = r0.A12
            int r2 = r2.A03(r1)
            r7 = -1
            if (r2 == r7) goto L_0x06e7
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "disable AudioTrack"
            A0F(r0, r2, r3)
            X.9n2 r2 = r0.A12
            r2.A06(r1, r7)
        L_0x06e7:
            r0.A0X = r1
            r0.A0K(r1)
            java.lang.String r4 = r12.name()
            java.lang.String r3 = "AUDIO_TRACK_INIT_FAILED_VIDEO_ONLY_FALLBACK"
            r2 = r25
            r6.Bkb(r4, r3, r2)
        L_0x06f7:
            java.lang.String r7 = r12.name()
            java.lang.String r4 = r5.name()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r25)
            java.lang.String r2 = ", "
            r3.append(r2)
            java.lang.String r0 = r0.A0U
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)
            r6.Bkb(r7, r4, r0)
            return r1
        L_0x0712:
            if (r5 != r14) goto L_0x07aa
            X.AUR r8 = r0.A0p
            boolean r2 = r8.enableKillVideoProcessForIllegalStateException
            if (r2 == 0) goto L_0x07ae
        L_0x071a:
            android.content.Context r2 = r0.A0D
            android.content.Context r2 = r2.getApplicationContext()
            android.content.SharedPreferences r13 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            java.lang.String r21 = "KillVideoPidOnExoException_VideoId"
            java.lang.String r3 = ""
            r2 = r21
            java.lang.String r9 = r13.getString(r2, r3)
            java.lang.String r2 = r0.A04()
            if (r2 == 0) goto L_0x0842
            java.lang.String r7 = r0.A04()
        L_0x0738:
            java.lang.String r20 = "KillVideoPidOnExoException_KillTime"
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r20
            long r15 = r13.getLong(r6, r2)
            long r18 = java.lang.System.currentTimeMillis()
            java.lang.String r17 = "KillVideoPidOnExoException_RetryCount"
            r6 = r17
            int r6 = r13.getInt(r6, r4)
            boolean r9 = r7.equals(r9)
            if (r9 != 0) goto L_0x0758
            r6 = 0
        L_0x0758:
            int r9 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x0765
            long r10 = r18 - r15
            long r2 = r8.killVideoProcessOnExoPlaybackExceptionRetryTimeMs
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r11 = 0
            if (r9 < 0) goto L_0x0766
        L_0x0765:
            r11 = 1
        L_0x0766:
            r2 = 6
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r4] = r7
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "Retrieve service player current position"
            A0F(r0, r2, r3)
            X.9n2 r2 = r0.A12
            if (r2 != 0) goto L_0x0816
            r2 = 0
        L_0x0778:
            X.AnonymousClass000.A1M(r10, r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r9 = 2
            r10[r9] = r2
            r3 = 3
            int r2 = r8.killVideoProcessOnExoPlaybackExceptionMaximumRetryCount
            X.AnonymousClass000.A1L(r10, r2, r3)
            r2 = 4
            X.AnonymousClass000.A1N(r10, r2, r11)
            long r2 = r8.killVideoProcessOnExoPlaybackExceptionRetryTimeMs
            r26 = r2
            r2 = 5
            r15 = r2
            r2 = r26
            X.AnonymousClass000.A1M(r10, r15, r2)
            java.lang.String r2 = "maybeRetryByRebirth: [vid=%s; currentPosition=%dMs; retryCount=%d(max=%d); coolingDownCompleted=%b(max=%d)]"
            java.lang.String r10 = java.lang.String.format(r2, r10)
            if (r6 != 0) goto L_0x07c8
            if (r11 != 0) goto L_0x07ce
        L_0x07a1:
            java.lang.Object[] r3 = X.C36431kI.A1a(r10, r5, r9)
            java.lang.String r2 = "%s, errorCode=%s, skip"
            A0F(r0, r2, r3)
        L_0x07aa:
            r2 = r22
            if (r5 == r2) goto L_0x0688
        L_0x07ae:
            X.AUR r6 = r0.A0p
            boolean r2 = r6.enableCheckAudioError
            if (r2 == 0) goto L_0x0846
            if (r5 != r14) goto L_0x0846
            X.902 r2 = X.AnonymousClass902.A05
            if (r12 != r2) goto L_0x0846
            if (r25 == 0) goto L_0x0846
            java.lang.String r3 = "Audio"
            r2 = r25
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0846
            goto L_0x0688
        L_0x07c8:
            if (r6 <= 0) goto L_0x07a1
            int r2 = r8.killVideoProcessOnExoPlaybackExceptionMaximumRetryCount
            if (r6 >= r2) goto L_0x07a1
        L_0x07ce:
            java.lang.String r2 = "restartVps"
            r0.A0H(r2)
            java.lang.Object[] r3 = X.C36431kI.A1a(r10, r5, r9)
            java.lang.String r2 = "%s, errorCode=%s, kill"
            A0F(r0, r2, r3)
            X.A2g r2 = r0.A0o
            r15 = r2
            java.lang.String r11 = r12.name()
            java.lang.String r8 = r5.name()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r25)
            java.lang.String r2 = ". "
            java.lang.String r3 = X.AnonymousClass000.A0p(r2, r10, r3)
            r15.Bkb(r11, r8, r3)
            android.content.SharedPreferences$Editor r8 = r13.edit()
            r2 = r21
            r8.putString(r2, r7)
            r7 = r20
            r2 = r18
            r8.putLong(r7, r2)
            int r3 = r6 + 1
            r2 = r17
            r8.putInt(r2, r3)
            r8.commit()
            int r2 = android.os.Process.myPid()
            android.os.Process.killProcess(r2)
            goto L_0x07a1
        L_0x0816:
            java.lang.Integer r3 = r0.A0S
            java.lang.Integer r2 = X.C023109s.A0C
            boolean r3 = X.C36361kB.A1a(r3, r2)
            X.9n2 r2 = r0.A12
            if (r3 == 0) goto L_0x083c
            X.9mU r2 = r2.A01
            X.9zp r3 = r2.A0I
            boolean r2 = r3.A0n
            r15 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x0835
            X.A0c r2 = r3.A0h
            long r2 = r2.BG6()
        L_0x0832:
            long r2 = r2 / r15
            goto L_0x0778
        L_0x0835:
            X.A0b r2 = r3.A0f
            long r2 = r2.BG6()
            goto L_0x0832
        L_0x083c:
            long r2 = r2.A04()
            goto L_0x0778
        L_0x0842:
            java.lang.String r7 = "null"
            goto L_0x0738
        L_0x0846:
            boolean r2 = r6.setPlayWhenReadyOnError
            if (r2 == 0) goto L_0x0857
            X.9n2 r2 = r0.A12
            X.9mU r2 = r2.A01
            boolean r2 = r2.A0E
            if (r2 == 0) goto L_0x0857
            X.9n2 r2 = r0.A12
            r2.A0A(r4)
        L_0x0857:
            X.A2g r3 = r0.A0o
            java.lang.String r4 = r12.name()
            java.lang.String r5 = r5.name()
            X.9Xa r2 = r0.A10
            if (r2 == 0) goto L_0x0874
            X.9Xa r0 = r0.A10
            java.lang.String r0 = r0.A08
        L_0x0869:
            r6 = r25
            r7 = r24
            r8 = r0
            r9 = r23
            r3.BWs(r4, r5, r6, r7, r8, r9)
            return r1
        L_0x0874:
            java.lang.String r0 = ""
            goto L_0x0869
        L_0x0877:
            java.lang.Object r4 = r7.obj
            X.9n2 r0 = r0.A12
            r3 = 10002(0x2712, float:1.4016E-41)
            goto L_0x0884
        L_0x087e:
            java.lang.Object r4 = r7.obj
            X.9n2 r0 = r0.A12
            r3 = 10001(0x2711, float:1.4014E-41)
        L_0x0884:
            X.9mU r2 = r0.A01
            X.B5Q[] r0 = r0.A0D
            r0 = r0[r1]
            X.9Xx r0 = r2.A06(r0)
            r0.A01(r3)
            r0.A02(r4)
            r0.A00()
            return r1
        L_0x0898:
            java.lang.Object r10 = r7.obj
            X.9uQ r10 = (X.C207019uQ) r10
            goto L_0x08e3
        L_0x089d:
            java.lang.Object r6 = r7.obj
            long[] r6 = (long[]) r6
            X.9uQ r10 = r0.A0y
            r4 = r6[r1]
            int r2 = (int) r4
            r36 = r2
            r24 = r6[r3]
            long r26 = android.os.SystemClock.elapsedRealtime()
            long r2 = r10.A03
            r18 = r2
            long r14 = r10.A07
            long r12 = r10.A06
            long r8 = r10.A08
            long r6 = r10.A01
            boolean r2 = r10.A0B
            r17 = r2
            long r4 = r10.A04
            long r2 = r10.A05
            boolean r11 = r10.A0C
            r16 = r11
            java.lang.String r11 = r10.A0A
            X.9uQ r10 = new X.9uQ
            r22 = r8
            r28 = r6
            r30 = r4
            r32 = r2
            r34 = r17
            r35 = r16
            r16 = r18
            r18 = r14
            r20 = r12
            r13 = r10
            r14 = r11
            r15 = r36
            r13.<init>(r14, r15, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r35)
        L_0x08e3:
            X.9uQ r2 = r0.A0y
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0ce7
            r0.A0y = r10
            X.A2g r0 = r0.A0o
            r0.BZn(r10)
            return r1
        L_0x08f3:
            java.lang.Object r2 = r7.obj
            long r4 = X.C36431kI.A09(r2)
            java.lang.Object[] r3 = X.C90524aI.A0w()
            java.lang.String r2 = "setRelativePositionInternal"
            A0F(r0, r2, r3)
            java.lang.Integer r3 = r0.A0S
            java.lang.Integer r2 = X.C023109s.A0C
            if (r3 != r2) goto L_0x0921
            X.9n2 r2 = r0.A12
            X.9mU r2 = r2.A01
            X.9zp r9 = r2.A0I
            boolean r2 = r9.A0n
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x091b
            X.A0c r6 = r9.A0h
            long r2 = r4 * r7
            r6.A01(r2)
        L_0x091b:
            X.A0b r2 = r9.A0f
            long r4 = r4 * r7
            r2.A01(r4)
        L_0x0921:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0.A07(r2)
            return r1
        L_0x0929:
            java.lang.Object r5 = r7.obj
            X.9fI r5 = (X.C199429fI) r5
            goto L_0x0996
        L_0x092e:
            java.lang.Object r2 = r7.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.9uQ r7 = r0.A0y
            long r10 = X.C165587tf.A0C(r2, r3)
            long r12 = X.C165587tf.A0C(r2, r4)
            long r14 = X.C165587tf.A0C(r2, r6)
            long r16 = X.C165587tf.A0C(r2, r1)
            long r20 = android.os.SystemClock.elapsedRealtime()
            long r22 = X.C165587tf.A0C(r2, r5)
            r3 = 5
            r3 = r2[r3]
            boolean r28 = X.AnonymousClass000.A1X(r3)
            r3 = 6
            long r24 = X.C165587tf.A0C(r2, r3)
            r3 = 7
            long r26 = X.C165587tf.A0C(r2, r3)
            r3 = 8
            r3 = r2[r3]
            boolean r29 = X.AnonymousClass000.A1X(r3)
            r3 = 10
            r8 = r2[r3]
            java.lang.String r8 = (java.lang.String) r8
            int r9 = r7.A00
            long r3 = r7.A02
            X.9uQ r7 = new X.9uQ
            r18 = r3
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r29)
            X.9uQ r3 = r0.A0y
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L_0x0985
            r0.A0y = r7
            X.A2g r3 = r0.A0o
            r3.BZn(r7)
        L_0x0985:
            X.9fI r5 = r0.A11
            r3 = 9
            r4 = r2[r3]
            java.util.List r4 = (java.util.List) r4
            java.lang.String r3 = r5.A00
            boolean r2 = r5.A02
            X.9fI r5 = new X.9fI
            r5.<init>(r3, r4, r2)
        L_0x0996:
            X.9fI r2 = r0.A11
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0ce7
            r0.A11 = r5
            return r1
        L_0x09a1:
            java.lang.Object r2 = r7.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r6 = r2.booleanValue()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r4 = 0
            r5[r3] = r2
            java.lang.String r2 = "setLoopingInternal %b"
            A0F(r0, r2, r5)
            r0.A0f = r6
            X.AUR r2 = r0.A0p
            boolean r2 = r2.improveLooping
            if (r2 == 0) goto L_0x0ce7
            X.9n2 r0 = r0.A12
            if (r6 == 0) goto L_0x09c0
            r4 = 2
        L_0x09c0:
            X.9mU r0 = r0.A01
            r0.A08(r4)
            return r1
        L_0x09c6:
            java.lang.Object r8 = r7.obj
            X.B3o r8 = (X.C23081B3o) r8
            java.lang.Object[] r4 = new java.lang.Object[r1]
            android.view.Surface r2 = r0.A0H
            r4[r3] = r2
            java.lang.String r2 = "leaveWarmUpInternal, surface: %s"
            A0F(r0, r2, r4)
            X.A2g r7 = r0.A0o
            X.B3o r6 = r7.A01
            boolean r2 = r6 instanceof X.C98544rb
            if (r2 == 0) goto L_0x0ce7
            X.4rb r6 = (X.C98544rb) r6
            X.9pt r2 = r7.A00
            long r4 = r2.A0k
            r7.BgN(r4)
            r7.A01 = r8
            r6.A00 = r7
        L_0x09ea:
            java.util.Queue r4 = r6.A01
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x09fe
            java.lang.Object r2 = r4.poll()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x09ea
            r2.run()
            goto L_0x09ea
        L_0x09fe:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0t
            r0.set(r3)
            return r1
        L_0x0a04:
            java.lang.Object r4 = r7.obj
            java.util.List r4 = (java.util.List) r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = "onTimestampGapsChanged"
            A0F(r0, r2, r3)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Iterator r7 = r4.iterator()
        L_0x0a17:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0a38
            java.lang.Object r3 = r7.next()
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r2 = r3.first
            long r5 = X.C36431kI.A09(r2)
            java.lang.Object r2 = r3.second
            long r3 = X.C36431kI.A09(r2)
            X.9t4 r2 = new X.9t4
            r2.<init>(r5, r3)
            r8.add(r2)
            goto L_0x0a17
        L_0x0a38:
            X.A2g r0 = r0.A0o
            r0.BjB(r8)
            return r1
        L_0x0a3e:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = "liveLatencyMode"
            goto L_0x0b65
        L_0x0a44:
            java.lang.Object r2 = r7.obj
            int r2 = X.AnonymousClass000.A0I(r2)
            A0E(r0, r2)
            return r1
        L_0x0a4e:
            java.lang.Object r2 = r7.obj
            long r6 = X.C36431kI.A09(r2)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = "preSeekToInternal"
            A0F(r0, r2, r3)
            X.9n2 r0 = r0.A12
            X.9mU r2 = r0.A01
            r4 = -1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            X.9zp r2 = r2.A0I
            if (r0 == 0) goto L_0x0a6d
            java.util.UUID r0 = X.AnonymousClass9B7.A04
            long r4 = com.facebook.android.exoplayer2.util.Util.A04(r6)
        L_0x0a6d:
            X.9ik r3 = r2.A0g
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0 = 16
            X.AnonymousClass9QI.A00(r3, r2, r0)
            return r1
        L_0x0a79:
            java.lang.Object r2 = r7.obj
            float r2 = X.C36441kJ.A03(r2)
            A0C(r0, r2)
            return r1
        L_0x0a83:
            r0.A0K(r3)
            return r1
        L_0x0a87:
            java.lang.Object r2 = r7.obj
            boolean r2 = X.AnonymousClass000.A1X(r2)
            r0.A0I(r2)
            return r1
        L_0x0a91:
            java.lang.Object r2 = r7.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r7 = r2.booleanValue()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r3] = r2
            java.lang.String r2 = "convert Stereo to Mono: %s"
            A0F(r0, r2, r4)
            X.9n2 r6 = r0.A12
            X.9fS r0 = r6.A03
            float r4 = r0.A01
            float r3 = r0.A00
            boolean r0 = r0.A04
            X.9fS r2 = new X.9fS
            r2.<init>(r4, r3, r0, r7)
            X.9mU r0 = r6.A01
            X.9zp r0 = r0.A0I
            X.9ik r0 = r0.A0g
            X.AnonymousClass9QI.A00(r0, r2, r5)
            r6.A03 = r2
            return r1
        L_0x0abd:
            java.lang.Object r7 = r7.obj
            X.9fI r7 = (X.C199429fI) r7
            if (r7 == 0) goto L_0x0ce7
            java.lang.String r2 = r7.A00
            if (r2 != 0) goto L_0x0ae8
            boolean r2 = r7.A02
            if (r2 == 0) goto L_0x0ae8
            X.9fI r2 = r0.A11
            java.util.List r2 = r2.A01
            java.util.HashSet r5 = X.C90524aI.A0k(r2)
            int r2 = r5.size()
            if (r2 != r1) goto L_0x0ae8
            java.util.Iterator r2 = r5.iterator()
            java.lang.String r5 = X.AnonymousClass001.A0C(r2)
            java.util.List r2 = r7.A01
            X.9fI r7 = new X.9fI
            r7.<init>(r5, r2, r1)
        L_0x0ae8:
            X.9n2 r6 = r0.A12
            X.83B r0 = r6.A06
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.83A r0 = (X.AnonymousClass83A) r0
            X.839 r5 = new X.839
            r5.<init>(r0)
            int r2 = r6.A03(r4)
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0b1b
            r0 = -1
            if (r2 != r0) goto L_0x0ce7
            r5.A00(r4, r3)
            java.lang.String r2 = r7.A00
            if (r2 != 0) goto L_0x0b13
            r5.A0O = r1
        L_0x0b0d:
            X.83B r0 = r6.A06
            r0.A01(r5)
            return r1
        L_0x0b13:
            java.lang.String[] r0 = new java.lang.String[r1]
            r0[r3] = r2
            r5.A01(r0)
            goto L_0x0b0d
        L_0x0b1b:
            if (r2 != 0) goto L_0x0ce7
            r5.A00(r4, r1)
            goto L_0x0b0d
        L_0x0b21:
            java.lang.Object r2 = r7.obj
            boolean r7 = X.AnonymousClass000.A1X(r2)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r2 = "enableVideoTrackInternal"
            A0F(r0, r2, r5)
            X.9n2 r2 = r0.A12
            int r2 = r2.A03(r4)
            r6 = -1
            if (r2 != r6) goto L_0x0b48
            if (r7 == 0) goto L_0x0b48
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r5 = "Enable Text track"
            java.lang.String r2 = "HeroService"
            X.C200599hh.A00(r0, r2, r5, r6)
            X.9n2 r0 = r0.A12
            r0.A06(r4, r3)
            return r1
        L_0x0b48:
            X.9n2 r2 = r0.A12
            int r2 = r2.A03(r4)
            if (r2 == r6) goto L_0x0ce7
            if (r7 != 0) goto L_0x0ce7
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r3 = "Disable Text track"
            java.lang.String r2 = "HeroService"
            X.C200599hh.A00(r0, r2, r3, r5)
            X.9n2 r0 = r0.A12
            r0.A06(r4, r6)
            return r1
        L_0x0b61:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = "onBeforeRenderInternal"
        L_0x0b65:
            A0F(r0, r2, r3)
            return r1
        L_0x0b69:
            java.lang.Object r4 = r7.obj
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r2 = r4[r3]
            int r6 = X.AnonymousClass000.A0I(r2)
            long r3 = X.C165587tf.A0C(r4, r1)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "onPositionDiscontinuity "
            java.lang.String r5 = X.AnonymousClass000.A0r(r2, r5, r6)
            java.lang.Object[] r2 = X.C90524aI.A0w()
            A0F(r0, r5, r2)
            X.AUR r2 = r0.A0p
            boolean r2 = r2.improveLooping
            if (r2 == 0) goto L_0x0ce7
            if (r6 != 0) goto L_0x0ce7
            X.9ug r2 = r0.A0z
            int r5 = r2.A0W
            X.9n2 r2 = r0.A12
            X.9mU r2 = r2.A01
            int r2 = r2.A04()
            if (r5 != r2) goto L_0x0ce7
            X.9ug r4 = r0.A01(r3, r1)
            long r14 = r4.A0H
            boolean r2 = r4.A0R
            r45 = r2
            boolean r2 = r4.A0U
            r46 = r2
            long r12 = r4.A0X
            long r10 = r4.A09
            r29 = 0
            long r8 = r4.A0I
            java.lang.String r5 = r4.A0N
            java.lang.String r2 = ""
            if (r5 != 0) goto L_0x0bbb
            r5 = r2
        L_0x0bbb:
            int r3 = r4.A05
            r56 = r3
            int r3 = r4.A04
            r55 = r3
            long r6 = r4.A0D
            int r3 = r4.A03
            r54 = r3
            int r3 = r4.A06
            r53 = r3
            int r3 = r4.A01
            r52 = r3
            int r3 = r4.A02
            r16 = r3
            float r3 = r4.A00
            r51 = r3
            int r3 = r4.A07
            r17 = r3
            boolean r3 = r4.A0O
            r48 = r3
            int r3 = r4.A0W
            r18 = r3
            boolean r3 = r4.A0Q
            r49 = r3
            boolean r3 = r4.A0V
            r50 = r3
            r4 = 0
            X.9ug r3 = new X.9ug
            r25 = r12
            r27 = r12
            r31 = 0
            r35 = 0
            r37 = 0
            r41 = 0
            r43 = 0
            r47 = 0
            r19 = r14
            r21 = r12
            r23 = r10
            r33 = r8
            r39 = r6
            r8 = r3
            r9 = r5
            r10 = r51
            r11 = r56
            r12 = r55
            r13 = r54
            r14 = r53
            r15 = r52
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r46, r47, r48, r49, r50)
            X.A2g r6 = r0.A0o
            X.9Xa r5 = r0.A10
            if (r5 == 0) goto L_0x0c25
            X.9Xa r0 = r0.A10
            java.lang.String r2 = r0.A08
        L_0x0c25:
            r6.BU8(r3, r2, r4)
            return r1
        L_0x0c29:
            X.AUR r0 = r0.A0p
            boolean r0 = r0.enableWifiLockManager
            if (r0 == 0) goto L_0x0ce7
            java.lang.String r0 = "isOnWifi"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0c36:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r2 = "stopInternal"
            A0F(r0, r2, r4)
            r0.A16 = r1
            r0.A0J(r3)
            return r1
        L_0x0c43:
            java.lang.Object r2 = r7.obj
            boolean r8 = X.AnonymousClass000.A1X(r2)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r2 = "moveToWarmupInternal"
            A0F(r0, r2, r4)
            r2 = 0
            r0.A0L(r3, r2)
            X.AUR r2 = r0.A0p
            boolean r2 = r2.enablePauseNow
            if (r2 != 0) goto L_0x0c67
            int r2 = r0.A04
            long r11 = android.os.SystemClock.elapsedRealtime()
            r13 = 0
            r14 = 0
            r9 = r0
            r10 = r2
            r9.A06(r10, r11, r13, r14)
        L_0x0c67:
            android.os.Handler r4 = r0.A0l
            r2 = 9
            r4.removeMessages(r2)
            X.A2g r7 = r0.A0o
            X.4rb r6 = new X.4rb
            r6.<init>()
            X.9pt r2 = r7.A00
            long r4 = r2.A0k
            r7.BgN(r4)
            r7.A01 = r6
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.A0t
            r2.set(r1)
            r0.A0b = r3
            if (r8 == 0) goto L_0x0c8f
            X.9n2 r0 = r0.A12
            r4 = 0
            r0.A08(r4, r3)
            return r1
        L_0x0c8f:
            int r2 = r0.A04
            long r5 = android.os.SystemClock.elapsedRealtime()
            r7 = 0
            r8 = 0
            r3 = r0
            r4 = r2
            r3.A06(r4, r5, r7, r8)
            return r1
        L_0x0c9d:
            java.lang.Object r2 = r7.obj
            boolean r5 = X.AnonymousClass000.A1X(r2)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r2 = "enableSRInternal"
            A0F(r0, r2, r4)
            X.9n2 r0 = r0.A12
            X.9mU r2 = r0.A01
            X.B5Q[] r0 = r0.A0D
            r0 = r0[r3]
            X.9Xx r2 = r2.A06(r0)
            r0 = 10001(0x2711, float:1.4014E-41)
            r2.A01(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A02(r0)
            r2.A00()
            return r1
        L_0x0cc6:
            java.lang.Object r2 = r7.obj
            X.B3J r2 = (X.B3J) r2
            X.9n2 r0 = r0.A12
            r0.A09(r2)
            return r1
        L_0x0cd0:
            java.lang.Object r3 = r7.obj
            X.9n2 r0 = r0.A12
            java.util.List r2 = r0.A0P
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0ce7
            r2.remove(r3)
            return r1
        L_0x0ce0:
            X.9n2 r0 = r0.A12
            X.9mU r0 = r0.A01
            r0.A0C(r3)
        L_0x0ce7:
            return r1
        L_0x0ce8:
            X.9n2 r0 = r0.A12
            X.9mU r4 = r0.A01
            int r0 = r4.A04()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.A09(r0, r2)
            return r1
        L_0x0cf9:
            java.lang.Object r5 = r7.obj
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r2 = r5[r3]
            int r4 = X.AnonymousClass000.A0I(r2)
            long r2 = X.C165587tf.A0C(r5, r1)
            X.9n2 r0 = r0.A12
            X.9mU r0 = r0.A01
            goto L_0x0d1b
        L_0x0d0c:
            java.lang.Object r2 = r7.obj
            int r4 = X.AnonymousClass000.A0I(r2)
            X.9n2 r0 = r0.A12
            X.9mU r0 = r0.A01
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0d1b:
            r0.A09(r4, r2)
            return r1
        L_0x0d1f:
            r2 = -1
            r0.A09 = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204369pt.handleMessage(android.os.Message):boolean");
    }

    public C204369pt(Context context, Handler handler, HandlerThread handlerThread, C201619jy r11, C195979Xa r12, C23081B3o b3o, AnonymousClass9OD r14, AnonymousClass9UR r15, Map map, AtomicBoolean atomicBoolean, AtomicReference atomicReference, long j) {
        Looper mainLooper;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        this.A0t = atomicBoolean2;
        this.A0q = new AtomicBoolean(true);
        this.A0r = new AtomicBoolean(false);
        this.A0C = -1;
        this.A07 = -1;
        this.A0Z = false;
        this.A0i = false;
        this.A06 = 0;
        this.A05 = 0;
        this.A09 = -1;
        this.A0U = null;
        this.A16 = false;
        this.A0d = false;
        this.A0M = null;
        this.A0Q = null;
        this.A0n = new AnonymousClass9D5(this);
        this.A0k = j;
        this.A0o = new C20992A2g(b3o, this);
        if (b3o instanceof C98544rb) {
            atomicBoolean2.set(true);
        }
        this.A0m = r14;
        this.A0p = r14.A05;
        this.A0x = r14.A08;
        this.A08 = -1;
        this.A0Y = false;
        this.A0D = context;
        this.A0E = handler;
        this.A0W = atomicReference;
        this.A0P = r15;
        this.A0L = r11;
        this.A0V = map;
        this.A0F = handlerThread;
        if (handlerThread != null) {
            mainLooper = handlerThread.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(mainLooper, this);
        this.A0l = handler2;
        new C1895694i();
        this.A0s = atomicBoolean;
        C165587tf.A0z(handler2, this, r12, 12);
    }

    public static AnonymousClass9LQ A00(AbstractList abstractList, int i) {
        return (AnonymousClass9LQ) abstractList.get(i);
    }

    public static void A08(Handler handler, C204369pt r1, Object obj, int i) {
        A09(handler.obtainMessage(i, obj), r1);
    }

    public static void A0C(C204369pt r5, float f) {
        Object[] A0L2 = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L2, (int) (100.0f * f));
        A0F(r5, "setPlaybackSpeedInternal to: %d (x100)", A0L2);
        r5.A00 = f;
        C202979n2 r4 = r5.A12;
        C199519fS r0 = r4.A03;
        C199519fS r2 = new C199519fS(f, r0.A00, r0.A04, r0.A03);
        AnonymousClass9QI.A00(r4.A01.A0I.A0g, r2, 4);
        r4.A03 = r2;
        r5.A07(SystemClock.elapsedRealtime());
    }

    public static void A0D(C204369pt r3, float f) {
        Object[] A0L2 = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L2, (int) (100.0f * f));
        A0F(r3, "setVolumeInternal to: %d (x100)", A0L2);
        r3.A01 = f;
        C202979n2 r0 = r3.A12;
        C196149Xx A062 = r0.A01.A06(r0.A0D[1]);
        A062.A01(2);
        A062.A02(Float.valueOf(f));
        A062.A00();
    }

    public static void A0E(C204369pt r3, int i) {
        Object[] A0L2 = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L2, i);
        A0F(r3, "setAudioUsageInternal: %d", A0L2);
        r3.A02 = i;
        C202979n2 r0 = r3.A12;
        C199379fD r2 = new C199379fD(i);
        C196149Xx A062 = r0.A01.A06(r0.A0D[1]);
        A062.A01(3);
        A062.A02(r2);
        A062.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r0.A0F.A01() == false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0L(boolean r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r10 = 0
            r1[r10] = r0
            java.lang.String r0 = "pauseInternal %b"
            r6 = r12
            A0F(r12, r0, r1)
            r12.A0g = r10
            r12.A0i = r13
            X.9n2 r0 = r12.A12
            r0.A0A(r10)
            X.AUR r5 = r12.A0p
            boolean r0 = r5.enableVodPausedLoading
            if (r0 == 0) goto L_0x005f
            java.lang.Integer r1 = r12.A0S
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 == r0) goto L_0x005f
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x005f
            java.util.Set r1 = r5.pausedLoadingTriggerTypes
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x005f
            boolean r0 = r1.contains(r14)
            if (r0 == 0) goto L_0x005f
            X.9Xa r0 = r12.A10
            if (r0 == 0) goto L_0x005f
            X.9Xa r0 = r12.A10
            X.9um r0 = r0.A0F
            java.lang.String r1 = r0.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = r5.playerOriginPausedLoadingBlackList
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x005f
            X.9n2 r4 = r12.A12
            int r0 = r5.maxBufferToDownloadInPausedLoadingMs
            long r2 = (long) r0
            int r0 = r5.maxTimeAllowedSpentInPausedLoadingMs
            long r0 = (long) r0
            X.B3Y r4 = r4.A02
            r4.BrV(r2, r0)
        L_0x005f:
            boolean r0 = r5.enablePauseNow
            if (r0 == 0) goto L_0x006d
            int r7 = r12.A04
            long r8 = android.os.SystemClock.elapsedRealtime()
            r11 = 0
            r6.A06(r7, r8, r10, r11)
        L_0x006d:
            if (r14 == 0) goto L_0x009b
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "short_form_video_invisible"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x009b
            boolean r0 = r5.disableVideoTrackForInVisibleVDD
            if (r0 == 0) goto L_0x009b
            X.9Xa r0 = r12.A10
            r2 = 1
            if (r0 == 0) goto L_0x008f
            X.9um r0 = r0.A0F
            boolean r0 = r0.A01()
            r1 = 1
            if (r0 != 0) goto L_0x0090
        L_0x008f:
            r1 = 0
        L_0x0090:
            boolean r0 = r5.shouldDisableAV1VideoTrackOnlyforVDD
            if (r0 == 0) goto L_0x0096
            if (r1 == 0) goto L_0x009b
        L_0x0096:
            r12.A0I(r10)
            r12.A0d = r2
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204369pt.A0L(boolean, java.lang.String):void");
    }
}
