package X;

/* renamed from: X.6Am  reason: invalid class name and case insensitive filesystem */
public final class C128006Am {
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128006Am) {
                C128006Am r5 = (C128006Am) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90514aH.A05(this.A01), this.A00);
    }

    public C128006Am(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Size(width=");
        A0u.append(this.A01);
        A0u.append(", height=");
        return C90464aC.A0g(A0u, this.A00);
    }
}
