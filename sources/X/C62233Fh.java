package X;

import android.os.PowerManager;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.3Fh  reason: invalid class name and case insensitive filesystem */
public class C62233Fh {
    public float A00 = -1.0f;

    public void A00(Window window) {
        window.clearFlags(128);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = this.A00;
        window.setAttributes(attributes);
    }

    public void A01(Window window, C21060yb r4) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.A00 = attributes.screenBrightness;
        PowerManager A0G = r4.A0G();
        if (A0G != null && !A0G.isPowerSaveMode()) {
            window.addFlags(128);
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
        }
    }
}
