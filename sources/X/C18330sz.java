package X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.0sz  reason: invalid class name and case insensitive filesystem */
public class C18330sz implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C18330sz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        C018707z r0;
        if (this.A01 != 0) {
            C018707z r3 = ((AnonymousClass081) view).A05;
            C016807f r02 = (C016807f) this.A00;
            if (!r02.A0G.A0K(r3, r02.A0H, 0)) {
                r3.setChecked(true);
                return;
            }
            return;
        }
        C09430cM r03 = ((Toolbar) this.A00).A0B;
        if (r03 != null && (r0 = r03.A01) != null) {
            r0.collapseActionView();
        }
    }
}
