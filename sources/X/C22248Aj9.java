package X;

import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.RemoteChannel;
import java.nio.ByteBuffer;

/* renamed from: X.Aj9  reason: case insensitive filesystem */
public final class C22248Aj9 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C197549bt $buffer;
    public final /* synthetic */ RemoteChannel $channel;
    public final /* synthetic */ C202559mB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22248Aj9(C202559mB r2, RemoteChannel remoteChannel, C197549bt r4) {
        super(0);
        this.this$0 = r2;
        this.$buffer = r4;
        this.$channel = remoteChannel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        B63 b63;
        AnonymousClass9UM r5 = this.this$0.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Receiving message on service: ");
        int i = this.$buffer.A01;
        C188378zU r1 = C188378zU.REQUEST_ENCRYPTION;
        C188378zU r2 = r1;
        if (i != r1.value) {
            r1 = C188378zU.ENABLE_ENCRYPTION;
            if (i != r1.value) {
                r1 = C188378zU.END_LINK_SETUP;
                if (i != r1.value) {
                    throw C90464aC.A0R("Unknown message type: ", AnonymousClass000.A0u(), i);
                }
            }
        }
        r5.A01(new AnonymousClass9PM(AnonymousClass000.A0o(r1, A0u)));
        C197549bt r12 = this.$buffer;
        AnonymousClass00C.A0D(r12, 0);
        ByteBuffer byteBuffer = r12.A00;
        if (byteBuffer != null) {
            C187418xq r3 = new C187418xq(byteBuffer);
            int i2 = r12.A01;
            if (i2 == r2.value) {
                C170918Hz A05 = C170918Hz.A05(new AnonymousClass8I9(r3), C201979ko.A00(), C173018Qb.DEFAULT_INSTANCE);
                C170918Hz.A0W(A05);
                b63 = (C173018Qb) A05;
            } else if (i2 == C188378zU.END_LINK_SETUP.value) {
                C170918Hz A052 = C170918Hz.A05(new AnonymousClass8I9(r3), C201979ko.A00(), C172608Om.DEFAULT_INSTANCE);
                C170918Hz.A0W(A052);
                b63 = (C172608Om) A052;
            } else {
                throw C90524aI.A0X("Unsupported message type");
            }
            AnonymousClass00C.A08(b63);
            B63 b632 = b63;
            if (b632 instanceof C173018Qb) {
                C202559mB r6 = this.this$0;
                Object obj = r6.A0B;
                RemoteChannel remoteChannel = this.$channel;
                synchronized (obj) {
                    CipherBuilder cipherBuilder = r6.A01;
                    if (cipherBuilder == null) {
                        C22313Akb akb = new C22313Akb(r6);
                        cipherBuilder = new CipherBuilder();
                        akb.invoke(cipherBuilder);
                    }
                    int A03 = C15040mb.A03(AnonymousClass0XG.A00, new C15020mZ(0, Integer.MAX_VALUE));
                    boolean z = true;
                    if ((((C173018Qb) b632).supportedParameters_ & 1) != 1) {
                        z = false;
                    }
                    C22458Amx amx = new C22458Amx(cipherBuilder, b632);
                    CipherBuilder cipherBuilder2 = new CipherBuilder();
                    amx.invoke(cipherBuilder2);
                    r6.A05.A03(new C22498Anb(cipherBuilder2, new C21010A2y(cipherBuilder2.buildEncryptionFraming(A03, z)), r6, remoteChannel, A03, z));
                }
            } else if (b632 instanceof C172608Om) {
                AnonymousClass6YR.A06("LinkSetup", AnonymousClass000.A0l(b632, "Received EndLinkSetup: ", AnonymousClass000.A0u()));
                this.this$0.A09.interruptWithError(AnonymousClass9AK.A00);
                C202559mB.A02(this.this$0, new C22312Aka(b632));
            } else {
                throw C90524aI.A0X("Unsupported message");
            }
            return AnonymousClass0AJ.A00;
        }
        throw C90524aI.A0X("buffer is disposed");
    }
}
