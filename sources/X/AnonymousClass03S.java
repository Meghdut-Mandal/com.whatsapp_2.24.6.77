package X;

import java.util.List;

/* renamed from: X.03S  reason: invalid class name */
public abstract class AnonymousClass03S {
    public static final C13540k2 A00(List list) {
        C13540k2 r1 = (C13540k2) list;
        if (r1.backing == null) {
            C13540k2.A08(r1);
            r1.isReadOnly = true;
            if (r1.length <= 0) {
                return C13540k2.A00;
            }
            return r1;
        }
        throw new IllegalStateException();
    }
}
