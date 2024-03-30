package X;

import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

/* renamed from: X.9p2  reason: invalid class name and case insensitive filesystem */
public class C203879p2 implements C157747ec {
    public Object A00;
    public final int A01;

    public C203879p2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bej() {
        if (this.A01 != 0) {
            VoipLiteCamera voipLiteCamera = (VoipLiteCamera) this.A00;
            voipLiteCamera.liteCameraController.Bri(voipLiteCamera.previewFrameListener);
            return;
        }
        LiteCameraView liteCameraView = (LiteCameraView) this.A00;
        liteCameraView.A01.A01("LiteCamera");
        if (!liteCameraView.A0A || liteCameraView.BLt()) {
            liteCameraView.A0E.A00();
            return;
        }
        C23114B5t b5t = liteCameraView.A0D;
        C198989eW r1 = liteCameraView.A0E;
        b5t.Bri(r1.A01);
        if (!r1.A08) {
            r1.A03.A01();
            r1.A08 = true;
        }
    }
}
