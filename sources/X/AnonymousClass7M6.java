package X;

import java.nio.charset.Charset;
import java.security.SecureRandom;

/* renamed from: X.7M6  reason: invalid class name */
public final class AnonymousClass7M6 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1KW $waFlowsSharedPreferences;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7M6(AnonymousClass1KW r2) {
        super(0);
        this.$waFlowsSharedPreferences = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        Charset charset = C19430v1.A0D;
        AnonymousClass00C.A09(charset);
        String str = new String(bArr, charset);
        C36341k9.A0x(C90504aG.A0H(this.$waFlowsSharedPreferences.A00), "flows_salt_for_logging_message_id", str);
        return str;
    }
}
