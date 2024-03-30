package X;

import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5sY  reason: invalid class name and case insensitive filesystem */
public final class C121075sY {
    public C124105xb A00 = null;
    public RunnableFuture A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public C121075sY(C1271967i r3, AnonymousClass66A r4, C124105xb r5, Map map) {
        this.A01 = new FutureTask(new AnonymousClass76o(r3, r4, r5, map));
    }
}
