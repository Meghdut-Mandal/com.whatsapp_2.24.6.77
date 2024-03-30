package com.whatsapp.emoji;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36361kB;
import X.C36401kF;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class EmojiContainerView extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public boolean A02;
    public Paint A03;
    public Path A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public EmojiContainerView(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A02) {
            if (this.A04 == null) {
                this.A04 = C36441kJ.A0M();
            }
            Paint paint = this.A03;
            if (paint == null) {
                paint = C36441kJ.A0K();
                this.A03 = paint;
            }
            paint.setColor(285212672);
            this.A04.reset();
            C36401kF.A13(this.A04, this);
            C36401kF.A12(this.A04, this);
            C36361kB.A11(this.A04, this, (getWidth() * 3) / 4);
            C36361kB.A11(this.A04, this, (getWidth() * 9) / 10);
            this.A04.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A04, this.A03);
        }
    }

    public void setIsSkinTone(boolean z) {
        this.A02 = z;
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }
}
