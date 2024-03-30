package X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: X.0Wl  reason: invalid class name and case insensitive filesystem */
public final class C07130Wl {
    public final Deque A00 = new ArrayDeque(16);

    public static final long A00(C07130Wl r1) {
        Deque deque = r1.A00;
        if (deque.isEmpty()) {
            return 0;
        }
        return ((Number) deque.peek()).longValue();
    }

    public final void A01() {
        Deque deque = this.A00;
        if (!deque.isEmpty()) {
            Object[] A0M = AnonymousClass001.A0M();
            AnonymousClass000.A1L(A0M, deque.size(), 0);
            AnonymousClass000.A1M(A0M, 1, A00(this));
            throw new IOException(String.format("data item not completed, stackSize: %s scope: %s", A0M));
        }
    }
}
