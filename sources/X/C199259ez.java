package X;

/* renamed from: X.9ez  reason: invalid class name and case insensitive filesystem */
public final class C199259ez {
    public static int A00 = 1;
    public static String A01;
    public static String A02;
    public static final C199259ez A03 = new C199259ez();

    public final synchronized String A00() {
        String str;
        synchronized (this) {
            str = A02;
            if (str == null) {
                str = C90464aC.A0V();
                A02 = str;
                System.currentTimeMillis();
            }
        }
        return str;
    }
}
