package X;

import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.jid.UserJid;

public final class A9Q implements AnonymousClass4PG {
    public final /* synthetic */ CatalogSearchProductListFragment A00;

    public void Bdb(C207269up r8, int i) {
        AnonymousClass00C.A0D(r8, 0);
        CatalogSearchProductListFragment catalogSearchProductListFragment = this.A00;
        UserJid A1a = catalogSearchProductListFragment.A1a();
        String str = r8.A0F;
        AnonymousClass00C.A0D(str, 2);
        C197189bH.A00(((CatalogSearchViewModel) catalogSearchProductListFragment.A04.getValue()).A02, A1a, (Integer) null, Integer.valueOf(i), str, 3);
    }

    public A9Q(CatalogSearchProductListFragment catalogSearchProductListFragment) {
        this.A00 = catalogSearchProductListFragment;
    }
}
