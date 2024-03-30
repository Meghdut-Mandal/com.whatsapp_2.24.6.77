package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.whatsapp.util.Log;

/* renamed from: X.4az  reason: invalid class name and case insensitive filesystem */
public class C90854az extends BroadcastReceiver {
    public C160457l2 A00;

    public C90854az(C160457l2 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo == null) {
                Log.w("fpm/WifiDirectManager/WiFi P2P broadcast connection changed action with null network info.");
            } else if (!networkInfo.isConnected()) {
                Log.i("fpm/WifiDirectManager/WiFi P2P broadcast connection changed action, network not connected");
            } else {
                C160457l2 r0 = this.A00;
                if (r0 != null) {
                    r0.BUM();
                }
            }
        }
    }
}
