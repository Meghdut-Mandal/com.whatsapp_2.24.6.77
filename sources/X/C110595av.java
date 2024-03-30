package X;

import java.util.NoSuchElementException;

/* renamed from: X.5av  reason: invalid class name and case insensitive filesystem */
public abstract class C110595av {
    public static final C108475Tq A00(int i) {
        for (C108475Tq r1 : C108475Tq.values()) {
            if (r1.databaseValue == i) {
                return r1;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
