package X;

/* renamed from: X.00u  reason: invalid class name and case insensitive filesystem */
public class C001900u implements Runnable {
    public final /* synthetic */ C001600r A00;

    public C001900u(C001600r r1) {
        this.A00 = r1;
    }

    public void run() {
        Object obj;
        C001600r r3 = this.A00;
        synchronized (r3.A06) {
            obj = r3.A08;
            r3.A08 = C001600r.A0A;
        }
        r3.A0D(obj);
    }
}
