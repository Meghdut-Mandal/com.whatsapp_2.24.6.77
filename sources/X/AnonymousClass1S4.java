package X;

/* renamed from: X.1S4  reason: invalid class name */
public final class AnonymousClass1S4 implements AnonymousClass04S {
    public C02680Bk A00;
    public final C19930wk A01;
    public final /* synthetic */ AnonymousClass08V A02;
    public final /* synthetic */ AnonymousClass08S A03;

    public AnonymousClass1S4(AnonymousClass08V r4, AnonymousClass08S r5, C28271Rz r6) {
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = new C19930wk(r6.A00, true);
    }

    public void BTH(Object obj) {
        C02680Bk r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
        C35771jE r1 = new C35771jE(this, obj);
        this.A00 = ((C598735p) r1.A00).A00;
        C19930wk r02 = this.A01;
        r02.A02();
        r02.execute(r1);
    }
}
