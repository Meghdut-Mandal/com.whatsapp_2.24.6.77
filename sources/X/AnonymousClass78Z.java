package X;

/* renamed from: X.78Z  reason: invalid class name */
public class AnonymousClass78Z extends Thread {
    public final /* synthetic */ A0U A00;

    public AnonymousClass78Z(A0U a0u) {
        this.A00 = a0u;
    }

    public void run() {
        A0U a0u = this.A00;
        synchronized (a0u) {
            A0U.A03(a0u);
            Object obj = a0u.A01;
            synchronized (obj) {
                a0u.A02 = true;
                obj.notifyAll();
            }
        }
    }
}
