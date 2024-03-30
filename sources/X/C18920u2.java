package X;

import android.os.Process;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0u2  reason: invalid class name and case insensitive filesystem */
public class C18920u2 extends Thread {
    public static final Runnable A05 = C18940u4.A00;
    public static final String A06;
    public C19700wN A00;
    public final BlockingQueue A01 = new ArrayBlockingQueue(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, true);
    public final C18950u5 A02 = new C18950u5(20, 20);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicInteger A04 = new AtomicInteger(0);

    public static void A00(C18920u2 r5) {
        C19700wN r3;
        Object obj = null;
        do {
            try {
                obj = r5.A01.take();
                continue;
            } catch (InterruptedException unused) {
            }
        } while (obj == null);
        if (obj instanceof String) {
            Log.doLogToFile((String) obj);
        } else if (obj instanceof FutureTask) {
            ((FutureTask) obj).run();
        } else {
            throw new IllegalStateException("Invalid log item type");
        }
        AtomicBoolean atomicBoolean = r5.A03;
        if (atomicBoolean.get() && r5.A01.isEmpty()) {
            Log.blockingLog(2, "==========log/emptyingqueue/end==========");
            StringBuilder sb = new StringBuilder();
            sb.append("==========log/emptyingqueue/skipped ");
            AtomicInteger atomicInteger = r5.A04;
            sb.append(atomicInteger);
            sb.append(" entries==========");
            Log.blockingLog(2, sb.toString());
            atomicInteger.set(0);
            atomicBoolean.set(false);
            if (r5.A02.A00()) {
                synchronized (r5) {
                    r3 = r5.A00;
                    if (r3 == null) {
                        throw new NullPointerException();
                    }
                }
                r3.A0E("Log/doLogLoop", "Logging queue became full", true);
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("Logger (");
        sb.append(C18930u3.A00());
        sb.append(')');
        A06 = sb.toString();
    }

    public C18920u2() {
        super(A06);
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            A00(this);
        }
    }

    public static void A01(C18920u2 r3, Object obj) {
        if (Thread.currentThread() != r3) {
            AtomicBoolean atomicBoolean = r3.A03;
            if (!atomicBoolean.get()) {
                if (r3.A01.offer(obj)) {
                    return;
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    Log.blockingLog(2, "==========log/emptyingqueue/start==========");
                }
            }
            r3.A04.incrementAndGet();
            return;
        }
        Log.blockingLog(1, "Cannot add a log item from the logging thread. Attempting to crash.");
        throw new AssertionError("Cannot add a log item from the logging thread.");
    }
}
