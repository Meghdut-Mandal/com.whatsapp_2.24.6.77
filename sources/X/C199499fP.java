package X;

import android.app.Activity;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* renamed from: X.9fP  reason: invalid class name and case insensitive filesystem */
public class C199499fP {
    public DisplayManager.DisplayListener A00;
    public C22950Az2 A01;
    public final C19630wG A02;
    public final C20810yC A03;

    public static void A00(Activity activity) {
        if (activity != null) {
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(activity.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsBlockScreenShareActivity");
            A0D.addFlags(536870912);
            activity.finish();
            activity.startActivity(A0D);
        }
    }

    public void A01(C22950Az2 az2) {
        if (!this.A03.A0E(1734)) {
            return;
        }
        if (A02()) {
            az2.Bfq();
            return;
        }
        this.A01 = az2;
        DisplayManager displayManager = (DisplayManager) this.A02.A00.getSystemService("display");
        DisplayManager.DisplayListener displayListener = this.A00;
        if (displayListener == null) {
            displayListener = new C204259pi(displayManager, this);
            this.A00 = displayListener;
        }
        displayManager.registerDisplayListener(displayListener, (Handler) null);
    }

    public boolean A02() {
        Display[] displays = ((DisplayManager) this.A02.A00.getSystemService("display")).getDisplays();
        int length = displays.length;
        if (length <= 1) {
            return false;
        }
        int i = 1;
        while ((displays[i].getFlags() & 2) <= 0) {
            i++;
            if (i >= length) {
                return false;
            }
        }
        return true;
    }

    public C199499fP(C19630wG r1, C20810yC r2) {
        this.A03 = r2;
        this.A02 = r1;
    }
}
