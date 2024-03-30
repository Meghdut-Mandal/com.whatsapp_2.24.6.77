package X;

/* renamed from: X.6MV  reason: invalid class name */
public class AnonymousClass6MV {
    public Throwable A00;
    public Throwable A01;

    public static void A00(AnonymousClass6MV r4, Throwable th) {
        String str;
        Throwable th2 = r4.A01;
        if (th2 == null) {
            th2 = th;
        }
        r4.A01 = th2;
        if (r4.A00 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(" Exception2: ");
            if (th.getMessage() != null) {
                str = th.getMessage();
            } else {
                str = "";
            }
            th = new Throwable(AnonymousClass000.A0q(str, A0u), new Throwable("exception1", r4.A00));
        }
        r4.A00 = th;
    }
}
