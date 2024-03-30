package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AhA  reason: case insensitive filesystem */
public final class C22125AhA extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C174358Wo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22125AhA(C174358Wo r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C174358Wo r4 = this.this$0;
        C178358fo r3 = r4.A01;
        if (r3 != null) {
            UserJid A3i = r4.A3i();
            C174358Wo r0 = this.this$0;
            C22909AyL ayL = r0.A00;
            if (ayL != null) {
                return C165617ti.A0A(new C207879xG(ayL.B3r(r0.A3i()), r3, A3i), r4).A00(C167607yM.class);
            }
            throw C36331k8.A0d("activeCartRepositoryFactory");
        }
        throw C36331k8.A0d("cartObservers");
    }
}
