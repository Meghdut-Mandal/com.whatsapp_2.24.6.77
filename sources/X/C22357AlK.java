package X;

import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AlK  reason: case insensitive filesystem */
public final class C22357AlK extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22357AlK(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(1);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (AnonymousClass00C.A0J(obj, C64023Mi.A00)) {
            AnonymousClass01z A0k = this.this$0.A0k();
            BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
            C61223Ba r7 = businessProductListBaseFragment.A0E;
            if (r7 != null) {
                UserJid A1a = businessProductListBaseFragment.A1a();
                C187948yn r5 = this.this$0.A0A;
                int ordinal = r5.ordinal();
                int i = 3;
                if (ordinal != 0) {
                    if (ordinal == 1 || ordinal == 2) {
                        i = 2;
                    } else if (ordinal == 3) {
                        i = 5;
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("entryPoint value ");
                        A0u.append(r5);
                        throw AnonymousClass000.A0c(" is not recognized", A0u);
                    }
                }
                C65443Sb.A01(r7.A00(A1a, (String) null, i), A0k);
                return AnonymousClass0AJ.A00;
            }
            throw C36331k8.A0d("orderFragments");
        }
        throw C36441kJ.A18();
    }
}
