package X;

import com.whatsapp.R;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.AlI  reason: case insensitive filesystem */
public final class C22355AlI extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22355AlI(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(1);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C167497y9 r1 = (C167497y9) this.this$0.A0L.getValue();
        C18820ts r0 = this.this$0.A0C;
        if (r0 != null) {
            String A0S = r1.A0S(r0, list);
            AnonymousClass00C.A08(A0S);
            this.this$0.A0L.getValue();
            HashSet A02 = C167497y9.A02(this.this$0.A1Z().A07, list);
            List list2 = this.this$0.A1Z().A07;
            list2.clear();
            list2.addAll(list);
            AnonymousClass8VI A1Z = this.this$0.A1Z();
            if (!(A1Z instanceof AnonymousClass8Wg)) {
                List list3 = A1Z.A00;
                AnonymousClass00C.A07(list3);
                ArrayList A0I = AnonymousClass001.A0I();
                for (Object next : list3) {
                    if (next instanceof AnonymousClass8WQ) {
                        A0I.add(next);
                    }
                }
                ArrayList<AnonymousClass8WQ> A0I2 = AnonymousClass001.A0I();
                for (Object next2 : A0I) {
                    if (A02.contains(((AnonymousClass8WQ) next2).A01.A0F)) {
                        A0I2.add(next2);
                    }
                }
                for (AnonymousClass8WQ r5 : A0I2) {
                    long A0L = A1Z.A0L(r5.A01);
                    if (A0L != r5.A00) {
                        r5.A00 = A0L;
                        A1Z.A07(list3.indexOf(r5));
                    }
                }
            }
            BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
            boolean B9S = businessProductListBaseFragment.A1Z().B9S();
            WDSButton wDSButton = businessProductListBaseFragment.A0G;
            if (wDSButton != null) {
                C36381kD.A1E(wDSButton, businessProductListBaseFragment, AnonymousClass000.A1b(A0S), R.string.f12nameremoved);
            }
            BusinessProductListBaseFragment.A03(businessProductListBaseFragment, B9S);
            this.this$0.A1b();
            return AnonymousClass0AJ.A00;
        }
        throw C36321k7.A09();
    }
}
