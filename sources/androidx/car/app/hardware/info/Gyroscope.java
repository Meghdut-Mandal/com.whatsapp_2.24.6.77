package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165597tg;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class Gyroscope {
    public final CarValue mRotations = CarValue.A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gyroscope)) {
            return false;
        }
        return Objects.equals(this.mRotations, ((Gyroscope) obj).mRotations);
    }

    public int hashCode() {
        return C165597tg.A06(this.mRotations, AnonymousClass001.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ rotations: ");
        A0u.append(this.mRotations);
        return AnonymousClass000.A0q(" ]", A0u);
    }
}
