package X;

/* renamed from: X.A1b  reason: case insensitive filesystem */
public class C20968A1b implements B41 {
    public static C20968A1b A00;

    public static synchronized C20968A1b A00() {
        C20968A1b a1b;
        synchronized (C20968A1b.class) {
            a1b = A00;
            if (a1b == null) {
                a1b = new C20968A1b();
                A00 = a1b;
            }
        }
        return a1b;
    }
}
