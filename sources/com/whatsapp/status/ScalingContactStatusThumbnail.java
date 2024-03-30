package com.whatsapp.status;

import X.AnonymousClass00C;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

public final class ScalingContactStatusThumbnail extends ContactStatusThumbnail {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScalingContactStatusThumbnail(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A03();
    }

    public void A04(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
    }

    public void A05(int i, int i2) {
        if (i2 == 0) {
            requestLayout();
        }
        super.A05(i, i2);
    }

    public int getBorderSizeAdjustment() {
        return (int) this.A00;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 > 0) {
            this.A00 = ((float) getMeasuredWidth()) * 0.04f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A03();
    }

    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A03();
    }
}
