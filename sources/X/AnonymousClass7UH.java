package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.7UH  reason: invalid class name */
public final class AnonymousClass7UH extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ CatalogCategoryGroupsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UH(CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogCategoryGroupsViewModel;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object r0;
        C117065le r8 = (C117065le) obj;
        AnonymousClass00C.A0D(r8, 0);
        if (r8 instanceof C1030653n) {
            List<C128506Cn> list = ((C1030653n) r8).A01;
            UserJid userJid = this.$bizJid;
            ArrayList A0J = C36321k7.A0J(list);
            for (C128506Cn r1 : list) {
                if (r1.A04) {
                    r0 = new C174398Ws(r1, userJid);
                } else {
                    r0 = new C174408Wt(r1, userJid);
                }
                A0J.add(r0);
            }
            LinkedHashMap A1G = C36431kI.A1G();
            for (C128506Cn r12 : list) {
                if (!r12.A04) {
                    String str = r12.A01;
                    ArrayList A0I = AnonymousClass001.A0I();
                    int i = 0;
                    do {
                        A0I.add(new C174368Wp());
                        i++;
                    } while (i < 3);
                    A1G.put(str, A0I);
                }
            }
            ((C001600r) this.this$0.A07.getValue()).A0C(new AnonymousClass8X7(A0J, A1G));
        }
        return AnonymousClass0AJ.A00;
    }
}
