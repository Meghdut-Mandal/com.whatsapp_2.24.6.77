package X;

import java.util.UUID;

/* renamed from: X.Amy  reason: case insensitive filesystem */
public final class C22459Amy extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass90V $state;
    public final /* synthetic */ UUID $txLinkId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22459Amy(AnonymousClass90V r2, UUID uuid) {
        super(1);
        this.$txLinkId = uuid;
        this.$state = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass88K r2 = (AnonymousClass88K) obj;
        AnonymousClass00C.A0D(r2, 0);
        r2.A05 = this.$txLinkId;
        r2.A03 = this.$state;
        return AnonymousClass0AJ.A00;
    }
}
