package X;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: X.0Ml  reason: invalid class name and case insensitive filesystem */
public final class C04900Ml extends C12160hb implements Serializable {
    public static final C04900Ml A00 = new C04900Ml();

    public final C12160hb A00() {
        return C04890Mk.A00;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        Objects.requireNonNull(obj);
        if (obj == comparable) {
            return 0;
        }
        return comparable.compareTo(obj);
    }
}
