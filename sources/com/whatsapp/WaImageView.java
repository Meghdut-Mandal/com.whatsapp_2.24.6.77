package com.whatsapp;

import X.AnonymousClass1SC;
import X.C18820ts;
import X.C28061Rd;
import X.C53162qs;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageView extends C28061Rd {
    public C18820ts A00;
    public boolean A01;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && this.A00 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1SC.A03);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                setContentDescription(this.A00.A0B(resourceId));
            }
            this.A01 = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        C18820ts r0;
        if (!this.A01 || (r0 = this.A00) == null) {
            z = false;
        } else {
            z = C18820ts.A00(r0).A06;
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        }
        try {
            super.onDraw(canvas);
            if (this.A01 && z) {
                canvas.restore();
            }
        } catch (RuntimeException e) {
            C53162qs.A00(this, "waimageview/");
            throw e;
        }
    }

    public WaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public void setMirrorForRtl(boolean z) {
        this.A01 = z;
    }

    public WaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public WaImageView(Context context) {
        super(context);
    }
}
