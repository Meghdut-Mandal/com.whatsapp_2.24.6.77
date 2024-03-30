package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3ty  reason: invalid class name and case insensitive filesystem */
public class C79593ty implements C25711Hj {
    public final C25721Hk A00 = new C25721Hk();
    public final C25721Hk A01 = new C25721Hk();
    public final AtomicBoolean A02 = C36431kI.A1H();

    public static void A00(C79593ty r1, Object obj, int i) {
        r1.A0A(new AnonymousClass411(obj, i));
    }

    public final void A0A(C25711Hj r3) {
        this.A01.A03(r3, (Executor) null);
    }

    public final void A0B(C25711Hj r2, Executor executor) {
        this.A01.A03(r2, executor);
    }

    public final void A0C(Object obj) {
        if (this.A02.compareAndSet(false, true)) {
            this.A01.A04(obj);
        }
    }

    public final void A0D(Throwable th) {
        if (this.A02.compareAndSet(false, true)) {
            this.A00.A04(th);
        }
    }

    public void A0E() {
        this.A01.A01();
        this.A00.A01();
        if (!this.A02.get()) {
            Log.w("asyncfuture/unsubscribe called before completion, possibly not intended", new Throwable());
        }
    }

    public final void accept(Object obj) {
        A0C(obj);
    }
}
