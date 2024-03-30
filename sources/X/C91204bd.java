package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;

/* renamed from: X.4bd  reason: invalid class name and case insensitive filesystem */
public class C91204bd extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public long A04 = 0;
    public long A05 = -1;
    public Bitmap A06;
    public BitmapShader A07;
    public RectF A08;
    public final float A09;
    public final Context A0A;
    public final Matrix A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Interpolator A0E = new C135976dZ();
    public final ShimmerFrameLayout A0F;
    public final Bitmap A0G;

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void A00() {
        setBounds(0, 0, Math.round(this.A03), Math.round(this.A02));
        invalidateSelf();
    }

    public void A01(Bitmap bitmap) {
        this.A06 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.A07 = bitmapShader;
        this.A0D.setShader(bitmapShader);
    }

    public void draw(Canvas canvas) {
        float A022;
        if (this.A06 != null) {
            float width = this.A08.width();
            float height = this.A08.height();
            float max = Math.max(width / ((float) this.A06.getWidth()), height / ((float) this.A06.getHeight()));
            Matrix matrix = this.A0B;
            matrix.setScale(max, max);
            matrix.postTranslate((width - (((float) this.A06.getWidth()) * max)) / 2.0f, (height - (((float) this.A06.getHeight()) * max)) / 2.0f);
            this.A07.setLocalMatrix(matrix);
        }
        canvas.save();
        this.A08.offsetTo(0.0f, 0.0f);
        RectF rectF = this.A08;
        canvas.translate(rectF.left, rectF.top);
        canvas.drawBitmap(this.A0G, (Rect) null, this.A08, (Paint) null);
        Bitmap bitmap = this.A06;
        RectF rectF2 = this.A08;
        if (bitmap == null) {
            float width2 = ((rectF2.width() / 2.0f) - this.A09) - (this.A08.width() * 0.146396f);
            float centerX = this.A08.centerX();
            float height2 = this.A08.height();
            float f = ((height2 * 0.650727f) / 2.0f) + (0.12474f * height2);
            Path A0M = C36441kJ.A0M();
            A0M.addCircle(centerX, f, width2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(A0M);
            canvas.drawPath(A0M, this.A0C);
            this.A0F.dispatchDraw(canvas);
            canvas.restore();
        } else {
            float width3 = (rectF2.width() / 2.0f) - this.A09;
            float centerX2 = this.A08.centerX();
            float height3 = this.A08.height();
            canvas.drawCircle(centerX2, ((height3 * 0.650727f) / 2.0f) + (0.12474f * height3), width3 - (this.A08.width() * 0.146396f), this.A0D);
        }
        canvas.restore();
        long j = this.A05;
        if (j != -1) {
            long j2 = this.A04;
            if (j2 == 0) {
                A022 = 0.0f;
            } else {
                long min = Math.min(C36441kJ.A0A(j), j2);
                if (min >= j2) {
                    this.A05 = -1;
                }
                A022 = C90494aF.A02(0.0f, 1.0f, this.A0E.getInterpolation(((float) min) / ((float) j2)));
            }
            float f2 = this.A01;
            float f3 = this.A00;
            float f4 = 1.0f - 0.0f;
            float f5 = f3 - f2;
            float f6 = 0.0f;
            if (f4 != 0.0f) {
                f6 = (A022 - 0.0f) / f4;
            }
            this.A03 = (f6 * f5) + f2;
            float f7 = (f3 + (0.083333f * f3)) - f2;
            float f8 = 0.0f;
            if (f4 != 0.0f) {
                f8 = (A022 - 0.0f) / f4;
            }
            this.A02 = (f8 * f7) + f2;
            A00();
        }
    }

    public int getIntrinsicHeight() {
        return Math.round(this.A02);
    }

    public int getIntrinsicWidth() {
        return Math.round(this.A03);
    }

    public C91204bd(Context context) {
        this.A0A = context;
        this.A0B = C90524aI.A0B();
        Paint A0L = C36441kJ.A0L(3);
        this.A0D = A0L;
        Paint.Style style = Paint.Style.FILL;
        A0L.setStyle(style);
        A0L.setColor(-1);
        Paint A0L2 = C36441kJ.A0L(3);
        this.A0C = A0L2;
        A0L2.setStyle(style);
        A0L2.setColor(-1);
        float A012 = C90524aI.A01(context, 22.0f);
        this.A09 = C90524aI.A01(context, 2.0f);
        this.A03 = A012;
        this.A02 = A012 + (0.083333f * A012);
        this.A0G = BitmapFactory.decodeResource(context.getResources(), R.drawable.bg_selected_marker);
        this.A08 = new RectF(0.0f, 0.0f, this.A03, this.A02);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        this.A0F = shimmerFrameLayout;
        shimmerFrameLayout.measure(0, 0);
        shimmerFrameLayout.layout(0, 0, shimmerFrameLayout.getWidth(), shimmerFrameLayout.getHeight());
        C98394rM r3 = new C98394rM();
        C125045zE r2 = r3.A00;
        r2.A0G = false;
        r3.A02(0.5f);
        r3.A06(0);
        r3.A04(1.0f);
        r2.A03 = 20.0f;
        r3.A06(1200);
        r3.A03(0.3f);
        r3.A05(0.1f);
        r3.A07(300);
        shimmerFrameLayout.A05(r3.A01());
        shimmerFrameLayout.A02();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A08 = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }
}
