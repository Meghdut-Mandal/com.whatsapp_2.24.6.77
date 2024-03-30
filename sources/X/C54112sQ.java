package X;

import java.util.NoSuchElementException;

/* renamed from: X.2sQ  reason: invalid class name and case insensitive filesystem */
public abstract class C54112sQ {
    public static final C52382pL A00(int i) {
        for (C52382pL r1 : C52382pL.values()) {
            if (r1.value == i) {
                return r1;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
