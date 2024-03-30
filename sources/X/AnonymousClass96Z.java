package X;

import java.util.Iterator;

/* renamed from: X.96Z  reason: invalid class name */
public abstract class AnonymousClass96Z {
    public static final B5N A00(AnonymousClass9V8 r2) {
        B5N b5n;
        AnonymousClass00C.A0D(r2, 0);
        Iterator it = r2.A00.iterator();
        while (true) {
            b5n = null;
            if (!it.hasNext()) {
                break;
            }
            C22768Ave ave = (C22768Ave) it.next();
            if ((ave instanceof B5N) && (b5n = (B5N) ave) != null) {
                break;
            }
        }
        return b5n;
    }
}
