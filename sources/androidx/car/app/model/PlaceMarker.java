package androidx.car.app.model;

import X.C165567td;
import X.C36341k9;
import X.C90484aE;
import java.util.Objects;

public final class PlaceMarker {
    public final CarColor mColor = null;
    public final CarIcon mIcon = null;
    public final int mIconType = 0;
    public final CarText mLabel = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceMarker)) {
            return false;
        }
        PlaceMarker placeMarker = (PlaceMarker) obj;
        return Objects.equals(this.mIcon, placeMarker.mIcon) && Objects.equals(this.mLabel, placeMarker.mLabel) && Objects.equals(this.mColor, placeMarker.mColor) && this.mIconType == placeMarker.mIconType;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mIcon;
        objArr[1] = this.mLabel;
        objArr[2] = this.mColor;
        C36341k9.A1T(objArr, this.mIconType);
        return Objects.hash(objArr);
    }

    public String toString() {
        String obj;
        StringBuilder A0p = C90484aE.A0p();
        CarIcon carIcon = this.mIcon;
        if (carIcon != null) {
            obj = carIcon.toString();
        } else {
            CarText carText = this.mLabel;
            if (carText != null) {
                obj = CarText.A00(carText);
            } else {
                obj = super.toString();
            }
        }
        return C165567td.A0Y(obj, A0p);
    }
}
