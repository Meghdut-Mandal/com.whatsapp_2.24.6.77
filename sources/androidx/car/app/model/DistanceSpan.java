package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165567td;
import java.util.Objects;

public final class DistanceSpan extends CarSpan {
    public final Distance mDistance = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistanceSpan)) {
            return false;
        }
        return Objects.equals(this.mDistance, ((DistanceSpan) obj).mDistance);
    }

    public int hashCode() {
        return Objects.hashCode(this.mDistance);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[distance: ");
        return C165567td.A0X(this.mDistance, A0u);
    }
}
