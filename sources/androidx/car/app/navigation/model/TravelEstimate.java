package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.C165567td;
import X.C165597tg;
import X.C36421kH;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.Distance;
import java.util.Objects;

public final class TravelEstimate {
    public final DateTimeWithZone mArrivalTimeAtDestination = null;
    public final Distance mRemainingDistance = null;
    public final CarColor mRemainingDistanceColor;
    public final CarColor mRemainingTimeColor;
    public final long mRemainingTimeSeconds = 0;
    public final CarIcon mTripIcon;
    public final CarText mTripText;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelEstimate)) {
            return false;
        }
        TravelEstimate travelEstimate = (TravelEstimate) obj;
        return Objects.equals(this.mRemainingDistance, travelEstimate.mRemainingDistance) && this.mRemainingTimeSeconds == travelEstimate.mRemainingTimeSeconds && Objects.equals(this.mArrivalTimeAtDestination, travelEstimate.mArrivalTimeAtDestination) && Objects.equals(this.mRemainingTimeColor, travelEstimate.mRemainingTimeColor) && Objects.equals(this.mRemainingDistanceColor, travelEstimate.mRemainingDistanceColor) && Objects.equals(this.mTripText, travelEstimate.mTripText) && Objects.equals(this.mTripIcon, travelEstimate.mTripIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.mRemainingDistance;
        C36421kH.A1P(objArr, this.mRemainingTimeSeconds);
        objArr[2] = this.mArrivalTimeAtDestination;
        objArr[3] = this.mRemainingTimeColor;
        objArr[4] = this.mRemainingDistanceColor;
        objArr[5] = this.mTripText;
        return C165597tg.A06(this.mTripIcon, objArr, 6);
    }

    public TravelEstimate() {
        CarColor carColor = CarColor.A00;
        this.mRemainingTimeColor = carColor;
        this.mRemainingDistanceColor = carColor;
        this.mTripText = null;
        this.mTripIcon = null;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ remaining distance: ");
        A0u.append(this.mRemainingDistance);
        A0u.append(", time (s): ");
        A0u.append(this.mRemainingTimeSeconds);
        A0u.append(", ETA: ");
        return C165567td.A0X(this.mArrivalTimeAtDestination, A0u);
    }
}
