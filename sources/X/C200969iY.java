package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.9iY  reason: invalid class name and case insensitive filesystem */
public final class C200969iY {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C204249ph A0A;
    public final C204379pu A0B;

    public static void A00(C200969iY r4) {
        Display defaultDisplay = r4.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            r4.A06 = refreshRate;
            r4.A07 = (refreshRate * 80) / 100;
        }
    }

    public C200969iY(Context context) {
        C204249ph r0;
        if (context != null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            this.A09 = windowManager;
            if (windowManager != null) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager == null) {
                    r0 = null;
                } else {
                    r0 = new C204249ph(displayManager, this);
                }
                this.A0A = r0;
                this.A0B = C204379pu.A05;
            }
            this.A0A = null;
            this.A0B = null;
        } else {
            this.A09 = null;
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public C200969iY() {
        this((Context) null);
    }
}
