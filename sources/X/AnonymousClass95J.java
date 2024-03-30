package X;

import java.io.Closeable;

/* renamed from: X.95J  reason: invalid class name */
public abstract class AnonymousClass95J {
    public static final void A00(Closeable closeable) {
        AnonymousClass00C.A0D(closeable, 0);
        try {
            closeable.close();
        } catch (Throwable th) {
            new AnonymousClass03N(th);
        }
    }
}
