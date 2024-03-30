package androidx.car.app.model;

import X.C15640nk;
import X.C165597tg;
import java.util.Objects;

public final class PaneTemplate implements C15640nk {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final Pane mPane = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return Objects.equals(this.mTitle, paneTemplate.mTitle) && Objects.equals(this.mPane, paneTemplate.mPane) && Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, paneTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mTitle;
        objArr[1] = this.mPane;
        objArr[2] = this.mHeaderAction;
        return C165597tg.A06(this.mActionStrip, objArr, 3);
    }

    public String toString() {
        return "PaneTemplate";
    }
}
