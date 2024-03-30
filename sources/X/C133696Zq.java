package X;

import android.net.wifi.p2p.WifiP2pManager;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Zq  reason: invalid class name and case insensitive filesystem */
public class C133696Zq implements WifiP2pManager.ActionListener {
    public int A00 = -1;
    public final String A01;
    public final CountDownLatch A02;

    public boolean A00() {
        try {
            if (!this.A02.await(5000, TimeUnit.MILLISECONDS)) {
                StringBuilder A0v = AnonymousClass000.A0v("fpm/WifiDirectManager/ActionListener [");
                A0v.append(this.A01);
                A0v.append("] timed out after ");
                A0v.append(5000);
                C36321k7.A1a(A0v, "ms");
                this.A00 = 3;
                return false;
            }
        } catch (InterruptedException unused) {
            StringBuilder A0v2 = AnonymousClass000.A0v("fpm/WifiDirectManager/ActionListener [");
            A0v2.append(this.A01);
            C36321k7.A1a(A0v2, "] interrupted");
        }
        if (this.A00 == -1) {
            return true;
        }
        return false;
    }

    public C133696Zq(String str) {
        this.A01 = str;
        this.A02 = C90484aE.A0u();
    }

    public void onFailure(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("fpm/WifiDirectManager/");
        A0u.append(this.A01);
        C36321k7.A1U(" failure_reason: ", A0u, i);
        this.A00 = i;
        this.A02.countDown();
    }

    public void onSuccess() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("fpm/WifiDirectManager/");
        A0u.append(this.A01);
        C36321k7.A1a(A0u, " success");
        this.A02.countDown();
    }
}
