package X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.9Io  reason: invalid class name and case insensitive filesystem */
public abstract class C192789Io {
    public final Bundle A00;
    public final Bundle A01;
    public final Set A02;

    public C192789Io(Bundle bundle, Bundle bundle2, Set set) {
        this.A01 = bundle;
        this.A00 = bundle2;
        this.A02 = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
    }
}
