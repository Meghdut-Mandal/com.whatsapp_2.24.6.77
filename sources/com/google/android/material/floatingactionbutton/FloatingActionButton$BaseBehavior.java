package com.google.android.material.floatingactionbutton;

import X.AnonymousClass060;
import X.AnonymousClass0XL;
import X.C02460Ak;
import X.C27931Qk;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class FloatingActionButton$BaseBehavior extends AnonymousClass0XL {
    public boolean A00;
    public Rect A01;

    public /* bridge */ /* synthetic */ boolean A0B(Rect rect, View view, CoordinatorLayout coordinatorLayout) {
        AnonymousClass060 r8 = (AnonymousClass060) view;
        Rect rect2 = r8.A0C;
        rect.set(r8.getLeft() + rect2.left, r8.getTop() + rect2.top, r8.getRight() - rect2.right, r8.getBottom() - rect2.bottom);
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A0C(View view, View view2, CoordinatorLayout coordinatorLayout) {
        AnonymousClass060 r3 = (AnonymousClass060) view;
        if (view2 instanceof AppBarLayout) {
            A01(coordinatorLayout, (AppBarLayout) view2, r3);
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof C02460Ak) || !(((C02460Ak) layoutParams).A0B instanceof BottomSheetBehavior)) {
            return false;
        }
        A00(view2, r3);
        return false;
    }

    public void A0K(C02460Ak r2) {
        if (r2.A02 == 0) {
            r2.A02 = 80;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A0P(android.view.View r7, androidx.coordinatorlayout.widget.CoordinatorLayout r8, int r9) {
        /*
            r6 = this;
            X.060 r7 = (X.AnonymousClass060) r7
            java.util.List r5 = r8.A0C(r7)
            int r4 = r5.size()
            r3 = 0
        L_0x000b:
            if (r3 >= r4) goto L_0x001f
            java.lang.Object r2 = r5.get(r3)
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r2 instanceof com.google.android.material.appbar.AppBarLayout
            if (r0 == 0) goto L_0x007a
            com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
            boolean r0 = r6.A01(r8, r2, r7)
        L_0x001d:
            if (r0 == 0) goto L_0x008f
        L_0x001f:
            r8.A0F(r7, r9)
            android.graphics.Rect r4 = r7.A0C
            if (r4 == 0) goto L_0x005e
            int r0 = r4.centerX()
            if (r0 <= 0) goto L_0x005e
            int r0 = r4.centerY()
            if (r0 <= 0) goto L_0x005e
            android.view.ViewGroup$MarginLayoutParams r5 = X.AnonymousClass000.A0a(r7)
            int r2 = r7.getRight()
            int r1 = r8.getWidth()
            int r0 = r5.rightMargin
            int r1 = r1 - r0
            if (r2 < r1) goto L_0x006c
            int r3 = r4.right
        L_0x0045:
            int r2 = r7.getBottom()
            int r1 = r8.getHeight()
            int r0 = r5.bottomMargin
            int r1 = r1 - r0
            if (r2 < r1) goto L_0x0060
            int r0 = r4.bottom
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            X.C012005e.A0Q(r7, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            X.C012005e.A0P(r7, r3)
        L_0x005e:
            r0 = 1
            return r0
        L_0x0060:
            int r1 = r7.getTop()
            int r0 = r5.topMargin
            if (r1 > r0) goto L_0x0059
            int r0 = r4.top
            int r0 = -r0
            goto L_0x0054
        L_0x006c:
            int r1 = r7.getLeft()
            int r0 = r5.leftMargin
            if (r1 > r0) goto L_0x0078
            int r0 = r4.left
            int r3 = -r0
            goto L_0x0045
        L_0x0078:
            r3 = 0
            goto L_0x0045
        L_0x007a:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof X.C02460Ak
            if (r0 == 0) goto L_0x008f
            X.0Ak r1 = (X.C02460Ak) r1
            X.0XL r0 = r1.A0B
            boolean r0 = r0 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L_0x008f
            boolean r0 = r6.A00(r2, r7)
            goto L_0x001d
        L_0x008f:
            int r3 = r3 + 1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior.A0P(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27931Qk.A0D);
        this.A00 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r7.A00 != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00(android.view.View r6, X.AnonymousClass060 r7) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            X.0Ak r1 = (X.C02460Ak) r1
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0017
            int r1 = r1.A06
            int r0 = r6.getId()
            if (r1 != r0) goto L_0x0017
            int r0 = r7.A00
            r1 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r4 = 0
            if (r1 != 0) goto L_0x001c
            return r4
        L_0x001c:
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass000.A0a(r7)
            int r2 = r6.getTop()
            int r0 = r7.getHeight()
            int r1 = r0 / 2
            int r0 = r3.topMargin
            int r1 = r1 + r0
            if (r2 >= r1) goto L_0x0034
            r7.A04(r4)
        L_0x0032:
            r0 = 1
            return r0
        L_0x0034:
            r7.A05(r4)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior.A00(android.view.View, X.060):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r6.A00 != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A01(androidx.coordinatorlayout.widget.CoordinatorLayout r4, com.google.android.material.appbar.AppBarLayout r5, X.AnonymousClass060 r6) {
        /*
            r3 = this;
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            X.0Ak r1 = (X.C02460Ak) r1
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0017
            int r1 = r1.A06
            int r0 = r5.getId()
            if (r1 != r0) goto L_0x0017
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r2 = 0
            if (r1 != 0) goto L_0x001c
            return r2
        L_0x001c:
            android.graphics.Rect r0 = r3.A01
            if (r0 != 0) goto L_0x0026
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r3.A01 = r0
        L_0x0026:
            X.C07420Xp.A01(r0, r5, r4)
            int r1 = r0.bottom
            int r0 = r5.getMinimumHeightForVisibleOverlappingContent()
            if (r1 > r0) goto L_0x0036
            r6.A04(r2)
        L_0x0034:
            r0 = 1
            return r0
        L_0x0036:
            r6.A05(r2)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior.A01(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, X.060):boolean");
    }

    public FloatingActionButton$BaseBehavior() {
        this.A00 = true;
    }
}
