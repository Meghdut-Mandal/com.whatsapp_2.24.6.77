package X;

/* renamed from: X.9ob  reason: invalid class name and case insensitive filesystem */
public class C203709ob implements B1H {
    public Object A00;
    public Object A01;
    public final int A02;

    public C203709ob(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BWg(C202059ky r3) {
        if (this.A02 != 0) {
            ((C194739Ra) this.A01).A00(r3);
            return;
        }
        C194919Rt r1 = (C194919Rt) this.A01;
        if (C90504aG.A1Z(r1.A01)) {
            r1.A02.decrementAndGet();
            r1.A00.BWg(r3);
        }
    }

    public void BiD(String str) {
        if (this.A02 != 0) {
            C198279dC r4 = (C198279dC) this.A00;
            C29121Vk r7 = r4.A03;
            AnonymousClass1AL[] r2 = new AnonymousClass1AL[4];
            C36381kD.A1N("action", "pin-credential-check", r2);
            C165587tf.A1L("token", str, r2);
            C36351kA.A1N("credential-id", r4.A0A, r2);
            C36361kB.A1Q("device-id", r4.A09.A01(), r2);
            C203399nx A04 = C203399nx.A04("account", r2);
            Object obj = this.A01;
            r7.A0H(new B7J(r4.A00, r4.A02, r4.A01, r4, obj, 17), A04, "get", AnonymousClass6X5.A0L);
            return;
        }
        ((C194919Rt) this.A01).A00(0, str);
    }
}
