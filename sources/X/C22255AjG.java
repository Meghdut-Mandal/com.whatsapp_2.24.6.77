package X;

import com.facebook.wearable.airshield.security.InitializationVector;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.RemoteChannel;

/* renamed from: X.AjG  reason: case insensitive filesystem */
public final class C22255AjG extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ int $base;
    public final /* synthetic */ RemoteChannel $channel;
    public final /* synthetic */ boolean $hkdf;
    public final /* synthetic */ CipherBuilder $txCipher;
    public final /* synthetic */ C21010A2y $txTransformer;
    public final /* synthetic */ C202559mB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22255AjG(CipherBuilder cipherBuilder, C21010A2y a2y, C202559mB r4, RemoteChannel remoteChannel, int i, boolean z) {
        super(0);
        this.$channel = remoteChannel;
        this.$txCipher = cipherBuilder;
        this.$base = i;
        this.$hkdf = z;
        this.this$0 = r4;
        this.$txTransformer = a2y;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i = this.$base;
        CipherBuilder cipherBuilder = this.$txCipher;
        boolean z = this.$hkdf;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("----------------------------------------------");
        A0u.append(10);
        StringBuilder A0l = C165587tf.A0l("Enable encryption:", A0u);
        A0l.append("base: ");
        A0l.append(String.valueOf(C165597tg.A0C(i)));
        C36351kA.A1K(A0l, A0u);
        StringBuilder A0y = C165607th.A0y(A0u);
        A0y.append("seed: ");
        byte[] bArr = cipherBuilder.seed;
        C22507Anp anp = C22507Anp.A00;
        C165567td.A1T(A0y, A0u, anp, bArr);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("initialization vector: ");
        C165567td.A1T(A0u2, A0u, anp, cipherBuilder.initializationVector.toByteArray());
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("challenge: ");
        C165567td.A1T(A0u3, A0u, anp, cipherBuilder.challenge);
        StringBuilder A0l2 = C165587tf.A0l(C36371kC.A0z("hkdf: ", AnonymousClass000.A0u(), z), A0u);
        A0l2.append("public key: ");
        PublicKey publicKey = cipherBuilder.remotePublicKey;
        if (publicKey != null) {
            C165567td.A1T(A0l2, A0u, anp, publicKey.serialize());
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append("TX generated challenge: ");
            C165567td.A1T(A0u4, A0u, anp, cipherBuilder.buildTxChallenge().toByteArray());
            AnonymousClass6YR.A04("LinkSetup", C36381kD.A0y(A0u));
            RemoteChannel remoteChannel = this.$channel;
            byte[] serialize = this.$txCipher.privateKey.recoverPublicKey().serialize();
            CipherBuilder cipherBuilder2 = this.$txCipher;
            byte[] bArr2 = cipherBuilder2.seed;
            InitializationVector initializationVector = cipherBuilder2.initializationVector;
            int i2 = this.$base;
            boolean z2 = this.$hkdf;
            C165567td.A1K(serialize, bArr2, initializationVector);
            AnonymousClass8NN A0p = C173248Qy.DEFAULT_INSTANCE.A0p();
            ((C173248Qy) A0p.A00).publicKey_ = C90474aD.A0O(A0p, serialize);
            ((C173248Qy) A0p.A00).seed_ = C90474aD.A0O(A0p, bArr2);
            ((C173248Qy) A0p.A00).iv_ = C90474aD.A0O(A0p, initializationVector.toByteArray());
            ((C173248Qy) C90524aI.A0H(A0p)).base_ = i2;
            ((C173248Qy) C90524aI.A0H(A0p)).parameters_ = z2 ? 1 : 0;
            remoteChannel.send(AnonymousClass957.A00(A0p.A0R(), C188378zU.ENABLE_ENCRYPTION.value));
            C202079l0 r0 = this.this$0.A05;
            C21010A2y a2y = this.$txTransformer;
            synchronized (r0.A08) {
                AnonymousClass9JY r02 = r0.A01;
                if (r02 != null) {
                    r02.A00 = a2y;
                }
            }
            C202559mB.A02(this.this$0, new C22310AkY(this.$txTransformer));
            C202559mB.A01(this.this$0, new C22311AkZ(this.$txCipher));
            return AnonymousClass0AJ.A00;
        }
        throw C36381kD.A0l();
    }
}
