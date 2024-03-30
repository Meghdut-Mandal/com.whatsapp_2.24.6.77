package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: X.5sV  reason: invalid class name and case insensitive filesystem */
public final class C121045sV {
    public final Paint A00;
    public final Paint A01;
    public final TextPaint A02;

    public C121045sV(Context context) {
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 16843287;
        A1O[1] = 16843288;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, A1O, 0, 0);
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        context.getResources().getDisplayMetrics();
        TextPaint textPaint = new TextPaint();
        this.A02 = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint A0K = C36441kJ.A0K();
        this.A01 = A0K;
        A0K.setAntiAlias(true);
        C36431kI.A1L(A0K);
        Paint A0K2 = C36441kJ.A0K();
        this.A00 = A0K2;
        A0K2.setAntiAlias(true);
        A0K2.setFilterBitmap(true);
    }
}
