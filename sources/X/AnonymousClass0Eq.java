package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.0Eq  reason: invalid class name */
public abstract class AnonymousClass0Eq extends FrameLayout {
    public static final View.OnTouchListener A0B = new C09100bp();
    public AnonymousClass06J A00;
    public int A01;
    public Rect A02;
    public boolean A03;
    public ColorStateList A04;
    public PorterDuff.Mode A05;
    public AnonymousClass6YL A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;

    public AnonymousClass0Eq(Context context, AttributeSet attributeSet) {
        super(C27891Qg.A00(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C27931Qk.A0b);
        if (obtainStyledAttributes.hasValue(6)) {
            C011004s.A05(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.A01 = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.A00 = new AnonymousClass06J(AnonymousClass06J.A01(context2, attributeSet, 0, 0));
        }
        this.A08 = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AnonymousClass061.A00(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(AnonymousClass062.A01(PorterDuff.Mode.SRC_IN, obtainStyledAttributes.getInt(5, -1)));
        this.A07 = obtainStyledAttributes.getFloat(1, 1.0f);
        this.A0A = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.A09 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(A0B);
        setFocusable(true);
        if (getBackground() == null) {
            C011504z.A04(A00(), this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.05l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable A00() {
        /*
            r4 = this;
            float r2 = r4.A08
            r1 = 2130969032(0x7f0401c8, float:1.7546734E38)
            r0 = 2130969012(0x7f0401b4, float:1.7546694E38)
            int r1 = X.C014606i.A02(r4, r1)
            int r0 = X.C014606i.A02(r4, r0)
            int r3 = X.C014606i.A00(r2, r1, r0)
            X.06J r1 = r4.A00
            if (r1 == 0) goto L_0x0034
            android.os.Handler r0 = X.AnonymousClass6YL.A0M
            X.05l r2 = new X.05l
            r2.<init>((X.AnonymousClass06J) r1)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r3)
            r2.A0C(r0)
        L_0x0026:
            android.content.res.ColorStateList r0 = r4.A04
            android.graphics.drawable.Drawable r1 = X.AnonymousClass08I.A01(r2)
            if (r0 == 0) goto L_0x0033
            android.content.res.ColorStateList r0 = r4.A04
            X.AnonymousClass076.A01(r0, r1)
        L_0x0033:
            return r1
        L_0x0034:
            android.content.res.Resources r1 = r4.getResources()
            android.os.Handler r0 = X.AnonymousClass6YL.A0M
            r0 = 2131167591(0x7f070967, float:1.794946E38)
            float r1 = r1.getDimension(r0)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r0 = 0
            r2.setShape(r0)
            r2.setCornerRadius(r1)
            r2.setColor(r3)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Eq.A00():android.graphics.drawable.Drawable");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.A04 == null)) {
            drawable = AnonymousClass08I.A01(drawable.mutate());
            AnonymousClass076.A01(this.A04, drawable);
            AnonymousClass076.A04(this.A05, drawable);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.A04 = colorStateList;
        if (getBackground() != null) {
            Drawable A012 = AnonymousClass08I.A01(getBackground().mutate());
            AnonymousClass076.A01(colorStateList, A012);
            AnonymousClass076.A04(this.A05, A012);
            if (A012 != getBackground()) {
                super.setBackgroundDrawable(A012);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.A05 = mode;
        if (getBackground() != null) {
            Drawable A012 = AnonymousClass08I.A01(getBackground().mutate());
            AnonymousClass076.A04(mode, A012);
            if (A012 != getBackground()) {
                super.setBackgroundDrawable(A012);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener;
        if (onClickListener != null) {
            onTouchListener = null;
        } else {
            onTouchListener = A0B;
        }
        setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass6YL r0 = this.A06;
        if (r0 != null) {
            r0.A0K();
        }
        AnonymousClass09G.A00(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass6YL r0 = this.A06;
        if (r0 != null) {
            r0.A0L();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass6YL r0 = this.A06;
        if (r0 != null) {
            r0.A0M();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.A0A;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.A03 && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.A02 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            AnonymousClass6YL r0 = this.A06;
            if (r0 != null) {
                r0.A0C();
            }
        }
    }

    /* access modifiers changed from: private */
    public void setBaseTransientBottomBar(AnonymousClass6YL r1) {
        this.A06 = r1;
    }

    public void setAnimationMode(int i) {
        this.A01 = i;
    }

    public void setBackground(Drawable drawable) {
        throw null;
    }

    public float getActionTextColorAlpha() {
        return this.A07;
    }

    public int getAnimationMode() {
        return this.A01;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.A08;
    }

    public int getMaxInlineActionWidth() {
        return this.A09;
    }

    public int getMaxWidth() {
        return this.A0A;
    }
}
