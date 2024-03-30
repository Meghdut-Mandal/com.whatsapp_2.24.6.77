package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0AT  reason: invalid class name */
public class AnonymousClass0AT {
    public static final AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass0AT.class, "_handled");
    public final Throwable A00;
    public volatile int _handled;

    public final boolean A00() {
        if (A01.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        return A01.compareAndSet(this, 0, 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }

    public AnonymousClass0AT(Throwable th, boolean z) {
        this.A00 = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ AnonymousClass0AT(Throwable th) {
        this(th, false);
    }
}
