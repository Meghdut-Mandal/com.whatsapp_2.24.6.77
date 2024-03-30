package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AlX  reason: case insensitive filesystem */
public final class C22370AlX extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CatalogAllCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22370AlX(CatalogAllCategoryFragment catalogAllCategoryFragment) {
        super(1);
        this.this$0 = catalogAllCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass96B r10 = (AnonymousClass96B) obj;
        if (r10 instanceof AnonymousClass8X8) {
            CatalogAllCategoryFragment catalogAllCategoryFragment = this.this$0;
            AnonymousClass00C.A0B(r10);
            AnonymousClass8X8 r102 = (AnonymousClass8X8) r10;
            Context A0a = catalogAllCategoryFragment.A0a();
            String str = r102.A02;
            UserJid userJid = r102.A01;
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(A0a.getPackageName(), "com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity");
            A0D.putExtra("selected_category_parent_id", str);
            A0D.putExtra("business_owner_jid", userJid);
            catalogAllCategoryFragment.A1C(A0D);
            CatalogAllCategoryFragment catalogAllCategoryFragment2 = this.this$0;
            C187808yZ r1 = r102.A00;
            catalogAllCategoryFragment2.A05.getValue();
            if (r1 == C187808yZ.CATALOG_SEARCH_FLOW) {
                AnonymousClass01z A0l = catalogAllCategoryFragment2.A0l();
                AnonymousClass011[] r3 = new AnonymousClass011[1];
                C36341k9.A1J("all_category_has_navigated_to_category_tabs", true, r3, 0);
                A0l.A0o("all_category_result_callback_key", C05430Pr.A00(r3));
            }
        } else if (r10 instanceof AnonymousClass8X9) {
            CatalogAllCategoryFragment catalogAllCategoryFragment3 = this.this$0;
            AnonymousClass8X9 r103 = (AnonymousClass8X9) r10;
            String str2 = r103.A02;
            String str3 = r103.A03;
            UserJid userJid2 = r103.A01;
            int i = r103.A00;
            Context A1D = catalogAllCategoryFragment3.A1D();
            if (A1D != null) {
                Intent A0v = AnonymousClass190.A0v(A1D, userJid2, C36371kC.A0n(), Integer.valueOf(i), str2, str3, (String) null);
                C24801Dv r2 = catalogAllCategoryFragment3.A01;
                if (r2 != null) {
                    r2.A09(catalogAllCategoryFragment3.A0i(), A0v, 3000);
                } else {
                    throw C36331k8.A0d("activityUtils");
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
