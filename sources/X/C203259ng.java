package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9ng  reason: invalid class name and case insensitive filesystem */
public class C203259ng {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Surface A04;
    public C195979Xa A05;
    public C202289lT A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public volatile Surface A0A;
    public final /* synthetic */ C204359ps A0B;

    public static void A05(C203259ng r5) {
        r5.A01 = 0;
        r5.A00 = 0;
        r5.A05 = null;
        C204359ps r3 = r5.A0B;
        AtomicInteger atomicInteger = C204359ps.A0T;
        r3.A0L = 1.0f;
        r5.A02 = 0;
        r5.A03 = 0;
        r3.A0P = 0;
        r3.A0R = false;
        r3.A0A = false;
        r3.A08.set(new C207179ug());
        r3.A0J.set(C207019uQ.A0D);
        List list = r3.A0H;
        synchronized (list) {
            list.clear();
            r3.A00 = -1;
        }
        r5.A09 = false;
    }

    public static void A06(C203259ng r1, C204359ps r2, String str) {
        C204359ps.A06(r2, str, new Object[0]);
        A03(r1);
    }

    public C203259ng(C204359ps r1) {
        this.A0B = r1;
    }

    public static C202289lT A00(C203259ng r1) {
        C202289lT r0 = r1.A06;
        if (r0 != null) {
            return r0;
        }
        throw new RemoteException("No service api available");
    }

    public static void A02(C203259ng r30) {
        String str;
        C204369pt A012;
        C203259ng r6 = r30;
        C204359ps r5 = r6.A0B;
        AtomicInteger atomicInteger = C204359ps.A0T;
        C192389Gu r1 = r5.A03;
        C202289lT r7 = r1.A00;
        if (r7 == null) {
            r7 = r1.A01.A00;
            r1.A00 = r7;
        }
        r6.A06 = r7;
        if (r6.A05 != null) {
            try {
                long j = r5.A0N;
                C195979Xa r10 = r6.A05;
                C23081B3o b3o = r5.A04;
                boolean z = r6.A09;
                AnonymousClass9UR r8 = r7.A0V;
                Context context = r7.A07;
                Handler A002 = C202289lT.A00(r7);
                AtomicReference atomicReference = r7.A0K;
                C201619jy r17 = r7.A03;
                Map map = r7.A0G;
                AtomicBoolean atomicBoolean = r7.A0I;
                synchronized (r8) {
                    if (r10 == null) {
                        str = null;
                    } else {
                        str = r10.A0F.A0H;
                    }
                    Object[] A0M = AnonymousClass001.A0M();
                    AnonymousClass000.A1M(A0M, 0, j);
                    A0M[1] = str;
                    C200599hh.A02("id [%d]: verifyOrCreatePlayer, videoId: %s", A0M);
                    C204369pt A013 = r8.A01(j);
                    if (j > 0) {
                        if (A013 == null || (A012 = r8.A01(j)) == null || A012.A12 == null) {
                            r8.A02(j, true);
                        } else {
                            C204369pt.A0F(A013, "leaveWarmUpIfNeed", new Object[0]);
                            if (A013.A0t.get()) {
                                C204369pt.A08(A013.A0l, A013, b3o, 19);
                            }
                            if (r8.A03.enableBackgroundServicePlayerReuse && z) {
                                C20992A2g a2g = A013.A0o;
                                a2g.BgN(a2g.A00.A0k);
                                a2g.A01 = b3o;
                            }
                        }
                    }
                    AUR aur = r8.A03;
                    long addAndGet = r8.A04.addAndGet(1);
                    Long valueOf = Long.valueOf(addAndGet);
                    C200599hh.A02("id [%d]: Create player", valueOf);
                    LruCache lruCache = r8.A00;
                    Iterator A0y = AnonymousClass000.A0y(lruCache.snapshot());
                    while (A0y.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A0y);
                        if (((C204369pt) A11.getValue()).A15) {
                            lruCache.get(A11.getKey());
                        }
                    }
                    C200599hh.A02("id [%d]: refreshed LRUCached for playing players", valueOf);
                    HandlerThread handlerThread = null;
                    if (!aur.useMainThreadForHeroPlayer) {
                        C200599hh.A02("id [%d]: creating handlerThread", valueOf);
                        if (aur.useHandlerThreadPool) {
                            AnonymousClass9AJ.A00 = aur.handlerThreadPoolSize;
                            ConcurrentLinkedQueue concurrentLinkedQueue = AnonymousClass9AJ.A01;
                            if (concurrentLinkedQueue.size() < AnonymousClass9AJ.A00) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                C36341k9.A1N("HeroHandlerThreadPool-", A0u, concurrentLinkedQueue);
                                handlerThread = new HandlerThread(A0u.toString());
                                handlerThread.start();
                                handlerThread.getLooper();
                            } else {
                                handlerThread = (HandlerThread) concurrentLinkedQueue.remove();
                            }
                            concurrentLinkedQueue.add(handlerThread);
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            A0u2.append("using handler thread ");
                            A0u2.append(handlerThread.getName());
                            A0u2.append(", ti ");
                            A0u2.append(handlerThread.getId());
                            C131916Rh.A01("HeroHandlerThreadPool", AnonymousClass000.A0l(concurrentLinkedQueue, ", pool ", A0u2), new Object[0]);
                        } else {
                            handlerThread = new HandlerThread("HeroServicePlayer");
                            handlerThread.start();
                        }
                        C200599hh.A02("id [%d]: created handlerThread", valueOf);
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    C204369pt r172 = new C204369pt(context, A002, handlerThread, r17, r10, b3o, r8.A02, r8, map, atomicBoolean, atomicReference2, addAndGet);
                    C200599hh.A02("id [%d]: created HeroServicePlayer", valueOf);
                    j = r172.A0k;
                    Long valueOf2 = Long.valueOf(j);
                    lruCache.put(valueOf2, r172);
                    if (aur.enableBackgroundServicePlayerReuse) {
                        r8.A01.put(valueOf2, 1);
                    }
                }
                if (j != r5.A0N) {
                    r6.A04 = null;
                }
                r5.A0N = j;
                long[] jArr = r5.A0K;
                jArr[1] = jArr[0];
                jArr[0] = r5.A0N;
                r6.A09 = false;
            } catch (IllegalStateException | NullPointerException e) {
                String str2 = "Error occurs while creating player";
                try {
                    if (r5.A05.enableLogExceptionMessageOnError) {
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        C165567td.A1M(e, "Error occurs while creating player with exception ", A0u3);
                        str2 = A0u3.toString();
                    }
                    C204359ps r72 = r5;
                    C204359ps.A02(r72, AnonymousClass906.A06, AnonymousClass902.A0C, str2, r6.A05.A08, e);
                    r5.A0N = 0;
                    throw new RemoteException(C36331k8.A0i("Failed ensure service player, ", AnonymousClass000.A0u(), e));
                } catch (Throwable th) {
                    r6.A09 = false;
                    throw th;
                }
            }
        }
    }

    public static void A03(C203259ng r6) {
        C204359ps r5 = r6.A0B;
        AtomicInteger atomicInteger = C204359ps.A0T;
        r5.A0P = 0;
        long[] jArr = r5.A0K;
        jArr[1] = 0;
        jArr[0] = 0;
        if (AnonymousClass000.A1P((r5.A0N > 0 ? 1 : (r5.A0N == 0 ? 0 : -1)))) {
            r5.A0N = 0;
            r6.A04 = null;
        }
    }

    public static void A04(C203259ng r8) {
        C204359ps r4 = r8.A0B;
        AtomicInteger atomicInteger = C204359ps.A0T;
        synchronized (r4.A0G) {
        }
        try {
            if (!AnonymousClass000.A1P((r4.A0N > 0 ? 1 : (r4.A0N == 0 ? 0 : -1)))) {
                C165597tg.A19(r4, "Before reset(), service player was evicted. Lazy recover at next play()");
            } else {
                C202289lT A002 = A00(r8);
                long j = r4.A0N;
                Object[] A0L = AnonymousClass001.A0L();
                AnonymousClass000.A1M(A0L, 0, j);
                C204369pt A003 = AnonymousClass9UR.A00(A002, "id [%d]: reset", A0L, j);
                if (A003 == null) {
                    A06(r8, r4, "When reset(), service player is noticed to be evicted earlier. Lazy recover at next play()");
                } else {
                    C204369pt.A0F(A003, "Reset", new Object[0]);
                    C204369pt.A09(A003.A0l.obtainMessage(11), A003);
                }
            }
        } catch (RemoteException e) {
            C204359ps.A05(r4, "Error occurs while pausing the video", e, new Object[0]);
        } catch (Throwable th) {
            A05(r8);
            throw th;
        }
        A05(r8);
    }

    public static void A07(C203259ng r6, C207179ug r7) {
        boolean z;
        C204359ps r62 = r6.A0B;
        AtomicInteger atomicInteger = C204359ps.A0T;
        AtomicReference atomicReference = r62.A08;
        synchronized (atomicReference) {
            if (((C207179ug) atomicReference.get()).A0H <= r7.A0H) {
                atomicReference.set(r7);
                if (r7.A0D < r62.A0P) {
                    z = true;
                } else if (r7.A0R) {
                    z = false;
                }
                r62.A0S = z;
            }
        }
    }

    public static void A01(C203259ng r13) {
        boolean z;
        A02(r13);
        if (!(r13.A0A == null || r13.A0A == r13.A04)) {
            C202289lT r3 = r13.A06;
            C204359ps r1 = r13.A0B;
            AtomicInteger atomicInteger = C204359ps.A0T;
            if (r3.A08(r13.A0A, r1.A0N)) {
                r13.A04 = r13.A0A;
            }
        }
        C195979Xa r5 = r13.A05;
        if (r5 != null) {
            if (r13.A02 > 0) {
                if (r5.A00()) {
                    C202289lT r6 = r13.A06;
                    C204359ps r32 = r13.A0B;
                    AtomicInteger atomicInteger2 = C204359ps.A0T;
                    r6.A05(r32.A0N, r13.A03);
                } else {
                    long incrementAndGet = C204359ps.A0U.incrementAndGet();
                    C202289lT r52 = r13.A06;
                    C204359ps r4 = r13.A0B;
                    if (r52.A06(r4.A0N, r13.A02, incrementAndGet, false)) {
                        r4.A0O = r13.A02;
                        r4.A0P = incrementAndGet;
                        r4.A0Q = SystemClock.elapsedRealtime();
                    } else {
                        r4.A0P = 0;
                    }
                }
                r13.A02 = 0;
                r13.A03 = 0;
            } else {
                if (r13.A01 > 0) {
                    long incrementAndGet2 = C204359ps.A0U.incrementAndGet();
                    C202289lT r42 = r13.A06;
                    C204359ps r2 = r13.A0B;
                    if (r42.A06(r2.A0N, (long) r13.A01, incrementAndGet2, false)) {
                        r2.A0O = (long) r13.A01;
                        r2.A0P = incrementAndGet2;
                        r2.A0Q = SystemClock.elapsedRealtime();
                    } else {
                        r2.A0P = 0;
                    }
                }
                if (r13.A00 > 0) {
                    C202289lT r43 = r13.A06;
                    C204359ps r12 = r13.A0B;
                    AtomicInteger atomicInteger3 = C204359ps.A0T;
                    r43.A05(r12.A0N, (long) r13.A00);
                }
            }
            C202289lT r33 = r13.A06;
            C204359ps r22 = r13.A0B;
            AtomicInteger atomicInteger4 = C204359ps.A0T;
            long j = r22.A0N;
            C195979Xa r11 = r13.A05;
            boolean z2 = r13.A08;
            float f = r22.A0M;
            boolean z3 = r22.A0R;
            Object[] A1Q = C36441kJ.A1Q();
            A1Q[0] = Long.valueOf(j);
            A1Q[1] = Boolean.valueOf(z2);
            C207239um r62 = r11.A0F;
            A1Q[2] = r62;
            C204369pt A002 = AnonymousClass9UR.A00(r33, "id [%d]: prepareAndMayPlay, shouldPlay=%b, videoSource=%s", A1Q, j);
            if (A002 != null) {
                if (z2) {
                    z = r33.A0J.compareAndSet(true, false);
                } else {
                    z = false;
                }
                C204369pt.A0F(A002, "Set volume", new Object[0]);
                Handler handler = A002.A0l;
                C204369pt.A08(handler, A002, Float.valueOf(f), 5);
                C204369pt.A0F(A002, "Prepare: %s", r62);
                A002.A0q.set(true);
                C204369pt.A08(handler, A002, new Object[]{r11}, 1);
                C204369pt.A0F(A002, "Set Looping", new Object[0]);
                C204369pt.A08(handler, A002, Boolean.valueOf(z3), 18);
                if (z2) {
                    A002.A0N(-1, z);
                } else {
                    C204369pt.A0F(A002, "Pause: finishPlayback=%b", false);
                    Object[] A1b = C36411kG.A1b(false);
                    A1b[1] = null;
                    C204369pt.A08(handler, A002, A1b, 3);
                }
                String str = r62.A0H;
                if (str != null) {
                    AUR aur = r33.A0B;
                    if (aur.enableCancelPrefetchInQueuePrepare) {
                        r33.A04(str, false);
                    }
                    if (aur.enableBoostOngoingPrefetchPriorityPrepare) {
                        C202289lT.A02(r33, str);
                    }
                    if ((aur.enableMemoryAwareBufferSizeUsingRed || aur.enableMemoryAwareBufferSizeUsingYellow) && r33.A0U != null) {
                        r33.A0U.A00 = r33.A0M;
                        r33.A0U.A01 = r33.A0O;
                    }
                }
            }
        }
        r13.A07 = false;
    }
}
