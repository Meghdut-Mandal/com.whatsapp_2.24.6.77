package androidx.compose.ui.input.pointer;

import X.AnonymousClass00C;
import X.C009003v;
import X.C137276fs;
import X.C36391kE;

public final class SuspendPointerInputElement extends C137276fs {
    public final Object A00;
    public final C009003v A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SuspendPointerInputElement) && AnonymousClass00C.A0J(this.A00, ((SuspendPointerInputElement) obj).A00));
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) * 31;
    }

    public /* synthetic */ SuspendPointerInputElement(Object obj, C009003v r2) {
        this.A00 = obj;
        this.A01 = r2;
    }
}
