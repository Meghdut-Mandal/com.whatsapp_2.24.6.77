package com.whatsapp.payments.ui.widget;

import X.C114025gW;
import X.C224314h;
import X.C36351kA;
import X.C39011qu;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import com.whatsapp.R;
import com.whatsapp.WaEditText;

public class CardInputText extends WaEditText {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public boolean A05;
    public float A06;
    public int A07;
    public Paint A08;
    public Paint A09;
    public boolean A0A;
    public float[] A0B;
    public float[] A0C;
    public RectF[] A0D;
    public final int A0E;
    public final int A0F;

    private void A03(Canvas canvas, float f) {
        int i;
        Canvas canvas2 = canvas;
        float height = (float) canvas.getHeight();
        float textSize = getTextSize();
        Paint paint = new Paint(getPaint());
        if (this.A0A) {
            i = this.A0F;
        } else {
            i = this.A0E;
        }
        paint.setColor(i);
        this.A0A = !this.A0A;
        paint.setStrokeWidth(5.0f);
        float f2 = f + 5.0f;
        float f3 = height / 2.0f;
        float f4 = textSize / 2.0f;
        canvas2.drawLine(f2, f3 - f4, f2, f3 + f4, paint);
    }

    /* JADX INFO: finally extract failed */
    private void A02(Context context, AttributeSet attributeSet) {
        this.A00 = (float) C36351kA.A04(this, this.A00);
        this.A01 = (float) C36351kA.A04(this, this.A01);
        this.A02 = (float) C36351kA.A04(this, this.A02);
        this.A03 = (float) C36351kA.A04(this, this.A03);
        int i = this.A0F;
        this.A07 = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C114025gW.A00, 0, 0);
        try {
            this.A00 = obtainStyledAttributes.getDimension(3, this.A00);
            this.A06 = obtainStyledAttributes.getDimension(0, 0.0f);
            this.A02 = obtainStyledAttributes.getDimension(1, this.A02);
            this.A03 = obtainStyledAttributes.getDimension(6, this.A03);
            this.A04 = obtainStyledAttributes.getInteger(5, 4);
            this.A07 = obtainStyledAttributes.getInteger(2, this.A07);
            int integer = obtainStyledAttributes.getInteger(4, i);
            obtainStyledAttributes.recycle();
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.A04)});
            this.A08 = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.A09 = paint;
            paint.setStrokeWidth(this.A00);
            this.A09.setColor(integer);
            setFontSize(this.A06);
            setBackgroundResource(0);
            setFilterTouchesWhenObscured(true);
            setCursorVisible(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setFontSize(float f) {
        this.A08.setTextSize(f);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    public CardInputText(Context context) {
        super(context);
        int A002 = C39011qu.A00(this);
        this.A0F = getResources().getColor(C224314h.A01(getContext(), R.attr.f4nameremoved));
        this.A0E = getResources().getColor(R.color.f6nameremoved);
        this.A0A = false;
        this.A0C = new float[A002];
    }

    private CharSequence getFullText() {
        return getText();
    }

    public int getMaxNumberOfChars() {
        return this.A04;
    }

    public void onDraw(Canvas canvas) {
        int i;
        Editable text = getText();
        int length = text.length();
        float[] fArr = this.A0C;
        int length2 = fArr.length;
        if (length2 < length) {
            float[] fArr2 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, length2);
            fArr = fArr2;
        }
        this.A0C = fArr;
        getPaint().getTextWidths(text, 0, length, this.A0C);
        int i2 = 0;
        while (true) {
            i = this.A04;
            Canvas canvas2 = canvas;
            if (i2 >= i) {
                break;
            }
            float f = this.A0D[i2].left + (this.A06 / 2.0f);
            if (length > i2) {
                canvas2.drawText(text, i2, i2 + 1, f - (this.A0C[i2] / 2.0f), this.A0B[i2], this.A08);
            }
            if (length == i2 && hasFocus()) {
                A03(canvas, this.A0D[i2].left);
            }
            RectF rectF = this.A0D[i2];
            canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.A09);
            i2++;
        }
        if (length == i && hasFocus()) {
            A03(canvas, this.A0D[i2 - 1].right);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            super.onSizeChanged(r11, r12, r13, r14)
            android.graphics.Paint r1 = r10.A08
            int r0 = r10.A07
            r1.setColor(r0)
            int r1 = r10.getWidth()
            int r0 = X.AnonymousClass04F.A02(r10)
            int r1 = r1 - r0
            int r0 = X.AnonymousClass04F.A03(r10)
            int r1 = r1 - r0
            float r4 = r10.A02
            r3 = 1065353216(0x3f800000, float:1.0)
            r9 = 1073741824(0x40000000, float:2.0)
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x008f
            float r2 = (float) r1
            int r0 = r10.A04
            float r0 = (float) r0
            float r0 = r0 * r9
            float r0 = r0 - r3
            float r2 = r2 / r0
        L_0x002a:
            r10.A06 = r2
        L_0x002c:
            int r1 = r10.A04
            android.graphics.RectF[] r0 = new android.graphics.RectF[r1]
            r10.A0D = r0
            float[] r0 = new float[r1]
            r10.A0B = r0
            int r6 = r10.getHeight()
            int r0 = r10.getPaddingTop()
            int r6 = r6 - r0
            X.0ts r0 = r10.A03
            boolean r0 = X.C36401kF.A1X(r0)
            if (r0 == 0) goto L_0x0089
            r5 = -1
            int r1 = r10.getWidth()
            int r0 = X.AnonymousClass04F.A03(r10)
            int r1 = r1 - r0
            float r1 = (float) r1
            float r0 = r10.A06
            float r1 = r1 - r0
            int r7 = (int) r1
        L_0x0056:
            r4 = 0
        L_0x0057:
            int r0 = r10.A04
            if (r4 >= r0) goto L_0x009f
            android.graphics.RectF[] r3 = r10.A0D
            float r7 = (float) r7
            float r2 = (float) r6
            float r1 = r10.A06
            float r1 = r1 + r7
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7, r2, r1, r2)
            r3[r4] = r0
            float r3 = r10.A02
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            float r1 = (float) r5
            float r0 = r10.A06
            if (r2 >= 0) goto L_0x0086
            float r1 = r1 * r0
            float r1 = r1 * r9
        L_0x0074:
            float r7 = r7 + r1
            int r7 = (int) r7
            float[] r2 = r10.A0B
            android.graphics.RectF[] r0 = r10.A0D
            r0 = r0[r4]
            float r1 = r0.bottom
            float r0 = r10.A03
            float r1 = r1 - r0
            r2[r4] = r1
            int r4 = r4 + 1
            goto L_0x0057
        L_0x0086:
            float r0 = r0 + r3
            float r1 = r1 * r0
            goto L_0x0074
        L_0x0089:
            int r7 = X.AnonymousClass04F.A03(r10)
            r5 = 1
            goto L_0x0056
        L_0x008f:
            float r0 = r10.A06
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            float r2 = (float) r1
            int r0 = r10.A04
            float r1 = (float) r0
            float r0 = r1 - r3
            float r4 = r4 * r0
            float r2 = r2 - r4
            float r2 = r2 / r1
            goto L_0x002a
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.CardInputText.onSizeChanged(int, int, int, int):void");
    }

    public CardInputText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int A002 = C39011qu.A00(this);
        this.A0F = getResources().getColor(C224314h.A01(getContext(), R.attr.f4nameremoved));
        this.A0E = getResources().getColor(R.color.f6nameremoved);
        this.A0A = false;
        this.A0C = new float[A002];
        A02(context, attributeSet);
    }

    public CardInputText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0A();
    }

    public CardInputText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int A002 = C39011qu.A00(this);
        this.A0F = getResources().getColor(C224314h.A01(getContext(), R.attr.f4nameremoved));
        this.A0E = getResources().getColor(R.color.f6nameremoved);
        this.A0A = false;
        this.A0C = new float[A002];
        A02(context, attributeSet);
    }
}
