package X;

import android.content.Context;
import android.graphics.Point;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;

/* renamed from: X.5Nm  reason: invalid class name and case insensitive filesystem */
public class C107295Nm extends VoipPhysicalCamera {
    public boolean A00 = false;
    public final VoipPhysicalCamera.CameraInfo A01;

    public void closeOnCameraThread() {
        this.A00 = false;
        this.cameraEventsDispatcher.A00();
    }

    public int disableAREffectOnCameraThread() {
        return 0;
    }

    public int enableAREffectOnCameraThread(C128656Dc r2, AnonymousClass7d4 r3) {
        return 0;
    }

    public Point getAdjustedPreviewSize() {
        return new Point(0, 0);
    }

    public int getCameraStartMode() {
        return 0;
    }

    public C124015xS getLastCachedFrame() {
        return null;
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        return 0;
    }

    public void onFrameAvailableOnCameraThread() {
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        return 0;
    }

    public int startOnCameraThread() {
        this.A00 = true;
        return 0;
    }

    public int stopOnCameraThread() {
        this.A00 = false;
        return 0;
    }

    public void updatePreviewOrientation() {
    }

    public C107295Nm(Context context, C20810yC r10, AnonymousClass9NK r11, AnonymousClass13J r12, int i, int i2, int i3, int i4, int i5) {
        super(context, r10, r12, r11);
        this.A01 = new VoipPhysicalCamera.CameraInfo(i2, i3, i4, i5, true, 0, i);
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        return this.A01;
    }

    public boolean isCameraOpen() {
        return this.A00;
    }
}
