package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: X.03b  reason: invalid class name and case insensitive filesystem */
public abstract class C007103b extends C007003a {
    public static final Object A0H(Iterable iterable) {
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof List) {
            return A0L((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object A0I(Iterable iterable) {
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
        } else {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                return it.next();
            }
        }
        return null;
    }

    public static final Object A0J(Iterable iterable) {
        Object next;
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof List) {
            return A0N((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final Object A0K(Iterable iterable, int i) {
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        C14590ls r3 = new C14590ls(i);
        if (i >= 0) {
            int i2 = 0;
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return next;
                }
                i2 = i3;
            }
        }
        r3.invoke(Integer.valueOf(i));
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static final Object A0L(List list) {
        AnonymousClass00C.A0D(list, 0);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A0M(List list) {
        AnonymousClass00C.A0D(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object A0N(List list) {
        AnonymousClass00C.A0D(list, 0);
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A0O(List list) {
        AnonymousClass00C.A0D(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Object A0P(List list, int i) {
        AnonymousClass00C.A0D(list, 0);
        if (i < 0 || i > list.size() - 1) {
            return null;
        }
        return list.get(i);
    }

    public static final String A0Q(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Iterable iterable, C006302t r9) {
        AnonymousClass00C.A0D(iterable, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int i = 0;
        for (Object next : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AnonymousClass090.A00(sb, next, r9);
        }
        sb.append(charSequence3);
        String obj = sb.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public static final ArrayList A0S(Iterable iterable, Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        AnonymousClass00C.A0D(iterable, 1);
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        AnonymousClass03Y.A0B(iterable, arrayList2);
        return arrayList2;
    }

    public static final ArrayList A0T(Object obj, Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final HashSet A0U(Iterable iterable) {
        AnonymousClass00C.A0D(iterable, 0);
        HashSet hashSet = new HashSet(C000300d.A02(AnonymousClass03U.A06(iterable, 12)));
        A0i(iterable, hashSet);
        return hashSet;
    }

    public static final List A0V(Iterable iterable) {
        AnonymousClass00C.A0D(iterable, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final List A0W(Iterable iterable) {
        AnonymousClass00C.A0D(iterable, 0);
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return A0Y(iterable);
        }
        List A0Z = A0Z(iterable);
        AnonymousClass00C.A0D(A0Z, 0);
        Collections.reverse(A0Z);
        return A0Z;
    }

    public static final List A0X(Iterable iterable) {
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A0Y(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            AnonymousClass00C.A0D(array, 0);
            if (array.length > 1) {
                Arrays.sort(array);
            }
            List asList = Arrays.asList(array);
            AnonymousClass00C.A08(asList);
            return asList;
        }
        List A0Z = A0Z(iterable);
        AnonymousClass00C.A0D(A0Z, 0);
        if (A0Z.size() <= 1) {
            return A0Z;
        }
        Collections.sort(A0Z);
        return A0Z;
    }

    public static final List A0Y(Iterable iterable) {
        Object obj;
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                } else {
                    obj = iterable.iterator().next();
                }
            }
            return C023409w.A00;
        }
        List A0Z = A0Z(iterable);
        AnonymousClass00C.A0D(A0Z, 0);
        int size2 = A0Z.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return A0Z;
            }
            obj = A0Z.get(0);
        }
        return C023409w.A00;
        List singletonList = Collections.singletonList(obj);
        AnonymousClass00C.A08(singletonList);
        return singletonList;
    }

    public static final List A0a(Iterable iterable, int i) {
        Object obj;
        AnonymousClass00C.A0D(iterable, 0);
        int i2 = 0;
        if (i >= 0) {
            if (i != 0) {
                if (iterable instanceof Collection) {
                    if (i >= ((Collection) iterable).size()) {
                        return A0Y(iterable);
                    }
                    if (i == 1) {
                        obj = A0H(iterable);
                        List singletonList = Collections.singletonList(obj);
                        AnonymousClass00C.A08(singletonList);
                        return singletonList;
                    }
                }
                ArrayList arrayList = new ArrayList(i);
                for (Object add : iterable) {
                    arrayList.add(add);
                    i2++;
                    if (i2 == i) {
                        break;
                    }
                }
                int size = arrayList.size();
                if (size != 0) {
                    if (size != 1) {
                        return arrayList;
                    }
                    obj = arrayList.get(0);
                    List singletonList2 = Collections.singletonList(obj);
                    AnonymousClass00C.A08(singletonList2);
                    return singletonList2;
                }
            }
            return C023409w.A00;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested element count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final List A0b(Iterable iterable, Object obj) {
        AnonymousClass00C.A0D(iterable, 0);
        ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(iterable, 10));
        boolean z = false;
        for (Object next : iterable) {
            if (z || !AnonymousClass00C.A0J(next, obj)) {
                arrayList.add(next);
            } else {
                z = true;
            }
        }
        return arrayList;
    }

    public static final List A0c(Iterable iterable, Comparator comparator) {
        AnonymousClass00C.A0D(iterable, 0);
        AnonymousClass00C.A0D(comparator, 1);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A0Y(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            AnonymousClass00C.A0D(array, 0);
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List asList = Arrays.asList(array);
            AnonymousClass00C.A08(asList);
            return asList;
        }
        List A0Z = A0Z(iterable);
        AnonymousClass03X.A08(A0Z, comparator);
        return A0Z;
    }

    public static final List A0d(List list, int i) {
        int size = list.size();
        if (i >= size) {
            return A0Y(list);
        }
        if (i == 1) {
            List singletonList = Collections.singletonList(A0N(list));
            AnonymousClass00C.A08(singletonList);
            return singletonList;
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final Set A0e(Iterable iterable) {
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        A0i(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final Set A0f(Iterable iterable) {
        Object obj;
        Iterator it;
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C000300d.A02(collection.size()));
                    A0i(iterable, linkedHashSet);
                    return linkedHashSet;
                } else if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                    Set singleton = Collections.singleton(obj);
                    AnonymousClass00C.A08(singleton);
                    return singleton;
                } else {
                    it = iterable.iterator();
                }
            }
            return C004702c.A00;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        A0i(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            it = linkedHashSet2.iterator();
        }
        return C004702c.A00;
        obj = it.next();
        Set singleton2 = Collections.singleton(obj);
        AnonymousClass00C.A08(singleton2);
        return singleton2;
    }

    public static final Set A0g(Iterable iterable, Iterable iterable2) {
        AnonymousClass00C.A0D(iterable, 0);
        Set A0e = A0e(iterable);
        AnonymousClass00C.A0D(A0e, 0);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = A0Y(iterable2);
        }
        A0e.retainAll((Collection) iterable2);
        return A0e;
    }

    public static final Set A0h(Iterable iterable, Iterable iterable2) {
        AnonymousClass00C.A0D(iterable, 0);
        Set A0e = A0e(iterable);
        AnonymousClass00C.A0D(A0e, 0);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = A0Y(iterable2);
        }
        A0e.removeAll((Collection) iterable2);
        return A0e;
    }

    public static final void A0i(Iterable iterable, Collection collection) {
        AnonymousClass00C.A0D(iterable, 0);
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    public static final boolean A0j(Iterable iterable, Object obj) {
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            int i = 0;
            for (Object next : iterable) {
                if (i < 0) {
                    AnonymousClass03T.A05();
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                } else if (AnonymousClass00C.A0J(obj, next)) {
                    return true;
                } else {
                    i++;
                }
            }
            return false;
        } else if (((List) iterable).indexOf(obj) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean A0k(Iterable iterable, C006302t r5) {
        AnonymousClass00C.A0D(iterable, 0);
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (Object invoke : iterable) {
                if (((Boolean) r5.invoke(invoke)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final byte[] A0l(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final int[] A0m(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static final long[] A0n(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final ArrayList A0R(Iterable iterable, int i, int i2) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator A00 = C05570Qf.A00(iterable.iterator(), i, i2);
            while (A00.hasNext()) {
                arrayList.add(A00.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i3 = size / i2;
        int i4 = 1;
        if (size % i2 == 0) {
            i4 = 0;
        }
        ArrayList arrayList2 = new ArrayList(i3 + i4);
        int i5 = 0;
        while (i5 < size) {
            int i6 = size - i5;
            int i7 = i;
            if (i > i6) {
                i7 = i6;
            }
            ArrayList arrayList3 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList3.add(list.get(i8 + i5));
            }
            arrayList2.add(arrayList3);
            i5 += i2;
            if (i5 < 0) {
                break;
            }
        }
        return arrayList2;
    }

    public static final List A0Z(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            AnonymousClass00C.A0D(collection, 0);
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        A0i(iterable, arrayList);
        return arrayList;
    }
}
