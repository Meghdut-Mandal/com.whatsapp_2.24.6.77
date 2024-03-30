package androidx.compose.ui.input.key;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C006302t;
import X.C137276fs;
import X.C36391kE;

public final class KeyInputElement extends C137276fs {
    public final C006302t A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof KeyInputElement) && AnonymousClass00C.A0J(this.A00, ((KeyInputElement) obj).A00));
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00);
    }

    public KeyInputElement(C006302t r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("KeyInputElement(onKeyEvent=");
        A0u.append(this.A00);
        A0u.append(", onPreKeyEvent=");
        return AnonymousClass000.A0m((Object) null, A0u);
    }
}
