package X;

import java.util.Objects;

/* renamed from: X.0w6  reason: invalid class name and case insensitive filesystem */
public final class C19530w6 implements AnonymousClass004 {
    public static final Object A02 = new Object();
    public volatile Object A00 = A02;
    public volatile AnonymousClass004 A01;

    public static AnonymousClass004 A00(AnonymousClass004 r1) {
        if ((r1 instanceof C19530w6) || (r1 instanceof C18840tu)) {
            return r1;
        }
        Objects.requireNonNull(r1);
        return new C19530w6(r1);
    }

    public Object get() {
        Object obj = this.A00;
        if (obj != A02) {
            return obj;
        }
        AnonymousClass004 r0 = this.A01;
        if (r0 == null) {
            return this.A00;
        }
        Object obj2 = r0.get();
        this.A00 = obj2;
        this.A01 = null;
        return obj2;
    }

    public C19530w6(AnonymousClass004 r2) {
        this.A01 = r2;
    }
}
