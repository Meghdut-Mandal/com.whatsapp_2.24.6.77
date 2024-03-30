package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.3xm  reason: invalid class name and case insensitive filesystem */
public class C81873xm implements Executor {
    public int A00;
    public final int A01;
    public final C19770wU A02;
    public final Queue A03 = new ArrayDeque();
    public final boolean A04;

    public synchronized void execute(Runnable runnable) {
        this.A03.offer(new C81203wd(this, runnable, 48));
        if (this.A00 < this.A01) {
            A00(this);
        }
    }

    public static void A00(C81873xm r3) {
        Runnable runnable = (Runnable) r3.A03.poll();
        if (runnable != null) {
            r3.A00++;
            boolean z = r3.A04;
            C19770wU r0 = r3.A02;
            if (z) {
                r0.Bp1(runnable);
            } else {
                r0.Boy(runnable);
            }
        }
    }

    public C81873xm(C19770wU r2, int i, boolean z) {
        this.A02 = r2;
        this.A01 = i;
        this.A04 = z;
    }
}
