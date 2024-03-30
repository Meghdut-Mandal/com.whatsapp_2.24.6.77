package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.C000800j;
import X.C001400p;
import X.C107975Rq;
import X.C113105f0;
import X.C152117Jg;
import X.C152127Jh;
import X.C152137Ji;
import X.C152147Jj;
import X.C36331k8;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.R;

public final class AvatarProfilePhotoImageView extends CircleWaImageView {
    public float A00;
    public int A01;
    public final AnonymousClass00T A02;
    public final AnonymousClass00T A03;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass00T A08;

    public final void A05(C107975Rq r5, float f, int i) {
        float borderStrokeWidthSelected;
        float borderStrokeWidthSelected2;
        AnonymousClass00C.A0D(r5, 0);
        Paint paint = this.A05;
        int ordinal = r5.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = C36331k8.A02(this.A02);
            } else {
                throw C36441kJ.A18();
            }
        }
        paint.setColor(i);
        if (ordinal != 0) {
            borderStrokeWidthSelected = getBorderStrokeWidthIdle();
        } else {
            borderStrokeWidthSelected = getBorderStrokeWidthSelected();
        }
        paint.setStrokeWidth(borderStrokeWidthSelected);
        Paint paint2 = this.A06;
        if (ordinal != 0) {
            f = 0.0f;
        }
        paint2.setStrokeWidth(f);
        if (ordinal != 0) {
            borderStrokeWidthSelected2 = getBorderStrokeWidthIdle();
        } else {
            borderStrokeWidthSelected2 = getBorderStrokeWidthSelected();
        }
        this.A00 = borderStrokeWidthSelected2;
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        int width = getWidth() / 2;
        float f = (float) width;
        float A072 = (float) C36441kJ.A07(this);
        float min = (float) (Math.min(C36331k8.A00(this, getWidth()), AnonymousClass000.A0D(this, getHeight())) / 2);
        canvas.drawCircle(f, A072, min, this.A04);
        super.onDraw(canvas);
        Paint paint = this.A06;
        if (paint.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(f, A072, min - this.A00, paint);
        }
        canvas.drawCircle(f, A072, min, this.A05);
    }

    private final int getBorderColorIdle() {
        return C36331k8.A02(this.A02);
    }

    private final float getBorderStrokeWidthIdle() {
        return C36441kJ.A03(this.A07.getValue());
    }

    private final float getBorderStrokeWidthSelected() {
        return C36441kJ.A03(this.A08.getValue());
    }

    private final int getColorNeutral() {
        return C36331k8.A02(this.A03);
    }

    public static /* synthetic */ void setBorderStyle$default(AvatarProfilePhotoImageView avatarProfilePhotoImageView, C107975Rq r2, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        avatarProfilePhotoImageView.A05(r2, f, i);
    }

    public final void A04() {
        Paint paint = this.A05;
        paint.setColor(C36331k8.A02(this.A02));
        paint.setStrokeWidth(getBorderStrokeWidthIdle());
        this.A06.setStrokeWidth(0.0f);
        this.A00 = getBorderStrokeWidthIdle();
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        int defaultSize;
        int i3 = this.A01;
        if (i3 == 0) {
            defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        } else if (i3 == 1) {
            defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            throw AnonymousClass000.A0d("Illegal value: ", AnonymousClass000.A0u(), i3);
        }
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public final void setAvatarPoseBackgroundColor(int i) {
        this.A04.setColor(i);
        invalidate();
    }

    public AvatarProfilePhotoImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C000800j r1 = C000800j.NONE;
        this.A08 = C001400p.A00(r1, new C152137Ji(this));
        this.A07 = C001400p.A00(r1, new C152127Jh(this));
        this.A02 = C001400p.A00(r1, new C152117Jg(this));
        this.A03 = C001400p.A00(r1, new C152147Jj(this));
        Paint A0K = C36441kJ.A0K();
        A0K.setColor(C36331k8.A02(this.A02));
        A0K.setStrokeWidth(getBorderStrokeWidthIdle());
        C36421kH.A0q(A0K);
        A0K.setAntiAlias(true);
        A0K.setDither(true);
        this.A05 = A0K;
        Paint A0K2 = C36441kJ.A0K();
        C36401kF.A0z(AnonymousClass00F.A00(getContext(), R.color.f6nameremoved), A0K2);
        A0K2.setAntiAlias(true);
        A0K2.setDither(true);
        this.A04 = A0K2;
        Paint A0K3 = C36441kJ.A0K();
        A0K3.setColor(C36331k8.A02(this.A03));
        C36421kH.A0q(A0K3);
        A0K3.setAntiAlias(true);
        A0K3.setDither(true);
        this.A06 = A0K3;
        A00(attributeSet);
    }

    private final void A00(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C113105f0.A00);
        AnonymousClass00C.A08(obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A01 = obtainStyledAttributes.getInt(0, this.A01);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setAvatarPoseBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public AvatarProfilePhotoImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C000800j r1 = C000800j.NONE;
        this.A08 = C001400p.A00(r1, new C152137Ji(this));
        this.A07 = C001400p.A00(r1, new C152127Jh(this));
        this.A02 = C001400p.A00(r1, new C152117Jg(this));
        this.A03 = C001400p.A00(r1, new C152147Jj(this));
        Paint A0K = C36441kJ.A0K();
        A0K.setColor(C36331k8.A02(this.A02));
        A0K.setStrokeWidth(getBorderStrokeWidthIdle());
        C36421kH.A0q(A0K);
        A0K.setAntiAlias(true);
        A0K.setDither(true);
        this.A05 = A0K;
        Paint A0K2 = C36441kJ.A0K();
        C36401kF.A0z(AnonymousClass00F.A00(getContext(), R.color.f6nameremoved), A0K2);
        A0K2.setAntiAlias(true);
        A0K2.setDither(true);
        this.A04 = A0K2;
        Paint A0K3 = C36441kJ.A0K();
        A0K3.setColor(C36331k8.A02(this.A03));
        C36421kH.A0q(A0K3);
        A0K3.setAntiAlias(true);
        A0K3.setDither(true);
        this.A06 = A0K3;
        A00(attributeSet);
    }

    public AvatarProfilePhotoImageView(Context context) {
        super(context, (AttributeSet) null);
        C000800j r1 = C000800j.NONE;
        this.A08 = C001400p.A00(r1, new C152137Ji(this));
        this.A07 = C001400p.A00(r1, new C152127Jh(this));
        this.A02 = C001400p.A00(r1, new C152117Jg(this));
        this.A03 = C001400p.A00(r1, new C152147Jj(this));
        Paint A0K = C36441kJ.A0K();
        A0K.setColor(C36331k8.A02(this.A02));
        A0K.setStrokeWidth(getBorderStrokeWidthIdle());
        C36421kH.A0q(A0K);
        A0K.setAntiAlias(true);
        A0K.setDither(true);
        this.A05 = A0K;
        Paint A0K2 = C36441kJ.A0K();
        C36401kF.A0z(AnonymousClass00F.A00(getContext(), R.color.f6nameremoved), A0K2);
        A0K2.setAntiAlias(true);
        A0K2.setDither(true);
        this.A04 = A0K2;
        Paint A0K3 = C36441kJ.A0K();
        A0K3.setColor(C36331k8.A02(this.A03));
        C36421kH.A0q(A0K3);
        A0K3.setAntiAlias(true);
        A0K3.setDither(true);
        this.A06 = A0K3;
        A00((AttributeSet) null);
    }
}
