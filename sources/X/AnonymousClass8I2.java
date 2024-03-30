package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.8I2  reason: invalid class name */
public final class AnonymousClass8I2<E> extends C21886AcE<E> implements RandomAccess {
    public static final AnonymousClass8I2 A02;
    public int A00;
    public Object[] A01;

    static {
        AnonymousClass8I2 r0 = new AnonymousClass8I2(new Object[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    private void A00(int i) {
        if (i < 0 || i >= this.A00) {
            throw C165617ti.A0W(C36381kD.A10(C165587tf.A0i(i), this.A00));
        }
    }

    public /* bridge */ /* synthetic */ C23122B6c BQ1(int i) {
        if (i >= this.A00) {
            return new AnonymousClass8I2(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw C165617ti.A0U();
    }

    public AnonymousClass8I2(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }

    public void add(int i, Object obj) {
        int i2;
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw C165617ti.A0W(C36381kD.A10(C165587tf.A0i(i), this.A00));
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

    public Object get(int i) {
        A00(i);
        return this.A01[i];
    }

    public Object remove(int i) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        C165567td.A1J(objArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return obj;
    }

    public Object set(int i, Object obj) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public int size() {
        return this.A00;
    }

    public AnonymousClass8I2() {
        this(new Object[10], 0);
    }

    public boolean add(Object obj) {
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
