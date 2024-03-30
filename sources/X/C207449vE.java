package X;

import android.view.FrameMetrics;
import android.view.Window;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9vE  reason: invalid class name and case insensitive filesystem */
public class C207449vE implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ A14 A00;

    public /* synthetic */ C207449vE(A14 a14) {
        this.A00 = a14;
    }

    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(11) - frameMetrics.getMetric(10);
        if (metric > 0) {
            A14 a14 = this.A00;
            a14.A05 += TimeUnit.NANOSECONDS.toMillis(metric);
            a14.A01 += Math.min(((double) metric) / ((double) 16666666), 1000.0d);
        }
        A14 a142 = this.A00;
        if (metric >= 66666664) {
            a142.A00 += Math.min(((double) metric) / ((double) 66666664), 1000.0d);
        }
        a142.A02 += i;
    }
}
