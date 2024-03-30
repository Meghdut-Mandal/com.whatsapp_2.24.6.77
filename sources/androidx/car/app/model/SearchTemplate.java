package androidx.car.app.model;

import X.C15640nk;
import X.C165597tg;
import X.C22753AvO;
import X.C36421kH;
import java.util.Objects;

public final class SearchTemplate implements C15640nk {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final String mInitialSearchText = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final C22753AvO mSearchCallbackDelegate = null;
    public final String mSearchHint = null;
    public final boolean mShowKeyboardByDefault = true;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTemplate)) {
            return false;
        }
        SearchTemplate searchTemplate = (SearchTemplate) obj;
        return this.mIsLoading == searchTemplate.mIsLoading && Objects.equals(this.mInitialSearchText, searchTemplate.mInitialSearchText) && Objects.equals(this.mSearchHint, searchTemplate.mSearchHint) && Objects.equals(this.mItemList, searchTemplate.mItemList) && Objects.equals(this.mHeaderAction, searchTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.mInitialSearchText;
        C36421kH.A1R(objArr, this.mIsLoading);
        objArr[2] = this.mSearchHint;
        objArr[3] = this.mItemList;
        objArr[4] = Boolean.valueOf(this.mShowKeyboardByDefault);
        objArr[5] = this.mHeaderAction;
        return C165597tg.A06(this.mActionStrip, objArr, 6);
    }

    public String toString() {
        return "SearchTemplate";
    }
}
