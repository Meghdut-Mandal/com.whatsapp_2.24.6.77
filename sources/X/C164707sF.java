package X;

import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: X.7sF  reason: invalid class name and case insensitive filesystem */
public class C164707sF implements WifiP2pManager.ConnectionInfoListener {
    public Object A00;
    public final int A01;

    public C164707sF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
        String hostAddress;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("fpm/WifiDirectManager/Connection information available. group_formed: ");
            A0u.append(wifiP2pInfo.groupFormed);
            A0u.append(" group_owner: ");
            C36331k8.A1S(A0u, wifiP2pInfo.isGroupOwner);
            C160457l2 r0 = ((AnonymousClass6ON) obj).A02;
            if (r0 != null) {
                r0.BbT(wifiP2pInfo);
                return;
            }
            return;
        }
        AnonymousClass5D7 r2 = (AnonymousClass5D7) obj;
        AnonymousClass00C.A0D(wifiP2pInfo, 1);
        if (wifiP2pInfo.isGroupOwner && (hostAddress = wifiP2pInfo.groupOwnerAddress.getHostAddress()) != null) {
            IntentFilter intentFilter = AnonymousClass6ON.A07;
            r2.A00.BYz(hostAddress);
        }
    }
}
