package com.whatsapp.text;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C12260hl;
import X.C15040mb;
import X.C36321k7;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;
import java.util.Iterator;

public final class TrimmedMultiLineTextView extends WaTextView {
    public Integer A00;
    public boolean A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrimmedMultiLineTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        if (getLayout() != null && getLayout().getLineCount() >= 2) {
            int width = getLayout().getWidth();
            Layout layout = getLayout();
            AnonymousClass00C.A08(layout);
            int ceil = (int) ((float) Math.ceil((double) A06(layout)));
            if (width != ceil) {
                int i = (-(width - ceil)) / 2;
                this.A00 = Integer.valueOf(i);
                canvas.save();
                canvas.translate((float) i, 0.0f);
                super.onDraw(canvas);
                this.A00 = null;
                canvas.restore();
                return;
            }
        }
        super.onDraw(canvas);
    }

    public void A09() {
        if (!this.A01) {
            this.A01 = true;
            C36321k7.A0e(C36361kB.A0P(this), this);
        }
    }

    public int getCompoundPaddingRight() {
        Integer num = this.A00;
        if (num != null) {
            return num.intValue();
        }
        return super.getCompoundPaddingRight();
    }

    public static final float A06(Layout layout) {
        Iterator it = C15040mb.A05(0, layout.getLineCount()).iterator();
        if (!it.hasNext()) {
            return 0.0f;
        }
        C12260hl r2 = (C12260hl) it;
        float lineWidth = layout.getLineWidth(r2.A00());
        while (it.hasNext()) {
            lineWidth = Math.max(lineWidth, layout.getLineWidth(r2.A00()));
        }
        Float valueOf = Float.valueOf(lineWidth);
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return 0.0f;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLayout() != null && getLayout().getLineCount() >= 2) {
            Layout layout = getLayout();
            AnonymousClass00C.A08(layout);
            setMeasuredDimension(getMeasuredWidth() - (getLayout().getWidth() - ((int) ((float) Math.ceil((double) A06(layout))))), getMeasuredHeight());
        }
    }

    public /* synthetic */ TrimmedMultiLineTextView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrimmedMultiLineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A09();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrimmedMultiLineTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
