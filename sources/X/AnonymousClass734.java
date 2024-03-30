package X;

/* renamed from: X.734  reason: invalid class name */
public class AnonymousClass734 implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;

    public AnonymousClass734(Object obj, int i, int i2, long j) {
        this.A03 = i2;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = j;
    }

    public final void run() {
        if (this.A03 != 0) {
            AnonymousClass6TQ r6 = (AnonymousClass6TQ) this.A02;
            int i = this.A00;
            long j = this.A01;
            C1042258t A002 = AnonymousClass6TQ.A00(r6, 0);
            A002.A03 = Integer.valueOf(i);
            if (j != 0) {
                A002.A0I = Long.valueOf(j);
            }
            AnonymousClass6TQ.A01(A002, r6);
        }
    }
}
