package X;

/* renamed from: X.5VX  reason: invalid class name */
public class AnonymousClass5VX implements C23025B0v {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass5VX(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BXL(C200939iV r8, int i) {
        int i2 = i;
        if (this.A02 != 0) {
            AnonymousClass6LU r3 = (AnonymousClass6LU) this.A01;
            r3.A01.A0H(new C80513vW(this.A00, r3, r8, i2, 5));
            return;
        }
        ((C159197iy) this.A00).BXP(this.A01, i);
    }

    public void BiO(C21112A8x a8x, C200939iV r9) {
        C21112A8x a8x2 = a8x;
        if (this.A02 != 0) {
            AnonymousClass6LU r3 = (AnonymousClass6LU) this.A01;
            r3.A01.A0H(new C1503474x(this.A00, (Object) r3, (Object) r9, (Object) a8x2, 23));
            return;
        }
        ((C159197iy) this.A00).BiC(this.A01, a8x);
    }
}
