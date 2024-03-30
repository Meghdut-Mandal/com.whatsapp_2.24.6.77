package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* renamed from: X.80m  reason: invalid class name and case insensitive filesystem */
public final class C1684080m extends AnonymousClass9YC {
    public final ConnectivityManager A00;
    public final C165877uI A01 = new C165877uI(this);

    public /* bridge */ /* synthetic */ Object A05() {
        return C202789mf.A01(this.A00);
    }

    public void A06() {
        try {
            AnonymousClass6VD.A00().A04(C202789mf.A00, "Registering network callback");
            A01(this.A01, this.A00);
        } catch (IllegalArgumentException | SecurityException e) {
            AnonymousClass6VD.A00();
            Log.e(C202789mf.A00, "Received exception while registering network callback", e);
        }
    }

    public void A07() {
        try {
            AnonymousClass6VD.A00().A04(C202789mf.A00, "Unregistering network callback");
            A02(this.A01, this.A00);
        } catch (IllegalArgumentException | SecurityException e) {
            AnonymousClass6VD.A00();
            Log.e(C202789mf.A00, "Received exception while unregistering network callback", e);
        }
    }

    public C1684080m(Context context, AnonymousClass7eB r4) {
        super(context, r4);
        Object systemService = this.A01.getSystemService("connectivity");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
    }

    public static final void A01(ConnectivityManager.NetworkCallback networkCallback, ConnectivityManager connectivityManager) {
        C36321k7.A0w(connectivityManager, networkCallback);
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    public static final void A02(ConnectivityManager.NetworkCallback networkCallback, ConnectivityManager connectivityManager) {
        C36321k7.A0w(connectivityManager, networkCallback);
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
