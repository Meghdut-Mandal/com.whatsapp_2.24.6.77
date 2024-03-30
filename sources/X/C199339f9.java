package X;

/* renamed from: X.9f9  reason: invalid class name and case insensitive filesystem */
public class C199339f9 {
    public boolean A00;
    public final B40 A01;

    public synchronized void A00() {
        this.A00 = false;
    }

    public synchronized boolean A01() {
        boolean z;
        z = false;
        if (!this.A00) {
            z = true;
            this.A00 = true;
            notifyAll();
        }
        return z;
    }

    public C199339f9(B40 b40) {
        this.A01 = b40;
    }

    public C199339f9() {
        this(B40.A00);
    }
}
