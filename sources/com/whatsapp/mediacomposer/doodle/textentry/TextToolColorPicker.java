package com.whatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass1QZ;
import X.AnonymousClass4OI;
import X.C18700tb;
import X.C36371kC;
import X.C36441kJ;
import X.C56412wF;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TextToolColorPicker extends View implements C18700tb {
    public int A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public AnonymousClass4OI A04;
    public AnonymousClass1QZ A05;
    public boolean A06;
    public int[] A07;
    public boolean A08;
    public final Paint A09;
    public final Paint A0A;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56412wF.A00);
            this.A02 = (int) obtainStyledAttributes.getDimension(1, 1.0f);
            this.A06 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void A01() {
        if (!this.A08) {
            this.A08 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r1 != r11.A00) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x00d0
            int r1 = X.C36331k8.A00(r11, r12)
        L_0x0008:
            r0 = 1
            int r1 = java.lang.Math.max(r0, r1)
            r11.A00 = r1
            int[] r0 = r11.A07
            if (r0 == 0) goto L_0x0016
            int r0 = r0.length
            if (r0 >= r1) goto L_0x001a
        L_0x0016:
            int[] r0 = new int[r1]
            r11.A07 = r0
        L_0x001a:
            int[] r0 = X.AnonymousClass6H9.A01(r1)
            r11.A07 = r0
            android.graphics.Path r3 = X.C36441kJ.A0M()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r3.setFillType(r0)
            r0 = 8
            float[] r5 = new float[r0]
            int r0 = r11.A02
            float r1 = (float) r0
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 / r0
            java.util.Arrays.fill(r5, r1)
            boolean r1 = r11.A06
            if (r1 == 0) goto L_0x00cc
            int r0 = r11.A00
        L_0x003d:
            int r0 = r0 + -1
            float r2 = (float) r0
            if (r1 == 0) goto L_0x00c8
            int r0 = r11.A02
        L_0x0044:
            int r0 = r0 + -1
            float r0 = (float) r0
            r4 = 1065353216(0x3f800000, float:1.0)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r4, r4, r2, r0)
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r3.addRoundRect(r1, r5, r0)
            android.graphics.Bitmap r1 = r11.A03
            if (r1 == 0) goto L_0x0071
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x00c3
            int r1 = r1.getHeight()
        L_0x005f:
            int r0 = r11.A02
            if (r1 != r0) goto L_0x0071
            boolean r1 = r11.A06
            android.graphics.Bitmap r0 = r11.A03
            if (r1 == 0) goto L_0x00be
            int r1 = r0.getWidth()
        L_0x006d:
            int r0 = r11.A00
            if (r1 == r0) goto L_0x0081
        L_0x0071:
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x00b9
            int r2 = r11.A00
            int r1 = r11.A02
        L_0x0079:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r11.A03 = r0
        L_0x0081:
            android.graphics.Bitmap r0 = r11.A03
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r0)
            android.graphics.Paint r10 = r11.A09
            X.C36421kH.A0q(r10)
            r5.save()
            r5.clipPath(r3)
            r10.setStrokeWidth(r4)
            r1 = 0
        L_0x0097:
            int r0 = r11.A00
            if (r1 >= r0) goto L_0x00d6
            int[] r0 = r11.A07
            r0 = r0[r1]
            r10.setColor(r0)
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x00b2
            float r6 = (float) r1
            r7 = 0
            r8 = r6
            int r0 = r11.A02
            float r9 = (float) r0
        L_0x00ac:
            r5.drawLine(r6, r7, r8, r9, r10)
            int r1 = r1 + 1
            goto L_0x0097
        L_0x00b2:
            r6 = 0
            float r9 = (float) r1
            r7 = r9
            int r0 = r11.A02
            float r8 = (float) r0
            goto L_0x00ac
        L_0x00b9:
            int r2 = r11.A02
            int r1 = r11.A00
            goto L_0x0079
        L_0x00be:
            int r1 = r0.getHeight()
            goto L_0x006d
        L_0x00c3:
            int r1 = r1.getWidth()
            goto L_0x005f
        L_0x00c8:
            int r0 = r11.A00
            goto L_0x0044
        L_0x00cc:
            int r0 = r11.A02
            goto L_0x003d
        L_0x00d0:
            int r1 = X.AnonymousClass000.A0D(r11, r13)
            goto L_0x0008
        L_0x00d6:
            r5.restore()
            android.graphics.Paint r2 = r11.A0A
            android.content.Context r1 = r11.getContext()
            r0 = 2131100123(0x7f0601db, float:1.7812619E38)
            X.C36381kD.A16(r1, r2, r0)
            X.C36421kH.A0q(r2)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131168397(0x7f070c8d, float:1.7951095E38)
            float r0 = X.C36441kJ.A00(r1, r0)
            r2.setStrokeWidth(r0)
            r5.drawPath(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.textentry.TextToolColorPicker.onSizeChanged(int, int, int, int):void");
    }

    public void setColorAndInvalidate(int i) {
        this.A01 = i;
        invalidate();
    }

    public TextToolColorPicker(Context context) {
        super(context);
        A01();
        this.A09 = C36441kJ.A0K();
        this.A0A = C36371kC.A0E();
    }

    public void draw(Canvas canvas) {
        float width;
        float paddingTop;
        super.draw(canvas);
        Bitmap bitmap = this.A03;
        if (bitmap != null) {
            if (this.A06) {
                width = (float) getPaddingLeft();
            } else {
                width = ((float) (getWidth() - this.A02)) / 2.0f;
            }
            if (this.A06) {
                paddingTop = ((float) (getHeight() - this.A02)) / 2.0f;
            } else {
                paddingTop = (float) getPaddingTop();
            }
            canvas.drawBitmap(bitmap, width, paddingTop, this.A09);
        }
    }

    public int getColor() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r6 != 6) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        if (r6 != 1) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r6 = r8.getActionMasked()
            int r1 = r8.getPointerCount()
            r0 = 0
            r4 = 1
            if (r1 <= r4) goto L_0x000d
            return r0
        L_0x000d:
            r5 = 6
            if (r6 == 0) goto L_0x0021
            if (r6 == r4) goto L_0x0021
            r0 = 2
            if (r6 == r0) goto L_0x0021
            r0 = 3
            if (r6 == r0) goto L_0x0069
            r0 = 5
            if (r6 == r0) goto L_0x0021
            if (r6 == r5) goto L_0x0021
        L_0x001d:
            r7.invalidate()
            return r4
        L_0x0021:
            X.4OI r0 = r7.A04
            if (r0 == 0) goto L_0x001d
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x005d
            float r0 = r8.getX()
        L_0x002d:
            int r1 = (int) r0
            if (r1 >= 0) goto L_0x0031
            r1 = 0
        L_0x0031:
            int r0 = r7.A00
            if (r1 < r0) goto L_0x0037
            int r1 = r0 + -1
        L_0x0037:
            int[] r0 = r7.A07
            r3 = r0[r1]
            int r0 = r7.A01
            if (r3 == r0) goto L_0x0065
            r7.A01 = r3
            X.4OI r2 = r7.A04
            X.3na r2 = (X.C75653na) r2
            X.3A1 r0 = r2.A00
            X.3PW r1 = r0.A05
            r1.A03 = r3
            int r0 = r1.A02
            r1.A01(r3, r0)
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = r2.A01
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r0.A03
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "doodleEditText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x005d:
            float r0 = r8.getY()
            goto L_0x002d
        L_0x0062:
            r0.A0F(r3)
        L_0x0065:
            if (r6 == r5) goto L_0x0069
            if (r6 != r4) goto L_0x001d
        L_0x0069:
            X.4OI r0 = r7.A04
            X.3na r0 = (X.C75653na) r0
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = r0.A01
            com.whatsapp.mediacomposer.doodle.textentry.TextToolColorPicker r1 = r0.A04
            java.lang.String r0 = "textToolColorPicker"
            if (r1 != 0) goto L_0x007a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x007a:
            int r0 = r1.A01
            X.AnonymousClass6H9.A00(r1, r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.textentry.TextToolColorPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void setColor(int i) {
        this.A01 = i;
    }

    public void setListener(AnonymousClass4OI r1) {
        this.A04 = r1;
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A09 = C36441kJ.A0K();
        this.A0A = C36371kC.A0E();
        A00(context, attributeSet);
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A09 = C36441kJ.A0K();
        this.A0A = C36371kC.A0E();
        A00(context, attributeSet);
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A09 = C36441kJ.A0K();
        this.A0A = C36371kC.A0E();
        A00(context, attributeSet);
    }
}
