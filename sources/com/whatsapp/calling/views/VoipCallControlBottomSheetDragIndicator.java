package com.whatsapp.calling.views;

import X.AnonymousClass000;
import X.AnonymousClass1QZ;
import X.AnonymousClass6UI;
import X.AnonymousClass6X3;
import X.C144236rr;
import X.C157277ch;
import X.C18700tb;
import X.C33521fV;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36421kH;
import X.C36441kJ;
import X.C56762wq;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.whatsapp.R;

public class VoipCallControlBottomSheetDragIndicator extends View implements C18700tb {
    public float A00;
    public int A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public float A04;
    public C157277ch A05;
    public boolean A06;
    public final Paint A07;
    public final Path A08;

    public static boolean A01(VoipCallControlBottomSheetDragIndicator voipCallControlBottomSheetDragIndicator, int i) {
        C157277ch r0;
        if (i == 0) {
            voipCallControlBottomSheetDragIndicator.A03 = true;
            return false;
        } else if (i != 1) {
            if (i != 2) {
                voipCallControlBottomSheetDragIndicator.A03 = false;
            }
            return false;
        } else {
            if (voipCallControlBottomSheetDragIndicator.A03 && (r0 = voipCallControlBottomSheetDragIndicator.A05) != null) {
                float f = voipCallControlBottomSheetDragIndicator.A00;
                AnonymousClass6X3 r2 = ((C144236rr) r0).A00.A0L;
                if (r2 != null) {
                    int i2 = 3;
                    if (f > 0.0f) {
                        i2 = 4;
                    }
                    AnonymousClass6X3.A01(r2, i2);
                }
            }
            voipCallControlBottomSheetDragIndicator.A03 = false;
            return true;
        }
    }

    /* JADX INFO: finally extract failed */
    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56762wq.A02);
            try {
                int color = obtainStyledAttributes.getColor(0, -1);
                obtainStyledAttributes.recycle();
                Paint paint = this.A07;
                C36421kH.A0q(paint);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(C36341k9.A00(context) * 4.0f);
                paint.setColor(color);
                this.A04 = TypedValue.applyDimension(1, 2.5f, C36361kB.A0B(this));
                C33521fV.A02(this);
                Context context2 = getContext();
                int i = (this.A00 > 0.0f ? 1 : (this.A00 == 0.0f ? 0 : -1));
                int i2 = R.string.f12nameremoved;
                if (i > 0) {
                    i2 = R.string.f12nameremoved;
                }
                C36331k8.A0q(context2, this, i2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public void A02() {
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setOnClickListener(C157277ch r3) {
        this.A05 = r3;
        super.setOnTouchListener(new AnonymousClass6UI(this, 3));
    }

    public void setSlideOffset(float f) {
        float f2;
        if (f > 1.0f) {
            f2 = 1.0f;
        } else if (f <= 0.0f) {
            f2 = -1.0f;
        } else {
            f2 = (f - 0.5f) * 2.0f;
        }
        this.A00 = f2;
        if (f2 == 1.0f || f2 == -1.0f) {
            Context context = getContext();
            int i = (this.A00 > 0.0f ? 1 : (this.A00 == 0.0f ? 0 : -1));
            int i2 = R.string.f12nameremoved;
            if (i > 0) {
                i2 = R.string.f12nameremoved;
            }
            C36331k8.A0q(context, this, i2);
        }
        invalidate();
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A07 = C36371kC.A0E();
        this.A08 = C36441kJ.A0M();
        this.A00 = -1.0f;
        A00(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = (float) getPaddingLeft();
        float paddingTop = (float) getPaddingTop();
        float A0B = (float) AnonymousClass000.A0B(this);
        float A0A = (float) AnonymousClass000.A0A(this);
        float f = (A0A + paddingTop) / 2.0f;
        float f2 = this.A00;
        float f3 = (((A0A - paddingTop) / 2.0f) * f2) + f;
        float f4 = f + (this.A04 * (-f2));
        Path path = this.A08;
        path.reset();
        path.moveTo(paddingLeft, f4);
        path.lineTo((paddingLeft + A0B) / 2.0f, f3);
        path.lineTo(A0B, f4);
        canvas.drawPath(path, this.A07);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
        this.A07 = C36371kC.A0E();
        this.A08 = C36441kJ.A0M();
        this.A00 = -1.0f;
        A00(context, attributeSet);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A07 = C36371kC.A0E();
        this.A08 = C36441kJ.A0M();
        this.A00 = -1.0f;
        A00(context, attributeSet);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context) {
        super(context);
        A02();
        this.A07 = C36371kC.A0E();
        this.A08 = C36441kJ.A0M();
        this.A00 = -1.0f;
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }
}
