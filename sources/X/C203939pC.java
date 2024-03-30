package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.9pC  reason: invalid class name and case insensitive filesystem */
public final class C203939pC implements Application.ActivityLifecycleCallbacks {
    public final Activity A00;
    public final AnonymousClass8BX A01;

    public /* synthetic */ C203939pC(Activity activity, AnonymousClass8BX r2) {
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.A00) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Object[] A0L = AnonymousClass001.A0L();
                A0L[0] = activity.getPackageName();
                Log.v("NearbyMessagesClient", String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", A0L));
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.A00) {
            try {
                this.A01.A0G(1);
            } catch (RemoteException e) {
                if (Log.isLoggable("NearbyMessagesClient", 2)) {
                    Log.v("NearbyMessagesClient", String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", new Object[]{activity.getPackageName(), e}));
                }
            }
        }
    }
}
