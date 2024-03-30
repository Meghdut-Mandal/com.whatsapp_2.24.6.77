package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass23E;
import X.AnonymousClass4VL;
import X.C18740tg;
import X.C36331k8;
import X.C36371kC;
import X.C36441kJ;
import X.C603137j;
import X.C65753Ti;
import X.C66173Uy;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class RollingCounterView extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C603137j A05;
    public C603137j A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public String A09;
    public final Rect A0A = AnonymousClass001.A06();
    public final ValueAnimator A0B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public final ValueAnimator A0C = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    private void setupWidthAnimator(int i) {
        int measuredWidth = this.A07.getMeasuredWidth();
        int measuredHeight = this.A07.getMeasuredHeight();
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(this);
        int i2 = A0a.leftMargin;
        int i3 = A0a.rightMargin;
        ValueAnimator valueAnimator = this.A0C;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.addUpdateListener(new C66173Uy(this, i - measuredWidth, measuredWidth, measuredHeight, i2, i3));
    }

    public static void A01(C603137j r8, RollingCounterView rollingCounterView) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        rollingCounterView.A05 = r8;
        TextEmojiLabel textEmojiLabel = rollingCounterView.A08;
        String str = rollingCounterView.A09;
        if (str == null) {
            int i = r8.A03;
            if (rollingCounterView instanceof AnonymousClass23E) {
                AnonymousClass23E r0 = (AnonymousClass23E) rollingCounterView;
                str = C65753Ti.A01(r0.getContext(), r0.A00, i);
            } else {
                str = Integer.toString(i);
            }
        }
        textEmojiLabel.setText(str);
        C36331k8.A0x(rollingCounterView.A07);
        C36331k8.A0x(rollingCounterView.A08);
        long j = r8.A01;
        if (j == 0 && r8.A02 == 0) {
            int measuredWidth = rollingCounterView.A08.getMeasuredWidth();
            int measuredHeight = rollingCounterView.A08.getMeasuredHeight();
            int i2 = rollingCounterView.A01;
            int i3 = rollingCounterView.A02;
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(rollingCounterView);
            A0a.width = measuredWidth;
            A0a.height = measuredHeight;
            A0a.leftMargin = i2;
            A0a.rightMargin = i3;
            rollingCounterView.A0A.set(0, 0, measuredWidth, measuredHeight);
            rollingCounterView.setLayoutParams(A0a);
            A02(rollingCounterView);
            return;
        }
        int measuredWidth2 = rollingCounterView.A08.getMeasuredWidth() - rollingCounterView.A07.getMeasuredWidth();
        AnimatorSet A0C2 = C36441kJ.A0C();
        if (measuredWidth2 != 0) {
            rollingCounterView.setupWidthAnimator(rollingCounterView.A08.getMeasuredWidth());
            Animator[] animatorArr = new Animator[2];
            if (measuredWidth2 > 0) {
                animatorArr[0] = rollingCounterView.A0C;
                valueAnimator2 = rollingCounterView.A0B;
                valueAnimator = valueAnimator2;
            } else {
                valueAnimator = rollingCounterView.A0B;
                animatorArr[0] = valueAnimator;
                valueAnimator2 = rollingCounterView.A0C;
            }
            animatorArr[1] = valueAnimator2;
            A0C2.playSequentially(animatorArr);
        } else {
            valueAnimator = rollingCounterView.A0B;
            A0C2.play(valueAnimator);
        }
        rollingCounterView.A0C.setDuration(r8.A02);
        valueAnimator.setDuration(j);
        A0C2.start();
    }

    public static void A02(RollingCounterView rollingCounterView) {
        C603137j r0 = rollingCounterView.A05;
        if (r0 == null) {
            C18740tg.A0A(AnonymousClass001.A09("finishedAnimationl called when currentAnimationInfo is null! This should never occur."));
            return;
        }
        int i = r0.A03;
        rollingCounterView.A00 = i;
        TextEmojiLabel textEmojiLabel = rollingCounterView.A07;
        String str = rollingCounterView.A09;
        if (str == null) {
            if (rollingCounterView instanceof AnonymousClass23E) {
                AnonymousClass23E r02 = (AnonymousClass23E) rollingCounterView;
                str = C65753Ti.A01(r02.getContext(), r02.A00, i);
            } else {
                str = Integer.toString(i);
            }
        }
        textEmojiLabel.setText(str);
        rollingCounterView.A07.requestLayout();
        rollingCounterView.A08.requestLayout();
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(rollingCounterView);
        A0a.leftMargin = rollingCounterView.A01;
        A0a.rightMargin = rollingCounterView.A02;
        rollingCounterView.setLayoutParams(A0a);
        C603137j r1 = rollingCounterView.A06;
        if (r1 != null) {
            rollingCounterView.A06 = null;
            A01(r1, rollingCounterView);
            return;
        }
        rollingCounterView.A05 = null;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        float f;
        if (view == this.A07 || view == this.A08) {
            C603137j r0 = this.A05;
            if (r0 == null) {
                i = 0;
            } else {
                i = r0.A00;
            }
            ValueAnimator valueAnimator = this.A0B;
            if (valueAnimator.isRunning()) {
                f = AnonymousClass000.A00(valueAnimator);
            } else {
                f = 0.0f;
            }
            if (view == this.A08) {
                i = -i;
                f = 1.0f - f;
            }
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.A0A;
            if (rect.isEmpty()) {
                rect.set(0, 0, getMeasuredWidth(), measuredHeight);
            }
            canvas.save();
            canvas.clipRect(rect);
            canvas.translate(0.0f, ((float) (-measuredHeight)) * f * ((float) i));
            view.draw(canvas);
            canvas.restore();
            if (valueAnimator.isRunning()) {
                invalidate();
                return true;
            }
        } else {
            C18740tg.A0A(AnonymousClass001.A08("drawChild given something other than primary/secondary textview"));
        }
        return false;
    }

    public String getPrimaryText() {
        if (TextUtils.isEmpty(this.A07.getText())) {
            return null;
        }
        return C36371kC.A0u(this.A07);
    }

    public void setAnimationInterpolator(TimeInterpolator timeInterpolator) {
        this.A0B.setInterpolator(timeInterpolator);
        this.A0C.setInterpolator(timeInterpolator);
    }

    public void setTextColor(int i) {
        this.A07.setTextColor(i);
        this.A08.setTextColor(i);
    }

    public RollingCounterView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        this.A07 = new TextEmojiLabel(getContext());
        this.A08 = new TextEmojiLabel(getContext());
        super.addView(this.A07);
        super.addView(this.A08);
        AnonymousClass4VL.A00(this.A0B, this, 0);
    }

    public RollingCounterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public RollingCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
