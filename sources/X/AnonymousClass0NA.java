package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;

/* renamed from: X.0NA  reason: invalid class name */
public abstract class AnonymousClass0NA extends AnonymousClass0GV {
    public int A00;
    public int A01 = 0;
    public final Rect A02 = AnonymousClass001.A06();
    public final Rect A03 = AnonymousClass001.A06();

    public boolean A0T() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0S(android.view.View r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L_0x0043
            boolean r0 = r6 instanceof com.google.android.material.appbar.AppBarLayout
            if (r0 == 0) goto L_0x002b
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            int r3 = r6.getTotalScrollRange()
            int r2 = r6.getDownNestedPreScrollRange()
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            X.0Ak r0 = (X.C02460Ak) r0
            X.0XL r1 = r0.A0B
            boolean r0 = r1 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r0 == 0) goto L_0x0041
            X.0NB r1 = (X.AnonymousClass0NB) r1
            int r1 = r1.A0S()
        L_0x0025:
            if (r2 == 0) goto L_0x0037
            int r0 = r3 + r1
            if (r0 > r2) goto L_0x0037
        L_0x002b:
            r1 = 0
        L_0x002c:
            int r2 = r5.A00
            float r0 = (float) r2
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r0 < r4) goto L_0x0043
            r4 = r0
            if (r0 <= r2) goto L_0x0043
            return r2
        L_0x0037:
            int r3 = r3 - r2
            if (r3 == 0) goto L_0x002b
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r1
            float r0 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r2
            goto L_0x002c
        L_0x0041:
            r1 = 0
            goto L_0x0025
        L_0x0043:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NA.A0S(android.view.View):int");
    }

    public AnonymousClass0NA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3, int i4) {
        AnonymousClass09H r0;
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        List A0C = coordinatorLayout.A0C(view);
        int size = A0C.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) A0C.get(i6);
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout == null) {
                    return false;
                }
                int size2 = View.MeasureSpec.getSize(i3);
                if (size2 <= 0) {
                    size2 = coordinatorLayout.getHeight();
                } else if (C011504z.A09(appBarLayout) && (r0 = coordinatorLayout.A02) != null) {
                    size2 += r0.A05() + r0.A02();
                }
                int totalScrollRange = size2 + appBarLayout.getTotalScrollRange();
                int measuredHeight = appBarLayout.getMeasuredHeight();
                if (A0T()) {
                    view.setTranslationY((float) (-measuredHeight));
                } else {
                    view.setTranslationY(0.0f);
                    totalScrollRange -= measuredHeight;
                }
                int i7 = Integer.MIN_VALUE;
                if (i5 == -1) {
                    i7 = 1073741824;
                }
                coordinatorLayout.A0G(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i7));
                return true;
            }
        }
        return false;
    }

    public void A0R(View view, CoordinatorLayout coordinatorLayout, int i) {
        int i2;
        List A0C = coordinatorLayout.A0C(view);
        int size = A0C.size();
        int i3 = 0;
        while (true) {
            int i4 = i;
            if (i3 >= size) {
                break;
            }
            View view2 = (View) A0C.get(i3);
            if (!(view2 instanceof AppBarLayout)) {
                i3++;
            } else if (view2 != null) {
                C02460Ak r3 = (C02460Ak) view.getLayoutParams();
                Rect rect = this.A02;
                rect.set(coordinatorLayout.getPaddingLeft() + r3.leftMargin, view2.getBottom() + r3.topMargin, AnonymousClass000.A0B(coordinatorLayout) - r3.rightMargin, ((coordinatorLayout.getHeight() + view2.getBottom()) - coordinatorLayout.getPaddingBottom()) - r3.bottomMargin);
                AnonymousClass09H r2 = coordinatorLayout.A02;
                if (r2 != null && C011504z.A09(coordinatorLayout) && !C011504z.A09(view)) {
                    rect.left += r2.A03();
                    rect.right -= r2.A04();
                }
                Rect rect2 = this.A03;
                int i5 = r3.A03;
                if (i5 == 0) {
                    i5 = 8388659;
                }
                C03050Cz.A00(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i4);
                int A0S = A0S(view2);
                view.layout(rect2.left, rect2.top - A0S, rect2.right, rect2.bottom - A0S);
                i2 = rect2.top - view2.getBottom();
            }
        }
        coordinatorLayout.A0F(view, i);
        i2 = 0;
        this.A01 = i2;
    }

    public AnonymousClass0NA() {
    }
}
