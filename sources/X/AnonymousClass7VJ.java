package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7VJ  reason: invalid class name */
public final class AnonymousClass7VJ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6AZ $data;
    public final /* synthetic */ C160057kO $operationCallback;
    public final /* synthetic */ C128936Ee $requestRetryState;
    public final /* synthetic */ AnonymousClass6u6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VJ(C160057kO r2, C128936Ee r3, AnonymousClass6u6 r4, AnonymousClass6AZ r5) {
        super(1);
        this.this$0 = r4;
        this.$data = r5;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6CT r8 = (AnonymousClass6CT) obj;
        AnonymousClass00C.A0D(r8, 0);
        AnonymousClass6u6 r0 = this.this$0;
        AnonymousClass6AZ r3 = this.$data;
        X509Certificate x509Certificate = r8.A02;
        PublicKey publicKey = r8.A01;
        r0.BlV(this.$operationCallback, this.$requestRetryState, r3, r8.A00, publicKey, x509Certificate);
        return AnonymousClass0AJ.A00;
    }
}
