package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165597tg;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class TollCard {
    public final CarValue mCardState = CarValue.A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TollCard)) {
            return false;
        }
        return Objects.equals(this.mCardState, ((TollCard) obj).mCardState);
    }

    public int hashCode() {
        return C165597tg.A06(this.mCardState, AnonymousClass001.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ tollcard state: ");
        return C165567td.A0X(this.mCardState, A0u);
    }
}
