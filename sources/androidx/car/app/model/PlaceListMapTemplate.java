package androidx.car.app.model;

import X.AnonymousClass000;
import X.C15640nk;
import X.C165597tg;
import X.C22749AvK;
import X.C36421kH;
import java.util.Objects;

public final class PlaceListMapTemplate implements C15640nk {
    public final ActionStrip mActionStrip = null;
    public final Place mAnchor = null;
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final C22749AvK mOnContentRefreshDelegate = null;
    public final boolean mShowCurrentLocation = false;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListMapTemplate)) {
            return false;
        }
        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
        return this.mShowCurrentLocation == placeListMapTemplate.mShowCurrentLocation && this.mIsLoading == placeListMapTemplate.mIsLoading && Objects.equals(this.mTitle, placeListMapTemplate.mTitle) && Objects.equals(this.mItemList, placeListMapTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListMapTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListMapTemplate.mActionStrip) && Objects.equals(this.mAnchor, placeListMapTemplate.mAnchor) && C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mOnContentRefreshDelegate)), AnonymousClass000.A1W(placeListMapTemplate.mOnContentRefreshDelegate));
    }

    public String toString() {
        return "PlaceListMapTemplate";
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.mShowCurrentLocation);
        C36421kH.A1R(objArr, this.mIsLoading);
        objArr[2] = this.mTitle;
        objArr[3] = this.mItemList;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionStrip;
        objArr[6] = this.mAnchor;
        if (this.mOnContentRefreshDelegate == null) {
            z = true;
        }
        return C165597tg.A06(Boolean.valueOf(z), objArr, 7);
    }
}
