package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165567td;
import java.util.Objects;

public final class ForegroundCarColorSpan extends CarSpan {
    public final CarColor mCarColor = CarColor.A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForegroundCarColorSpan)) {
            return false;
        }
        return Objects.equals(this.mCarColor, ((ForegroundCarColorSpan) obj).mCarColor);
    }

    public int hashCode() {
        return Objects.hashCode(this.mCarColor);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[color: ");
        return C165567td.A0X(this.mCarColor, A0u);
    }
}
