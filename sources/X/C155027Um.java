package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Um  reason: invalid class name and case insensitive filesystem */
public final class C155027Um extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ C187808yZ $displayContext;
    public final /* synthetic */ CatalogAllCategoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155027Um(C187808yZ r2, CatalogAllCategoryViewModel catalogAllCategoryViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogAllCategoryViewModel;
        this.$bizJid = userJid;
        this.$displayContext = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object r0;
        C117065le r8 = (C117065le) obj;
        AnonymousClass00C.A0D(r8, 0);
        if (r8 instanceof C1030653n) {
            List<C128506Cn> list = ((C1030653n) r8).A01;
            C36341k9.A17((C001600r) this.this$0.A08.getValue(), 1);
            UserJid userJid = this.$bizJid;
            C187808yZ r5 = this.$displayContext;
            ArrayList A0J = C36321k7.A0J(list);
            for (C128506Cn r2 : list) {
                int ordinal = r5.ordinal();
                if (ordinal == 1) {
                    r0 = new C174418Wu(r2, userJid);
                } else if (ordinal == 0) {
                    r0 = new C174428Wv(r2, userJid);
                } else {
                    throw C36441kJ.A18();
                }
                A0J.add(r0);
            }
            if (this.$displayContext.ordinal() == 1) {
                A0J = C90504aG.A0u(A0J);
                A0J.add(0, new C174388Wr());
            }
            ((C001600r) this.this$0.A07.getValue()).A0C(A0J);
        } else {
            C36341k9.A17((C001600r) this.this$0.A08.getValue(), 2);
        }
        return AnonymousClass0AJ.A00;
    }
}
