package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.4dW  reason: invalid class name and case insensitive filesystem */
public final class C92314dW extends View {
    public static final int[] A05;
    public static final int[] A06 = new int[0];
    public C91384bv A00;
    public Boolean A01;
    public Long A02;
    public Runnable A03;
    public AnonymousClass00S A04;

    public static final void setRippleState$lambda$2(C92314dW r2) {
        AnonymousClass00C.A0D(r2, 0);
        C91384bv r1 = r2.A00;
        if (r1 != null) {
            r1.setState(A06);
        }
        r2.A03 = null;
    }

    public final void A00() {
        this.A04 = null;
        Runnable runnable = this.A03;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.A03;
            AnonymousClass00C.A0B(runnable2);
            runnable2.run();
        } else {
            C91384bv r1 = this.A00;
            if (r1 != null) {
                r1.setState(A06);
            }
        }
        C91384bv r12 = this.A00;
        if (r12 != null) {
            r12.setVisible(false, false);
            unscheduleDrawable(r12);
        }
    }

    public final void A01() {
        setRippleState(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1.equals(r13.A01) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C136706er r14, X.AnonymousClass00S r15, float r16, int r17, long r18, long r20) {
        /*
            r13 = this;
            r5 = 1
            r0 = 6
            X.AnonymousClass00C.A0D(r15, r0)
            r6 = r13
            X.4bv r4 = r13.A00
            if (r4 == 0) goto L_0x0016
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r0 = r13.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0026
        L_0x0016:
            X.4bv r4 = new X.4bv
            r4.<init>()
            r13.setBackground(r4)
            r13.A00 = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r13.A01 = r0
        L_0x0026:
            X.AnonymousClass00C.A0B(r4)
            r13.A04 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r11 = r20
            r6.A02(r7, r8, r9, r11)
            long r2 = r14.A00
            float r1 = X.C133206Xf.A00(r2)
            float r0 = X.C133206Xf.A01(r2)
            r4.setHotspot(r1, r0)
            r13.setRippleState(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92314dW.A03(X.6er, X.00S, float, int, long, long):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }

    public final void A02(float f, int i, long j, long j2) {
        C91384bv r4 = this.A00;
        if (r4 != null) {
            r4.A01(i);
            r4.A00(f, j2);
            Rect rect = new Rect(0, 0, C14960mT.A01(AnonymousClass6X0.A01(j)), C14960mT.A01(AnonymousClass6X0.A00(j)));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            r4.setBounds(rect);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        AnonymousClass00S r0 = this.A04;
        if (r0 != null) {
            r0.invoke();
        }
    }

    static {
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 16842919;
        A1O[1] = 16842910;
        A05 = A1O;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setRippleState(boolean r8) {
        /*
            r7 = this;
            long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            java.lang.Runnable r0 = r7.A03
            if (r0 == 0) goto L_0x000e
            r7.removeCallbacks(r0)
            r0.run()
        L_0x000e:
            java.lang.Long r0 = r7.A02
            long r0 = X.C36371kC.A0A(r0)
            long r3 = r5 - r0
            if (r8 != 0) goto L_0x0032
            r1 = 5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0035
            r0 = 6
            X.759 r2 = new X.759
            r2.<init>((java.lang.Object) r7, (int) r0)
            r7.A03 = r2
            r0 = 50
            r7.postDelayed(r2, r0)
        L_0x002b:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r7.A02 = r0
            return
        L_0x0032:
            int[] r1 = A05
            goto L_0x0037
        L_0x0035:
            int[] r1 = A06
        L_0x0037:
            X.4bv r0 = r7.A00
            if (r0 == 0) goto L_0x002b
            r0.setState(r1)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92314dW.setRippleState(boolean):void");
    }

    public C92314dW(Context context) {
        super(context);
    }
}
