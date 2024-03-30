package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.0NE  reason: invalid class name */
public class AnonymousClass0NE extends C06570Uc {
    public Window A00;
    public boolean A01;
    public final AnonymousClass09H A02;
    public final Boolean A03;

    public void A04(Window window) {
        if (this.A00 != window) {
            this.A00 = window;
            if (window != null) {
                this.A01 = new AnonymousClass0SJ(window.getDecorView(), window).A00.A01();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r1 <= 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0NE(android.view.View r7, X.AnonymousClass09H r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.A02 = r8
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.A02(r7)
            X.05l r0 = r0.A0O
            if (r0 == 0) goto L_0x0041
            X.06X r0 = r0.A01
            android.content.res.ColorStateList r0 = r0.A0B
        L_0x0011:
            if (r0 == 0) goto L_0x002c
            int r0 = r0.getDefaultColor()
        L_0x0017:
            if (r0 == 0) goto L_0x0024
            double r4 = X.C018107s.A00(r0)
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0029:
            r6.A03 = r0
            return
        L_0x002c:
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x003f
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            goto L_0x0017
        L_0x003f:
            r0 = 0
            goto L_0x0029
        L_0x0041:
            android.content.res.ColorStateList r0 = X.C011004s.A01(r7)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NE.<init>(android.view.View, X.09H):void");
    }

    private void A00(View view) {
        int paddingLeft;
        int i;
        boolean booleanValue;
        int top = view.getTop();
        AnonymousClass09H r4 = this.A02;
        if (top < r4.A05()) {
            Window window = this.A00;
            if (window != null) {
                Boolean bool = this.A03;
                if (bool == null) {
                    booleanValue = this.A01;
                } else {
                    booleanValue = bool.booleanValue();
                }
                new AnonymousClass0SJ(window.getDecorView(), window).A00.A00(booleanValue);
            }
            paddingLeft = view.getPaddingLeft();
            i = r4.A05() - view.getTop();
        } else if (view.getTop() != 0) {
            Window window2 = this.A00;
            if (window2 != null) {
                new AnonymousClass0SJ(window2.getDecorView(), window2).A00.A00(this.A01);
            }
            paddingLeft = view.getPaddingLeft();
            i = 0;
        } else {
            return;
        }
        view.setPadding(paddingLeft, i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public void A01(View view) {
        A00(view);
    }

    public void A02(View view, float f) {
        A00(view);
    }

    public void A03(View view, int i) {
        A00(view);
    }
}
