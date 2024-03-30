package X;

/* renamed from: X.4ZZ  reason: invalid class name */
public class AnonymousClass4ZZ implements C88024Rc {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C61943Ec B41(int i) {
        switch (this.A01) {
            case 0:
                AnonymousClass4ZZ r2 = this;
                return new C61943Ec((C21010yW) ((C27121Mz) r2.A00).A01.A79.get(), ((C27121Mz) r2.A00).A01.A00.A95(), i);
            case 1:
                AnonymousClass4ZZ r22 = this;
                return new C61943Ec((C21010yW) ((AnonymousClass1U2) r22.A00).A00.A79.get(), ((AnonymousClass1U2) r22.A00).A00.A00.A95(), i);
            default:
                return null;
        }
    }
}
