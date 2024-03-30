package X;

import java.util.UUID;

/* renamed from: X.An1  reason: case insensitive filesystem */
public final class C22462An1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UUID $it;
    public final /* synthetic */ AnonymousClass8AC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22462An1(AnonymousClass8AC r2, UUID uuid) {
        super(1);
        this.this$0 = r2;
        this.$it = uuid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C199069ee r5 = (C199069ee) obj;
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass8AC r1 = this.this$0;
        r5.A02 = new C22220Aih(r1, r5);
        r5.A03 = new C22461An0(r1, r5);
        r1.A00.A01.A07 = new AnonymousClass88I(r5, (AnonymousClass88C) null, this.$it);
        C200159gk r3 = AnonymousClass9AO.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[LINKED_APP_MANAGER]: onConnected for ");
        r3.A01("sup:LinkedAppManagerStateDelegate", AnonymousClass000.A0o(r5.A07, A0u));
        C23090B4a b4a = this.this$0.A00.A0H;
        if (b4a != null) {
            b4a.BPK("linked_app_manager_started");
        }
        AnonymousClass84B r32 = this.this$0.A00;
        AnonymousClass81Q.A01(r32.A08, r32, AnonymousClass84B.A0S, 2);
        return AnonymousClass0AJ.A00;
    }
}
