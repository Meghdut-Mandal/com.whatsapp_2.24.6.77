package X;

import java.io.Closeable;

/* renamed from: X.0Qi  reason: invalid class name and case insensitive filesystem */
public abstract class C05600Qi {
    public static final void A00(Closeable closeable, Throwable th) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                AnonymousClass0VY.A01(th, th2);
            }
        }
    }
}
