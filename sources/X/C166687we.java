package X;

/* renamed from: X.7we  reason: invalid class name and case insensitive filesystem */
public final class C166687we extends AnonymousClass9G3 {
    public final float A00;

    public C166687we(float f) {
        super(false, false);
        this.A00 = f;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C166687we) && Float.compare(this.A00, ((C166687we) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HorizontalTo(x=");
        return C90464aC.A0g(A0u, this.A00);
    }
}
