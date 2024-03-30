package X;

import android.os.HandlerThread;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;

/* renamed from: X.7v4  reason: invalid class name and case insensitive filesystem */
public class C166127v4 extends HandlerThread {
    public final /* synthetic */ VoipPhysicalCamera A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166127v4(VoipPhysicalCamera voipPhysicalCamera) {
        super("VoipCameraThread");
        this.A00 = voipPhysicalCamera;
    }

    public void run() {
        Log.i("voip/video/VoipCamera/CameraThread Start");
        super.run();
        Log.i("voip/video/VoipCamera/CameraThread Exit");
    }
}
