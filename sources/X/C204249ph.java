package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.9ph  reason: invalid class name and case insensitive filesystem */
public final class C204249ph implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C200969iY A01;

    public void onDisplayAdded(int i) {
    }

    public void onDisplayRemoved(int i) {
    }

    public C204249ph(DisplayManager displayManager, C200969iY r2) {
        this.A01 = r2;
        this.A00 = displayManager;
    }

    public void onDisplayChanged(int i) {
        if (i == 0) {
            C200969iY.A00(this.A01);
        }
    }
}
