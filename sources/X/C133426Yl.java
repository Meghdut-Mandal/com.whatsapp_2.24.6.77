package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.6Yl  reason: invalid class name and case insensitive filesystem */
public final class C133426Yl implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        synchronized (AnonymousClass6J4.A01) {
            if (!(!AnonymousClass6J4.A02.containsKey(activity))) {
                throw AnonymousClass001.A09("The MountContentPools has a reference to an activity that has just been created");
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        synchronized (AnonymousClass6J4.A01) {
            Map map = AnonymousClass6J4.A02;
            map.remove(activity);
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Context context = (Context) AnonymousClass000.A11(A0y).getKey();
                Context context2 = activity;
                while (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                    AnonymousClass00C.A08(context2);
                }
                while (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                    AnonymousClass00C.A08(context);
                }
                if (context == context2) {
                    A0y.remove();
                }
            }
            WeakHashMap weakHashMap = AnonymousClass6J4.A03;
            Context context3 = activity;
            while ((context3 instanceof ContextWrapper) && !(context3 instanceof Activity) && !(context3 instanceof Application) && !(context3 instanceof Service)) {
                Context baseContext = ((ContextWrapper) context3).getBaseContext();
                AnonymousClass00C.A08(baseContext);
                context3 = baseContext;
            }
            weakHashMap.put(context3, C36371kC.A0m());
        }
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
}
