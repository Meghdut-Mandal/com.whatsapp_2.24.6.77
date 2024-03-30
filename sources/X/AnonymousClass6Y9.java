package X;

/* renamed from: X.6Y9  reason: invalid class name */
public class AnonymousClass6Y9 implements C158787iE {
    public Object A00;
    public final int A01;

    public AnonymousClass6Y9(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void B5s(C161537n4 r3) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C130596Lr r1 = (C130596Lr) obj;
            r1.A01--;
            return;
        }
        C136916fF r12 = (C136916fF) obj;
        r12.A00--;
    }

    public void BuK(C161537n4 r3) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ((C130596Lr) obj).A01++;
            return;
        }
        ((C136916fF) obj).A00++;
    }
}
