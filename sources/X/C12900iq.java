package X;

import java.util.concurrent.Future;

/* renamed from: X.0iq  reason: invalid class name and case insensitive filesystem */
public final class C12900iq implements AnonymousClass03l {
    public final Future A00;

    public void dispose() {
        this.A00.cancel(false);
    }

    public C12900iq(Future future) {
        this.A00 = future;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DisposableFutureHandle[");
        return AnonymousClass000.A0n(this.A00, A0u);
    }
}
