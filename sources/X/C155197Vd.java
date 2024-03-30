package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Vd  reason: invalid class name and case insensitive filesystem */
public final class C155197Vd extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass6OQ $userEntity;
    public final /* synthetic */ AnonymousClass6u6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155197Vd(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, AnonymousClass6u6 r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5V6 A0d = C90514aH.A0d(obj);
        AnonymousClass6u6 r7 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        AnonymousClass6OQ r4 = this.$userEntity;
        PublicKey publicKey = this.$passwordPublicKey;
        AnonymousClass754 r3 = new AnonymousClass754(r4, this.$callback, this.$operationRetryState, r7, this.$passwordKeyId, publicKey, x509Certificate);
        AnonymousClass6u6 r72 = this.this$0;
        AnonymousClass67R r11 = r72.A01;
        C128936Ee r6 = this.$operationRetryState;
        C160057kO r5 = this.$callback;
        AnonymousClass7VL r1 = new AnonymousClass7VL(this.$userEntity, r5, r6, r72);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        r11.A01(r5, r6, A0d, r3, new C153547Ot(r5, r6, r72, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2), r1);
        return AnonymousClass0AJ.A00;
    }
}
