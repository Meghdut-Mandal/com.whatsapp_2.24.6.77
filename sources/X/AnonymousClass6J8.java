package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.6J8  reason: invalid class name */
public abstract class AnonymousClass6J8 {
    public static Paint A00;
    public static Paint A01;
    public static Paint A02;
    public static Paint A03;
    public static Paint A04;
    public static TextPaint A05;
    public static TextPaint A06;

    public static final Paint A00(Context context) {
        Paint paint = A00;
        if (paint == null) {
            paint = C36441kJ.A0K();
            paint.setARGB(255, 255, 255, 255);
            paint.setTextSize(C90524aI.A01(context, 12.0f));
            paint.setTextAlign(Paint.Align.LEFT);
            Typeface typeface = C108895Vj.A00;
            if (typeface == null) {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
                C108895Vj.A00 = typeface;
            }
            C18740tg.A06(typeface);
            AnonymousClass00C.A08(typeface);
            paint.setTypeface(typeface);
            C36421kH.A0q(paint);
            paint.setStrokeWidth(8.0f);
            A00 = paint;
        }
        return paint;
    }

    public static final Paint A01(Context context) {
        Paint paint = A04;
        if (paint != null) {
            return paint;
        }
        Paint A0K = C36441kJ.A0K();
        A0K.setARGB(255, 255, 255, 255);
        A0K.setTextSize(C90524aI.A01(context, 10.0f));
        A0K.setTextAlign(Paint.Align.LEFT);
        A0K.setTypeface(Typeface.DEFAULT);
        C36421kH.A0q(A0K);
        A0K.setStrokeWidth(6.0f);
        A04 = A0K;
        return A0K;
    }
}
