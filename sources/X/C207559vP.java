package X;

import android.widget.ExpandableListView;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;

/* renamed from: X.9vP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207559vP implements ExpandableListView.OnGroupExpandListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public /* synthetic */ C207559vP(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }

    public final void onGroupExpand(int i) {
        this.A00.A00 = i;
    }
}
