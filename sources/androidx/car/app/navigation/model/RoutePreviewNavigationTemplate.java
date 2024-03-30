package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.C15640nk;
import X.C165597tg;
import X.C22758AvT;
import X.C36421kH;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import java.util.Objects;

public final class RoutePreviewNavigationTemplate implements C15640nk {
    public final ActionStrip mActionStrip = null;
    public final Header mHeader = null;
    @Deprecated
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final ActionStrip mMapActionStrip = null;
    public final Action mNavigateAction = null;
    public final C22758AvT mPanModeDelegate = null;
    @Deprecated
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutePreviewNavigationTemplate)) {
            return false;
        }
        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
        return this.mIsLoading == routePreviewNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, routePreviewNavigationTemplate.mTitle) && Objects.equals(this.mNavigateAction, routePreviewNavigationTemplate.mNavigateAction) && Objects.equals(this.mItemList, routePreviewNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, routePreviewNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, routePreviewNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, routePreviewNavigationTemplate.mMapActionStrip) && C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mPanModeDelegate)), AnonymousClass000.A1W(routePreviewNavigationTemplate.mPanModeDelegate)) && Objects.equals(this.mHeader, routePreviewNavigationTemplate.mHeader);
    }

    public String toString() {
        return "RoutePreviewNavigationTemplate";
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        boolean z = false;
        objArr[0] = this.mTitle;
        C36421kH.A1R(objArr, this.mIsLoading);
        objArr[2] = this.mNavigateAction;
        objArr[3] = this.mItemList;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionStrip;
        objArr[6] = this.mMapActionStrip;
        if (this.mPanModeDelegate == null) {
            z = true;
        }
        objArr[7] = Boolean.valueOf(z);
        return C165597tg.A06(this.mHeader, objArr, 8);
    }
}
