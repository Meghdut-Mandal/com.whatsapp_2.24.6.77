package X;

import android.content.Context;
import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1gX  reason: invalid class name and case insensitive filesystem */
public class C34151gX {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public boolean A03 = false;
    public final double A04;
    public final C34171gZ A05;
    public final C34141gW A06;

    public C34151gX(Context context, AnonymousClass1JJ r6, C34141gW r7) {
        C18740tg.A06(r7);
        this.A06 = r7;
        this.A05 = new C34171gZ(Choreographer.getInstance(), new C34161gY(this));
        this.A04 = (double) r6.A00(context);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
    }
}
