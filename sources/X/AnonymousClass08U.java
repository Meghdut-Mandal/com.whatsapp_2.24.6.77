package X;

/* renamed from: X.08U  reason: invalid class name */
public class AnonymousClass08U implements AnonymousClass04S {
    public int A00 = -1;
    public final AnonymousClass04S A01;
    public final C001600r A02;

    public void BTH(Object obj) {
        int i = this.A00;
        int i2 = this.A02.A01;
        if (i != i2) {
            this.A00 = i2;
            this.A01.BTH(obj);
        }
    }

    public AnonymousClass08U(C001600r r2, AnonymousClass04S r3) {
        this.A02 = r2;
        this.A01 = r3;
    }
}
