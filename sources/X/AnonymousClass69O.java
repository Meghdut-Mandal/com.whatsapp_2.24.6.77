package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.69O  reason: invalid class name */
public class AnonymousClass69O {
    public final AnonymousClass9YW A00;
    public final AtomicInteger A01;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass69O) || !this.A00.equals(((AnonymousClass69O) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }

    public AnonymousClass69O(AnonymousClass9YW r2, int i) {
        this.A00 = r2;
        this.A01 = new AtomicInteger(i);
    }
}
