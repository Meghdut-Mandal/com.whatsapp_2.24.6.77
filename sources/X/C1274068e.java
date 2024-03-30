package X;

import java.util.List;

/* renamed from: X.68e  reason: invalid class name and case insensitive filesystem */
public final class C1274068e {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1274068e) && AnonymousClass00C.A0J(this.A00, ((C1274068e) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1274068e(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VariantsCarouselFragmentUiState(carouselDisplayData=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
