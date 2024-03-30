package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass000;
import X.AnonymousClass1QZ;
import X.AnonymousClass2x6;
import X.AnonymousClass6H9;
import X.C157397ct;
import X.C18700tb;
import X.C18820ts;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36421kH;
import X.C36441kJ;
import X.C90524aI;
import X.C92254dO;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import java.util.Arrays;

public class ColorPickerView extends View implements C18700tb {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C18820ts A04;
    public C157397ct A05;
    public AnonymousClass1QZ A06;
    public boolean A07;
    public int A08;
    public int A09;
    public int A0A;
    public Bitmap A0B;
    public boolean A0C;
    public int[] A0D;
    public final Paint A0E;
    public final Paint A0F;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2x6.A03);
            this.A09 = (int) obtainStyledAttributes.getDimension(2, 1.0f);
            this.A03 = (int) obtainStyledAttributes.getDimension(1, 1.0f);
            this.A0A = (int) obtainStyledAttributes.getDimension(0, 1.0f);
            this.A00 = (float) this.A03;
            obtainStyledAttributes.recycle();
        }
    }

    public static void A01(ColorPickerView colorPickerView) {
        colorPickerView.A0D = AnonymousClass6H9.A01(colorPickerView.A08);
        Path A0M = C36441kJ.A0M();
        A0M.setFillType(Path.FillType.WINDING);
        float[] fArr = new float[8];
        Arrays.fill(fArr, ((float) colorPickerView.A09) / 0.8f);
        A0M.addRoundRect(new RectF(1.0f, 1.0f, (float) (colorPickerView.A09 - 1), (float) (colorPickerView.A08 - 1)), fArr, Path.Direction.CW);
        Bitmap bitmap = colorPickerView.A0B;
        if (!(bitmap != null && bitmap.getWidth() == colorPickerView.A09 && colorPickerView.A0B.getHeight() == colorPickerView.A08)) {
            colorPickerView.A0B = C90524aI.A09(colorPickerView.A09, colorPickerView.A08);
        }
        Canvas A0A2 = C90524aI.A0A(colorPickerView.A0B);
        Paint paint = colorPickerView.A0E;
        C36421kH.A0q(paint);
        A0A2.save();
        A0A2.clipPath(A0M);
        paint.setStrokeWidth(1.0f);
        for (int i = 0; i < colorPickerView.A08; i++) {
            paint.setColor(colorPickerView.A0D[i]);
            float f = (float) i;
            A0A2.drawLine(0.0f, f, (float) colorPickerView.A09, f, paint);
        }
        A0A2.restore();
        Paint paint2 = colorPickerView.A0F;
        C36381kD.A16(colorPickerView.getContext(), paint2, R.color.f6nameremoved);
        C36421kH.A0q(paint2);
        paint2.setStrokeWidth(C36441kJ.A00(colorPickerView.getResources(), R.dimen.f7nameremoved));
        A0A2.drawPath(A0M, paint2);
    }

    public void A02() {
        if (!this.A0C) {
            this.A0C = true;
            this.A04 = C36341k9.A0U(generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A06;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public float getMinSize() {
        return (float) this.A03;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C92254dO r2 = (C92254dO) parcelable;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        super.onRestoreInstanceState(r2.getSuperState());
    }

    public void setColorAndInvalidate(int i) {
        this.A01 = i;
        invalidate();
    }

    public void setSizeAndInvalidate(float f) {
        this.A00 = f;
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A0E = C36441kJ.A0K();
        this.A0F = C36371kC.A0E();
        A00(context, attributeSet);
    }

    public void draw(Canvas canvas) {
        int paddingRight;
        super.draw(canvas);
        if (C36351kA.A1Y(this.A04)) {
            paddingRight = AnonymousClass000.A0B(this);
        } else {
            paddingRight = this.A09 + getPaddingRight();
        }
        canvas.drawBitmap(this.A0B, (float) paddingRight, (float) getPaddingTop(), this.A0E);
    }

    public int getColor() {
        return this.A01;
    }

    public float getSize() {
        return this.A00;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 != 0 && getMeasuredHeight() > this.A02) {
            setMeasuredDimension(getMeasuredWidth(), this.A02);
        }
    }

    public Parcelable onSaveInstanceState() {
        return new C92254dO(super.onSaveInstanceState(), this.A00, this.A01);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int max = Math.max(1, AnonymousClass000.A0D(this, i2));
        this.A08 = max;
        int[] iArr = this.A0D;
        if (iArr == null || iArr.length < max) {
            this.A0D = new int[max];
        }
        A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 != 6) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (r7 != 1) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r7 = r10.getActionMasked()
            int r0 = r10.getPointerCount()
            r6 = 0
            r5 = 1
            if (r0 > r5) goto L_0x0046
            r3 = 5
            r8 = 2
            if (r7 == r3) goto L_0x0012
            if (r7 != 0) goto L_0x0047
        L_0x0012:
            float r2 = r10.getX()
            int r1 = X.AnonymousClass000.A0B(r9)
            int r0 = r9.A09
            int r0 = r0 * 2
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            X.0ts r0 = r9.A04
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r0 != 0) goto L_0x0046
        L_0x002c:
            float r2 = r10.getX()
            int r1 = r9.getPaddingLeft()
            int r0 = r9.A09
            int r0 = r0 * 2
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            X.0ts r0 = r9.A04
            boolean r0 = X.C36401kF.A1X(r0)
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            return r6
        L_0x0047:
            r4 = 6
            if (r7 == 0) goto L_0x0059
            if (r7 == r5) goto L_0x0059
            if (r7 == r8) goto L_0x0059
            r0 = 3
            if (r7 == r0) goto L_0x00cb
            if (r7 == r3) goto L_0x0059
            if (r7 == r4) goto L_0x0059
        L_0x0055:
            r9.invalidate()
            return r5
        L_0x0059:
            X.7ct r0 = r9.A05
            if (r0 == 0) goto L_0x0055
            float r0 = r10.getY()
            int r1 = (int) r0
            int r0 = r9.getPaddingTop()
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x006a
            r1 = 0
        L_0x006a:
            int r0 = r9.A08
            if (r1 < r0) goto L_0x0070
            int r1 = r0 + -1
        L_0x0070:
            int[] r0 = r9.A0D
            r1 = r0[r1]
            int r0 = r9.A01
            if (r1 == r0) goto L_0x00c7
            r9.A01 = r1
            X.0ts r0 = r9.A04
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r0 == 0) goto L_0x0104
            float r8 = X.C36441kJ.A01(r9)
            float r0 = r10.getX()
            float r8 = r8 - r0
        L_0x008b:
            int r1 = r9.A09
            int r0 = r9.getPaddingLeft()
            int r1 = r1 + r0
            int r0 = r9.getPaddingRight()
            int r1 = r1 + r0
            float r3 = (float) r1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ae
            int r1 = r9.A03
            float r2 = (float) r1
            int r0 = r9.A0A
            int r0 = r0 - r1
            float r1 = (float) r0
            float r8 = r8 - r3
            float r1 = r1 * r8
            float r0 = X.C36441kJ.A01(r9)
            float r0 = r0 - r3
            float r1 = r1 / r0
            float r2 = r2 + r1
            r9.A00 = r2
        L_0x00ae:
            r9.A07 = r5
            X.7ct r3 = r9.A05
            float r2 = r9.A00
            int r1 = r9.A01
            X.6w0 r3 = (X.C146686w0) r3
            X.7gv r0 = r3.A02
            if (r0 == 0) goto L_0x00bf
            r0.BsM(r1, r2)
        L_0x00bf:
            X.7jX r0 = r3.A00
            r0.BTy(r1, r2)
            r0.Bjs()
        L_0x00c7:
            if (r7 == r4) goto L_0x00cb
            if (r7 != r5) goto L_0x0055
        L_0x00cb:
            r9.A07 = r6
            X.7ct r4 = r9.A05
            X.6w0 r4 = (X.C146686w0) r4
            X.7gv r0 = r4.A02
            if (r0 == 0) goto L_0x00f4
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = (com.whatsapp.mediacomposer.doodle.DoodleView) r0
            X.6FV r3 = r0.A0H
            X.6Ft r0 = r3.A02
            X.6Ft r2 = r3.A01
            if (r0 == 0) goto L_0x00f4
            if (r0 != r2) goto L_0x00f4
            X.5vF r0 = r3.A00
            X.5Cs r1 = new X.5Cs
            r1.<init>(r0, r2)
            X.65v r0 = r3.A03
            java.util.List r0 = r0.A00
            r0.add(r1)
            r0 = 0
            r3.A02 = r0
            r3.A00 = r0
        L_0x00f4:
            X.7jX r0 = r4.A00
            r0.Bjs()
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r4.A01
            com.whatsapp.mediacomposer.doodle.ColorPickerView r1 = r0.A03
            int r0 = r1.A01
            X.AnonymousClass6H9.A00(r1, r0)
            goto L_0x0055
        L_0x0104:
            float r8 = r10.getX()
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void setColor(int i) {
        this.A01 = i;
    }

    private void setSize(float f) {
        this.A00 = f;
    }

    public void setListener(C157397ct r1) {
        this.A05 = r1;
    }

    public void setMaxHeight(int i) {
        this.A02 = i;
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
        this.A0E = C36441kJ.A0K();
        this.A0F = C36371kC.A0E();
        A00(context, attributeSet);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0E = C36441kJ.A0K();
        this.A0F = C36371kC.A0E();
        A00(context, attributeSet);
    }

    public ColorPickerView(Context context) {
        super(context);
        A02();
        this.A0E = C36441kJ.A0K();
        this.A0F = C36371kC.A0E();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }
}
