package X;

import java.security.KeyPair;
import java.security.PrivateKey;

/* renamed from: X.7VH  reason: invalid class name */
public final class AnonymousClass7VH extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ String $rawPassword;
    public final /* synthetic */ AnonymousClass6u6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VH(C160057kO r2, AnonymousClass6u6 r3, String str, KeyPair keyPair) {
        super(1);
        this.this$0 = r3;
        this.$keyPair = keyPair;
        this.$rawPassword = str;
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C203399nx r7 = (C203399nx) obj;
        AnonymousClass00C.A0D(r7, 0);
        AnonymousClass6u6 r5 = this.this$0;
        PrivateKey privateKey = this.$keyPair.getPrivate();
        AnonymousClass00C.A08(privateKey);
        String str = this.$rawPassword;
        this.$callback.Bi5(AnonymousClass1UW.A00(C113335fN.A00, str, C130936Na.A02(C131116Nu.A00(r7), r5.A00, privateKey)));
        return AnonymousClass0AJ.A00;
    }
}
