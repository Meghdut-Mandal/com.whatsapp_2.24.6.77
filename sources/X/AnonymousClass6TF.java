package X;

import android.os.Handler;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.6TF  reason: invalid class name */
public class AnonymousClass6TF {
    public static Executor A04 = Executors.newCachedThreadPool();
    public final Handler A00 = C36341k9.A0H();
    public final Set A01 = new LinkedHashSet(1);
    public final Set A02 = new LinkedHashSet(1);
    public volatile C131046Nn A03 = null;

    public synchronized void A01(AnonymousClass7eC r2) {
        Throwable th;
        C131046Nn r0 = this.A03;
        if (!(r0 == null || (th = r0.A01) == null)) {
            r2.onResult(th);
        }
        this.A01.add(r2);
    }

    public synchronized void A02(AnonymousClass7eC r2) {
        Object obj;
        C131046Nn r0 = this.A03;
        if (!(r0 == null || (obj = r0.A00) == null)) {
            r2.onResult(obj);
        }
        this.A02.add(r2);
    }

    public static void A00(C131046Nn r1, AnonymousClass6TF r2) {
        if (r2.A03 == null) {
            r2.A03 = r1;
            AnonymousClass759.A00(r2.A00, r2, 24);
            return;
        }
        throw AnonymousClass001.A09("A task may only be set once.");
    }

    public AnonymousClass6TF(Callable callable, boolean z) {
        if (z) {
            try {
                A00((C131046Nn) callable.call(), this);
            } catch (Throwable th) {
                A00(new C131046Nn(th), this);
            }
        } else {
            A04.execute(new AnonymousClass79O(this, callable));
        }
    }
}
