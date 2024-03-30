package X;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.6nb  reason: invalid class name and case insensitive filesystem */
public final class C141656nb implements C159127ir {
    public final /* synthetic */ TabLayout A00;
    public final /* synthetic */ CatalogCategoryTabsActivity A01;
    public final /* synthetic */ List A02;

    public void Biu(AnonymousClass6DR r1) {
    }

    public C141656nb(TabLayout tabLayout, CatalogCategoryTabsActivity catalogCategoryTabsActivity, List list) {
        this.A02 = list;
        this.A00 = tabLayout;
        this.A01 = catalogCategoryTabsActivity;
    }

    public void Biv(AnonymousClass6DR r8) {
        List list = this.A02;
        TabLayout tabLayout = this.A00;
        CatalogCategoryTabsActivity catalogCategoryTabsActivity = this.A01;
        AnonymousClass6CI r3 = (AnonymousClass6CI) list.get(tabLayout.getSelectedTabPosition());
        ViewPager viewPager = catalogCategoryTabsActivity.A00;
        if (viewPager == null) {
            throw C36331k8.A0d("viewPager");
        }
        viewPager.A0J(tabLayout.getSelectedTabPosition(), false);
        String str = r3.A01;
        UserJid userJid = r3.A00;
        boolean z = r3.A03;
        ((CatalogCategoryTabsViewModel) catalogCategoryTabsActivity.A04.getValue()).A01.A01(userJid, str, 1, 3, tabLayout.getSelectedTabPosition(), z);
    }
}
