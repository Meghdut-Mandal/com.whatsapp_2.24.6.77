package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.4ar  reason: invalid class name and case insensitive filesystem */
public abstract class C90804ar extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C120605rm r4 = C120605rm.A02;
            if (r4 == null) {
                r4 = new C120605rm(context);
                C120605rm.A02 = r4;
            }
            C1503374w r3 = new C1503374w(this, context, intent, 14);
            PowerManager.WakeLock newWakeLock = r4.A00.newWakeLock(1, "FBNSPreloadWakefulExecutor");
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            try {
                C1503374w.A01(r4, r3, newWakeLock, r4.A01, 15);
            } catch (RejectedExecutionException e) {
                Log.e("FBNSPreloadWakefulExecutor/Notification skipped", e);
                newWakeLock.release();
            }
        }
    }
}
