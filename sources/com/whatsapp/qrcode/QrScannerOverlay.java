package com.whatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass1QZ;
import X.AnonymousClass2x6;
import X.C010804n;
import X.C18700tb;
import X.C18740tg;
import X.C18750th;
import X.C224314h;
import X.C36331k8;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C37641my;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class QrScannerOverlay extends View implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public boolean A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public Drawable A07;
    public C37641my A08;
    public String A09;
    public final float A0A;
    public final float A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Rect A0H;
    public final RectF A0I;

    public QrScannerOverlay(Context context) {
        this(context, (AttributeSet) null);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        int A002 = C36331k8.A00(this, getWidth());
        int A0D2 = AnonymousClass000.A0D(this, getHeight());
        int min = (Math.min(A002, A0D2) * 3) / 4;
        int paddingLeft = ((A002 - min) / 2) + getPaddingLeft();
        int paddingTop = ((A0D2 - min) / 2) + getPaddingTop();
        int i = paddingLeft + min;
        int i2 = min + paddingTop;
        float f = this.A04;
        float f2 = this.A03;
        float f3 = f + f2;
        this.A04 = f3;
        if (f3 > 1.0f || f3 < 0.0f) {
            if (f3 > 1.0f) {
                this.A04 = 1.0f;
            } else {
                this.A04 = 0.0f;
            }
            this.A03 = -f2;
        }
        Canvas canvas2 = canvas;
        canvas2.drawColor(this.A0C);
        RectF rectF = this.A0I;
        float f4 = (float) paddingLeft;
        float f5 = (float) paddingTop;
        float f6 = (float) i2;
        rectF.set(f4, f5, (float) i, f6);
        if (this.A0E == 0) {
            canvas2.drawArc(rectF, 0.0f, 360.0f, true, this.A0G);
            Paint paint = this.A0F;
            C36421kH.A0q(paint);
            paint.setColor(this.A0D);
            paint.setAlpha(127);
            float f7 = this.A0B * 2.0f;
            paint.setStrokeWidth(f7);
            int i3 = (int) (f5 + f7);
            i2 = (int) (f6 - f7);
            float f8 = this.A04;
            float f9 = (f8 * 2.0f) - 1.0f;
            float f10 = (float) ((paddingLeft + i) / 2);
            float sqrt = (((float) (i - paddingLeft)) * ((float) Math.sqrt((double) (1.0f - (f9 * f9))))) / 2.0f;
            float f11 = (((float) (i2 - i3)) * f8) + ((float) i3);
            canvas2.drawLine(f10 - sqrt, f11, sqrt + f10, f11, paint);
        } else {
            float f12 = this.A0A;
            canvas2.drawRoundRect(rectF, f12, f12, this.A0G);
            Drawable drawable = this.A07;
            drawable.setAlpha((int) (this.A04 * 255.0f));
            canvas2.save();
            canvas2.translate(f4, f5);
            drawable.draw(canvas2);
            canvas2.translate((float) (i - paddingLeft), 0.0f);
            canvas2.rotate(90.0f);
            drawable.draw(canvas2);
            canvas2.rotate(-90.0f);
            canvas2.translate(0.0f, (float) (i2 - paddingTop));
            canvas2.rotate(180.0f);
            drawable.draw(canvas2);
            canvas2.rotate(-180.0f);
            canvas2.translate((float) (paddingLeft - i), 0.0f);
            canvas2.rotate(270.0f);
            drawable.draw(canvas2);
            canvas2.restore();
        }
        String str = this.A09;
        if (str != null && this.A02) {
            Paint paint2 = this.A0F;
            C36401kF.A0z(-1, paint2);
            paint2.setTextSize((float) this.A05);
            int length = str.length();
            Rect rect = this.A0H;
            paint2.getTextBounds(str, 0, length, rect);
            canvas2.drawText(str, ((float) (A002 - rect.width())) / 2.0f, (float) (i2 + this.A06 + (rect.height() / 2)), paint2);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        C37641my r0;
        Boolean bool = C18750th.A03;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (r0 = this.A08) != null) {
            startAnimation(r0);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C37641my r2 = new C37641my(this);
        this.A08 = r2;
        r2.setDuration(2000);
        this.A08.setRepeatCount(-1);
        this.A08.setRepeatMode(2);
        Boolean bool = C18750th.A03;
        startAnimation(this.A08);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Boolean bool = C18750th.A03;
        clearAnimation();
    }

    public QrScannerOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A0F = C36441kJ.A0L(1);
        this.A0H = AnonymousClass001.A06();
        this.A0I = C36441kJ.A0N();
        this.A04 = 0.0f;
        this.A02 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2x6.A06);
        int i2 = obtainStyledAttributes.getInt(0, 1);
        this.A0E = i2;
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.A09 = context.getString(resourceId);
            this.A05 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.A06 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        }
        obtainStyledAttributes.recycle();
        this.A0B = getResources().getDimension(R.dimen.f7nameremoved);
        this.A0A = getResources().getDimension(R.dimen.f7nameremoved);
        this.A0D = AnonymousClass00F.A00(context, C224314h.A01(context, R.attr.f4nameremoved));
        this.A0C = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        if (i2 == 1) {
            this.A03 = 0.0125f;
            C010804n A002 = C010804n.A00((Resources.Theme) null, getResources(), R.drawable.vec_ic_qr_frame);
            C18740tg.A06(A002);
            this.A07 = A002;
            A002.setBounds(0, 0, A002.getIntrinsicWidth(), this.A07.getIntrinsicHeight());
        } else {
            this.A03 = 0.01f;
        }
        Paint A0L = C36441kJ.A0L(1);
        this.A0G = A0L;
        A0L.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public QrScannerOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
