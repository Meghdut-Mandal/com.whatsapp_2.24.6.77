package X;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.7uC  reason: invalid class name and case insensitive filesystem */
public class C165817uC extends CameraExtensionSession.ExtensionCaptureCallback {
    public B2M A00;
    public final A2G A01 = new A2G();
    public final A2J A02 = new A2J();
    public final /* synthetic */ A2L A03;

    public C165817uC(B2M b2m, A2L a2l) {
        this.A03 = a2l;
        this.A00 = b2m;
    }

    public void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        B2M b2m = this.A00;
        if (b2m != null) {
            b2m.BT9(this.A01, this.A03);
        }
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        A2J a2j = this.A02;
        a2j.A00 = totalCaptureResult;
        B2M b2m = this.A00;
        if (b2m != null) {
            b2m.BT8(a2j, this.A03);
        }
    }

    public void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        B2M b2m = this.A00;
        if (b2m != null) {
            b2m.BT8(this.A02, this.A03);
        }
    }

    public void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        B2M b2m = this.A00;
        if (b2m != null) {
            b2m.BTA(captureRequest, this.A03, j, 0);
        }
    }
}
