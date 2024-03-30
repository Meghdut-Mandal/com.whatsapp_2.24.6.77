package androidx.car.app.model;

import X.AnonymousClass001;
import X.C90474aD;
import X.C90484aE;
import X.C90504aG;
import java.util.Objects;

public final class CarLocation {
    public final double mLat = 0.0d;
    public final double mLng = 0.0d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarLocation)) {
            return false;
        }
        CarLocation carLocation = (CarLocation) obj;
        return Double.doubleToLongBits(this.mLat) == Double.doubleToLongBits(carLocation.mLat) && Double.doubleToLongBits(this.mLng) == Double.doubleToLongBits(carLocation.mLng);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = Double.valueOf(this.mLat);
        A0M[1] = Double.valueOf(this.mLng);
        return Objects.hash(A0M);
    }

    public String toString() {
        StringBuilder A0p = C90484aE.A0p();
        A0p.append(this.mLat);
        C90504aG.A1M(A0p);
        A0p.append(this.mLng);
        return C90474aD.A0g(A0p);
    }
}
