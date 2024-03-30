package X;

import android.view.View;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.1z8  reason: invalid class name and case insensitive filesystem */
public abstract class C42631z8 extends AnonymousClass0D3 {
    public abstract C34841hj A0B();

    public abstract SelectionCheckView A0C();

    public final void A0D(boolean z, boolean z2, boolean z3) {
        if (A0C().A0D != z) {
            View view = this.A0H;
            if (z) {
                view.setBackgroundResource(C36391kE.A08(view));
            } else if (z3) {
                C34081gQ.A03(view);
            } else {
                C34081gQ.A02(view);
            }
            view.setSelected(z);
            A0C().A04(z, z2);
        }
    }

    public C42631z8(View view) {
        super(view);
    }
}
