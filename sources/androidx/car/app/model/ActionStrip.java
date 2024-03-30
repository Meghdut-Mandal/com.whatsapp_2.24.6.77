package androidx.car.app.model;

import X.AnonymousClass000;
import X.C90474aD;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ActionStrip {
    public final List mActions = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionStrip)) {
            return false;
        }
        return Objects.equals(this.mActions, ((ActionStrip) obj).mActions);
    }

    public int hashCode() {
        return Objects.hashCode(this.mActions);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[action count: ");
        A0u.append(this.mActions.size());
        return C90474aD.A0g(A0u);
    }
}
