package X;

/* renamed from: X.1GC  reason: invalid class name */
public final class AnonymousClass1GC extends C19460v5 {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass1GC) {
            return this.reference.equals(((AnonymousClass1GC) obj).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.reference);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public AnonymousClass1GC(Object obj) {
        this.reference = obj;
    }
}
