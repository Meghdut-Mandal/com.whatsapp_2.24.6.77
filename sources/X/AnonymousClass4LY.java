package X;

import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.statusmuting.MutedStatusesActivity;
import com.whatsapp.updates.ui.statusmuting.MutedStatusesAdapter;
import java.util.List;

/* renamed from: X.4LY  reason: invalid class name */
public final class AnonymousClass4LY extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ MutedStatusesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LY(MutedStatusesActivity mutedStatusesActivity) {
        super(1);
        this.this$0 = mutedStatusesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        WaTextView waTextView = this.this$0.A03;
        if (waTextView == null) {
            throw C36331k8.A0d("noStatusesTextView");
        }
        waTextView.setVisibility(C36351kA.A00(list.isEmpty() ? 1 : 0));
        MutedStatusesAdapter mutedStatusesAdapter = this.this$0.A05;
        if (mutedStatusesAdapter == null) {
            throw C36331k8.A0Y();
        }
        C36351kA.A1H(mutedStatusesAdapter.A00);
        AnonymousClass2L7 r2 = new AnonymousClass2L7(mutedStatusesAdapter.A01, list);
        AnonymousClass4YW.A00(r2, (C33301f4) mutedStatusesAdapter.A05.getValue(), mutedStatusesAdapter, list, 6);
        mutedStatusesAdapter.A00 = r2;
        return AnonymousClass0AJ.A00;
    }
}
