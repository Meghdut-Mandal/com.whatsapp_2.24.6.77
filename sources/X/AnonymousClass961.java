package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.961  reason: invalid class name */
public class AnonymousClass961 implements C23020B0q {
    public Object A00;
    public final int A01;

    public AnonymousClass961(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BVk(C207109uZ r8) {
        AnonymousClass09Y A0O;
        int i;
        CatalogSearchFragment catalogSearchFragment;
        String str;
        int i2;
        if (this.A01 != 0) {
            ((C22911AyN) this.A00).BfK(true);
            return;
        }
        C193059Jr r1 = (C193059Jr) this.A00;
        AnonymousClass9RM r0 = r1.A00;
        C22918AyU ayU = r1.A01;
        UserJid userJid = r1.A02;
        if (r0.A01.A01(r8)) {
            B93 b93 = (B93) ayU;
            int i3 = b93.A01;
            Object obj = b93.A00;
            switch (i3) {
                case 0:
                    CatalogCategoryTabsActivity catalogCategoryTabsActivity = (CatalogCategoryTabsActivity) obj;
                    AnonymousClass00C.A0D(userJid, 1);
                    A0O = C36341k9.A0O(catalogCategoryTabsActivity);
                    i = R.id.catalog_search_host;
                    if (catalogCategoryTabsActivity.A02 != null) {
                        Bundle A07 = AnonymousClass001.A07();
                        A07.putParcelable("category_biz_id", userJid);
                        A07.putInt("search_entry_point", 1);
                        A07.putParcelable("business_profile", r8);
                        catalogSearchFragment = new CatalogSearchFragment();
                        catalogSearchFragment.A17(A07);
                        str = "CategoryTabsSearchFragmentTag";
                        break;
                    } else {
                        throw C36331k8.A0d("catalogSearchFragmentFactory");
                    }
                case 1:
                    A0O = C36341k9.A0O((AnonymousClass01I) obj);
                    i = R.id.catalog_search_host;
                    i2 = 0;
                    break;
                default:
                    A0O = C36341k9.A0O((AnonymousClass01I) obj);
                    i = R.id.catalog_search_host;
                    i2 = 2;
                    break;
            }
            AnonymousClass00C.A0D(userJid, 0);
            Bundle A072 = AnonymousClass001.A07();
            A072.putParcelable("category_biz_id", userJid);
            A072.putInt("search_entry_point", i2);
            A072.putParcelable("business_profile", r8);
            catalogSearchFragment = new CatalogSearchFragment();
            catalogSearchFragment.A17(A072);
            str = "CatalogSearchFragmentTag";
            A0O.A0F(catalogSearchFragment, str, i);
            A0O.A01();
        }
    }

    public void Bbk(C207109uZ r3) {
        if (this.A01 != 0) {
            ((C22911AyN) this.A00).BfK(false);
        }
    }
}
