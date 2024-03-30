package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.7u7  reason: invalid class name and case insensitive filesystem */
public class C165767u7 extends CameraCaptureSession.CaptureCallback {
    public final A2H A00 = new A2H();
    public final A2I A01 = new A2I();
    public final B2M A02;
    public final /* synthetic */ A2K A03;

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        CaptureRequest captureRequest2 = captureRequest;
        long j3 = j;
        long j4 = j2;
        super.onCaptureStarted(cameraCaptureSession, captureRequest2, j3, j4);
        this.A02.BTA(captureRequest2, this.A03, j3, j4);
    }

    public C165767u7(A2K a2k, B2M b2m) {
        this.A03 = a2k;
        this.A02 = b2m;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        A2I a2i = this.A01;
        a2i.A00 = totalCaptureResult;
        this.A02.BT8(a2i, this.A03);
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        A2H a2h = this.A00;
        a2h.A00 = captureFailure;
        this.A02.BT9(a2h, this.A03);
    }
}
