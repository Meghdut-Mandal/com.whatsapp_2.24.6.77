package com.whatsapp.util;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ClippingLayout extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public Rect A02;

    public boolean drawChild(Canvas canvas, View view, long j) {
        Rect rect = this.A02;
        if (rect != null) {
            canvas.clipRect(rect);
        }
        return super.drawChild(canvas, view, j);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setClipBounds(Rect rect) {
        Rect rect2;
        Rect rect3 = this.A02;
        if (rect != rect3) {
            if (rect == null) {
                rect2 = null;
            } else if (!rect.equals(rect3)) {
                Rect rect4 = this.A02;
                if (rect4 == null) {
                    rect2 = new Rect(rect);
                } else {
                    rect4.set(rect);
                    invalidate();
                }
            } else {
                return;
            }
            this.A02 = rect2;
            invalidate();
        }
    }

    public ClippingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public ClippingLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public ClippingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public ClippingLayout(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
