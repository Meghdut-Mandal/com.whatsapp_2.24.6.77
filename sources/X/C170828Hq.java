package X;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: X.8Hq  reason: invalid class name and case insensitive filesystem */
public final class C170828Hq extends AXU implements Serializable {
    public static final C170828Hq INSTANCE = new C170828Hq();
    public static final long serialVersionUID = 0;

    public String toString() {
        return "Ordering.natural()";
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }
}
