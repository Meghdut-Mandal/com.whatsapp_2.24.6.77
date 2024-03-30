package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.2tg  reason: invalid class name and case insensitive filesystem */
public abstract class C54862tg {
    public static final RectF A00(View view) {
        View view2;
        Rect A06 = AnonymousClass001.A06();
        view.getHitRect(A06);
        A06.offset(-A06.left, -A06.top);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        Rect A062 = AnonymousClass001.A06();
        while (true) {
            View view3 = view;
            view = view2;
            if (view2 == null) {
                break;
            }
            view3.getHitRect(A062);
            A06.offset(A062.left, A062.top);
            ViewParent parent2 = view2.getParent();
            if (!(parent2 instanceof View)) {
                break;
            }
            view2 = (View) parent2;
        }
        return new RectF(A06);
    }
}
