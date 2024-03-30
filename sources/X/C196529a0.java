package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.9a0  reason: invalid class name and case insensitive filesystem */
public abstract class C196529a0 {
    public static final Map A00 = AnonymousClass001.A0J();

    public static CameraExtensionCharacteristics A00(CameraManager cameraManager, String str) {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        Map map = A00;
        CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) map.get(str);
        if (cameraExtensionCharacteristics != null) {
            return cameraExtensionCharacteristics;
        }
        try {
            Objects.requireNonNull(cameraManager);
            CameraExtensionCharacteristics cameraExtensionCharacteristics2 = cameraManager.getCameraExtensionCharacteristics(str);
            map.put(str, cameraExtensionCharacteristics2);
            return cameraExtensionCharacteristics2;
        } catch (CameraAccessException e) {
            throw new C21829Ab6(AnonymousClass000.A0p("Could not get Camera Extension Characteristics for Camera ID: ", str, AnonymousClass000.A0u()), e);
        }
    }
}
