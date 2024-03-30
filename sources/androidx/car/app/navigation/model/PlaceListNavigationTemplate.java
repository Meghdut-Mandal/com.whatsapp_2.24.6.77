package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.C15640nk;
import X.C165597tg;
import X.C22749AvK;
import X.C22758AvT;
import X.C36421kH;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import java.util.Objects;

public final class PlaceListNavigationTemplate implements C15640nk {
    public final ActionStrip mActionStrip = null;
    public final Header mHeader = null;
    @Deprecated
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final ActionStrip mMapActionStrip = null;
    public final C22749AvK mOnContentRefreshDelegate = null;
    public final C22758AvT mPanModeDelegate = null;
    @Deprecated
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListNavigationTemplate)) {
            return false;
        }
        PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) obj;
        return this.mIsLoading == placeListNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, placeListNavigationTemplate.mTitle) && Objects.equals(this.mItemList, placeListNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, placeListNavigationTemplate.mMapActionStrip) && C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mPanModeDelegate)), AnonymousClass000.A1W(placeListNavigationTemplate.mPanModeDelegate)) && C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mOnContentRefreshDelegate)), AnonymousClass000.A1W(placeListNavigationTemplate.mOnContentRefreshDelegate)) && Objects.equals(this.mHeader, placeListNavigationTemplate.mHeader);
    }

    public String toString() {
        return "PlaceListNavigationTemplate";
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        boolean z = false;
        objArr[0] = this.mTitle;
        C36421kH.A1R(objArr, this.mIsLoading);
        objArr[2] = this.mItemList;
        objArr[3] = this.mHeaderAction;
        objArr[4] = this.mActionStrip;
        objArr[5] = this.mMapActionStrip;
        objArr[6] = Boolean.valueOf(AnonymousClass000.A1W(this.mPanModeDelegate));
        if (this.mOnContentRefreshDelegate == null) {
            z = true;
        }
        AnonymousClass000.A1N(objArr, 7, z);
        return C165597tg.A06(this.mHeader, objArr, 8);
    }
}
