package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: X.9pE  reason: invalid class name and case insensitive filesystem */
public final class C203959pE implements ComponentCallbacks {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C208139xi A01;

    public void onLowMemory() {
    }

    public C203959pE(Activity activity, C208139xi r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C208139xi r0 = this.A01;
        C22851Ax0 ax0 = r0.A00;
        if (ax0 != null) {
            Activity activity = this.A00;
            ax0.Bkk(activity, r0.A00(activity));
        }
    }
}
