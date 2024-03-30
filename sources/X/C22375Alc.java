package X;

import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Alc  reason: case insensitive filesystem */
public final class C22375Alc extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22375Alc(CatalogSearchFragment catalogSearchFragment) {
        super(1);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CatalogSearchProductListFragment catalogSearchProductListFragment;
        AnonymousClass8VI r1;
        boolean z;
        AnonymousClass9HX r12;
        AnonymousClass00T r0;
        AnonymousClass9ET r7 = (AnonymousClass9ET) obj;
        AnonymousClass02E A0N = this.this$0.A0k().A0N("SEARCH_RESULT_LIST_FRAGMENT");
        if (A0N instanceof CatalogSearchProductListFragment) {
            catalogSearchProductListFragment = (CatalogSearchProductListFragment) A0N;
        } else {
            catalogSearchProductListFragment = null;
        }
        if ((r7 instanceof AnonymousClass8XQ) || (r7 instanceof AnonymousClass8XP)) {
            if (catalogSearchProductListFragment != null) {
                r1 = catalogSearchProductListFragment.A1Z();
                z = true;
            }
            return AnonymousClass0AJ.A00;
        }
        if (r7 instanceof AnonymousClass8XS) {
            if (catalogSearchProductListFragment != null) {
                catalogSearchProductListFragment.A1c();
            }
        } else if (!(r7 instanceof AnonymousClass8XR)) {
            if (!(r7 instanceof AnonymousClass8XT)) {
                if (r7 instanceof AnonymousClass8XN) {
                    CatalogSearchFragment catalogSearchFragment = this.this$0;
                    AnonymousClass96H r13 = ((AnonymousClass8XN) r7).A00;
                    if (r13 instanceof AnonymousClass8XL) {
                        r0 = catalogSearchFragment.A0O;
                    } else if (r13 instanceof AnonymousClass8XM) {
                        r0 = catalogSearchFragment.A0P;
                    }
                    AnonymousClass6YL r14 = (AnonymousClass6YL) r0.getValue();
                    if (!r14.A0W()) {
                        r14.A0P();
                    }
                } else if (r7 instanceof AnonymousClass8XO) {
                    CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.this$0.A0Q.getValue();
                    AnonymousClass96H r15 = ((AnonymousClass8XO) r7).A00;
                    if (r15 instanceof AnonymousClass8XL) {
                        r12 = AnonymousClass8XW.A00;
                    } else if (r15 instanceof AnonymousClass8XM) {
                        r12 = AnonymousClass8XX.A00;
                    }
                    CatalogSearchViewModel.A01(catalogSearchViewModel, new C174478Xa(r12));
                } else {
                    if (r7 instanceof AnonymousClass8XU) {
                        CatalogSearchViewModel.A01((CatalogSearchViewModel) this.this$0.A0Q.getValue(), new C174478Xa(AnonymousClass8XY.A00));
                    }
                    return AnonymousClass0AJ.A00;
                }
            }
            if (catalogSearchProductListFragment != null) {
                r1 = catalogSearchProductListFragment.A1Z();
                z = false;
            }
            return AnonymousClass0AJ.A00;
        }
        AnonymousClass00C.A0B(r7);
        List list = r7.A00;
        ArrayList<AnonymousClass8XH> A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            if (next instanceof AnonymousClass8XH) {
                A0I.add(next);
            }
        }
        ArrayList A0J = C36321k7.A0J(A0I);
        for (AnonymousClass8XH r02 : A0I) {
            A0J.add(r02.A00);
        }
        if (catalogSearchProductListFragment != null) {
            catalogSearchProductListFragment.A1Z().A0T(false);
            AnonymousClass1KK r4 = catalogSearchProductListFragment.A01;
            if (r4 != null) {
                r4.A0C(new BAK(A0J, catalogSearchProductListFragment, 6), catalogSearchProductListFragment.A1a());
            } else {
                throw C36331k8.A0d("businessProfileManager");
            }
        }
        return AnonymousClass0AJ.A00;
        r1.A0T(z);
        return AnonymousClass0AJ.A00;
    }
}
