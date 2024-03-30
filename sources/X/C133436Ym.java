package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.6Ym  reason: invalid class name and case insensitive filesystem */
public class C133436Ym implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ AnonymousClass67F A00;

    public void onActivityCreated(Activity activity, Bundle bundle) {
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

    public C133436Ym(AnonymousClass67F r1) {
        this.A00 = r1;
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass67F r1 = this.A00;
        if (activity == r1.A00.get()) {
            r1.A00();
        }
    }
}
