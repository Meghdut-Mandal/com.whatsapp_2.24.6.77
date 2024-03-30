package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0f6  reason: invalid class name and case insensitive filesystem */
public final class C10720f6 implements C17880sD {
    public final WeakReference A00;
    public final AnonymousClass0f7 A01 = new AnonymousClass0GF(this);

    public void B0P(Runnable runnable, Executor executor) {
        this.A01.B0P(runnable, executor);
    }

    public boolean cancel(boolean z) {
        AnonymousClass0UQ r3 = (AnonymousClass0UQ) this.A00.get();
        boolean cancel = this.A01.cancel(z);
        if (cancel && r3 != null) {
            r3.A02 = null;
            r3.A00 = null;
            r3.A01.A06((Object) null);
        }
        return cancel;
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.A01.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.A01.isCancelled();
    }

    public boolean isDone() {
        return this.A01.isDone();
    }

    public String toString() {
        return this.A01.toString();
    }

    public C10720f6(AnonymousClass0UQ r2) {
        this.A00 = AnonymousClass001.A0F(r2);
    }

    public Object get() {
        return this.A01.get();
    }
}
