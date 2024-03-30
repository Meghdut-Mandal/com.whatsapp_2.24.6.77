package X;

import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.AlY  reason: case insensitive filesystem */
public final class C22371AlY extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22371AlY(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        super(1);
        this.this$0 = catalogCategoryExpandableGroupsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C166367vc r2;
        List list;
        Map map;
        AnonymousClass9EQ r5 = (AnonymousClass9EQ) obj;
        if (r5 instanceof AnonymousClass8X5) {
            r2 = this.this$0.A04;
            if (r2 == null) {
                throw C36331k8.A0d("expandableListAdapter");
            }
            list = r5.A00;
            map = C000400e.A0D();
        } else {
            if (r5 instanceof AnonymousClass8X7) {
                C166367vc r1 = this.this$0.A04;
                if (r1 == null) {
                    throw C36331k8.A0d("expandableListAdapter");
                }
                AnonymousClass8X7 r52 = (AnonymousClass8X7) r5;
                List list2 = r52.A00;
                Map map2 = r52.A01;
                r1.A00 = list2;
                r1.A01 = map2;
                r1.notifyDataSetChanged();
                if (this.this$0.A0P.A02.compareTo(AnonymousClass01P.RESUMED) >= 0) {
                    CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.this$0.A08.getValue();
                    UserJid userJid = this.this$0.A05;
                    if (userJid == null) {
                        throw C36331k8.A0d("bizJid");
                    }
                    catalogCategoryGroupsViewModel.A0S(userJid, list2);
                }
            } else if (r5 instanceof AnonymousClass8X6) {
                r2 = this.this$0.A04;
                if (r2 == null) {
                    throw C36331k8.A0d("expandableListAdapter");
                }
                AnonymousClass8X6 r53 = (AnonymousClass8X6) r5;
                list = r53.A00;
                map = r53.A01;
            }
            return AnonymousClass0AJ.A00;
        }
        r2.A00 = list;
        r2.A01 = map;
        r2.notifyDataSetChanged();
        return AnonymousClass0AJ.A00;
    }
}
