package X;

/* renamed from: X.6fp  reason: invalid class name and case insensitive filesystem */
public final class C137246fp implements AnonymousClass7bO {
    public final float A00;

    public static int A00(C137246fp r3, int i) {
        return C14960mT.A01((((float) i) / 2.0f) * (((float) 1) + r3.A00));
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C137246fp) && Float.compare(this.A00, ((C137246fp) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C137246fp(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Vertical(bias=");
        return C90464aC.A0g(A0u, this.A00);
    }
}
