package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

public final /* synthetic */ class AYX implements Callable {
    public final /* synthetic */ VoipPhysicalCamera A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AYX(VoipPhysicalCamera voipPhysicalCamera, boolean z) {
        this.A00 = voipPhysicalCamera;
        this.A01 = z;
    }

    public final Object call() {
        return this.A00.m70lambda$close$6$comwhatsappvoipcallingcameraVoipPhysicalCamera(this.A01);
    }
}
