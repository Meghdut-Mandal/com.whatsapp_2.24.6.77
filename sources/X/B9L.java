package X;

public class B9L implements C22863AxF {
    public Object A00;
    public final int A01;

    public B9L(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BmS(C20984A1y a1y) {
        if (this.A01 != 0) {
            ((AnonymousClass83Y) this.A00).A00 = a1y;
            return;
        }
        AnonymousClass83Z r1 = (AnonymousClass83Z) this.A00;
        r1.A01 = a1y;
        a1y.A02 = r1.A02;
        a1y.A03 = r1.A03;
        r1.A00.A00 = a1y;
    }
}
