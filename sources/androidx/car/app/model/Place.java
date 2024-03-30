package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C90474aD;
import java.util.Objects;

public final class Place {
    public final CarLocation mLocation = null;
    public final PlaceMarker mMarker = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return Objects.equals(this.mLocation, place.mLocation) && Objects.equals(this.mMarker, place.mMarker);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.mLocation;
        A0M[1] = this.mMarker;
        return Objects.hash(A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ location: ");
        A0u.append(this.mLocation);
        A0u.append(", marker: ");
        A0u.append(this.mMarker);
        return C90474aD.A0g(A0u);
    }
}
