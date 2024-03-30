package X;

import android.os.Bundle;

/* renamed from: X.9In  reason: invalid class name and case insensitive filesystem */
public abstract class C192779In {
    public final Bundle A00;
    public final Bundle A01;
    public final AnonymousClass9G5 A02;

    public C192779In(Bundle bundle, Bundle bundle2, AnonymousClass9G5 r7) {
        this.A01 = bundle;
        this.A00 = bundle2;
        this.A02 = r7;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
