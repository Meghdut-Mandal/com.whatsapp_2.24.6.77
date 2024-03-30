package X;

import java.util.List;

/* renamed from: X.5HX  reason: invalid class name */
public final class AnonymousClass5HX extends C111345c8 {
    public final List A00;

    public AnonymousClass5HX(List list) {
        AnonymousClass00C.A0D(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5HX) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5HX) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MultipleErrors(errors=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
