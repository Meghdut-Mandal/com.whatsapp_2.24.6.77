package X;

import java.io.Serializable;

/* renamed from: X.03u  reason: invalid class name and case insensitive filesystem */
public final class C008903u implements C005102h, Serializable {
    public static final C008903u A00 = new C008903u();
    public static final long serialVersionUID = 0;

    public Object fold(Object obj, C009003v r2) {
        return obj;
    }

    public C005202i get(C005902p r2) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C005102h plus(C005102h r2) {
        AnonymousClass00C.A0D(r2, 0);
        return r2;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    public C005102h minusKey(C005902p r1) {
        return this;
    }

    private final Object readResolve() {
        return A00;
    }
}
