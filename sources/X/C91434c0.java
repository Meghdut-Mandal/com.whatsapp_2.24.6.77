package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.4c0  reason: invalid class name and case insensitive filesystem */
public class C91434c0 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ AnonymousClass6VN A00;
    public final /* synthetic */ ScheduledFuture A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ void A00(Network network, ScheduledFuture scheduledFuture, boolean z) {
        scheduledFuture.cancel(false);
        AnonymousClass6VN r1 = this.A00;
        if (r1.A00 == null) {
            Log.i("voip/weak-wifi/onAvailable: network callback is already unregistered");
        } else if (r1.A02 != null) {
            Log.i("voip/weak-wifi/onAvailable: onAvailable() is called multiple times");
            Voip.notifyLostOfAlternativeNetwork();
        } else {
            AnonymousClass6VN.A00(network, r1, z);
        }
    }

    public /* synthetic */ void A01(ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
        if (this.A00.A00 == null) {
            Log.i("voip/weak-wifi/onLost: network callback is already unregistered");
        } else {
            Voip.notifyLostOfAlternativeNetwork();
        }
    }

    public /* synthetic */ void A02(ScheduledFuture scheduledFuture, boolean z) {
        scheduledFuture.cancel(false);
        AnonymousClass6VN r1 = this.A00;
        if (r1.A00 == null) {
            Log.i("voip/weak-wifi/onUnavailable: network callback is already unregistered");
            return;
        }
        r1.A00 = null;
        r1.A01 = null;
        Voip.notifyFailureToCreateAlternativeSocket(z);
    }

    public C91434c0(AnonymousClass6VN r1, ScheduledFuture scheduledFuture, boolean z) {
        this.A00 = r1;
        this.A01 = scheduledFuture;
        this.A02 = z;
    }

    public void onAvailable(Network network) {
        Log.i("voip/weak-wifi/onAvailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
            return;
        }
        scheduledExecutorService.execute(new AnonymousClass755(this, this.A01, network, 3, this.A02));
    }

    public void onLost(Network network) {
        Log.i("voip/weak-wifi/onLost");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new C1501874h(this, this.A01, 31));
        }
    }

    public void onUnavailable() {
        Log.i("voip/weak-wifi/onUnavailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new AnonymousClass752(this, this.A01, 8, this.A02));
        }
    }
}
