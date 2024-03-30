package X;

/* renamed from: X.0Xx  reason: invalid class name */
public final class AnonymousClass0Xx {
    public static AnonymousClass0Xx A01;
    public static final AnonymousClass0KC A02 = new AnonymousClass0KC(0, 0, 0, false, false);
    public AnonymousClass0KC A00;

    public static synchronized AnonymousClass0Xx A00() {
        AnonymousClass0Xx r0;
        synchronized (AnonymousClass0Xx.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new AnonymousClass0Xx();
                A01 = r0;
            }
        }
        return r0;
    }
}
