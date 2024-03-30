package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.8Dx  reason: invalid class name and case insensitive filesystem */
public final class C170558Dx<E> extends C21884AcA<E> implements RandomAccess {
    public static final C170558Dx A02;
    public int A00;
    public Object[] A01;

    static {
        C170558Dx r0 = new C170558Dx(new Object[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    private final void A00(int i) {
        if (i < 0 || i >= this.A00) {
            throw C165617ti.A0W(C165567td.A0Z(C90524aI.A0h(35), i, this.A00));
        }
    }

    public final /* synthetic */ C23121B6b ByB(int i) {
        if (i >= this.A00) {
            return new C170558Dx(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw C165617ti.A0U();
    }

    public C170558Dx(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw C165617ti.A0W(C165567td.A0Z(C90524aI.A0h(35), i, this.A00));
        }
        Object[] objArr = this.A01;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.A01, i, objArr2, i + 1, this.A00 - i);
            this.A01 = objArr2;
        }
        this.A01[i] = obj;
        this.A00++;
        this.modCount++;
    }

    public final Object get(int i) {
        A00(i);
        return this.A01[i];
    }

    public final Object remove(int i) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        C165567td.A1J(objArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.A00;
    }

    public C170558Dx() {
        this(new Object[10], 0);
    }

    public final boolean add(Object obj) {
        A01();
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.A01 = objArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
