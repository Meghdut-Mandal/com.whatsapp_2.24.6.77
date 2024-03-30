package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.List;

/* renamed from: X.4Le  reason: invalid class name and case insensitive filesystem */
public final class C86504Le extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86504Le(UpdatesViewModel updatesViewModel) {
        super(1);
        this.this$0 = updatesViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3EL r6 = (AnonymousClass3EL) obj;
        UpdatesViewModel updatesViewModel = this.this$0;
        AnonymousClass00C.A0B(r6);
        List list = r6.A03;
        C36351kA.A1H(updatesViewModel.A03);
        AnonymousClass2L5 r3 = new AnonymousClass2L5((AnonymousClass37S) updatesViewModel.A0X.A00.A00.A00.A07.get(), list);
        ((C33301f4) updatesViewModel.A0n.getValue()).A00(new AnonymousClass4YN(updatesViewModel, 3), r3);
        updatesViewModel.A03 = r3;
        return AnonymousClass0AJ.A00;
    }
}
