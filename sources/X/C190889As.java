package X;

import android.net.Uri;

/* renamed from: X.9As  reason: invalid class name and case insensitive filesystem */
public abstract class C190889As {
    public static final Uri A00 = AnonymousClass9B1.A00;
    public static final Uri A01 = AnonymousClass9B1.A01;
    public static final C22805AwG A02;

    static {
        C22805AwG awG;
        synchronized (C1892292t.class) {
            awG = C1892292t.A00;
            if (awG == null) {
                awG = new C21019A3i();
                if (C1892292t.A00 == null) {
                    C1892292t.A00 = awG;
                } else {
                    throw AnonymousClass001.A09("init() already called");
                }
            }
        }
        A02 = awG;
    }
}
