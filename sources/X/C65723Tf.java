package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Tf  reason: invalid class name and case insensitive filesystem */
public abstract class C65723Tf {
    public static final int A00(View view, int i) {
        AnonymousClass00C.A0D(view, 0);
        return C14960mT.A00((((double) (i * C36441kJ.A0J(view).getDisplayMetrics().densityDpi)) * 1.0d) / ((double) 160));
    }

    public static final AnonymousClass3QI A01(View view) {
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        AnonymousClass00C.A0D(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i4 = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = AnonymousClass0YO.A01((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            i2 = 0;
        } else {
            i2 = marginLayoutParams2.topMargin;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            i3 = AnonymousClass0YO.A00((ViewGroup.MarginLayoutParams) layoutParams3);
        } else {
            i3 = 0;
        }
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            i4 = marginLayoutParams.bottomMargin;
        }
        return new AnonymousClass3QI(i, i2, i3, i4);
    }

    public static final void A03(View view, Object obj) {
        AnonymousClass00C.A0D(view, 0);
        view.setVisibility(C36411kG.A08(obj));
    }

    public static final void A04(AnonymousClass00S r2, View view) {
        AnonymousClass00C.A0D(view, 0);
        C90204Zm.A00(view.getViewTreeObserver(), r2, view, 11);
    }

    public static final void A02(View view, AnonymousClass3QI r6) {
        C36321k7.A0w(view, r6);
        ViewGroup.MarginLayoutParams A0N = C36411kG.A0N(view);
        A0N.setMargins(r6.A01, r6.A03, r6.A02, r6.A00);
        view.setLayoutParams(A0N);
    }
}
