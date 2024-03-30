package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Za  reason: invalid class name and case insensitive filesystem */
public class C07720Za implements Handler.Callback {
    public static C07720Za A0F;
    public static final Status A0G = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status A0H = new Status(4, "The user must be signed in to make this API call.");
    public static final Object A0I = new Object();
    public long A00 = 10000;
    public AnonymousClass0JX A01 = null;
    public C16860qD A02;
    public boolean A03 = false;
    public AnonymousClass0K4 A04;
    public final Context A05;
    public final Handler A06;
    public final C02610Bd A07;
    public final C07140Wm A08;
    public final Map A09 = new ConcurrentHashMap(5, 0.75f, 1);
    public final Set A0A = new C000000a(0);
    public final AtomicInteger A0B = new AtomicInteger(1);
    public final AtomicInteger A0C = new AtomicInteger(0);
    public final Set A0D = new C000000a(0);
    public volatile boolean A0E = true;

    public static final void A05(C07590Yl r9, C07720Za r10, TaskCompletionSource taskCompletionSource, int i) {
        long currentTimeMillis;
        long elapsedRealtime;
        int i2 = i;
        if (i != 0) {
            AnonymousClass0US r4 = r9.A06;
            C07720Za r5 = r10;
            if (r10.A08()) {
                AnonymousClass0KC r1 = AnonymousClass0Xx.A00().A00;
                if (r1 != null) {
                    if (r1.A03) {
                        boolean z = r1.A04;
                        C10350e6 r2 = (C10350e6) r10.A09.get(r4);
                        if (r2 != null) {
                            C17590rf r12 = r2.A04;
                            if (r12 instanceof C07560Yg) {
                                C07560Yg r13 = (C07560Yg) r12;
                                if (r13.A0Q != null && !r13.BLT()) {
                                    AnonymousClass0KD A002 = C10670ej.A00(r2, r13, i);
                                    if (A002 != null) {
                                        r2.A00++;
                                        z = A002.A03;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        if (!z) {
                            currentTimeMillis = 0;
                            elapsedRealtime = 0;
                            C10670ej r3 = new C10670ej(r4, r5, i2, currentTimeMillis, elapsedRealtime);
                            zzw zzw = taskCompletionSource.zza;
                            Handler handler = r5.A06;
                            handler.getClass();
                            zzw.addOnCompleteListener((Executor) new C12510iC(handler), (OnCompleteListener) r3);
                        }
                    } else {
                        return;
                    }
                }
                currentTimeMillis = System.currentTimeMillis();
                elapsedRealtime = SystemClock.elapsedRealtime();
                C10670ej r32 = new C10670ej(r4, r5, i2, currentTimeMillis, elapsedRealtime);
                zzw zzw2 = taskCompletionSource.zza;
                Handler handler2 = r5.A06;
                handler2.getClass();
                zzw2.addOnCompleteListener((Executor) new C12510iC(handler2), (OnCompleteListener) r32);
            }
        }
    }

    public static Status A00(AnonymousClass0L0 r6, AnonymousClass0US r7) {
        String str = r7.A00.A02;
        String valueOf = String.valueOf(r6);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("API: ");
        A0u.append(str);
        String A0p = AnonymousClass000.A0p(" is not available on this device. Connection failed with: ", valueOf, A0u);
        return new Status(r6.A02, r6, A0p, 1, 17);
    }

    public static C07720Za A01(Context context) {
        C07720Za r3;
        HandlerThread handlerThread;
        synchronized (A0I) {
            r3 = A0F;
            if (r3 == null) {
                synchronized (C07520Yb.A07) {
                    handlerThread = C07520Yb.A05;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                        C07520Yb.A05 = handlerThread2;
                        handlerThread2.start();
                        handlerThread = C07520Yb.A05;
                    }
                }
                r3 = new C07720Za(context.getApplicationContext(), handlerThread.getLooper(), C02610Bd.A00);
                A0F = r3;
            }
        }
        return r3;
    }

    private final C10350e6 A02(C07590Yl r4) {
        AnonymousClass0US r2 = r4.A06;
        Map map = this.A09;
        C10350e6 r1 = (C10350e6) map.get(r2);
        if (r1 == null) {
            r1 = new C10350e6(r4, this);
            map.put(r2, r1);
        }
        if (r1.A04.BoS()) {
            this.A0D.add(r2);
        }
        r1.A09();
        return r1;
    }

    public static void A03() {
        synchronized (A0I) {
            C07720Za r1 = A0F;
            if (r1 != null) {
                r1.A0C.incrementAndGet();
                Handler handler = r1.A06;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    private final void A04() {
        AnonymousClass0K4 r3 = this.A04;
        if (r3 != null) {
            if (r3.A01 > 0 || A08()) {
                C16860qD r2 = this.A02;
                if (r2 == null) {
                    r2 = new AnonymousClass0JM(this.A05, C10080df.A00);
                    this.A02 = r2;
                }
                r2.BOW(r3);
            }
            this.A04 = null;
        }
    }

    public final void A07(AnonymousClass0JX r4) {
        synchronized (A0I) {
            if (this.A01 != r4) {
                this.A01 = r4;
                this.A0A.clear();
            }
            this.A0A.addAll(r4.A01);
        }
    }

    public final boolean A08() {
        AnonymousClass0KC r0;
        int i;
        if (this.A03 || (((r0 = AnonymousClass0Xx.A00().A00) != null && !r0.A03) || ((i = this.A08.A01.get(203400000, -1)) != -1 && i != 0))) {
            return false;
        }
        return true;
    }

    public final boolean A09(AnonymousClass0L0 r9, int i) {
        PendingIntent activity;
        C02610Bd r4 = this.A07;
        Context context = this.A05;
        if (C07010Vz.A00(context)) {
            return false;
        }
        if (r9.A00()) {
            activity = r9.A02;
        } else {
            Intent A032 = r4.A03(context, (String) null, r9.A01);
            if (A032 == null) {
                return false;
            }
            activity = PendingIntent.getActivity(context, 0, A032, AnonymousClass0RQ.A00 | 134217728);
        }
        if (activity == null) {
            return false;
        }
        int i2 = r9.A01;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        r4.A05(PendingIntent.getActivity(context, 0, intent, AnonymousClass0RP.A00 | 134217728), context, i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0343, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0168, code lost:
        if (r1.A02 != false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016a, code lost:
        r1.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r7 = r11.what
            r8 = 13
            r1 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r4 = "GoogleApiManager"
            r5 = 17
            r3 = 1
            r6 = 0
            switch(r7) {
                case 1: goto L_0x0314;
                case 2: goto L_0x030d;
                case 3: goto L_0x02ed;
                case 4: goto L_0x0344;
                case 5: goto L_0x0287;
                case 6: goto L_0x0237;
                case 7: goto L_0x022f;
                case 8: goto L_0x0344;
                case 9: goto L_0x014d;
                case 10: goto L_0x020d;
                case 11: goto L_0x01ba;
                case 12: goto L_0x0175;
                case 13: goto L_0x0344;
                case 14: goto L_0x016e;
                case 15: goto L_0x011f;
                case 16: goto L_0x00a4;
                case 17: goto L_0x00a0;
                case 18: goto L_0x001e;
                case 19: goto L_0x0341;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown message id: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r7)
            android.util.Log.w(r4, r0)
            return r6
        L_0x001e:
            java.lang.Object r7 = r11.obj
            X.0TC r7 = (X.AnonymousClass0TC) r7
            long r0 = r7.A02
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x004e
            int r2 = r7.A00
            X.0KE[] r1 = new X.AnonymousClass0KE[r3]
            X.0KE r0 = r7.A03
            r1[r6] = r0
            java.util.List r0 = java.util.Arrays.asList(r1)
            X.0K4 r4 = new X.0K4
            r4.<init>(r2, r0)
            X.0qD r2 = r10.A02
            if (r2 != 0) goto L_0x004a
            android.content.Context r1 = r10.A05
            X.0df r0 = X.C10080df.A00
            X.0JM r2 = new X.0JM
            r2.<init>(r1, r0)
            r10.A02 = r2
        L_0x004a:
            r2.BOW(r4)
            return r3
        L_0x004e:
            X.0K4 r0 = r10.A04
            if (r0 == 0) goto L_0x006c
            java.util.List r2 = r0.A00
            int r1 = r0.A01
            int r0 = r7.A00
            if (r1 != r0) goto L_0x0064
            if (r2 == 0) goto L_0x008e
            int r1 = r2.size()
            int r0 = r7.A01
            if (r1 < r0) goto L_0x008e
        L_0x0064:
            android.os.Handler r0 = r10.A06
            r0.removeMessages(r5)
            r10.A04()
        L_0x006c:
            X.0K4 r0 = r10.A04
            if (r0 != 0) goto L_0x0343
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            X.0KE r0 = r7.A03
            r2.add(r0)
            int r1 = r7.A00
            X.0K4 r0 = new X.0K4
            r0.<init>(r1, r2)
            r10.A04 = r0
            android.os.Handler r4 = r10.A06
            android.os.Message r2 = r4.obtainMessage(r5)
            long r0 = r7.A02
            r4.sendMessageDelayed(r2, r0)
            return r3
        L_0x008e:
            X.0K4 r2 = r10.A04
            X.0KE r1 = r7.A03
            java.util.List r0 = r2.A00
            if (r0 != 0) goto L_0x009c
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r2.A00 = r0
        L_0x009c:
            r0.add(r1)
            goto L_0x006c
        L_0x00a0:
            r10.A04()
            return r3
        L_0x00a4:
            java.lang.Object r2 = r11.obj
            X.0Uf r2 = (X.AnonymousClass0Uf) r2
            java.util.Map r1 = r10.A09
            X.0US r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0343
            X.0US r0 = r2.A01
            java.lang.Object r4 = r1.get(r0)
            X.0e6 r4 = (X.C10350e6) r4
            java.util.List r0 = r4.A07
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L_0x0343
            X.0Za r0 = r4.A0C
            android.os.Handler r1 = r0.A06
            r0 = 15
            r1.removeMessages(r0, r2)
            r0 = 16
            r1.removeMessages(r0, r2)
            X.0Ky r7 = r2.A00
            java.util.Queue r6 = r4.A09
            int r0 = r6.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x00e1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r1 = r2.next()
            X.0XC r1 = (X.AnonymousClass0XC) r1
            boolean r0 = r1 instanceof X.C04160Jm
            if (r0 == 0) goto L_0x00e1
            r0 = r1
            X.0Jm r0 = (X.C04160Jm) r0
            X.0Ky[] r0 = r0.A06(r4)
            if (r0 == 0) goto L_0x00e1
            boolean r0 = X.AnonymousClass0QN.A00(r7, r0)
            if (r0 == 0) goto L_0x00e1
            r5.add(r1)
            goto L_0x00e1
        L_0x0104:
            int r4 = r5.size()
            r2 = 0
        L_0x0109:
            if (r2 >= r4) goto L_0x0343
            java.lang.Object r1 = r5.get(r2)
            X.0XC r1 = (X.AnonymousClass0XC) r1
            r6.remove(r1)
            X.0je r0 = new X.0je
            r0.<init>(r7)
            r1.A04(r0)
            int r2 = r2 + 1
            goto L_0x0109
        L_0x011f:
            java.lang.Object r2 = r11.obj
            X.0Uf r2 = (X.AnonymousClass0Uf) r2
            java.util.Map r1 = r10.A09
            X.0US r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0343
            X.0US r0 = r2.A01
            java.lang.Object r1 = r1.get(r0)
            X.0e6 r1 = (X.C10350e6) r1
            java.util.List r0 = r1.A07
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0343
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0343
            X.0rf r0 = r1.A04
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x016a
            X.C10350e6.A03(r1)
            return r3
        L_0x014d:
            java.util.Map r1 = r10.A09
            java.lang.Object r0 = r11.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0343
            java.lang.Object r0 = r11.obj
            java.lang.Object r1 = r1.get(r0)
            X.0e6 r1 = (X.C10350e6) r1
            X.0Za r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.AnonymousClass006.A00(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0343
        L_0x016a:
            r1.A09()
            return r3
        L_0x016e:
            java.lang.String r0 = "zaa"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0175:
            java.util.Map r1 = r10.A09
            java.lang.Object r0 = r11.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0343
            java.lang.Object r0 = r11.obj
            java.lang.Object r4 = r1.get(r0)
            X.0e6 r4 = (X.C10350e6) r4
            X.0Za r0 = r4.A0C
            android.os.Handler r0 = r0.A06
            X.AnonymousClass006.A00(r0)
            X.0rf r2 = r4.A04
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0343
            java.util.Map r0 = r4.A08
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0343
            X.0WT r1 = r4.A06
            java.util.Map r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b6
            java.util.Map r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = "Timing out service connection."
            r2.B5Y(r0)
            return r3
        L_0x01b6:
            X.C10350e6.A05(r4)
            return r3
        L_0x01ba:
            java.util.Map r1 = r10.A09
            java.lang.Object r0 = r11.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0343
            java.lang.Object r0 = r11.obj
            java.lang.Object r4 = r1.get(r0)
            X.0e6 r4 = (X.C10350e6) r4
            X.0Za r5 = r4.A0C
            android.os.Handler r2 = r5.A06
            X.AnonymousClass006.A00(r2)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0343
            r0 = 11
            X.0US r1 = r4.A05
            r2.removeMessages(r0, r1)
            r0 = 9
            r2.removeMessages(r0, r1)
            r4.A02 = r6
            X.0Bd r2 = r5.A07
            android.content.Context r1 = r5.A05
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r1 = r2.A02(r1, r0)
            r0 = 18
            if (r1 != r0) goto L_0x0208
            r2 = 21
            java.lang.String r1 = "Connection timed out waiting for Google Play services update to complete."
        L_0x01f8:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            X.C10350e6.A01(r0, r4)
            X.0rf r1 = r4.A04
            java.lang.String r0 = "Timing out connection while resuming."
            r1.B5Y(r0)
            return r3
        L_0x0208:
            r2 = 22
            java.lang.String r1 = "API failed to connect while resuming due to an unknown error."
            goto L_0x01f8
        L_0x020d:
            java.util.Set r4 = r10.A0D
            java.util.Iterator r2 = r4.iterator()
        L_0x0213:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x022b
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r10.A09
            java.lang.Object r0 = r0.remove(r1)
            X.0e6 r0 = (X.C10350e6) r0
            if (r0 == 0) goto L_0x0213
            r0.A0A()
            goto L_0x0213
        L_0x022b:
            r4.clear()
            return r3
        L_0x022f:
            java.lang.Object r0 = r11.obj
            X.0Yl r0 = (X.C07590Yl) r0
            r10.A02(r0)
            return r3
        L_0x0237:
            android.content.Context r4 = r10.A05
            android.content.Context r0 = r4.getApplicationContext()
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto L_0x0343
            android.content.Context r0 = r4.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            X.AnonymousClass00B.A00(r0)
            X.00B r6 = X.AnonymousClass00B.A04
            X.0do r4 = new X.0do
            r4.<init>(r10)
            monitor-enter(r6)
            java.util.ArrayList r0 = r6.A01     // Catch:{ all -> 0x0284 }
            r0.add(r4)     // Catch:{ all -> 0x0284 }
            monitor-exit(r6)     // Catch:{ all -> 0x0284 }
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.A03
            boolean r0 = r5.get()
            if (r0 != 0) goto L_0x0279
            android.app.ActivityManager$RunningAppProcessInfo r4 = new android.app.ActivityManager$RunningAppProcessInfo
            r4.<init>()
            android.app.ActivityManager.getMyMemoryState(r4)
            boolean r0 = r5.getAndSet(r3)
            if (r0 != 0) goto L_0x0279
            int r4 = r4.importance
            r0 = 100
            if (r4 <= r0) goto L_0x0279
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A02
            r0.set(r3)
        L_0x0279:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0343
            r10.A00 = r1
            return r3
        L_0x0284:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0284 }
            throw r0
        L_0x0287:
            int r7 = r11.arg1
            java.lang.Object r2 = r11.obj
            X.0L0 r2 = (X.AnonymousClass0L0) r2
            java.util.Map r0 = r10.A09
            java.util.Iterator r1 = X.AnonymousClass000.A0z(r0)
        L_0x0293:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02cf
            java.lang.Object r6 = r1.next()
            X.0e6 r6 = (X.C10350e6) r6
            int r0 = r6.A03
            if (r0 != r7) goto L_0x0293
            int r0 = r2.A01
            if (r0 != r8) goto L_0x02c8
            boolean r0 = X.C02620Be.A00
            java.lang.String r4 = "CANCELED"
            java.lang.String r2 = r2.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error resolution was canceled by the user, original error message: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r5, r1)
        L_0x02c4:
            X.C10350e6.A01(r0, r6)
            return r3
        L_0x02c8:
            X.0US r0 = r6.A05
            com.google.android.gms.common.api.Status r0 = A00(r2, r0)
            goto L_0x02c4
        L_0x02cf:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Could not find API instance "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " while trying to fail enqueued calls."
            r2.append(r0)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r0 = r2.toString()
            android.util.Log.wtf(r4, r0, r1)
            return r3
        L_0x02ed:
            java.util.Map r0 = r10.A09
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r0)
        L_0x02f3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0343
            java.lang.Object r1 = r2.next()
            X.0e6 r1 = (X.C10350e6) r1
            X.0Za r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.AnonymousClass006.A00(r0)
            r0 = 0
            r1.A01 = r0
            r1.A09()
            goto L_0x02f3
        L_0x030d:
            java.lang.String r0 = "zab"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0314:
            java.lang.Object r0 = r11.obj
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r3 != r0) goto L_0x031e
            r1 = 10000(0x2710, double:4.9407E-320)
        L_0x031e:
            r10.A00 = r1
            android.os.Handler r6 = r10.A06
            r5 = 12
            r6.removeMessages(r5)
            java.util.Map r0 = r10.A09
            java.util.Iterator r4 = X.AnonymousClass000.A10(r0)
        L_0x032d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0343
            java.lang.Object r0 = r4.next()
            android.os.Message r2 = r6.obtainMessage(r5, r0)
            long r0 = r10.A00
            r6.sendMessageDelayed(r2, r0)
            goto L_0x032d
        L_0x0341:
            r10.A03 = r6
        L_0x0343:
            return r3
        L_0x0344:
            java.lang.Object r4 = r11.obj
            X.0St r4 = (X.C06220St) r4
            java.util.Map r1 = r10.A09
            X.0Yl r0 = r4.A01
            X.0US r0 = r0.A06
            java.lang.Object r2 = r1.get(r0)
            X.0e6 r2 = (X.C10350e6) r2
            if (r2 != 0) goto L_0x035c
            X.0Yl r0 = r4.A01
            X.0e6 r2 = r10.A02(r0)
        L_0x035c:
            X.0rf r0 = r2.A04
            boolean r0 = r0.BoS()
            if (r0 == 0) goto L_0x0379
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A0C
            int r1 = r0.get()
            int r0 = r4.A00
            if (r1 == r0) goto L_0x0379
            X.0XC r1 = r4.A02
            com.google.android.gms.common.api.Status r0 = A0G
            r1.A01(r0)
            r2.A0A()
            return r3
        L_0x0379:
            X.0XC r0 = r4.A02
            r2.A0C(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07720Za.handleMessage(android.os.Message):boolean");
    }

    public C07720Za(Context context, Looper looper, C02610Bd r8) {
        this.A05 = context;
        AnonymousClass0E7 r3 = new AnonymousClass0E7(looper, this);
        this.A06 = r3;
        this.A07 = r8;
        this.A08 = new C07140Wm(r8);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = C02660Bi.A03;
        if (bool == null) {
            boolean z = false;
            if (AnonymousClass0VW.A00() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            C02660Bi.A03 = bool;
        }
        if (bool.booleanValue()) {
            this.A0E = false;
        }
        r3.sendMessage(r3.obtainMessage(6));
    }

    public final void A06(AnonymousClass0L0 r4, int i) {
        if (!A09(r4, i)) {
            Handler handler = this.A06;
            handler.sendMessage(handler.obtainMessage(5, i, 0, r4));
        }
    }
}
