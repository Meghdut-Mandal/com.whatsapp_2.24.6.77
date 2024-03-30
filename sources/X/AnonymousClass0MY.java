package X;

/* renamed from: X.0MY  reason: invalid class name */
public final class AnonymousClass0MY extends AnonymousClass0MZ {
    public static final AnonymousClass0MZ A02 = new AnonymousClass0MY(new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;

    public final int A04() {
        return this.A01;
    }

    public final int A05() {
        return 0;
    }

    public final Object[] A08() {
        return this.A00;
    }

    public final int size() {
        return this.A01;
    }

    public final int A06(Object[] objArr, int i) {
        Object[] objArr2 = this.A00;
        int i2 = this.A01;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    public final Object get(int i) {
        C07320Xe.A01(i, this.A01);
        Object obj = this.A00[i];
        obj.getClass();
        return obj;
    }

    public AnonymousClass0MY(Object[] objArr, int i) {
        this.A00 = objArr;
        this.A01 = i;
    }
}
