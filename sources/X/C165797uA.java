package X;

import android.hardware.camera2.CameraDevice;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.7uA  reason: invalid class name and case insensitive filesystem */
public class C165797uA extends CameraDevice.StateCallback {
    public final /* synthetic */ C183828rQ A00;

    public C165797uA(C183828rQ r1) {
        this.A00 = r1;
    }

    public void onClosed(CameraDevice cameraDevice) {
        C183828rQ r1 = this.A00;
        r1.A00 = 0;
        Log.i("voip/video/VoipCamera/ cameraDevice closed");
        if (r1.A05) {
            r1.A05 = false;
            if (r1.startOnCameraThread() != 0) {
                r1.cameraEventsDispatcher.A01();
            }
        }
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        C183828rQ r1 = this.A00;
        if (cameraDevice == r1.A01) {
            Log.i("voip/video/VoipCamera/ cameraDevice disconnected");
            r1.stopPeriodicCameraCallbackCheck();
            C195779Vx r3 = r1.cameraEventsDispatcher;
            Iterator it = r3.A00.iterator();
            while (it.hasNext()) {
                ((B3F) it.next()).BX6(r3.A01);
            }
        }
    }

    public void onOpened(CameraDevice cameraDevice) {
        Log.i("voip/video/VoipCamera/ camera opened");
        C183828rQ r1 = this.A00;
        r1.A00 = 2;
        r1.A01 = cameraDevice;
        if (r1.videoPort != null && C183828rQ.A00(r1) != 0) {
            r1.cameraEventsDispatcher.A01();
        }
    }

    public void onError(CameraDevice cameraDevice, int i) {
        C36321k7.A1T("voip/video/VoipCamera/ cameraDevice error ", AnonymousClass000.A0u(), i);
        this.A00.cameraEventsDispatcher.A01();
    }
}
