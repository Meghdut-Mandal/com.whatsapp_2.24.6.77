package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;

/* renamed from: X.7VD  reason: invalid class name */
public final class AnonymousClass7VD extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ String $password;
    public final /* synthetic */ C145536u3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VD(C160057kO r2, C145536u3 r3, String str, KeyPair keyPair) {
        super(1);
        this.this$0 = r3;
        this.$keyPair = keyPair;
        this.$password = str;
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C122515uy r6 = (C122515uy) obj;
        if (r6 != null) {
            C145536u3 r4 = this.this$0;
            KeyPair keyPair = this.$keyPair;
            String str = this.$password;
            C160057kO r2 = this.$callback;
            PrivateKey privateKey = keyPair.getPrivate();
            AnonymousClass00C.A08(privateKey);
            try {
                r2.Bi5(AnonymousClass1UW.A00(C113275fH.A00, str, C130936Na.A02(r6, r4.A00, privateKey)));
            } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                r2.BWk(e);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
