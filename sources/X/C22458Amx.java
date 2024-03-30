package X;

import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.stream.CipherBuilder;

/* renamed from: X.Amx  reason: case insensitive filesystem */
public final class C22458Amx extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ B63 $msg;
    public final /* synthetic */ CipherBuilder $rxCipher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22458Amx(CipherBuilder cipherBuilder, B63 b63) {
        super(1);
        this.$rxCipher = cipherBuilder;
        this.$msg = b63;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CipherBuilder cipherBuilder = (CipherBuilder) obj;
        AnonymousClass00C.A0D(cipherBuilder, 0);
        cipherBuilder.setPrivateKey(this.$rxCipher.privateKey);
        cipherBuilder.setChallenge(C165617ti.A0i(((C173018Qb) this.$msg).challenge_));
        C1896894u r0 = PublicKey.Companion;
        byte[] A0i = C165617ti.A0i(((C173018Qb) this.$msg).publicKey_);
        PublicKey publicKey = new PublicKey((HybridData) null);
        publicKey.setRaw(A0i);
        cipherBuilder.setRemotePublicKey(publicKey);
        return AnonymousClass0AJ.A00;
    }
}
