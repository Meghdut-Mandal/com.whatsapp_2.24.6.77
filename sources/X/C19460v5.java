package X;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: X.0v5  reason: invalid class name and case insensitive filesystem */
public abstract class C19460v5 implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public Object A02() {
        if (this instanceof AnonymousClass1GC) {
            return ((AnonymousClass1GC) this).reference;
        }
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public Object A03() {
        if (this instanceof AnonymousClass1GC) {
            return ((AnonymousClass1GC) this).reference;
        }
        return null;
    }

    public Object A04(Object obj) {
        if (this instanceof AnonymousClass1GC) {
            C20740y5.A04(obj, "use Optional.orNull() instead of Optional.or(null)");
            return ((AnonymousClass1GC) this).reference;
        }
        C20740y5.A04(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    public boolean A05() {
        if (this instanceof AnonymousClass1GC) {
            return true;
        }
        return false;
    }

    public static C19470v6 A00() {
        return C19470v6.A00;
    }

    public static AnonymousClass1GC A01(Object obj) {
        Objects.requireNonNull(obj);
        return new AnonymousClass1GC(obj);
    }
}
