package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.C165567td;
import X.C165597tg;
import X.C36441kJ;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Objects;

public final class Destination {
    public final CarText mAddress = null;
    public final CarIcon mImage = null;
    public final CarText mName = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) obj;
        return Objects.equals(this.mName, destination.mName) && Objects.equals(this.mAddress, destination.mAddress) && Objects.equals(this.mImage, destination.mImage);
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.mName;
        A1Q[1] = this.mAddress;
        return C165597tg.A06(this.mImage, A1Q, 2);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[name: ");
        C165597tg.A14(this.mName, A0u);
        A0u.append(", address: ");
        C165597tg.A14(this.mAddress, A0u);
        A0u.append(", image: ");
        return C165567td.A0X(this.mImage, A0u);
    }
}
