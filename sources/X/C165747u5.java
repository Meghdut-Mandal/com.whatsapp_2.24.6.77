package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7u5  reason: invalid class name and case insensitive filesystem */
public final class C165747u5 extends Drawable implements Animatable, C22832Awh {
    public static int A0B = 4000;
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C195489Um A06;
    public final List A07;
    public final Paint A08;
    public final C19970wo A09;
    public final AnonymousClass00T A0A;

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        AnonymousClass00C.A0D(canvas, 0);
        boolean z = this.A04;
        C195489Um r0 = this.A06;
        if (!z) {
            bitmap = r0.A09;
        } else {
            bitmap = r0.A02;
        }
        if (bitmap == null) {
            bitmap = r0.A09;
        }
        canvas.drawBitmap(bitmap, (Rect) null, getBounds(), this.A08);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void A00(Canvas canvas) {
        Bitmap bitmap = this.A06.A09;
        AnonymousClass00C.A08(bitmap);
        canvas.drawBitmap(bitmap, (Rect) null, getBounds(), this.A08);
    }

    public void stop() {
        if (this.A04) {
            this.A04 = false;
            C195489Um r5 = this.A06;
            Set set = r5.A0F;
            set.remove(this);
            if (set.isEmpty()) {
                r5.A0G = false;
                r5.A00 = 0;
                C199039eb r3 = r5.A0B;
                synchronized (r3) {
                    r3.A00 = 0;
                    r3.A02 = null;
                    Bitmap bitmap = r3.A01;
                    if (bitmap != null) {
                        r3.A03 = null;
                        bitmap.recycle();
                        r3.A01 = null;
                    }
                }
                r5.A04 = false;
                Bitmap bitmap2 = r5.A02;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    r5.A02 = null;
                }
                r5.A01 = null;
                r5.A0A.A0G(r5.A0E);
                AnonymousClass1HH r2 = r5.A0C.A04;
                synchronized (r2) {
                    Iterator it = r2.A01.iterator();
                    while (it.hasNext()) {
                        if (((C21661AUd) it.next()).A02 == r3) {
                            it.remove();
                        }
                    }
                }
            }
            for (C06590Ue A022 : this.A07) {
                A022.A02(this);
            }
            invalidateSelf();
        }
    }

    public C165747u5(C19970wo r4, C195489Um r5) {
        boolean A1U = C90484aE.A1U(r4);
        this.A06 = r5;
        this.A09 = r4;
        if (AnonymousClass3RT.A00) {
            A0B = SearchActionVerificationClientService.NOTIFICATION_ID;
        }
        this.A08 = new Paint(A1U ? 1 : 0);
        this.A0A = C36431kI.A1I(new C22209AiW(this));
        this.A07 = AnonymousClass001.A0I();
    }

    public boolean isRunning() {
        return this.A04;
    }

    public void start() {
        this.A02 = SystemClock.uptimeMillis();
        if (!this.A04 || AnonymousClass3RT.A00) {
            this.A00 = 0;
            this.A04 = true;
            C195489Um r4 = this.A06;
            int i = r4.A00;
            int i2 = r4.A0D.A00;
            boolean z = true;
            if (i <= Math.max(i2 / 5, 1)) {
                z = false;
            }
            this.A05 = z;
            r4.A0F.add(this);
            if (!r4.A0G && i2 > 1) {
                r4.A0G = true;
                r4.A00();
            }
            for (C06590Ue A012 : this.A07) {
                A012.A01(this);
            }
        }
    }
}
