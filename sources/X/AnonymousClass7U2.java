package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7U2  reason: invalid class name */
public final class AnonymousClass7U2 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $selectedCategoryId;
    public final /* synthetic */ CatalogCategoryTabsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U2(CatalogCategoryTabsActivity catalogCategoryTabsActivity, String str) {
        super(1);
        this.this$0 = catalogCategoryTabsActivity;
        this.$selectedCategoryId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass01z supportFragmentManager = this.this$0.getSupportFragmentManager();
        AnonymousClass00C.A08(supportFragmentManager);
        C95304kX r4 = new C95304kX(supportFragmentManager);
        C36361kB.A1I(list);
        r4.A00 = list;
        CatalogCategoryTabsActivity catalogCategoryTabsActivity = this.this$0;
        View A0B = C03570Gk.A0B(catalogCategoryTabsActivity, R.id.view_pager);
        AnonymousClass00C.A08(A0B);
        CatalogCategoryTabsActivity catalogCategoryTabsActivity2 = this.this$0;
        String str = this.$selectedCategoryId;
        ViewPager viewPager = (ViewPager) A0B;
        catalogCategoryTabsActivity2.A04.getValue();
        int A01 = CatalogCategoryTabsViewModel.A01(str, list);
        viewPager.setAdapter(r4);
        viewPager.setCurrentItem(A01);
        catalogCategoryTabsActivity.A00 = viewPager;
        View A0B2 = C03570Gk.A0B(this.this$0, R.id.tabs);
        CatalogCategoryTabsActivity catalogCategoryTabsActivity3 = this.this$0;
        TabLayout tabLayout = (TabLayout) A0B2;
        ViewPager viewPager2 = catalogCategoryTabsActivity3.A00;
        if (viewPager2 == null) {
            throw C36331k8.A0d("viewPager");
        }
        tabLayout.setupWithViewPager(viewPager2);
        C90474aD.A1H(new C141656nb(tabLayout, catalogCategoryTabsActivity3, list), tabLayout.A0g);
        Iterator it = C15040mb.A05(0, tabLayout.A0h.size()).iterator();
        while (it.hasNext()) {
            int A00 = ((C12260hl) it).A00();
            View childAt = tabLayout.getChildAt(0);
            AnonymousClass00C.A0E(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt2 = ((ViewGroup) childAt).getChildAt(A00);
            ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(childAt2);
            int dimensionPixelSize = C36341k9.A0F(tabLayout).getDimensionPixelSize(R.dimen.f7nameremoved);
            int dimensionPixelSize2 = C36341k9.A0F(tabLayout).getDimensionPixelSize(R.dimen.f7nameremoved);
            if (A00 == 0) {
                int dimensionPixelSize3 = C36341k9.A0F(tabLayout).getDimensionPixelSize(R.dimen.f7nameremoved);
                if (C36401kF.A1X(catalogCategoryTabsActivity3.A00)) {
                    A0K.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2);
                } else {
                    A0K.setMargins(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                }
            } else {
                A0K.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            }
            childAt2.requestLayout();
        }
        return AnonymousClass0AJ.A00;
    }
}
