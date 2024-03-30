package X;

import java.util.UUID;

/* renamed from: X.AnN  reason: case insensitive filesystem */
public final class C22484AnN extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass9GS $result;
    public final /* synthetic */ UUID $serviceUUID;
    public final /* synthetic */ C203689oX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22484AnN(AnonymousClass9GS r2, C203689oX r3, UUID uuid) {
        super(1);
        this.this$0 = r3;
        this.$serviceUUID = uuid;
        this.$result = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C203689oX r4 = this.this$0;
        UUID uuid = this.$serviceUUID;
        C203689oX.A06(r4, r4.A09.A00, uuid, new C22561Aoq(this.$result, (AnonymousClass887) obj, uuid));
        return AnonymousClass0AJ.A00;
    }
}
