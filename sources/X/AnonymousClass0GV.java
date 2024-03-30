package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.0GV  reason: invalid class name */
public abstract class AnonymousClass0GV extends AnonymousClass0XL {
    public int A00 = 0;
    public C06540Tz A01;

    public AnonymousClass0GV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i) {
        A0R(view, coordinatorLayout, i);
        C06540Tz r2 = this.A01;
        if (r2 == null) {
            r2 = new C06540Tz(view);
            this.A01 = r2;
        }
        View view2 = r2.A03;
        r2.A01 = view2.getTop();
        r2.A00 = view2.getLeft();
        this.A01.A00();
        int i2 = this.A00;
        if (i2 == 0) {
            return true;
        }
        C06540Tz r1 = this.A01;
        if (r1.A02 != i2) {
            r1.A02 = i2;
            r1.A00();
        }
        this.A00 = 0;
        return true;
    }

    public void A0R(View view, CoordinatorLayout coordinatorLayout, int i) {
        coordinatorLayout.A0F(view, i);
    }

    public AnonymousClass0GV() {
    }
}
