package X;

import java.util.Arrays;
import java.util.ListIterator;

/* renamed from: X.7wQ  reason: invalid class name and case insensitive filesystem */
public final class C166547wQ<E> extends C21920Acq<E> implements C162217oE<E> {
    public static final C166547wQ A01 = new C166547wQ(C90524aI.A0w());
    public final Object[] A00;

    public int A08() {
        return this.A00.length;
    }

    public C21921Acr B27() {
        return new C21921Acr(this, (Object[]) null, this.A00, 0);
    }

    public B6U Bnf(C006302t r9) {
        Object[] objArr = this.A00;
        Object[] objArr2 = objArr;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr2[i];
            if (C90464aC.A1Y(obj, r9)) {
                if (!z) {
                    objArr = AnonymousClass00C.A0K(objArr2, objArr2.length);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return A01;
        }
        AnonymousClass02O.A00(size, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, size);
        AnonymousClass00C.A08(copyOfRange);
        return new C166547wQ(copyOfRange);
    }

    public int indexOf(Object obj) {
        return AnonymousClass02R.A07(obj, this.A00);
    }

    public int lastIndexOf(Object obj) {
        int i;
        int i2;
        Object[] objArr = this.A00;
        int length = objArr.length - 1;
        if (obj == null) {
            if (length >= 0) {
                do {
                    i2 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    length = i2;
                } while (i2 >= 0);
            }
        } else if (length >= 0) {
            do {
                i = length - 1;
                if (obj.equals(objArr[length])) {
                    return length;
                }
                length = i;
            } while (i >= 0);
        }
        return -1;
    }

    public C166547wQ(Object[] objArr) {
        this.A00 = objArr;
    }

    public B6U B0B(Object obj) {
        if (size() < 32) {
            Object[] A0K = AnonymousClass00C.A0K(this.A00, size() + 1);
            A0K[size()] = obj;
            return new C166547wQ(A0K);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return new C166557wR(this.A00, objArr, size() + 1, 0);
    }

    public B6U B0E(Object obj, int i) {
        AnonymousClass9Yn.A01(i, size());
        if (i == size()) {
            return B0B(obj);
        }
        if (size() < 32) {
            Object[] objArr = new Object[(size() + 1)];
            Object[] objArr2 = this.A00;
            AnonymousClass02Q.A05(objArr2, 0, objArr, 0, i);
            AnonymousClass02Q.A05(objArr2, i + 1, objArr, i, size());
            objArr[i] = obj;
            return new C166547wQ(objArr);
        }
        Object[] objArr3 = this.A00;
        Object[] A0K = AnonymousClass00C.A0K(objArr3, objArr3.length);
        System.arraycopy(objArr3, i, A0K, i + 1, (size() - 1) - i);
        A0K[i] = obj;
        Object obj2 = objArr3[31];
        Object[] objArr4 = new Object[32];
        objArr4[0] = obj2;
        return new C166557wR(A0K, objArr4, size() + 1, 0);
    }

    public B6U Bni(int i) {
        AnonymousClass9Yn.A00(i, size());
        if (size() == 1) {
            return A01;
        }
        Object[] objArr = this.A00;
        Object[] A0K = AnonymousClass00C.A0K(objArr, size() - 1);
        AnonymousClass02Q.A05(objArr, i, A0K, i + 1, size());
        return new C166547wQ(A0K);
    }

    public B6U Bq2(Object obj, int i) {
        AnonymousClass9Yn.A00(i, size());
        Object[] objArr = this.A00;
        Object[] A0K = AnonymousClass00C.A0K(objArr, objArr.length);
        A0K[i] = obj;
        return new C166547wQ(A0K);
    }

    public Object get(int i) {
        AnonymousClass9Yn.A00(i, size());
        return this.A00[i];
    }

    public ListIterator listIterator(int i) {
        AnonymousClass9Yn.A01(i, size());
        return new C166497wL(this.A00, i, size());
    }
}
