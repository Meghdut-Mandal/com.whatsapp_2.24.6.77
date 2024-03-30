package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165597tg;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class EnergyProfile {
    public final CarValue mEvConnectorTypes;
    public final CarValue mFuelTypes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyProfile)) {
            return false;
        }
        EnergyProfile energyProfile = (EnergyProfile) obj;
        return Objects.equals(this.mEvConnectorTypes, energyProfile.mEvConnectorTypes) && Objects.equals(this.mFuelTypes, energyProfile.mFuelTypes);
    }

    public EnergyProfile() {
        CarValue carValue = CarValue.A06;
        this.mEvConnectorTypes = carValue;
        this.mFuelTypes = carValue;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.mEvConnectorTypes;
        return C165597tg.A06(this.mFuelTypes, A0M, 1);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ evConnectorTypes: ");
        A0u.append(this.mEvConnectorTypes);
        A0u.append(", fuelTypes: ");
        return C165567td.A0X(this.mFuelTypes, A0u);
    }
}
