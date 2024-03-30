package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.0ZO  reason: invalid class name */
public final class AnonymousClass0ZO implements Application.ActivityLifecycleCallbacks {
    public Object A00;
    public Activity A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public final int A05;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.A01 == activity) {
            this.A01 = null;
            this.A02 = true;
        }
    }

    public void onActivityPaused(Activity activity) {
        if (this.A02 && !this.A04 && !this.A03) {
            Object obj = this.A00;
            int i = this.A05;
            try {
                Object obj2 = AnonymousClass0W9.A02.get(activity);
                if (obj2 == obj && activity.hashCode() == i) {
                    AnonymousClass0W9.A00.postAtFrontOfQueue(new C11440gJ(AnonymousClass0W9.A01.get(activity), obj2));
                    this.A04 = true;
                    this.A00 = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        if (this.A01 == activity) {
            this.A03 = true;
        }
    }

    public AnonymousClass0ZO(Activity activity) {
        this.A01 = activity;
        this.A05 = activity.hashCode();
    }
}
