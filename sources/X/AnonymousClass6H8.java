package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.whatsapp.R;

/* renamed from: X.6H8  reason: invalid class name */
public abstract class AnonymousClass6H8 {
    public static final void A00(View view, C18820ts r5) {
        int i;
        boolean A1a = C36341k9.A1a(r5, view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (C36351kA.A1Y(r5)) {
            layoutParams2.addRule(0, 0);
            i = 11;
        } else {
            layoutParams2.addRule(A1a ? 1 : 0, 0);
            i = 9;
        }
        layoutParams2.addRule(i);
    }

    public static final void A01(View view, C18820ts r5) {
        boolean A1a = C36341k9.A1a(r5, view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (C36351kA.A1Y(r5)) {
            layoutParams2.addRule(11, 0);
            layoutParams2.addRule(0, R.id.send);
            return;
        }
        layoutParams2.addRule(9, 0);
        layoutParams2.addRule(A1a ? 1 : 0, R.id.send);
    }
}
