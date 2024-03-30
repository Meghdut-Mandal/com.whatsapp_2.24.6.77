package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Ug  reason: invalid class name and case insensitive filesystem */
public final class C154967Ug extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ AnonymousClass6u4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154967Ug(AnonymousClass6u4 r2, C160057kO r3, C128936Ee r4) {
        super(1);
        this.this$0 = r2;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6C5 r7 = (AnonymousClass6C5) obj;
        AnonymousClass00C.A0D(r7, 0);
        AnonymousClass6u4 r0 = this.this$0;
        X509Certificate x509Certificate = r7.A02;
        PublicKey publicKey = r7.A01;
        r0.A00(this.$callback, this.$operationRetryState, r7.A00, publicKey, x509Certificate);
        return AnonymousClass0AJ.A00;
    }
}
