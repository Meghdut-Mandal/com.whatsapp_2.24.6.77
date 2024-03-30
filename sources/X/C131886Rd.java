package X;

/* renamed from: X.6Rd  reason: invalid class name and case insensitive filesystem */
public abstract class C131886Rd {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static final Object A00(AnonymousClass00S r2, int i) {
        ThreadLocal threadLocal = A00;
        threadLocal.set(Integer.valueOf(i));
        try {
            return r2.invoke();
        } finally {
            threadLocal.remove();
        }
    }

    public static final void A01(AnonymousClass00S r2, int i) {
        ThreadLocal threadLocal = A00;
        threadLocal.set(Integer.valueOf(i));
        try {
            r2.invoke();
        } finally {
            threadLocal.remove();
        }
    }
}
