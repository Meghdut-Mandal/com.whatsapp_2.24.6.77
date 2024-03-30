package com.facebook.shimmer;

import X.C112865ea;
import X.C125045zE;
import X.C129106Fe;
import X.C36441kJ;
import X.C91264bj;
import X.C98394rM;
import X.C98404rN;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ShimmerFrameLayout extends FrameLayout {
    public boolean A00 = true;
    public final Paint A01 = C36441kJ.A0K();
    public final C91264bj A02 = new C91264bj();

    private void A00(Context context, AttributeSet attributeSet) {
        C129106Fe r0;
        setWillNotDraw(false);
        this.A02.setCallback(this);
        if (attributeSet == null) {
            A05(new C98394rM().A01());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C112865ea.A00, 0, 0);
        try {
            if (!obtainStyledAttributes.hasValue(4) || !obtainStyledAttributes.getBoolean(4, false)) {
                r0 = new C98394rM();
            } else {
                r0 = new C98404rN();
            }
            r0.A00(obtainStyledAttributes);
            A05(r0.A01());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void A01() {
        if (this.A00) {
            A04();
            this.A00 = false;
            invalidate();
        }
    }

    public void A02() {
        if (!this.A00) {
            this.A00 = true;
            A03();
        }
    }

    public void A03() {
        C91264bj r1 = this.A02;
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null && !valueAnimator.isStarted() && r1.getCallback() != null) {
            r1.A00.start();
        }
    }

    public void A04() {
        C91264bj r1 = this.A02;
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            r1.A00.cancel();
        }
    }

    public void A05(C125045zE r3) {
        int i;
        Paint paint;
        this.A02.A02(r3);
        if (r3 == null || !r3.A0H) {
            i = 0;
            paint = null;
        } else {
            i = 2;
            paint = this.A01;
        }
        setLayerType(i, paint);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A00) {
            this.A02.draw(canvas);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A02.A01();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A04();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02.setBounds(0, 0, getWidth(), getHeight());
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A02) {
            return true;
        }
        return false;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }
}
