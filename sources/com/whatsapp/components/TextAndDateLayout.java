package com.whatsapp.components;

import X.AnonymousClass1QZ;
import X.AnonymousClass2xF;
import X.C18700tb;
import X.C18820ts;
import X.C36341k9;
import X.C36361kB;
import X.C36411kG;
import X.C36441kJ;
import X.C44042Kx;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

public class TextAndDateLayout extends FrameLayout implements C18700tb {
    public int A00;
    public C18820ts A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public float A04;
    public float A05;
    public boolean A06;
    public boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013e, code lost:
        if (r13.A06 == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r4 = 0
            android.view.View r3 = r13.getChildAt(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6 = 1
            android.view.View r12 = r13.getChildAt(r6)
            android.text.Layout r0 = r3.getLayout()
            boolean r11 = X.AnonymousClass000.A1W(r0)
            super.onMeasure(r14, r15)
            int r1 = android.view.View.MeasureSpec.getMode(r15)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == r0) goto L_0x0036
            int r1 = r3.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0036
            int r2 = android.view.View.MeasureSpec.getSize(r14)
            android.text.Layout r5 = r3.getLayout()
            if (r5 != 0) goto L_0x0037
            java.lang.String r0 = "TextAndDateLayout/onMeasure/error getting textView layout"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r13.isInEditMode()
            r10 = 0
            if (r0 != 0) goto L_0x004d
            int r1 = r13.getLastParagraphDirection()
            r0 = -1
            if (r1 != r0) goto L_0x0130
            X.0ts r0 = r13.A01
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r0 != 0) goto L_0x013a
        L_0x004d:
            r9 = 0
        L_0x004e:
            int r0 = r5.getLineCount()
            if (r0 <= r6) goto L_0x00e8
            int r0 = X.C36411kG.A03(r5, r13)
            int r7 = r5.getLineStart(r0)
            int r0 = X.C36411kG.A03(r5, r13)
            int r6 = r5.getLineEnd(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x00e3
            java.lang.CharSequence r8 = r5.getText()
        L_0x006e:
            java.lang.CharSequence r1 = r8.subSequence(r7, r6)
            android.text.TextPaint r0 = r3.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r1, r0)
            int r7 = (int) r0
            int r1 = r13.A00
            if (r1 <= 0) goto L_0x008d
            int r0 = r5.getLineCount()
            if (r1 >= r0) goto L_0x008d
            int r0 = r5.getLineStart(r4)
            java.lang.CharSequence r8 = r8.subSequence(r0, r6)
        L_0x008d:
            int r6 = r3.getMeasuredWidth()
            if (r11 != 0) goto L_0x00b7
            r0 = 10
            int r0 = android.text.TextUtils.indexOf(r8, r0)
            if (r0 < 0) goto L_0x00b7
            android.text.TextPaint r0 = r3.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r8, r0)
            double r0 = (double) r0
            double r4 = java.lang.Math.ceil(r0)
            int r1 = (int) r4
            int r0 = r3.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r3.getPaddingLeft()
            int r1 = r1 + r0
            int r6 = java.lang.Math.min(r6, r1)
        L_0x00b7:
            int r1 = X.C36331k8.A00(r13, r2)
            int r0 = r12.getMeasuredWidth()
            int r0 = r0 + r6
            if (r1 < r0) goto L_0x0113
            if (r9 != 0) goto L_0x0113
            boolean r0 = r13.A03
            if (r0 != 0) goto L_0x00d7
            int r0 = r12.getMeasuredWidth()
            int r6 = r6 + r0
            int r0 = r13.getPaddingLeft()
            int r6 = r6 + r0
            int r2 = r13.getPaddingRight()
            int r2 = r2 + r6
        L_0x00d7:
            int r1 = r13.getMeasuredHeight()
            float r0 = r13.A05
        L_0x00dd:
            int r0 = (int) r0
            int r1 = r1 + r0
            r13.setMeasuredDimension(r2, r1)
            return
        L_0x00e3:
            java.lang.CharSequence r8 = r3.getText()
            goto L_0x006e
        L_0x00e8:
            int r2 = X.C36331k8.A00(r13, r2)
            int r1 = r3.getMeasuredWidth()
            int r0 = r12.getMeasuredWidth()
            int r1 = r1 + r0
            if (r2 < r1) goto L_0x0120
            if (r9 != 0) goto L_0x0120
            int r2 = r3.getMeasuredWidth()
            int r0 = r12.getMeasuredWidth()
            int r2 = r2 + r0
            int r0 = r13.getPaddingLeft()
            int r2 = r2 + r0
            int r0 = r13.getPaddingRight()
            int r2 = r2 + r0
            int r0 = r13.getMeasuredWidth()
            if (r2 <= r0) goto L_0x0036
            goto L_0x00d7
        L_0x0113:
            int r1 = X.C36331k8.A00(r3, r6)
            int r0 = r12.getMeasuredWidth()
            int r7 = r7 + r0
            if (r1 < r7) goto L_0x0120
            if (r10 == 0) goto L_0x0036
        L_0x0120:
            int r2 = r13.getMeasuredWidth()
            int r1 = r13.getMeasuredHeight()
            int r0 = r12.getMeasuredHeight()
            int r1 = r1 + r0
            float r0 = r13.A04
            goto L_0x00dd
        L_0x0130:
            if (r1 != r6) goto L_0x004d
            X.0ts r0 = r13.A01
            boolean r0 = X.C36401kF.A1X(r0)
            if (r0 == 0) goto L_0x004d
        L_0x013a:
            r10 = 1
            boolean r0 = r13.A06
            r9 = 1
            if (r0 != 0) goto L_0x004e
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.components.TextAndDateLayout.onMeasure(int, int):void");
    }

    private void A00(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C36361kB.A09(this).obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0N, 0, 0);
            try {
                this.A00 = obtainStyledAttributes.getInt(3, 0);
                this.A06 = obtainStyledAttributes.getBoolean(0, false);
                this.A05 = obtainStyledAttributes.getDimension(2, 0.0f);
                this.A04 = obtainStyledAttributes.getDimension(1, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void A01() {
        if (!this.A07) {
            this.A07 = true;
            this.A01 = C36341k9.A0U(generatedComponent());
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

    public void setMaxTextLineCount(int i) {
        if (this.A00 != i) {
            invalidate();
            setTextViewStyle(i);
        }
        this.A00 = i;
    }

    public TextAndDateLayout(Context context) {
        super(context);
        A01();
    }

    private int getLastParagraphDirection() {
        Layout layout = ((TextView) C36411kG.A0L(this)).getLayout();
        return layout.getParagraphDirection(C36411kG.A03(layout, this));
    }

    private void setTextViewStyle(int i) {
        TextView textView = (TextView) C36411kG.A0L(this);
        if (i > 0) {
            textView.setMaxLines(i);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setTextViewStyle(this.A00);
        if (this.A06) {
            TextView textView = (TextView) C36411kG.A0L(this);
            textView.addTextChangedListener(new C44042Kx(textView, this, 1));
        }
    }

    public void setFullWidth(boolean z) {
        this.A03 = z;
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00(attributeSet);
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        A00(attributeSet);
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00(attributeSet);
    }
}
