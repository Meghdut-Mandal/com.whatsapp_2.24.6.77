package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9ps  reason: invalid class name and case insensitive filesystem */
public class C204359ps implements Handler.Callback {
    public static final AtomicInteger A0T = new AtomicInteger();
    public static final AtomicLong A0U = new AtomicLong(0);
    public static final Set A0V = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public long A00;
    public long A01;
    public AnonymousClass9RJ A02;
    public C192389Gu A03;
    public C23081B3o A04;
    public AUR A05;
    public String A06;
    public List A07;
    public AtomicReference A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final C203259ng A0D;
    public final C20990A2e A0E;
    public final Object A0F;
    public final Object A0G;
    public final List A0H;
    public final TreeMap A0I;
    public final AtomicReference A0J;
    public final long[] A0K;
    public volatile float A0L;
    public volatile float A0M;
    public volatile long A0N;
    public volatile long A0O;
    public volatile long A0P;
    public volatile long A0Q;
    public volatile boolean A0R;
    public volatile boolean A0S;

    public void A0B() {
        C165597tg.A19(this, "pause");
        AnonymousClass000.A14(this.A0C, (Object) null, 3);
        synchronized (this.A0G) {
        }
        this.A0A = false;
    }

    public void A0C() {
        C195979Xa r0;
        A06(this, "play", new Object[0]);
        this.A0A = true;
        AUR aur = this.A05;
        if (aur.blockDRMPlaybackOnHDMI && aur.fixDRMPlaybackOnHDMI) {
            C203259ng r02 = this.A0D;
            if (r02 == null || (r0 = r02.A05) == null) {
                C131916Rh.A01("HeroPlayer", "Couldn't find isProtectedContent status. Considering it as non-protected.", new Object[0]);
            } else {
                String str = r0.A0F.A0A;
                if (str != null && str.contains("ContentProtection")) {
                    AtomicReference atomicReference = C197339bY.A01;
                    if (atomicReference.get() == null) {
                        atomicReference.compareAndSet((Object) null, new C197339bY());
                    }
                    if (((C197339bY) atomicReference.get()).A00.get()) {
                        C131916Rh.A01("HeroPlayer", "Pausing DRM playback because HDMI is connected.", new Object[0]);
                        A0B();
                        return;
                    }
                }
            }
        }
        AnonymousClass000.A14(this.A0C, -1L, 2);
    }

    public void A0K(C195979Xa r13) {
        String str;
        Uri uri;
        C207239um r3 = r13.A0F;
        A06(this, "setVideoPlaybackParams: %s", r3);
        boolean z = false;
        if (!C36361kB.A1a(r3.A07, C023109s.A01) || ((uri = r3.A05) != null && !TextUtils.isEmpty(uri.toString()))) {
            if (r3.A07 == C023109s.A0C) {
                Uri uri2 = r3.A05;
                if (uri2 == null) {
                    str = "Progressive with null url";
                } else if (uri2.getPath() == null) {
                    str = "Progressive with null url path";
                } else if (r3.A05.getPath().endsWith(".mpd")) {
                    str = "Progressive with MPD";
                }
            }
            if (r3.A05 != null || !TextUtils.isEmpty(r3.A0A)) {
                z = true;
                str = "";
            } else {
                str = "VOD with null url and empty manifest";
            }
        } else {
            str = "DashLive with null or empty url";
        }
        Pair A0Q2 = C36441kJ.A0Q(z, str);
        if (!AnonymousClass000.A1X(A0Q2.first)) {
            IllegalArgumentException A082 = AnonymousClass001.A08("Invalid video source");
            AnonymousClass902 r8 = AnonymousClass902.A0B;
            AnonymousClass906 r7 = AnonymousClass906.A0A;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid video source: ");
            A02(this, r7, r8, AnonymousClass000.A0q((String) A0Q2.second, A0u), r13.A08, A082);
            return;
        }
        A06(this, "dash manifest: %s", r3.A0A);
        AnonymousClass000.A14(this.A0C, r13, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C204359ps(X.C161067m6 r4, X.C202289lT r5, X.AUR r6) {
        /*
            r3 = this;
            boolean r0 = r6.useMainThreadForHeroPlayer
            if (r0 == 0) goto L_0x000c
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x0008:
            r3.<init>(r0, r4, r5, r6)
            return
        L_0x000c:
            r2 = -2
            java.lang.String r1 = "HeroPlayerInternalThread"
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1, r2)
            r0.start()
            android.os.Looper r0 = r0.getLooper()
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204359ps.<init>(X.7m6, X.9lT, X.AUR):void");
    }

    public static long A00(C204359ps r5) {
        if (!AnonymousClass000.A1P((r5.A0N > 0 ? 1 : (r5.A0N == 0 ? 0 : -1)))) {
            return 0;
        }
        C207179ug A0I2 = C165597tg.A0I(r5);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!A0I2.A0R || A0I2.A0P) {
            return 0;
        }
        return (long) (A0I2.A00 * ((float) (elapsedRealtime - A0I2.A0H)));
    }

    public static void A03(C204359ps r4, C207179ug r5) {
        if (!r4.A05.enableClearStallOnBroadcastEnd) {
            return;
        }
        if (r5.A0F > 0 || r5.A0P) {
            r5.A0P = false;
            r5.A0F = -1;
            r5.A0G = -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r0.isValid() == false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C204359ps r21, X.C207179ug r22, boolean r23) {
        /*
            r7 = r21
            X.9ng r8 = r7.A0D
            r6 = r22
            X.C203259ng.A07(r8, r6)
            long r3 = r6.A0F
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            long r1 = r6.A0G
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0066
            long r11 = r6.A00()
            long r4 = r6.A0F
            long r2 = r6.A0G
            boolean r0 = r6.A0R
            r16 = r0 ^ 1
            boolean r10 = r6.A0O
            java.lang.String r1 = "onBufferingStopped, %dms"
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            long r13 = r2 - r4
            X.C90474aD.A1S(r0, r13)
            A06(r7, r1, r0)
            X.AUR r0 = r7.A05
            int r0 = r0.reportStallThresholdMs
            long r0 = (long) r0
            long r0 = r0 + r4
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x005f
            java.util.List r9 = r7.A0H
            monitor-enter(r9)
            X.9JU r0 = new X.9JU     // Catch:{ all -> 0x005c }
            r20 = r10
            r21 = r2
            r18 = r4
            r17 = r0
            r17.<init>(r18, r20, r21)     // Catch:{ all -> 0x005c }
            r9.add(r0)     // Catch:{ all -> 0x005c }
            long r0 = r7.A00     // Catch:{ all -> 0x005c }
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x005a
            r7.A00 = r11     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r9)     // Catch:{ all -> 0x005c }
            goto L_0x005f
        L_0x005c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            X.A2e r10 = r7.A0E
            r15 = r23
            r10.Bhr(r11, r13, r15, r16)
        L_0x0066:
            boolean r0 = r7.A0B
            boolean r3 = r6.A0U
            if (r0 == r3) goto L_0x0088
            r7.A0B = r3
            android.view.Surface r0 = r8.A0A
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.isValid()
            r2 = 1
            if (r0 != 0) goto L_0x007a
        L_0x0079:
            r2 = 0
        L_0x007a:
            java.lang.Object[] r1 = X.C90524aI.A0w()
            java.lang.String r0 = "onVisualPlayStateChanged"
            A06(r7, r0, r1)
            X.A2e r0 = r7.A0E
            r0.BkX(r3, r2)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204359ps.A04(X.9ps, X.9ug, boolean):void");
    }

    public static void A05(C204359ps r3, String str, Throwable th, Object... objArr) {
        if (r3.A09) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(r3.hashCode());
            A0u.append(", playerId[");
            A0u.append(r3.A0N);
            A0u.append("]: ");
            A0u.append(str);
            C165607th.A1L(C36331k8.A0i(", message = ", A0u, th), "HeroPlayer", th, objArr);
        }
    }

    public static void A06(C204359ps r3, String str, Object... objArr) {
        if (r3.A09) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(r3.hashCode());
            A0u.append(", playerId[");
            A0u.append(r3.A0N);
            C165597tg.A1H(AnonymousClass000.A0p("]: ", str, A0u), "HeroPlayer", objArr);
        }
    }

    public int A07() {
        C204369pt A012;
        C202709mU r0;
        C203259ng r7 = this.A0D;
        try {
            C204359ps r6 = r7.A0B;
            if (!AnonymousClass000.A1P((r6.A0N > 0 ? 1 : (r6.A0N == 0 ? 0 : -1))) || (A012 = A01(r7, r6)) == null) {
                return 0;
            }
            C202979n2 r02 = A012.A12;
            if (r02 == null || (r0 = r02.A01) == null) {
                return 1;
            }
            return r0.A07.A00;
        } catch (RemoteException e) {
            A05(r7.A0B, "Error occurs while getPlaybackState", e, new Object[0]);
            return 0;
        }
    }

    public long A08() {
        C195979Xa r0;
        if (!AnonymousClass000.A1P((this.A0N > 0 ? 1 : (this.A0N == 0 ? 0 : -1)))) {
            return 0;
        }
        C203259ng r5 = this.A0D;
        if (r5.A05 == null || !this.A0S || SystemClock.elapsedRealtime() - this.A0Q > ((long) this.A05.returnRequestedSeekTimeTimeoutMs) || ((r0 = r5.A05) != null && r0.A00())) {
            return C165597tg.A0I(this).A00() + A00(this);
        }
        return this.A0O;
    }

    public C118655oW A0A() {
        long j;
        int i;
        List<AnonymousClass9JU> list = this.A0H;
        synchronized (list) {
            j = 0;
            i = 0;
            for (AnonymousClass9JU r2 : list) {
                long j2 = r2.A00;
                long j3 = r2.A01;
                if (j2 <= j3 || j3 <= 0 || j2 <= 0) {
                    IllegalStateException A092 = AnonymousClass001.A09("Start stall time is greater or equal to end stall time");
                    Object[] A0M2 = AnonymousClass001.A0M();
                    C90474aD.A1S(A0M2, j3);
                    C36421kH.A1P(A0M2, j2);
                    A05(this, "stallStartMs = %d, stallEndMs = %d", A092, A0M2);
                } else {
                    j += j2 - j3;
                    i++;
                    C195979Xa r22 = this.A0D.A05;
                    if (r22 != null && r22.A00()) {
                        C131916Rh.A02(this.A0I, this.A05.staleManifestThreshold, j3, j2);
                    }
                }
            }
            list.clear();
            this.A0I.clear();
            this.A00 = -1;
        }
        return new C118655oW(i, j);
    }

    public void A0E() {
        C204369pt A012;
        C203259ng r6 = this.A0D;
        try {
            C204359ps r5 = r6.A0B;
            if (AnonymousClass000.A1P((r5.A0N > 0 ? 1 : (r5.A0N == 0 ? 0 : -1))) && (A012 = A01(r6, r5)) != null) {
                C204369pt.A09(A012.A0l.obtainMessage(48), A012);
            }
        } catch (RemoteException e) {
            A05(r6.A0B, "Error occurs while seek to default position", e, C90524aI.A0w());
        }
    }

    public void A0G(float f) {
        Float valueOf = Float.valueOf(f);
        A06(this, "setVolume %f, trigger: %s", valueOf, "unknown");
        AnonymousClass000.A14(this.A0C, C36431kI.A1a(valueOf, "unknown", 2), 5);
    }

    public void A0H(int i, long j) {
        this.A0O = j;
        this.A0P = A0U.incrementAndGet();
        this.A0Q = SystemClock.elapsedRealtime();
        Handler handler = this.A0C;
        Object[] A0M2 = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M2, i);
        C36421kH.A1P(A0M2, j);
        AnonymousClass000.A14(handler, A0M2, 46);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [boolean] */
    public void A0J(AnonymousClass60G r9) {
        int i = r9.A00;
        Object[] objArr = new Object[2];
        ? A1b = C36361kB.A1b(objArr, i);
        objArr[1] = Boolean.valueOf(A1b);
        A06(this, "seekTo: seekTimeMsWithPreview: %d, jumpSeek: %s", objArr);
        this.A0O = (long) i;
        this.A0P = A0U.incrementAndGet();
        this.A0Q = SystemClock.elapsedRealtime();
        Handler handler = this.A0C;
        long[] jArr = new long[3];
        jArr[A1b] = this.A0O;
        jArr[1] = this.A0P;
        jArr[2] = 0;
        AnonymousClass000.A14(handler, jArr, 4);
    }

    public boolean A0M() {
        if (this.A0A) {
            return true;
        }
        if (AnonymousClass000.A1P((this.A0N > 0 ? 1 : (this.A0N == 0 ? 0 : -1))) && C165597tg.A0I(this).A0R) {
            return true;
        }
        if (!AnonymousClass000.A1P((this.A0N > 0 ? 1 : (this.A0N == 0 ? 0 : -1))) || !C165597tg.A0I(this).A0P) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02af, code lost:
        if (r6 != null) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0b0e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0b0f, code lost:
        A05(r5.A0B, "Error occurs while stop player", r4, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0cf7, code lost:
        if (r11 != null) goto L_0x0cf9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r23) {
        /*
            r22 = this;
            r2 = r23
            int r1 = r2.what
            r9 = 2
            r0 = 1
            r8 = 0
            r7 = r22
            switch(r1) {
                case 1: goto L_0x000d;
                case 2: goto L_0x008b;
                case 3: goto L_0x0107;
                case 4: goto L_0x0149;
                case 5: goto L_0x01a1;
                case 6: goto L_0x0211;
                case 7: goto L_0x0268;
                case 8: goto L_0x02c3;
                case 9: goto L_0x0350;
                case 10: goto L_0x0386;
                case 11: goto L_0x0410;
                case 12: goto L_0x041a;
                case 13: goto L_0x0425;
                case 14: goto L_0x0463;
                case 15: goto L_0x046e;
                case 16: goto L_0x04aa;
                case 17: goto L_0x04e6;
                case 18: goto L_0x0597;
                case 19: goto L_0x05cf;
                case 20: goto L_0x000c;
                case 21: goto L_0x0622;
                case 22: goto L_0x069c;
                case 23: goto L_0x06fd;
                case 24: goto L_0x076a;
                case 25: goto L_0x079b;
                case 26: goto L_0x07f6;
                case 27: goto L_0x0862;
                case 28: goto L_0x086f;
                case 29: goto L_0x08b4;
                case 30: goto L_0x0901;
                case 31: goto L_0x094a;
                case 32: goto L_0x0993;
                case 33: goto L_0x099a;
                case 34: goto L_0x09de;
                case 35: goto L_0x0a33;
                case 36: goto L_0x0a80;
                case 37: goto L_0x0acd;
                case 38: goto L_0x0cbb;
                case 39: goto L_0x0b1e;
                case 40: goto L_0x0b6b;
                case 41: goto L_0x000c;
                case 42: goto L_0x000c;
                case 43: goto L_0x000c;
                case 44: goto L_0x0bad;
                case 45: goto L_0x0bd3;
                case 46: goto L_0x0c02;
                case 47: goto L_0x0c3f;
                case 48: goto L_0x0c5e;
                case 49: goto L_0x0c6b;
                case 50: goto L_0x0c93;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r8
        L_0x000d:
            X.9ng r3 = r7.A0D
            java.lang.Object r6 = r2.obj
            X.9Xa r6 = (X.C195979Xa) r6
            X.9ps r4 = r3.A0B
            java.lang.Object[] r2 = new java.lang.Object[r9]
            X.9um r9 = r6.A0F
            java.lang.Integer r1 = r9.A07
            java.lang.String r1 = X.C1895794j.A00(r1)
            r2[r8] = r1
            android.net.Uri r1 = r9.A05
            r2[r0] = r1
            java.lang.String r1 = "prepareInternal, playRequest: %s, url: %s"
            A06(r4, r1, r2)
            X.9Xa r5 = r3.A05
            if (r5 == 0) goto L_0x004d
            java.lang.String r2 = r5.A07
            java.lang.String r1 = "WA_BOT"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004d
            X.9um r1 = r5.A0F
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x004d
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "prepareInternal, unchanged video source, skip preparing"
            A06(r4, r1, r2)
        L_0x0047:
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "prepare"
            goto L_0x0ce7
        L_0x004d:
            X.C203259ng.A05(r3)
            r3.A05 = r6
            r3.A07 = r0
            X.AUR r1 = r4.A05
            boolean r5 = r1.enableFixForOnPreparingCallback
            if (r5 == 0) goto L_0x006b
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "onPreparing"
            A06(r4, r1, r2)
            java.util.concurrent.atomic.AtomicInteger r1 = A0T
            r1.incrementAndGet()
            X.A2e r1 = r4.A0E
            r1.BdQ()
        L_0x006b:
            X.C203259ng.A01(r3)     // Catch:{ RemoteException -> 0x006f }
            goto L_0x0077
        L_0x006f:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while ensureAndRecoverServicePlayer in prepare"
            A05(r4, r1, r3, r2)
        L_0x0077:
            if (r5 != 0) goto L_0x0047
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "onPreparing"
            A06(r4, r1, r2)
            java.util.concurrent.atomic.AtomicInteger r1 = A0T
            r1.incrementAndGet()
            X.A2e r1 = r4.A0E
            r1.BdQ()
            goto L_0x0047
        L_0x008b:
            X.9ng r10 = r7.A0D
            java.lang.Object r1 = r2.obj
            long r3 = X.C36431kI.A09(r1)
            boolean r1 = r10.A07
            if (r1 == 0) goto L_0x00a5
            X.C203259ng.A01(r10)     // Catch:{ RemoteException -> 0x009b }
            goto L_0x00a5
        L_0x009b:
            r6 = move-exception
            X.9ps r5 = r10.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while ensureAndRecoverServicePlayer in play"
            A05(r5, r1, r6, r2)
        L_0x00a5:
            X.9ps r5 = r10.A0B
            X.A2e r1 = r5.A0E
            r1.BkJ()
            r10.A08 = r0
            long r1 = r5.A0N     // Catch:{ RemoteException -> 0x00f9 }
            r11 = 0
            int r6 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r6)     // Catch:{ RemoteException -> 0x00f9 }
            if (r1 != 0) goto L_0x00c3
            java.lang.String r1 = "Before play(), service player was evicted. Recover now"
            X.C165597tg.A19(r5, r1)     // Catch:{ RemoteException -> 0x00f9 }
        L_0x00bf:
            X.C203259ng.A01(r10)     // Catch:{ RemoteException -> 0x00f9 }
            goto L_0x0101
        L_0x00c3:
            X.9lT r6 = X.C203259ng.A00(r10)     // Catch:{ RemoteException -> 0x00f9 }
            long r1 = r5.A0N     // Catch:{ RemoteException -> 0x00f9 }
            java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x00f9 }
            X.AnonymousClass000.A1M(r11, r8, r1)     // Catch:{ RemoteException -> 0x00f9 }
            java.lang.String r9 = "id [%d]: play"
            X.9pt r2 = X.AnonymousClass9UR.A00(r6, r9, r11, r1)     // Catch:{ RemoteException -> 0x00f9 }
            if (r2 != 0) goto L_0x00dc
            java.lang.String r1 = "When play(), service player is noticed to be evicted earlier. Recover now"
            X.C203259ng.A06(r10, r5, r1)     // Catch:{ RemoteException -> 0x00f9 }
            goto L_0x00bf
        L_0x00dc:
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.A0J     // Catch:{ RemoteException -> 0x00f9 }
            boolean r1 = r1.compareAndSet(r0, r8)     // Catch:{ RemoteException -> 0x00f9 }
            r2.A0N(r3, r1)     // Catch:{ RemoteException -> 0x00f9 }
            X.AUR r1 = r6.A0B     // Catch:{ RemoteException -> 0x00f9 }
            boolean r1 = r1.enableBoostOngoingPrefetchPriorityPlay     // Catch:{ RemoteException -> 0x00f9 }
            if (r1 == 0) goto L_0x0101
            X.9Xa r1 = r2.A10     // Catch:{ RemoteException -> 0x00f9 }
            if (r1 == 0) goto L_0x0101
            X.9um r1 = r1.A0F     // Catch:{ RemoteException -> 0x00f9 }
            java.lang.String r1 = r1.A0H     // Catch:{ RemoteException -> 0x00f9 }
            if (r1 == 0) goto L_0x0101
            X.C202289lT.A02(r6, r1)     // Catch:{ RemoteException -> 0x00f9 }
            goto L_0x0101
        L_0x00f9:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while sending play request"
            A05(r5, r1, r3, r2)
        L_0x0101:
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "play"
            goto L_0x0ce7
        L_0x0107:
            X.9ng r5 = r7.A0D
            java.lang.Object r6 = r2.obj
            java.lang.String r6 = (java.lang.String) r6
            r5.A08 = r8
            X.9ps r4 = r5.A0B     // Catch:{ RemoteException -> 0x0139 }
            long r2 = r4.A0N     // Catch:{ RemoteException -> 0x0139 }
            r9 = 0
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0139 }
            if (r1 != 0) goto L_0x0123
            java.lang.String r1 = "Before pause(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r4, r1)     // Catch:{ RemoteException -> 0x0139 }
            goto L_0x0143
        L_0x0123:
            X.9lT r3 = X.C203259ng.A00(r5)     // Catch:{ RemoteException -> 0x0139 }
            long r1 = r4.A0N     // Catch:{ RemoteException -> 0x0139 }
            if (r6 != 0) goto L_0x012d
            java.lang.String r6 = ""
        L_0x012d:
            boolean r1 = r3.A09(r6, r1, r8)     // Catch:{ RemoteException -> 0x0139 }
            if (r1 != 0) goto L_0x0143
            java.lang.String r1 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C203259ng.A06(r5, r4, r1)     // Catch:{ RemoteException -> 0x0139 }
            goto L_0x0143
        L_0x0139:
            r4 = move-exception
            X.9ps r3 = r5.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while pausing the video"
            A05(r3, r1, r4, r2)
        L_0x0143:
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "pause"
            goto L_0x0ce7
        L_0x0149:
            java.lang.Object r3 = r2.obj
            long[] r3 = (long[]) r3
            X.9ng r6 = r7.A0D
            r1 = r3[r8]
            int r10 = (int) r1
            r15 = r3[r0]
            r4 = 1
            r2 = r3[r9]
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x015d
            r8 = 1
        L_0x015d:
            r6.A01 = r10
            r9 = 0
            X.9ps r5 = r6.A0B     // Catch:{ RemoteException -> 0x018d }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x018d }
            r1 = 0
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1P(r10)     // Catch:{ RemoteException -> 0x018d }
            if (r3 != 0) goto L_0x0176
            java.lang.String r3 = "Before seekTo(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r5, r3)     // Catch:{ RemoteException -> 0x018d }
            r5.A0P = r1     // Catch:{ RemoteException -> 0x018d }
            goto L_0x019b
        L_0x0176:
            X.9lT r10 = X.C203259ng.A00(r6)     // Catch:{ RemoteException -> 0x018d }
            long r11 = r5.A0N     // Catch:{ RemoteException -> 0x018d }
            int r1 = r6.A01     // Catch:{ RemoteException -> 0x018d }
            long r13 = (long) r1     // Catch:{ RemoteException -> 0x018d }
            r17 = r8
            boolean r1 = r10.A06(r11, r13, r15, r17)     // Catch:{ RemoteException -> 0x018d }
            if (r1 != 0) goto L_0x019b
            java.lang.String r1 = "When seekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C203259ng.A06(r6, r5, r1)     // Catch:{ RemoteException -> 0x018d }
            goto L_0x019b
        L_0x018d:
            r4 = move-exception
            X.9ps r3 = r6.A0B
            r1 = 0
            r3.A0P = r1
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r1 = "Error occurs while seeking the video"
            A05(r3, r1, r4, r2)
        L_0x019b:
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "seek"
            goto L_0x0ce7
        L_0x01a1:
            java.lang.Object r1 = r2.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            X.9ng r9 = r7.A0D
            r1 = r1[r8]
            float r7 = X.C36441kJ.A03(r1)
            r6 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x01b8
            int r1 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x01c1
        L_0x01b8:
            X.9ps r3 = r9.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Trying to set volume with invalid value"
            A06(r3, r1, r2)
        L_0x01c1:
            X.9ps r5 = r9.A0B
            float r1 = X.C165597tg.A01(r6, r7, r4)
            r5.A0M = r1
            long r2 = r5.A0N     // Catch:{ RemoteException -> 0x0208 }
            r6 = 0
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0208 }
            if (r1 != 0) goto L_0x01db
            java.lang.String r1 = "Before setVolume(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r5, r1)     // Catch:{ RemoteException -> 0x0208 }
            return r0
        L_0x01db:
            X.9lT r7 = X.C203259ng.A00(r9)     // Catch:{ RemoteException -> 0x0208 }
            long r2 = r5.A0N     // Catch:{ RemoteException -> 0x0208 }
            float r6 = r5.A0M     // Catch:{ RemoteException -> 0x0208 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0208 }
            X.AnonymousClass000.A1M(r4, r8, r2)     // Catch:{ RemoteException -> 0x0208 }
            java.lang.String r1 = "id [%d]: setVolume"
            X.9pt r4 = X.AnonymousClass9UR.A00(r7, r1, r4, r2)     // Catch:{ RemoteException -> 0x0208 }
            if (r4 != 0) goto L_0x01f6
            java.lang.String r1 = "When setVolume(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C203259ng.A06(r9, r5, r1)     // Catch:{ RemoteException -> 0x0208 }
            return r0
        L_0x01f6:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0208 }
            java.lang.String r1 = "Set volume"
            X.C204369pt.A0F(r4, r1, r2)     // Catch:{ RemoteException -> 0x0208 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x0208 }
            java.lang.Float r2 = java.lang.Float.valueOf(r6)     // Catch:{ RemoteException -> 0x0208 }
            r1 = 5
            X.C204369pt.A08(r3, r4, r2, r1)     // Catch:{ RemoteException -> 0x0208 }
            return r0
        L_0x0208:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting volume"
            A05(r5, r1, r3, r2)
            return r0
        L_0x0211:
            X.9ng r5 = r7.A0D
            java.lang.Object r4 = r2.obj
            android.view.Surface r4 = (android.view.Surface) r4
            r5.A0A = r4
            if (r4 == 0) goto L_0x0230
            android.view.Surface r1 = r5.A04
            if (r4 != r1) goto L_0x0230
            X.9ps r3 = r5.A0B
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r8] = r4
            java.lang.String r1 = "surface already sent, skipping send again: %s"
            A06(r3, r1, r2)
        L_0x022a:
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "setSurface"
            goto L_0x0ce7
        L_0x0230:
            X.9ps r6 = r5.A0B     // Catch:{ RemoteException -> 0x025d }
            long r2 = r6.A0N     // Catch:{ RemoteException -> 0x025d }
            r9 = 0
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x025d }
            if (r1 != 0) goto L_0x0244
            java.lang.String r1 = "Before setSurface(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r6, r1)     // Catch:{ RemoteException -> 0x025d }
            goto L_0x022a
        L_0x0244:
            X.9lT r4 = X.C203259ng.A00(r5)     // Catch:{ RemoteException -> 0x025d }
            long r2 = r6.A0N     // Catch:{ RemoteException -> 0x025d }
            android.view.Surface r1 = r5.A0A     // Catch:{ RemoteException -> 0x025d }
            boolean r1 = r4.A08(r1, r2)     // Catch:{ RemoteException -> 0x025d }
            if (r1 != 0) goto L_0x0258
            java.lang.String r1 = "When setSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C203259ng.A06(r5, r6, r1)     // Catch:{ RemoteException -> 0x025d }
            goto L_0x022a
        L_0x0258:
            android.view.Surface r1 = r5.A0A     // Catch:{ RemoteException -> 0x025d }
            r5.A04 = r1     // Catch:{ RemoteException -> 0x025d }
            goto L_0x022a
        L_0x025d:
            r4 = move-exception
            X.9ps r3 = r5.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting surface"
            A05(r3, r1, r4, r2)
            goto L_0x022a
        L_0x0268:
            java.lang.Object r6 = r2.obj
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            X.9ng r9 = r7.A0D
            r5 = 0
            r9.A0A = r5     // Catch:{ RemoteException -> 0x02a2 }
            X.9ps r4 = r9.A0B     // Catch:{ RemoteException -> 0x02a2 }
            long r1 = r4.A0N     // Catch:{ RemoteException -> 0x02a2 }
            r10 = 0
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r3)     // Catch:{ RemoteException -> 0x02a2 }
            if (r1 != 0) goto L_0x0285
            java.lang.String r1 = "Before releaseSurface(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r4, r1)     // Catch:{ RemoteException -> 0x02a2 }
            goto L_0x02af
        L_0x0285:
            X.9lT r3 = X.C203259ng.A00(r9)     // Catch:{ RemoteException -> 0x02a2 }
            long r1 = r4.A0N     // Catch:{ RemoteException -> 0x02a2 }
            boolean r1 = r3.A07(r6, r1)     // Catch:{ RemoteException -> 0x02a2 }
            if (r1 == 0) goto L_0x029c
            java.lang.String r1 = "Surface release request already sent, let it complete"
            X.C165597tg.A19(r4, r1)     // Catch:{ RemoteException -> 0x02a2 }
            r9.A04 = r5     // Catch:{ RemoteException -> 0x0299, all -> 0x02c1 }
            goto L_0x02b4
        L_0x0299:
            r4 = move-exception
            r6 = r5
            goto L_0x02a3
        L_0x029c:
            java.lang.String r1 = "When releaseSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C203259ng.A06(r9, r4, r1)     // Catch:{ RemoteException -> 0x02a2 }
            goto L_0x02af
        L_0x02a2:
            r4 = move-exception
        L_0x02a3:
            X.9ps r3 = r9.A0B     // Catch:{ all -> 0x02ba }
            java.lang.String r2 = "Error occurs while releasing surface"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x02ba }
            A05(r3, r2, r4, r1)     // Catch:{ all -> 0x02ba }
            if (r6 == 0) goto L_0x02b4
            goto L_0x02b1
        L_0x02af:
            if (r6 == 0) goto L_0x02b4
        L_0x02b1:
            r6.send(r0, r5)
        L_0x02b4:
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "releaseSurface"
            goto L_0x0ce7
        L_0x02ba:
            r2 = move-exception
            if (r6 == 0) goto L_0x02c2
            r6.send(r0, r5)
            throw r2
        L_0x02c1:
            r2 = move-exception
        L_0x02c2:
            throw r2
        L_0x02c3:
            X.9ng r9 = r7.A0D
            X.9ps r4 = r9.A0B     // Catch:{ RemoteException -> 0x02f1 }
            long r1 = r4.A0N     // Catch:{ RemoteException -> 0x02f1 }
            r5 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r3)     // Catch:{ RemoteException -> 0x02f1 }
            if (r1 != 0) goto L_0x02d9
            java.lang.String r1 = "Before release(), service player was evicted. Skip releasing"
            X.C165597tg.A19(r4, r1)     // Catch:{ RemoteException -> 0x02f1 }
            goto L_0x02fb
        L_0x02d9:
            X.9lT r6 = X.C203259ng.A00(r9)     // Catch:{ RemoteException -> 0x02f1 }
            long r1 = r4.A0N     // Catch:{ RemoteException -> 0x02f1 }
            java.lang.Object[] r5 = X.AnonymousClass001.A0L()     // Catch:{ RemoteException -> 0x02f1 }
            X.C90474aD.A1S(r5, r1)     // Catch:{ RemoteException -> 0x02f1 }
            java.lang.String r3 = "id [%d]: release"
            X.C200599hh.A02(r3, r5)     // Catch:{ RemoteException -> 0x02f1 }
            X.9UR r3 = r6.A0V     // Catch:{ RemoteException -> 0x02f1 }
            r3.A02(r1, r8)     // Catch:{ RemoteException -> 0x02f1 }
            goto L_0x02fb
        L_0x02f1:
            r3 = move-exception
            X.9ps r4 = r9.A0B     // Catch:{ all -> 0x033a }
            java.lang.String r2 = "Error occurs while release player"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x033a }
            A05(r4, r2, r3, r1)     // Catch:{ all -> 0x033a }
        L_0x02fb:
            r9.A08 = r8
            X.C203259ng.A05(r9)
            r1 = 0
            r4.A0M = r1
            r2 = 0
            r4.A0N = r2
            long[] r1 = r4.A0K
            r1[r0] = r2
            r1[r8] = r2
            android.os.Handler r3 = r4.A0C
            android.os.Looper r1 = r3.getLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r2 = r1.getName()
            java.lang.String r1 = "HeroPlayerInternalThread"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0330
            X.AUR r1 = r4.A05
            boolean r2 = r1.quitHandlerSafely
            android.os.Looper r1 = r3.getLooper()
            if (r2 == 0) goto L_0x0336
            r1.quitSafely()
        L_0x0330:
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "release"
            goto L_0x0ce7
        L_0x0336:
            r1.quit()
            goto L_0x0330
        L_0x033a:
            r5 = move-exception
            r9.A08 = r8
            X.C203259ng.A05(r9)
            X.9ps r4 = r9.A0B
            r1 = 0
            r4.A0M = r1
            r2 = 0
            r4.A0N = r2
            long[] r1 = r4.A0K
            r1[r0] = r2
            r1[r8] = r2
            throw r5
        L_0x0350:
            X.9ng r5 = r7.A0D
            java.lang.Object r1 = r2.obj
            boolean r2 = X.AnonymousClass000.A1X(r1)
            X.9ps r3 = r5.A0B     // Catch:{ RemoteException -> 0x0376 }
            X.AUR r1 = r3.A05     // Catch:{ RemoteException -> 0x0376 }
            boolean r1 = r1.disableRecoverInBackground     // Catch:{ RemoteException -> 0x0376 }
            if (r1 == 0) goto L_0x0363
            if (r2 == 0) goto L_0x0363
            goto L_0x0367
        L_0x0363:
            X.C203259ng.A01(r5)     // Catch:{ RemoteException -> 0x0376 }
            goto L_0x0369
        L_0x0367:
            r5.A07 = r0     // Catch:{ RemoteException -> 0x0376 }
        L_0x0369:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0376 }
            java.lang.String r1 = "onVideoServiceConnected"
            A06(r3, r1, r2)     // Catch:{ RemoteException -> 0x0376 }
            X.A2e r1 = r3.A0E     // Catch:{ RemoteException -> 0x0376 }
            r1.BkK()     // Catch:{ RemoteException -> 0x0376 }
            goto L_0x0380
        L_0x0376:
            r4 = move-exception
            X.9ps r3 = r5.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs in handleServiceConnected"
            A05(r3, r1, r4, r2)
        L_0x0380:
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "connected"
            goto L_0x0ce7
        L_0x0386:
            X.9ng r5 = r7.A0D
            r1 = 0
            r5.A06 = r1
            r5.A04 = r1
            X.9ps r10 = r5.A0B
            long r2 = r10.A0N
            r8 = 0
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)
            if (r1 != 0) goto L_0x03e0
            r3 = 0
        L_0x039d:
            r5.A02 = r3
            X.9Xa r1 = r5.A05
            if (r1 == 0) goto L_0x03dd
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x03dd
            long r1 = r10.A08()
        L_0x03ad:
            r5.A03 = r1
            X.9ug r11 = X.C165597tg.A0I(r10)
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r5 = r11.A08
            boolean r1 = r11.A0R
            if (r1 == 0) goto L_0x03da
            boolean r1 = r11.A0P
            if (r1 != 0) goto L_0x03da
            float r12 = r11.A00
            long r3 = r11.A0H
            long r1 = r8 - r3
            float r3 = (float) r1
            float r12 = r12 * r3
            long r1 = (long) r12
        L_0x03ca:
            long r5 = r5 + r1
            r11.A08 = r5
            long r3 = r11.A0E
            long r3 = r3 + r1
            r11.A0E = r3
            r11.A0P = r0
            r11.A0H = r8
            java.lang.Object r1 = r10.A0F
            monitor-enter(r1)
            goto L_0x0403
        L_0x03da:
            r1 = 0
            goto L_0x03ca
        L_0x03dd:
            r1 = 0
            goto L_0x03ad
        L_0x03e0:
            boolean r1 = r10.A0S
            if (r1 == 0) goto L_0x03f7
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r1 = r10.A0Q
            long r8 = r8 - r1
            X.AUR r1 = r10.A05
            int r1 = r1.returnRequestedSeekTimeTimeoutMs
            long r2 = (long) r1
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x03f7
            long r3 = r10.A0O
            goto L_0x039d
        L_0x03f7:
            X.9ug r1 = X.C165597tg.A0I(r10)
            long r3 = r1.A08
            long r1 = A00(r10)
            long r3 = r3 + r1
            goto L_0x039d
        L_0x0403:
            r1.notifyAll()     // Catch:{ all -> 0x040d }
            monitor-exit(r1)     // Catch:{ all -> 0x040d }
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "disconnected"
            goto L_0x0ce7
        L_0x040d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x040d }
            throw r2
        L_0x0410:
            X.9ng r3 = r7.A0D
            java.lang.Object r1 = r2.obj
            X.9ug r1 = (X.C207179ug) r1
            X.C203259ng.A07(r3, r1)
            return r0
        L_0x041a:
            X.9ng r1 = r7.A0D
            X.C203259ng.A03(r1)
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "servicePlayerRelease"
            goto L_0x0ce7
        L_0x0425:
            X.9ng r6 = r7.A0D
            java.lang.Object r7 = r2.obj
            X.9ps r10 = r6.A0B     // Catch:{ RemoteException -> 0x045a }
            long r1 = r10.A0N     // Catch:{ RemoteException -> 0x045a }
            r4 = 0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r3)     // Catch:{ RemoteException -> 0x045a }
            if (r1 != 0) goto L_0x043d
            java.lang.String r1 = "Before setCustomQuality(), service player was evicted. Skip setting custom quality"
            X.C165597tg.A19(r10, r1)     // Catch:{ RemoteException -> 0x045a }
            return r0
        L_0x043d:
            X.9lT r5 = X.C203259ng.A00(r6)     // Catch:{ RemoteException -> 0x045a }
            long r2 = r10.A0N     // Catch:{ RemoteException -> 0x045a }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x045a }
            X.AnonymousClass000.A1M(r4, r8, r2)     // Catch:{ RemoteException -> 0x045a }
            r4[r0] = r7     // Catch:{ RemoteException -> 0x045a }
            java.lang.String r1 = "id [%d]: setCustomQuality: %s"
            X.9pt r3 = X.AnonymousClass9UR.A00(r5, r1, r4, r2)     // Catch:{ RemoteException -> 0x045a }
            if (r3 == 0) goto L_0x0cea
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x045a }
            r1 = 25
            X.C204369pt.A08(r2, r3, r7, r1)     // Catch:{ RemoteException -> 0x045a }
            return r0
        L_0x045a:
            r2 = move-exception
            X.9ps r4 = r6.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting custom quality"
            goto L_0x0d93
        L_0x0463:
            X.9ng r1 = r7.A0D
            X.C203259ng.A04(r1)
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "reset"
            goto L_0x0ce7
        L_0x046e:
            X.9ng r6 = r7.A0D
            java.lang.Object r7 = r2.obj
            X.9ps r9 = r6.A0B     // Catch:{ RemoteException -> 0x04a1 }
            long r2 = r9.A0N     // Catch:{ RemoteException -> 0x04a1 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x04a1 }
            if (r1 != 0) goto L_0x0486
            java.lang.String r1 = "Before setDeviceOrientationFrame(), service player was evicted. Skip setting device orientation frame"
            X.C165597tg.A19(r9, r1)     // Catch:{ RemoteException -> 0x04a1 }
            return r0
        L_0x0486:
            X.9lT r5 = X.C203259ng.A00(r6)     // Catch:{ RemoteException -> 0x04a1 }
            long r3 = r9.A0N     // Catch:{ RemoteException -> 0x04a1 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x04a1 }
            X.AnonymousClass000.A1M(r2, r8, r3)     // Catch:{ RemoteException -> 0x04a1 }
            java.lang.String r1 = "id [%d]: setDeviceOrientationFrame"
            X.9pt r3 = X.AnonymousClass9UR.A00(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x04a1 }
            if (r3 == 0) goto L_0x0cea
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x04a1 }
            r1 = 13
            X.C204369pt.A08(r2, r3, r7, r1)     // Catch:{ RemoteException -> 0x04a1 }
            return r0
        L_0x04a1:
            r2 = move-exception
            X.9ps r4 = r6.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting device orientation frame"
            goto L_0x0d93
        L_0x04aa:
            X.9ng r6 = r7.A0D
            java.lang.Object r7 = r2.obj
            X.9ps r9 = r6.A0B     // Catch:{ RemoteException -> 0x04dd }
            long r2 = r9.A0N     // Catch:{ RemoteException -> 0x04dd }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x04dd }
            if (r1 != 0) goto L_0x04c2
            java.lang.String r1 = "Before setSpatialAudioFocus(), service player was evicted. Skip setting spatial audio focus"
            X.C165597tg.A19(r9, r1)     // Catch:{ RemoteException -> 0x04dd }
            return r0
        L_0x04c2:
            X.9lT r5 = X.C203259ng.A00(r6)     // Catch:{ RemoteException -> 0x04dd }
            long r3 = r9.A0N     // Catch:{ RemoteException -> 0x04dd }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x04dd }
            X.AnonymousClass000.A1M(r2, r8, r3)     // Catch:{ RemoteException -> 0x04dd }
            java.lang.String r1 = "id [%d]: setSpatialAudioFocus"
            X.9pt r3 = X.AnonymousClass9UR.A00(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x04dd }
            if (r3 == 0) goto L_0x0cea
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x04dd }
            r1 = 14
            X.C204369pt.A08(r2, r3, r7, r1)     // Catch:{ RemoteException -> 0x04dd }
            return r0
        L_0x04dd:
            r2 = move-exception
            X.9ps r4 = r6.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting spatial audio focus"
            goto L_0x0d93
        L_0x04e6:
            java.lang.Object r2 = r2.obj
            java.lang.String[] r2 = (java.lang.String[]) r2
            X.9ng r5 = r7.A0D
            r7 = r2[r8]
            r6 = r2[r0]
            r4 = r2[r9]
            r1 = 3
            r3 = r2[r1]
            r1 = 4
            r13 = r2[r1]
            X.9Xa r2 = r5.A05
            if (r2 == 0) goto L_0x056d
            boolean r1 = r2.A00()
            if (r1 == 0) goto L_0x056d
            java.lang.Integer r18 = X.C023109s.A0C
            X.9um r1 = r2.A0F
            java.lang.Integer r1 = r1.A07
            int r3 = r1.intValue()
            if (r3 == r0) goto L_0x0517
            if (r3 == r8) goto L_0x053a
            r1 = 3
            if (r3 == r1) goto L_0x0537
            if (r3 != r9) goto L_0x0517
            java.lang.Integer r18 = X.C023109s.A0G
        L_0x0517:
            X.9ps r1 = r5.A0B
            r13 = 0
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.String r3 = "force live video to complete upon 410 dismiss error"
            A06(r1, r3, r4)
            boolean r3 = r5.A08
            if (r3 == 0) goto L_0x0cea
            X.5oW r15 = r1.A0A()
            X.9ug r5 = X.C165597tg.A0I(r1)
            if (r5 != 0) goto L_0x053d
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r2 = "Force Video To End terminated early"
            A06(r1, r2, r3)
            return r0
        L_0x0537:
            java.lang.Integer r18 = X.C023109s.A0S
            goto L_0x0517
        L_0x053a:
            java.lang.Integer r18 = X.C023109s.A01
            goto L_0x0517
        L_0x053d:
            A03(r1, r5)
            boolean r3 = r5.A0R
            if (r3 != 0) goto L_0x0557
            X.A2e r3 = r1.A0E
            X.9uQ r4 = X.C165607th.A0K(r1)
            java.lang.String r6 = "unknown"
            r7 = 0
            r11 = -1
            java.lang.String r10 = r2.A08
            r9 = r7
            r14 = 0
            r8 = r7
            r3.BkN(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
        L_0x0557:
            X.A2e r14 = r1.A0E
            X.9uQ r16 = X.C165607th.A0K(r1)
            boolean r3 = r1.A0R
            java.lang.String r1 = r2.A08
            r20 = 0
            r17 = r5
            r19 = r1
            r21 = r3
            r14.BkG(r15, r16, r17, r18, r19, r20, r21)
            return r0
        L_0x056d:
            r9 = 0
            X.9ps r2 = r5.A0B
            X.AUR r1 = r2.A05
            boolean r1 = r1.logStallOnPauseOnError
            if (r1 == 0) goto L_0x057a
            X.5oW r9 = r2.A0A()
        L_0x057a:
            X.A2e r8 = r2.A0E
            X.9ug r12 = X.C165597tg.A0I(r2)
            X.9uQ r11 = X.C165607th.A0K(r2)
            X.902 r2 = X.AnonymousClass902.valueOf(r7)
            X.906 r1 = X.AnonymousClass906.valueOf(r6)
            X.9iQ r10 = new X.9iQ
            r10.<init>(r1, r2, r4, r3)
            java.lang.String r14 = ""
            r8.Bcn(r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0597:
            X.9ng r7 = r7.A0D
            int r1 = r2.arg1
            r7.A00 = r1
            X.9ps r6 = r7.A0B     // Catch:{ RemoteException -> 0x05c6 }
            long r2 = r6.A0N     // Catch:{ RemoteException -> 0x05c6 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x05c6 }
            if (r1 != 0) goto L_0x05b1
            java.lang.String r1 = "Before setRelativePosition(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r6, r1)     // Catch:{ RemoteException -> 0x05c6 }
            return r0
        L_0x05b1:
            X.9lT r5 = X.C203259ng.A00(r7)     // Catch:{ RemoteException -> 0x05c6 }
            long r3 = r6.A0N     // Catch:{ RemoteException -> 0x05c6 }
            int r1 = r7.A00     // Catch:{ RemoteException -> 0x05c6 }
            long r1 = (long) r1     // Catch:{ RemoteException -> 0x05c6 }
            boolean r1 = r5.A05(r3, r1)     // Catch:{ RemoteException -> 0x05c6 }
            if (r1 != 0) goto L_0x0cea
            java.lang.String r1 = "When setRelativePosition(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C203259ng.A06(r7, r6, r1)     // Catch:{ RemoteException -> 0x05c6 }
            return r0
        L_0x05c6:
            r2 = move-exception
            X.9ps r4 = r7.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting relative position of the video"
            goto L_0x0d93
        L_0x05cf:
            X.9ng r10 = r7.A0D
            java.lang.Object r1 = r2.obj
            boolean r11 = X.AnonymousClass000.A1X(r1)
            X.9ps r6 = r10.A0B
            r6.A0R = r11
            long r1 = r6.A0N     // Catch:{ RemoteException -> 0x061b }
            r4 = 0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r3)     // Catch:{ RemoteException -> 0x061b }
            if (r1 != 0) goto L_0x05ed
            java.lang.String r1 = "Before setLooping(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r6, r1)     // Catch:{ RemoteException -> 0x061b }
            return r0
        L_0x05ed:
            X.9lT r7 = X.C203259ng.A00(r10)     // Catch:{ RemoteException -> 0x061b }
            long r1 = r6.A0N     // Catch:{ RemoteException -> 0x061b }
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x061b }
            X.AnonymousClass000.A1M(r5, r8, r1)     // Catch:{ RemoteException -> 0x061b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)     // Catch:{ RemoteException -> 0x061b }
            r5[r0] = r4     // Catch:{ RemoteException -> 0x061b }
            java.lang.String r3 = "id [%d]: setLooping %s"
            X.9pt r3 = X.AnonymousClass9UR.A00(r7, r3, r5, r1)     // Catch:{ RemoteException -> 0x061b }
            if (r3 != 0) goto L_0x060c
            java.lang.String r1 = "When setLooping(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C203259ng.A06(r10, r6, r1)     // Catch:{ RemoteException -> 0x061b }
            return r0
        L_0x060c:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x061b }
            java.lang.String r1 = "Set Looping"
            X.C204369pt.A0F(r3, r1, r2)     // Catch:{ RemoteException -> 0x061b }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x061b }
            r1 = 18
            X.C204369pt.A08(r2, r3, r4, r1)     // Catch:{ RemoteException -> 0x061b }
            return r0
        L_0x061b:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting looping"
            goto L_0x0a2f
        L_0x0622:
            X.9ng r4 = r7.A0D
            java.lang.Object r7 = r2.obj
            X.9JV r7 = (X.AnonymousClass9JV) r7
            X.9ps r10 = r4.A0B
            java.lang.Object[] r5 = new java.lang.Object[r9]
            long r2 = r7.A01
            X.AnonymousClass000.A1M(r5, r8, r2)
            X.9Gt r1 = r7.A00
            if (r1 == 0) goto L_0x0657
            android.view.Surface r1 = r1.A01
        L_0x0637:
            r5[r0] = r1
            java.lang.String r1 = "switchToWarmupPlayer: player id: %d, surface: %s"
            A06(r10, r1, r5)
            X.9Xa r6 = r4.A05
            if (r6 == 0) goto L_0x0659
            java.lang.String r5 = r7.A02
            X.AUR r1 = r10.A05
            java.lang.String r1 = X.C198079cs.A00(r6, r1)
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0659
            java.lang.String r0 = "switchToWarmupPlayer is called after setVideoPlaybackParams"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r0)
            throw r2
        L_0x0657:
            r1 = 0
            goto L_0x0637
        L_0x0659:
            long r5 = r10.A0N     // Catch:{ RemoteException -> 0x067d }
            r11 = 0
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x067d }
            if (r1 == 0) goto L_0x0685
            X.9lT r11 = X.C203259ng.A00(r4)     // Catch:{ RemoteException -> 0x067d }
            long r5 = r10.A0N     // Catch:{ RemoteException -> 0x067d }
            java.lang.Object[] r9 = X.AnonymousClass001.A0L()     // Catch:{ RemoteException -> 0x067d }
            X.C90474aD.A1S(r9, r5)     // Catch:{ RemoteException -> 0x067d }
            java.lang.String r1 = "id [%d]: release"
            X.C200599hh.A02(r1, r9)     // Catch:{ RemoteException -> 0x067d }
            X.9UR r1 = r11.A0V     // Catch:{ RemoteException -> 0x067d }
            r1.A02(r5, r0)     // Catch:{ RemoteException -> 0x067d }
            goto L_0x0685
        L_0x067d:
            r6 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while release player"
            A05(r10, r1, r6, r5)
        L_0x0685:
            r10.A0N = r2
            long[] r3 = r10.A0K
            r1 = r3[r8]
            r3[r0] = r1
            long r1 = r10.A0N
            r3[r8] = r1
            X.9Gt r1 = r7.A00
            if (r1 == 0) goto L_0x0cea
            android.view.Surface r1 = r1.A01
            r4.A0A = r1
            r4.A04 = r1
            return r0
        L_0x069c:
            X.9ng r3 = r7.A0D
            java.lang.Object r1 = r2.obj
            boolean r11 = X.AnonymousClass000.A1X(r1)
            X.9ps r6 = r3.A0B
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r2[r8] = r10
            java.lang.String r1 = "liveLatencyMode: %d"
            A06(r6, r1, r2)
            X.9lT r7 = X.C203259ng.A00(r3)     // Catch:{ RemoteException -> 0x06f6 }
            long r1 = r6.A0N     // Catch:{ RemoteException -> 0x06f6 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x06f6 }
            X.AnonymousClass000.A1M(r4, r8, r1)     // Catch:{ RemoteException -> 0x06f6 }
            r4[r0] = r10     // Catch:{ RemoteException -> 0x06f6 }
            java.lang.String r3 = "id [%d]: liveLatencyMode %d"
            X.9pt r4 = X.AnonymousClass9UR.A00(r7, r3, r4, r1)     // Catch:{ RemoteException -> 0x06f6 }
            if (r4 != 0) goto L_0x06d4
            java.lang.String r2 = "Fail to setLiveLatencyMode to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x06f6 }
            if (r11 != 0) goto L_0x06d0
            r5 = 0
        L_0x06d0:
            X.AnonymousClass000.A1L(r1, r5, r8)     // Catch:{ RemoteException -> 0x06f6 }
            goto L_0x06f2
        L_0x06d4:
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x06f6 }
            r2[r8] = r10     // Catch:{ RemoteException -> 0x06f6 }
            java.lang.String r1 = "Set rewindableVideoMode: %d"
            X.C204369pt.A0F(r4, r1, r2)     // Catch:{ RemoteException -> 0x06f6 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x06f6 }
            r2 = 22
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)     // Catch:{ RemoteException -> 0x06f6 }
            X.C204369pt.A08(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x06f6 }
            java.lang.String r2 = "setLiveLatencyMode successfully to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x06f6 }
            if (r11 != 0) goto L_0x06ef
            r5 = 0
        L_0x06ef:
            X.AnonymousClass000.A1L(r1, r5, r8)     // Catch:{ RemoteException -> 0x06f6 }
        L_0x06f2:
            A06(r6, r2, r1)     // Catch:{ RemoteException -> 0x06f6 }
            return r0
        L_0x06f6:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting liveLatencyMode the video"
            goto L_0x0a2f
        L_0x06fd:
            X.9ng r4 = r7.A0D
            java.lang.Object r5 = r2.obj
            java.lang.Number r5 = (java.lang.Number) r5
            int r7 = r5.intValue()
            X.9ps r6 = r4.A0B
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r8] = r5
            java.lang.String r1 = "setAudioUsage: %d"
            A06(r6, r1, r2)
            long r1 = r6.A0N     // Catch:{ RemoteException -> 0x0763 }
            r10 = 0
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r3)     // Catch:{ RemoteException -> 0x0763 }
            if (r1 != 0) goto L_0x0726
            java.lang.String r2 = "player must be valid before updating the audioUsage"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0763 }
        L_0x0722:
            A06(r6, r2, r1)     // Catch:{ RemoteException -> 0x0763 }
            goto L_0x0762
        L_0x0726:
            X.9lT r10 = X.C203259ng.A00(r4)     // Catch:{ RemoteException -> 0x0763 }
            long r1 = r6.A0N     // Catch:{ RemoteException -> 0x0763 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x0763 }
            X.AnonymousClass000.A1M(r4, r8, r1)     // Catch:{ RemoteException -> 0x0763 }
            r4[r0] = r5     // Catch:{ RemoteException -> 0x0763 }
            java.lang.String r3 = "id [%d]: setAudioUsage %d"
            X.9pt r4 = X.AnonymousClass9UR.A00(r10, r3, r4, r1)     // Catch:{ RemoteException -> 0x0763 }
            if (r4 != 0) goto L_0x0742
            java.lang.String r2 = "failed to setAudioUsage to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0763 }
        L_0x073f:
            r1[r8] = r5     // Catch:{ RemoteException -> 0x0763 }
            goto L_0x0722
        L_0x0742:
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0763 }
            r2[r8] = r5     // Catch:{ RemoteException -> 0x0763 }
            java.lang.String r1 = "Set audioUsage: %d"
            X.C204369pt.A0F(r4, r1, r2)     // Catch:{ RemoteException -> 0x0763 }
            r1 = 1
            if (r7 == 0) goto L_0x0752
            r1 = 2
            if (r7 == r9) goto L_0x0752
            r1 = 0
        L_0x0752:
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x0763 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ RemoteException -> 0x0763 }
            r1 = 23
            X.C204369pt.A08(r3, r4, r2, r1)     // Catch:{ RemoteException -> 0x0763 }
            java.lang.String r2 = "setAudioUsage successfully to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0763 }
            goto L_0x073f
        L_0x0762:
            return r0
        L_0x0763:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "error occurred while setting audio usage"
            goto L_0x0a2f
        L_0x076a:
            X.9ng r7 = r7.A0D
            X.9ps r6 = r7.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Force Video To End triggered"
            A06(r6, r1, r2)
            long r4 = r6.A0N     // Catch:{ RemoteException -> 0x07ef }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x07ef }
            if (r1 != 0) goto L_0x0787
            java.lang.String r1 = "Before pause(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r6, r1)     // Catch:{ RemoteException -> 0x07ef }
            return r0
        L_0x0787:
            X.9lT r4 = X.C203259ng.A00(r7)     // Catch:{ RemoteException -> 0x07ef }
            long r2 = r6.A0N     // Catch:{ RemoteException -> 0x07ef }
            java.lang.String r1 = ""
            boolean r1 = r4.A09(r1, r2, r0)     // Catch:{ RemoteException -> 0x07ef }
            if (r1 != 0) goto L_0x0cea
            java.lang.String r1 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C203259ng.A06(r7, r6, r1)     // Catch:{ RemoteException -> 0x07ef }
            return r0
        L_0x079b:
            X.9ng r10 = r7.A0D
            java.lang.Object r1 = r2.obj
            int r11 = X.AnonymousClass000.A0I(r1)
            X.9ps r6 = r10.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Pre Seek To"
            A06(r6, r1, r2)
            long r1 = r6.A0N     // Catch:{ RemoteException -> 0x07ef }
            r4 = 0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r3)     // Catch:{ RemoteException -> 0x07ef }
            if (r1 != 0) goto L_0x07be
            java.lang.String r1 = "Before preSeekTo(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r6, r1)     // Catch:{ RemoteException -> 0x07ef }
            return r0
        L_0x07be:
            X.9lT r7 = X.C203259ng.A00(r10)     // Catch:{ RemoteException -> 0x07ef }
            long r1 = r6.A0N     // Catch:{ RemoteException -> 0x07ef }
            long r3 = (long) r11     // Catch:{ RemoteException -> 0x07ef }
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x07ef }
            X.AnonymousClass000.A1M(r5, r8, r1)     // Catch:{ RemoteException -> 0x07ef }
            java.lang.Long r4 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x07ef }
            r5[r0] = r4     // Catch:{ RemoteException -> 0x07ef }
            java.lang.String r3 = "id [%d]: preSeekTo %d"
            X.9pt r3 = X.AnonymousClass9UR.A00(r7, r3, r5, r1)     // Catch:{ RemoteException -> 0x07ef }
            if (r3 != 0) goto L_0x07de
            java.lang.String r1 = "When preSeekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C203259ng.A06(r10, r6, r1)     // Catch:{ RemoteException -> 0x07ef }
            return r0
        L_0x07de:
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x07ef }
            r2[r8] = r4     // Catch:{ RemoteException -> 0x07ef }
            java.lang.String r1 = "preSeekTo %d"
            X.C204369pt.A0F(r3, r1, r2)     // Catch:{ RemoteException -> 0x07ef }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x07ef }
            r1 = 26
            X.C204369pt.A08(r2, r3, r4, r1)     // Catch:{ RemoteException -> 0x07ef }
            return r0
        L_0x07ef:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while pausing the video"
            goto L_0x0a2f
        L_0x07f6:
            X.9ng r9 = r7.A0D
            java.lang.Object r1 = r2.obj
            float r7 = X.C36441kJ.A03(r1)
            r5 = 1082130432(0x40800000, float:4.0)
            r4 = 1048576000(0x3e800000, float:0.25)
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x080a
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0813
        L_0x080a:
            X.9ps r3 = r9.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Trying to set playback speed with invalid value"
            A06(r3, r1, r2)
        L_0x0813:
            X.9ps r6 = r9.A0B
            float r1 = X.C165597tg.A01(r5, r7, r4)
            r6.A0L = r1
            long r2 = r6.A0N     // Catch:{ RemoteException -> 0x085b }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x085b }
            if (r1 != 0) goto L_0x082d
            java.lang.String r1 = "Before setPlaybackSpeed(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r6, r1)     // Catch:{ RemoteException -> 0x085b }
            return r0
        L_0x082d:
            X.9lT r7 = X.C203259ng.A00(r9)     // Catch:{ RemoteException -> 0x085b }
            long r2 = r6.A0N     // Catch:{ RemoteException -> 0x085b }
            float r5 = r6.A0L     // Catch:{ RemoteException -> 0x085b }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x085b }
            X.AnonymousClass000.A1M(r4, r8, r2)     // Catch:{ RemoteException -> 0x085b }
            java.lang.String r1 = "id [%d]: setPlaybackSpeed"
            X.9pt r4 = X.AnonymousClass9UR.A00(r7, r1, r4, r2)     // Catch:{ RemoteException -> 0x085b }
            if (r4 != 0) goto L_0x0848
            java.lang.String r1 = "When setPlaybackSpeed(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C203259ng.A06(r9, r6, r1)     // Catch:{ RemoteException -> 0x085b }
            return r0
        L_0x0848:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x085b }
            java.lang.String r1 = "Set playback speed"
            X.C204369pt.A0F(r4, r1, r2)     // Catch:{ RemoteException -> 0x085b }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x085b }
            java.lang.Float r2 = java.lang.Float.valueOf(r5)     // Catch:{ RemoteException -> 0x085b }
            r1 = 27
            X.C204369pt.A08(r3, r4, r2, r1)     // Catch:{ RemoteException -> 0x085b }
            return r0
        L_0x085b:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting playback speed"
            goto L_0x0a2f
        L_0x0862:
            X.9ng r1 = r7.A0D
            java.lang.Object r2 = r2.obj
            java.lang.String r2 = (java.lang.String) r2
            X.9Xa r1 = r1.A05
            if (r1 == 0) goto L_0x0cea
            r1.A07 = r2
            return r0
        L_0x086f:
            X.9ng r6 = r7.A0D
            X.9ps r7 = r6.A0B     // Catch:{ RemoteException -> 0x08ab }
            long r4 = r7.A0N     // Catch:{ RemoteException -> 0x08ab }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x08ab }
            if (r1 != 0) goto L_0x0885
            java.lang.String r1 = "Before retry(), service player was evicted. Lazy recover at next play()"
            X.C165597tg.A19(r7, r1)     // Catch:{ RemoteException -> 0x08ab }
            return r0
        L_0x0885:
            X.9lT r5 = X.C203259ng.A00(r6)     // Catch:{ RemoteException -> 0x08ab }
            long r3 = r7.A0N     // Catch:{ RemoteException -> 0x08ab }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x08ab }
            X.AnonymousClass000.A1M(r2, r8, r3)     // Catch:{ RemoteException -> 0x08ab }
            java.lang.String r1 = "id [%d]: retry playback"
            X.9pt r3 = X.AnonymousClass9UR.A00(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x08ab }
            if (r3 == 0) goto L_0x0cea
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x08ab }
            java.lang.String r1 = "retry"
            X.C204369pt.A0F(r3, r1, r2)     // Catch:{ RemoteException -> 0x08ab }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x08ab }
            r1 = 28
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ RemoteException -> 0x08ab }
            X.C204369pt.A09(r1, r3)     // Catch:{ RemoteException -> 0x08ab }
            return r0
        L_0x08ab:
            r2 = move-exception
            X.9ps r4 = r6.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while retrying the same video playback"
            goto L_0x0d93
        L_0x08b4:
            X.9ng r7 = r7.A0D
            java.lang.Object r1 = r2.obj
            boolean r11 = X.AnonymousClass000.A1X(r1)
            X.9ps r10 = r7.A0B     // Catch:{ RemoteException -> 0x08f8 }
            long r2 = r10.A0N     // Catch:{ RemoteException -> 0x08f8 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x08f8 }
            if (r1 != 0) goto L_0x08d0
            java.lang.String r1 = "Before enableVideoTrack(), service player was evicted. Skip it"
            X.C165597tg.A19(r10, r1)     // Catch:{ RemoteException -> 0x08f8 }
            return r0
        L_0x08d0:
            X.9lT r6 = X.C203259ng.A00(r7)     // Catch:{ RemoteException -> 0x08f8 }
            long r2 = r10.A0N     // Catch:{ RemoteException -> 0x08f8 }
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x08f8 }
            X.AnonymousClass000.A1M(r5, r8, r2)     // Catch:{ RemoteException -> 0x08f8 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)     // Catch:{ RemoteException -> 0x08f8 }
            r5[r0] = r4     // Catch:{ RemoteException -> 0x08f8 }
            java.lang.String r1 = "id [%d]: enable video track %b"
            X.9pt r3 = X.AnonymousClass9UR.A00(r6, r1, r5, r2)     // Catch:{ RemoteException -> 0x08f8 }
            if (r3 == 0) goto L_0x0cea
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x08f8 }
            java.lang.String r1 = "Enable Video Track"
            X.C204369pt.A0F(r3, r1, r2)     // Catch:{ RemoteException -> 0x08f8 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x08f8 }
            r1 = 29
            X.C204369pt.A08(r2, r3, r4, r1)     // Catch:{ RemoteException -> 0x08f8 }
            return r0
        L_0x08f8:
            r2 = move-exception
            X.9ps r4 = r7.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while set video track visibilty"
            goto L_0x0d93
        L_0x0901:
            X.9ng r3 = r7.A0D
            java.lang.Object r5 = r2.obj
            X.9ps r6 = r3.A0B
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r8] = r5
            java.lang.String r1 = "should enable live low latency optimization: %s"
            A06(r6, r1, r2)
            X.9lT r7 = X.C203259ng.A00(r3)     // Catch:{ RemoteException -> 0x0943 }
            long r1 = r6.A0N     // Catch:{ RemoteException -> 0x0943 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x0943 }
            X.AnonymousClass000.A1M(r4, r8, r1)     // Catch:{ RemoteException -> 0x0943 }
            r4[r0] = r5     // Catch:{ RemoteException -> 0x0943 }
            java.lang.String r3 = "id [%d]: setFullScreen %s"
            X.9pt r3 = X.AnonymousClass9UR.A00(r7, r3, r4, r1)     // Catch:{ RemoteException -> 0x0943 }
            if (r3 != 0) goto L_0x092f
            java.lang.String r2 = "Fail to enable live low latency optimization to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0943 }
        L_0x0929:
            r1[r8] = r5     // Catch:{ RemoteException -> 0x0943 }
            A06(r6, r2, r1)     // Catch:{ RemoteException -> 0x0943 }
            goto L_0x0942
        L_0x092f:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0943 }
            java.lang.String r1 = "Enable live low latency optimization"
            X.C204369pt.A0F(r3, r1, r2)     // Catch:{ RemoteException -> 0x0943 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0943 }
            r1 = 30
            X.C204369pt.A08(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x0943 }
            java.lang.String r2 = "enable live low latency optimization successfully to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0943 }
            goto L_0x0929
        L_0x0942:
            return r0
        L_0x0943:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while enabling live low latency optimization"
            goto L_0x0a2f
        L_0x094a:
            X.9ng r3 = r7.A0D
            java.lang.Object r5 = r2.obj
            X.9ps r6 = r3.A0B
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r8] = r5
            java.lang.String r1 = "streamLatencyMode: %d"
            A06(r6, r1, r2)
            X.9lT r7 = X.C203259ng.A00(r3)     // Catch:{ RemoteException -> 0x098c }
            long r1 = r6.A0N     // Catch:{ RemoteException -> 0x098c }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x098c }
            X.AnonymousClass000.A1M(r4, r8, r1)     // Catch:{ RemoteException -> 0x098c }
            r4[r0] = r5     // Catch:{ RemoteException -> 0x098c }
            java.lang.String r3 = "id [%d]: streamLatencyMode %d"
            X.9pt r3 = X.AnonymousClass9UR.A00(r7, r3, r4, r1)     // Catch:{ RemoteException -> 0x098c }
            if (r3 != 0) goto L_0x0978
            java.lang.String r2 = "Fail to streamLatencyMode to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x098c }
        L_0x0972:
            r1[r8] = r5     // Catch:{ RemoteException -> 0x098c }
            A06(r6, r2, r1)     // Catch:{ RemoteException -> 0x098c }
            goto L_0x098b
        L_0x0978:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x098c }
            java.lang.String r1 = "Enable stream latency toggle"
            X.C204369pt.A0F(r3, r1, r2)     // Catch:{ RemoteException -> 0x098c }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x098c }
            r1 = 31
            X.C204369pt.A08(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x098c }
            java.lang.String r2 = "streamLatencyMode successfully to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x098c }
            goto L_0x0972
        L_0x098b:
            return r0
        L_0x098c:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting streamLatencyMode the video"
            goto L_0x0a2f
        L_0x0993:
            X.9ng r1 = r7.A0D
            r1.A09 = r0
            r1.A07 = r0
            return r0
        L_0x099a:
            X.9ng r3 = r7.A0D
            java.lang.Object r10 = r2.obj
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r7 = r10.booleanValue()
            X.9ps r6 = r3.A0B
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r8] = r10
            java.lang.String r1 = "enableWakeLock: %s"
            A06(r6, r1, r2)
            X.9lT r5 = X.C203259ng.A00(r3)     // Catch:{ RemoteException -> 0x09d8 }
            long r1 = r6.A0N     // Catch:{ RemoteException -> 0x09d8 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x09d8 }
            X.AnonymousClass000.A1M(r4, r8, r1)     // Catch:{ RemoteException -> 0x09d8 }
            X.AnonymousClass000.A1L(r4, r7, r0)     // Catch:{ RemoteException -> 0x09d8 }
            java.lang.String r3 = "id [%d]: enableWakeLock %d"
            X.9pt r1 = X.AnonymousClass9UR.A00(r5, r3, r4, r1)     // Catch:{ RemoteException -> 0x09d8 }
            if (r1 != 0) goto L_0x09cf
            java.lang.String r2 = "Fail to enableWakeLock to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x09d8 }
        L_0x09c9:
            r1[r8] = r10     // Catch:{ RemoteException -> 0x09d8 }
            A06(r6, r2, r1)     // Catch:{ RemoteException -> 0x09d8 }
            goto L_0x09d7
        L_0x09cf:
            r1.A0P(r7)     // Catch:{ RemoteException -> 0x09d8 }
            java.lang.String r2 = "enableWakeLock successfully to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x09d8 }
            goto L_0x09c9
        L_0x09d7:
            return r0
        L_0x09d8:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting enableWakeLock to the video"
            goto L_0x0a2f
        L_0x09de:
            X.9ng r3 = r7.A0D
            java.lang.Object r5 = r2.obj
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r10 = r5.booleanValue()
            X.9ps r6 = r3.A0B
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r8] = r5
            java.lang.String r1 = "convert stereo to mono: %s"
            A06(r6, r1, r2)
            X.9lT r7 = X.C203259ng.A00(r3)     // Catch:{ RemoteException -> 0x0a2a }
            long r2 = r6.A0N     // Catch:{ RemoteException -> 0x0a2a }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x0a2a }
            X.AnonymousClass000.A1M(r4, r8, r2)     // Catch:{ RemoteException -> 0x0a2a }
            r4[r0] = r5     // Catch:{ RemoteException -> 0x0a2a }
            java.lang.String r1 = "id [%d]: convertStereoToMono %s"
            X.9pt r4 = X.AnonymousClass9UR.A00(r7, r1, r4, r2)     // Catch:{ RemoteException -> 0x0a2a }
            if (r4 != 0) goto L_0x0a12
            java.lang.String r2 = "Fail to convertStereoToMono to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0a2a }
        L_0x0a0c:
            r1[r8] = r5     // Catch:{ RemoteException -> 0x0a2a }
            A06(r6, r2, r1)     // Catch:{ RemoteException -> 0x0a2a }
            goto L_0x0a29
        L_0x0a12:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0a2a }
            java.lang.String r1 = "convertStereoToMono"
            X.C204369pt.A0F(r4, r1, r2)     // Catch:{ RemoteException -> 0x0a2a }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x0a2a }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ RemoteException -> 0x0a2a }
            r1 = 32
            X.C204369pt.A08(r3, r4, r2, r1)     // Catch:{ RemoteException -> 0x0a2a }
            java.lang.String r2 = "convert Stereo to Mono successfully to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0a2a }
            goto L_0x0a0c
        L_0x0a29:
            return r0
        L_0x0a2a:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while setting shouldConvertStereoToMono to the video"
        L_0x0a2f:
            A05(r6, r1, r3, r2)
            return r0
        L_0x0a33:
            X.9ng r7 = r7.A0D
            java.lang.Object r1 = r2.obj
            long r11 = X.C36431kI.A09(r1)
            X.9ps r10 = r7.A0B     // Catch:{ RemoteException -> 0x0a77 }
            long r2 = r10.A0N     // Catch:{ RemoteException -> 0x0a77 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0a77 }
            if (r1 != 0) goto L_0x0a4f
            java.lang.String r1 = "Before onBeforeRender(), service player was evicted. Skip it"
            X.C165597tg.A19(r10, r1)     // Catch:{ RemoteException -> 0x0a77 }
            return r0
        L_0x0a4f:
            X.9lT r6 = X.C203259ng.A00(r7)     // Catch:{ RemoteException -> 0x0a77 }
            long r2 = r10.A0N     // Catch:{ RemoteException -> 0x0a77 }
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x0a77 }
            X.AnonymousClass000.A1M(r5, r8, r2)     // Catch:{ RemoteException -> 0x0a77 }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ RemoteException -> 0x0a77 }
            r5[r0] = r4     // Catch:{ RemoteException -> 0x0a77 }
            java.lang.String r1 = "id [%d]: onBeforeRender %d"
            X.9pt r3 = X.AnonymousClass9UR.A00(r6, r1, r5, r2)     // Catch:{ RemoteException -> 0x0a77 }
            if (r3 == 0) goto L_0x0cea
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0a77 }
            java.lang.String r1 = "onBeforeRender"
            X.C204369pt.A0F(r3, r1, r2)     // Catch:{ RemoteException -> 0x0a77 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0a77 }
            r1 = 35
            X.C204369pt.A08(r2, r3, r4, r1)     // Catch:{ RemoteException -> 0x0a77 }
            return r0
        L_0x0a77:
            r2 = move-exception
            X.9ps r4 = r7.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while set onBeforeRender"
            goto L_0x0d93
        L_0x0a80:
            X.9ng r7 = r7.A0D
            java.lang.Object r1 = r2.obj
            boolean r11 = X.AnonymousClass000.A1X(r1)
            X.9ps r10 = r7.A0B     // Catch:{ RemoteException -> 0x0ac4 }
            long r2 = r10.A0N     // Catch:{ RemoteException -> 0x0ac4 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0ac4 }
            if (r1 != 0) goto L_0x0a9c
            java.lang.String r1 = "Before onRender(), service player was evicted. Skip it"
            X.C165597tg.A19(r10, r1)     // Catch:{ RemoteException -> 0x0ac4 }
            return r0
        L_0x0a9c:
            X.9lT r6 = X.C203259ng.A00(r7)     // Catch:{ RemoteException -> 0x0ac4 }
            long r2 = r10.A0N     // Catch:{ RemoteException -> 0x0ac4 }
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x0ac4 }
            X.AnonymousClass000.A1M(r5, r8, r2)     // Catch:{ RemoteException -> 0x0ac4 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)     // Catch:{ RemoteException -> 0x0ac4 }
            r5[r0] = r4     // Catch:{ RemoteException -> 0x0ac4 }
            java.lang.String r1 = "id [%d]: onRender %b"
            X.9pt r3 = X.AnonymousClass9UR.A00(r6, r1, r5, r2)     // Catch:{ RemoteException -> 0x0ac4 }
            if (r3 == 0) goto L_0x0cea
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0ac4 }
            java.lang.String r1 = "onRender"
            X.C204369pt.A0F(r3, r1, r2)     // Catch:{ RemoteException -> 0x0ac4 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0ac4 }
            r1 = 36
            X.C204369pt.A08(r2, r3, r4, r1)     // Catch:{ RemoteException -> 0x0ac4 }
            return r0
        L_0x0ac4:
            r2 = move-exception
            X.9ps r4 = r7.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while set onRender "
            goto L_0x0d93
        L_0x0acd:
            X.9ng r5 = r7.A0D
            X.9ps r4 = r5.A0B     // Catch:{ RemoteException -> 0x0b0e }
            long r2 = r4.A0N     // Catch:{ RemoteException -> 0x0b0e }
            r9 = 0
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0b0e }
            if (r1 != 0) goto L_0x0ae3
            java.lang.String r1 = "Before stop(), service player was evicted. Skip it"
            X.C165597tg.A19(r4, r1)     // Catch:{ RemoteException -> 0x0b0e }
            goto L_0x0b18
        L_0x0ae3:
            X.9lT r6 = X.C203259ng.A00(r5)     // Catch:{ RemoteException -> 0x0b0e }
            long r2 = r4.A0N     // Catch:{ RemoteException -> 0x0b0e }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0b0e }
            X.AnonymousClass000.A1M(r4, r8, r2)     // Catch:{ RemoteException -> 0x0b0e }
            java.lang.String r1 = "id [%d]: stop"
            X.9pt r3 = X.AnonymousClass9UR.A00(r6, r1, r4, r2)     // Catch:{ RemoteException -> 0x0b0e }
            if (r3 == 0) goto L_0x0b18
            monitor-enter(r3)     // Catch:{ RemoteException -> 0x0b0e }
            java.lang.String r2 = "Stop player"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0b0b }
            X.C204369pt.A0F(r3, r2, r1)     // Catch:{ all -> 0x0b0b }
            android.os.Handler r2 = r3.A0l     // Catch:{ all -> 0x0b0b }
            r1 = 41
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ all -> 0x0b0b }
            X.C204369pt.A09(r1, r3)     // Catch:{ all -> 0x0b0b }
            monitor-exit(r3)     // Catch:{ RemoteException -> 0x0b0e }
            goto L_0x0b18
        L_0x0b0b:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ RemoteException -> 0x0b0e }
            throw r1     // Catch:{ RemoteException -> 0x0b0e }
        L_0x0b0e:
            r4 = move-exception
            X.9ps r3 = r5.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while stop player"
            A05(r3, r1, r4, r2)
        L_0x0b18:
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "stop"
            goto L_0x0ce7
        L_0x0b1e:
            X.9ng r7 = r7.A0D
            java.lang.Object r1 = r2.obj
            boolean r6 = X.AnonymousClass000.A1X(r1)
            X.9ps r10 = r7.A0B     // Catch:{ RemoteException -> 0x0d84 }
            long r1 = r10.A0N     // Catch:{ RemoteException -> 0x0d84 }
            r4 = 0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r3)     // Catch:{ RemoteException -> 0x0d84 }
            if (r1 != 0) goto L_0x0b3a
            java.lang.String r1 = "Before enableSR(), service player was evicted. Skip it"
            X.C165597tg.A19(r10, r1)     // Catch:{ RemoteException -> 0x0d84 }
            return r0
        L_0x0b3a:
            X.9lT r5 = X.C203259ng.A00(r7)     // Catch:{ RemoteException -> 0x0d84 }
            long r1 = r10.A0N     // Catch:{ RemoteException -> 0x0d84 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x0d84 }
            X.AnonymousClass000.A1M(r4, r8, r1)     // Catch:{ RemoteException -> 0x0d84 }
            X.AnonymousClass000.A1L(r4, r6, r0)     // Catch:{ RemoteException -> 0x0d84 }
            java.lang.String r3 = "id [%d]: enableSR %d"
            X.9pt r4 = X.AnonymousClass9UR.A00(r5, r3, r4, r1)     // Catch:{ RemoteException -> 0x0d84 }
            if (r4 == 0) goto L_0x0cea
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ RemoteException -> 0x0d84 }
            java.lang.String r1 = "Enabling SR: "
            java.lang.String r2 = X.C36371kC.A0z(r1, r2, r6)     // Catch:{ RemoteException -> 0x0d84 }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0d84 }
            X.C204369pt.A0F(r4, r2, r1)     // Catch:{ RemoteException -> 0x0d84 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x0d84 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)     // Catch:{ RemoteException -> 0x0d84 }
            r1 = 43
            X.C204369pt.A08(r3, r4, r2, r1)     // Catch:{ RemoteException -> 0x0d84 }
            return r0
        L_0x0b6b:
            java.lang.Object r1 = r2.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            X.9ng r6 = r7.A0D
            r1 = r1[r0]
            boolean r10 = X.AnonymousClass000.A1X(r1)
            X.9ps r7 = r6.A0B     // Catch:{ RemoteException -> 0x0ba4 }
            long r2 = r7.A0N     // Catch:{ RemoteException -> 0x0ba4 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0ba4 }
            if (r1 != 0) goto L_0x0b8b
            java.lang.String r1 = "Before reconfigureVrPlayer, service player was evicted. Skip it"
            X.C165597tg.A19(r7, r1)     // Catch:{ RemoteException -> 0x0ba4 }
            return r0
        L_0x0b8b:
            X.9lT r5 = X.C203259ng.A00(r6)     // Catch:{ RemoteException -> 0x0ba4 }
            long r2 = r7.A0N     // Catch:{ RemoteException -> 0x0ba4 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x0ba4 }
            X.AnonymousClass000.A1M(r4, r8, r2)     // Catch:{ RemoteException -> 0x0ba4 }
            X.AnonymousClass000.A1L(r4, r10, r0)     // Catch:{ RemoteException -> 0x0ba4 }
            java.lang.String r1 = "id [%d]: reconfigureVrPlayer %d"
            X.C200599hh.A02(r1, r4)     // Catch:{ RemoteException -> 0x0ba4 }
            X.9UR r1 = r5.A0V     // Catch:{ RemoteException -> 0x0ba4 }
            r1.A01(r2)     // Catch:{ RemoteException -> 0x0ba4 }
            return r0
        L_0x0ba4:
            r2 = move-exception
            X.9ps r4 = r6.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while reconfigureVrPlayer "
            goto L_0x0d93
        L_0x0bad:
            java.lang.Object r9 = r2.obj
            X.9ng r7 = r7.A0D
            X.9ps r6 = r7.A0B     // Catch:{ RemoteException -> 0x0bf9 }
            long r4 = r6.A0N     // Catch:{ RemoteException -> 0x0bf9 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0bf9 }
            if (r1 != 0) goto L_0x0bc5
            java.lang.String r1 = "Before addExoPlayerListener, service player was evicted. Skip it"
            X.C165597tg.A19(r6, r1)     // Catch:{ RemoteException -> 0x0bf9 }
            return r0
        L_0x0bc5:
            X.9pt r3 = A01(r7, r6)     // Catch:{ RemoteException -> 0x0bf9 }
            if (r3 == 0) goto L_0x0cea
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0bf9 }
            r1 = 45
            X.C204369pt.A08(r2, r3, r9, r1)     // Catch:{ RemoteException -> 0x0bf9 }
            return r0
        L_0x0bd3:
            java.lang.Object r9 = r2.obj
            X.9ng r7 = r7.A0D
            X.9ps r6 = r7.A0B     // Catch:{ RemoteException -> 0x0bf9 }
            long r4 = r6.A0N     // Catch:{ RemoteException -> 0x0bf9 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0bf9 }
            if (r1 != 0) goto L_0x0beb
            java.lang.String r1 = "Before addExoPlayerListener, service player was evicted. Skip it"
            X.C165597tg.A19(r6, r1)     // Catch:{ RemoteException -> 0x0bf9 }
            return r0
        L_0x0beb:
            X.9pt r3 = A01(r7, r6)     // Catch:{ RemoteException -> 0x0bf9 }
            if (r3 == 0) goto L_0x0cea
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0bf9 }
            r1 = 46
            X.C204369pt.A08(r2, r3, r9, r1)     // Catch:{ RemoteException -> 0x0bf9 }
            return r0
        L_0x0bf9:
            r2 = move-exception
            X.9ps r4 = r7.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while addExoplayerListener"
            goto L_0x0d93
        L_0x0c02:
            java.lang.Object r2 = r2.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.9ng r10 = r7.A0D
            r1 = r2[r8]
            int r11 = X.AnonymousClass000.A0I(r1)
            long r4 = X.C165587tf.A0C(r2, r0)
            X.9ps r12 = r10.A0B     // Catch:{ RemoteException -> 0x0c36 }
            long r2 = r12.A0N     // Catch:{ RemoteException -> 0x0c36 }
            r6 = 0
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0c36 }
            if (r1 == 0) goto L_0x0cea
            X.9pt r6 = A01(r10, r12)     // Catch:{ RemoteException -> 0x0c36 }
            if (r6 == 0) goto L_0x0cea
            android.os.Handler r3 = r6.A0l     // Catch:{ RemoteException -> 0x0c36 }
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x0c36 }
            X.AnonymousClass000.A1L(r2, r11, r8)     // Catch:{ RemoteException -> 0x0c36 }
            X.AnonymousClass000.A1M(r2, r0, r4)     // Catch:{ RemoteException -> 0x0c36 }
            r1 = 49
            X.C204369pt.A08(r3, r6, r2, r1)     // Catch:{ RemoteException -> 0x0c36 }
            return r0
        L_0x0c36:
            r2 = move-exception
            X.9ps r4 = r10.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while seek to default position"
            goto L_0x0d93
        L_0x0c3f:
            X.9ng r9 = r7.A0D
            java.lang.Object r1 = r2.obj
            boolean r7 = X.AnonymousClass000.A1X(r1)
            X.9ps r6 = r9.A0B     // Catch:{ RemoteException -> 0x0d8c }
            long r4 = r6.A0N     // Catch:{ RemoteException -> 0x0d8c }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0d8c }
            if (r1 == 0) goto L_0x0cea
            X.9pt r1 = A01(r9, r6)     // Catch:{ RemoteException -> 0x0d8c }
            if (r1 == 0) goto L_0x0cea
            r1.A0h = r7     // Catch:{ RemoteException -> 0x0d8c }
            return r0
        L_0x0c5e:
            X.9ng r1 = r7.A0D
            X.C203259ng.A02(r1)     // Catch:{ RemoteException -> 0x0c64 }
            goto L_0x0c6a
        L_0x0c64:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x0c6a:
            return r0
        L_0x0c6b:
            X.9ng r7 = r7.A0D
            X.9ps r6 = r7.A0B     // Catch:{ RemoteException -> 0x0d84 }
            long r4 = r6.A0N     // Catch:{ RemoteException -> 0x0d84 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0d84 }
            if (r1 != 0) goto L_0x0c81
            java.lang.String r1 = "Before stopExo(), service player was evicted. Skip it"
            X.C165597tg.A19(r6, r1)     // Catch:{ RemoteException -> 0x0d84 }
            return r0
        L_0x0c81:
            X.9pt r3 = A01(r7, r6)     // Catch:{ RemoteException -> 0x0d84 }
            if (r3 == 0) goto L_0x0cea
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0d84 }
            r1 = 50
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ RemoteException -> 0x0d84 }
            X.C204369pt.A09(r1, r3)     // Catch:{ RemoteException -> 0x0d84 }
            return r0
        L_0x0c93:
            X.9ng r7 = r7.A0D
            X.9ps r6 = r7.A0B     // Catch:{ RemoteException -> 0x0d84 }
            long r4 = r6.A0N     // Catch:{ RemoteException -> 0x0d84 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r1)     // Catch:{ RemoteException -> 0x0d84 }
            if (r1 != 0) goto L_0x0ca9
            java.lang.String r1 = "Before resetforreuse(), service player was evicted. Skip it"
            X.C165597tg.A19(r6, r1)     // Catch:{ RemoteException -> 0x0d84 }
            return r0
        L_0x0ca9:
            X.9pt r3 = A01(r7, r6)     // Catch:{ RemoteException -> 0x0d84 }
            if (r3 == 0) goto L_0x0cea
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0d84 }
            r1 = 51
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ RemoteException -> 0x0d84 }
            X.C204369pt.A09(r1, r3)     // Catch:{ RemoteException -> 0x0d84 }
            return r0
        L_0x0cbb:
            java.lang.Object r2 = r2.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.9ng r9 = r7.A0D
            r1 = r2[r8]
            boolean r14 = X.AnonymousClass000.A1X(r1)
            r1 = r2[r0]
            android.graphics.SurfaceTexture r1 = (android.graphics.SurfaceTexture) r1
            X.9ps r6 = r9.A0B
            long r4 = r6.A0N
            r2 = 0
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1P(r10)
            if (r4 != 0) goto L_0x0ceb
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Before pause(), service player was evicted. Lazy recover at next play()"
            A06(r6, r1, r2)
        L_0x0ce0:
            X.C203259ng.A04(r9)
        L_0x0ce3:
            X.9RJ r2 = r7.A02
            java.lang.String r1 = "pauseAndMoveToWarmupPool"
        L_0x0ce7:
            r2.A00(r1)
        L_0x0cea:
            return r0
        L_0x0ceb:
            X.9Gu r5 = r6.A03
            X.9lT r11 = r5.A00
            if (r11 != 0) goto L_0x0cf9
            X.9D0 r4 = r5.A01
            X.9lT r11 = r4.A00
            r5.A00 = r11
            if (r11 == 0) goto L_0x0d71
        L_0x0cf9:
            long r4 = r6.A0N
            java.lang.Object[] r12 = new java.lang.Object[r0]
            X.AnonymousClass000.A1M(r12, r8, r4)
            java.lang.String r10 = "id [%d]: pauseAndMoveToWarmup"
            X.9pt r13 = X.AnonymousClass9UR.A00(r11, r10, r12, r4)
            if (r13 == 0) goto L_0x0d78
            X.9Xa r10 = r13.A10
            android.view.Surface r12 = r13.A0H
            if (r10 == 0) goto L_0x0d78
            if (r12 == 0) goto L_0x0d78
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r4 = "moveToWarmup"
            X.C204369pt.A0F(r13, r4, r5)
            android.os.Handler r8 = r13.A0l
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r14)
            r4 = 42
            X.C204369pt.A08(r8, r13, r5, r4)
            X.9cs r14 = r11.A0E
            long r4 = r13.A0k
            X.AUR r11 = r14.A03
            java.lang.String r13 = X.C198079cs.A00(r10, r11)
            X.9JV r8 = new X.9JV
            r8.<init>(r13, r4)
            X.9Gt r4 = new X.9Gt
            r4.<init>(r1, r12)
            r8.A00 = r4
            android.util.LruCache r13 = r14.A00
            int r4 = r13.size()
            int r1 = r13.maxSize()
            if (r4 != r1) goto L_0x0d6a
            java.util.Map r1 = r13.snapshot()
            java.util.Iterator r4 = X.AnonymousClass000.A0y(r1)
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0d6a
            java.util.Map$Entry r12 = X.AnonymousClass000.A11(r4)
            java.lang.Object r1 = r12.getKey()
            r13.remove(r1)
            android.util.LruCache r5 = r14.A01
            java.lang.Object r4 = r12.getKey()
            java.lang.Object r1 = r12.getValue()
            r5.put(r4, r1)
        L_0x0d6a:
            java.lang.String r1 = X.C198079cs.A00(r10, r11)
            r13.put(r1, r8)
        L_0x0d71:
            X.C203259ng.A05(r9)
            r6.A0N = r2
            goto L_0x0ce3
        L_0x0d78:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            A06(r6, r1, r2)
            X.C203259ng.A03(r9)
            goto L_0x0ce0
        L_0x0d84:
            r2 = move-exception
            X.9ps r4 = r7.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while set enableSR "
            goto L_0x0d93
        L_0x0d8c:
            r2 = move-exception
            X.9ps r4 = r9.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while apply shouldresetposition"
        L_0x0d93:
            A05(r4, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204359ps.handleMessage(android.os.Message):boolean");
    }

    public static C204369pt A01(C203259ng r1, C204359ps r2) {
        C202289lT A002 = C203259ng.A00(r1);
        return A002.A0V.A01(r2.A0N);
    }

    public static void A02(C204359ps r6, AnonymousClass906 r7, AnonymousClass902 r8, String str, String str2, Throwable th) {
        C118655oW r1;
        A05(r6, str, th, C90524aI.A0w());
        if (r6.A05.logStallOnPauseOnError) {
            r1 = r6.A0A();
        } else {
            r1 = null;
        }
        C20990A2e a2e = r6.A0E;
        C207179ug A0I2 = C165597tg.A0I(r6);
        a2e.Bcn(r1, new C200889iQ(r7, r8, str, ""), C165607th.A0K(r6), A0I2, str2, "");
    }

    public long A09() {
        long j = C165597tg.A0I(this).A0X;
        if (j < 0) {
            return -1;
        }
        return j;
    }

    public void A0D() {
        A06(this, "release", C90524aI.A0w());
        Handler handler = this.A0C;
        handler.sendMessage(handler.obtainMessage(8));
    }

    public void A0F() {
        A06(this, "stop", C90524aI.A0w());
        Handler handler = this.A0C;
        handler.sendMessage(handler.obtainMessage(37));
    }

    public void A0I(Surface surface) {
        Object[] A0L2 = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L2, AnonymousClass000.A0H(surface), 0);
        A06(this, "setSurface %x", A0L2);
        AnonymousClass000.A14(this.A0C, surface, 6);
        A0V.add(surface);
    }

    public void A0L(boolean z) {
        Object[] A0L2 = AnonymousClass001.A0L();
        Boolean valueOf = Boolean.valueOf(z);
        A0L2[0] = valueOf;
        A06(this, "setLooping: %s", A0L2);
        AnonymousClass000.A14(this.A0C, valueOf, 19);
    }

    public C204359ps(Looper looper, C161067m6 r8, C202289lT r9, AUR aur) {
        Handler handler = new Handler(looper);
        this.A0D = new C203259ng(this);
        this.A0F = C36441kJ.A11();
        this.A0K = new long[]{0, 0};
        this.A08 = new AtomicReference(new C207179ug());
        this.A0J = new AtomicReference(C207019uQ.A0D);
        this.A0H = C90524aI.A0l();
        this.A0I = new TreeMap();
        this.A06 = "";
        this.A01 = -1;
        this.A09 = false;
        this.A0N = 0;
        this.A0L = 1.0f;
        this.A00 = -1;
        this.A07 = AnonymousClass001.A0I();
        this.A0G = C36441kJ.A11();
        this.A0A = false;
        A06(this, "Create HeroPlayer", new Object[0]);
        this.A0C = new Handler(looper, this);
        this.A0E = new C20990A2e(handler, r8);
        this.A03 = new C192389Gu(new AnonymousClass9D0(r9));
        this.A05 = aur;
        this.A09 |= aur.enableDebugLogs;
        this.A04 = new C20993A2h(this);
        this.A02 = new AnonymousClass9RJ(aur.enablePlayerActionStateLoggingInFlytrap);
        this.A0D.A06 = r9;
    }
}
