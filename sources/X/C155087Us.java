package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Us  reason: invalid class name and case insensitive filesystem */
public final class C155087Us extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ AnonymousClass6u6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155087Us(C160057kO r2, C128936Ee r3, AnonymousClass6u6 r4) {
        super(1);
        this.this$0 = r4;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6CT r7 = (AnonymousClass6CT) obj;
        AnonymousClass00C.A0D(r7, 0);
        AnonymousClass6u6 r0 = this.this$0;
        X509Certificate x509Certificate = r7.A02;
        PublicKey publicKey = r7.A01;
        r0.A01(this.$callback, this.$operationRetryState, r7.A00, publicKey, x509Certificate);
        return AnonymousClass0AJ.A00;
    }
}
