package X;

import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.Callable;

public final /* synthetic */ class AYW implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ A29 A01;

    public /* synthetic */ AYW(A29 a29, long j) {
        this.A01 = a29;
        this.A00 = j;
    }

    public final Object call() {
        A29 a29 = this.A01;
        long j = this.A00;
        if (a29.A0e) {
            C199989gN r5 = a29.A09;
            Objects.requireNonNull(r5);
            r5.A02(C199989gN.A0Q, Long.valueOf(SystemClock.elapsedRealtime()));
            A29.A06(a29);
            C199989gN r2 = a29.A09;
            Objects.requireNonNull(r2);
            r2.A02(C199989gN.A0P, Long.valueOf(j));
            return a29.A09;
        }
        throw AnonymousClass001.A09("Not recording video.");
    }
}
