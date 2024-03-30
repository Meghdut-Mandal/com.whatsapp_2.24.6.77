package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165567td;
import java.util.Objects;

public final class CarIconSpan extends CarSpan {
    public final int mAlignment = 1;
    public final CarIcon mIcon = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIconSpan)) {
            return false;
        }
        return Objects.equals(this.mIcon, ((CarIconSpan) obj).mIcon);
    }

    public int hashCode() {
        return Objects.hashCode(this.mIcon);
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[icon: ");
        A0u.append(this.mIcon);
        A0u.append(", alignment: ");
        int i = this.mAlignment;
        if (i == 0) {
            str = "bottom";
        } else if (i == 1) {
            str = "baseline";
        } else if (i != 2) {
            str = "unknown";
        } else {
            str = "center";
        }
        return C165567td.A0Y(str, A0u);
    }
}
