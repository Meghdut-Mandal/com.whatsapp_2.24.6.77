package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.AYg  reason: case insensitive filesystem */
public class C21729AYg implements Callable {
    public final /* synthetic */ C202989n4 A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C21729AYg(C202989n4 r1, List list, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = list;
        this.A03 = z2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C202989n4 r3 = this.A00;
        AnonymousClass0YM.A02(r3.A01, "CameraDevice should not be null for createCaptureSession!");
        AnonymousClass0YM.A02(r3.A0C, "mPreviewSetupDelegate should not be null for createCaptureSession!");
        C12500iB r4 = new C12500iB(r3.A0O.A02);
        if (this.A02) {
            CameraDevice cameraDevice = r3.A01;
            List list = this.A01;
            A2R a2r = r3.A0L;
            A2L.A01(cameraDevice, a2r, list, r4);
            return a2r;
        }
        CameraDevice cameraDevice2 = r3.A01;
        List list2 = this.A01;
        boolean z = this.A03;
        A2R a2r2 = r3.A0L;
        A2K.A01(cameraDevice2, a2r2, list2, r4, z);
        return a2r2;
    }
}
