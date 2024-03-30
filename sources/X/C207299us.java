package X;

import android.view.Choreographer;

/* renamed from: X.9us  reason: invalid class name and case insensitive filesystem */
public class C207299us implements Choreographer.FrameCallback {
    public final /* synthetic */ Choreographer A00;
    public final /* synthetic */ A16 A01;

    public C207299us(Choreographer choreographer, A16 a16) {
        this.A01 = a16;
        this.A00 = choreographer;
    }

    public void doFrame(long j) {
        Choreographer choreographer;
        A16 a16 = this.A01;
        if (!a16.A02) {
            a16.A03.removeFrameCallback(this);
            return;
        }
        if (a16.A00 == -1) {
            a16.A00 = j;
            a16.A01 = j;
            choreographer = a16.A03;
        } else {
            a16.A01 = j;
            A13 a13 = a16.A04.A00;
            double d = a13.A04;
            long max = Math.max(Math.round(((double) (j - a16.A01)) / d), 1);
            long min = Math.min(max - 1, 100);
            double d2 = (double) min;
            a13.A01 += d2;
            if (min > 4) {
                a13.A00 += d2 / 4.0d;
            }
            a13.A02 = (long) (((double) a13.A02) + (d * ((double) max)));
            choreographer = this.A00;
        }
        choreographer.postFrameCallback(this);
    }
}
