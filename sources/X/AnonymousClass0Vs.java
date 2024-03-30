package X;

import java.util.Comparator;

/* renamed from: X.0Vs  reason: invalid class name */
public final class AnonymousClass0Vs {
    public static final Comparator A00;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(String.valueOf(AnonymousClass0Vs.class.getName()).concat("$UnsafeComparator")).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = C05140Ns.A01;
        }
        A00 = comparator;
    }
}
