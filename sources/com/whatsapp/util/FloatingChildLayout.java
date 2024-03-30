package com.whatsapp.util;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1QZ;
import X.AnonymousClass4VF;
import X.AnonymousClass4VL;
import X.C18700tb;
import X.C18740tg;
import X.C36441kJ;
import X.C53562rW;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class FloatingChildLayout extends FrameLayout implements C18700tb {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ValueAnimator A06;
    public View.OnTouchListener A07;
    public View A08;
    public AnonymousClass1QZ A09;
    public boolean A0A;
    public Rect A0B;

    public void setBackground(Drawable drawable) {
        C18740tg.A0D(false, "don't setBackground(), it is managed internally");
    }

    public static void A00(FloatingChildLayout floatingChildLayout, Runnable runnable, boolean z) {
        float f;
        float width;
        int i;
        int i2;
        int i3;
        float f2 = 1.0f;
        if (z) {
            f = ((float) floatingChildLayout.A0B.width()) / C36441kJ.A01(floatingChildLayout.A08);
            width = 1.0f;
        } else {
            f = 1.0f;
            width = ((float) floatingChildLayout.A0B.width()) / C36441kJ.A01(floatingChildLayout.A08);
        }
        if (AnonymousClass000.A1P(floatingChildLayout.A04)) {
            float sqrt = ((float) (Math.sqrt(2.0d) * ((double) Math.max(floatingChildLayout.A08.getWidth(), floatingChildLayout.A08.getHeight())))) / 2.0f;
            float min = (float) Math.min(floatingChildLayout.A08.getWidth(), floatingChildLayout.A08.getHeight());
            if (floatingChildLayout.A04 == 1) {
                min /= 2.0f;
            }
            if (!z) {
                float f3 = min;
                min = sqrt;
                sqrt = f3;
            }
            View view = floatingChildLayout.A08;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, view.getWidth() / 2, floatingChildLayout.A08.getWidth() / 2, sqrt, min);
            createCircularReveal.setDuration((long) floatingChildLayout.A01);
            if (z) {
                AnonymousClass4VL.A00(createCircularReveal, floatingChildLayout, 30);
            }
            createCircularReveal.start();
        }
        int[] iArr = new int[2];
        floatingChildLayout.A08.getLocationOnScreen(iArr);
        int i4 = 0;
        Rect rect = floatingChildLayout.A0B;
        if (!z) {
            int i5 = rect.left - iArr[0];
            i3 = rect.top - iArr[1];
            i4 = i5;
            i2 = 0;
            i = 0;
        } else {
            i = rect.left - iArr[0];
            i2 = rect.top - iArr[1];
            i3 = 0;
        }
        boolean A1P = true ^ AnonymousClass000.A1P(floatingChildLayout.A04);
        if (!A1P || z) {
            floatingChildLayout.A08.setAlpha(1.0f);
        } else {
            floatingChildLayout.A08.setAlpha(floatingChildLayout.A00);
        }
        floatingChildLayout.A08.setTranslationX((float) i4);
        floatingChildLayout.A08.setTranslationY((float) i3);
        floatingChildLayout.A08.setPivotX(0.0f);
        floatingChildLayout.A08.setPivotY(0.0f);
        floatingChildLayout.A08.setScaleX(width);
        floatingChildLayout.A08.setScaleY(width);
        ViewPropertyAnimator translationY = floatingChildLayout.A08.animate().setDuration((long) floatingChildLayout.A01).setInterpolator(AnimationUtils.loadInterpolator(floatingChildLayout.getContext(), 17563654)).scaleX(f).scaleY(f).translationX((float) i).translationY((float) i2);
        if (A1P && z) {
            f2 = floatingChildLayout.A00;
        }
        translationY.alpha(f2).setListener(new AnonymousClass4VF(floatingChildLayout, runnable, z));
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int height;
        int centerX;
        int centerY;
        View view = this.A08;
        Rect targetInWindow = getTargetInWindow();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = this.A05;
        if (i5 >= 0) {
            centerX = (getWidth() - measuredWidth) / 2;
            centerY = this.A05;
        } else if (i5 == -1) {
            centerX = targetInWindow.centerX() - (measuredWidth / 2);
            centerY = targetInWindow.centerY() - Math.round(((float) measuredHeight) * 0.75f);
        } else if (i5 == -2) {
            width = (getWidth() - measuredWidth) / 2;
            height = (getHeight() - measuredHeight) / 2;
            view.layout(width, height, view.getMeasuredWidth() + width, view.getMeasuredHeight() + height);
        } else {
            return;
        }
        int width2 = getWidth();
        if (measuredWidth > width2) {
            width = (width2 - measuredWidth) / 2;
        } else {
            width = Math.min(Math.max(centerX, 0), width2 - measuredWidth);
        }
        int height2 = getHeight();
        if (measuredHeight > height2) {
            height = (height2 - measuredHeight) / 2;
        } else {
            height = Math.min(Math.max(centerY, 0), height2 - measuredHeight);
        }
        view.layout(width, height, view.getMeasuredWidth() + width, view.getMeasuredHeight() + height);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.A07;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    public void setBackgroundColorAlpha(int i) {
        setBackgroundColor(i << 24);
    }

    public void setChildTargetScreen(Rect rect) {
        this.A0B = rect;
        requestLayout();
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0A) {
            this.A0A = true;
            generatedComponent();
        }
    }

    private Rect getTargetInWindow() {
        Rect A062 = AnonymousClass001.A06();
        getWindowVisibleDisplayFrame(A062);
        Rect rect = new Rect(this.A0B);
        rect.offset(-A062.left, -A062.top);
        return rect;
    }

    public View getChild() {
        return this.A08;
    }

    public int getTopPosition() {
        return this.A05;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(16908290);
        this.A08 = findViewById;
        findViewById.setDuplicateParentStateEnabled(true);
    }

    public void setOnOutsideTouchListener(View.OnTouchListener onTouchListener) {
        this.A07 = onTouchListener;
    }

    public void setRevealAnimation(int i) {
        this.A04 = i;
    }

    public void setStartingAlpha(float f) {
        this.A00 = f;
    }

    public void setTopPosition(int i) {
        this.A05 = i;
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0A) {
            this.A0A = true;
            generatedComponent();
        }
        this.A0B = AnonymousClass001.A06();
        this.A02 = 0;
        this.A06 = null;
        this.A03 = 0;
        Resources resources = getResources();
        this.A05 = -1;
        this.A01 = (resources.getInteger(17694720) * 11) / 10;
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 0;
        A1O[1] = 127;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
        this.A06 = ofInt;
        C53562rW.A00(ofInt, this, 19);
        super.setBackgroundDrawable(new ColorDrawable(0));
    }
}
