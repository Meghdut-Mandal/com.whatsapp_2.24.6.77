package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.android.exoplayer2.Timeline;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.9mU  reason: invalid class name and case insensitive filesystem */
public final class C202709mU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public AnonymousClass82J A06;
    public C201399jS A07;
    public C199519fS A08;
    public B38 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public final Looper A0H;
    public final C209329zp A0I;
    public final C199579fY A0J;
    public final B40 A0K;
    public final C199339f9 A0L;
    public final CopyOnWriteArraySet A0M;
    public final Handler A0N;
    public final Handler A0O;
    public final C195889Wr A0P;
    public final AnonymousClass9GL A0Q;
    public final AnonymousClass9MF A0R;
    public final B5Q[] A0S;

    public void A0A(long j) {
        this.A0D = true;
        this.A02++;
        this.A04 = j;
        C209329zp r1 = this.A0I;
        AnonymousClass9WT r5 = this.A07.A04;
        UUID uuid = AnonymousClass9B7.A04;
        AnonymousClass9QI.A00(r1.A0g, new AnonymousClass9GB(r5, Util.A04(j)), 17);
        Iterator it = this.A0M.iterator();
        while (it.hasNext()) {
            ((AnonymousClass9UY) it.next()).A00(1);
        }
    }

    public void A0B(B38 b38, boolean z, boolean z2) {
        this.A06 = null;
        this.A09 = b38;
        C201399jS A012 = A01(2, z, z2);
        this.A0C = true;
        this.A02++;
        C201079ik r2 = this.A0I.A0g;
        AnonymousClass9QI A002 = C201079ik.A00();
        A002.A00 = r2.A00.obtainMessage(0, z ? 1 : 0, z2 ? 1 : 0, b38);
        A002.A01 = r2;
        A002.A01();
        A02(this, A012, 5, 1, false, false);
    }

    public void A0C(boolean z) {
        if (z) {
            this.A06 = null;
            this.A09 = null;
        }
        C201399jS A012 = A01(1, z, z);
        this.A02++;
        C201079ik r3 = this.A0I.A0g;
        AnonymousClass9QI A002 = C201079ik.A00();
        A002.A00 = r3.A00.obtainMessage(6, z ? 1 : 0, 0);
        A002.A01 = r3;
        A002.A01();
        A02(this, A012, 5, 1, false, false);
    }

    public static long A00(C202709mU r6, long j) {
        UUID uuid = AnonymousClass9B7.A04;
        long A052 = Util.A05(j);
        C201399jS r3 = r6.A07;
        AnonymousClass9WT r2 = r3.A04;
        if (r2.A00 != -1) {
            return A052;
        }
        Timeline timeline = r3.A03;
        int i = r2.A02;
        C195889Wr r1 = r6.A0P;
        timeline.A08(r1, i, false);
        return A052 + Util.A05(r1.A02);
    }

    private C201399jS A01(int i, boolean z, boolean z2) {
        int i2;
        long A002;
        long A052;
        Timeline timeline;
        Object obj;
        C206419tN r3;
        AnonymousClass9MF r4;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            A052 = 0;
            this.A05 = 0;
        } else {
            this.A01 = A04();
            boolean A032 = A03(this);
            if (A032) {
                i2 = this.A00;
            } else {
                i2 = this.A07.A04.A02;
            }
            this.A00 = i2;
            if (A032) {
                A002 = this.A05;
            } else {
                A002 = A00(this, this.A07.A0D);
            }
            this.A05 = A002;
            if (A03(this)) {
                A052 = this.A04;
            } else {
                long j = this.A07.A0D;
                UUID uuid = AnonymousClass9B7.A04;
                A052 = Util.A05(j);
            }
        }
        this.A04 = A052;
        if (z2) {
            timeline = Timeline.A00;
            obj = null;
        } else {
            C201399jS r0 = this.A07;
            timeline = r0.A03;
            obj = r0.A08;
        }
        C201399jS r02 = this.A07;
        AnonymousClass9WT r2 = r02.A04;
        long j2 = r02.A02;
        long j3 = r02.A01;
        if (z2) {
            r3 = C206419tN.A03;
            r4 = this.A0R;
        } else {
            r3 = r02.A05;
            r4 = r02.A06;
        }
        return new C201399jS(timeline, r2, r3, r4, C023109s.A00, obj, i, j2, j3, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if ("waslive_quickdashv2".equals(((X.AnonymousClass9XZ) r10).A08) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A08 != r3.A08) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        r2 = X.C165617ti.A0B(r1, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C202709mU r24, X.C201399jS r25, int r26, int r27, boolean r28, boolean r29) {
        /*
            r7 = r24
            X.9jS r4 = r7.A07
            com.facebook.android.exoplayer2.Timeline r1 = r4.A03
            r3 = r25
            com.facebook.android.exoplayer2.Timeline r0 = r3.A03
            r23 = 0
            if (r1 != r0) goto L_0x0015
            java.lang.Object r1 = r4.A08
            java.lang.Object r0 = r3.A08
            r2 = 0
            if (r1 == r0) goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            int r1 = r4.A00
            int r0 = r3.A00
            boolean r22 = X.C36381kD.A1U(r1, r0)
            boolean r1 = r4.A0A
            boolean r0 = r3.A0A
            boolean r21 = X.C36381kD.A1U(r1, r0)
            X.9MF r1 = r4.A06
            X.9MF r0 = r3.A06
            if (r1 == r0) goto L_0x002e
            r23 = 1
        L_0x002e:
            r7.A07 = r3
            r24 = r27
            if (r2 != 0) goto L_0x0036
            if (r27 != 0) goto L_0x0219
        L_0x0036:
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0M
            java.util.Iterator r20 = r0.iterator()
        L_0x003c:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0219
            java.lang.Object r9 = r20.next()
            X.9UY r9 = (X.AnonymousClass9UY) r9
            X.9jS r0 = r7.A07
            com.facebook.android.exoplayer2.Timeline r3 = r0.A03
            java.lang.Object r10 = r0.A08
            X.9n2 r4 = r9.A05
            boolean r0 = r10 instanceof X.AnonymousClass9XZ
            if (r0 == 0) goto L_0x003c
            int r0 = r3.A01()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 != 0) goto L_0x003c
            java.util.List r0 = r4.A0P
            java.util.Iterator r2 = r0.iterator()
        L_0x0064:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r2.next()
            X.B3J r1 = (X.B3J) r1
            r0 = r24
            r1.Bj7(r3, r10, r0)
            goto L_0x0064
        L_0x0076:
            X.AUR r15 = r4.A0O
            boolean r0 = r15.enableQuickDashPlayback
            r8 = 1
            r6 = 0
            if (r0 == 0) goto L_0x008c
            r0 = r10
            X.9XZ r0 = (X.AnonymousClass9XZ) r0
            java.lang.String r1 = r0.A08
            java.lang.String r0 = "waslive_quickdashv2"
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            X.9Xa r0 = r4.A08
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x009a
            if (r1 != 0) goto L_0x009a
            goto L_0x003c
        L_0x009a:
            X.9fY r2 = r9.A04
            r0 = 0
            r3.A09(r2, r6, r0)
            r11 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2.A03
            long r0 = r0 + r2
            long r0 = r0 / r11
            long r2 = r9.A01
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x013a
            r9.A01 = r0
            X.9D5 r2 = r4.A0L
            X.9pt r5 = r2.A00
            android.os.Handler r4 = r5.A0l
            r2 = 2
            long[] r2 = new long[r2]
            r2[r6] = r0
            r0 = 0
            r2[r8] = r0
            r0 = 15
            X.C204369pt.A08(r4, r5, r2, r0)
            r9.A00 = r6
        L_0x00c5:
            X.9XZ r10 = (X.AnonymousClass9XZ) r10
            r9.A02 = r10
            if (r10 == 0) goto L_0x003c
            boolean r0 = r10.A0C
            r12 = 0
            if (r0 == 0) goto L_0x015c
            java.util.List r1 = r10.A0A
            int r0 = r1.size()
            if (r0 < r8) goto L_0x015c
            X.9RE r2 = X.C165617ti.A0B(r1, r6)
            r0 = 2
            int r1 = r2.A01(r0)
            r0 = -1
            if (r1 == r0) goto L_0x015c
            X.9O1 r0 = X.AnonymousClass9RE.A00(r2, r1)
            java.util.List r1 = r0.A05
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x015c
            java.lang.Object r1 = r1.get(r6)
            X.9Xo r1 = (X.C196079Xo) r1
            long r13 = r10.A04
            boolean r0 = r1 instanceof X.C1690382z
            if (r0 != 0) goto L_0x015c
            X.830 r1 = (X.AnonymousClass830) r1
            X.833 r0 = r1.A00
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            java.util.List r0 = r0.A04
            java.util.Iterator r18 = r0.iterator()
            r16 = r13
        L_0x010c:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r10 = r18.next()
            X.9SE r10 = (X.AnonymousClass9SE) r10
            long r2 = r10.A04
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0131
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0131
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            r12.add(r0)
        L_0x0131:
            long r0 = r10.A03
            int r10 = r10.A02
            long r10 = (long) r10
            long r0 = r0 * r10
            long r16 = r2 + r0
            goto L_0x010c
        L_0x013a:
            int r2 = r9.A00
            int r3 = r2 + 1
            r9.A00 = r3
            X.9D5 r2 = r4.A0L
            X.9pt r5 = r2.A00
            android.os.Handler r4 = r5.A0l
            r2 = 2
            long[] r2 = new long[r2]
            r2[r6] = r0
            long r0 = (long) r3
            r2[r8] = r0
            r0 = 15
            X.C204369pt.A08(r4, r5, r2, r0)
            goto L_0x00c5
        L_0x0155:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x015c
            r12 = 0
        L_0x015c:
            java.util.List r0 = r9.A03
            if (r0 != 0) goto L_0x01d6
            if (r12 != 0) goto L_0x01e2
        L_0x0162:
            r9.A03 = r12
            X.9XZ r0 = r9.A02
            long[] r16 = X.AnonymousClass9Z1.A03(r0)
            X.9XZ r0 = r9.A02
            java.lang.String r1 = X.C202979n2.A00(r0)
            java.util.LinkedList r11 = X.C90524aI.A0l()
            if (r1 == 0) goto L_0x0181
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0181
            r11.add(r1)
        L_0x0181:
            X.9XZ r12 = r9.A02
            long r14 = r12.A02
            long r9 = r12.A04
            long r2 = r12.A00
            long r0 = r12.A03
            boolean r13 = r12.A0G
            r25 = r13
            r18 = r16[r6]
            r16 = r16[r8]
            boolean r6 = r12.A0B
            r13 = r6
            java.lang.String r12 = r12.A09
            r6 = 11
            java.lang.Object[] r6 = new java.lang.Object[r6]
            X.C90474aD.A1S(r6, r14)
            X.AnonymousClass000.A1M(r6, r8, r9)
            X.C36361kB.A1W(r6, r2)
            X.C165587tf.A1W(r6, r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C165607th.A1T(r6, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            r0 = 5
            r6[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            r0 = 6
            r6[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            r0 = 7
            r6[r0] = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            X.C36401kF.A1Q(r0, r11, r6)
            r0 = 10
            r6[r0] = r12
            r0 = 17
            X.C204369pt.A08(r4, r5, r6, r0)
            goto L_0x003c
        L_0x01d6:
            if (r12 == 0) goto L_0x0162
            int r1 = r0.size()
            int r0 = r12.size()
            if (r1 == r0) goto L_0x0162
        L_0x01e2:
            int r1 = r12.size()
            int r0 = r15.maxNumGapsToNotify
            if (r1 <= r0) goto L_0x0212
            int r2 = r12.size()
            X.9Xa r0 = r5.A10
            if (r0 != 0) goto L_0x020b
            r0 = 0
        L_0x01f3:
            java.lang.Object[] r1 = X.C36411kG.A1b(r0)
            X.AnonymousClass000.A1L(r1, r2, r8)
            java.lang.String r0 = "Too many gaps received for videoId %s. NumGaps: %d"
            java.lang.String r3 = java.lang.String.format(r0, r1)
            X.A2g r2 = r5.A0o
            java.lang.String r1 = "MANIFEST"
            java.lang.String r0 = "MANIFEST_GAPS_RECEIVED_MORE_THAN_EXPECTED"
            r2.Bkb(r1, r0, r3)
            goto L_0x0162
        L_0x020b:
            X.9Xa r0 = r5.A10
            X.9um r0 = r0.A0F
            java.lang.String r0 = r0.A0H
            goto L_0x01f3
        L_0x0212:
            r0 = 21
            X.C204369pt.A08(r4, r5, r12, r0)
            goto L_0x0162
        L_0x0219:
            if (r28 == 0) goto L_0x0233
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x0221:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0233
            java.lang.Object r0 = r1.next()
            X.9UY r0 = (X.AnonymousClass9UY) r0
            r2 = r26
            r0.A00(r2)
            goto L_0x0221
        L_0x0233:
            if (r23 == 0) goto L_0x02c2
            X.9GL r1 = r7.A0Q
            X.9jS r0 = r7.A07
            X.9MF r0 = r0.A06
            java.lang.Object r0 = r0.A02
            X.83B r1 = (X.AnonymousClass83B) r1
            X.9SN r0 = (X.AnonymousClass9SN) r0
            r1.A00 = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0M
            java.util.Iterator r10 = r0.iterator()
        L_0x0249:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02c2
            java.lang.Object r1 = r10.next()
            X.9UY r1 = (X.AnonymousClass9UY) r1
            X.9jS r0 = r7.A07
            X.9tN r4 = r0.A05
            X.9MF r0 = r0.A06
            X.B5T[] r0 = r0.A04
            X.9Tk r3 = new X.9Tk
            r3.<init>(r0)
            X.9n2 r6 = r1.A05
            X.83B r0 = r6.A06
            if (r0 == 0) goto L_0x02ac
            X.9SN r9 = r0.A00
            if (r9 == 0) goto L_0x02ac
            r0 = 2
            int r0 = r9.A00(r0)
            java.lang.String r5 = ""
            r8 = 1
            if (r0 != r8) goto L_0x028e
            java.util.List r0 = r6.A0P
            java.util.Iterator r2 = r0.iterator()
        L_0x027c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x028e
            java.lang.Object r1 = r2.next()
            X.B3J r1 = (X.B3J) r1
            X.902 r0 = X.AnonymousClass902.A04
            r1.Bkc(r0, r5)
            goto L_0x027c
        L_0x028e:
            int r0 = r9.A00(r8)
            if (r0 != r8) goto L_0x02ac
            java.util.List r0 = r6.A0P
            java.util.Iterator r2 = r0.iterator()
        L_0x029a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r1 = r2.next()
            X.B3J r1 = (X.B3J) r1
            X.902 r0 = X.AnonymousClass902.A03
            r1.Bkc(r0, r5)
            goto L_0x029a
        L_0x02ac:
            java.util.List r0 = r6.A0P
            java.util.Iterator r1 = r0.iterator()
        L_0x02b2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0249
            java.lang.Object r0 = r1.next()
            X.B3J r0 = (X.B3J) r0
            r0.BjP(r4, r3)
            goto L_0x02b2
        L_0x02c2:
            if (r21 == 0) goto L_0x02d4
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x02ca:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02d4
            r1.next()
            goto L_0x02ca
        L_0x02d4:
            if (r22 == 0) goto L_0x02f2
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0M
            java.util.Iterator r3 = r0.iterator()
        L_0x02dc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02f2
            java.lang.Object r2 = r3.next()
            X.9UY r2 = (X.AnonymousClass9UY) r2
            boolean r1 = r7.A0F
            X.9jS r0 = r7.A07
            int r0 = r0.A00
            r2.A01(r1, r0)
            goto L_0x02dc
        L_0x02f2:
            if (r29 == 0) goto L_0x0304
            java.util.concurrent.CopyOnWriteArraySet r0 = r7.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x02fa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0304
            r1.next()
            goto L_0x02fa
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202709mU.A02(X.9mU, X.9jS, int, int, boolean, boolean):void");
    }

    public static boolean A03(C202709mU r1) {
        if (AnonymousClass000.A1Q(r1.A07.A03.A01()) || r1.A02 > 0) {
            return true;
        }
        return false;
    }

    public long A05() {
        C201399jS r1 = this.A07;
        Timeline timeline = r1.A03;
        if (AnonymousClass000.A1Q(timeline.A01())) {
            return -9223372036854775807L;
        }
        if (!A03(this)) {
            AnonymousClass9WT r2 = r1.A04;
            if (r2.A00 != -1) {
                timeline.A08(this.A0P, r2.A02, false);
                UUID uuid = AnonymousClass9B7.A04;
                return -9223372036854775807L;
            }
        }
        return Util.A05(timeline.A09(this.A0J, A04(), 0).A03);
    }

    public C196149Xx A06(C22858AxA axA) {
        IllegalStateException A0V;
        if (this.A0A) {
            C199339f9 r2 = this.A0L;
            synchronized (r2) {
                boolean z = false;
                while (!r2.A00) {
                    try {
                        r2.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    C90484aE.A0z();
                }
            }
            Thread currentThread = Thread.currentThread();
            Looper looper = this.A0H;
            if (currentThread != looper.getThread()) {
                Object[] A0M2 = AnonymousClass001.A0M();
                A0M2[0] = currentThread.getName();
                A0M2[1] = looper.getThread().getName();
                String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", A0M2);
                if (this.A0B) {
                    A0V = null;
                } else {
                    A0V = C165617ti.A0V();
                }
                Log.w("ExoPlayerImpl", format, A0V);
                this.A0B = true;
            }
        }
        int A042 = A04();
        C209329zp r22 = this.A0I;
        Timeline timeline = this.A07.A03;
        if (A042 == -1) {
            A042 = 0;
        }
        return new C196149Xx(r22.A0W.getLooper(), r22, axA, timeline, this.A0K, A042);
    }

    public void A08(int i) {
        if (this.A0G != i) {
            this.A0G = i;
            C201079ik r4 = this.A0I.A0g;
            AnonymousClass9QI A002 = C201079ik.A00();
            A002.A00 = r4.A00.obtainMessage(12, i, 0);
            A002.A01 = r4;
            A002.A01();
            Iterator it = this.A0M.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r3.A04.A00 == -1) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(int r19, long r20) {
        /*
            r18 = this;
            r5 = r18
            X.9jS r3 = r5.A07
            com.facebook.android.exoplayer2.Timeline r10 = r3.A03
            r13 = r19
            r0 = r20
            if (r19 < 0) goto L_0x00b8
            int r2 = r10.A01()
            boolean r9 = X.AnonymousClass000.A1Q(r2)
            if (r9 != 0) goto L_0x001c
            int r2 = r10.A01()
            if (r13 >= r2) goto L_0x00b8
        L_0x001c:
            r4 = 1
            r5.A0D = r4
            int r2 = r5.A02
            int r2 = r2 + 1
            r5.A02 = r2
            boolean r2 = A03(r5)
            if (r2 != 0) goto L_0x0033
            X.9WT r2 = r3.A04
            int r6 = r2.A00
            r3 = -1
            r2 = 1
            if (r6 != r3) goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r8 = 0
            if (r2 == 0) goto L_0x004b
            java.lang.String r1 = "ExoPlayerImpl"
            java.lang.String r0 = "seekTo ignored because an ad is playing"
            android.util.Log.w(r1, r0)
            android.os.Handler r2 = r5.A0N
            r1 = -1
            X.9jS r0 = r5.A07
            android.os.Message r0 = r2.obtainMessage(r8, r4, r1, r0)
            r0.sendToTarget()
        L_0x004a:
            return
        L_0x004b:
            r5.A01 = r13
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0089
            if (r2 != 0) goto L_0x0087
            r2 = 0
        L_0x005a:
            r5.A05 = r2
            r5.A00 = r8
        L_0x005e:
            X.9zp r3 = r5.A0I
            java.util.UUID r2 = X.AnonymousClass9B7.A04
            long r0 = com.facebook.android.exoplayer2.util.Util.A04(r0)
            X.9ik r3 = r3.A0g
            X.9Iw r2 = new X.9Iw
            r2.<init>(r10, r13, r0)
            r0 = 3
            X.AnonymousClass9QI.A00(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x0077:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r1.next()
            X.9UY r0 = (X.AnonymousClass9UY) r0
            r0.A00(r4)
            goto L_0x0077
        L_0x0087:
            r2 = r0
            goto L_0x005a
        L_0x0089:
            if (r2 != 0) goto L_0x00b1
            X.9fY r6 = r5.A0J
            r2 = 0
            X.9fY r2 = r10.A09(r6, r13, r2)
            long r14 = r2.A02
        L_0x0095:
            X.9fY r12 = r5.A0J
            X.9Wr r11 = r5.A0P
            r16 = 0
            android.util.Pair r6 = r10.A07(r11, r12, r13, r14, r16)
            java.util.Objects.requireNonNull(r6)
            java.util.UUID r2 = X.AnonymousClass9B7.A04
            long r2 = com.facebook.android.exoplayer2.util.Util.A05(r14)
            r5.A05 = r2
            int r2 = X.C36381kD.A04(r6)
            r5.A00 = r2
            goto L_0x005e
        L_0x00b1:
            java.util.UUID r2 = X.AnonymousClass9B7.A04
            long r14 = com.facebook.android.exoplayer2.util.Util.A04(r0)
            goto L_0x0095
        L_0x00b8:
            X.92N r2 = new X.92N
            r2.<init>(r10, r13, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202709mU.A09(int, long):void");
    }

    public int A04() {
        if (A03(this)) {
            return this.A01;
        }
        C201399jS r0 = this.A07;
        return r0.A03.A08(this.A0P, r0.A04.A02, false).A00;
    }

    public void A07() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Release ");
        C90504aG.A0z(System.identityHashCode(this), A0u);
        A0u.append(" [");
        A0u.append("ExoPlayerLib/2.8.1");
        A0u.append("] [");
        A0u.append(Util.A02);
        A0u.append("] [");
        synchronized (C200729i7.class) {
            str = C200729i7.A00;
        }
        Log.i("ExoPlayerImpl", C165567td.A0Y(str, A0u));
        this.A09 = null;
        C209329zp r2 = this.A0I;
        synchronized (r2) {
            if (!r2.A0N) {
                r2.A0g.A00.sendEmptyMessage(7);
                boolean z = false;
                while (!r2.A0N) {
                    try {
                        r2.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    C90484aE.A0z();
                }
            }
        }
        this.A0N.removeCallbacksAndMessages((Object) null);
        this.A07 = A01(1, false, false);
    }

    public C202709mU(B3Y b3y, AnonymousClass9GL r33, C22774Avk avk, B40 b40, B5Q[] b5qArr, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Looper mainLooper;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Init ");
        C90504aG.A0z(System.identityHashCode(this), A0u);
        A0u.append(" [");
        A0u.append("ExoPlayerLib/2.8.1");
        A0u.append("] [");
        Log.i("ExoPlayerImpl", C165567td.A0Y(Util.A02, A0u));
        C199339f9 r1 = new C199339f9();
        this.A0L = r1;
        try {
            this.A0A = z14;
            B5Q[] b5qArr2 = b5qArr;
            int length = b5qArr2.length;
            C200319h9.A02(AnonymousClass000.A1R(length));
            Objects.requireNonNull(b5qArr2);
            this.A0S = b5qArr2;
            AnonymousClass9GL r8 = r33;
            Objects.requireNonNull(r8);
            this.A0Q = r8;
            this.A0E = false;
            this.A0G = 0;
            this.A0M = new CopyOnWriteArraySet();
            AnonymousClass9MF r9 = new AnonymousClass9MF(C199329f8.A02, (Object) null, new C199319f7[length], new B5T[length]);
            this.A0R = r9;
            this.A0J = new C199579fY();
            this.A0P = new C195889Wr();
            this.A08 = C199519fS.A05;
            this.A0H = Looper.myLooper();
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            C23133B6o b6o = new C23133B6o(mainLooper, this, 1);
            this.A0N = b6o;
            B40 b402 = b40;
            this.A0K = b402;
            this.A07 = new C201399jS(Timeline.A00, C206419tN.A03, r9, 0);
            boolean z15 = this.A0E;
            boolean z16 = z3;
            boolean z17 = z2;
            boolean z18 = z;
            long j2 = j;
            int i2 = i;
            boolean z19 = z11;
            boolean z20 = z10;
            boolean z21 = z9;
            boolean z22 = z8;
            C22774Avk avk2 = avk;
            boolean z23 = z7;
            B3Y b3y2 = b3y;
            boolean z24 = z6;
            boolean z25 = z15;
            C209329zp r3 = new C209329zp(b6o, this, b3y2, C200769iC.A01, r8, r9, avk2, b402, b5qArr2, this.A0G, i2, j2, z25, z18, z17, z16, z4, z5, z24, z23, z22, z21, z20, z19, z12, z13);
            this.A0I = r3;
            this.A0O = C90514aH.A0M(r3.A0W);
            r1.A01();
        } catch (Throwable th) {
            this.A0L.A01();
            throw th;
        }
    }
}
