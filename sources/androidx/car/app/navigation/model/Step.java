package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.C165567td;
import X.C165597tg;
import X.C90484aE;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Step {
    public final CarText mCue = null;
    public final List mLanes = Collections.emptyList();
    public final CarIcon mLanesImage = null;
    public final Maneuver mManeuver = null;
    public final CarText mRoad = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step)) {
            return false;
        }
        Step step = (Step) obj;
        return Objects.equals(this.mManeuver, step.mManeuver) && Objects.equals(this.mLanes, step.mLanes) && Objects.equals(this.mLanesImage, step.mLanesImage) && Objects.equals(this.mCue, step.mCue) && Objects.equals(this.mRoad, step.mRoad);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mManeuver;
        objArr[1] = this.mLanes;
        objArr[2] = this.mLanesImage;
        objArr[3] = this.mCue;
        return C165597tg.A06(this.mRoad, objArr, 4);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[maneuver: ");
        A0u.append(this.mManeuver);
        A0u.append(", lane count: ");
        A0u.append(C90484aE.A0F(this.mLanes));
        A0u.append(", lanes image: ");
        A0u.append(this.mLanesImage);
        A0u.append(", cue: ");
        C165597tg.A14(this.mCue, A0u);
        A0u.append(", road: ");
        return C165567td.A0Y(CarText.A00(this.mRoad), A0u);
    }
}
