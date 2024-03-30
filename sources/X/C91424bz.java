package X;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1;
import com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1;

/* renamed from: X.4bz  reason: invalid class name and case insensitive filesystem */
public final class C91424bz extends MediaProjection.Callback {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C107305Nn A01;

    public C91424bz(Context context, C107305Nn r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public void onCapturedContentResize(int i, int i2) {
        C107305Nn r4 = this.A01;
        AnonymousClass6PE r1 = r4.A03;
        if (i != r1.A02 || i2 != r1.A01) {
            Context context = this.A00;
            if (i % 2 != 0) {
                i--;
            }
            if (i2 % 2 != 0) {
                i2--;
            }
            C36331k8.A1T(new ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1(r4, new AnonymousClass6PE(i, i2, AnonymousClass000.A0X(context).densityDpi), (C023509x) null), C009403z.A02(AnonymousClass19R.A00));
        }
    }

    public void onStop() {
        C107305Nn r3 = this.A01;
        r3.A06 = true;
        r3.A0C.clearMediaProjectionHandle();
        C108345Td.A00(C108345Td.OTHER, r3.A0B);
        VirtualDisplay virtualDisplay = r3.A00;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        r3.A00 = null;
        r3.stopPeriodicCameraCallbackCheck();
        C36331k8.A1T(new ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(r3, (C023509x) null), C009403z.A02(r3.A0D));
    }
}
