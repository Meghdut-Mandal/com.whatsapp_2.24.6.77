package X;

import android.view.View;
import android.widget.ExpandableListView;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9vM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207529vM implements ExpandableListView.OnChildClickListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public /* synthetic */ C207529vM(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }

    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        AnonymousClass8X6 r3;
        C174408Wt r1;
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A00.A08.getValue();
        Object A04 = catalogCategoryGroupsViewModel.A00.A04();
        if (!(A04 instanceof AnonymousClass8X6) || (r3 = (AnonymousClass8X6) A04) == null) {
            return true;
        }
        Object obj = r3.A00.get(i);
        if (!(obj instanceof C174408Wt) || (r1 = (C174408Wt) obj) == null) {
            return true;
        }
        Object A002 = C000200c.A00(r1.A00.A01, r3.A01);
        AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.catalogcategory.view.adapter.CatalogCategoryListItem.ExpandableCategoryChildItem>");
        C174398Ws r12 = (C174398Ws) ((List) A002).get(i2);
        C128506Cn r0 = r12.A00;
        UserJid userJid = r12.A01;
        catalogCategoryGroupsViewModel.A04.A01(userJid, r0.A01, 3, 3, i2, r0.A04);
        CatalogCategoryGroupsViewModel.A01(r0, catalogCategoryGroupsViewModel, userJid, 3);
        return true;
    }
}
