package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: X.6XV  reason: invalid class name */
public abstract class AnonymousClass6XV {
    public static int computeArrayListCapacity(int i) {
        C20080wz.checkNonnegative(i, "arraySize");
        return C129276Gg.A00(((long) i) + 5 + ((long) (i / 10)));
    }

    public static int indexOfImpl(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return indexOfRandomAccess(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C1897595l.A00(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int lastIndexOfImpl(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return lastIndexOfRandomAccess(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C1897595l.A00(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static boolean equalsImpl(List list, Object obj) {
        Objects.requireNonNull(list);
        if (obj != list) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                int size = list.size();
                if (size == list2.size()) {
                    if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
                        return C225414v.elementsEqual(list.iterator(), list2.iterator());
                    }
                    int i = 0;
                    while (i < size) {
                        if (C1897595l.A00(list.get(i), list2.get(i))) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static int indexOfRandomAccess(List list, Object obj) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOfRandomAccess(List list, Object obj) {
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return -1;
            }
        } while (!obj.equals(list.get(size)));
        return size;
    }

    public static ArrayList newArrayList(Object... objArr) {
        Objects.requireNonNull(objArr);
        ArrayList A14 = C36441kJ.A14(computeArrayListCapacity(objArr.length));
        Collections.addAll(A14, objArr);
        return A14;
    }

    public static ArrayList newArrayList() {
        return AnonymousClass001.A0I();
    }
}
