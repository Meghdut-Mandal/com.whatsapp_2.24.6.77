package X;

import android.graphics.Rect;

/* renamed from: X.6An  reason: invalid class name and case insensitive filesystem */
public final class C128016An {
    public final Rect A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128016An) {
                C128016An r5 = (C128016An) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36341k9.A01(this.A01 ? 1 : 0) * 31);
    }

    public C128016An(Rect rect, boolean z) {
        this.A01 = z;
        this.A00 = rect;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LeafData(isVisible=");
        A0u.append(this.A01);
        A0u.append(", boundsOnScreen=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
