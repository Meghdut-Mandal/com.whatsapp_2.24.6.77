package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.6Yn  reason: invalid class name and case insensitive filesystem */
public final class C133446Yn implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C123725wz A00;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public C133446Yn(C123725wz r1) {
        this.A00 = r1;
    }

    public void onActivityPaused(Activity activity) {
        AnonymousClass00S r0 = this.A00.A00;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public void onActivityResumed(Activity activity) {
        AnonymousClass00S r0 = this.A00.A01;
        if (r0 != null) {
            r0.invoke();
        }
    }
}
