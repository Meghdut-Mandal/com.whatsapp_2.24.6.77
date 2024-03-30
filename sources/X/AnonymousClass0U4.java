package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0U4  reason: invalid class name */
public class AnonymousClass0U4 {
    public C02740Bs A00;
    public final C16710px A01 = new AnonymousClass0R4(this, 1);
    public final C16710px A02 = new AnonymousClass0R4(this, 0);
    public final /* synthetic */ ViewPager2 A03;
    public final /* synthetic */ ViewPager2 A04;

    public AnonymousClass0U4(ViewPager2 viewPager2) {
        this.A04 = viewPager2;
        this.A03 = viewPager2;
    }

    public void A00() {
        int A0J;
        ViewPager2 viewPager2 = this.A04;
        int i = 16908360;
        C012005e.A0N(viewPager2, 16908360);
        C012005e.A0R(viewPager2, 16908361);
        C012005e.A0O(viewPager2, 0);
        C012005e.A0R(viewPager2, 16908358);
        C012005e.A0O(viewPager2, 0);
        C012005e.A0R(viewPager2, 16908359);
        C012005e.A0O(viewPager2, 0);
        AnonymousClass0CZ r0 = viewPager2.A04.A0G;
        if (r0 != null && (A0J = r0.A0J()) != 0 && viewPager2.A09) {
            LinearLayoutManager linearLayoutManager = viewPager2.A02;
            if (linearLayoutManager.A00 == 0) {
                int i2 = 16908361;
                if (AnonymousClass04F.A01(linearLayoutManager.A07) == 1) {
                    i2 = 16908360;
                    i = 16908361;
                }
                if (viewPager2.A00 < A0J - 1) {
                    C012005e.A0Y(viewPager2, new AnonymousClass0Yd(i2, (CharSequence) null), this.A02, (CharSequence) null);
                }
                if (viewPager2.A00 > 0) {
                    C012005e.A0Y(viewPager2, new AnonymousClass0Yd(i, (CharSequence) null), this.A01, (CharSequence) null);
                    return;
                }
                return;
            }
            if (viewPager2.A00 < A0J - 1) {
                C012005e.A0Y(viewPager2, new AnonymousClass0Yd(16908359, (CharSequence) null), this.A02, (CharSequence) null);
            }
            if (viewPager2.A00 > 0) {
                C012005e.A0Y(viewPager2, new AnonymousClass0Yd(16908358, (CharSequence) null), this.A01, (CharSequence) null);
            }
        }
    }
}
