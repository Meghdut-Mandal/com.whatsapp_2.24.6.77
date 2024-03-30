package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Vc  reason: invalid class name and case insensitive filesystem */
public final class C155187Vc extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6AZ $data;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C160057kO $operationCallback;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C128936Ee $requestRetryState;
    public final /* synthetic */ AnonymousClass6u6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155187Vc(C160057kO r2, C128936Ee r3, AnonymousClass6u6 r4, AnonymousClass6AZ r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$data = r5;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5V6 A0d = C90514aH.A0d(obj);
        AnonymousClass6u6 r6 = this.this$0;
        AnonymousClass6AZ r7 = this.$data;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        AnonymousClass754 r3 = new AnonymousClass754(this.$operationCallback, this.$requestRetryState, r6, r7, this.$passwordKeyId, publicKey, x509Certificate);
        AnonymousClass6u6 r72 = this.this$0;
        AnonymousClass67R r11 = r72.A01;
        C128936Ee r62 = this.$requestRetryState;
        C160057kO r5 = this.$operationCallback;
        AnonymousClass7VJ r1 = new AnonymousClass7VJ(r5, r62, r72, this.$data);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        r11.A01(r5, r62, A0d, r3, new C153537Os(r5, r62, r72, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2), r1);
        return AnonymousClass0AJ.A00;
    }
}
