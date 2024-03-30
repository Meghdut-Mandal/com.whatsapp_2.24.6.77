package X;

import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* renamed from: X.77r  reason: invalid class name and case insensitive filesystem */
public final class C1510177r implements AnonymousClass040, Closeable {
    public final C005102h A00;

    public C1510177r(C005102h r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void close() {
        C07570Yj.A02((CancellationException) null, this.A00);
    }

    public C005102h BAE() {
        return this.A00;
    }
}
