package X;

/* renamed from: X.4gM  reason: invalid class name and case insensitive filesystem */
public final class C93314gM extends C129076Ev {
    public float A00;
    public float A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C93314gM)) {
            return false;
        }
        C93314gM r4 = (C93314gM) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C90514aH.A0C(C90514aH.A05(this.A00), this.A01);
    }

    public C93314gM(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AnimationVector2D: v1 = ");
        A0u.append(this.A00);
        A0u.append(", v2 = ");
        A0u.append(this.A01);
        return A0u.toString();
    }
}
