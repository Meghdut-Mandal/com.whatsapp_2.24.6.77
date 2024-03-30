package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4py  reason: invalid class name and case insensitive filesystem */
public class C97604py extends C139206jP {
    public float A00;
    public AnonymousClass6LS A01;
    public final float A02;
    public final Rect A03 = AnonymousClass001.A06();
    public final RectF A04 = C36441kJ.A0N();
    public final RectF A05 = C36441kJ.A0N();
    public final Drawable A06;
    public final C108545Tx A07;
    public final Paint A08;

    public void A06(Canvas canvas) {
        Drawable drawable = this.A06;
        Rect rect = this.A03;
        drawable.setBounds(rect);
        canvas.drawCircle((float) rect.centerX(), (float) rect.centerY(), (float) (rect.width() >> 1), this.A08);
        drawable.setAlpha(76);
        drawable.draw(canvas);
    }

    public C97604py(Drawable drawable, C139266jV r6, C108545Tx r7, AnonymousClass6LS r8) {
        super(r6);
        Paint A0K = C36441kJ.A0K();
        this.A08 = A0K;
        this.A01 = r8;
        this.A06 = drawable;
        float f = this.A0B;
        this.A02 = (f * 48.0f) / 2.0f;
        this.A00 = (float) ((int) (f * 8.0f));
        this.A03 = 5;
        this.A02 = 4.0f;
        this.A07 = r7 == null ? C108545Tx.BOTTOM_RIGHT : r7;
        A0K.setColor(-1);
        A0K.setAlpha(178);
    }
}
