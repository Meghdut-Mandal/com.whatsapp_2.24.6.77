package X;

/* renamed from: X.7qN  reason: invalid class name and case insensitive filesystem */
public class C163547qN implements AnonymousClass7h8 {
    public Object A00;
    public final int A01;

    public C163547qN(C143526qh r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void BZO(Object obj) {
        if (this.A01 != 0) {
            C143526qh r3 = (C143526qh) this.A00;
            AnonymousClass141 r5 = (AnonymousClass141) obj;
            synchronized (C143526qh.class) {
                C124535yM r1 = r3.A06;
                r1.A02 = 14;
                r1.A06 = r5;
                r3.A0A();
            }
            return;
        }
        C143526qh r2 = (C143526qh) this.A00;
        C124535yM r12 = r2.A06;
        r12.A02 = 13;
        r12.A05 = (C144416s9) obj;
        r2.A0A();
    }
}
