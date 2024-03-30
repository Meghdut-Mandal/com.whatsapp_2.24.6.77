package X;

import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;
import java.util.List;

/* renamed from: X.4LR  reason: invalid class name */
public final class AnonymousClass4LR extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LR(UpdatesFragment updatesFragment) {
        super(1);
        this.this$0 = updatesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        UpdatesAdapter updatesAdapter;
        AnonymousClass3KX r4 = (AnonymousClass3KX) obj;
        List list = r4.A07;
        if (list != null) {
            z = C36401kF.A1a(list);
        } else {
            z = false;
        }
        if ((r4.A0B || z != this.this$0.A10) && (updatesAdapter = this.this$0.A0b) != null) {
            updatesAdapter.A04 = C023409w.A00;
            updatesAdapter.A06();
        }
        UpdatesAdapter updatesAdapter2 = this.this$0.A0b;
        if (updatesAdapter2 != null) {
            updatesAdapter2.A0L(r4);
        }
        UpdatesFragment updatesFragment = this.this$0;
        if (z != updatesFragment.A10) {
            updatesFragment.A10 = z;
            updatesFragment.A0i().invalidateOptionsMenu();
            UpdatesFragment.A07(this.this$0);
        }
        return AnonymousClass0AJ.A00;
    }
}
