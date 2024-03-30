package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.0MZ  reason: invalid class name */
public abstract class AnonymousClass0MZ extends C13310jf implements List, RandomAccess {
    public static final C04930Mo A00 = new C04920Mn(AnonymousClass0MY.A02, 0);

    public static AnonymousClass0MZ A00(Object[] objArr) {
        if (objArr.length != 0) {
            Object[] objArr2 = (Object[]) objArr.clone();
            int length = objArr2.length;
            int i = 0;
            while (i < length) {
                if (objArr2[i] != null) {
                    i++;
                } else {
                    throw AnonymousClass001.A0A(AnonymousClass000.A0r("at index ", AnonymousClass000.A0u(), i));
                }
            }
            if (length != 0) {
                return new AnonymousClass0MY(objArr2, length);
            }
        }
        return AnonymousClass0MY.A02;
    }

    public static AnonymousClass0MY A01(Object obj) {
        Object[] objArr = {obj};
        if (objArr[0] != null) {
            return new AnonymousClass0MY(objArr, 1);
        }
        throw AnonymousClass001.A0A(AnonymousClass000.A0r("at index ", AnonymousClass000.A0u(), 0));
    }

    public final C12200hf A07() {
        return listIterator(0);
    }

    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    if (hasNext) {
                        if (!hasNext2 || ((next = it.next()) != (next2 = it2.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!hasNext2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (obj.equals(get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj != null) {
            int size = size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!obj.equals(get(size)));
            return size;
        }
        return -1;
    }

    public int A06(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public AnonymousClass0MZ A09() {
        if (size() <= 1) {
            return this;
        }
        return new AnonymousClass0MX(this);
    }

    /* renamed from: A0A */
    public AnonymousClass0MZ subList(int i, int i2) {
        C07320Xe.A02(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return AnonymousClass0MY.A02;
        }
        return new AnonymousClass0MW(this, i, i3);
    }

    /* renamed from: A0B */
    public final C04930Mo listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(C07320Xe.A00(i, size, "index"));
        } else if (isEmpty()) {
            return A00;
        } else {
            return new C04920Mn(this, i);
        }
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw AnonymousClass001.A0D();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Deprecated
    public final Object remove(int i) {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw AnonymousClass001.A0D();
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }
}
