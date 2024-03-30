package com.whatsapp;

import X.AnonymousClass2xF;
import X.C135806dI;
import X.C36341k9;
import X.C36361kB;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;

public class WaRoundCornerImageView extends WaImageView {
    public float A00;
    public Path A01;
    public C135806dI A02;
    public boolean A03;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0T);
            try {
                this.A00 = obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 4.0f, C36361kB.A0B(this)));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A02 = new C135806dI(this);
    }

    public void A03() {
        if (!this.A03) {
            this.A03 = true;
            this.A00 = C36341k9.A0U(generatedComponent());
        }
    }

    public void onDraw(Canvas canvas) {
        Path path = this.A01;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
        A00(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }

    public void onDetachedFromWindow() {
        getViewTreeObserver().removeGlobalOnLayoutListener(this.A02);
        super.onDetachedFromWindow();
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
        A00(context, attributeSet);
    }

    public WaRoundCornerImageView(Context context) {
        super(context);
        A03();
        A00(context, (AttributeSet) null);
    }
}
