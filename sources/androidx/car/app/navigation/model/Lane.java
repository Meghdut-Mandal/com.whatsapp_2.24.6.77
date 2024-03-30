package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.C90474aD;
import X.C90484aE;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Lane {
    public final List mDirections = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lane)) {
            return false;
        }
        return Objects.equals(this.mDirections, ((Lane) obj).mDirections);
    }

    public int hashCode() {
        return Objects.hashCode(this.mDirections);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[direction count: ");
        A0u.append(C90484aE.A0F(this.mDirections));
        return C90474aD.A0g(A0u);
    }
}
