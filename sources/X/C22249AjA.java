package X;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: X.AjA  reason: case insensitive filesystem */
public final class C22249AjA extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass90V $state;
    public final /* synthetic */ UUID $txLinkId;
    public final /* synthetic */ C202559mB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22249AjA(C202559mB r2, AnonymousClass90V r3, UUID uuid) {
        super(0);
        this.$txLinkId = uuid;
        this.$state = r3;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        UUID uuid = this.$txLinkId;
        AnonymousClass90V r4 = this.$state;
        C36331k8.A1I(uuid, r4);
        AnonymousClass8NN A01 = C170918Hz.A01(C172608Om.DEFAULT_INSTANCE);
        ((C172608Om) A01.A00).state_ = r4.BEY();
        AnonymousClass00C.A0D(uuid, 0);
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        C165587tf.A1P(wrap, uuid);
        byte[] array = wrap.array();
        AnonymousClass00C.A08(array);
        ((C172608Om) A01.A00).uuid_ = AnonymousClass8NN.A03(A01, array);
        C197549bt A00 = AnonymousClass957.A00(A01.A0R(), C188378zU.END_LINK_SETUP.value);
        AnonymousClass6YR.A06("LinkSetup", AnonymousClass000.A0l(A00, "Sending EndLinkSetupMessage: ", AnonymousClass000.A0u()));
        this.this$0.A02.send(A00);
        C202559mB.A02(this.this$0, new C22459Amy(this.$state, this.$txLinkId));
        return AnonymousClass0AJ.A00;
    }
}
