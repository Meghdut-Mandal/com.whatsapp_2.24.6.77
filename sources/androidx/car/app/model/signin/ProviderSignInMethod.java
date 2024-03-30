package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C15650nl;
import X.C165567td;
import X.C165597tg;
import androidx.car.app.model.Action;
import java.util.Objects;

public final class ProviderSignInMethod implements C15650nl {
    public final Action mAction = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderSignInMethod)) {
            return false;
        }
        return Objects.equals(this.mAction, ((ProviderSignInMethod) obj).mAction);
    }

    public int hashCode() {
        return C165597tg.A06(this.mAction, AnonymousClass001.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[action:");
        return C165567td.A0X(this.mAction, A0u);
    }
}
