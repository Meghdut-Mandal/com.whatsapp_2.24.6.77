package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.9nW  reason: invalid class name and case insensitive filesystem */
public abstract class C203199nW {
    public static boolean equalsImpl(B6T b6t, Object obj) {
        if (obj != b6t) {
            if (obj instanceof B6T) {
                B6T b6t2 = (B6T) obj;
                if (b6t.size() == b6t2.size() && b6t.entrySet().size() == b6t2.entrySet().size()) {
                    for (AnonymousClass9Y5 r2 : b6t2.entrySet()) {
                        if (b6t.count(r2.getElement()) != r2.getCount()) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean addAllImpl(B6T b6t, B6T b6t2) {
        if (b6t2 instanceof AnonymousClass8HU) {
            return addAllImpl(b6t, (AnonymousClass8HU) b6t2);
        }
        if (b6t2.isEmpty()) {
            return false;
        }
        for (AnonymousClass9Y5 r0 : b6t2.entrySet()) {
            b6t.add(r0.getElement(), r0.getCount());
        }
        return true;
    }

    public static boolean removeAllImpl(B6T b6t, Collection collection) {
        if (collection instanceof B6T) {
            collection = ((B6T) collection).elementSet();
        }
        return b6t.elementSet().removeAll(collection);
    }

    public static Iterator iteratorImpl(B6T b6t) {
        return new AY3(b6t, b6t.entrySet().iterator());
    }

    public static boolean retainAllImpl(B6T b6t, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof B6T) {
            collection = ((B6T) collection).elementSet();
        }
        return b6t.elementSet().retainAll(collection);
    }

    public static B6T cast(Iterable iterable) {
        return (B6T) iterable;
    }

    public static boolean addAllImpl(B6T b6t, AnonymousClass8HU r2) {
        if (r2.isEmpty()) {
            return false;
        }
        r2.addTo(b6t);
        return true;
    }

    public static boolean addAllImpl(B6T b6t, Collection collection) {
        Objects.requireNonNull(b6t);
        Objects.requireNonNull(collection);
        if (collection instanceof B6T) {
            return addAllImpl(b6t, cast(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C225414v.addAll(b6t, collection.iterator());
    }
}
