package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.DrawableProperties;

/* renamed from: X.4bn  reason: invalid class name and case insensitive filesystem */
public final class C91304bn extends Drawable implements Animatable {
    public C161977nn A00;
    public final DrawableProperties A01;
    public final C124365y3 A02;
    public final C1497572q A03 = new C1497572q(this, 0);

    public void draw(Canvas canvas) {
        long max;
        AnonymousClass00C.A0D(canvas, 0);
        C124365y3 r4 = this.A02;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (r4.A06) {
            max = (uptimeMillis - r4.A05) + 0;
        } else {
            max = Math.max(r4.A03, 0);
        }
        AnonymousClass69P r8 = r4.A07;
        int A002 = r8.A00(max);
        r4.A03 = max;
        if (A002 == -1) {
            A002 = this.A00.getFrameCount() - 1;
            r4.A06 = false;
        } else if (A002 == 0 && r4.A01 != -1) {
            SystemClock.uptimeMillis();
        }
        if (this.A00.B64(canvas, this, A002)) {
            r4.A01 = A002;
        } else {
            r4.A00++;
        }
        if (r4.A06) {
            long A022 = r8.A02(SystemClock.uptimeMillis() - r4.A05);
            if (A022 != -1) {
                long j = A022 + 8;
                if (j != -1) {
                    scheduleSelf(this.A03, j);
                    return;
                }
            } else {
                r4.A06 = false;
            }
        }
        r4.A06 = false;
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        AnonymousClass00C.A0D(rect, 0);
        this.A00.BqI(rect);
    }

    public int getIntrinsicHeight() {
        return this.A00.BCp();
    }

    public int getIntrinsicWidth() {
        return this.A00.BCq();
    }

    public boolean isRunning() {
        return this.A02.A06;
    }

    public void setAlpha(int i) {
        this.A01.setAlpha(i);
        this.A00.Bq6(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        this.A00.BqW(colorFilter);
    }

    public void start() {
        if (this.A00.getFrameCount() > 0) {
            C124365y3 r6 = this.A02;
            if (!r6.A06) {
                long uptimeMillis = SystemClock.uptimeMillis();
                r6.A05 = uptimeMillis - r6.A04;
                r6.A03 = uptimeMillis - r6.A02;
                r6.A01 = -1;
                r6.A06 = true;
            }
            invalidateSelf();
        }
    }

    public void stop() {
        C124365y3 r6 = this.A02;
        if (r6.A06) {
            long uptimeMillis = SystemClock.uptimeMillis();
            r6.A04 = uptimeMillis - r6.A05;
            r6.A02 = uptimeMillis - r6.A03;
            r6.A05 = 0;
            r6.A03 = -1;
            r6.A01 = -1;
            r6.A06 = false;
        }
        unscheduleSelf(this.A03);
    }

    public C91304bn(C161977nn r3) {
        this.A00 = r3;
        this.A02 = new C124365y3(new AnonymousClass69P(r3));
        DrawableProperties drawableProperties = new DrawableProperties();
        drawableProperties.applyTo(this);
        this.A01 = drawableProperties;
    }
}
