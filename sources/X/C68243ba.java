package X;

import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.3ba  reason: invalid class name and case insensitive filesystem */
public class C68243ba implements AnonymousClass02G {
    public final /* synthetic */ PagerSlidingTabStrip A00;

    public C68243ba(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.A00 = pagerSlidingTabStrip;
    }

    public void BcA(int i) {
        if (i == 0) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
            PagerSlidingTabStrip.A01(pagerSlidingTabStrip, pagerSlidingTabStrip.A04.getCurrentItem(), 0);
        }
        AnonymousClass02G r0 = this.A00.A03;
        if (r0 != null) {
            r0.BcA(i);
        }
    }

    public void BcB(int i, float f, int i2) {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
        pagerSlidingTabStrip.A01 = i;
        pagerSlidingTabStrip.A00 = f;
        PagerSlidingTabStrip.A01(pagerSlidingTabStrip, i, (int) (C36441kJ.A01(pagerSlidingTabStrip.A02.getChildAt(i)) * f));
        pagerSlidingTabStrip.invalidate();
        AnonymousClass02G r0 = pagerSlidingTabStrip.A03;
        if (r0 != null) {
            r0.BcB(i, f, i2);
        }
    }

    public void BcC(int i) {
        AnonymousClass02G r0 = this.A00.A03;
        if (r0 != null) {
            r0.BcC(i);
        }
    }
}
