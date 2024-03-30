package X;

import android.view.View;
import android.widget.ExpandableListView;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9vN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207539vN implements ExpandableListView.OnGroupClickListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public /* synthetic */ C207539vN(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }

    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        C174398Ws r2;
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = this.A00;
        C166367vc r0 = catalogCategoryExpandableGroupsListFragment.A04;
        if (r0 == null) {
            throw C36331k8.A0d("expandableListAdapter");
        }
        int i2 = i;
        if (r0.getGroupType(i2) == 3) {
            CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) catalogCategoryExpandableGroupsListFragment.A08.getValue();
            AnonymousClass9EQ r02 = (AnonymousClass9EQ) catalogCategoryGroupsViewModel.A00.A04();
            if (r02 != null) {
                Object obj = r02.A00.get(i2);
                if ((obj instanceof C174398Ws) && (r2 = (C174398Ws) obj) != null) {
                    C128506Cn r03 = r2.A00;
                    UserJid userJid = r2.A01;
                    catalogCategoryGroupsViewModel.A04.A01(userJid, r03.A01, 2, 3, i2, r03.A04);
                    CatalogCategoryGroupsViewModel.A01(r03, catalogCategoryGroupsViewModel, userJid, 2);
                }
            }
            return true;
        }
        int i3 = catalogCategoryExpandableGroupsListFragment.A00;
        if (i3 != i2) {
            if (i3 != -1) {
                ExpandableListView expandableListView2 = catalogCategoryExpandableGroupsListFragment.A01;
                if (expandableListView2 == null) {
                    throw C36331k8.A0d("expandableListView");
                }
                expandableListView2.collapseGroup(i3);
            }
            AnonymousClass00T r22 = catalogCategoryExpandableGroupsListFragment.A08;
            if (C36371kC.A1X(((CatalogCategoryGroupsViewModel) r22.getValue()).A02.A04(), true)) {
                C39001qm A04 = AnonymousClass3LW.A04(catalogCategoryExpandableGroupsListFragment);
                A04.A0c(R.string.f12nameremoved);
                A04.A0m(catalogCategoryExpandableGroupsListFragment.A0m(), new BA7(catalogCategoryExpandableGroupsListFragment, 37), R.string.f12nameremoved);
                A04.A0b();
                return true;
            }
            CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel2 = (CatalogCategoryGroupsViewModel) r22.getValue();
            C001600r r23 = catalogCategoryGroupsViewModel2.A00;
            if (r23.A04() instanceof AnonymousClass8X6) {
                Object A042 = r23.A04();
                AnonymousClass00C.A0E(A042, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupListState.CategoryGroupsWithChildItems");
                Object obj2 = ((AnonymousClass8X6) A042).A00.get(i2);
                AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.CatalogCategoryListItem.ExpandableCategoryParentItem");
                C174408Wt r24 = (C174408Wt) obj2;
                C128506Cn r04 = r24.A00;
                catalogCategoryGroupsViewModel2.A04.A01(r24.A01, r04.A01, 2, 3, i2, r04.A04);
            }
            ExpandableListView expandableListView3 = catalogCategoryExpandableGroupsListFragment.A01;
            if (expandableListView3 == null) {
                throw C36331k8.A0d("expandableListView");
            }
            expandableListView3.smoothScrollToPosition(i2);
            ExpandableListView expandableListView4 = catalogCategoryExpandableGroupsListFragment.A01;
            if (expandableListView4 == null) {
                throw C36331k8.A0d("expandableListView");
            }
            expandableListView4.expandGroup(i2);
            return true;
        }
        ExpandableListView expandableListView5 = catalogCategoryExpandableGroupsListFragment.A01;
        if (expandableListView5 == null) {
            throw C36331k8.A0d("expandableListView");
        }
        expandableListView5.collapseGroup(i2);
        return true;
    }
}
