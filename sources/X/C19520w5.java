package X;

import java.util.Objects;

/* renamed from: X.0w5  reason: invalid class name and case insensitive filesystem */
public final class C19520w5 implements AnonymousClass00L {
    public AnonymousClass004 A00;

    public Object get() {
        AnonymousClass004 r0 = this.A00;
        if (r0 != null) {
            return r0.get();
        }
        throw new IllegalStateException();
    }

    public static void A00(AnonymousClass004 r1, AnonymousClass004 r2) {
        Objects.requireNonNull(r2);
        C19520w5 r12 = (C19520w5) r1;
        if (r12.A00 == null) {
            r12.A00 = r2;
            return;
        }
        throw new IllegalStateException();
    }
}
