package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.C165567td;
import X.C165597tg;
import X.C36331k8;
import androidx.car.app.model.CarIcon;
import java.util.Objects;

public final class Maneuver {
    public final CarIcon mIcon = null;
    public final int mRoundaboutExitAngle = 0;
    public final int mRoundaboutExitNumber = 0;
    public final int mType = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Maneuver)) {
            return false;
        }
        Maneuver maneuver = (Maneuver) obj;
        return this.mType == maneuver.mType && this.mRoundaboutExitNumber == maneuver.mRoundaboutExitNumber && this.mRoundaboutExitAngle == maneuver.mRoundaboutExitAngle && Objects.equals(this.mIcon, maneuver.mIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1J(objArr, this.mType);
        AnonymousClass000.A1K(objArr, this.mRoundaboutExitNumber);
        C36331k8.A1V(objArr, this.mRoundaboutExitAngle);
        return C165597tg.A06(this.mIcon, objArr, 3);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[type: ");
        A0u.append(this.mType);
        A0u.append(", exit #: ");
        A0u.append(this.mRoundaboutExitNumber);
        A0u.append(", exit angle: ");
        A0u.append(this.mRoundaboutExitAngle);
        A0u.append(", icon: ");
        return C165567td.A0X(this.mIcon, A0u);
    }
}
