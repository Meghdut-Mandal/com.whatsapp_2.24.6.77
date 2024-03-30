package X;

import java.util.Collection;
import java.util.Objects;

/* renamed from: X.9hH  reason: invalid class name and case insensitive filesystem */
public abstract class C200359hH {
    public static boolean addAll(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Objects.requireNonNull(iterable);
        return C225414v.addAll(collection, iterable.iterator());
    }

    public static Iterable skip(Iterable iterable, int i) {
        Objects.requireNonNull(iterable);
        if (C36401kF.A1U(i)) {
            return new AnonymousClass8HV(iterable, i);
        }
        throw AnonymousClass001.A08(String.valueOf("number to skip cannot be negative"));
    }

    public static String toString(Iterable iterable) {
        return C225414v.toString(iterable.iterator());
    }
}
