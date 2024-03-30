package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.whatsapp.R;

/* renamed from: X.4bf  reason: invalid class name and case insensitive filesystem */
public class C91224bf extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06 = C36371kC.A0E();

    private void A00(Canvas canvas, float f, float f2) {
        int i = 0;
        do {
            int i2 = (this.A00 * i) + 50;
            Paint paint = this.A06;
            C36421kH.A0q(paint);
            paint.setStrokeWidth((float) this.A05);
            paint.setColor(this.A01);
            canvas.drawCircle(f, f2, (float) i2, paint);
            i++;
        } while (i < 62);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C91224bf(Context context) {
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A01 = context.getResources().getColor(R.color.f6nameremoved);
        this.A04 = context.getResources().getColor(R.color.f6nameremoved);
        this.A03 = context.getResources().getColor(R.color.f6nameremoved);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        int[] A1O = C36441kJ.A1O();
        A1O[0] = this.A04;
        A1O[1] = this.A03;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, A1O);
        float f = (float) this.A02;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setBounds(0, 0, width, height);
        gradientDrawable.draw(canvas);
        RectF A0L = C90514aH.A0L((float) width, height);
        Path A0M = C36441kJ.A0M();
        A0M.addRoundRect(A0L, f, f, Path.Direction.CW);
        canvas.clipPath(A0M);
        float f2 = (float) (height + 120);
        A00(canvas, 100.0f, f2);
        A00(canvas, (float) (width - 100), f2);
    }
}
