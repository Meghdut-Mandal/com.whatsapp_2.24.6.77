package androidx.car.app.model.signin;

import X.AnonymousClass001;
import X.C15650nl;
import X.C165597tg;
import androidx.car.app.model.CarText;
import java.util.Objects;

public final class PinSignInMethod implements C15650nl {
    public final CarText mPinCode = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinSignInMethod)) {
            return false;
        }
        return Objects.equals(this.mPinCode, ((PinSignInMethod) obj).mPinCode);
    }

    public int hashCode() {
        return C165597tg.A06(this.mPinCode, AnonymousClass001.A0L(), 0);
    }
}
