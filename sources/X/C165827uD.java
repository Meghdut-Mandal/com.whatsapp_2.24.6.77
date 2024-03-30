package X;

import android.hardware.camera2.CameraExtensionSession;
import java.util.concurrent.Executor;

/* renamed from: X.7uD  reason: invalid class name and case insensitive filesystem */
public class C165827uD extends CameraExtensionSession.StateCallback {
    public A2L A00;
    public final /* synthetic */ A2R A01;
    public final /* synthetic */ Executor A02;

    public C165827uD(A2R a2r, Executor executor) {
        this.A01 = a2r;
        this.A02 = executor;
    }

    public void onClosed(CameraExtensionSession cameraExtensionSession) {
        A2R a2r = this.A01;
        Executor executor = this.A02;
        A2L a2l = this.A00;
        if (a2l == null || a2l.A00 != cameraExtensionSession) {
            a2l = new A2L(cameraExtensionSession, executor);
            this.A00 = a2l;
        }
        if (a2r.A03 == 2) {
            a2r.A03 = 0;
            a2r.A05 = C36371kC.A0m();
            a2r.A04 = a2l;
            a2r.A01.A01();
        }
    }

    public void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        A2R a2r = this.A01;
        Executor executor = this.A02;
        A2L a2l = this.A00;
        if (a2l == null || a2l.A00 != cameraExtensionSession) {
            this.A00 = new A2L(cameraExtensionSession, executor);
        }
        if (a2r.A03 == 1) {
            a2r.A03 = 0;
            a2r.A05 = false;
            a2r.A01.A01();
        }
    }

    public void onConfigured(CameraExtensionSession cameraExtensionSession) {
        A2R a2r = this.A01;
        Executor executor = this.A02;
        A2L a2l = this.A00;
        if (a2l == null || a2l.A00 != cameraExtensionSession) {
            a2l = new A2L(cameraExtensionSession, executor);
            this.A00 = a2l;
        }
        if (a2r.A03 == 1) {
            a2r.A03 = 0;
            a2r.A05 = true;
            a2r.A04 = a2l;
            a2r.A01.A01();
        }
    }
}
