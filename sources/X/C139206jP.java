package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Comparator;

/* renamed from: X.6jP  reason: invalid class name and case insensitive filesystem */
public abstract class C139206jP implements AnonymousClass7eK {
    public static int A0D;
    public static final Comparator A0E = new C163907qx(2);
    public double A00;
    public double A01;
    public float A02;
    public int A03 = 1;
    public boolean A04 = true;
    public final int A05;
    public final Context A06;
    public final C139266jV A07;
    public final AnonymousClass6WY A08;
    public final C130866Ms A09 = new C130866Ms();
    public final float[] A0A = C90524aI.A0v();
    public final float A0B;
    public final int A0C;

    public abstract void A06(Canvas canvas);

    public void A03() {
        this.A07.A0Q.invalidate();
    }

    public void A04() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this instanceof C97614pz) {
            C97614pz r4 = (C97614pz) this;
            float f6 = r4.A03;
            float f7 = f6 + ((float) 0);
            float f8 = f6 + ((float) r4.A07.A07);
            float f9 = r4.A02;
            r4.A00 = f7 + f9;
            r4.A01 = f8 + f9;
        } else if (this instanceof C97604py) {
            C97604py r6 = (C97604py) this;
            C139266jV r7 = r6.A07;
            C92794ej r2 = r7.A0Q;
            Rect rect = r6.A03;
            Drawable drawable = r6.A06;
            rect.set(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int ordinal = r6.A07.ordinal();
            if (ordinal == 0) {
                f = r6.A00;
                f4 = ((float) 0) + f;
                f3 = f + ((float) r7.A07);
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    f5 = r6.A00;
                    f2 = (((float) (r2.getWidth() - rect.width())) - f5) - ((float) r7.A06);
                } else {
                    f5 = r6.A00;
                    f2 = f5 + ((float) 0);
                }
                f3 = (((float) (r2.getHeight() - rect.height())) - f5) - ((float) r7.A05);
            } else {
                f = r6.A00;
                f4 = (((float) (r2.getWidth() - rect.width())) - f) - ((float) r7.A06);
                f3 = f + ((float) r7.A07);
            }
            RectF rectF = r6.A04;
            rectF.set(rect);
            rectF.offsetTo(f2, f3);
            rect.offsetTo((int) f2, (int) f3);
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            RectF rectF2 = r6.A05;
            float f10 = r6.A02;
            rectF2.set(centerX - f10, centerY - f10, centerX + f10, centerY + f10);
        }
    }

    public void A05(boolean z) {
        this.A04 = z;
        A03();
    }

    public C134976bv BG3() {
        if (this instanceof C97634q1) {
            return ((C97634q1) this).A0E;
        }
        return C134976bv.A00(AnonymousClass6WY.A02(this.A01), (this.A00 * 360.0d) - 180.0d);
    }

    public C139206jP(C139266jV r3) {
        int i = A0D;
        A0D = i + 1;
        this.A05 = i;
        this.A07 = r3;
        this.A08 = r3.A0R;
        Context context = r3.A0Q.getContext();
        this.A06 = context;
        this.A0B = C36341k9.A00(context);
        this.A0C = r3.A0N;
    }
}
