package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class A2L implements B31 {
    public final CameraExtensionSession A00;
    public final Executor A01;

    public static void A01(CameraDevice cameraDevice, A2R a2r, List list, Executor executor) {
        ArrayList A0I = AnonymousClass001.A0I();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0I.add(new OutputConfiguration(((AnonymousClass9JM) list.get(i)).A02));
        }
        cameraDevice.createExtensionSession(new ExtensionSessionConfiguration(4, A0I, executor, new C165827uD(a2r, executor)));
    }

    public void Azq() {
    }

    public boolean BLk() {
        return true;
    }

    public int B2a(CaptureRequest captureRequest, Handler handler, B2M b2m) {
        return this.A00.capture(captureRequest, this.A01, new C165817uC(b2m, this));
    }

    public int Brx(CaptureRequest captureRequest, Handler handler, B2M b2m) {
        return this.A00.setRepeatingRequest(captureRequest, this.A01, new C165817uC(b2m, this));
    }

    public void close() {
        try {
            this.A00.close();
        } catch (CameraAccessException unused) {
            C202389lj.A02("Camera2ExtensionSession", "CameraAccessException on close()!");
        }
    }

    public A2L(CameraExtensionSession cameraExtensionSession, Executor executor) {
        this.A00 = cameraExtensionSession;
        this.A01 = executor;
    }
}
