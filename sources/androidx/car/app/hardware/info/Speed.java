package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.C165567td;
import X.C165597tg;
import X.C36441kJ;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class Speed {
    public final CarValue mDisplaySpeedMetersPerSecond;
    public final CarValue mRawSpeedMetersPerSecond;
    public final CarValue mSpeedDisplayUnit = CarValue.A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Speed)) {
            return false;
        }
        Speed speed = (Speed) obj;
        CarValue carValue = this.mRawSpeedMetersPerSecond;
        Objects.requireNonNull(carValue);
        CarValue carValue2 = speed.mRawSpeedMetersPerSecond;
        Objects.requireNonNull(carValue2);
        if (Objects.equals(carValue, carValue2)) {
            CarValue carValue3 = this.mDisplaySpeedMetersPerSecond;
            Objects.requireNonNull(carValue3);
            CarValue carValue4 = speed.mDisplaySpeedMetersPerSecond;
            Objects.requireNonNull(carValue4);
            return Objects.equals(carValue3, carValue4) && Objects.equals(this.mSpeedDisplayUnit, speed.mSpeedDisplayUnit);
        }
    }

    public Speed() {
        CarValue carValue = CarValue.A03;
        this.mRawSpeedMetersPerSecond = carValue;
        this.mDisplaySpeedMetersPerSecond = carValue;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        CarValue carValue = this.mRawSpeedMetersPerSecond;
        Objects.requireNonNull(carValue);
        A1Q[0] = carValue;
        CarValue carValue2 = this.mDisplaySpeedMetersPerSecond;
        Objects.requireNonNull(carValue2);
        A1Q[1] = carValue2;
        return C165597tg.A06(this.mSpeedDisplayUnit, A1Q, 2);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ raw speed: ");
        CarValue carValue = this.mRawSpeedMetersPerSecond;
        Objects.requireNonNull(carValue);
        A0u.append(carValue);
        A0u.append(", display speed: ");
        CarValue carValue2 = this.mDisplaySpeedMetersPerSecond;
        Objects.requireNonNull(carValue2);
        A0u.append(carValue2);
        A0u.append(", speed display unit: ");
        return C165567td.A0X(this.mSpeedDisplayUnit, A0u);
    }
}
