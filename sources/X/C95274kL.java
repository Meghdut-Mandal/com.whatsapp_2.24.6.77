package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4kL  reason: invalid class name and case insensitive filesystem */
public class C95274kL extends AnonymousClass0V6 {
    public int A00 = -1;
    public int A01;
    public final ViewGroup A02;
    public final List A03 = AnonymousClass001.A0I();
    public final /* synthetic */ VerticalSwipeDismissBehavior A04;

    public void A06(View view, float f, float f2) {
        int i;
        boolean z;
        C160647lM r0;
        this.A00 = -1;
        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = this.A04;
        int i2 = this.A01;
        if (Math.abs(f2) > ((float) (view.getHeight() * 2)) || Math.abs(view.getTop() - i2) >= C90514aH.A06(C36441kJ.A02(view), 0.2f)) {
            int top = view.getTop();
            int i3 = this.A01;
            int height = view.getHeight();
            if (top < i3) {
                i = i3 - height;
            } else {
                i = i3 + height;
            }
            z = true;
        } else {
            i = this.A01;
            z = false;
        }
        if (!verticalSwipeDismissBehavior.A06) {
            if (!verticalSwipeDismissBehavior.A04.A0E(view.getLeft(), i)) {
                if (!z || (r0 = verticalSwipeDismissBehavior.A05) == null) {
                    return;
                }
            }
            C011504z.A07(view, new AnonymousClass752(verticalSwipeDismissBehavior, view, 23, z));
            return;
        } else if (!z || (r0 = verticalSwipeDismissBehavior.A05) == null) {
            if (!verticalSwipeDismissBehavior.A04.A0E(view.getLeft(), i)) {
                return;
            }
            C011504z.A07(view, new AnonymousClass752(verticalSwipeDismissBehavior, view, 23, z));
            return;
        }
        r0.BVs(view);
    }

    public C95274kL(ViewGroup viewGroup, VerticalSwipeDismissBehavior verticalSwipeDismissBehavior) {
        this.A04 = verticalSwipeDismissBehavior;
        this.A02 = viewGroup;
    }

    public int A00(int i) {
        ViewGroup viewGroup = this.A02;
        int childCount = viewGroup.getChildCount();
        List list = this.A03;
        if (list.size() != childCount) {
            list.clear();
            ArrayList A14 = C36441kJ.A14(childCount);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (this.A04.A05.BLc(viewGroup.getChildAt(i2))) {
                    AnonymousClass000.A1F(A14, i2);
                } else {
                    C90504aG.A10(i2, list);
                }
            }
            list.addAll(A14);
        }
        return C36351kA.A06(list, i);
    }

    public int A04(View view, int i, int i2) {
        int width = this.A01 - view.getWidth();
        return Math.min(Math.max(width, i), this.A01 + view.getWidth());
    }

    public void A05(int i) {
        C160647lM r0 = this.A04.A05;
        if (r0 != null) {
            r0.BWD(i);
        }
    }

    public void A07(View view, int i) {
        if (this.A00 == -1) {
            this.A00 = i;
            this.A01 = view.getTop();
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (parent instanceof CoordinatorLayout) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    if (((C02460Ak) viewGroup.getChildAt(i2).getLayoutParams()).A0B != this.A04) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void A08(View view, int i, int i2, int i3, int i4) {
        C160647lM r3 = this.A04.A05;
        if (r3 != null) {
            r3.Bgp(view, C90524aI.A00(((float) Math.abs(i2)) * 1.0f, C36441kJ.A02(view), 1.0f));
        }
    }

    public boolean A09(View view, int i) {
        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = this.A04;
        if (verticalSwipeDismissBehavior.A08 || !verticalSwipeDismissBehavior.A05.BLc(view)) {
            return false;
        }
        return true;
    }

    public int A02(View view) {
        return view.getHeight();
    }

    public int A03(View view, int i, int i2) {
        return view.getLeft();
    }
}
