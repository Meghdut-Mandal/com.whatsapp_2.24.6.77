package androidx.compose.ui.node;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C137276fs;

public final class ForceUpdateElement extends C137276fs {
    public final C137276fs A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ForceUpdateElement) && AnonymousClass00C.A0J(this.A00, ((ForceUpdateElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public ForceUpdateElement(C137276fs r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ForceUpdateElement(original=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
