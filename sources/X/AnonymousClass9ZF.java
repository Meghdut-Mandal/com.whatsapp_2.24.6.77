package X;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;

/* renamed from: X.9ZF  reason: invalid class name */
public abstract class AnonymousClass9ZF {
    public static Comparator comparator(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        if (comparator == null) {
            return AXU.natural();
        }
        return comparator;
    }

    public static boolean hasSameComparator(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        Objects.requireNonNull(comparator);
        Objects.requireNonNull(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = comparator((SortedSet) iterable);
        } else if (!(iterable instanceof B6Q)) {
            return false;
        } else {
            comparator2 = ((B6Q) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
