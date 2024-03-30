package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7VZ  reason: invalid class name */
public final class AnonymousClass7VZ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass6u6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VZ(C160057kO r2, C128936Ee r3, AnonymousClass6u6 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5V6 A0d = C90514aH.A0d(obj);
        AnonymousClass6u6 r6 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        AnonymousClass75A r3 = new AnonymousClass75A(this.$callback, this.$operationRetryState, r6, this.$passwordKeyId, publicKey, x509Certificate);
        AnonymousClass6u6 r7 = this.this$0;
        AnonymousClass67R r11 = r7.A01;
        C128936Ee r62 = this.$operationRetryState;
        C160057kO r5 = this.$callback;
        C155087Us r2 = new C155087Us(r5, r62, r7);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        C153527Or r4 = new C153527Or(r5, r62, r7, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2);
        C36321k7.A0y(r62, r5);
        if (AnonymousClass3ME.A00(A0d.node) == 304) {
            C90524aI.A0M(r11.A02).A05(new C164057rC(r5, A0d, r4, 2), C113335fN.A00, (C128936Ee) null, (String) null);
        } else {
            r11.A01(r5, r62, A0d, r3, r4, r2);
        }
        return AnonymousClass0AJ.A00;
    }
}
