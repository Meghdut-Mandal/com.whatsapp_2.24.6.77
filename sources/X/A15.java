package X;

import android.os.Build;
import android.os.Handler;
import android.view.Window;

public class A15 implements C23011B0b {
    public boolean A00 = false;
    public final Handler A01;
    public final Window.OnFrameMetricsAvailableListener A02;

    public void B5O(Window window) {
        if (this.A00) {
            this.A00 = false;
            if (Build.VERSION.SDK_INT >= 24) {
                window.removeOnFrameMetricsAvailableListener(this.A02);
            }
        }
    }

    public void B6P(Window window) {
        if (!this.A00) {
            this.A00 = true;
            if (Build.VERSION.SDK_INT >= 24) {
                window.addOnFrameMetricsAvailableListener(this.A02, this.A01);
            }
        }
    }

    public A15(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
        this.A01 = handler;
        this.A02 = onFrameMetricsAvailableListener;
    }
}
