package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.13V  reason: invalid class name */
public final class AnonymousClass13V extends C19590wC implements Application.ActivityLifecycleCallbacks {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass13V(AnonymousClass005 r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityCreated : observers) {
            onActivityCreated.onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityDestroyed : observers) {
            onActivityDestroyed.onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPaused : observers) {
            onActivityPaused.onActivityPaused(activity);
        }
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPostCreated : observers) {
            onActivityPostCreated.onActivityPostCreated(activity, bundle);
        }
    }

    public void onActivityPostDestroyed(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPostDestroyed : observers) {
            onActivityPostDestroyed.onActivityPostDestroyed(activity);
        }
    }

    public void onActivityPostPaused(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPostPaused : observers) {
            onActivityPostPaused.onActivityPostPaused(activity);
        }
    }

    public void onActivityPostResumed(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPostResumed : observers) {
            onActivityPostResumed.onActivityPostResumed(activity);
        }
    }

    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        AnonymousClass00C.A0D(bundle, 1);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPostSaveInstanceState : observers) {
            onActivityPostSaveInstanceState.onActivityPostSaveInstanceState(activity, bundle);
        }
    }

    public void onActivityPostStarted(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPostStarted : observers) {
            onActivityPostStarted.onActivityPostStarted(activity);
        }
    }

    public void onActivityPostStopped(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPostStopped : observers) {
            onActivityPostStopped.onActivityPostStopped(activity);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPreCreated : observers) {
            onActivityPreCreated.onActivityPreCreated(activity, bundle);
        }
    }

    public void onActivityPreDestroyed(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPreDestroyed : observers) {
            onActivityPreDestroyed.onActivityPreDestroyed(activity);
        }
    }

    public void onActivityPrePaused(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPrePaused : observers) {
            onActivityPrePaused.onActivityPrePaused(activity);
        }
    }

    public void onActivityPreResumed(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPreResumed : observers) {
            onActivityPreResumed.onActivityPreResumed(activity);
        }
    }

    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        AnonymousClass00C.A0D(bundle, 1);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPreSaveInstanceState : observers) {
            onActivityPreSaveInstanceState.onActivityPreSaveInstanceState(activity, bundle);
        }
    }

    public void onActivityPreStarted(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPreStarted : observers) {
            onActivityPreStarted.onActivityPreStarted(activity);
        }
    }

    public void onActivityPreStopped(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityPreStopped : observers) {
            onActivityPreStopped.onActivityPreStopped(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityResumed : observers) {
            onActivityResumed.onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        AnonymousClass00C.A0D(bundle, 1);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivitySaveInstanceState : observers) {
            onActivitySaveInstanceState.onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityStarted : observers) {
            onActivityStarted.onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        Iterable<Application.ActivityLifecycleCallbacks> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (Application.ActivityLifecycleCallbacks onActivityStopped : observers) {
            onActivityStopped.onActivityStopped(activity);
        }
    }
}
