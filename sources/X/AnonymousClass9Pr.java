package X;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: X.9Pr  reason: invalid class name */
public final class AnonymousClass9Pr {
    public final WeakReference A00;

    public final boolean A00(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        Activity activity = (Activity) this.A00.get();
        if (activity == null) {
            return false;
        }
        activity.finish();
        return false;
    }

    public AnonymousClass9Pr(AnonymousClass155 r2) {
        this.A00 = AnonymousClass001.A0F(r2);
    }
}
