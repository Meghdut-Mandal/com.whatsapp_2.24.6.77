package X;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.63K  reason: invalid class name */
public final class AnonymousClass63K {
    public boolean A00 = false;
    public final Intent A01;
    public final BroadcastReceiver.PendingResult A02;
    public final ScheduledFuture A03;

    public final synchronized void A00() {
        if (!this.A00) {
            this.A02.finish();
            this.A03.cancel(false);
            this.A00 = true;
        }
    }

    public AnonymousClass63K(BroadcastReceiver.PendingResult pendingResult, Intent intent, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = intent;
        this.A02 = pendingResult;
        this.A03 = scheduledExecutorService.schedule(AnonymousClass74N.A00(this, intent, 28), 9000, TimeUnit.MILLISECONDS);
    }
}
