package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.05Q  reason: invalid class name */
public class AnonymousClass05Q implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public static void registerIn(Activity activity) {
        activity.registerActivityLifecycleCallbacks(new AnonymousClass05Q());
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AnonymousClass05P.A01(activity, AnonymousClass05R.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        AnonymousClass05P.A01(activity, AnonymousClass05R.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        AnonymousClass05P.A01(activity, AnonymousClass05R.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        AnonymousClass05P.A01(activity, AnonymousClass05R.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        AnonymousClass05P.A01(activity, AnonymousClass05R.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        AnonymousClass05P.A01(activity, AnonymousClass05R.ON_STOP);
    }
}
