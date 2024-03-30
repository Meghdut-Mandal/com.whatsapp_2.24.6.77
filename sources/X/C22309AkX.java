package X;

import com.facebook.wearable.airshield.stream.CipherBuilder;

/* renamed from: X.AkX  reason: case insensitive filesystem */
public final class C22309AkX extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CipherBuilder $rxCipher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22309AkX(CipherBuilder cipherBuilder) {
        super(1);
        this.$rxCipher = cipherBuilder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass88G r2 = (AnonymousClass88G) obj;
        AnonymousClass00C.A0D(r2, 0);
        r2.A00 = this.$rxCipher.buildRxChallenge();
        return AnonymousClass0AJ.A00;
    }
}
