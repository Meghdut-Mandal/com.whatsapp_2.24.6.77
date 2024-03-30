package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.C000800j;
import X.C001400p;
import X.C05250Oz;
import X.C107975Rq;
import X.C152097Je;
import X.C152107Jf;
import X.C36331k8;
import X.C36381kD;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public final class AvatarProfilePhotoColorView extends View {
    public C107975Rq A00;
    public final Paint A01;
    public final Paint A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoColorView(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public void onDraw(Canvas canvas) {
        float f;
        AnonymousClass00C.A0D(canvas, 0);
        int width = getWidth() / 2;
        int A07 = C36441kJ.A07(this);
        float min = ((float) Math.min(C36331k8.A00(this, getWidth()), AnonymousClass000.A0D(this, getHeight()))) / 2.0f;
        C107975Rq r0 = this.A00;
        C107975Rq r4 = C107975Rq.SELECTED;
        if (r0 == r4) {
            f = min - getSelectedBorderMargin();
        } else {
            f = min;
        }
        float f2 = (float) width;
        float f3 = (float) A07;
        canvas.drawCircle(f2, f3, f, this.A01);
        if (this.A00 == r4) {
            canvas.drawCircle(f2, f3, min, this.A02);
        }
    }

    private final float getBorderStrokeWidthSelected() {
        return C36441kJ.A03(this.A03.getValue());
    }

    private final float getSelectedBorderMargin() {
        return C36441kJ.A03(this.A04.getValue());
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public /* synthetic */ AvatarProfilePhotoColorView(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        C000800j r1 = C000800j.NONE;
        this.A03 = C001400p.A00(r1, new C152097Je(this));
        this.A04 = C001400p.A00(r1, new C152107Jf(this));
        this.A00 = C107975Rq.IDLE;
        Paint A0K = C36441kJ.A0K();
        A0K.setStrokeWidth(getBorderStrokeWidthSelected());
        C36421kH.A0q(A0K);
        A0K.setAntiAlias(true);
        A0K.setDither(true);
        this.A02 = A0K;
        Paint A0K2 = C36441kJ.A0K();
        C36401kF.A0z(AnonymousClass00F.A00(context, R.color.f6nameremoved), A0K2);
        A0K2.setAntiAlias(true);
        A0K2.setDither(true);
        this.A01 = A0K2;
    }
}
