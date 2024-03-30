package X;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.0wk  reason: invalid class name and case insensitive filesystem */
public class C19930wk implements Executor {
    public Runnable A00;
    public final Object A01 = new Object();
    public final HashMap A02 = new HashMap();
    public final C19770wU A03;
    public final Queue A04 = new ArrayDeque();
    public final boolean A05;
    public volatile long A06;

    public static synchronized void A00(C19930wk r2) {
        synchronized (r2) {
            Runnable runnable = (Runnable) r2.A04.poll();
            r2.A00 = runnable;
            if (runnable != null) {
                if (r2.A05) {
                    r2.A03.Bp1(runnable);
                } else {
                    r2.A03.Boy(runnable);
                }
            }
        }
    }

    public synchronized void A02() {
        this.A04.clear();
        HashMap hashMap = this.A02;
        for (Runnable Bnx : hashMap.values()) {
            this.A03.Bnx(Bnx);
        }
        hashMap.clear();
    }

    public synchronized void A03(Runnable runnable, long j) {
        C19770wU r3 = this.A03;
        StringBuilder sb = new StringBuilder();
        sb.append("SerialExecutor/executeDelayed/");
        sb.append(runnable.getClass().getName());
        sb.toString();
        this.A02.put(runnable, r3.BpM(new C35171iG(this, runnable, 5), "SerialExecutor/executeDelayed", j));
    }

    public synchronized void execute(Runnable runnable) {
        Queue queue = this.A04;
        StringBuilder sb = new StringBuilder();
        sb.append("SerialExecutor/execute/");
        sb.append(runnable.getClass().getName());
        sb.toString();
        queue.offer(new C35171iG(this, runnable, 4));
        if (this.A00 == null) {
            A00(this);
        }
    }

    public void A01() {
        boolean z = false;
        if (this.A06 == Thread.currentThread().getId()) {
            z = true;
        }
        C18740tg.A0D(z, "Not running on this SerialExecutor");
    }

    public C19930wk(C19770wU r2, boolean z) {
        this.A03 = r2;
        this.A05 = z;
    }
}
