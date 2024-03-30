package X;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: X.6Zr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C133706Zr implements WifiP2pManager.ChannelListener {
    public final /* synthetic */ AnonymousClass6ON A00;

    public /* synthetic */ C133706Zr(AnonymousClass6ON r1) {
        this.A00 = r1;
    }

    public final void onChannelDisconnected() {
        C160457l2 r1 = this.A00.A02;
        if (r1 != null) {
            r1.BWa(602, "onChannelDisconnected");
        }
    }
}
