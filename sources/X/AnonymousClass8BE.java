package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.Log;

/* renamed from: X.8BE  reason: invalid class name */
public final class AnonymousClass8BE extends AnonymousClass0JC {
    public final /* synthetic */ C17590rf A00(Context context, Looper looper, C17610rh r13, C17620ri r14, AnonymousClass0TT r15, Object obj) {
        Context context2 = context;
        AnonymousClass8BX r4 = new AnonymousClass8BX(context2, looper, r13, r14, r15);
        if (context instanceof Activity) {
            Activity activity = (Activity) context2;
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()}));
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new C203939pC(activity, r4));
        }
        return r4;
    }
}
