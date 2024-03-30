package androidx.car.app.navigation.model;

import X.C15640nk;
import X.C165597tg;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import java.util.Objects;

public final class MapTemplate implements C15640nk {
    public final ActionStrip mActionStrip = null;
    public final Header mHeader = null;
    public final ItemList mItemList = null;
    public final MapController mMapController = null;
    public final Pane mPane = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapTemplate)) {
            return false;
        }
        MapTemplate mapTemplate = (MapTemplate) obj;
        return Objects.equals(this.mPane, mapTemplate.mPane) && Objects.equals(this.mItemList, mapTemplate.mItemList) && Objects.equals(this.mHeader, mapTemplate.mHeader) && Objects.equals(this.mMapController, mapTemplate.mMapController) && Objects.equals(this.mActionStrip, mapTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mMapController;
        objArr[1] = this.mPane;
        objArr[2] = this.mItemList;
        objArr[3] = this.mHeader;
        return C165597tg.A06(this.mActionStrip, objArr, 4);
    }
}
