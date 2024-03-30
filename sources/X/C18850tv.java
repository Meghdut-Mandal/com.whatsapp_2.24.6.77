package X;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0tv  reason: invalid class name and case insensitive filesystem */
public final class C18850tv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C157107bq A03;
    public final C130966Nd A04;
    public final Executor A05 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new AnonymousClass77K(this, false));
    public final Executor A06 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new AnonymousClass77K(this, true));

    public int A00() {
        if (Build.VERSION.SDK_INT == 23) {
            return 10;
        }
        return 20;
    }

    public C18850tv(C120735rz r4) {
        C130966Nd r0 = r4.A02;
        this.A04 = r0 == null ? new C97424pa() : r0;
        this.A03 = new C138796ii();
        this.A00 = r4.A00;
        this.A02 = r4.A01;
        this.A01 = Integer.MAX_VALUE;
    }
}
