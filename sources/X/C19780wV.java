package X;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0wV  reason: invalid class name and case insensitive filesystem */
public class C19780wV implements C19770wU {
    public static C19700wN A04;
    public static C19840wb A05;
    public static final C19810wY A06;
    public static final Executor A07 = C19800wX.A00;
    public static final ThreadPoolExecutor A08;
    public static final BlockingQueue A09;
    public Handler A00;
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public C50342kb B4z(String str, BlockingQueue blockingQueue, int i, int i2, int i3, long j) {
        BlockingQueue blockingQueue2 = blockingQueue;
        C50342kb r1 = new C50342kb(this, blockingQueue2, new C19830wa(i3, str), TimeUnit.SECONDS, i, i2, j, true);
        A06.A00(r1);
        return r1;
    }

    public synchronized void Bnx(Runnable runnable) {
        ConditionVariable conditionVariable = C18740tg.A00;
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public synchronized C35771jE BpM(Runnable runnable, String str, long j) {
        C35771jE r0;
        ConditionVariable conditionVariable = C18740tg.A00;
        Handler handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("WhatsApp Worker Scheduler", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        r0 = new C35771jE(this, runnable, 20);
        handler.postDelayed(r0, j);
        return r0;
    }

    static {
        C19790wW r3 = new C19790wW();
        A09 = r3;
        C19810wY r5 = new C19810wY();
        A06 = r5;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A05 = new C36041jf(r3, new C19830wa(10, "WhatsApp Worker"), timeUnit, 0);
        C36041jf r2 = new C36041jf(new SynchronousQueue(), new C19830wa(0, "High Pri Worker"), timeUnit, 1);
        A08 = r2;
        A05.setRejectedExecutionHandler(new C19850wc());
        r5.A00(A05);
        r5.A00(r2);
    }

    public C50342kb A00(String str, int i) {
        return new C50342kb(this, new LinkedBlockingQueue(), new C19830wa(i, str), TimeUnit.SECONDS, 1, 1, 0, false);
    }

    public final void Box(C132446Tt r3, Object... objArr) {
        ConditionVariable conditionVariable = C18740tg.A00;
        r3.A02.executeOnExecutor(A05, objArr);
    }

    public void Boy(Runnable runnable) {
        ConditionVariable conditionVariable = C18740tg.A00;
        A05.execute(runnable);
    }

    public void Boz(Runnable runnable, String str) {
        ConditionVariable conditionVariable = C18740tg.A00;
        Set set = this.A03;
        synchronized (set) {
            if (set.add(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("WaWorkers/runIfNotRunning/");
                sb.append(str);
                sb.toString();
                Boy(new C21840zt(this, runnable, str, set));
            }
        }
    }

    public final void Bp0(C132446Tt r3, Object... objArr) {
        ConditionVariable conditionVariable = C18740tg.A00;
        r3.A02.executeOnExecutor(A08, objArr);
    }

    public void Bp1(Runnable runnable) {
        ConditionVariable conditionVariable = C18740tg.A00;
        A08.execute(runnable);
    }

    public boolean Bp2(Runnable runnable, String str) {
        boolean z;
        ConditionVariable conditionVariable = C18740tg.A00;
        Set set = this.A02;
        synchronized (set) {
            if (set.add(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("WaWorkers/runLatencySensitiveIfNotRunning/");
                sb.append(str);
                sb.toString();
                Bp1(new C21840zt(this, runnable, str, set));
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void Bp6(Runnable runnable, String str) {
        C19930wk r1;
        ConditionVariable conditionVariable = C18740tg.A00;
        Map map = this.A01;
        synchronized (map) {
            r1 = (C19930wk) map.get(str);
            if (r1 == null) {
                r1 = new C19930wk(this, false);
                map.put(str, r1);
            }
        }
        r1.execute(runnable);
    }
}
