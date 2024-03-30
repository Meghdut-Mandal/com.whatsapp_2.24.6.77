package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7UI  reason: invalid class name */
public final class AnonymousClass7UI extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ CatalogCategoryTabsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UI(CatalogCategoryTabsViewModel catalogCategoryTabsViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogCategoryTabsViewModel;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        C117065le r9 = (C117065le) obj;
        AnonymousClass00C.A0D(r9, 0);
        if (r9 instanceof C1030653n) {
            List<C128506Cn> list = ((C1030653n) r9).A01;
            C001600r r6 = (C001600r) this.this$0.A05.getValue();
            CatalogCategoryTabsViewModel catalogCategoryTabsViewModel = this.this$0;
            UserJid userJid = this.$bizJid;
            if (catalogCategoryTabsViewModel.A02.A00.A0E(2273)) {
                arrayList = C36351kA.A0z(list);
                for (C128506Cn r0 : list) {
                    arrayList.add(new AnonymousClass6CI(userJid, r0.A02, r0.A01, r0.A04));
                }
            } else {
                ArrayList<C128506Cn> A0I = AnonymousClass001.A0I();
                for (Object next : list) {
                    C36391kE.A1V(next, A0I, ((C128506Cn) next).A04 ? 1 : 0);
                }
                arrayList = C36351kA.A0z(A0I);
                for (C128506Cn r02 : A0I) {
                    arrayList.add(new AnonymousClass6CI(userJid, r02.A02, r02.A01, r02.A04));
                }
            }
            r6.A0C(arrayList);
        }
        return AnonymousClass0AJ.A00;
    }
}
