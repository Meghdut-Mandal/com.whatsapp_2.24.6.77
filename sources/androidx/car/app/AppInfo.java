package androidx.car.app;

import X.AnonymousClass000;
import java.util.Objects;

public final class AppInfo {
    public final int mLatestCarAppApiLevel = 0;
    public final String mLibraryVersion = null;
    public final int mMinCarAppApiLevel = 0;

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Library version: [");
        String str = this.mLibraryVersion;
        Objects.requireNonNull(str);
        A0u.append(str);
        A0u.append("] Min Car Api Level: [");
        A0u.append(this.mMinCarAppApiLevel);
        A0u.append("] Latest Car App Api Level: [");
        A0u.append(this.mLatestCarAppApiLevel);
        return AnonymousClass000.A0q("]", A0u);
    }
}
