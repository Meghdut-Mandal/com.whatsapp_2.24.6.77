package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.9Zy  reason: invalid class name and case insensitive filesystem */
public abstract class C196509Zy {
    public static final Map A00 = AnonymousClass001.A0J();

    public static CameraCharacteristics A00(CameraManager cameraManager, String str) {
        Map map = A00;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) map.get(str);
        if (cameraCharacteristics != null) {
            return cameraCharacteristics;
        }
        try {
            Objects.requireNonNull(cameraManager);
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str);
            map.put(str, cameraCharacteristics2);
            return cameraCharacteristics2;
        } catch (CameraAccessException e) {
            throw new C21829Ab6(AnonymousClass000.A0p("Could not get Camera Characteristics for Camera ID: ", str, AnonymousClass000.A0u()), e);
        }
    }
}
