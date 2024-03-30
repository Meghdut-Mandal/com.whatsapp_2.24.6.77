package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

/* renamed from: X.4qt  reason: invalid class name and case insensitive filesystem */
public class C98114qt extends C98134qw {
    public C124855yu A00 = new C124855yu(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98114qt(Context context) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C124855yu r4 = this.A00;
        if (r4.A04) {
            Path path = r4.A08;
            if (path.isEmpty()) {
                RectF rectF = r4.A09;
                float f = r4.A00;
                RectF rectF2 = r4.A0A;
                rectF.set(f, f, rectF2.right - f, rectF2.bottom - f);
                path.addRect(rectF2, Path.Direction.CW);
                int i = r4.A03;
                boolean A02 = C131796Qq.A02(i);
                float f2 = r4.A02;
                if (A02) {
                    path.addRoundRect(rectF2, f2, f2, Path.Direction.CCW);
                } else {
                    float[] fArr = r4.A0C;
                    C131796Qq.A01(fArr, f2, i);
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    Path path2 = r4.A07;
                    path2.reset();
                    C131796Qq.A01(fArr, r4.A01, r4.A03);
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                }
            }
            canvas.drawPath(path, r4.A06);
            if (C131796Qq.A02(r4.A03)) {
                RectF rectF3 = r4.A09;
                float f3 = r4.A01;
                canvas.drawRoundRect(rectF3, f3, f3, r4.A05);
                return;
            }
            canvas.drawPath(r4.A07, r4.A05);
        }
    }

    public C124855yu getDecorationHelper() {
        return this.A00;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C124855yu r5 = this.A00;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = r5.A0A;
        float f = (float) measuredWidth;
        if (rectF.right != f || rectF.bottom != ((float) measuredHeight)) {
            rectF.set(0.0f, 0.0f, f, (float) measuredHeight);
            r5.A08.reset();
        }
    }
}
