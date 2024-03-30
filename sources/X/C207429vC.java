package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* renamed from: X.9vC  reason: invalid class name and case insensitive filesystem */
public class C207429vC implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C197989ci A00;

    public C207429vC(C197989ci r1) {
        this.A00 = r1;
    }

    public boolean onPreDraw() {
        int i;
        C197989ci r4 = this.A00;
        AnonymousClass80Q r3 = r4.A04;
        View view = r3.A05;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        r4.A00 = view.getMeasuredHeight();
        int A002 = C197989ci.A00((View) r3.A07.getParent());
        r4.A01 = A002;
        ViewGroup viewGroup = r3.A06;
        int A003 = A002 + C197989ci.A00(viewGroup.getChildAt(0));
        r4.A01 = A003;
        int i2 = 0;
        if (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            i2 = 0 + AnonymousClass000.A0a(viewGroup).topMargin + AnonymousClass000.A0a(viewGroup).bottomMargin;
        }
        if (viewGroup.getParent() instanceof View) {
            ViewParent parent = viewGroup.getParent();
            do {
                View view2 = (View) parent;
                if (view2 == view) {
                    break;
                }
                i = i + view2.getPaddingTop() + view2.getPaddingTop();
                if (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    i = i + AnonymousClass000.A0a(view2).topMargin + AnonymousClass000.A0a(view2).bottomMargin;
                }
                parent = view2.getParent();
            } while (parent instanceof View);
            i = i + view.getPaddingTop() + view.getPaddingTop();
        }
        r4.A01 = A003 + i;
        r3.requestLayout();
        return false;
    }
}
