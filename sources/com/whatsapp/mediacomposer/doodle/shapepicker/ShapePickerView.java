package com.whatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass001;
import X.AnonymousClass1QZ;
import X.AnonymousClass5MF;
import X.AnonymousClass6OT;
import X.AnonymousClass78T;
import X.C157417cv;
import X.C18700tb;
import X.C18800tq;
import X.C19700wN;
import X.C19720wP;
import X.C19770wU;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import java.util.HashMap;

public class ShapePickerView extends RelativeLayout implements C18700tb, C157417cv {
    public ValueAnimator A00;
    public Bitmap A01;
    public Bitmap A02;
    public C19700wN A03;
    public C19770wU A04;
    public AnonymousClass1QZ A05;
    public RectF A06;
    public AnonymousClass6OT A07;
    public AnonymousClass5MF A08;
    public boolean A09;
    public final Paint A0A;

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A03 = C36391kE.A0V(A0W);
            this.A04 = C36341k9.A0Z(A0W);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r4.A02 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r4 = this;
            X.5MF r0 = r4.A08
            X.C36331k8.A1E(r0)
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x000c
            r0.cancel()
        L_0x000c:
            r3 = 0
            r4.A06 = r3
            android.graphics.Bitmap r2 = r4.A01
            if (r2 != 0) goto L_0x0018
            android.graphics.Bitmap r0 = r4.A02
            r1 = 0
            if (r0 == 0) goto L_0x0020
        L_0x0018:
            r1 = 1
            if (r2 == 0) goto L_0x0020
            r2.recycle()
            r4.A01 = r3
        L_0x0020:
            android.graphics.Bitmap r0 = r4.A02
            if (r0 == 0) goto L_0x0029
            r0.recycle()
            r4.A02 = r3
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView.A02():boolean");
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A0A);
        }
        super.draw(canvas);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public ShapePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A0A = C36371kC.A0E();
    }

    public void A01(Bitmap bitmap, AnonymousClass6OT r11) {
        if (A02()) {
            invalidate();
        }
        if (r11.A04 <= 0 || r11.A03 <= 0) {
            C19700wN r4 = this.A03;
            String obj = r11.toString();
            HashMap A0J = AnonymousClass001.A0J();
            C19720wP.A06(new AnonymousClass78T("shape-picker-doodle-view-state-dimen"), (C19720wP) r4, "shape-picker-doodle-view-state-dimen", obj, A0J, true);
            return;
        }
        this.A07 = r11;
        this.A02 = bitmap;
        RectF rectF = r11.A0B;
        this.A06 = new RectF(rectF);
        AnonymousClass5MF r2 = new AnonymousClass5MF(r11.A05, new Rect(0, 0, r11.A04, r11.A03), new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom), this);
        this.A08 = r2;
        this.A04.Box(r2, bitmap);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        AnonymousClass6OT r1 = this.A07;
        if (r1 != null && this.A02 != null && !r1.A0B.equals(this.A06)) {
            A01(this.A02.copy(Bitmap.Config.ARGB_8888, true), this.A07);
        }
    }

    public ShapePickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public ShapePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0A = C36371kC.A0E();
    }

    public ShapePickerView(Context context) {
        super(context);
        A00();
        this.A0A = C36371kC.A0E();
    }
}
