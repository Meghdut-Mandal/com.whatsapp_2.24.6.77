package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Arrays;

/* renamed from: X.7u8  reason: invalid class name and case insensitive filesystem */
public class C165777u8 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ Surface A01;
    public final /* synthetic */ C183828rQ A02;

    public C165777u8(CaptureRequest.Builder builder, Surface surface, C183828rQ r3) {
        this.A02 = r3;
        this.A01 = surface;
        this.A00 = builder;
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Surface surface = this.A01;
        if (!(surface == null || surface == this.A02.A03)) {
            surface.release();
        }
        C183828rQ r1 = this.A02;
        r1.A06 = false;
        Log.i("voip/video/VoipCamera/ cameraDevice configure failed");
        r1.cameraEventsDispatcher.A01();
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C183828rQ r2 = this.A02;
        r2.A06 = false;
        Surface surface = this.A01;
        if (!(surface == null || surface == r2.A03)) {
            surface.release();
        }
        if (r2.A01 == null) {
            Log.i("voip/video/VoipCamera/ cameraDevice configured, but device is null");
            r2.cameraEventsDispatcher.A01();
            return;
        }
        Log.i("voip/video/VoipCamera/ cameraDevice configured");
        CaptureRequest.Builder builder = this.A00;
        C165577te.A0v(builder, CaptureRequest.CONTROL_MODE, 1);
        C165577te.A0v(builder, CaptureRequest.CONTROL_AF_MODE, 3);
        C165577te.A0v(builder, CaptureRequest.FLASH_MODE, 0);
        Range[] rangeArr = (Range[]) r2.A0A.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            int i = Integer.MIN_VALUE;
            Range range = null;
            for (Range range2 : rangeArr) {
                int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(AnonymousClass000.A0I(range2.getLower()) * 1000, AnonymousClass000.A0I(range2.getUpper()) * 1000, r2.A0B.fps1000);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("voip/video/VoipCamera/startOnCameraThread check fps [");
                A0u.append(range2.getLower());
                A0u.append(", ");
                A0u.append(range2.getUpper());
                C36321k7.A1T("], score: ", A0u, fpsRangeScore);
                if (fpsRangeScore > i) {
                    range = range2;
                    i = fpsRangeScore;
                }
            }
            if (range != null) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("voip/video/VoipCamera/startOnCameraThread with fps range [");
                A0u2.append(range.getLower());
                A0u2.append(", ");
                A0u2.append(range.getUpper());
                A0u2.append("], score: ");
                A0u2.append(i);
                A0u2.append(", supported ranges : ");
                C36321k7.A1a(A0u2, Arrays.toString(rangeArr));
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            }
        }
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), (CameraCaptureSession.CaptureCallback) null, r2.cameraThreadHandler);
            r2.startPeriodicCameraCallbackCheck();
        } catch (CameraAccessException unused) {
            Log.i("voip/video/VoipCamera/ failed to start preview");
            r2.cameraEventsDispatcher.A01();
        }
    }
}
