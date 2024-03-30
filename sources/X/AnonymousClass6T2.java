package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6T2  reason: invalid class name */
public class AnonymousClass6T2 {
    public static final long A0F = TimeUnit.DAYS.toMillis(366);
    public static final Object A0G = C36441kJ.A11();
    public static volatile ScheduledExecutorService A0H;
    public int A00 = 0;
    public int A01;
    public long A02;
    public C1495871u A03;
    public Future A04;
    public AtomicInteger A05 = new AtomicInteger(0);
    public WorkSource A06;
    public C15960oK A07 = C10470eI.A00;
    public final PowerManager.WakeLock A08;
    public final Object A09 = C36441kJ.A11();
    public final String A0A;
    public final Map A0B = AnonymousClass001.A0J();
    public final Set A0C = C36441kJ.A16();
    public final ScheduledExecutorService A0D;
    public final Context A0E;

    public AnonymousClass6T2(Context context) {
        Object[] objArr;
        String packageName = context.getPackageName();
        AnonymousClass006.A05("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        this.A0E = context.getApplicationContext();
        this.A03 = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.A0A = C90484aE.A0n(String.valueOf("wake:com.google.firebase.iid.WakeLockHolder"), "*gcore*:");
        } else {
            this.A0A = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            this.A08 = newWakeLock;
            Method method = AnonymousClass0WC.A00;
            if (context.getPackageManager() != null) {
                if (C02640Bg.A00(context).A00.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
                    packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                    WorkSource workSource = null;
                    if (!(context.getPackageManager() == null || packageName == null)) {
                        try {
                            ApplicationInfo applicationInfo = C02640Bg.A00(context).A00.getPackageManager().getApplicationInfo(packageName, 0);
                            if (applicationInfo == null) {
                                Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                            } else {
                                int i = applicationInfo.uid;
                                workSource = new WorkSource();
                                Method method2 = AnonymousClass0WC.A01;
                                if (method2 != null) {
                                    try {
                                        objArr = new Object[2];
                                        AnonymousClass000.A1L(objArr, i, 0);
                                        objArr[1] = packageName;
                                    } catch (Exception e) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                    }
                                } else {
                                    method2 = AnonymousClass0WC.A00;
                                    if (method2 != null) {
                                        objArr = new Object[1];
                                        AnonymousClass000.A1L(objArr, i, 0);
                                    }
                                }
                                method2.invoke(workSource, objArr);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                        }
                    }
                    this.A06 = workSource;
                    if (workSource != null) {
                        try {
                            newWakeLock.setWorkSource(workSource);
                        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                            Log.wtf("WakeLock", e2.toString());
                        }
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = A0H;
            if (scheduledExecutorService == null) {
                synchronized (A0G) {
                    scheduledExecutorService = A0H;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        A0H = scheduledExecutorService;
                    }
                }
            }
            this.A0D = scheduledExecutorService;
            return;
        }
        StringBuilder A0h = C90524aI.A0h(29);
        A0h.append("expected a non-null reference", 0, 29);
        throw new AnonymousClass78R(A0h.toString());
    }

    public static final void A00(AnonymousClass6T2 r6) {
        synchronized (r6.A09) {
            if (r6.A01()) {
                int i = r6.A00 - 1;
                r6.A00 = i;
                if (i <= 0) {
                    Set set = r6.A0C;
                    if (!set.isEmpty()) {
                        ArrayList A15 = C36441kJ.A15(set);
                        set.clear();
                        if (A15.size() > 0) {
                            A15.get(0);
                            throw null;
                        }
                    }
                    Map map = r6.A0B;
                    Iterator A0z = AnonymousClass000.A0z(map);
                    while (A0z.hasNext()) {
                        ((AnonymousClass6JG) A0z.next()).A00 = 0;
                    }
                    map.clear();
                    Future future = r6.A04;
                    if (future != null) {
                        future.cancel(false);
                        r6.A04 = null;
                        r6.A02 = 0;
                    }
                    r6.A01 = 0;
                    PowerManager.WakeLock wakeLock = r6.A08;
                    if (wakeLock.isHeld()) {
                        try {
                            wakeLock.release();
                            if (r6.A03 != null) {
                                r6.A03 = null;
                            }
                        } catch (RuntimeException e) {
                            if (e.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(r6.A0A).concat(" failed to release!"), e);
                                if (r6.A03 != null) {
                                    r6.A03 = null;
                                }
                            } else {
                                throw e;
                            }
                        } catch (Throwable th) {
                            if (r6.A03 != null) {
                                r6.A03 = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(r6.A0A).concat(" should be held!"));
                    }
                }
            }
        }
    }

    public boolean A01() {
        boolean A1R;
        synchronized (this.A09) {
            A1R = AnonymousClass000.A1R(this.A00);
        }
        return A1R;
    }
}
