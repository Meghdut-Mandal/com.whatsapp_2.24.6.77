package X;

import java.util.UUID;

/* renamed from: X.Aob  reason: case insensitive filesystem */
public final class C22551Aob extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ AnonymousClass9GS $result;
    public final /* synthetic */ C203689oX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22551Aob(AnonymousClass9GS r2, C203689oX r3) {
        super(2);
        this.this$0 = r3;
        this.$result = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        UUID uuid = (UUID) obj;
        AnonymousClass00C.A0D(uuid, 0);
        C203689oX r2 = this.this$0;
        C203689oX.A07(r2, uuid, new C22484AnN(this.$result, r2, uuid), (byte[]) obj2);
        return AnonymousClass0AJ.A00;
    }
}
