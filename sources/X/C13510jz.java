package X;

import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: X.0jz  reason: invalid class name and case insensitive filesystem */
public final class C13510jz<T> extends C001100m<T> implements RandomAccess {
    public int A00;
    public int A01;
    public final int A02;
    public final Object[] A03;

    public C13510jz(Object[] objArr, int i) {
        AnonymousClass00C.A0D(objArr, 1);
        this.A03 = objArr;
        if (i >= 0) {
            int length = objArr.length;
            if (i <= length) {
                this.A02 = length;
                this.A00 = i;
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ring buffer filled size: ");
            A0u.append(i);
            throw AnonymousClass000.A0d(" cannot be larger than the buffer size: ", A0u, length);
        }
        throw AnonymousClass000.A0d("ring buffer filled size should not be negative but it is ", AnonymousClass000.A0u(), i);
    }

    public final void A09(int i) {
        if (i < 0) {
            throw AnonymousClass000.A0d("n shouldn't be negative but it is ", AnonymousClass000.A0u(), i);
        } else if (i > size()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("n shouldn't be greater than the buffer size: n = ");
            A0u.append(i);
            A0u.append(", size = ");
            A0u.append(size());
            throw AnonymousClass000.A0b(A0u);
        } else if (i > 0) {
            int i2 = this.A01;
            int i3 = this.A02;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.A03;
            if (i2 > i4) {
                AnonymousClass02Q.A04(objArr, i2, i3);
                AnonymousClass02Q.A04(objArr, 0, i4);
            } else {
                AnonymousClass02Q.A04(objArr, i2, i4);
            }
            this.A01 = i4;
            this.A00 = size() - i;
        }
    }

    public Object[] toArray(Object[] objArr) {
        AnonymousClass00C.A0D(objArr, 0);
        if (objArr.length < size()) {
            objArr = AnonymousClass00C.A0K(objArr, size());
        }
        int size = size();
        int i = this.A01;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.A02) {
            objArr[i3] = this.A03[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = this.A03[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    public Iterator iterator() {
        return new C13470jv(this);
    }

    public Object get(int i) {
        AnonymousClass0YP.A01(i, size());
        return this.A03[(this.A01 + i) % this.A02];
    }

    public int A08() {
        return this.A00;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
