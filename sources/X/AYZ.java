package X;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Callable;

public final /* synthetic */ class AYZ implements Callable {
    public final /* synthetic */ A28 A00;
    public final /* synthetic */ C165807uB A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AYZ(A28 a28, C165807uB r2, String str) {
        this.A00 = a28;
        this.A02 = str;
        this.A01 = r2;
    }

    public final Object call() {
        A28 a28 = this.A00;
        String str = this.A02;
        C165807uB r2 = this.A01;
        CameraManager cameraManager = a28.A0M;
        Objects.requireNonNull(cameraManager);
        cameraManager.openCamera(str, r2, (Handler) null);
        return r2;
    }
}
