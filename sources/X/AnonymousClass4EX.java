package X;

import com.whatsapp.updates.viewmodels.SearchUsecase;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.4EX  reason: invalid class name */
public final class AnonymousClass4EX extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4EX(UpdatesViewModel updatesViewModel) {
        super(0);
        this.this$0 = updatesViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj = this.this$0.A0k.get();
        UpdatesViewModel updatesViewModel = this.this$0;
        SearchUsecase searchUsecase = (SearchUsecase) obj;
        C65963Ud.A02(searchUsecase.A04, updatesViewModel.A0O, new C86564Lk(updatesViewModel), 48);
        return searchUsecase;
    }
}
