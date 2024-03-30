package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C20760y7;
import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Objects;

public class SessionInfo {
    public static final C20760y7 A00 = C20760y7.of(NavigationTemplate.class);
    public static final C20760y7 A01 = C20760y7.of();
    public final int mDisplayType = 0;
    public final String mSessionId = "main";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SessionInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return this.mSessionId.equals(sessionInfo.mSessionId) && this.mDisplayType == sessionInfo.mDisplayType;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.mSessionId;
        AnonymousClass000.A1K(A0M, this.mDisplayType);
        return Objects.hash(A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(String.valueOf(this.mDisplayType));
        A0u.append('/');
        return AnonymousClass000.A0q(this.mSessionId, A0u);
    }
}
