package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2XJ  reason: invalid class name */
public class AnonymousClass2XJ extends AnonymousClass1GM {
    public final AnonymousClass1HX A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass16K A02;
    public final C21060yb A03;
    public final C19630wG A04;
    public final C18820ts A05;
    public final AnonymousClass1YI A06;

    public AnonymousClass2XJ(AnonymousClass1HX r3, AnonymousClass16D r4, AnonymousClass16K r5, C21060yb r6, C19630wG r7, C18820ts r8, AnonymousClass1YI r9, ThreadPoolExecutor threadPoolExecutor) {
        super(new C18910u1(threadPoolExecutor, (AnonymousClass004) null));
        this.A04 = r7;
        this.A00 = r3;
        this.A06 = r9;
        this.A01 = r4;
        this.A03 = r6;
        this.A05 = r8;
        this.A02 = r5;
    }

    public static C50342kb A01(C19770wU r9) {
        C50342kb r0 = new C50342kb((C19780wV) r9, new PriorityBlockingQueue(), new C19830wa(0, "VCardLoader"), TimeUnit.SECONDS, 1, 1, 5, false);
        r0.allowCoreThreadTimeOut(true);
        return r0;
    }

    public /* bridge */ /* synthetic */ Runnable A09(Object obj, Object obj2) {
        return new AnonymousClass28m((AnonymousClass3T1) obj, this);
    }

    public void A0A() {
        A06(new AnonymousClass411(this, 22));
        synchronized (this) {
            ((ThreadPoolExecutor) this.A00.get()).shutdown();
        }
    }
}
