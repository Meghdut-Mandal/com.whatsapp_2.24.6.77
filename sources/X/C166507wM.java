package X;

/* renamed from: X.7wM  reason: invalid class name and case insensitive filesystem */
public final class C166507wM extends AYM {
    public final Object A00;

    public C166507wM(Object obj, int i) {
        super(i, 1);
        this.A00 = obj;
    }

    public Object previous() {
        if (hasPrevious()) {
            this.A00--;
            return this.A00;
        }
        throw C165617ti.A0e();
    }
}
