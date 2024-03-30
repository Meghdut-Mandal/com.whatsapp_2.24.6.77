package X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.7u9  reason: invalid class name and case insensitive filesystem */
public class C165787u9 extends CameraCaptureSession.StateCallback {
    public A2K A00;
    public final /* synthetic */ A2R A01;

    public C165787u9(A2R a2r) {
        this.A01 = a2r;
    }

    private A2K A00(CameraCaptureSession cameraCaptureSession) {
        A2K a2k = this.A00;
        if (a2k != null && a2k.A00 == cameraCaptureSession) {
            return a2k;
        }
        A2K a2k2 = new A2K(cameraCaptureSession);
        this.A00 = a2k2;
        return a2k2;
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        A2R a2r = this.A01;
        A00(cameraCaptureSession);
        if (a2r.A03 == 1) {
            a2r.A03 = 0;
            a2r.A05 = false;
            a2r.A01.A01();
        }
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        A2R a2r = this.A01;
        A2K A002 = A00(cameraCaptureSession);
        if (a2r.A03 == 1) {
            a2r.A03 = 0;
            a2r.A05 = true;
            a2r.A04 = A002;
            a2r.A01.A01();
        }
    }

    public void onActive(CameraCaptureSession cameraCaptureSession) {
        super.onActive(cameraCaptureSession);
        A2R a2r = this.A01;
        A00(cameraCaptureSession);
        C191259Cg r1 = a2r.A00;
        if (r1 != null) {
            r1.A00.A0O.A00(new C1691988d(), "camera_session_active", new B8U((Object) r1, 13));
        }
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        A2R a2r = this.A01;
        A2K A002 = A00(cameraCaptureSession);
        if (a2r.A03 == 2) {
            a2r.A03 = 0;
            a2r.A05 = C36371kC.A0m();
            a2r.A04 = A002;
            a2r.A01.A01();
        }
    }

    public void onReady(CameraCaptureSession cameraCaptureSession) {
        super.onReady(cameraCaptureSession);
        A2R a2r = this.A01;
        A2K A002 = A00(cameraCaptureSession);
        if (a2r.A03 == 3) {
            a2r.A03 = 0;
            a2r.A05 = C36371kC.A0m();
            a2r.A04 = A002;
            a2r.A01.A01();
        }
    }
}
