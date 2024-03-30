package X;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.67u  reason: invalid class name and case insensitive filesystem */
public final class C1273167u {
    public AnonymousClass0CZ A00;
    public C02740Bs A01;
    public C17690rq A02;
    public C97314oo A03;
    public boolean A04;
    public final ViewPager2 A05;
    public final TabLayout A06;
    public final C16950qT A07;

    public void A00() {
        int min;
        TabLayout tabLayout = this.A06;
        tabLayout.A0B();
        AnonymousClass0CZ r0 = this.A00;
        if (r0 != null) {
            int A0J = r0.A0J();
            for (int i = 0; i < A0J; i++) {
                AnonymousClass6DR A08 = tabLayout.A08();
                this.A07.BUB(A08, i);
                tabLayout.A0I(A08, tabLayout.A0h.size(), false);
            }
            if (A0J > 0 && (min = Math.min(this.A05.A00, C90504aG.A0C(tabLayout.A0h))) != tabLayout.getSelectedTabPosition()) {
                tabLayout.A0J(tabLayout.A09(min), true);
            }
        }
    }

    public void A01() {
        if (!this.A04) {
            ViewPager2 viewPager2 = this.A05;
            AnonymousClass0CZ r0 = viewPager2.A04.A0G;
            this.A00 = r0;
            if (r0 != null) {
                this.A04 = true;
                TabLayout tabLayout = this.A06;
                C97314oo r1 = new C97314oo(tabLayout);
                this.A03 = r1;
                viewPager2.A05.A00.add(r1);
                C141676nd r02 = new C141676nd(viewPager2);
                this.A02 = r02;
                tabLayout.A0G(r02);
                C96204mx r12 = new C96204mx(this);
                this.A01 = r12;
                this.A00.BnA(r12);
                A00();
                tabLayout.A0C(0.0f, viewPager2.A00, true, true);
                return;
            }
            throw AnonymousClass001.A09("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw AnonymousClass001.A09("TabLayoutMediator is already attached");
    }

    public C1273167u(ViewPager2 viewPager2, TabLayout tabLayout, C16950qT r3) {
        this.A06 = tabLayout;
        this.A05 = viewPager2;
        this.A07 = r3;
    }
}
