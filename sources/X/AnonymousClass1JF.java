package X;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1JF  reason: invalid class name */
public class AnonymousClass1JF implements AnonymousClass0z8 {
    public final C19700wN A00;
    public final C18950u5 A01 = new C18950u5(10, 1000);
    public final C19770wU A02;
    public final ReferenceQueue A03 = new ReferenceQueue();
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final C18910u1 A05 = new C18910u1((Object) null, AnonymousClass1JG.A00);
    public volatile Runnable A06;
    public volatile boolean A07 = true;

    public void BRC() {
        this.A07 = true;
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A02.Bnx(runnable);
            this.A06 = null;
        }
    }

    public void onAppBackgrounded() {
        this.A07 = false;
        if (this.A06 == null) {
            this.A06 = this.A02.BpM(new C35711j8(this, 12), "MemoryLeakReporter/onAppBackgrounded", 5000);
        }
    }

    public AnonymousClass1JF(C19700wN r4, C19770wU r5) {
        this.A00 = r4;
        this.A02 = r5;
    }
}
