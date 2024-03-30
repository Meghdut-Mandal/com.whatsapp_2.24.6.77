package X;

/* renamed from: X.68U  reason: invalid class name */
public final class AnonymousClass68U {
    public final float A00;

    public boolean equals(Object obj) {
        float f = this.A00;
        if (!(obj instanceof AnonymousClass68U) || Float.compare(f, ((AnonymousClass68U) obj).A00) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        float f = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BaselineShift(multiplier=");
        return C90464aC.A0g(A0u, f);
    }

    public /* synthetic */ AnonymousClass68U(float f) {
        this.A00 = f;
    }
}
