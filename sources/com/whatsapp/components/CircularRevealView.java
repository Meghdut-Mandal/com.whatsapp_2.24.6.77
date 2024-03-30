package com.whatsapp.components;

import X.AnonymousClass1QZ;
import X.AnonymousClass4VL;
import X.C18700tb;
import X.C36441kJ;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.FrameLayout;

public class CircularRevealView extends FrameLayout implements C18700tb {
    public int A00;
    public int A01;
    public int A02;
    public Animator.AnimatorListener A03;
    public Paint A04;
    public Path A05;
    public RectF A06;
    public Animation.AnimationListener A07;
    public AnonymousClass1QZ A08;
    public boolean A09;
    public boolean A0A;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A08;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public CircularRevealView(Context context) {
        super(context);
        AnonymousClass4VL.A01(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setColor(int i) {
    }

    public void setDuration(int i) {
        this.A02 = i;
    }

    public void setShouldClearOnRestart(boolean z) {
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A0A) {
            this.A0A = true;
            generatedComponent();
        }
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass4VL.A01(this);
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass4VL.A01(this);
    }

    public CircularRevealView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass4VL.A01(this);
    }
}
