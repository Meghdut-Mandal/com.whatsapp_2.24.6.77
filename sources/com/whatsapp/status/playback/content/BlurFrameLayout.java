package com.whatsapp.status.playback.content;

import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C18800tq;
import X.C19630wG;
import X.C19770wU;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import X.C49812jj;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

public final class BlurFrameLayout extends FrameLayout implements C18700tb {
    public Bitmap A00;
    public Bitmap A01;
    public ViewPropertyAnimator A02;
    public C19630wG A03;
    public C49812jj A04;
    public C19770wU A05;
    public AnonymousClass1QZ A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A00();
        this.A07 = true;
        this.A08 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0 == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x006e
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0048
            android.graphics.Bitmap r0 = r5.A00
            if (r0 != 0) goto L_0x005c
            int r2 = r5.getWidth()
            int r1 = r5.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r5.A00 = r0
            if (r0 != 0) goto L_0x005c
        L_0x0022:
            X.2jj r0 = r5.A04
            if (r0 == 0) goto L_0x002b
            java.lang.ref.WeakReference r0 = r0.A00
            r0.clear()
        L_0x002b:
            X.2jj r0 = r5.A04
            boolean r0 = X.C36411kG.A1Z(r0)
            X.2jj r4 = new X.2jj
            r4.<init>(r5)
            r5.A04 = r4
            X.0wU r3 = r5.getWaWorkers()
            android.graphics.Bitmap[] r2 = new android.graphics.Bitmap[r0]
            android.graphics.Bitmap r1 = r5.A00
            r0 = 0
            r2[r0] = r1
            r3.Box(r4, r2)
            r5.A07 = r0
        L_0x0048:
            android.graphics.Bitmap r2 = r5.A01
            if (r2 == 0) goto L_0x0052
            r1 = 0
            r0 = 0
            r6.drawBitmap(r2, r0, r0, r1)
        L_0x0051:
            return
        L_0x0052:
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 == 0) goto L_0x0051
            r0.draw(r6)
            return
        L_0x005c:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 == 0) goto L_0x006a
            r0.draw(r1)
        L_0x006a:
            super.dispatchDraw(r1)
            goto L_0x0022
        L_0x006e:
            super.dispatchDraw(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.content.BlurFrameLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void setWaContext(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A05 = C36341k9.A0Z(A0W);
            this.A03 = C36351kA.A0W(A0W);
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

    public final C19630wG getWaContext() {
        C19630wG r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waContext");
    }

    public final C19770wU getWaWorkers() {
        C19770wU r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public final void setBlurEnabled(boolean z) {
        this.A08 = z;
        if (z) {
            this.A07 = true;
        }
        invalidate();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C49812jj r0 = this.A04;
        if (r0 != null) {
            r0.A00.clear();
        }
        boolean A1Z = C36411kG.A1Z(this.A04);
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.A01 = null;
        this.A07 = A1Z;
        Bitmap bitmap2 = this.A00;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.A00 = null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A08) {
            this.A00 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.A07 = true;
            invalidate();
        }
    }

    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A00();
        this.A07 = true;
        this.A08 = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
        A00();
        this.A07 = true;
        this.A08 = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A00();
        this.A07 = true;
        this.A08 = true;
    }
}
