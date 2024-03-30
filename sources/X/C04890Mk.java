package X;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: X.0Mk  reason: invalid class name and case insensitive filesystem */
public final class C04890Mk extends C12160hb implements Serializable {
    public static final C04890Mk A00 = new C04890Mk();

    public final C12160hb A00() {
        return C04900Ml.A00;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(obj2);
        return comparable.compareTo(obj2);
    }
}
