package X;

/* renamed from: X.0v6  reason: invalid class name and case insensitive filesystem */
public final class C19470v6 extends C19460v5 {
    public static final C19470v6 A00 = new C19470v6();
    public static final long serialVersionUID = 0;

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }

    private Object readResolve() {
        return A00;
    }
}
