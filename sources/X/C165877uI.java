package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.7uI  reason: invalid class name and case insensitive filesystem */
public final class C165877uI extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C1684080m A00;

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AnonymousClass00C.A0D(networkCapabilities, 1);
        AnonymousClass6VD.A00().A04(C202789mf.A00, AnonymousClass000.A0l(networkCapabilities, "Network capabilities changed: ", AnonymousClass000.A0u()));
        C1684080m r1 = this.A00;
        r1.A04(C202789mf.A01(r1.A00));
    }

    public C165877uI(C1684080m r1) {
        this.A00 = r1;
    }

    public void onLost(Network network) {
        AnonymousClass6VD.A00().A04(C202789mf.A00, "Network connection lost");
        C1684080m r1 = this.A00;
        r1.A04(C202789mf.A01(r1.A00));
    }
}
