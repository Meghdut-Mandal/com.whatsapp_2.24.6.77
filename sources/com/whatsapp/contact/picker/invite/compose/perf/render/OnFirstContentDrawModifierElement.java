package com.whatsapp.contact.picker.invite.compose.perf.render;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.C137276fs;

public final class OnFirstContentDrawModifierElement extends C137276fs {
    public final AnonymousClass00S A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnFirstContentDrawModifierElement) && AnonymousClass00C.A0J(this.A00, ((OnFirstContentDrawModifierElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public OnFirstContentDrawModifierElement(AnonymousClass00S r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OnFirstContentDrawModifierElement(onDrawComplete=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
