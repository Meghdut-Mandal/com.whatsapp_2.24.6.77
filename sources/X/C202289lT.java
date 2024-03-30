package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.LruCache;
import android.view.Surface;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9lT  reason: invalid class name and case insensitive filesystem */
public class C202289lT {
    public static C202289lT A0X;
    public Handler A00;
    public HandlerThread A01;
    public AnonymousClass94B A02;
    public C201619jy A03;
    public C114915i2 A04;
    public C109595Ye A05;
    public C203319nm A06;
    public final Context A07;
    public final AnonymousClass94C A08;
    public final C197179bG A09;
    public final ServiceEventCallbackImpl A0A;
    public final AUR A0B;
    public final C1896394p A0C;
    public final C124615yV A0D;
    public final C198079cs A0E;
    public final Object A0F = C36441kJ.A11();
    public final Map A0G;
    public final AtomicBoolean A0H;
    public final AtomicBoolean A0I;
    public final AtomicBoolean A0J;
    public final AtomicReference A0K;
    public final AtomicReference A0L;
    public final AtomicReference A0M;
    public final AtomicReference A0N;
    public final AtomicReference A0O;
    public final AtomicReference A0P;
    public final AtomicReference A0Q;
    public final AtomicBoolean A0R;
    public final AtomicBoolean A0S;
    public final AtomicReference A0T;
    public volatile AnonymousClass9OD A0U;
    public volatile AnonymousClass9UR A0V;
    public volatile B44 A0W;

    public C202289lT(Context context, AUR aur, B44 b44, HashMap hashMap) {
        C197349bZ r0;
        String str;
        AtomicReference atomicReference = new AtomicReference((Object) null);
        this.A0K = atomicReference;
        this.A0N = new AtomicReference((Object) null);
        this.A0P = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        this.A0Q = atomicReference2;
        ServiceEventCallbackImpl serviceEventCallbackImpl = new ServiceEventCallbackImpl(atomicReference);
        this.A0A = serviceEventCallbackImpl;
        this.A09 = new C197179bG(serviceEventCallbackImpl);
        this.A08 = new AnonymousClass94C();
        this.A0C = new C1896394p();
        this.A0H = new AtomicBoolean(false);
        this.A0I = new AtomicBoolean(false);
        this.A0J = new AtomicBoolean(true);
        this.A0R = new AtomicBoolean(false);
        this.A0S = new AtomicBoolean(false);
        this.A0L = new AtomicReference(new AnonymousClass9D1());
        AnonymousClass909 r1 = AnonymousClass909.GREEN;
        this.A0O = new AtomicReference(r1);
        this.A0M = new AtomicReference(r1);
        this.A0T = new AtomicReference(r1);
        this.A0W = B44.A00;
        C196289Yq.A01("initHeroManager");
        try {
            atomicReference2.set((Object) null);
            this.A0G = hashMap;
            AUR aur2 = aur;
            this.A0B = aur2;
            this.A07 = context;
            if (aur2.enableCreateByteBufferFromABufferNullCheckHooks || aur2.enableFillBufferHooks || aur2.enableFreeNodeHooks || aur2.enableOnMessageReceivedHooks || aur2.enableSendCommandHooks || aur2.enableOnOMXEmptyBufferDoneHooks || aur2.enableFillFreeBufferCheckNodeHooks) {
                synchronized (AnonymousClass94E.class) {
                }
            }
            if (!aur2.reportExceptionsAsSoftErrors || (str = aur2.serviceInjectorClassName) == null) {
                C131916Rh.A00 = aur2.enableDebugLogs;
                C131916Rh.A01 = aur2.skipDebugLogs;
                AtomicReference atomicReference3 = this.A0N;
                C1896394p r7 = this.A0C;
                atomicReference3.set(new C202509m3(aur2, r7));
                if (aur2.enableGlobalStallMonitor) {
                    synchronized (C197099b8.A02) {
                        try {
                            C197099b8.A00 = true;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
                if (aur2.enableGlobalNetworkMonitor) {
                    synchronized (C197349bZ.class) {
                        r0 = C197349bZ.A01;
                    }
                    synchronized (r0) {
                    }
                }
                if (aur2.enableVodDrmPrefetch) {
                    C200779iD A002 = C200779iD.A00();
                    int i = aur2.drmSessionStoreCapacity;
                    synchronized (A002) {
                        A002.A00 = new LruCache(i);
                    }
                }
                AnonymousClass9D2 r14 = null;
                this.A02 = new AnonymousClass94B();
                synchronized (C201209j4.class) {
                    try {
                        C201209j4.A07 = new C201209j4(B40.A00);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                AtomicReference atomicReference4 = this.A0P;
                AnonymousClass9D4 r11 = new AnonymousClass9D4(atomicReference4);
                AnonymousClass94B r10 = this.A02;
                AnonymousClass94C r12 = this.A08;
                AtomicReference atomicReference5 = this.A0L;
                this.A0U = new AnonymousClass9OD(r10, r12, r11, aur2, r7, atomicReference3, atomicReference5, new AtomicReference((Object) null));
                Context context2 = this.A07;
                this.A05 = new C109595Ye();
                AnonymousClass9OD r13 = this.A0U;
                Objects.requireNonNull(r13);
                this.A0V = new AnonymousClass9UR(r13, aur2);
                if (this.A03 == null) {
                    Map map = this.A0G;
                    C201619jy r15 = new C201619jy(context2, A00(this), new AnonymousClass60H(this), (C202509m3) atomicReference3.get(), aur2, map);
                    this.A03 = r15;
                    AnonymousClass9D4 r152 = new AnonymousClass9D4(atomicReference4);
                    C202509m3 r16 = (C202509m3) atomicReference3.get();
                    this.A06 = new C203319nm(context2, r12, r15, (aur2.enablePrefetchCancelCallback || aur2.isVideoQplPipelineEnabled) ? new AnonymousClass9D2(this) : r14, r152, r16, aur2, r7, map, atomicReference5);
                    if (aur2.enableWarmCodec) {
                        HandlerThread handlerThread = new HandlerThread("HeroWarmupThread");
                        handlerThread.start();
                        Looper looper = handlerThread.getLooper();
                        C165587tf.A0z(new Handler(looper), this, looper, 11);
                    }
                    if (aur2.isEarlyPreallocateCodec && aur2.earlyPreallocateCodecOnAppNotScrolling && !aur2.enableAlwaysCallPreallocateCodec) {
                        this.A0H.compareAndSet(false, true);
                    }
                }
                this.A0W = b44;
                C198079cs r2 = new C198079cs(new AnonymousClass9D3(this), aur2, this.A0W);
                this.A0E = r2;
                if (aur2.enableWarmupScheduler) {
                    C124615yV r5 = new C124615yV(A00(this), C36341k9.A0H(), aur2, r2);
                    this.A0D = r5;
                    r5.A06.set(this);
                    if (!r5.A03.enableStopWarmupSchedulerEmpty && !r5.A08) {
                        r5.A02.post(new C1497572q(r5, 23));
                        r5.A08 = true;
                    }
                } else {
                    this.A0D = null;
                }
                if (aur2.usePrefetchFilter) {
                    this.A04 = new C114915i2();
                }
                C196289Yq.A00();
                return;
            }
            try {
                Class.forName(str).newInstance();
                throw AnonymousClass001.A0A("init");
            } catch (Exception e) {
                throw AnonymousClass001.A0B(e);
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            C196289Yq.A00();
            throw th4;
        }
    }

    public boolean A07(ResultReceiver resultReceiver, long j) {
        C204369pt A002 = AnonymousClass9UR.A00(this, "id [%d]: releaseSurface", new Object[]{Long.valueOf(j)}, j);
        if (A002 == null) {
            return false;
        }
        C204369pt.A0F(A002, "Release surface", new Object[0]);
        C204369pt.A08(A002.A0l, A002, resultReceiver, 7);
        return true;
    }

    public static Handler A00(C202289lT r4) {
        if (r4.A0B.useMainThreadForHeroPlayer) {
            return C36341k9.A0H();
        }
        if (r4.A00 == null) {
            synchronized (r4.A0F) {
                if (r4.A00 == null) {
                    if (r4.A01 == null) {
                        HandlerThread handlerThread = new HandlerThread("HeroManagerBackgroundHandlerThread", 10);
                        r4.A01 = handlerThread;
                        handlerThread.start();
                    }
                    r4.A00 = C90514aH.A0M(r4.A01);
                }
            }
        }
        return r4.A00;
    }

    public static C202289lT A01(Context context, AUR aur, B44 b44, HashMap hashMap) {
        C202289lT r0 = A0X;
        if (r0 != null) {
            return r0;
        }
        synchronized (C202289lT.class) {
            C202289lT r02 = A0X;
            if (r02 != null) {
                return r02;
            }
            A0X = new C202289lT(context, aur, b44, hashMap);
            C200599hh.A00 = false;
            return A0X;
        }
    }

    public void A03() {
        AnonymousClass9UR r0 = this.A0V;
        if (r0 != null) {
            r0.A00.evictAll();
        }
        if (this.A0B.shouldCleanupHeroManagerThread) {
            synchronized (this.A0F) {
                HandlerThread handlerThread = this.A01;
                if (handlerThread != null) {
                    this.A00 = null;
                    handlerThread.quit();
                    this.A01 = null;
                }
            }
        }
    }

    public void A04(String str, boolean z) {
        B5U b5u;
        String str2 = str;
        Object[] A1a = C90474aD.A1a(str2);
        C36421kH.A1R(A1a, z);
        C200599hh.A02("cancelPrefetchForVideo %s, %b", A1a);
        C114915i2 r1 = this.A04;
        if (r1 != null) {
            synchronized (r1) {
                r1.A00.remove(str2);
            }
        }
        C203319nm r6 = this.A06;
        C195279Tl r3 = new C195279Tl(r6, str2);
        AnonymousClass6LE r4 = r6.A03;
        boolean z2 = false;
        LinkedList A0l = C90524aI.A0l();
        LinkedList linkedList = r4.A04;
        synchronized (linkedList) {
            ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                AnonymousClass69O r0 = (AnonymousClass69O) listIterator.next();
                Objects.requireNonNull(r0);
                AnonymousClass9YW r12 = r0.A00;
                if (r3.equals(r12)) {
                    if (r12 instanceof AnonymousClass89G) {
                        AnonymousClass89G.A00((AnonymousClass89G) r12);
                    }
                    A0l.add(r12);
                    listIterator.remove();
                }
            }
        }
        int size = A0l.size();
        AnonymousClass9D2 r02 = r6.A05;
        if (r02 != null) {
            if (size > 0) {
                z2 = true;
            }
            r02.A00.A0A.B2I(new AnonymousClass898(str2, z2));
        }
        if (z) {
            synchronized (linkedList) {
                Iterator it = r4.A03.iterator();
                while (it.hasNext()) {
                    AnonymousClass9YW r5 = ((AnonymousClass69O) it.next()).A00;
                    if (r3.equals(r5) && (r5 instanceof AnonymousClass89G)) {
                        AnonymousClass89G r52 = (AnonymousClass89G) r5;
                        C201619jy r7 = r52.A01;
                        C207169uf r13 = r52.A01;
                        String str3 = r13.A0F;
                        C207239um r03 = r13.A0D;
                        String str4 = r03.A0H;
                        Uri uri = r03.A05;
                        AUR aur = r7.A0C;
                        String A002 = C131916Rh.A00(uri, str3, str4, aur.abrSetting.hashUrlForUnique, aur.useShortKey, r13.A0S, aur.splitLastSegmentCachekey, aur.skipThumbnailCacheKey);
                        Map map = r7.A0D;
                        synchronized (map) {
                            b5u = (B5U) map.get(A002);
                        }
                        if (b5u != null) {
                            b5u.cancel();
                        }
                        AnonymousClass89G.A00(r52);
                    }
                }
            }
        }
        if (r6.A07.enableCancelFollowupPrefetch) {
            synchronized (linkedList) {
                Iterator it2 = r4.A03.iterator();
                while (it2.hasNext()) {
                    r3.equals(((AnonymousClass69O) it2.next()).A00);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r1 = (X.AnonymousClass89G) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C202289lT r13, java.lang.String r14) {
        /*
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r14)
            java.lang.String r0 = "boostOngoingPrefetchPriorityForVideo %s"
            X.C200599hh.A02(r0, r1)
            X.9nm r1 = r13.A06
            X.6LE r0 = r1.A03
            X.9Tl r3 = new X.9Tl
            r3.<init>(r1, r14)
            java.util.LinkedList r2 = r0.A04
            monitor-enter(r2)
            java.util.HashSet r0 = r0.A03     // Catch:{ all -> 0x0068 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0068 }
        L_0x001b:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0068 }
            X.69O r0 = (X.AnonymousClass69O) r0     // Catch:{ all -> 0x0068 }
            X.9YW r1 = r0.A00     // Catch:{ all -> 0x0068 }
            boolean r0 = r3.equals(r1)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1 instanceof X.AnonymousClass89G     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x001b
            X.89G r1 = (X.AnonymousClass89G) r1     // Catch:{ all -> 0x0068 }
            X.9uf r5 = r1.A01     // Catch:{ all -> 0x0068 }
            if (r5 == 0) goto L_0x001b
            X.9jy r4 = r1.A01     // Catch:{ all -> 0x0068 }
            X.9um r0 = r5.A0D     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x001b
            java.lang.String r9 = r0.A0H     // Catch:{ all -> 0x0068 }
            if (r9 == 0) goto L_0x001b
            android.net.Uri r7 = r0.A05     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x001b
            java.lang.String r8 = r5.A0F     // Catch:{ all -> 0x0068 }
            X.AUR r1 = r4.A0C     // Catch:{ all -> 0x0068 }
            X.AUF r0 = r1.abrSetting     // Catch:{ all -> 0x0068 }
            boolean r10 = r0.hashUrlForUnique     // Catch:{ all -> 0x0068 }
            boolean r11 = r1.useShortKey     // Catch:{ all -> 0x0068 }
            boolean r12 = r5.A0S     // Catch:{ all -> 0x0068 }
            boolean r13 = r1.splitLastSegmentCachekey     // Catch:{ all -> 0x0068 }
            boolean r14 = r1.skipThumbnailCacheKey     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = X.C131916Rh.A00(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0068 }
            java.util.Map r1 = r4.A0D     // Catch:{ all -> 0x0068 }
            monitor-enter(r1)     // Catch:{ all -> 0x0068 }
            r1.get(r0)     // Catch:{ all -> 0x0063 }
            monitor-exit(r1)     // Catch:{ all -> 0x0063 }
            goto L_0x001b
        L_0x0063:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0063 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0066:
            monitor-exit(r2)     // Catch:{ all -> 0x0068 }
            return
        L_0x0068:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0068 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202289lT.A02(X.9lT, java.lang.String):void");
    }

    public boolean A05(long j, long j2) {
        Object[] A0M2 = AnonymousClass001.A0M();
        A0M2[0] = Long.valueOf(j);
        Long valueOf = Long.valueOf(j2);
        A0M2[1] = valueOf;
        C204369pt A002 = AnonymousClass9UR.A00(this, "id [%d]: setRelativePosition %d", A0M2, j);
        if (A002 == null) {
            return false;
        }
        C204369pt.A0F(A002, "Set relative position to %d", valueOf);
        C204369pt.A08(A002.A0l, A002, valueOf, 16);
        return true;
    }

    public boolean A06(long j, long j2, long j3, boolean z) {
        long j4;
        Object[] A0M2 = AnonymousClass001.A0M();
        A0M2[0] = Long.valueOf(j);
        Long valueOf = Long.valueOf(j2);
        A0M2[1] = valueOf;
        C204369pt A002 = AnonymousClass9UR.A00(this, "id [%d]: seekTo %d", A0M2, j);
        if (A002 == null) {
            return false;
        }
        C204369pt.A0F(A002, "Seek to %d", valueOf);
        Handler handler = A002.A0l;
        long[] jArr = new long[3];
        jArr[0] = j2;
        jArr[1] = j3;
        if (z) {
            j4 = 1;
        } else {
            j4 = 0;
        }
        jArr[2] = j4;
        C204369pt.A08(handler, A002, jArr, 4);
        return true;
    }

    public boolean A08(Surface surface, long j) {
        Object[] A0M2 = AnonymousClass001.A0M();
        A0M2[0] = Long.valueOf(j);
        A0M2[1] = surface;
        C204369pt A002 = AnonymousClass9UR.A00(this, "id [%d]: setSurface: %s", A0M2, j);
        if (A002 == null) {
            return false;
        }
        C204369pt.A0F(A002, "Set surface", new Object[0]);
        C204369pt.A08(A002.A0l, A002, surface, 6);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        r1 = (X.AnonymousClass89G) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(java.lang.String r17, long r18, boolean r20) {
        /*
            r16 = this;
            java.lang.Object[] r5 = X.AnonymousClass001.A0M()
            r1 = r18
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r7 = 0
            r5[r7] = r0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r20)
            r3 = 1
            r5[r3] = r6
            java.lang.String r0 = "id [%d]: pause, finishPlayback: %b"
            r4 = r16
            X.9pt r5 = X.AnonymousClass9UR.A00(r4, r0, r5, r1)
            if (r5 != 0) goto L_0x001f
            return r7
        L_0x001f:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r7] = r6
            java.lang.String r0 = "Pause: finishPlayback=%b"
            X.C204369pt.A0F(r5, r0, r1)
            android.os.Handler r2 = r5.A0l
            java.lang.Object[] r1 = X.C36411kG.A1b(r6)
            r1[r3] = r17
            r0 = 3
            X.C204369pt.A08(r2, r5, r1, r0)
            X.AUR r1 = r4.A0B
            boolean r0 = r1.enableDemoteOngoingPrefetchPriorityPause
            if (r0 != 0) goto L_0x003e
            boolean r0 = r1.enableCancelOngoingPrefetchPause
            if (r0 == 0) goto L_0x00be
        L_0x003e:
            X.9Xa r0 = r5.A10
            if (r0 == 0) goto L_0x00be
            X.9um r0 = r0.A0F
            java.lang.String r2 = r0.A0H
            if (r2 == 0) goto L_0x00be
            boolean r0 = r1.enableDemoteOngoingPrefetchPriorityPause
            if (r0 == 0) goto L_0x00b7
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r7] = r2
            java.lang.String r0 = "demoteOngoingPrefetchPriorityForVideo %s"
            X.C200599hh.A02(r0, r1)
            X.9nm r1 = r4.A06
            X.6LE r0 = r1.A03
            X.9Tl r4 = new X.9Tl
            r4.<init>(r1, r2)
            java.util.LinkedList r2 = r0.A04
            monitor-enter(r2)
            java.util.HashSet r0 = r0.A03     // Catch:{ all -> 0x00b4 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00b4 }
        L_0x0067:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00b4 }
            X.69O r0 = (X.AnonymousClass69O) r0     // Catch:{ all -> 0x00b4 }
            X.9YW r1 = r0.A00     // Catch:{ all -> 0x00b4 }
            boolean r0 = r4.equals(r1)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0067
            boolean r0 = r1 instanceof X.AnonymousClass89G     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0067
            X.89G r1 = (X.AnonymousClass89G) r1     // Catch:{ all -> 0x00b4 }
            X.9uf r6 = r1.A01     // Catch:{ all -> 0x00b4 }
            if (r6 == 0) goto L_0x0067
            X.9jy r5 = r1.A01     // Catch:{ all -> 0x00b4 }
            X.9um r0 = r6.A0D     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0067
            java.lang.String r10 = r0.A0H     // Catch:{ all -> 0x00b4 }
            if (r10 == 0) goto L_0x0067
            android.net.Uri r8 = r0.A05     // Catch:{ all -> 0x00b4 }
            if (r8 == 0) goto L_0x0067
            java.lang.String r9 = r6.A0F     // Catch:{ all -> 0x00b4 }
            X.AUR r1 = r5.A0C     // Catch:{ all -> 0x00b4 }
            X.AUF r0 = r1.abrSetting     // Catch:{ all -> 0x00b4 }
            boolean r11 = r0.hashUrlForUnique     // Catch:{ all -> 0x00b4 }
            boolean r12 = r1.useShortKey     // Catch:{ all -> 0x00b4 }
            boolean r13 = r6.A0S     // Catch:{ all -> 0x00b4 }
            boolean r14 = r1.splitLastSegmentCachekey     // Catch:{ all -> 0x00b4 }
            boolean r15 = r1.skipThumbnailCacheKey     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = X.C131916Rh.A00(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00b4 }
            java.util.Map r1 = r5.A0D     // Catch:{ all -> 0x00b4 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b4 }
            r1.get(r0)     // Catch:{ all -> 0x00af }
            monitor-exit(r1)     // Catch:{ all -> 0x00af }
            goto L_0x0067
        L_0x00af:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            return r3
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            throw r0
        L_0x00b7:
            boolean r0 = r1.enableCancelOngoingPrefetchPause
            if (r0 == 0) goto L_0x00be
            r4.A04(r2, r3)
        L_0x00be:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202289lT.A09(java.lang.String, long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r0.enableMediaCodecReuseOptimizeLock == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finalize() {
        /*
            r7 = this;
            java.lang.Object[] r1 = X.C90524aI.A0w()
            java.lang.String r0 = "HeroService destroy"
            X.C200599hh.A02(r0, r1)
            X.9UR r2 = r7.A0V
            X.9cs r3 = r7.A0E
            X.5yV r4 = r7.A0D
            X.AUR r0 = r7.A0B
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.enableMediaCodecReuseOptimizeLock
            r6 = 1
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            r6 = 0
        L_0x0019:
            android.os.Handler r0 = A00(r7)
            r5 = 2
            X.755 r1 = new X.755
            r1.<init>(r2, r3, r4, r5, r6)
            r0.post(r1)
            super.finalize()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202289lT.finalize():void");
    }
}
