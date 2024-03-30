package X;

import android.os.Build;
import android.view.View;
import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.1rW  reason: invalid class name and case insensitive filesystem */
public class C39211rW extends C011705b {
    public final /* synthetic */ PagerSlidingTabStrip A00;

    public C39211rW(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.A00 = pagerSlidingTabStrip;
    }

    public void A0k(View view, C07650Ys r4) {
        super.A0k(view, r4);
        if (view.isSelected()) {
            r4.A0B(AnonymousClass0Yd.A08);
            r4.A0L(false);
        }
        if (Build.VERSION.SDK_INT >= 22) {
            view.setAccessibilityTraversalBefore(this.A00.A04.getId());
        }
    }
}
