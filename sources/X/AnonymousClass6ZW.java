package X;

import android.hardware.Camera;

/* renamed from: X.6ZW  reason: invalid class name */
public class AnonymousClass6ZW implements Camera.PreviewCallback {
    public Camera.Size A00;
    public boolean A01 = true;
    public final /* synthetic */ C1030553k A02;

    public AnonymousClass6ZW(C1030553k r2) {
        this.A02 = r2;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        boolean z;
        Camera camera2;
        if (this.A01) {
            this.A01 = false;
            this.A02.A0H.A01("cameraView1");
        }
        if (this.A00 == null) {
            try {
                this.A00 = camera.getParameters().getPreviewSize();
            } catch (RuntimeException unused) {
            }
        }
        Camera.Size size = this.A00;
        if (size != null) {
            C1030553k r5 = this.A02;
            C144296rx r4 = r5.A0W;
            int i = size.width;
            int i2 = size.height;
            synchronized (r4) {
                C121505tF r1 = r4.A00;
                if (r1.A02 == null) {
                    r1.A02 = bArr;
                    r1.A01 = i;
                    r1.A00 = i2;
                    r4.notify();
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z && (camera2 = r5.A07) != null && !r5.A0O && bArr == r5.A0P) {
                camera2.addCallbackBuffer(bArr);
            }
        }
    }
}
