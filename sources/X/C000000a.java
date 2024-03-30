package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.00a  reason: invalid class name and case insensitive filesystem */
public final class C000000a<E> implements Collection<E>, Set<E>, AnonymousClass00Y, AnonymousClass00Z {
    public int A00;
    public int[] A01;
    public Object[] A02;

    public boolean addAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        int size = this.A00 + collection.size();
        int i = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < size) {
            Object[] objArr = this.A02;
            int[] iArr2 = new int[size];
            this.A01 = iArr2;
            this.A02 = new Object[size];
            if (i > 0) {
                AnonymousClass02Q.A03(0, 0, i, iArr, iArr2);
                AnonymousClass02Q.A05(objArr, 0, this.A02, 0, this.A00);
            }
        }
        if (this.A00 == i) {
            boolean z = false;
            for (Object add : collection) {
                z |= add(add);
            }
            return z;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() == set.size()) {
                try {
                    int i = this.A00;
                    int i2 = 0;
                    while (i2 < i) {
                        if (set.contains(this.A02[i2])) {
                            i2++;
                        }
                    }
                    return true;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        boolean z = false;
        for (int i = this.A00 - 1; -1 < i; i--) {
            if (!C007103b.A0j(collection, this.A02[i])) {
                A01(i);
                z = true;
            }
        }
        return z;
    }

    public final Object[] toArray(Object[] objArr) {
        AnonymousClass00C.A0D(objArr, 0);
        int i = this.A00;
        int length = objArr.length;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (length > i) {
            objArr[i] = null;
        }
        AnonymousClass02Q.A05(this.A02, 0, objArr, 0, this.A00);
        AnonymousClass00C.A08(objArr);
        return objArr;
    }

    public static final int A00(C000000a r4, Object obj, int i) {
        int i2 = r4.A00;
        if (i2 == 0) {
            return -1;
        }
        try {
            int A002 = AnonymousClass009.A00(r4.A01, i2, i);
            if (A002 < 0 || AnonymousClass00C.A0J(obj, r4.A02[A002])) {
                return A002;
            }
            int i3 = A002 + 1;
            while (i3 < i2 && r4.A01[i3] == i) {
                if (AnonymousClass00C.A0J(obj, r4.A02[i3])) {
                    return i3;
                }
                i3++;
            }
            do {
                A002--;
                if (A002 < 0 || r4.A01[A002] != i) {
                    return ~i3;
                }
            } while (!AnonymousClass00C.A0J(obj, r4.A02[A002]));
            return A002;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A01(int i) {
        int i2 = this.A00;
        Object[] objArr = this.A02;
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.A01;
        int length = iArr.length;
        int i4 = 8;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i5 = i + 1;
                int i6 = i3 + 1;
                System.arraycopy(iArr, i5, iArr, i, i6 - i5);
                Object[] objArr2 = this.A02;
                AnonymousClass02Q.A05(objArr2, i, objArr2, i5, i6);
            }
            this.A02[i3] = null;
        } else {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            int[] iArr2 = new int[i4];
            this.A01 = iArr2;
            this.A02 = new Object[i4];
            if (i > 0) {
                AnonymousClass02Q.A03(0, 0, i, iArr, iArr2);
                AnonymousClass02Q.A05(objArr, 0, this.A02, 0, i);
            }
            if (i < i3) {
                int i7 = i + 1;
                int i8 = i3 + 1;
                AnonymousClass02Q.A03(i, i7, i8, iArr, this.A01);
                AnonymousClass02Q.A05(objArr, i, this.A02, i7, i8);
            }
        }
        if (i2 == this.A00) {
            this.A00 = i3;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean add(Object obj) {
        int hashCode;
        int A002;
        int i = this.A00;
        if (obj == null) {
            A002 = A00(this, (Object) null, 0);
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A002 = A00(this, obj, hashCode);
        }
        if (A002 >= 0) {
            return false;
        }
        int i2 = ~A002;
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            int i3 = 4;
            if (i >= 8) {
                i3 = (i >> 1) + i;
            } else if (i >= 4) {
                i3 = 8;
            }
            Object[] objArr = this.A02;
            int[] iArr2 = new int[i3];
            this.A01 = iArr2;
            this.A02 = new Object[i3];
            if (i != this.A00) {
                throw new ConcurrentModificationException();
            } else if (i3 != 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                AnonymousClass02Q.A05(objArr, 0, this.A02, 0, objArr.length);
            }
        }
        if (i2 < i) {
            int[] iArr3 = this.A01;
            int i4 = i2 + 1;
            AnonymousClass02Q.A03(i4, i2, i, iArr3, iArr3);
            Object[] objArr2 = this.A02;
            AnonymousClass02Q.A05(objArr2, i4, objArr2, i2, i);
        }
        int i5 = this.A00;
        if (i == i5) {
            int[] iArr4 = this.A01;
            if (i2 < iArr4.length) {
                iArr4[i2] = hashCode;
                this.A02[i2] = obj;
                this.A00 = i5 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        if (this.A00 != 0) {
            int[] iArr = AnonymousClass009.A00;
            AnonymousClass00C.A0D(iArr, 0);
            this.A01 = iArr;
            Object[] objArr = AnonymousClass009.A02;
            AnonymousClass00C.A0D(objArr, 0);
            this.A02 = objArr;
            this.A00 = 0;
        }
    }

    public boolean contains(Object obj) {
        int A002;
        if (obj == null) {
            A002 = A00(this, (Object) null, 0);
        } else {
            A002 = A00(this, obj, obj.hashCode());
        }
        if (A002 >= 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public boolean isEmpty() {
        if (this.A00 <= 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new AnonymousClass010(this);
    }

    public boolean remove(Object obj) {
        int A002;
        if (obj == null) {
            A002 = A00(this, (Object) null, 0);
        } else {
            A002 = A00(this, obj, obj.hashCode());
        }
        if (A002 < 0) {
            return false;
        }
        A01(A002);
        return true;
    }

    public C000000a(int i) {
        this.A01 = AnonymousClass009.A00;
        this.A02 = AnonymousClass009.A02;
        if (i > 0) {
            this.A01 = new int[i];
            this.A02 = new Object[i];
        }
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i * 14);
        sb.append('{');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.A02[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String obj2 = sb.toString();
        AnonymousClass00C.A08(obj2);
        return obj2;
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    public C000000a() {
        this(0);
    }

    public final Object[] toArray() {
        Object[] objArr = this.A02;
        int i = this.A00;
        AnonymousClass00C.A0D(objArr, 0);
        AnonymousClass02O.A00(i, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i);
        AnonymousClass00C.A08(copyOfRange);
        return copyOfRange;
    }
}
