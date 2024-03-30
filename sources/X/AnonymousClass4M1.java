package X;

import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;

/* renamed from: X.4M1  reason: invalid class name */
public final class AnonymousClass4M1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C87214Nx $assistedFactory;
    public final /* synthetic */ AnonymousClass147 $groupJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4M1(C87214Nx r2, AnonymousClass147 r3) {
        super(1);
        this.$assistedFactory = r2;
        this.$groupJid = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C87214Nx r1 = this.$assistedFactory;
        AnonymousClass147 r4 = this.$groupJid;
        C70673fX r12 = (C70673fX) r1;
        RtaXmppClient A3D = C27111My.A3D(r12.A00.A00);
        C27121Mz r13 = r12.A00;
        return new C39961uN((C57252xw) r13.A00.A1C.get(), C36391kE.A0d(r13.A01), r4, A3D);
    }
}
