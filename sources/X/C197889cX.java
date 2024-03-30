package X;

/* renamed from: X.9cX  reason: invalid class name and case insensitive filesystem */
public class C197889cX {
    public final int A00;
    public final String A01;
    public final Throwable A02;
    public final C23931Ak A03;

    public C197889cX(C23931Ak r1, String str, Throwable th, int i) {
        this.A00 = i;
        this.A02 = th;
        this.A01 = str;
        this.A03 = r1;
    }

    public static void A00(Throwable th, Throwable th2) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th.getClass() != th2.getClass()) {
            try {
                th.initCause(th2);
            } catch (IllegalStateException e) {
                e.addSuppressed(th2);
            }
        }
    }
}
