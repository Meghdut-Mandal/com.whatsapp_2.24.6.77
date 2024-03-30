package X;

/* renamed from: X.4gL  reason: invalid class name and case insensitive filesystem */
public final class C93304gL extends C129076Ev {
    public float A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C93304gL) || ((C93304gL) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C93304gL(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AnimationVector1D: value = ");
        A0u.append(this.A00);
        return A0u.toString();
    }
}
