package X;

/* renamed from: X.6hS  reason: invalid class name and case insensitive filesystem */
public final class C138196hS implements C161277mU {
    public final C94474iH A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C138196hS) {
                C138196hS r5 = (C138196hS) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || Float.compare(this.A01, r5.A01) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C36391kE.A0A(this.A00), this.A01);
    }

    public C138196hS(C94474iH r1, float f) {
        this.A00 = r1;
        this.A01 = f;
    }

    public float B8b() {
        return this.A01;
    }

    public C125185zS B8w() {
        return this.A00;
    }

    public long B9t() {
        return C133336Xx.A05;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BrushStyle(value=");
        A0u.append(this.A00);
        A0u.append(", alpha=");
        return C90464aC.A0g(A0u, this.A01);
    }
}
