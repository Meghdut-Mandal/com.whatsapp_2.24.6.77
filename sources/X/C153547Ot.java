package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Ot  reason: invalid class name and case insensitive filesystem */
public final class C153547Ot extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass6u6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153547Ot(C160057kO r2, C128936Ee r3, AnonymousClass6u6 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(0);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6u6 r0 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        r0.A01(this.$callback, this.$operationRetryState, this.$passwordKeyId, publicKey, x509Certificate);
        return AnonymousClass0AJ.A00;
    }
}
