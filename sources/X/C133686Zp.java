package X;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: X.6Zp  reason: invalid class name and case insensitive filesystem */
public final class C133686Zp implements WifiP2pManager.ActionListener {
    public final /* synthetic */ AnonymousClass5D7 A00;

    public void onFailure(int i) {
    }

    public C133686Zp(AnonymousClass5D7 r1) {
        this.A00 = r1;
    }

    public void onSuccess() {
        new C162367oT(this.A00).start();
    }
}
