package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165597tg;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class Accelerometer {
    public final CarValue mForces = CarValue.A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Accelerometer)) {
            return false;
        }
        return Objects.equals(this.mForces, ((Accelerometer) obj).mForces);
    }

    public int hashCode() {
        return C165597tg.A06(this.mForces, AnonymousClass001.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ forces: ");
        A0u.append(this.mForces);
        return AnonymousClass000.A0q(" ]", A0u);
    }
}
