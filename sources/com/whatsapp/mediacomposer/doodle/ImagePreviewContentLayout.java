package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.AnonymousClass6OT;
import X.AnonymousClass74P;
import X.C1268265t;
import X.C135346cY;
import X.C146806wC;
import X.C1500573u;
import X.C1500673v;
import X.C157407cu;
import X.C18700tb;
import X.C36331k8;
import X.C36441kJ;
import X.C81243wh;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public final class ImagePreviewContentLayout extends FrameLayout implements C18700tb {
    public C146806wC A00;
    public C157407cu A01;
    public C135346cY A02;
    public AnonymousClass1QZ A03;
    public boolean A04;
    public final Rect A05;
    public final RectF A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A00();
        this.A06 = C36441kJ.A0N();
        this.A05 = AnonymousClass001.A06();
        C1268265t.A00(this);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        canvas.setMatrix(this.A02.A0H);
        Rect rect = this.A05;
        canvas.getClipBounds(rect);
        C146806wC r2 = this.A00;
        if (r2 != null) {
            float f = this.A02.A04;
            AnonymousClass6OT r0 = r2.A0O;
            r0.A06 = rect;
            r0.A01 = f;
        }
        super.onDraw(canvas);
    }

    public final void setDoodleController(C146806wC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setZoomableViewController(C135346cY r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public void A00() {
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public final void A01() {
        C135346cY r3 = this.A02;
        AnonymousClass74P r1 = r3.A09;
        if (r1 != null) {
            r1.A00 = false;
            r1.A01 = true;
        }
        r3.A09 = null;
        C1500673v r12 = r3.A0B;
        if (r12 != null) {
            r12.A03 = false;
            r12.A04 = true;
        }
        r3.A0B = null;
        C1500573u r13 = r3.A0A;
        if (r13 != null) {
            r13.A03 = false;
            r13.A04 = true;
        }
        r3.A0A = null;
        C81243wh r14 = r3.A08;
        if (r14 != null) {
            r14.A03 = true;
        }
        r3.A08 = null;
        r3.A07 = null;
        r3.A07 = null;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final boolean getOnFlingEnabled() {
        return this.A02.A0D;
    }

    public final int getTranslateTouchPoints() {
        return this.A02.A05;
    }

    public final void setMinScale(float f) {
        this.A02.A01 = f;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A02.A07 = onClickListener;
    }

    public final void setOnFlingEnabled(boolean z) {
        this.A02.A0D = z;
    }

    public final void setTranslateTouchPoints(int i) {
        this.A02.A05 = i;
    }

    public final GestureDetector.OnGestureListener getActionHandler() {
        return this.A02;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            RectF rectF = this.A06;
            rectF.set(0.0f, 0.0f, (float) C36331k8.A00(this, getWidth()), (float) AnonymousClass000.A0D(this, getHeight()));
            C135346cY r2 = this.A02;
            r2.A0J.set(rectF);
            C135346cY.A00(r2);
            r2.A0C = true;
            Matrix matrix = r2.A06;
            if (matrix == null || matrix.equals(r2.A0H)) {
                C135346cY.A00(r2);
            }
        }
    }

    public final void setImagePreviewContentLayoutListener(C157407cu r1) {
        this.A01 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
        A00();
        this.A06 = C36441kJ.A0N();
        this.A05 = AnonymousClass001.A06();
        C1268265t.A00(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A00();
        this.A06 = C36441kJ.A0N();
        this.A05 = AnonymousClass001.A06();
        C1268265t.A00(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagePreviewContentLayout(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A00();
        this.A06 = C36441kJ.A0N();
        this.A05 = AnonymousClass001.A06();
        C1268265t.A00(this);
    }

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
