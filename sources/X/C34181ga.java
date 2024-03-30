package X;

import android.view.Choreographer;

/* renamed from: X.1ga  reason: invalid class name and case insensitive filesystem */
public class C34181ga implements Choreographer.FrameCallback {
    public final /* synthetic */ C34171gZ A00;

    public C34181ga(C34171gZ r1) {
        this.A00 = r1;
    }

    public void doFrame(long j) {
        C34171gZ r8 = this.A00;
        if (!r8.A03) {
            r8.A05.removeFrameCallback(this);
            return;
        }
        if (r8.A00 == -1) {
            r8.A00 = j;
            r8.A01 = j;
        } else {
            r8.A01 = j;
            C34151gX r9 = r8.A02.A00;
            double d = r9.A04;
            long max = Math.max(Math.round(((double) (j - r8.A01)) / d), 1);
            long min = Math.min(max - 1, 100);
            double d2 = (double) min;
            r9.A01 += d2;
            if (min > 4) {
                r9.A00 += d2 / 4.0d;
            }
            r9.A02 = (long) (((double) r9.A02) + (d * ((double) max)));
        }
        r8.A05.postFrameCallback(this);
    }
}
