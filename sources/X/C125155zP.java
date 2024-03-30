package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: X.5zP  reason: invalid class name and case insensitive filesystem */
public final class C125155zP {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public StaticLayout A0L;
    public CharSequence A0M;
    public boolean A0N;
    public boolean A0O;
    public final float A0P;
    public final float A0Q;
    public final float A0R;
    public final float A0S;
    public final float A0T;
    public final Paint A0U;
    public final TextPaint A0V;

    public C125155zP(Context context) {
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 16843287;
        A1O[1] = 16843288;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, A1O, 0, 0);
        this.A0S = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A0T = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) AnonymousClass000.A0X(context).densityDpi) * 2.0f) / 160.0f);
        this.A0P = round;
        this.A0R = round;
        this.A0Q = round;
        TextPaint textPaint = new TextPaint();
        this.A0V = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint A0K2 = C36441kJ.A0K();
        this.A0U = A0K2;
        A0K2.setAntiAlias(true);
        C36431kI.A1L(A0K2);
    }
}
