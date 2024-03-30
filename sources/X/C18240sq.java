package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0sq  reason: invalid class name and case insensitive filesystem */
public class C18240sq extends C06560Ub {
    public Object A00;
    public final int A01;

    public C18240sq(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(int i) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass0U6) this.A00).A00(false);
                return;
            case 1:
                if (i == 0) {
                    ((ViewPager2) this.A00).A02();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A01(int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                ((AnonymousClass0U6) obj).A00(false);
                return;
            case 1:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                if (viewPager2.A00 != i) {
                    viewPager2.A00 = i;
                    viewPager2.A07.A00();
                    return;
                }
                return;
            default:
                ViewPager2 viewPager22 = (ViewPager2) obj;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.A04.requestFocus(2);
                    return;
                }
                return;
        }
    }
}
