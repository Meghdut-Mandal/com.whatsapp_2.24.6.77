package com.whatsapp.components.button;

import X.AnonymousClass001;
import X.AnonymousClass288;
import X.AnonymousClass2xF;
import X.AnonymousClass7fA;
import X.C36421kH;
import X.C36441kJ;
import X.C36801lK;
import X.C37561mq;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class ThumbnailButton extends AnonymousClass288 {
    public float A00;
    public float A01 = 0.0f;
    public int A02;
    public int A03 = 419430400;
    public Paint A04;
    public AnonymousClass7fA A05;
    public boolean A06;
    public float A07;
    public final Rect A08 = AnonymousClass001.A06();
    public final RectF A09 = C36441kJ.A0N();

    private void A02(Context context, AttributeSet attributeSet) {
        setBackgroundDrawable(new C36801lK());
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0O);
            this.A01 = obtainStyledAttributes.getDimension(4, this.A01);
            this.A07 = obtainStyledAttributes.getFloat(0, this.A07);
            this.A03 = obtainStyledAttributes.getInteger(5, this.A03);
            this.A00 = obtainStyledAttributes.getDimension(2, this.A00);
            this.A02 = obtainStyledAttributes.getInteger(1, this.A02);
            this.A06 = obtainStyledAttributes.getBoolean(3, this.A06);
            z = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
        }
        Paint A0K = C36441kJ.A0K();
        this.A04 = A0K;
        A0K.setAntiAlias(true);
        this.A04.setDither(true);
        this.A04.setFilterBitmap(true);
        this.A04.setColor(-1);
        if (z) {
            setOutlineProvider(new C37561mq());
        }
    }

    public void A04(Canvas canvas) {
        int i;
        if (this.A00 > 0.0f && (i = this.A02) != 0) {
            this.A04.setColor(i);
            this.A04.setStrokeWidth(this.A00);
            C36421kH.A0q(this.A04);
            AnonymousClass7fA r1 = this.A05;
            if (r1 != null) {
                canvas.drawPath((Path) r1.apply(this.A09), this.A04);
                return;
            }
            float f = this.A01;
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            RectF rectF = this.A09;
            Paint paint = this.A04;
            if (i2 >= 0) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                canvas.drawOval(rectF, paint);
            }
        }
    }

    public int getBorderSizeAdjustment() {
        return (int) ((this.A00 + 2.0f) / 2.0f);
    }

    public void onMeasure(int i, int i2) {
        if (this.A07 == 1.0f) {
            int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            setMeasuredDimension(defaultSize, defaultSize);
            return;
        }
        super.onMeasure(i, i2);
    }

    public ThumbnailButton(Context context) {
        super(context);
        A02(context, (AttributeSet) null);
    }

    public float getBorderSize() {
        return this.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a A[Catch:{ RuntimeException -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2 A[Catch:{ RuntimeException -> 0x01fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            int r1 = r10.getBorderSizeAdjustment()
            android.graphics.RectF r2 = r10.A09
            int r0 = r10.getPaddingLeft()
            int r0 = r0 + r1
            float r0 = (float) r0
            r2.left = r0
            int r0 = X.AnonymousClass000.A0B(r10)
            int r0 = r0 - r1
            float r0 = (float) r0
            r2.right = r0
            int r0 = r10.getPaddingTop()
            int r0 = r0 + r1
            float r0 = (float) r0
            r2.top = r0
            int r0 = X.AnonymousClass000.A0A(r10)
            int r0 = r0 - r1
            float r0 = (float) r0
            r2.bottom = r0
            boolean r0 = r10.A06     // Catch:{ RuntimeException -> 0x01fa }
            if (r0 != 0) goto L_0x0194
            android.graphics.drawable.Drawable r0 = r10.getDrawable()     // Catch:{ RuntimeException -> 0x01fa }
            boolean r0 = r0 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ RuntimeException -> 0x01fa }
            if (r0 == 0) goto L_0x0194
            float r1 = r10.A01     // Catch:{ RuntimeException -> 0x01fa }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0194
            android.graphics.drawable.Drawable r1 = r10.getDrawable()     // Catch:{ RuntimeException -> 0x01fa }
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1     // Catch:{ RuntimeException -> 0x01fa }
            if (r1 == 0) goto L_0x0197
            android.graphics.Bitmap r0 = r1.getBitmap()     // Catch:{ RuntimeException -> 0x01fa }
            if (r0 == 0) goto L_0x0197
            android.graphics.Bitmap r6 = r1.getBitmap()     // Catch:{ RuntimeException -> 0x01fa }
            int r8 = r6.getWidth()     // Catch:{ RuntimeException -> 0x01fa }
            int r7 = r6.getHeight()     // Catch:{ RuntimeException -> 0x01fa }
            android.widget.ImageView$ScaleType r1 = r10.getScaleType()     // Catch:{ RuntimeException -> 0x01fa }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ RuntimeException -> 0x01fa }
            r9 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            if (r1 != r0) goto L_0x0115
            android.graphics.Rect r4 = r10.A08     // Catch:{ RuntimeException -> 0x01fa }
            r4.set(r5, r5, r8, r7)     // Catch:{ RuntimeException -> 0x01fa }
            float r8 = (float) r8     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r2.height()     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r3 * r8
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r2.width()     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r0 * r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ff
            float r3 = r2.width()     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r3 * r1
            float r3 = r3 / r8
            float r1 = r2.top     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r2.bottom     // Catch:{ RuntimeException -> 0x01fa }
            float r1 = r1 + r0
            float r1 = r1 / r9
            float r0 = r3 / r9
            float r1 = r1 - r0
            r2.top = r1     // Catch:{ RuntimeException -> 0x01fa }
        L_0x0084:
            float r1 = r1 + r3
            r2.bottom = r1     // Catch:{ RuntimeException -> 0x01fa }
        L_0x0087:
            android.graphics.Paint r1 = r10.A04     // Catch:{ RuntimeException -> 0x01fa }
            r0 = -1
            r1.setColor(r0)     // Catch:{ RuntimeException -> 0x01fa }
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x01fa }
            X.C36431kI.A1L(r0)     // Catch:{ RuntimeException -> 0x01fa }
            X.7fA r0 = r10.A05     // Catch:{ RuntimeException -> 0x01fa }
            r1 = 31
            r7 = 0
            r9 = 0
            if (r0 == 0) goto L_0x00c2
            int r5 = r11.saveLayer(r2, r7, r1)     // Catch:{ RuntimeException -> 0x01fa }
            X.7fA r0 = r10.A05     // Catch:{ RuntimeException -> 0x01fa }
            java.lang.Object r0 = r0.apply(r2)     // Catch:{ RuntimeException -> 0x01fa }
            android.graphics.Path r0 = (android.graphics.Path) r0     // Catch:{ RuntimeException -> 0x01fa }
            r11.clipPath(r0)     // Catch:{ RuntimeException -> 0x01fa }
        L_0x00a9:
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x01fa }
            r11.drawBitmap(r6, r4, r2, r0)     // Catch:{ RuntimeException -> 0x01fa }
            X.7fA r0 = r10.A05     // Catch:{ RuntimeException -> 0x01fa }
            if (r0 != 0) goto L_0x00b8
            float r0 = r10.A01     // Catch:{ RuntimeException -> 0x01fa }
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0197
        L_0x00b8:
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x01fa }
            r0.setXfermode(r7)     // Catch:{ RuntimeException -> 0x01fa }
            r11.restoreToCount(r5)     // Catch:{ RuntimeException -> 0x01fa }
            goto L_0x0197
        L_0x00c2:
            float r0 = r10.A01     // Catch:{ RuntimeException -> 0x01fa }
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00a9
            int r8 = r11.saveLayer(r2, r7, r1)     // Catch:{ RuntimeException -> 0x01fa }
            r11.drawARGB(r5, r5, r5, r5)     // Catch:{ RuntimeException -> 0x01fa }
            float r1 = r10.A01     // Catch:{ RuntimeException -> 0x01fa }
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00e7
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x01fa }
            r11.drawRoundRect(r2, r1, r1, r0)     // Catch:{ RuntimeException -> 0x01fa }
        L_0x00da:
            android.graphics.Paint r3 = r10.A04     // Catch:{ RuntimeException -> 0x01fa }
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch:{ RuntimeException -> 0x01fa }
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode     // Catch:{ RuntimeException -> 0x01fa }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x01fa }
            r3.setXfermode(r0)     // Catch:{ RuntimeException -> 0x01fa }
            goto L_0x00fd
        L_0x00e7:
            r0 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00f7
            android.graphics.Path r1 = X.AnonymousClass6Y8.A06(r2)     // Catch:{ RuntimeException -> 0x01fa }
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x01fa }
            r11.drawPath(r1, r0)     // Catch:{ RuntimeException -> 0x01fa }
            goto L_0x00da
        L_0x00f7:
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x01fa }
            r11.drawOval(r2, r0)     // Catch:{ RuntimeException -> 0x01fa }
            goto L_0x00da
        L_0x00fd:
            r5 = r8
            goto L_0x00a9
        L_0x00ff:
            float r3 = r2.height()     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r3 * r8
            float r3 = r3 / r1
            float r1 = r2.left     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r2.right     // Catch:{ RuntimeException -> 0x01fa }
            float r1 = r1 + r0
            float r1 = r1 / r9
            float r0 = r3 / r9
            float r1 = r1 - r0
            r2.left = r1     // Catch:{ RuntimeException -> 0x01fa }
            float r1 = r1 + r3
            r2.right = r1     // Catch:{ RuntimeException -> 0x01fa }
            goto L_0x0087
        L_0x0115:
            android.widget.ImageView$ScaleType r1 = r10.getScaleType()     // Catch:{ RuntimeException -> 0x01fa }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ RuntimeException -> 0x01fa }
            android.graphics.Rect r4 = r10.A08     // Catch:{ RuntimeException -> 0x01fa }
            if (r1 != r0) goto L_0x013b
            r4.set(r5, r5, r8, r7)     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r2.centerX()     // Catch:{ RuntimeException -> 0x01fa }
            float r1 = (float) r8     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r1 / r9
            float r3 = r3 - r0
            r2.left = r3     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r3 + r1
            r2.right = r3     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r2.centerY()     // Catch:{ RuntimeException -> 0x01fa }
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r1 / r9
            float r3 = r3 - r0
            r2.top = r3     // Catch:{ RuntimeException -> 0x01fa }
            goto L_0x0084
        L_0x013b:
            r4.set(r5, r5, r8, r7)     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = (float) r8     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r2.height()     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r3 * r0
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r2.width()     // Catch:{ RuntimeException -> 0x01fa }
            float r1 = r1 * r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0171
            int r0 = r4.height()     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = (float) r0     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r2.width()     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r3 * r0
            float r0 = r2.height()     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r3 / r0
            int r1 = r4.left     // Catch:{ RuntimeException -> 0x01fa }
            int r0 = r4.right     // Catch:{ RuntimeException -> 0x01fa }
            int r1 = r1 + r0
            float r1 = (float) r1     // Catch:{ RuntimeException -> 0x01fa }
            float r1 = r1 / r9
            float r0 = r3 / r9
            float r1 = r1 - r0
            int r0 = (int) r1     // Catch:{ RuntimeException -> 0x01fa }
            r4.left = r0     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r0 + r3
            int r0 = (int) r0     // Catch:{ RuntimeException -> 0x01fa }
            r4.right = r0     // Catch:{ RuntimeException -> 0x01fa }
            goto L_0x0087
        L_0x0171:
            int r0 = r4.width()     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = (float) r0     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r2.height()     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r3 * r0
            float r0 = r2.width()     // Catch:{ RuntimeException -> 0x01fa }
            float r3 = r3 / r0
            int r1 = r4.top     // Catch:{ RuntimeException -> 0x01fa }
            int r0 = r4.bottom     // Catch:{ RuntimeException -> 0x01fa }
            int r1 = r1 + r0
            float r1 = (float) r1     // Catch:{ RuntimeException -> 0x01fa }
            float r1 = r1 / r9
            float r0 = r3 / r9
            float r1 = r1 - r0
            int r0 = (int) r1     // Catch:{ RuntimeException -> 0x01fa }
            r4.top = r0     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x01fa }
            float r0 = r0 + r3
            int r0 = (int) r0     // Catch:{ RuntimeException -> 0x01fa }
            r4.bottom = r0     // Catch:{ RuntimeException -> 0x01fa }
            goto L_0x0087
        L_0x0194:
            super.onDraw(r11)     // Catch:{ RuntimeException -> 0x01fa }
        L_0x0197:
            r10.A04(r11)
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r10.isSelected()
            if (r0 != 0) goto L_0x01ac
            boolean r0 = r10.isPressed()
            if (r0 == 0) goto L_0x01d6
        L_0x01ac:
            android.graphics.Paint r0 = r10.A04
            X.C36431kI.A1L(r0)
            android.graphics.Paint r1 = r10.A04
            int r0 = r10.A03
            r1.setColor(r0)
            X.7fA r0 = r10.A05
            if (r0 == 0) goto L_0x01d7
            r1 = 0
            r0 = 31
            int r1 = r11.saveLayer(r2, r1, r0)
            X.7fA r0 = r10.A05
            java.lang.Object r0 = r0.apply(r2)
            android.graphics.Path r0 = (android.graphics.Path) r0
            r11.clipPath(r0)
            android.graphics.Paint r0 = r10.A04
            r11.drawRect(r2, r0)
            r11.restoreToCount(r1)
        L_0x01d6:
            return
        L_0x01d7:
            float r1 = r10.A01
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01e4
            android.graphics.Paint r0 = r10.A04
            r11.drawRoundRect(r2, r1, r1, r0)
            return
        L_0x01e4:
            r0 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01f4
            android.graphics.Path r1 = X.AnonymousClass6Y8.A06(r2)
            android.graphics.Paint r0 = r10.A04
            r11.drawPath(r1, r0)
            return
        L_0x01f4:
            android.graphics.Paint r0 = r10.A04
            r11.drawOval(r2, r0)
            return
        L_0x01fa:
            r1 = move-exception
            java.lang.String r0 = "thumbnailbutton/"
            X.C53162qs.A00(r10, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.components.button.ThumbnailButton.onDraw(android.graphics.Canvas):void");
    }

    public void setBorderColor(int i) {
        this.A02 = i;
    }

    public void setBorderSize(float f) {
        this.A00 = f;
    }

    public void setClipPathProducer(AnonymousClass7fA r1) {
        this.A05 = r1;
    }

    public void setCornerRadius(float f) {
        this.A01 = f;
    }

    public void setForegroundOnly(boolean z) {
        this.A06 = z;
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(context, attributeSet);
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }
}
