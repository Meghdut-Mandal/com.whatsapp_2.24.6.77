package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.DrawableProperties;

/* renamed from: X.4bq  reason: invalid class name and case insensitive filesystem */
public class C91334bq extends Drawable implements Animatable {
    public static final AnonymousClass5YK A0F = new AnonymousClass5YK();
    public int A00;
    public long A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public DrawableProperties A08;
    public C161977nn A09;
    public AnonymousClass69P A0A;
    public final Runnable A0B;
    public final C114775ho A0C;
    public volatile AnonymousClass5YK A0D;
    public volatile boolean A0E;

    public int getOpacity() {
        return -3;
    }

    public void draw(Canvas canvas) {
        AnonymousClass69P r6;
        long max;
        C161977nn r4 = this.A09;
        if (r4 != null && (r6 = this.A0A) != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A0E) {
                max = (uptimeMillis - this.A01) + 0;
            } else {
                max = Math.max(this.A05, 0);
            }
            int A002 = r6.A00(max);
            if (A002 == -1) {
                A002 = r4.getFrameCount() - 1;
                this.A0E = false;
            }
            if (r4.B64(canvas, this, A002)) {
                this.A02 = A002;
            } else {
                int i = this.A00 + 1;
                this.A00 = i;
                if (C132886Vq.A00.BMH(2)) {
                    C132886Vq.A02(C91334bq.class, Integer.valueOf(i), "Dropped a frame. Count: %s");
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.A0E) {
                long A022 = r6.A02(uptimeMillis2 - this.A01);
                if (A022 != -1) {
                    scheduleSelf(this.A0B, this.A01 + this.A04 + A022);
                } else {
                    this.A0E = false;
                }
            }
            this.A05 = max;
        }
    }

    public int getIntrinsicHeight() {
        C161977nn r0 = this.A09;
        if (r0 == null) {
            return super.getIntrinsicHeight();
        }
        return r0.BCp();
    }

    public int getIntrinsicWidth() {
        C161977nn r0 = this.A09;
        if (r0 == null) {
            return super.getIntrinsicWidth();
        }
        return r0.BCq();
    }

    public boolean onLevelChange(int i) {
        if (!this.A0E) {
            long j = (long) i;
            if (this.A05 != j) {
                this.A05 = j;
                invalidateSelf();
                return true;
            }
        }
        return false;
    }

    public void setAlpha(int i) {
        DrawableProperties drawableProperties = this.A08;
        if (drawableProperties == null) {
            drawableProperties = new DrawableProperties();
            this.A08 = drawableProperties;
        }
        drawableProperties.setAlpha(i);
        C161977nn r0 = this.A09;
        if (r0 != null) {
            r0.Bq6(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        DrawableProperties drawableProperties = this.A08;
        if (drawableProperties == null) {
            drawableProperties = new DrawableProperties();
            this.A08 = drawableProperties;
        }
        drawableProperties.setColorFilter(colorFilter);
        C161977nn r0 = this.A09;
        if (r0 != null) {
            r0.BqW(colorFilter);
        }
    }

    public void start() {
        C161977nn r0;
        if (!this.A0E && (r0 = this.A09) != null && r0.getFrameCount() > 1) {
            this.A0E = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A01 = uptimeMillis - this.A07;
            this.A05 = uptimeMillis - this.A06;
            this.A02 = this.A03;
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.A0E) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A07 = uptimeMillis - this.A01;
            this.A06 = uptimeMillis - this.A05;
            this.A03 = this.A02;
            this.A0E = false;
            this.A01 = 0;
            this.A05 = -1;
            this.A02 = -1;
            unscheduleSelf(this.A0B);
        }
    }

    public C91334bq(C161977nn r4) {
        AnonymousClass69P r0;
        this.A04 = 8;
        this.A0D = A0F;
        C114775ho r2 = new C114775ho(this);
        this.A0C = r2;
        this.A0B = new AnonymousClass759((Object) this, 49);
        this.A09 = r4;
        if (r4 == null) {
            r0 = null;
        } else {
            r0 = new AnonymousClass69P(r4);
        }
        this.A0A = r0;
        if (r4 != null) {
            r4.BqA(r2);
        }
    }

    public boolean isRunning() {
        return this.A0E;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C161977nn r0 = this.A09;
        if (r0 != null) {
            r0.BqI(rect);
        }
    }

    public C91334bq() {
        this((C161977nn) null);
    }
}
