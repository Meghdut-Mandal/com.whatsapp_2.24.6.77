package X;

import android.content.Context;
import android.view.Choreographer;
import android.view.Window;
import java.util.concurrent.TimeUnit;

public class A13 implements C23010B0a {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public boolean A03 = false;
    public final double A04;
    public final C23011B0b A05;
    public final C194719Qy A06;

    public void B5P(Window window, int i) {
        if (this.A03) {
            this.A03 = false;
            this.A05.B5O(window);
            C194719Qy r4 = this.A06;
            r4.A00(new AnonymousClass9RG(Math.min(this.A01, 3600.0d), Math.min(this.A00, 1000.0d), TimeUnit.NANOSECONDS.toMillis(Math.min(this.A02, A07))), i);
            r4.A01.markerEnd(689639794, 2);
            this.A01 = 0.0d;
            this.A00 = 0.0d;
            this.A02 = 0;
        }
    }

    public void B6P(Window window) {
        if (!this.A03) {
            this.A03 = true;
            this.A05.B6P(window);
        }
    }

    public A13(Context context, AnonymousClass1JJ r6, C194719Qy r7) {
        this.A06 = r7;
        this.A05 = new A16(Choreographer.getInstance(), new AnonymousClass9CB(this));
        this.A04 = (double) r6.A00(context);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
    }
}
