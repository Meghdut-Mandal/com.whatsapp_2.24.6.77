package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0sp  reason: invalid class name and case insensitive filesystem */
public class C18230sp extends C03900Ii {
    public Object A00;
    public final int A01;

    public C18230sp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01() {
        if (this.A01 != 0) {
            ((AnonymousClass0U4) this.A00).A00();
            return;
        }
        ViewPager2 viewPager2 = (ViewPager2) this.A00;
        viewPager2.A08 = true;
        viewPager2.A06.A06 = true;
    }
}
