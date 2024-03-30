package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.18R  reason: invalid class name */
public class AnonymousClass18R extends AnonymousClass18Q {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    private void A00(Activity activity) {
        this.A01.get();
        Intent className = new Intent().setClassName(activity.getPackageName(), "com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity");
        className.putExtra("blocking_type", 0);
        activity.startActivity(className);
        activity.finish();
    }

    public AnonymousClass18R(AnonymousClass005 r1, AnonymousClass005 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        if ((activity instanceof AnonymousClass155) && Boolean.TRUE.equals(((AnonymousClass1Q9) this.A00.get()).A03.A04())) {
            Log.i("LockedForBackupLifecycleObserver/onActivityCreated redirect to BlockingUserInteractionActivity");
            A00(activity);
        }
    }

    public void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if ((activity instanceof AnonymousClass155) && Boolean.TRUE.equals(((AnonymousClass1Q9) this.A00.get()).A03.A04())) {
            Log.i("LockedForBackupLifecycleObserver/onActivityStarted redirect to BlockingUserInteractionActivity");
            A00(activity);
        }
    }
}
