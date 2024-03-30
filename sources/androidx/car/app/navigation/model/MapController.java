package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165597tg;
import X.C22758AvT;
import androidx.car.app.model.ActionStrip;
import java.util.Objects;

public final class MapController {
    public final ActionStrip mMapActionStrip = null;
    public final C22758AvT mPanModeDelegate = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapController)) {
            return false;
        }
        MapController mapController = (MapController) obj;
        return C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mPanModeDelegate)), AnonymousClass000.A1W(mapController.mPanModeDelegate)) && Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.mPanModeDelegate;
        return C165597tg.A06(this.mMapActionStrip, A0M, 1);
    }
}
