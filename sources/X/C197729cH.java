package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9cH  reason: invalid class name and case insensitive filesystem */
public class C197729cH {
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final B2I[] A01 = new B2I[AnonymousClass905.values().length];
    public final boolean[] A02 = new boolean[AnonymousClass905.values().length];

    public static void A00(C197729cH r6) {
        for (AnonymousClass905 ordinal : AnonymousClass905.values()) {
            int ordinal2 = ordinal.ordinal();
            B2I[] b2iArr = r6.A01;
            if (b2iArr[ordinal2] != null && r6.A00.get() && r6.A02[ordinal2]) {
                b2iArr[ordinal2].B6O();
            }
        }
    }
}
