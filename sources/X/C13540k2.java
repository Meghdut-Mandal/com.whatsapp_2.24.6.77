package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.0k2  reason: invalid class name and case insensitive filesystem */
public final class C13540k2<E> extends AnonymousClass02f<E> implements List<E>, RandomAccess, Serializable, C004902e {
    public static final C13540k2 A00;
    public Object[] array;
    public final C13540k2 backing;
    public boolean isReadOnly;
    public int length;
    public int offset;
    public final C13540k2 root;

    static {
        C13540k2 r1 = new C13540k2(0);
        r1.isReadOnly = true;
        A00 = r1;
    }

    public boolean addAll(int i, Collection collection) {
        AnonymousClass00C.A0D(collection, 1);
        A08(this);
        A03();
        AnonymousClass0YP.A02(i, this.length);
        int size = collection.size();
        A07(collection, this.offset + i, size);
        return AnonymousClass000.A1R(size);
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public boolean removeAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        A08(this);
        A03();
        if (A00(collection, this.offset, this.length, false) > 0) {
            return true;
        }
        return false;
    }

    public boolean retainAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        A08(this);
        A03();
        if (A00(collection, this.offset, this.length, true) <= 0) {
            return false;
        }
        return true;
    }

    public List subList(int i, int i2) {
        AnonymousClass0YP.A03(i, i2, this.length);
        Object[] objArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.isReadOnly;
        C13540k2 r2 = this.root;
        if (r2 == null) {
            r2 = this;
        }
        return new C13540k2(this, r2, objArr, i3, i4, z);
    }

    public Object[] toArray(Object[] objArr) {
        AnonymousClass00C.A0D(objArr, 0);
        A03();
        int length2 = objArr.length;
        int i = this.length;
        Object[] objArr2 = this.array;
        if (length2 < i) {
            int i2 = this.offset;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            AnonymousClass00C.A08(copyOfRange);
            return copyOfRange;
        }
        int i3 = this.offset;
        AnonymousClass02Q.A05(objArr2, 0, objArr, i3, i + i3);
        int i4 = this.length;
        if (i4 >= length2) {
            return objArr;
        }
        objArr[i4] = null;
        return objArr;
    }

    public C13540k2(int i) {
        this((C13540k2) null, (C13540k2) null, new Object[i], 0, 0, false);
    }

    private final int A00(Collection collection, int i, int i2, boolean z) {
        int i3;
        C13540k2 r0 = this.backing;
        if (r0 != null) {
            i3 = r0.A00(collection, i, i2, z);
        } else {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = i + i4;
                if (collection.contains(this.array[i6]) == z) {
                    Object[] objArr = this.array;
                    i4++;
                    objArr[i5 + i] = objArr[i6];
                    i5++;
                } else {
                    i4++;
                }
            }
            i3 = i2 - i5;
            Object[] objArr2 = this.array;
            AnonymousClass02Q.A05(objArr2, i + i5, objArr2, i2 + i, this.length);
            Object[] objArr3 = this.array;
            int i7 = this.length;
            C05580Qg.A00(objArr3, i7 - i3, i7);
        }
        if (i3 > 0) {
            this.modCount++;
        }
        this.length -= i3;
        return i3;
    }

    private final Object A02(int i) {
        this.modCount++;
        C13540k2 r0 = this.backing;
        if (r0 != null) {
            this.length--;
            return r0.A02(i);
        }
        Object[] objArr = this.array;
        Object obj = objArr[i];
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr, i, (this.offset + this.length) - i2);
        Object[] objArr2 = this.array;
        AnonymousClass00C.A0D(objArr2, 0);
        objArr2[(this.offset + this.length) - 1] = null;
        this.length--;
        return obj;
    }

    private final void A03() {
        C13540k2 r0 = this.root;
        if (r0 != null && r0.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void A04(int i, int i2) {
        int i3 = this.length + i2;
        if (i3 >= 0) {
            Object[] objArr = this.array;
            int length2 = objArr.length;
            if (i3 > length2) {
                objArr = AnonymousClass00C.A0K(objArr, AnonymousClass0YP.A00(length2, i3));
                this.array = objArr;
            }
            System.arraycopy(objArr, i, objArr, i + i2, (this.offset + this.length) - i);
            this.length += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void A05(int i, int i2) {
        if (i2 > 0) {
            this.modCount++;
        }
        C13540k2 r0 = this.backing;
        if (r0 != null) {
            r0.A05(i, i2);
        } else {
            Object[] objArr = this.array;
            AnonymousClass02Q.A05(objArr, i, objArr, i + i2, this.length);
            Object[] objArr2 = this.array;
            int i3 = this.length;
            C05580Qg.A00(objArr2, i3 - i2, i3);
        }
        this.length -= i2;
    }

    private final void A06(int i, Object obj) {
        this.modCount++;
        C13540k2 r1 = this.backing;
        if (r1 != null) {
            r1.A06(i, obj);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        A04(i, 1);
        this.array[i] = obj;
    }

    private final void A07(Collection collection, int i, int i2) {
        this.modCount++;
        C13540k2 r0 = this.backing;
        if (r0 != null) {
            r0.A07(collection, i, i2);
            this.array = this.backing.array;
            this.length += i2;
            return;
        }
        A04(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.array[i + i3] = it.next();
        }
    }

    public static final void A08(C13540k2 r1) {
        C13540k2 r0;
        if (r1.isReadOnly || ((r0 = r1.root) != null && r0.isReadOnly)) {
            throw AnonymousClass001.A0D();
        }
    }

    private final Object writeReplace() {
        C13540k2 r0;
        if (this.isReadOnly || ((r0 = this.root) != null && r0.isReadOnly)) {
            return new C10760fB(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public int A0K() {
        A03();
        return this.length;
    }

    public Object A0L(int i) {
        A08(this);
        A03();
        AnonymousClass0YP.A01(i, this.length);
        return A02(this.offset + i);
    }

    public void add(int i, Object obj) {
        A08(this);
        A03();
        AnonymousClass0YP.A02(i, this.length);
        A06(this.offset + i, obj);
    }

    public void clear() {
        A08(this);
        A03();
        A05(this.offset, this.length);
    }

    public boolean equals(Object obj) {
        A03();
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        Object[] objArr = this.array;
        int i = this.offset;
        int i2 = this.length;
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!AnonymousClass00C.A0J(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        A03();
        AnonymousClass0YP.A01(i, this.length);
        return this.array[this.offset + i];
    }

    public int hashCode() {
        A03();
        Object[] objArr = this.array;
        int i = this.offset;
        int i2 = this.length;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + AnonymousClass000.A0J(objArr[i + i4]);
        }
        return i3;
    }

    public int indexOf(Object obj) {
        A03();
        for (int i = 0; i < this.length; i++) {
            if (AnonymousClass00C.A0J(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        A03();
        return AnonymousClass000.A1Q(this.length);
    }

    public int lastIndexOf(Object obj) {
        A03();
        int i = this.length;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
        } while (!AnonymousClass00C.A0J(this.array[this.offset + i], obj));
        return i;
    }

    public ListIterator listIterator(int i) {
        A03();
        AnonymousClass0YP.A02(i, this.length);
        return new C12430i2(this, i);
    }

    public boolean remove(Object obj) {
        A08(this);
        A03();
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public Object set(int i, Object obj) {
        A08(this);
        A03();
        AnonymousClass0YP.A01(i, this.length);
        Object[] objArr = this.array;
        int i2 = this.offset + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public String toString() {
        A03();
        Object[] objArr = this.array;
        int i = this.offset;
        int i2 = this.length;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        String A0q = AnonymousClass000.A0q("]", sb);
        AnonymousClass00C.A08(A0q);
        return A0q;
    }

    public C13540k2(C13540k2 r2, C13540k2 r3, Object[] objArr, int i, int i2, boolean z) {
        this.array = objArr;
        this.offset = i;
        this.length = i2;
        this.isReadOnly = z;
        this.backing = r2;
        this.root = r3;
        if (r2 != null) {
            this.modCount = r2.modCount;
        }
    }

    public boolean add(Object obj) {
        A08(this);
        A03();
        A06(this.offset + this.length, obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        A08(this);
        A03();
        int size = collection.size();
        A07(collection, this.offset + this.length, size);
        return AnonymousClass000.A1R(size);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public Object[] toArray() {
        A03();
        Object[] objArr = this.array;
        int i = this.offset;
        int i2 = this.length + i;
        AnonymousClass00C.A0D(objArr, 0);
        AnonymousClass02O.A00(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        AnonymousClass00C.A08(copyOfRange);
        return copyOfRange;
    }

    public C13540k2() {
        this(10);
    }
}
