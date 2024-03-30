package X;

import com.whatsapp.framework.alerts.ui.AlertCardListFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4K5  reason: invalid class name */
public final class AnonymousClass4K5 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AlertCardListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4K5(AlertCardListFragment alertCardListFragment) {
        super(1);
        this.this$0 = alertCardListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Iterable iterable = (Iterable) obj;
        C167977zV r3 = this.this$0.A03;
        if (r3 == null) {
            throw C36331k8.A0d("alertsListAdapter");
        }
        AnonymousClass00C.A0B(iterable);
        ArrayList A0q = C36361kB.A0q(C007103b.A0X(iterable));
        List list = r3.A01;
        C36341k9.A1A(new C40231vA(list, A0q), r3, A0q, list);
        return AnonymousClass0AJ.A00;
    }
}
