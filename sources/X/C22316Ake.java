package X;

import java.util.UUID;

/* renamed from: X.Ake  reason: case insensitive filesystem */
public final class C22316Ake extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass8AC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22316Ake(AnonymousClass8AC r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UUID uuid = (UUID) obj;
        AnonymousClass00C.A0D(uuid, 0);
        AnonymousClass8AC r2 = this.this$0;
        C203689oX r1 = r2.A00.A01.A08;
        if (r1 != null) {
            r1.A04 = new C22462An1(r2, uuid);
        }
        return AnonymousClass0AJ.A00;
    }
}
