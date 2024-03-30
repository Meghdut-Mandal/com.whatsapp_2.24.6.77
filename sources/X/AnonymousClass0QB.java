package X;

/* renamed from: X.0QB  reason: invalid class name */
public abstract class AnonymousClass0QB {
    public static void A00(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
