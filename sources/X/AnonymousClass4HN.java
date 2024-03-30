package X;

import com.whatsapp.updates.ui.adapter.UpdatesAdapter;

/* renamed from: X.4HN  reason: invalid class name */
public final class AnonymousClass4HN extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass3HM $bannerType;
    public final /* synthetic */ C48372hD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HN(C48372hD r2, AnonymousClass3HM r3) {
        super(0);
        this.this$0 = r2;
        this.$bannerType = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        UpdatesAdapter updatesAdapter = this.this$0.A00;
        AnonymousClass3HM r2 = this.$bannerType;
        AnonymousClass00C.A0D(r2, 0);
        C65353Rs r1 = (C65353Rs) updatesAdapter.A0O.get();
        if (r2 instanceof C48542hU) {
            C65353Rs.A01(r1, 3);
        }
        C65353Rs.A00(r2, r1);
        updatesAdapter.A0L(updatesAdapter.A00);
        return AnonymousClass0AJ.A00;
    }
}
