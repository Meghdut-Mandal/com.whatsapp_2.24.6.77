package X;

import java.util.Comparator;

/* renamed from: X.75m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1504975m implements Comparator {
    public static final /* synthetic */ C1504975m A00 = new C1504975m();

    public final int compare(Object obj, Object obj2) {
        Number number = (Number) obj;
        Number number2 = (Number) obj2;
        if (number == null) {
            if (number2 == null) {
                return 0;
            }
            return 1;
        } else if (number2 == null) {
            return -1;
        } else {
            return Double.compare(number.doubleValue(), number2.doubleValue());
        }
    }
}
