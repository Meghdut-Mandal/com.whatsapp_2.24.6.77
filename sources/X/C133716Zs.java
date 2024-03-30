package X;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import com.whatsapp.util.Log;

/* renamed from: X.6Zs  reason: invalid class name and case insensitive filesystem */
public class C133716Zs implements WifiP2pManager.DnsSdServiceResponseListener {
    public final /* synthetic */ AnonymousClass5D6 A00;

    public C133716Zs(AnonymousClass5D6 r1) {
        this.A00 = r1;
    }

    public void onDnsSdServiceAvailable(String str, String str2, WifiP2pDevice wifiP2pDevice) {
        AnonymousClass5D6 r1 = this.A00;
        if (str.equals(r1.A03)) {
            Log.i("fpm/WifiDirectScannerManager/Service discovered, instance name: matching, session ID: matching");
            C160457l2 r12 = r1.A02;
            if (r12 != null) {
                r12.BgM(wifiP2pDevice.deviceAddress);
            }
        } else if (str.contains("_chattransfer._whatsapp.com")) {
            Log.i("fpm/WifiDirectScannerManager/Service discovered, instance name: matching, session ID: not matching");
            C160457l2 r13 = r1.A02;
            if (r13 != null) {
                r13.BWa(602, "fpm/WifiDirectScannerManager/Service discovered, instance name: matching, session ID: not matching");
            }
        } else {
            Log.i("fpm/WifiDirectScannerManager/Service discovered, instance name: not matching");
        }
    }
}
