package X;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.0sg  reason: invalid class name and case insensitive filesystem */
public class C18140sg extends C09770cu {
    public Object A00;
    public final int A01;

    public C18140sg(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BR7(View view) {
        View view2;
        switch (this.A01) {
            case 0:
                AnonymousClass02U r2 = (AnonymousClass02U) this.A00;
                r2.A0J.setAlpha(1.0f);
                r2.A0L.A09((C17190qs) null);
                r2.A0L = null;
                return;
            case 1:
                AnonymousClass07D r3 = (AnonymousClass07D) this.A00;
                if (r3.A0C && (view2 = r3.A05) != null) {
                    view2.setTranslationY(0.0f);
                    r3.A09.setTranslationY(0.0f);
                }
                r3.A09.setVisibility(8);
                r3.A09.setTransitioning(false);
                r3.A08 = null;
                C021809f r1 = r3.A06;
                if (r1 != null) {
                    r1.BVS(r3.A07);
                    r3.A07 = null;
                    r3.A06 = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = r3.A0A;
                if (actionBarOverlayLayout != null) {
                    AnonymousClass09G.A00(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                AnonymousClass07D r12 = (AnonymousClass07D) this.A00;
                r12.A08 = null;
                r12.A09.requestLayout();
                return;
        }
    }

    public void BR9(View view) {
        if (this.A01 == 0) {
            AnonymousClass02U r2 = (AnonymousClass02U) this.A00;
            r2.A0J.setVisibility(0);
            r2.A0J.sendAccessibilityEvent(32);
            if (r2.A0J.getParent() instanceof View) {
                AnonymousClass09G.A00((View) r2.A0J.getParent());
            }
        }
    }
}
