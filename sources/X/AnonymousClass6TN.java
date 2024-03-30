package X;

import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6TN  reason: invalid class name */
public class AnonymousClass6TN {
    public static final long A08 = TimeUnit.SECONDS.toMillis(15);
    public AnonymousClass5D6 A00;
    public Runnable A01;
    public int A02 = 0;
    public final C105535Fa A03;
    public final AnonymousClass615 A04;
    public final C19770wU A05;
    public final C117535mQ A06;
    public final String A07;

    public static void A00(AnonymousClass6TN r1) {
        if (r1.A00 != null) {
            Log.i("fpm/WifiDirectScannerConnectionHandler/stopping WifiDirect");
            r1.A00.A00();
            r1.A00 = null;
        }
    }

    public void A01() {
        int i = this.A02 + 1;
        this.A02 = i;
        if (i > 3) {
            Log.i("fpm/WifiDirectScannerConnectionHandler/retryServiceDiscovery/maximum retries reached, reporting error");
            this.A03.A02(603);
            return;
        }
        Log.i("fpm/WifiDirectScannerConnectionHandler/retryServiceDiscovery/restarting WiFiDirect since peer has not been discovered");
        A00(this);
        A02();
    }

    public void A02() {
        AnonymousClass5D6 r2 = new AnonymousClass5D6(this.A06.A00.A03);
        this.A00 = r2;
        r2.A01(new C146976wT(this), this.A07);
        AnonymousClass5D6 r4 = this.A00;
        if (r4.A00 != null) {
            Log.w("fpm/WifiDirectScannerManager/Discover service already called and active.");
        } else {
            WifiP2pManager wifiP2pManager = r4.A01;
            if (wifiP2pManager == null) {
                Log.e("fpm/WifiDirectScannerManager/Trying to start service discovery without manager");
            } else {
                wifiP2pManager.setDnsSdResponseListeners(r4.A00, new C133716Zs(r4), C133726Zt.A00);
                r4.A00 = WifiP2pDnsSdServiceRequest.newInstance();
                C133696Zq r3 = new C133696Zq("add service request");
                r4.A01.addServiceRequest(r4.A00, r4.A00, r3);
                C133696Zq r22 = new C133696Zq("discover services");
                r4.A01.discoverServices(r4.A00, r22);
                if (r3.A00() && r22.A00()) {
                    this.A01 = this.A05.BpM(new C1497272n(this, 29), "fpm/WifiDirectScannerConnectionHandler/startServiceDiscovery", A08);
                    Log.i("fpm/WifiDirectScannerConnectionHandler/started service discovery and scheduled pending restart");
                    Iterator A0s = C36361kB.A0s(this.A03);
                    while (A0s.hasNext()) {
                        ((C146936wP) A0s.next()).A00.A0Y.A02(16);
                    }
                    return;
                }
            }
        }
        AnonymousClass5D6 r0 = this.A00;
        WifiP2pManager wifiP2pManager2 = r0.A01;
        if (wifiP2pManager2 != null) {
            wifiP2pManager2.clearServiceRequests(r0.A00, new C133696Zq("clearServiceRequests"));
        }
        A00(this);
        this.A03.A02(602);
    }

    public AnonymousClass6TN(C105535Fa r2, AnonymousClass615 r3, C117535mQ r4, C19770wU r5, String str) {
        this.A07 = str;
        this.A05 = r5;
        this.A03 = r2;
        this.A06 = r4;
        this.A04 = r3;
    }
}
