package X;

/* renamed from: X.7e5  reason: invalid class name */
public class AnonymousClass7e5 implements C23020B0q {
    public Object A00;
    public final int A01;

    public AnonymousClass7e5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BVk(C207109uZ r4) {
        if (this.A01 != 0) {
            ((AnonymousClass7hL) this.A00).Ba6(C36361kB.A0j());
            return;
        }
        C120065qu r2 = (C120065qu) this.A00;
        r2.A00.A01 = "direct_connection";
        r2.A01.countDown();
    }

    public void Bbk(C207109uZ r4) {
        if (this.A01 != 0) {
            AnonymousClass7hL r1 = (AnonymousClass7hL) this.A00;
            Integer num = null;
            if (r4 != null) {
                num = C36371kC.A0n();
            }
            r1.Ba6(num);
            return;
        }
        C120065qu r2 = (C120065qu) this.A00;
        r2.A00.A01 = "non_direct_connection";
        r2.A01.countDown();
    }
}
