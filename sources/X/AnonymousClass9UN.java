package X;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9UN  reason: invalid class name */
public abstract class AnonymousClass9UN {
    public AnonymousClass9UN A00;
    public AnonymousClass9QK A01;
    public boolean A02;
    public AtomicInteger A03 = C90484aE.A0v();

    public void A02() {
        AnonymousClass9UN r2 = this.A00;
        if (r2 != null) {
            throw AnonymousClass000.A0f(r2, "Already added to ", AnonymousClass000.A0u());
        }
    }

    public void A03(AnonymousClass9QK r5) {
        int incrementAndGet = this.A03.incrementAndGet();
        if (incrementAndGet == 1) {
            this.A01 = r5;
            Objects.requireNonNull("release", "closer == null");
            if (!this.A02) {
                this.A02 = true;
                return;
            }
            throw AnonymousClass001.A09("Internal bug, expected object to be immutable");
        }
        throw C90464aC.A0R("Acquired object with non-zero initial refCount current = ", AnonymousClass000.A0u(), incrementAndGet);
    }
}
