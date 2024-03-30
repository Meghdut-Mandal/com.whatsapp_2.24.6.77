package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165597tg;
import X.C36441kJ;
import java.util.List;
import java.util.Objects;

public final class Header {
    public final List mEndHeaderActions = AnonymousClass001.A0I();
    public final Action mStartHeaderAction = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Objects.equals(this.mTitle, header.mTitle) && Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction);
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.mTitle;
        A1Q[1] = this.mEndHeaderActions;
        return C165597tg.A06(this.mStartHeaderAction, A1Q, 2);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Header: ");
        return AnonymousClass000.A0o(this.mTitle, A0u);
    }
}
