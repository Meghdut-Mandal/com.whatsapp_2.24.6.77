package X;

import android.hardware.Camera;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.6ZS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6ZS implements Camera.ErrorCallback {
    public final /* synthetic */ C1030553k A00;

    public /* synthetic */ AnonymousClass6ZS(C1030553k r1) {
        this.A00 = r1;
    }

    public final void onError(int i, Camera camera) {
        C1030553k r3 = this.A00;
        synchronized (r3) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("cameraview/start-camera camera error:");
            A0u.append(i);
            A0u.append(" takingpicture:");
            A0u.append(r3.A0O);
            A0u.append(" recording:");
            A0u.append(r3.A0M);
            A0u.append(" inpreview:");
            Log.w(C36421kH.A0d(A0u, r3.A0K));
            if (i == 100) {
                C1030553k.A07(r3);
                Handler handler = r3.A09;
                Objects.requireNonNull(handler);
                handler.post(new C81323wp((Object) r3, 4));
            } else if (i == 2) {
                Camera camera2 = r3.A07;
                if (camera2 != null) {
                    camera2.release();
                }
                r3.A07 = null;
                C1030553k.A08(r3, new Exception("CameraCustomException: Camera error evicted"), i);
            }
        }
    }
}
