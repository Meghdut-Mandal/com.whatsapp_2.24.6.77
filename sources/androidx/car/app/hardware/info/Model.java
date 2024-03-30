package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.C165567td;
import X.C165597tg;
import X.C36441kJ;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

public final class Model {
    public final CarValue mManufacturer;
    public final CarValue mName;
    public final CarValue mYear = CarValue.A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Model)) {
            return false;
        }
        Model model = (Model) obj;
        return Objects.equals(this.mName, model.mName) && Objects.equals(this.mYear, model.mYear) && Objects.equals(this.mManufacturer, model.mManufacturer);
    }

    public Model() {
        CarValue carValue = CarValue.A07;
        this.mName = carValue;
        this.mManufacturer = carValue;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.mName;
        A1Q[1] = this.mYear;
        return C165597tg.A06(this.mManufacturer, A1Q, 2);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ name: ");
        A0u.append(this.mName);
        A0u.append(", year: ");
        A0u.append(this.mYear);
        A0u.append(", manufacturer: ");
        return C165567td.A0X(this.mManufacturer, A0u);
    }
}
