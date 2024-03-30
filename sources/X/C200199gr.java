package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.9gr  reason: invalid class name and case insensitive filesystem */
public class C200199gr {
    public static final UUID A06 = UUID.randomUUID();
    public Handler A00;
    public UUID A01;
    public final Handler A02;
    public final Handler A03;
    public final HandlerThread A04;
    public final HandlerThread A05;

    public synchronized AnonymousClass79Q A00(AnonymousClass9T8 r6, String str, Callable callable) {
        AnonymousClass79Q r4;
        UUID uuid = this.A01;
        Objects.requireNonNull(uuid);
        r4 = new AnonymousClass79Q(this, str, uuid, callable);
        if (r6 != null) {
            r4.A02(r6);
        }
        this.A03.postAtTime(r4, this.A01, SystemClock.uptimeMillis());
        return r4;
    }

    public synchronized AnonymousClass79Q A02(String str, Callable callable, long j) {
        AnonymousClass79Q r4;
        UUID uuid = this.A01;
        Objects.requireNonNull(uuid);
        r4 = new AnonymousClass79Q(this, str, uuid, callable);
        this.A03.postAtTime(r4, this.A01, SystemClock.uptimeMillis() + j);
        return r4;
    }

    public Object A03(String str, Callable callable) {
        AnonymousClass79Q r1;
        synchronized (this) {
            UUID uuid = this.A01;
            Objects.requireNonNull(uuid);
            r1 = new AnonymousClass79Q(this, str, uuid, callable);
            this.A02.post(r1);
        }
        return r1.get();
    }

    public Object A04(String str, Callable callable) {
        AnonymousClass79Q r1;
        synchronized (this) {
            UUID uuid = this.A01;
            Objects.requireNonNull(uuid);
            r1 = new AnonymousClass79Q(this, str, uuid, callable);
            this.A02.post(r1);
        }
        C23013B0e b0e = (C23013B0e) r1.get();
        b0e.B1t();
        return b0e.BGo();
    }

    public synchronized void A05(Runnable runnable, UUID uuid) {
        UUID uuid2 = this.A01;
        if ((uuid2 != null && uuid2.equals(uuid)) || A06.equals(uuid)) {
            Handler handler = this.A00;
            if (handler != null) {
                handler.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                synchronized (C202399lk.class) {
                    C202399lk.A00.postAtTime(runnable, uuid, uptimeMillis);
                }
            }
        }
    }

    public synchronized void A07(String str, Callable callable) {
        A00((AnonymousClass9T8) null, str, callable);
    }

    public synchronized void A08(FutureTask futureTask) {
        this.A03.removeCallbacks(futureTask);
    }

    public synchronized AnonymousClass79Q A01(AnonymousClass9T8 r6, Callable callable) {
        AnonymousClass79Q r3;
        UUID uuid = A06;
        r3 = new AnonymousClass79Q(this, "load_camera_infos", uuid, callable);
        r3.A02(r6);
        this.A03.postAtTime(r3, uuid, SystemClock.uptimeMillis());
        return r3;
    }

    public boolean A09() {
        return C36361kB.A1a(this.A03.getLooper().getThread(), Thread.currentThread());
    }

    public C200199gr() {
        HandlerThread handlerThread = new HandlerThread("Optic-Task-Handler-Thread");
        this.A05 = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Objects.requireNonNull(looper);
        this.A03 = new Handler(looper);
        HandlerThread handlerThread2 = new HandlerThread("Optic-Camera-Handler-Thread");
        this.A04 = handlerThread2;
        handlerThread2.start();
        Looper looper2 = handlerThread2.getLooper();
        Objects.requireNonNull(looper2);
        this.A02 = new Handler(looper2);
    }

    public void A06(String str) {
        if (!A09()) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append(" Current thread: ");
            throw C90464aC.A0U(Thread.currentThread().getName(), A0v);
        }
    }

    public void finalize() {
        super.finalize();
        HandlerThread handlerThread = this.A04;
        handlerThread.quitSafely();
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            C90484aE.A0z();
        }
        HandlerThread handlerThread2 = this.A05;
        handlerThread2.quitSafely();
        try {
            handlerThread2.join();
        } catch (InterruptedException unused2) {
            C90484aE.A0z();
        }
    }
}
