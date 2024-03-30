package X;

import android.view.KeyEvent;

/* renamed from: X.68M  reason: invalid class name */
public final class AnonymousClass68M {
    public final KeyEvent A00;

    public boolean equals(Object obj) {
        KeyEvent keyEvent = this.A00;
        if (!(obj instanceof AnonymousClass68M) || !AnonymousClass00C.A0J(keyEvent, ((AnonymousClass68M) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        KeyEvent keyEvent = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("KeyEvent(nativeKeyEvent=");
        return AnonymousClass000.A0m(keyEvent, A0u);
    }

    public /* synthetic */ AnonymousClass68M(KeyEvent keyEvent) {
        this.A00 = keyEvent;
    }
}
