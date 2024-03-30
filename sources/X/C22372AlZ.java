package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AlZ  reason: case insensitive filesystem */
public final class C22372AlZ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22372AlZ(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        super(1);
        this.this$0 = catalogCategoryExpandableGroupsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass96B r10 = (AnonymousClass96B) obj;
        if (r10 instanceof AnonymousClass8X9) {
            CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = this.this$0;
            AnonymousClass8X9 r102 = (AnonymousClass8X9) r10;
            String str = r102.A02;
            String str2 = r102.A03;
            UserJid userJid = r102.A01;
            int i = r102.A00;
            Context A1D = catalogCategoryExpandableGroupsListFragment.A1D();
            if (A1D != null) {
                Intent A0v = AnonymousClass190.A0v(A1D, userJid, C36371kC.A0n(), Integer.valueOf(i), str, str2, (String) null);
                C24801Dv r2 = catalogCategoryExpandableGroupsListFragment.A02;
                if (r2 != null) {
                    r2.A09(catalogCategoryExpandableGroupsListFragment.A0i(), A0v, 3000);
                } else {
                    throw C36331k8.A0d("activityUtils");
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
