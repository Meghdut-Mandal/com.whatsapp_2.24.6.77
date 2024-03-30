package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;

/* renamed from: X.1lf  reason: invalid class name and case insensitive filesystem */
public class C37011lf extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C19420v0 A00;
    public final /* synthetic */ AnonymousClass4TZ A01;

    public C37011lf(C19420v0 r1, AnonymousClass4TZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onAvailable(Network network) {
        Log.i("RegistrationUtils/maybeExecuteSilentAuthRequestOnCellular/requestNetwork/cellular is available");
        this.A01.BRf(network);
    }

    public void onUnavailable() {
        Log.e("RegistrationUtils/maybeExecuteSilentAuthRequestOnCellular/requestNetwork/cellular network is unavailable");
        this.A00.A1Y("silent_auth_no_cellular");
        this.A01.Bjl();
    }
}
