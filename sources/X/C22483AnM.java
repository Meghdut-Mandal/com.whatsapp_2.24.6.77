package X;

import java.util.UUID;

/* renamed from: X.AnM  reason: case insensitive filesystem */
public final class C22483AnM extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass90V $state;
    public final /* synthetic */ UUID $txLinkId;
    public final /* synthetic */ C202559mB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22483AnM(C202559mB r2, AnonymousClass90V r3, UUID uuid) {
        super(1);
        this.this$0 = r2;
        this.$txLinkId = uuid;
        this.$state = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C202559mB r3 = this.this$0;
        C202559mB.A00(r3, new C22249AjA(r3, this.$state, this.$txLinkId));
        return AnonymousClass6P8.A06;
    }
}
