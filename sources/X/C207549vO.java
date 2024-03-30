package X;

import android.widget.ExpandableListView;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;

/* renamed from: X.9vO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207549vO implements ExpandableListView.OnGroupCollapseListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public /* synthetic */ C207549vO(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }

    public final void onGroupCollapse(int i) {
        this.A00.A00 = -1;
    }
}
