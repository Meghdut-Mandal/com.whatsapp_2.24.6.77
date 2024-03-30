package X;

import android.hardware.Camera;
import android.os.Handler;

/* renamed from: X.3WJ  reason: invalid class name */
public class AnonymousClass3WJ implements Camera.AutoFocusCallback {
    public final /* synthetic */ C37461mP A00;

    public AnonymousClass3WJ(C37461mP r1) {
        this.A00 = r1;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        C37461mP r4 = this.A00;
        Handler handler = r4.A04;
        Runnable runnable = r4.A0N;
        if (handler != null) {
            handler.postDelayed(runnable, 2000);
        } else {
            r4.postDelayed(runnable, 2000);
        }
    }
}
