package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.9pi  reason: invalid class name and case insensitive filesystem */
public class C204259pi implements DisplayManager.DisplayListener {
    public final /* synthetic */ DisplayManager A00;
    public final /* synthetic */ C199499fP A01;

    public void onDisplayChanged(int i) {
    }

    public void onDisplayRemoved(int i) {
    }

    public C204259pi(DisplayManager displayManager, C199499fP r2) {
        this.A01 = r2;
        this.A00 = displayManager;
    }

    public void onDisplayAdded(int i) {
        C199499fP r2 = this.A01;
        if (r2.A02()) {
            C22950Az2 az2 = r2.A01;
            if (az2 != null) {
                az2.Bfq();
            }
            this.A00.unregisterDisplayListener(r2.A00);
        }
    }
}
