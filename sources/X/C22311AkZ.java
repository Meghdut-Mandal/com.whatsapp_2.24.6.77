package X;

import com.facebook.wearable.airshield.stream.CipherBuilder;

/* renamed from: X.AkZ  reason: case insensitive filesystem */
public final class C22311AkZ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CipherBuilder $txCipher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22311AkZ(CipherBuilder cipherBuilder) {
        super(1);
        this.$txCipher = cipherBuilder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass88G r2 = (AnonymousClass88G) obj;
        AnonymousClass00C.A0D(r2, 0);
        r2.A01 = this.$txCipher.buildTxChallenge();
        return AnonymousClass0AJ.A00;
    }
}
