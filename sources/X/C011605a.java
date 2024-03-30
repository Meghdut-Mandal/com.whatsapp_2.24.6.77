package X;

import androidx.viewpager.widget.ViewPager;

/* renamed from: X.05a  reason: invalid class name and case insensitive filesystem */
public class C011605a implements Runnable {
    public final /* synthetic */ ViewPager A00;

    public C011605a(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public void run() {
        ViewPager viewPager = this.A00;
        viewPager.setScrollState(0);
        viewPager.A0G(viewPager.A02);
    }
}
