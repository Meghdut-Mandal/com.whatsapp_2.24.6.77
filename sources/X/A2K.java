package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public class A2K implements B31 {
    public final CameraCaptureSession A00;

    public int B2a(CaptureRequest captureRequest, Handler handler, B2M b2m) {
        C165767u7 r0;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (b2m != null) {
            r0 = new C165767u7(this, b2m);
        } else {
            r0 = null;
        }
        return cameraCaptureSession.capture(captureRequest, r0, (Handler) null);
    }

    public boolean BLk() {
        return false;
    }

    public int Brx(CaptureRequest captureRequest, Handler handler, B2M b2m) {
        C165767u7 r0;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (b2m != null) {
            r0 = new C165767u7(this, b2m);
        } else {
            r0 = null;
        }
        return cameraCaptureSession.setRepeatingRequest(captureRequest, r0, (Handler) null);
    }

    public static void A00(CameraDevice cameraDevice, A2R a2r, List list, Executor executor) {
        long j;
        C165787u9 r6 = new C165787u9(a2r);
        ArrayList A0I = AnonymousClass001.A0I();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass9JM r8 = (AnonymousClass9JM) list.get(i);
            OutputConfiguration outputConfiguration = new OutputConfiguration(r8.A02);
            outputConfiguration.setStreamUseCase(r8.A01);
            if (r8.A00 != 1) {
                j = 1;
            } else {
                j = 2;
            }
            outputConfiguration.setDynamicRangeProfile(j);
            A0I.add(outputConfiguration);
        }
        List emptyList = Collections.emptyList();
        int size2 = emptyList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            A0I.add(new OutputConfiguration((Surface) emptyList.get(i2)));
        }
        cameraDevice.createCaptureSession(new SessionConfiguration(0, A0I, executor, r6));
    }

    public void Azq() {
        this.A00.abortCaptures();
    }

    public void close() {
        this.A00.close();
    }

    public A2K(CameraCaptureSession cameraCaptureSession) {
        this.A00 = cameraCaptureSession;
    }

    public static void A01(CameraDevice cameraDevice, A2R a2r, List list, Executor executor, boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0I.add(((AnonymousClass9JM) list.get(i)).A02);
        }
        if (Build.VERSION.SDK_INT < 33 || !z) {
            cameraDevice.createCaptureSession(A0I, new C165787u9(a2r), (Handler) null);
        } else {
            A00(cameraDevice, a2r, list, executor);
        }
    }
}
