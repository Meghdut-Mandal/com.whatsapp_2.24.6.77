package X;

/* renamed from: X.7wN  reason: invalid class name and case insensitive filesystem */
public final class C166517wN extends AYM {
    public final C166527wO A00;
    public final Object[] A01;

    public C166517wN(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2);
        this.A01 = objArr2;
        int i4 = (i2 - 1) & -32;
        this.A00 = new C166527wO(objArr, i > i4 ? i4 : i, i4, i3);
    }

    public Object previous() {
        if (hasPrevious()) {
            int i = this.A00;
            C166527wO r1 = this.A00;
            int i2 = r1.A01;
            if (i > i2) {
                Object[] objArr = this.A01;
                int i3 = i - 1;
                this.A00 = i3;
                return objArr[i3 - i2];
            }
            this.A00 = i - 1;
            return r1.previous();
        }
        throw C165617ti.A0e();
    }
}
