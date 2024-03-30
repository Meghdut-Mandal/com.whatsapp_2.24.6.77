package X;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* renamed from: X.0R4  reason: invalid class name */
public class AnonymousClass0R4 implements C16710px {
    public Object A00;
    public final int A01;

    public AnonymousClass0R4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean BlR(View view, AnonymousClass0SM r7) {
        int i;
        AnonymousClass0U4 r1;
        switch (this.A01) {
            case 0:
                r1 = (AnonymousClass0U4) this.A00;
                i = ((ViewPager2) view).A00 + 1;
                break;
            case 1:
                r1 = (AnonymousClass0U4) this.A00;
                i = ((ViewPager2) view).A00 - 1;
                break;
            case 2:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.A00;
                boolean z = false;
                if (!swipeDismissBehavior.A0R(view)) {
                    return false;
                }
                boolean A1S = AnonymousClass000.A1S(AnonymousClass04F.A01(view), 1);
                int i2 = swipeDismissBehavior.A02;
                if (i2 != 0 ? !(i2 != 1 || A1S) : A1S) {
                    z = true;
                }
                int width = view.getWidth();
                if (z) {
                    width = -width;
                }
                C012005e.A0P(view, width);
                view.setAlpha(0.0f);
                C17120ql r0 = swipeDismissBehavior.A04;
                if (r0 == null) {
                    return true;
                }
                r0.BVs(view);
                return true;
            default:
                return BottomSheetDragHandleView.A02((BottomSheetDragHandleView) this.A00);
        }
        ViewPager2 viewPager2 = r1.A04;
        if (!viewPager2.A09) {
            return true;
        }
        viewPager2.A03(i);
        return true;
    }
}
