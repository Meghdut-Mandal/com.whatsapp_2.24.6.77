package X;

import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.LocalChannel;

/* renamed from: X.Akb  reason: case insensitive filesystem */
public final class C22313Akb extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C202559mB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22313Akb(C202559mB r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CipherBuilder cipherBuilder = (CipherBuilder) obj;
        AnonymousClass00C.A0D(cipherBuilder, 0);
        LocalChannel localChannel = this.this$0.A02;
        byte[] serialize = cipherBuilder.privateKey.recoverPublicKey().serialize();
        AnonymousClass90L r5 = AnonymousClass90L.Secp256r1;
        byte[] bArr = cipherBuilder.challenge;
        C36321k7.A0v(serialize, 0, bArr);
        AnonymousClass8NN A0p = C173018Qb.DEFAULT_INSTANCE.A0p();
        ((C173018Qb) A0p.A00).publicKey_ = C90474aD.A0O(A0p, serialize);
        ((C173018Qb) A0p.A00).challenge_ = C90474aD.A0O(A0p, bArr);
        C173018Qb r1 = (C173018Qb) C90524aI.A0H(A0p);
        r1.keyType_ = Integer.valueOf(r5.BEY());
        r1.keyTypeCase_ = 3;
        ((C173018Qb) C90524aI.A0H(A0p)).supportedParameters_ = 1;
        localChannel.send(AnonymousClass957.A00(A0p.A0R(), C188378zU.REQUEST_ENCRYPTION.value));
        return AnonymousClass0AJ.A00;
    }
}
