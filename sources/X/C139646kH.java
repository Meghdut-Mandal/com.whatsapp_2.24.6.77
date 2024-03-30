package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6kH  reason: invalid class name and case insensitive filesystem */
public class C139646kH implements C161977nn {
    public long A00;
    public C161977nn A01;
    public C139656kI A02;
    public boolean A03 = false;
    public ColorFilter A04;
    public Rect A05;
    public final C159017ie A06;
    public final Runnable A07 = new AnonymousClass759((Object) this, 48);
    public final ScheduledExecutorService A08;

    public static synchronized void A00(C139646kH r5) {
        synchronized (r5) {
            if (!r5.A03) {
                r5.A03 = true;
                r5.A08.schedule(r5.A07, 1000, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean B64(Canvas canvas, Drawable drawable, int i) {
        this.A00 = this.A06.now();
        boolean A1P = AnonymousClass000.A1P(this.A01.B64(canvas, drawable, i) ? 1 : 0);
        A00(this);
        return A1P;
    }

    public int BC6(int i) {
        return this.A01.BC6(i);
    }

    public int BCp() {
        return this.A01.BCp();
    }

    public int BCq() {
        return this.A01.BCq();
    }

    public int BDi() {
        return this.A01.BDi();
    }

    public void Bq6(int i) {
        this.A01.Bq6(i);
    }

    public void BqA(C114775ho r2) {
        this.A01.BqA(r2);
    }

    public void BqI(Rect rect) {
        this.A01.BqI(rect);
        this.A05 = rect;
    }

    public void BqW(ColorFilter colorFilter) {
        this.A01.BqW(colorFilter);
        this.A04 = colorFilter;
    }

    public int getFrameCount() {
        return this.A01.getFrameCount();
    }

    public int getLoopCount() {
        return this.A01.getLoopCount();
    }

    public C139646kH(C159017ie r3, C161977nn r4, C139656kI r5, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = r4;
        this.A02 = r5;
        this.A06 = r3;
        this.A08 = scheduledExecutorService;
    }
}
