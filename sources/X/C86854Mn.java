package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.4Mn  reason: invalid class name and case insensitive filesystem */
public final class C86854Mn extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C44072La $newsletter;
    public final /* synthetic */ AnonymousClass00S $successCallback;
    public final /* synthetic */ AnonymousClass3JI $targetedNewsletter;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86854Mn(C44072La r2, AnonymousClass3JI r3, UpdatesViewModel updatesViewModel, AnonymousClass00S r5) {
        super(1);
        this.$targetedNewsletter = r3;
        this.this$0 = updatesViewModel;
        this.$newsletter = r2;
        this.$successCallback = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C54892tj r3 = (C54892tj) obj;
        AnonymousClass00C.A0D(r3, 0);
        AnonymousClass3JI r1 = this.$targetedNewsletter;
        r1.A01 = false;
        if (r3 instanceof C46602Yw) {
            C44072La r0 = r1.A02;
            C52382pL r12 = ((C46602Yw) r3).A00;
            r0.A09 = r12;
            if (r12 == C52382pL.GUEST) {
                this.this$0.A0l.remove(this.$newsletter.A06());
            } else {
                AnonymousClass00S r02 = this.$successCallback;
                if (r02 != null) {
                    r02.invoke();
                }
            }
            UpdatesViewModel.A05(this.this$0);
        } else if (r3 instanceof C46612Yx) {
            UpdatesViewModel updatesViewModel = this.this$0;
            AnonymousClass11F A06 = this.$newsletter.A06();
            AnonymousClass00C.A08(A06);
            UpdatesViewModel.A02(A06, (C46612Yx) r3, updatesViewModel);
        }
        AnonymousClass3R7.A00(this.this$0.A0U);
        return AnonymousClass0AJ.A00;
    }
}
