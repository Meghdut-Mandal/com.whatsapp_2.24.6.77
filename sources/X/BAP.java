package X;

import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;

public class BAP implements AnonymousClass16A {
    public Object A00;
    public final int A01;

    public BAP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSP(UserJid userJid) {
        switch (this.A01) {
            case 0:
                if (userJid != null) {
                    BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = (BusinessProfileExtraFieldsActivity) this.A00;
                    if (userJid.equals(businessProfileExtraFieldsActivity.A0B)) {
                        BAG.A00(businessProfileExtraFieldsActivity.A01, businessProfileExtraFieldsActivity.A0B, businessProfileExtraFieldsActivity, 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C167497y9 r1 = (C167497y9) this.A00;
                if (r1.A03.equals(userJid)) {
                    r1.A0T();
                    return;
                }
                return;
            case 2:
                CatalogListActivity catalogListActivity = (CatalogListActivity) this.A00;
                if (catalogListActivity.A0L.equals(userJid) && !catalogListActivity.A02.A0M(catalogListActivity.A0L)) {
                    CatalogListActivity.A01(catalogListActivity);
                    return;
                }
                return;
            case 3:
                AnonymousClass8W7.A0I(this.A00, userJid);
                return;
            case 4:
                AnonymousClass8WH r12 = (AnonymousClass8WH) this.A00;
                if (r12.A0q.equals(userJid)) {
                    C21104A8p a8p = r12.A0h.A0G;
                    AVW.A00(a8p.A04, a8p, 21);
                    return;
                }
                return;
            default:
                CatalogSearchFragment catalogSearchFragment = (CatalogSearchFragment) this.A00;
                if (AnonymousClass00C.A0J(userJid, catalogSearchFragment.A0M.getValue())) {
                    AnonymousClass1KK r13 = catalogSearchFragment.A08;
                    if (r13 != null) {
                        BAG.A00(r13, userJid, catalogSearchFragment, 7);
                        return;
                    }
                    throw C36331k8.A0d("businessProfileManager");
                }
                return;
        }
    }

    public /* synthetic */ void BSM(UserJid userJid) {
    }
}
