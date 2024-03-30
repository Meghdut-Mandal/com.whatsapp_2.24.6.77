package com.whatsapp.text;

import X.C19550w8;
import X.C36321k7;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C81293wm;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.whatsapp.WaTextView;

public class AutoSizeTextView extends WaTextView {
    public float A00;
    public float A01;
    public int A02;
    public int[] A03;
    public boolean A04;

    public /* synthetic */ void A0E(int i) {
        super.setTextSize(0, (float) i);
    }

    private void A06() {
        int i;
        int compoundPaddingLeft = (this.A02 - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        int[] iArr = this.A03;
        if (iArr != null && iArr.length != 0) {
            TextPaint textPaint = new TextPaint(getPaint());
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.A03;
                int length = iArr2.length;
                if (i2 >= length) {
                    i = iArr2[length - 1];
                    break;
                }
                textPaint.setTextSize((float) iArr2[i2]);
                if (textPaint.measureText(C36371kC.A0u(this)) <= ((float) compoundPaddingLeft)) {
                    i = this.A03[i2];
                    break;
                }
                i2++;
            }
            if (i >= 0) {
                post(new C81293wm((Object) this, i, 15));
            }
        }
    }

    private void A07() {
        float f;
        float f2;
        float f3 = this.A00;
        if (C19550w8.A0A()) {
            f = TypedValue.convertPixelsToDimension(2, f3, C36361kB.A0B(this));
        } else {
            f = f3 / C36361kB.A0B(this).scaledDensity;
        }
        int round = Math.round(f);
        float f4 = this.A01;
        if (C19550w8.A0A()) {
            f2 = TypedValue.convertPixelsToDimension(2, f4, C36361kB.A0B(this));
        } else {
            f2 = f4 / C36361kB.A0B(this).scaledDensity;
        }
        int round2 = (round - Math.round(f2)) + 1;
        this.A03 = new int[round2];
        for (int i = 0; i < round2; i++) {
            this.A03[i] = Math.round(TypedValue.applyDimension(2, (float) (round - i), C36361kB.A0B(this)));
        }
    }

    public void A09() {
        if (!this.A04) {
            this.A04 = true;
            C36321k7.A0e(C36361kB.A0P(this), this);
        }
    }

    public void A0D(int i) {
        this.A01 = TypedValue.applyDimension(2, (float) 11, C36361kB.A0B(this));
        this.A02 = Math.round(TypedValue.applyDimension(1, (float) i, C36361kB.A0B(this)));
        if (this.A00 == 0.0f) {
            this.A00 = getTextSize();
        }
        A07();
        A06();
    }

    public AutoSizeTextView(Context context) {
        super(context);
        C36401kF.A1M(this);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i != i3 && i2 != i4) {
            A06();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A06();
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.A00 = getPaint().getTextSize();
        A07();
        A06();
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C36401kF.A1M(this);
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A09();
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C36401kF.A1M(this);
    }
}
