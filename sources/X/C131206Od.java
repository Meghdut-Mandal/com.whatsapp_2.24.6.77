package X;

/* renamed from: X.6Od  reason: invalid class name and case insensitive filesystem */
public final class C131206Od {
    public AnonymousClass6MA A00 = null;

    public C131206Od(AnonymousClass6MA r2, float f, boolean z) {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131206Od) {
                C131206Od r5 = (C131206Od) obj;
                if (Float.compare(0.0f, 0.0f) != 0 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C90514aH.A05(0.0f) + 1231) * 31) + AnonymousClass000.A0H(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C90464aC.A1Q(A0u, "RowColumnParentData(weight=");
        C90484aE.A1K(A0u, ", fill=");
        A0u.append(", crossAxisAlignment=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public C131206Od() {
    }
}
