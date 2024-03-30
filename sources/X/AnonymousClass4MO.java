package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.4MO  reason: invalid class name */
public final class AnonymousClass4MO extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C44072La $newsletter;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MO(C44072La r2, UpdatesViewModel updatesViewModel) {
        super(1);
        this.this$0 = updatesViewModel;
        this.$newsletter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C54892tj r3 = (C54892tj) obj;
        AnonymousClass00C.A0D(r3, 0);
        UpdatesViewModel updatesViewModel = this.this$0;
        if (updatesViewModel.A09) {
            updatesViewModel.A0l.remove(this.$newsletter.A0J());
            this.this$0.A0S().A04(this.$newsletter);
            if (r3 instanceof C46602Yw) {
                this.$newsletter.A09 = ((C46602Yw) r3).A00;
            } else if (r3 instanceof C46612Yx) {
                UpdatesViewModel updatesViewModel2 = this.this$0;
                AnonymousClass11F A06 = this.$newsletter.A06();
                AnonymousClass00C.A08(A06);
                UpdatesViewModel.A02(A06, (C46612Yx) r3, updatesViewModel2);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
