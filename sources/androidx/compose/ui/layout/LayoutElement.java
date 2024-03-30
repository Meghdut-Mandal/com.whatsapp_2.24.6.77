package androidx.compose.ui.layout;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C019408g;
import X.C137276fs;

public final class LayoutElement extends C137276fs {
    public final C019408g A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LayoutElement) && AnonymousClass00C.A0J(this.A00, ((LayoutElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public LayoutElement(C019408g r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LayoutElement(measure=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
