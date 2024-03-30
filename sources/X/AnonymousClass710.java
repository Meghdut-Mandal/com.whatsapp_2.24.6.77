package X;

import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Iterator;
import org.pjsip.PjCamera;

/* renamed from: X.710  reason: invalid class name */
public class AnonymousClass710 implements B3F {
    public final /* synthetic */ VoipCameraManager A00;

    public void BX6(VoipPhysicalCamera voipPhysicalCamera) {
    }

    public void BgK(VoipPhysicalCamera voipPhysicalCamera) {
    }

    public void Bjq(VoipPhysicalCamera voipPhysicalCamera) {
    }

    public AnonymousClass710(VoipCameraManager voipCameraManager) {
        this.A00 = voipCameraManager;
    }

    public void BRK(int i) {
        Iterator A0s = C36361kB.A0s(this.A00);
        while (A0s.hasNext()) {
            AnonymousClass711 r2 = (AnonymousClass711) A0s.next();
            C1493370u r1 = (C1493370u) r2.A07.get(r2.A03.A0S());
            if (r1 != null && r2.A08.get() == 0) {
                if (i == 0) {
                    r2.A05.addCameraErrorListener(r2);
                    r2.A00 = 0;
                } else {
                    AnonymousClass711.A00(r1, r2);
                }
            }
        }
    }

    public void BSv(VoipPhysicalCamera voipPhysicalCamera, int i) {
        this.A00.clearStoredRawCameraInfo(i, C36391kE.A00(voipPhysicalCamera instanceof PjCamera ? 1 : 0));
    }

    public void BTr(VoipPhysicalCamera voipPhysicalCamera) {
        this.A00.closeCurrentCamera(voipPhysicalCamera);
    }

    public AnonymousClass710() {
    }
}
