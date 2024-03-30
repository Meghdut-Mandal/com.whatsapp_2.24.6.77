package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;

/* renamed from: X.6OT  reason: invalid class name */
public final class AnonymousClass6OT {
    public float A00;
    public float A01 = 1.0f;
    public int A02;
    public int A03;
    public int A04;
    public Matrix A05 = C90524aI.A0B();
    public Rect A06;
    public RectF A07;
    public RectF A08;
    public DisplayMetrics A09;
    public final Matrix A0A = C90524aI.A0B();
    public final RectF A0B = C36441kJ.A0N();

    public final void A02(AnonymousClass6VQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2.A02;
        this.A08 = r2.A01;
        A01(this);
        this.A02 = r2.A00;
        A01(this);
        this.A06 = null;
        this.A01 = 1.0f;
        A01(this);
    }

    public static void A00(Canvas canvas, AnonymousClass6OT r4) {
        canvas.concat(r4.A0A);
        RectF rectF = r4.A08;
        canvas.translate(-rectF.left, -rectF.top);
    }

    public static final void A01(AnonymousClass6OT r3) {
        RectF rectF = r3.A08;
        if (rectF != null) {
            C111045be.A00(r3.A0A, rectF, (float) r3.A02);
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DoodleViewState{bitmapRect=");
        A0u.append(this.A07);
        A0u.append(", cropRect=");
        A0u.append(this.A08);
        A0u.append(", rotate=");
        A0u.append(this.A02);
        A0u.append(", rotateMatrix=");
        A0u.append(this.A0A);
        A0u.append(", zoomScale=");
        A0u.append(this.A01);
        A0u.append(", zoomRect=");
        A0u.append(this.A06);
        A0u.append(", zoomMatrix=");
        A0u.append(this.A05);
        A0u.append(", displayRect=");
        A0u.append(this.A0B);
        A0u.append(", screenScale=");
        A0u.append(this.A00);
        A0u.append(", displayMetrics=");
        A0u.append(this.A09);
        A0u.append(", viewWidth=");
        A0u.append(this.A04);
        A0u.append(", viewHeight=");
        A0u.append(this.A03);
        return AnonymousClass000.A0s(A0u);
    }
}
