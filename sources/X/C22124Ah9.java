package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Ah9  reason: case insensitive filesystem */
public final class C22124Ah9 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C174358Wo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22124Ah9(C174358Wo r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C174358Wo r2 = this.this$0;
        UserJid A3i = r2.A3i();
        AnonymousClass4PE r0 = this.this$0.A03;
        if (r0 != null) {
            return C165577te.A0M(r2, r0, A3i);
        }
        throw C36331k8.A0d("cartMenuViewModelFactory");
    }
}
