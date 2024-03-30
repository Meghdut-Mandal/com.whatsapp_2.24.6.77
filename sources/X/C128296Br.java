package X;

/* renamed from: X.6Br  reason: invalid class name and case insensitive filesystem */
public final class C128296Br {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128296Br) {
                C128296Br r5 = (C128296Br) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A00), this.A01), this.A02), this.A03);
    }

    public C128296Br(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RippleAlpha(draggedAlpha=");
        A0u.append(this.A00);
        A0u.append(", focusedAlpha=");
        A0u.append(this.A01);
        A0u.append(", hoveredAlpha=");
        A0u.append(this.A02);
        A0u.append(", pressedAlpha=");
        return C90464aC.A0g(A0u, this.A03);
    }
}
