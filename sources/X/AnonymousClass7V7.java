package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;

/* renamed from: X.7V7  reason: invalid class name */
public final class AnonymousClass7V7 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ String $password;
    public final /* synthetic */ AnonymousClass6u4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V7(AnonymousClass6u4 r2, C160057kO r3, String str, KeyPair keyPair) {
        super(1);
        this.$keyPair = keyPair;
        this.this$0 = r2;
        this.$password = str;
        this.$callback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C122515uy r6 = (C122515uy) obj;
        if (r6 != null) {
            KeyPair keyPair = this.$keyPair;
            AnonymousClass6u4 r0 = this.this$0;
            String str = this.$password;
            C160057kO r3 = this.$callback;
            if (keyPair != null) {
                C130386Kw r02 = r0.A01;
                PrivateKey privateKey = keyPair.getPrivate();
                AnonymousClass00C.A08(privateKey);
                C36321k7.A0z(str, r3);
                try {
                    r3.Bi5(AnonymousClass1UW.A00(new AnonymousClass6P0("shops"), str, C130936Na.A02(r6, r02.A00, privateKey)));
                } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                    r3.BWk(e);
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
