package X;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6Lz  reason: invalid class name and case insensitive filesystem */
public class C130676Lz {
    public static RectF A00(View view, TabLayout tabLayout) {
        float left;
        float top;
        float right;
        float bottom;
        if (view == null) {
            return C36441kJ.A0N();
        }
        if (tabLayout.A0O || !(view instanceof C93024fQ)) {
            left = (float) view.getLeft();
            top = (float) view.getTop();
            right = (float) view.getRight();
            bottom = (float) view.getBottom();
        } else {
            C93024fQ r5 = (C93024fQ) view;
            int contentWidth = r5.getContentWidth();
            int contentHeight = r5.getContentHeight();
            int A00 = (int) AnonymousClass062.A00(r5.getContext(), 24);
            if (contentWidth < A00) {
                contentWidth = A00;
            }
            int left2 = (r5.getLeft() + r5.getRight()) / 2;
            int top2 = (r5.getTop() + r5.getBottom()) / 2;
            int i = contentWidth / 2;
            int i2 = left2 - i;
            int i3 = i + left2;
            left = (float) i2;
            top = (float) (top2 - (contentHeight / 2));
            right = (float) i3;
            bottom = (float) (top2 + (left2 / 2));
        }
        return new RectF(left, top, right, bottom);
    }
}
