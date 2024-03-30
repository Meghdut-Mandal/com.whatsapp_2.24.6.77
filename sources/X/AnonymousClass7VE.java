package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;

/* renamed from: X.7VE  reason: invalid class name */
public final class AnonymousClass7VE extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ AnonymousClass6OQ $userEntity;
    public final /* synthetic */ C145536u3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VE(AnonymousClass6OQ r2, C160057kO r3, C145536u3 r4, KeyPair keyPair) {
        super(1);
        this.this$0 = r4;
        this.$keyPair = keyPair;
        this.$userEntity = r2;
        this.$callback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C122515uy r6 = (C122515uy) obj;
        if (r6 != null) {
            C145536u3 r4 = this.this$0;
            KeyPair keyPair = this.$keyPair;
            AnonymousClass6OQ r3 = this.$userEntity;
            C160057kO r2 = this.$callback;
            PrivateKey privateKey = keyPair.getPrivate();
            AnonymousClass00C.A08(privateKey);
            try {
                AnonymousClass6OQ.A01(r3, r2, C135086c7.A00(r3.A04), C130936Na.A02(r6, r4.A00, privateKey));
            } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                r2.BWk(e);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
