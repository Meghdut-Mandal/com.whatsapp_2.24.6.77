package X;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: X.0mi  reason: invalid class name and case insensitive filesystem */
public class C15110mi implements C16710px {
    public int A00;
    public Object A01;
    public final int A02;

    public C15110mi(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public boolean BlR(View view, AnonymousClass0SM r7) {
        if (this.A02 != 0) {
            SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.A01;
            int i = this.A00;
            WeakReference weakReference = sideSheetBehavior.A0D;
            if (weakReference == null || weakReference.get() == null) {
                sideSheetBehavior.A0R(i);
                return true;
            }
            View A0Y = AnonymousClass000.A0Y(weakReference);
            C11600gh r1 = new C11600gh(sideSheetBehavior, i);
            ViewParent parent = A0Y.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C011304x.A02(A0Y)) {
                r1.run();
                return true;
            }
            A0Y.post(r1);
            return true;
        }
        ((BottomSheetBehavior) this.A01).A0W(this.A00);
        return true;
    }
}
