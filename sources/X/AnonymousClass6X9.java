package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.6X9  reason: invalid class name */
public abstract class AnonymousClass6X9 {
    public static boolean equalsImpl(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static HashSet newHashSet(Object... objArr) {
        HashSet newHashSetWithExpectedSize = newHashSetWithExpectedSize(4);
        Collections.addAll(newHashSetWithExpectedSize, objArr);
        return newHashSetWithExpectedSize;
    }

    public static HashSet newHashSetWithExpectedSize(int i) {
        return new HashSet(C131746Qj.capacity(4));
    }

    public static int hashCodeImpl(Set set) {
        int i = 0;
        for (Object A0J : set) {
            i = ~(~(i + AnonymousClass000.A0J(A0J)));
        }
        return i;
    }

    public static Set newConcurrentHashSet() {
        return Collections.newSetFromMap(C90524aI.A0s());
    }

    public static boolean removeAllImpl(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof B6T) {
            collection = ((B6T) collection).elementSet();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return removeAllImpl(set, collection.iterator());
        }
        return C225414v.removeAll(set.iterator(), collection);
    }

    public static boolean removeAllImpl(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
