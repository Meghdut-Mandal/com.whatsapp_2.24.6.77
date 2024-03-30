package X;

import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.RemoteChannel;

/* renamed from: X.Anb  reason: case insensitive filesystem */
public final class C22498Anb extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $base;
    public final /* synthetic */ RemoteChannel $channel;
    public final /* synthetic */ boolean $hkdf;
    public final /* synthetic */ CipherBuilder $txCipher;
    public final /* synthetic */ C21010A2y $txTransformer;
    public final /* synthetic */ C202559mB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22498Anb(CipherBuilder cipherBuilder, C21010A2y a2y, C202559mB r4, RemoteChannel remoteChannel, int i, boolean z) {
        super(1);
        this.this$0 = r4;
        this.$channel = remoteChannel;
        this.$txCipher = cipherBuilder;
        this.$base = i;
        this.$hkdf = z;
        this.$txTransformer = a2y;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C202559mB r3 = this.this$0;
        RemoteChannel remoteChannel = this.$channel;
        C202559mB.A00(r3, new C22255AjG(this.$txCipher, this.$txTransformer, r3, remoteChannel, this.$base, this.$hkdf));
        return AnonymousClass6P8.A06;
    }
}
