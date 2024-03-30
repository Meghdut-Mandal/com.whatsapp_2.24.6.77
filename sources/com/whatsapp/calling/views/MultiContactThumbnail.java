package com.whatsapp.calling.views;

import X.AnonymousClass000;
import X.AnonymousClass141;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RY;
import X.AnonymousClass2x6;
import X.C18700tb;
import X.C18740tg;
import X.C18820ts;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import X.C88514Sz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

public class MultiContactThumbnail extends ViewGroup implements C18700tb {
    public float A00;
    public int A01;
    public Canvas A02;
    public Paint A03;
    public RectF A04;
    public C18820ts A05;
    public AnonymousClass1QZ A06;
    public boolean A07;
    public int A08;

    public MultiContactThumbnail(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setNumImages(int i) {
        if (i == this.A08) {
            invalidate();
            return;
        }
        int childCount = getChildCount();
        int childCount2 = getChildCount();
        if (i <= childCount) {
            int i2 = childCount2 - i;
            int childCount3 = getChildCount();
            for (int i3 = 0; i3 < i2; i3++) {
                getChildAt((childCount3 - 1) - i3).setVisibility(8);
            }
        } else {
            int i4 = i - childCount2;
            for (int i5 = 0; i5 < i4; i5++) {
                ImageView A0L = C36361kB.A0L(this);
                C36411kG.A1D(A0L);
                addView(A0L);
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 0) {
                childAt.setVisibility(0);
            }
        }
        this.A08 = i;
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = this.A02;
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        super.draw(canvas2);
        RectF rectF = this.A04;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A03);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A06;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r0 <= 1) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            int r0 = r14.A08
            r12 = 1
            if (r0 < r12) goto L_0x0080
            int r8 = r14.getPaddingLeft()
            int r11 = r14.getPaddingTop()
            int r7 = r14.getMeasuredWidth()
            int r0 = r14.getPaddingRight()
            int r7 = r7 - r0
            int r10 = r14.getMeasuredHeight()
            int r0 = r14.getPaddingBottom()
            int r10 = r10 - r0
            X.0ts r0 = r14.A05
            boolean r13 = X.C36401kF.A1X(r0)
            int r7 = r7 - r8
            int r10 = r10 - r11
            int r9 = r7 / 2
            int r0 = r14.A01
            int r1 = r9 - r0
            int r6 = r10 / 2
            int r5 = r6 - r0
            int r9 = r9 + r8
            int r9 = r9 + r0
            int r6 = r6 + r11
            int r6 = r6 + r0
            int r0 = r14.A08
            if (r0 == r12) goto L_0x003a
            r7 = r1
        L_0x003a:
            r4 = 3
            r3 = r5
            if (r0 > r4) goto L_0x003f
            r3 = r10
        L_0x003f:
            if (r13 == 0) goto L_0x0044
            r2 = r9
            if (r0 > r12) goto L_0x0045
        L_0x0044:
            r2 = r8
        L_0x0045:
            android.view.View r1 = X.C36411kG.A0L(r14)
            int r0 = r2 + r7
            int r3 = r3 + r11
            r1.layout(r2, r11, r0, r3)
            int r0 = r14.A08
            if (r0 == r12) goto L_0x0080
            r3 = r9
            if (r13 == 0) goto L_0x0057
            r3 = r8
        L_0x0057:
            r2 = 2
            if (r0 <= r2) goto L_0x005b
            r10 = r5
        L_0x005b:
            android.view.View r0 = r14.getChildAt(r12)
            int r1 = r3 + r7
            int r10 = r10 + r11
            r0.layout(r3, r11, r1, r10)
            int r0 = r14.A08
            if (r0 == r2) goto L_0x0080
            android.view.View r0 = r14.getChildAt(r2)
            int r5 = r5 + r6
            r0.layout(r3, r6, r1, r5)
            int r0 = r14.A08
            if (r0 == r4) goto L_0x0080
            if (r13 == 0) goto L_0x0078
            r8 = r9
        L_0x0078:
            android.view.View r0 = r14.getChildAt(r4)
            int r7 = r7 + r8
            r0.layout(r8, r6, r7, r5)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.MultiContactThumbnail.onLayout(boolean, int, int, int, int):void");
    }

    public void A00(C88514Sz r6, AnonymousClass1RY r7, List list) {
        boolean z = true;
        if (list.size() < 1) {
            z = false;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Value %d out of bounds for numImages:");
        C18740tg.A0D(z, C36381kD.A10(A0u, this.A08));
        int i = 4;
        if (list.size() <= 4) {
            i = list.size();
        }
        setNumImages(i);
        for (int i2 = 0; i2 < i; i2++) {
            r7.A06((ImageView) getChildAt(i2), r6, (AnonymousClass141) list.get(i2), false);
        }
    }

    public MultiContactThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A07) {
            this.A07 = true;
            this.A05 = C36331k8.A0C(generatedComponent());
        }
        this.A00 = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass2x6.A04);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, this.A01);
            obtainStyledAttributes.recycle();
        }
        int i2 = ((int) this.A00) * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        this.A02 = new Canvas(createBitmap);
        float f = (float) i2;
        this.A04 = new RectF(0.0f, 0.0f, f, f);
        this.A03 = C36441kJ.A0L(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A03.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        setWillNotDraw(false);
    }

    public MultiContactThumbnail(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
