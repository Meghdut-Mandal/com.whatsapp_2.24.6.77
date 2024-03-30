package X;

import java.util.Objects;

/* renamed from: X.0tu  reason: invalid class name and case insensitive filesystem */
public final class C18840tu implements AnonymousClass004, AnonymousClass005 {
    public static final Object A02 = new Object();
    public volatile Object A00 = A02;
    public volatile AnonymousClass004 A01;

    public static AnonymousClass005 A00(AnonymousClass004 r1) {
        if (r1 instanceof AnonymousClass005) {
            return (AnonymousClass005) r1;
        }
        Objects.requireNonNull(r1);
        return new C18840tu(r1);
    }

    public Object get() {
        Object obj;
        Object obj2 = this.A00;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A00;
            if (obj == obj3) {
                obj = this.A01.get();
                Object obj4 = this.A00;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A00 = obj;
                    this.A01 = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Scoped provider was invoked recursively returning different results: ");
                    sb.append(obj4);
                    sb.append(" & ");
                    sb.append(obj);
                    sb.append(". This is likely due to a circular dependency.");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        return obj;
    }

    public C18840tu(AnonymousClass004 r2) {
        this.A01 = r2;
    }

    public static AnonymousClass004 A01(AnonymousClass004 r1) {
        Objects.requireNonNull(r1);
        if (r1 instanceof C18840tu) {
            return r1;
        }
        return new C18840tu(r1);
    }
}
