package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7VF  reason: invalid class name */
public final class AnonymousClass7VF extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ AnonymousClass6OQ $userEntity;
    public final /* synthetic */ C145536u3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VF(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, C145536u3 r5) {
        super(1);
        this.this$0 = r5;
        this.$userEntity = r2;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6CP r8 = (AnonymousClass6CP) obj;
        AnonymousClass00C.A0D(r8, 0);
        C145536u3 r0 = this.this$0;
        X509Certificate x509Certificate = r8.A02;
        AnonymousClass6OQ r1 = this.$userEntity;
        PublicKey publicKey = r8.A01;
        r0.BlZ(r1, this.$callback, this.$operationRetryState, r8.A00, publicKey, x509Certificate);
        return AnonymousClass0AJ.A00;
    }
}
