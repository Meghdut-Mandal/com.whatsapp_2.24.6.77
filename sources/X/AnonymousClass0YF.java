package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import java.util.Objects;

/* renamed from: X.0YF  reason: invalid class name */
public class AnonymousClass0YF {
    public float A00;
    public ColorStateList A01;
    public Typeface A02;
    public boolean A03 = false;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final int A09;
    public final ColorStateList A0A;
    public final ColorStateList A0B;
    public final ColorStateList A0C;
    public final String A0D;
    public final boolean A0E;
    public final int A0F;

    private boolean A01(Context context) {
        int i = this.A0F;
        if (i == 0) {
            return false;
        }
        return !context.isRestricted() && C015006m.A04(context, new TypedValue(), (AnonymousClass071) null, i, 0, false, true) != null;
    }

    public void A06(Context context, AnonymousClass0UG r13) {
        Context context2 = context;
        if (A01(context)) {
            A02(context);
        } else {
            A00(this);
        }
        int i = this.A0F;
        if (i == 0) {
            this.A03 = true;
        }
        if (this.A03) {
            r13.A01(this.A02, true);
            return;
        }
        try {
            C03590Gm r6 = new C03590Gm(this, r13);
            Objects.requireNonNull(r6);
            if (context.isRestricted()) {
                r6.A00(-4);
            } else {
                C015006m.A04(context2, new TypedValue(), r6, i, 0, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.A03 = true;
            r13.A00(1);
        } catch (Exception e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Error loading font ");
            Log.d("TextAppearance", AnonymousClass000.A0q(this.A0D, A0u), e);
            this.A03 = true;
            r13.A00(-3);
        }
    }

    public static void A00(AnonymousClass0YF r2) {
        Typeface typeface;
        if (r2.A02 == null) {
            String str = r2.A0D;
            if (str != null) {
                Typeface create = Typeface.create(str, r2.A08);
                r2.A02 = create;
                if (create != null) {
                    return;
                }
            }
            int i = r2.A09;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else if (i != 3) {
                typeface = Typeface.DEFAULT;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            r2.A02 = typeface;
            r2.A02 = Typeface.create(typeface, r2.A08);
        }
    }

    public Typeface A02(Context context) {
        if (this.A03) {
            return this.A02;
        }
        if (!context.isRestricted()) {
            try {
                Typeface A032 = C015006m.A03(context, this.A0F);
                this.A02 = A032;
                if (A032 != null) {
                    this.A02 = Typeface.create(A032, this.A08);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Error loading font ");
                Log.d("TextAppearance", AnonymousClass000.A0q(this.A0D, A0u), e);
            }
        }
        A00(this);
        this.A03 = true;
        return this.A02;
    }

    public AnonymousClass0YF(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C27931Qk.A0d);
        this.A00 = obtainStyledAttributes.getDimension(0, 0.0f);
        this.A01 = AnonymousClass061.A00(context, obtainStyledAttributes, 3);
        this.A0B = AnonymousClass061.A00(context, obtainStyledAttributes, 4);
        this.A0C = AnonymousClass061.A00(context, obtainStyledAttributes, 5);
        this.A08 = obtainStyledAttributes.getInt(2, 0);
        this.A09 = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.A0F = obtainStyledAttributes.getResourceId(i2, 0);
        this.A0D = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.A0A = AnonymousClass061.A00(context, obtainStyledAttributes, 6);
        this.A05 = obtainStyledAttributes.getFloat(7, 0.0f);
        this.A06 = obtainStyledAttributes.getFloat(8, 0.0f);
        this.A07 = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C27931Qk.A0Q);
        this.A0E = obtainStyledAttributes2.hasValue(0);
        this.A04 = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public void A03(Context context, Typeface typeface, TextPaint textPaint) {
        Typeface A002 = C05540Qc.A00(AnonymousClass000.A0U(context), typeface);
        if (A002 != null) {
            typeface = A002;
        }
        textPaint.setTypeface(typeface);
        int i = this.A08 & (~typeface.getStyle());
        textPaint.setFakeBoldText(AnonymousClass000.A1P(i & 1));
        float f = 0.0f;
        if ((i & 2) != 0) {
            f = -0.25f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.A00);
        if (this.A0E) {
            textPaint.setLetterSpacing(this.A04);
        }
    }

    public void A04(Context context, TextPaint textPaint, AnonymousClass0UG r9) {
        int i;
        int i2;
        A05(context, textPaint, r9);
        ColorStateList colorStateList = this.A01;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.A07;
        float f2 = this.A05;
        float f3 = this.A06;
        ColorStateList colorStateList2 = this.A0A;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public void A05(Context context, TextPaint textPaint, AnonymousClass0UG r4) {
        if (A01(context)) {
            A03(context, A02(context), textPaint);
            return;
        }
        A00(this);
        A03(context, this.A02, textPaint);
        A06(context, new AnonymousClass0NM(context, textPaint, this, r4));
    }
}
