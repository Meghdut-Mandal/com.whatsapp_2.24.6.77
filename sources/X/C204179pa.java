package X;

import android.graphics.SurfaceTexture;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;

/* renamed from: X.9pa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204179pa implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ VoipPhysicalCamera A00;

    public /* synthetic */ C204179pa(VoipPhysicalCamera voipPhysicalCamera) {
        this.A00 = voipPhysicalCamera;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A00.m71lambda$createTexture$9$comwhatsappvoipcallingcameraVoipPhysicalCamera(surfaceTexture);
    }
}
