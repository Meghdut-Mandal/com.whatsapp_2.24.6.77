package X;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;

/* renamed from: X.2hJ  reason: invalid class name and case insensitive filesystem */
public final class C48432hJ extends C42581z3 {
    public C48262gy A00;
    public final ViewPager2 A01;
    public final TabLayout A02;
    public final C42851zb A03;
    public final C022809p A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48432hJ(View view, C42851zb r6, C022809p r7) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A03 = r6;
        this.A04 = r7;
        View findViewById = view.findViewById(R.id.status_pager);
        ViewPager2 viewPager2 = (ViewPager2) findViewById;
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setAdapter(r6);
        AnonymousClass00C.A08(findViewById);
        this.A01 = viewPager2;
        TabLayout tabLayout = (TabLayout) C36361kB.A0F(view, R.id.status_pager_indicator);
        this.A02 = tabLayout;
        new C1273167u(viewPager2, tabLayout, C68413br.A00).A01();
    }
}
