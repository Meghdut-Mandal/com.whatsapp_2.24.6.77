package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.C165597tg;
import X.C36351kA;
import X.C90474aD;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Trip {
    public final CarText mCurrentRoad = null;
    public final List mDestinationTravelEstimates = Collections.emptyList();
    public final List mDestinations = Collections.emptyList();
    public final boolean mIsLoading = false;
    public final List mStepTravelEstimates = Collections.emptyList();
    public final List mSteps = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trip)) {
            return false;
        }
        Trip trip = (Trip) obj;
        return Objects.equals(this.mDestinations, trip.mDestinations) && Objects.equals(this.mSteps, trip.mSteps) && Objects.equals(this.mDestinationTravelEstimates, trip.mDestinationTravelEstimates) && Objects.equals(this.mStepTravelEstimates, trip.mStepTravelEstimates) && Objects.equals(this.mCurrentRoad, trip.mCurrentRoad) && C165597tg.A1S(Boolean.valueOf(this.mIsLoading), trip.mIsLoading);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mDestinations;
        objArr[1] = this.mSteps;
        objArr[2] = this.mDestinationTravelEstimates;
        objArr[3] = this.mStepTravelEstimates;
        return C165597tg.A06(this.mCurrentRoad, objArr, 4);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ destinations : ");
        C36351kA.A1K(this.mDestinations, A0u);
        A0u.append(", steps: ");
        C36351kA.A1K(this.mSteps, A0u);
        A0u.append(", dest estimates: ");
        C36351kA.A1K(this.mDestinationTravelEstimates, A0u);
        A0u.append(", step estimates: ");
        C36351kA.A1K(this.mStepTravelEstimates, A0u);
        A0u.append(", road: ");
        C165597tg.A14(this.mCurrentRoad, A0u);
        A0u.append(", isLoading: ");
        A0u.append(this.mIsLoading);
        return C90474aD.A0g(A0u);
    }
}
