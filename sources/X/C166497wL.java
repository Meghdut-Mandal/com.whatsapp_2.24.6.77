package X;

/* renamed from: X.7wL  reason: invalid class name and case insensitive filesystem */
public final class C166497wL extends AYM {
    public final Object[] A00;

    public C166497wL(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.A00 = objArr;
    }

    public Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.A00;
            int i = this.A00 - 1;
            this.A00 = i;
            return objArr[i];
        }
        throw C165617ti.A0e();
    }
}
