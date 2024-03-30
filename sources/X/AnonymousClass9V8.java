package X;

import java.util.List;

/* renamed from: X.9V8  reason: invalid class name */
public final class AnonymousClass9V8 {
    public final List A00;

    public AnonymousClass9V8(List list) {
        AnonymousClass00C.A0D(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C36381kD.A1Y(this, obj)) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A00, ((AnonymousClass9V8) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return C007103b.A0Q(", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", this.A00, (C006302t) null);
    }
}
