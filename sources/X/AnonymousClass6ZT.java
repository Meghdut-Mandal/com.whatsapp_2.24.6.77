package X;

import android.hardware.Camera;
import com.whatsapp.util.Log;

/* renamed from: X.6ZT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6ZT implements Camera.PictureCallback {
    public final /* synthetic */ C1268165s A00;
    public final /* synthetic */ C1030553k A01;

    public /* synthetic */ AnonymousClass6ZT(C1268165s r1, C1030553k r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        C1030553k r4 = this.A01;
        C1268165s r3 = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("cameraview/take-picture taken ");
        C36331k8.A1S(A0u, r4.A0L);
        try {
            r4.A07.stopPreview();
            r4.A0K = false;
        } catch (Exception e) {
            Log.w("cameraview/take-picture error stopping camera preview", e);
        }
        r4.A0O = false;
        r4.A0T.post(new C1502474n(r4, r3, bArr, 33));
    }
}
