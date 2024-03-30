package androidx.car.app.navigation.model;

import X.C15660nm;
import X.C165597tg;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Distance;
import java.util.Objects;

public final class RoutingInfo implements C15660nm {
    public final Distance mCurrentDistance = null;
    public final Step mCurrentStep = null;
    public final boolean mIsLoading = false;
    public final CarIcon mJunctionImage = null;
    public final Step mNextStep = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutingInfo)) {
            return false;
        }
        RoutingInfo routingInfo = (RoutingInfo) obj;
        return this.mIsLoading == routingInfo.mIsLoading && Objects.equals(this.mCurrentStep, routingInfo.mCurrentStep) && Objects.equals(this.mCurrentDistance, routingInfo.mCurrentDistance) && Objects.equals(this.mNextStep, routingInfo.mNextStep) && Objects.equals(this.mJunctionImage, routingInfo.mJunctionImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mCurrentStep;
        objArr[1] = this.mCurrentDistance;
        objArr[2] = this.mNextStep;
        objArr[3] = this.mJunctionImage;
        return C165597tg.A06(Boolean.valueOf(this.mIsLoading), objArr, 4);
    }

    public String toString() {
        return "RoutingInfo";
    }
}
