package X;

import android.net.wifi.p2p.WifiP2pInfo;
import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.Socket;

/* renamed from: X.6wS  reason: invalid class name and case insensitive filesystem */
public class C146966wS implements C160457l2 {
    public final /* synthetic */ AnonymousClass64J A00;

    public void BgM(String str) {
    }

    public C146966wS(AnonymousClass64J r1) {
        this.A00 = r1;
    }

    public void BUM() {
        Log.i("fpm/WifiDirectCreatorConnectionHandler/onConnectionChanged");
        AnonymousClass64J r2 = this.A00;
        C1497272n.A00(r2.A04, r2, 28);
    }

    public void BWa(int i, String str) {
        Log.i("fpm/WifiDirectCreatorConnectionHandler/onError");
        this.A00.A02.A02(602);
    }

    public void BbT(WifiP2pInfo wifiP2pInfo) {
        InetAddress inetAddress;
        Log.i("fpm/WifiDirectCreatorConnectionHandler/onNetworkConnected");
        AnonymousClass64J r4 = this.A00;
        Runnable runnable = r4.A01;
        if (runnable != null) {
            r4.A04.Bnx(runnable);
        }
        if (!wifiP2pInfo.isGroupOwner && (inetAddress = wifiP2pInfo.groupOwnerAddress) != null && inetAddress.getHostAddress() != null) {
            new AnonymousClass5D4(new C163857qs(r4, 0), wifiP2pInfo.groupOwnerAddress.getHostAddress(), new Socket()).start();
        }
    }
}
