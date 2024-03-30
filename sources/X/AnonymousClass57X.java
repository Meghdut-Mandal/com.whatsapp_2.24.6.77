package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.57X  reason: invalid class name */
public class AnonymousClass57X extends C145416tr {
    public final /* synthetic */ AnonymousClass6u5 A00;
    public final /* synthetic */ C160057kO A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ KeyPair A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass57X(AnonymousClass6u5 r1, C160057kO r2, C160057kO r3, String str, KeyPair keyPair) {
        super(r2);
        this.A00 = r1;
        this.A03 = keyPair;
        this.A02 = str;
        this.A01 = r3;
    }

    public void BiS(C122515uy r5, Integer num) {
        try {
            AnonymousClass6u5 r3 = this.A00;
            JSONObject A022 = C130936Na.A02(r5, r3.A00, this.A03.getPrivate());
            this.A01.Bi5(AnonymousClass1UW.A00(r3.A01, this.A02, A022));
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            this.A01.BWk(e);
        }
    }
}
