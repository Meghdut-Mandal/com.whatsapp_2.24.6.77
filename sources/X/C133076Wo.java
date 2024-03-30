package X;

import android.os.Handler;
import android.os.StrictMode;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Wo  reason: invalid class name and case insensitive filesystem */
public final class C133076Wo {
    public static final Object A0B = C36441kJ.A11();
    public static final Handler A0C = C36341k9.A0H();
    public Throwable A00;
    public final C130726Me A01;
    public final Object A02 = C36441kJ.A11();
    public final Thread A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final CountDownLatch A07;
    public final Executor A08;
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public volatile boolean A0A = false;

    public static String A00() {
        boolean z;
        StringBuilder A0h = C90524aI.A0h("linkedapp_app_identity".length());
        char[] charArray = "linkedapp_app_identity".toCharArray();
        int length = charArray.length;
        int i = 0;
        boolean z2 = false;
        while (i < length) {
            char c = charArray[i];
            if (c > '9' || c < '0') {
                z = false;
                A0h.append(c);
            } else {
                z = true;
                if (!z2) {
                    A0h.append('#');
                }
            }
            i++;
            z2 = z;
        }
        return A0h.toString();
    }

    public static void A01(C133076Wo r7) {
        if (!r7.A0A) {
            CountDownLatch countDownLatch = r7.A07;
            if (countDownLatch.getCount() == 1) {
                StrictMode.noteSlowCall("Blocked on LightSharedPreferences Init");
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("LightSharedPreferences.waitIfNotLoaded: ");
            String A0q = AnonymousClass000.A0q(A00(), A0u);
            String substring = A0q.substring(0, Math.min(A0q.length(), 127));
            Method method = C000600g.A03;
            AnonymousClass00h.A01(substring);
            while (!r7.A0A) {
                Thread thread = r7.A03;
                if (!(thread == null || thread.getState() == Thread.State.TERMINATED)) {
                    int priority = Thread.currentThread().getPriority();
                    synchronized (r7) {
                        if (priority > thread.getPriority()) {
                            A03(thread, priority);
                        }
                    }
                }
                try {
                    continue;
                    countDownLatch.await();
                    break;
                } catch (InterruptedException unused) {
                }
            }
            AnonymousClass00h.A00();
        }
    }

    public C133076Wo(Executor executor, AnonymousClass004 r6) {
        Objects.requireNonNull(r6);
        this.A01 = new C130726Me(r6);
        this.A05 = AnonymousClass001.A0J();
        this.A06 = AnonymousClass001.A0J();
        this.A04 = AnonymousClass001.A0J();
        Objects.requireNonNull(executor);
        this.A08 = executor;
        this.A07 = new CountDownLatch(1);
        AnonymousClass759 r2 = new AnonymousClass759((Object) this, 45);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LSP-");
        Thread thread = new Thread(r2, AnonymousClass000.A0q(A00(), A0u));
        this.A03 = thread;
        A03(thread, Math.max(Thread.currentThread().getPriority() - 1, 1));
        thread.start();
    }

    public static void A02(C133076Wo r3, String str, Throwable th, Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            A11.getKey();
            ((Handler) A11.getValue()).post(new C1502274l(r3, str, th));
        }
    }

    public static void A03(Thread thread, int i) {
        try {
            thread.setPriority(i);
        } catch (IllegalArgumentException e) {
            if (thread.getState() != Thread.State.TERMINATED) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Failed to set thread priority - thread state:");
                A0u.append(thread.getState().name());
                throw new IllegalArgumentException(AnonymousClass000.A0r(" priority:", A0u, i), e);
            }
        }
    }
}
