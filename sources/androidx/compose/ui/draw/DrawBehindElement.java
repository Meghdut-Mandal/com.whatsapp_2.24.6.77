package androidx.compose.ui.draw;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C006302t;
import X.C137276fs;

public final class DrawBehindElement extends C137276fs {
    public final C006302t A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DrawBehindElement) && AnonymousClass00C.A0J(this.A00, ((DrawBehindElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public DrawBehindElement(C006302t r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DrawBehindElement(onDraw=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
