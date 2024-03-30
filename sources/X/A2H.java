package X;

import android.hardware.camera2.CaptureFailure;

public class A2H implements C22881Axc {
    public CaptureFailure A00;

    public int BGX() {
        CaptureFailure captureFailure = this.A00;
        if (captureFailure != null) {
            return captureFailure.getReason();
        }
        return -1;
    }
}
