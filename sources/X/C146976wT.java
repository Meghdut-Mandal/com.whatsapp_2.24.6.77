package X;

import android.net.wifi.p2p.WifiP2pInfo;
import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.6wT  reason: invalid class name and case insensitive filesystem */
public class C146976wT implements C160457l2 {
    public CountDownLatch A00;
    public final /* synthetic */ AnonymousClass6TN A01;

    public C146976wT(AnonymousClass6TN r1) {
        this.A01 = r1;
    }

    public void BUM() {
        Log.i("fpm/WifiDirectScannerConnectionHandler/onConnectionChanged");
        AnonymousClass6TN r2 = this.A01;
        C1497272n.A00(r2.A05, r2, 30);
    }

    public void BWa(int i, String str) {
        Log.i("fpm/WifiDirectScannerConnectionHandler/onError");
        AnonymousClass6TN r2 = this.A01;
        Runnable runnable = r2.A01;
        if (runnable != null) {
            r2.A05.Bnx(runnable);
        }
        r2.A03.A02(602);
    }

    public void BbT(WifiP2pInfo wifiP2pInfo) {
        Log.i("fpm/WifiDirectScannerConnectionHandler/onNetworkConnected");
        CountDownLatch countDownLatch = this.A00;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (wifiP2pInfo.isGroupOwner) {
            AnonymousClass6TN r3 = this.A01;
            new AnonymousClass5D3(new C163857qs(r3, 1), AnonymousClass6IS.A00).start();
            return;
        }
        InetAddress inetAddress = wifiP2pInfo.groupOwnerAddress;
        if (inetAddress != null && inetAddress.getHostAddress() != null) {
            this.A01.A04.A00(wifiP2pInfo.groupOwnerAddress.getHostAddress());
        }
    }

    public void BgM(String str) {
        Log.i("fpm/WifiDirectScannerConnectionHandler/onServiceFound");
        this.A00 = C90484aE.A0u();
        C36421kH.A1H(this.A01.A05, this, str, 3);
    }
}
