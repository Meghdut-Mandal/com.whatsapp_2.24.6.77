package X;

import android.hardware.Camera;

/* renamed from: X.6rx  reason: invalid class name and case insensitive filesystem */
public class C144296rx implements AnonymousClass7gK {
    public final C121505tF A00 = new C121505tF();
    public final /* synthetic */ C1030553k A01;

    public synchronized C121505tF B80() {
        C121505tF r4;
        r4 = this.A00;
        byte[] bArr = r4.A02;
        if (bArr != null) {
            C1030553k r2 = this.A01;
            Camera camera = r2.A07;
            if (camera != null && !r2.A0O && bArr == r2.A0P) {
                camera.addCallbackBuffer(bArr);
            }
            r4.A02 = null;
        }
        while (r4.A02 == null) {
            wait();
        }
        return r4;
    }

    public C144296rx(C1030553k r2) {
        this.A01 = r2;
    }
}
