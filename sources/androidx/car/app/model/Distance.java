package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Locale;
import java.util.Objects;

public final class Distance {
    public final double mDisplayDistance = 0.0d;
    public final int mDisplayUnit = 1;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Distance)) {
            return false;
        }
        Distance distance = (Distance) obj;
        return this.mDisplayUnit == distance.mDisplayUnit && this.mDisplayDistance == distance.mDisplayDistance;
    }

    public String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = Double.valueOf(this.mDisplayDistance);
        switch (this.mDisplayUnit) {
            case 1:
                str = "m";
                break;
            case 2:
                str = "km";
                break;
            case 3:
                str = "km_p1";
                break;
            case 4:
                str = "mi";
                break;
            case 5:
                str = "mi_p1";
                break;
            case 6:
                str = "ft";
                break;
            case 7:
                str = "yd";
                break;
            default:
                str = "?";
                break;
        }
        A0M[1] = str;
        return String.format(locale, "%.04f%s", A0M);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = Double.valueOf(this.mDisplayDistance);
        AnonymousClass000.A1K(A0M, this.mDisplayUnit);
        return Objects.hash(A0M);
    }
}
