package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7VA  reason: invalid class name */
public final class AnonymousClass7VA extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ List $catalogCategoryGroups;
    public final /* synthetic */ Map $categoryParentToChildItemMap;
    public final /* synthetic */ CatalogCategoryGroupsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VA(CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid, List list, Map map) {
        super(1);
        this.this$0 = catalogCategoryGroupsViewModel;
        this.$catalogCategoryGroups = list;
        this.$categoryParentToChildItemMap = map;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        C001600r r2;
        C117065le r9 = (C117065le) obj;
        AnonymousClass00C.A0D(r9, 0);
        if (r9 instanceof C1030753o) {
            C36341k9.A19(this.this$0.A03, false);
            Map map = ((C1030753o) r9).A01;
            Map map2 = this.$categoryParentToChildItemMap;
            UserJid userJid = this.$bizJid;
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                List<C128506Cn> list = (List) A11.getValue();
                Object key = A11.getKey();
                ArrayList A0J = C36321k7.A0J(list);
                for (C128506Cn r1 : list) {
                    A0J.add(new C174398Ws(r1, userJid));
                }
                map2.put(key, A0J);
            }
            r2 = (C001600r) this.this$0.A07.getValue();
            obj2 = new AnonymousClass8X6(this.$catalogCategoryGroups, this.$categoryParentToChildItemMap);
        } else {
            if (r9 instanceof AnonymousClass53l) {
                r2 = this.this$0.A03;
                obj2 = C36371kC.A0m();
            }
            return AnonymousClass0AJ.A00;
        }
        r2.A0C(obj2);
        return AnonymousClass0AJ.A00;
    }
}
