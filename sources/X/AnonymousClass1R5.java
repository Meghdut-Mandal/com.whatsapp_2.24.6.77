package X;

import android.graphics.Rect;

/* renamed from: X.1R5  reason: invalid class name */
public final class AnonymousClass1R5 {
    public final AnonymousClass1R6 A00;

    public AnonymousClass1R5(Rect rect) {
        this.A00 = new AnonymousClass1R6(rect);
    }

    public final Rect A00() {
        AnonymousClass1R6 r0 = this.A00;
        return new Rect(r0.A01, r0.A03, r0.A02, r0.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AnonymousClass00C.A0J(getClass(), obj.getClass())) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A00, ((AnonymousClass1R5) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WindowMetrics { bounds: ");
        AnonymousClass1R6 r0 = this.A00;
        sb.append(new Rect(r0.A01, r0.A03, r0.A02, r0.A00));
        sb.append(" }");
        return sb.toString();
    }
}
