package X;

import com.whatsapp.status.StatusExpirationLifecycleOwner;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4LT  reason: invalid class name */
public final class AnonymousClass4LT extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LT(UpdatesFragment updatesFragment) {
        super(1);
        this.this$0 = updatesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass15M r1;
        AnonymousClass3P0 r9 = (AnonymousClass3P0) obj;
        AnonymousClass00C.A0D(r9, 0);
        UpdatesFragment updatesFragment = this.this$0;
        UpdatesAdapter updatesAdapter = updatesFragment.A0b;
        if (updatesAdapter != null) {
            updatesAdapter.A0R.getValue();
        }
        long j = 0;
        List list = r9.A02;
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long A04 = C36441kJ.A0h(it).A04();
            if (A04 < j) {
                A04 = j;
            }
            j = A04;
        }
        AnonymousClass01I A0h = updatesFragment.A0h();
        if ((A0h instanceof AnonymousClass15M) && (r1 = (AnonymousClass15M) A0h) != null) {
            r1.Bx1(j, size);
        }
        StatusExpirationLifecycleOwner statusExpirationLifecycleOwner = updatesFragment.A0S;
        if (statusExpirationLifecycleOwner == null) {
            throw C36331k8.A0d("statusExpirationLifecycleOwner");
        }
        statusExpirationLifecycleOwner.A00();
        return AnonymousClass0AJ.A00;
    }
}
