package X;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

public class A2J implements C22882Axd {
    public TotalCaptureResult A00;

    public Object B83(CaptureResult.Key key) {
        TotalCaptureResult totalCaptureResult = this.A00;
        if (totalCaptureResult != null) {
            return totalCaptureResult.get(key);
        }
        return null;
    }
}
