package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass1SC;
import X.C05250Oz;
import X.C111755cn;
import X.C1262763g;
import X.C18800tq;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

public final class WaNetworkResourceImageView extends WaImageView {
    public Bitmap A00;
    public C1262763g A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaNetworkResourceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A03();
        if (attributeSet != null && this.A00 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1SC.A04);
            AnonymousClass00C.A08(obtainStyledAttributes);
            String string = obtainStyledAttributes.getString(0);
            if (string == null || string.length() == 0) {
                this.A00 = null;
            } else {
                measure(0, 0);
                C1262763g r3 = this.A01;
                if (r3 != null) {
                    r3.A00(this, string, getMeasuredWidth(), getMeasuredHeight(), true);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        Bitmap bitmap = this.A00;
        if (bitmap == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap A002 = C111755cn.A00(bitmap, getWidth(), getHeight());
        this.A00 = A002;
        canvas.drawBitmap(A002, (float) ((getWidth() - A002.getWidth()) >> 1), (float) ((getHeight() - A002.getHeight()) >> 1), (Paint) null);
    }

    public void A03() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A00 = C36341k9.A0T(A0W);
            this.A01 = (C1262763g) A0W.A00.AA4.get();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaNetworkResourceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ WaNetworkResourceImageView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaNetworkResourceImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
