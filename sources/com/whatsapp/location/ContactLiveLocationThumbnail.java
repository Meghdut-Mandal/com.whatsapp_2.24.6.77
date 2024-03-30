package com.whatsapp.location;

import X.AnonymousClass000;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C56402wE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

public class ContactLiveLocationThumbnail extends ThumbnailButton {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public float A04;
    public final RectF A05;

    private void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56402wE.A00);
            this.A04 = obtainStyledAttributes.getDimension(1, this.A04);
            this.A00 = obtainStyledAttributes.getInteger(0, this.A00);
            this.A01 = obtainStyledAttributes.getInteger(2, this.A01);
            obtainStyledAttributes.recycle();
        }
    }

    public void A04(Canvas canvas) {
        RectF rectF = this.A05;
        rectF.set(0.0f, 0.0f, C36441kJ.A01(this), C36441kJ.A02(this));
        float f = this.A04;
        if (f > 0.0f && this.A00 != 0) {
            float f2 = f / 2.0f;
            rectF.inset(f2, f2);
            this.A04.setColor(this.A00);
            this.A04.setStrokeWidth(this.A04);
            C36421kH.A0q(this.A04);
            float f3 = this.A01;
            int i = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            Paint paint = this.A04;
            if (i >= 0) {
                canvas.drawRoundRect(rectF, f3, f3, paint);
            } else {
                canvas.drawOval(rectF, paint);
            }
            float f4 = this.A04 / 2.0f;
            rectF.inset(f4, f4);
        }
        float f5 = this.A00;
        if (f5 > 0.0f && this.A02 != 0) {
            float f6 = f5 / 2.0f;
            rectF.inset(f6, f6);
            this.A04.setColor(this.A02);
            this.A04.setStrokeWidth(this.A00);
            C36421kH.A0q(this.A04);
            float f7 = this.A01;
            int i2 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            Paint paint2 = this.A04;
            if (i2 >= 0) {
                canvas.drawRoundRect(rectF, f7, f7, paint2);
            } else {
                canvas.drawOval(rectF, paint2);
            }
            float f8 = this.A00 / 2.0f;
            rectF.inset(f8, f8);
        }
        if (this.A02) {
            this.A04.setColor(getResources().getColor(R.color.f6nameremoved));
            C36431kI.A1L(this.A04);
            float f9 = this.A01;
            int i3 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
            Paint paint3 = this.A04;
            if (i3 >= 0) {
                canvas.drawRoundRect(rectF, f9, f9, paint3);
            } else {
                canvas.drawOval(rectF, paint3);
            }
        }
        if (this.A01 > 1) {
            this.A04.setColor(1107296256);
            C36431kI.A1L(this.A04);
            float f10 = this.A01;
            int i4 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            Paint paint4 = this.A04;
            if (i4 >= 0) {
                canvas.drawRoundRect(rectF, f10, f10, paint4);
            } else {
                canvas.drawOval(rectF, paint4);
            }
            this.A04.setTextAlign(Paint.Align.CENTER);
            this.A04.setColor(-1);
            this.A04.setTextSize(C36441kJ.A00(getResources(), R.dimen.f7nameremoved));
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(this.A01);
            canvas.drawText(AnonymousClass000.A0q("", A0u), rectF.centerX(), rectF.centerY() - ((this.A04.ascent() + this.A04.descent()) / 2.0f), this.A04);
        }
    }

    public ContactLiveLocationThumbnail(Context context) {
        super(context);
        A03();
        this.A05 = C36441kJ.A0N();
    }

    public void setGlowColor(int i) {
        this.A00 = i;
    }

    public void setGlowSize(float f) {
        this.A04 = f;
    }

    public void setGreyOverlay(boolean z) {
        this.A02 = z;
    }

    public void setStackSize(int i) {
        this.A01 = i;
    }

    public ContactLiveLocationThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
        this.A05 = C36441kJ.A0N();
        A01(context, attributeSet);
    }

    public ContactLiveLocationThumbnail(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    public ContactLiveLocationThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
        this.A05 = C36441kJ.A0N();
        A01(context, attributeSet);
    }
}
