package X;

/* renamed from: X.7ob  reason: invalid class name and case insensitive filesystem */
public class C162447ob extends C137276fs {
    public Object A00;
    public final int A01;

    public C162447ob(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public int hashCode() {
        Object obj;
        int i = this.A01;
        Object obj2 = this.A00;
        if (i != 0) {
            obj = ((C135616cz) obj2).A02;
        } else {
            obj = ((C137346fz) obj2).A01;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        return C36361kB.A1a(obj, this);
    }
}
