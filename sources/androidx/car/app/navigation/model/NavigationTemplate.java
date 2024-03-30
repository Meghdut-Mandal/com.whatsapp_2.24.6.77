package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.C15640nk;
import X.C15660nm;
import X.C165597tg;
import X.C22758AvT;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Toggle;
import java.util.Objects;

public final class NavigationTemplate implements C15640nk {
    public final ActionStrip mActionStrip = null;
    public final CarColor mBackgroundColor = null;
    public final TravelEstimate mDestinationTravelEstimate = null;
    public final ActionStrip mMapActionStrip = null;
    public final C15660nm mNavigationInfo = null;
    public final C22758AvT mPanModeDelegate = null;
    public final Toggle mPanModeToggle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationTemplate)) {
            return false;
        }
        NavigationTemplate navigationTemplate = (NavigationTemplate) obj;
        return Objects.equals(this.mNavigationInfo, navigationTemplate.mNavigationInfo) && Objects.equals(this.mBackgroundColor, navigationTemplate.mBackgroundColor) && Objects.equals(this.mDestinationTravelEstimate, navigationTemplate.mDestinationTravelEstimate) && Objects.equals(this.mActionStrip, navigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, navigationTemplate.mMapActionStrip) && Objects.equals(this.mPanModeToggle, navigationTemplate.mPanModeToggle) && C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mPanModeDelegate)), AnonymousClass000.A1W(navigationTemplate.mPanModeDelegate));
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        boolean z = false;
        objArr[0] = this.mNavigationInfo;
        objArr[1] = this.mBackgroundColor;
        objArr[2] = this.mDestinationTravelEstimate;
        objArr[3] = this.mActionStrip;
        objArr[4] = this.mMapActionStrip;
        objArr[5] = this.mPanModeToggle;
        if (this.mPanModeDelegate == null) {
            z = true;
        }
        return C165597tg.A06(Boolean.valueOf(z), objArr, 6);
    }

    public String toString() {
        return "NavigationTemplate";
    }
}
