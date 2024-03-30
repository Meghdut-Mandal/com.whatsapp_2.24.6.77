package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1ke  reason: invalid class name and case insensitive filesystem */
public class C36621ke extends BroadcastReceiver {
    public final /* synthetic */ HomeActivity A00;
    public final /* synthetic */ Runnable A01;

    public C36621ke(HomeActivity homeActivity, Runnable runnable) {
        this.A00 = homeActivity;
        this.A01 = runnable;
    }

    public void onReceive(Context context, Intent intent) {
        Log.i("home/resume/unlocked received ACTION_USER_PRESENT");
        try {
            HomeActivity homeActivity = this.A00;
            homeActivity.unregisterReceiver(this);
            AnonymousClass17Y r0 = homeActivity.A05;
            Runnable runnable = this.A01;
            r0.A0G(runnable);
            homeActivity.A05.A0I(runnable, 500);
            homeActivity.A0B = null;
        } catch (Exception e) {
            Log.e("home/resume/unlocked received ACTION_USER_PRESENT ", e);
        }
    }
}
