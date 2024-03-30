package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165577te;
import X.C22746AvH;
import X.C36421kH;
import X.C90474aD;
import java.util.Objects;

public final class Toggle {
    public final boolean mIsChecked = false;
    public final boolean mIsEnabled = true;
    public final C22746AvH mOnCheckedChangeDelegate = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        C165577te.A1V(A0M, this.mIsChecked);
        C36421kH.A1R(A0M, this.mIsEnabled);
        return Objects.hash(A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ isChecked: ");
        A0u.append(this.mIsChecked);
        A0u.append(", isEnabled: ");
        A0u.append(this.mIsEnabled);
        return C90474aD.A0g(A0u);
    }
}
