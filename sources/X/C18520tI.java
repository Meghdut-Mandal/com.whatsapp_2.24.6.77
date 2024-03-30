package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0tI  reason: invalid class name and case insensitive filesystem */
public class C18520tI implements C010904r {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    public C18520tI(C018307u r2, AnonymousClass07w r3) {
        this.A01 = r2;
        this.A00 = r3;
    }

    public AnonymousClass09H BRE(View view, AnonymousClass09H r9) {
        if (this.A02 != 0) {
            ((C018307u) this.A01).BRF(view, r9, new AnonymousClass07w((AnonymousClass07w) this.A00));
        } else {
            r9 = C012005e.A0B(view, r9);
            if (!r9.A00.A0A()) {
                Rect rect = (Rect) this.A00;
                rect.left = r9.A03();
                rect.top = r9.A05();
                rect.right = r9.A04();
                rect.bottom = r9.A02();
                ViewGroup viewGroup = (ViewGroup) this.A01;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    AnonymousClass09H A0A = C012005e.A0A(viewGroup.getChildAt(i), r9);
                    rect.left = Math.min(A0A.A03(), rect.left);
                    rect.top = Math.min(A0A.A05(), rect.top);
                    rect.right = Math.min(A0A.A04(), rect.right);
                    rect.bottom = Math.min(A0A.A02(), rect.bottom);
                }
                return r9.A07(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
        return r9;
    }

    public C18520tI(ViewPager viewPager) {
        this.A01 = viewPager;
        this.A00 = AnonymousClass001.A06();
    }
}
