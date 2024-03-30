package X;

/* renamed from: X.5ZQ  reason: invalid class name */
public class AnonymousClass5ZQ implements AnonymousClass4RC {
    public Object A00;
    public final int A01;

    public AnonymousClass5ZQ(C143526qh r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void Bki() {
        int i = this.A01;
        C143526qh r3 = (C143526qh) this.A00;
        synchronized (C143526qh.class) {
            if (i != 0) {
                r3.A06.A02 = 16;
                r3.A0A();
                return;
            }
            r3.A06.A02 = 12;
            r3.A0A();
        }
    }
}
