package X;

import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel;
import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel$fetchAndPostStatusesUiData$1;

/* renamed from: X.4LL  reason: invalid class name */
public final class AnonymousClass4LL extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ StatusSeeAllViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LL(StatusSeeAllViewModel statusSeeAllViewModel) {
        super(1);
        this.this$0 = statusSeeAllViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3P0 r6 = (AnonymousClass3P0) obj;
        StatusSeeAllViewModel statusSeeAllViewModel = this.this$0;
        if (!statusSeeAllViewModel.A04) {
            AnonymousClass00C.A0B(r6);
            C36381kD.A1R(statusSeeAllViewModel.A09, new StatusSeeAllViewModel$fetchAndPostStatusesUiData$1(r6, statusSeeAllViewModel, (C023509x) null), C109325Xd.A00(statusSeeAllViewModel));
        }
        return AnonymousClass0AJ.A00;
    }
}
