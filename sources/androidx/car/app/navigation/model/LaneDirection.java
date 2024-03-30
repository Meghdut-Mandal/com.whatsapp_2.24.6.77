package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C36421kH;
import java.util.Objects;

public final class LaneDirection {
    public final boolean mIsRecommended = false;
    public final int mShape = 1;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaneDirection)) {
            return false;
        }
        LaneDirection laneDirection = (LaneDirection) obj;
        return this.mShape == laneDirection.mShape && this.mIsRecommended == laneDirection.mIsRecommended;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.mShape);
        C36421kH.A1R(A0M, this.mIsRecommended);
        return Objects.hash(A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[shape: ");
        A0u.append(this.mShape);
        A0u.append(", isRecommended: ");
        A0u.append(this.mIsRecommended);
        return AnonymousClass000.A0q("]", A0u);
    }
}
