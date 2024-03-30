package X;

import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: X.6Zu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C133736Zu implements WifiP2pManager.GroupInfoListener {
    public final /* synthetic */ AnonymousClass5D7 A00;

    public /* synthetic */ C133736Zu(AnonymousClass5D7 r1) {
        this.A00 = r1;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        AnonymousClass5D7 r3 = this.A00;
        AnonymousClass00C.A0D(wifiP2pGroup, 1);
        if (wifiP2pGroup.isGroupOwner()) {
            String networkName = wifiP2pGroup.getNetworkName();
            String passphrase = wifiP2pGroup.getPassphrase();
            IntentFilter intentFilter = AnonymousClass6ON.A07;
            r3.A00.Bfe(networkName, passphrase);
        }
    }
}
