package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.0M3  reason: invalid class name */
public final class AnonymousClass0M3 extends C13330jh implements RandomAccess {
    public static final AnonymousClass0M3 A02;
    public int A00;
    public Object[] A01;

    static {
        AnonymousClass0M3 r0 = new AnonymousClass0M3(new Object[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public final int size() {
        return this.A00;
    }

    private final void A00(int i) {
        if (i < 0 || i >= this.A00) {
            int i2 = this.A00;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Index:");
            A0u.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0r(", Size:", A0u, i2));
        }
    }

    public final /* bridge */ /* synthetic */ C17850sA Byg(int i) {
        if (i >= this.A00) {
            return new AnonymousClass0M3(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw new IllegalArgumentException();
    }

    public AnonymousClass0M3(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            int i3 = this.A00;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Index:");
            A0u.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0r(", Size:", A0u, i3));
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
        int i2 = this.A00;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
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

    public AnonymousClass0M3() {
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
