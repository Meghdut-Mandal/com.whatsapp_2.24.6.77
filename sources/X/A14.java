package X;

import android.os.Handler;
import android.view.Window;
import java.util.concurrent.TimeUnit;

public class A14 implements C23010B0a {
    public static final long A09;
    public static final long A0A;
    public double A00;
    public double A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public final C194719Qy A06;
    public final Handler A07;
    public final C23011B0b A08;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A09 = timeUnit.toMillis(30);
        A0A = timeUnit.toMillis(30);
    }

    public /* synthetic */ void A00(int i) {
        double min = Math.min(this.A01, 10000.0d);
        double min2 = Math.min(this.A00, 10000.0d);
        long min3 = Math.min(TimeUnit.NANOSECONDS.toMillis(this.A03 - this.A04), A0A);
        if (min3 < 0) {
            min3 = 0;
        }
        C194719Qy r0 = this.A06;
        r0.A00(new AnonymousClass84H(min, min2, min3), i);
        r0.A01.markerEnd(689639794, 2);
        this.A05 = 0;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
    }

    public void B6P(Window window) {
        this.A05 = 0;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A04 = System.nanoTime();
        this.A08.B6P(window);
    }

    public A14(C194719Qy r4) {
        this.A06 = r4;
        Handler A0H = C36341k9.A0H();
        this.A07 = A0H;
        this.A08 = new A15(new C207449vE(this), A0H);
    }

    public void B5P(Window window, int i) {
        this.A03 = System.nanoTime();
        this.A08.B5O(window);
        this.A07.post(new C81283wl((Object) this, i, 3));
    }
}
