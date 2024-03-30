package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass02G;
import X.AnonymousClass07S;
import X.AnonymousClass1RE;
import X.AnonymousClass2xF;
import X.C011504z;
import X.C012005e;
import X.C166247vP;
import X.C36361kB;
import X.C36431kI;
import X.C36441kJ;
import X.C38431oq;
import X.C38521pE;
import X.C39211rW;
import X.C67143Yr;
import X.C68243ba;
import X.C90104Zc;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;

public class PagerSlidingTabStrip extends C38431oq {
    public static final int[] A0R;
    public float A00;
    public int A01;
    public LinearLayout A02;
    public AnonymousClass02G A03;
    public ViewPager A04;
    public int A05;
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
    public Paint A0K;
    public Paint A0L;
    public LinearLayout.LayoutParams A0M;
    public LinearLayout.LayoutParams A0N;
    public Locale A0O;
    public boolean A0P;
    public final C68243ba A0Q;

    public PagerSlidingTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A00() {
        for (int i = 0; i < this.A0D; i++) {
            View childAt = this.A02.getChildAt(i);
            childAt.setBackgroundResource(this.A0C);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, (float) this.A0G);
                textView.setTypeface((Typeface) null, this.A0H);
                textView.setTextColor(this.A0F);
                textView.setAllCaps(true);
            }
        }
    }

    public void A04(View view, int i) {
        LinearLayout.LayoutParams layoutParams;
        view.setFocusable(true);
        C67143Yr.A00(view, this, i, 0);
        int i2 = this.A0E;
        view.setPadding(i2, 0, i2, 0);
        C012005e.A0V(view, new C39211rW(this));
        LinearLayout linearLayout = this.A02;
        if (this.A0P) {
            layoutParams = this.A0N;
        } else {
            layoutParams = this.A0M;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    public void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (!isInEditMode() && this.A0D != 0) {
            int height = getHeight();
            Paint paint = this.A0L;
            paint.setColor(this.A08);
            LinearLayout linearLayout = this.A02;
            View childAt = linearLayout.getChildAt(this.A01);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.A00 > 0.0f && (i = this.A01) < this.A0D - 1) {
                View childAt2 = linearLayout.getChildAt(i + 1);
                float left2 = (float) childAt2.getLeft();
                float right2 = (float) childAt2.getRight();
                float f = this.A00;
                float f2 = 1.0f - f;
                left = (left2 * f) + (f2 * left);
                right = (right2 * f) + (f2 * right);
            }
            float f3 = (float) height;
            canvas2.drawRect(left, (float) (height - this.A09), right, f3, paint);
            paint.setColor(this.A0I);
            canvas2.drawRect(0.0f, (float) (height - this.A0J), C36441kJ.A01(linearLayout), f3, paint);
            Paint paint2 = this.A0K;
            paint2.setColor(this.A05);
            for (int i2 = 0; i2 < this.A0D - 1; i2++) {
                View childAt3 = linearLayout.getChildAt(i2);
                int i3 = this.A06;
                canvas2.drawLine((float) childAt3.getRight(), (float) i3, (float) childAt3.getRight(), (float) (height - i3), paint2);
            }
        }
    }

    public static void A01(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        if (pagerSlidingTabStrip.A0D != 0) {
            int left = pagerSlidingTabStrip.A02.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= pagerSlidingTabStrip.A0B;
            }
            if (left != pagerSlidingTabStrip.A0A) {
                pagerSlidingTabStrip.A0A = left;
                pagerSlidingTabStrip.scrollTo(left, 0);
            }
        }
    }

    public void A03() {
        this.A02.removeAllViews();
        this.A0D = this.A04.getAdapter().A0H();
        for (int i = 0; i < this.A0D; i++) {
            AnonymousClass07S adapter = this.A04.getAdapter();
            if (adapter instanceof AnonymousClass1RE) {
                A04(((AnonymousClass1RE) adapter).BF1(i), i);
            } else {
                String charSequence = adapter.A0F(i).toString();
                TextView textView = new TextView(getContext());
                textView.setText(charSequence);
                textView.setGravity(17);
                textView.setSingleLine();
                A04(textView, i);
            }
        }
        A00();
        C90104Zc.A00(getViewTreeObserver(), this, 1);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C166247vP r2 = (C166247vP) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A01 = r2.A00;
        requestLayout();
    }

    public void setShouldExpand(boolean z) {
        this.A0P = z;
        requestLayout();
    }

    public void setTextColor(int i) {
        this.A0F = i;
        A00();
    }

    public void setTextSize(int i) {
        this.A0G = i;
        A00();
    }

    public void setUnderlineColor(int i) {
        this.A0I = i;
        requestLayout();
    }

    public void setViewPager(ViewPager viewPager) {
        this.A04 = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.A0B = this.A0Q;
            A03();
            return;
        }
        throw AnonymousClass001.A09("ViewPager does not have adapter instance.");
    }

    static {
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 16842901;
        A1O[1] = 16842904;
        A0R = A1O;
    }

    public int getTextColor() {
        return this.A0F;
    }

    public int getTextSize() {
        return this.A0G;
    }

    public Parcelable onSaveInstanceState() {
        C166247vP r1 = new C166247vP(super.onSaveInstanceState());
        r1.A00 = this.A01;
        return r1;
    }

    public void setOnPageChangeListener(AnonymousClass02G r1) {
        this.A03 = r1;
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout linearLayout;
        this.A0Q = new C68243ba(this);
        this.A01 = 0;
        this.A00 = 0.0f;
        this.A08 = -10066330;
        this.A0I = 436207616;
        this.A05 = 436207616;
        this.A0P = true;
        this.A0B = 52;
        this.A09 = 3;
        this.A0J = 1;
        this.A06 = 12;
        this.A0E = 8;
        this.A07 = 1;
        this.A0G = 12;
        this.A0F = -10066330;
        this.A0H = 1;
        this.A0A = 0;
        this.A0C = R.drawable.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        if (this instanceof HomePagerSlidingTabStrip) {
            linearLayout = new C38521pE(context);
        } else {
            linearLayout = new LinearLayout(context);
        }
        this.A02 = linearLayout;
        linearLayout.setOrientation(0);
        this.A02.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.A02);
        C011504z.A06(this.A02, 2);
        DisplayMetrics A0B2 = C36361kB.A0B(this);
        this.A0B = (int) TypedValue.applyDimension(1, (float) this.A0B, A0B2);
        this.A09 = (int) TypedValue.applyDimension(1, (float) this.A09, A0B2);
        this.A0J = (int) TypedValue.applyDimension(1, (float) this.A0J, A0B2);
        this.A06 = (int) TypedValue.applyDimension(1, (float) this.A06, A0B2);
        this.A0E = (int) TypedValue.applyDimension(1, (float) this.A0E, A0B2);
        this.A07 = (int) TypedValue.applyDimension(1, (float) this.A07, A0B2);
        this.A0G = (int) TypedValue.applyDimension(2, (float) this.A0G, A0B2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0R);
        this.A0G = obtainStyledAttributes.getDimensionPixelSize(0, this.A0G);
        this.A0F = obtainStyledAttributes.getColor(1, this.A0F);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0D);
        this.A08 = obtainStyledAttributes2.getColor(1, this.A08);
        this.A05 = obtainStyledAttributes2.getColor(0, this.A05);
        this.A0E = obtainStyledAttributes2.getDimensionPixelSize(2, this.A0E);
        obtainStyledAttributes2.recycle();
        Paint A0K2 = C36441kJ.A0K();
        this.A0L = A0K2;
        A0K2.setAntiAlias(true);
        C36431kI.A1L(this.A0L);
        Paint A0K3 = C36441kJ.A0K();
        this.A0K = A0K3;
        A0K3.setAntiAlias(true);
        this.A0K.setStrokeWidth((float) this.A07);
        this.A0M = new LinearLayout.LayoutParams(-2, -1);
        this.A0N = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.A0O == null) {
            this.A0O = C36431kI.A0H(this).locale;
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
