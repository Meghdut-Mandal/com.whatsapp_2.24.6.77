package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Vh  reason: invalid class name and case insensitive filesystem */
public final class C155237Vh extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ String $userDeleteReason;
    public final /* synthetic */ AnonymousClass6OQ $userEntity;
    public final /* synthetic */ AnonymousClass6u6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155237Vh(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, AnonymousClass6u6 r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
        this.$userDeleteReason = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5V6 A0d = C90514aH.A0d(obj);
        AnonymousClass6u6 r5 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        AnonymousClass6OQ r2 = this.$userEntity;
        PublicKey publicKey = this.$passwordPublicKey;
        AnonymousClass750 r1 = new AnonymousClass750(r2, this.$callback, this.$operationRetryState, r5, this.$passwordKeyId, this.$userDeleteReason, publicKey, x509Certificate);
        AnonymousClass67R r7 = this.this$0.A01;
        int A00 = AnonymousClass3ME.A00(A0d.node);
        r7.A00(this.$callback, this.$operationRetryState, A0d, r1, A00);
        return AnonymousClass0AJ.A00;
    }
}
