package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165597tg;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public class EvStatus {
    public final CarValue mEvChargePortConnected;
    public final CarValue mEvChargePortOpen;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvStatus)) {
            return false;
        }
        EvStatus evStatus = (EvStatus) obj;
        return Objects.equals(this.mEvChargePortConnected, evStatus.mEvChargePortConnected) && Objects.equals(this.mEvChargePortOpen, evStatus.mEvChargePortOpen);
    }

    public EvStatus() {
        CarValue carValue = CarValue.A02;
        this.mEvChargePortOpen = carValue;
        this.mEvChargePortConnected = carValue;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.mEvChargePortOpen;
        return C165597tg.A06(this.mEvChargePortConnected, A0M, 1);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ EV charge port open: ");
        A0u.append(this.mEvChargePortOpen);
        A0u.append(", EV charge port connected: ");
        return C165567td.A0X(this.mEvChargePortConnected, A0u);
    }
}
