package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1V4  reason: invalid class name */
public class AnonymousClass1V4 extends BroadcastReceiver implements C19710wO {
    public boolean A00;
    public final Set A01 = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Context A02;

    public String BIB() {
        return "HeadsetPluggedStateMonitor";
    }

    public /* synthetic */ void BRM() {
    }

    public void BRL() {
        C26981Mg.A01(this, this.A02, new IntentFilter("android.intent.action.HEADSET_PLUG"), true);
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = false;
        int intExtra = intent.getIntExtra("state", 0);
        if (intExtra >= 1) {
            z = true;
        }
        if (z != this.A00) {
            this.A00 = z;
            for (AnonymousClass1V5 BYr : this.A01) {
                BYr.BYr(z);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("HeadsetPluggedStateMonitor/headset ");
        sb.append(intExtra);
        Log.i(sb.toString());
    }

    public AnonymousClass1V4(Context context) {
        this.A02 = context;
    }
}
