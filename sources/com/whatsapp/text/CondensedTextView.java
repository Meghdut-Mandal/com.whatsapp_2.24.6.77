package com.whatsapp.text;

import X.C36321k7;
import X.C36361kB;
import X.C36371kC;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.whatsapp.WaTextView;

public class CondensedTextView extends WaTextView {
    public float A00;
    public TextPaint A01;
    public boolean A02;

    private void A06(String str) {
        int measuredWidth;
        TextPaint textPaint = this.A01;
        if (textPaint == null || textPaint.getTextSize() != getPaint().getTextSize()) {
            TextPaint textPaint2 = new TextPaint(getPaint());
            this.A01 = textPaint2;
            textPaint2.setTextScaleX(1.0f);
        }
        float measureText = this.A01.measureText(str);
        if (measureText > 0.0f && (measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) > 0) {
            float f = (float) measuredWidth;
            float f2 = f / measureText;
            if (f2 < 1.0f) {
                float max = Math.max(this.A00, f2);
                while (true) {
                    setTextScaleX(max);
                    if (getPaint().measureText(str) <= f || max <= this.A00) {
                        setSingleLine(true);
                        setHorizontallyScrolling(false);
                    } else {
                        max *= 0.99f;
                    }
                }
                setSingleLine(true);
                setHorizontallyScrolling(false);
            } else if (getTextScaleX() != 1.0f) {
                setTextScaleX(1.0f);
            }
        }
    }

    public void A09() {
        if (!this.A02) {
            this.A02 = true;
            C36321k7.A0e(C36361kB.A0P(this), this);
        }
    }

    public CondensedTextView(Context context) {
        super(context);
        A09();
        this.A00 = 0.8f;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A06(C36371kC.A0u(this));
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A06(C36371kC.A0u(this));
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        A06(charSequence.toString());
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.A01.setTextSize(getPaint().getTextSize());
        A06(C36371kC.A0u(this));
    }

    public void setTextScaleLimit(float f) {
        this.A00 = f;
    }

    public CondensedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A09();
        this.A00 = 0.8f;
    }

    public CondensedTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A09();
    }

    public CondensedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A09();
        this.A00 = 0.8f;
    }
}
