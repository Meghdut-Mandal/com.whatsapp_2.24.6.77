package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4xQ  reason: invalid class name and case insensitive filesystem */
public final class C101364xQ extends C145406tq {
    public final /* synthetic */ AnonymousClass6u4 A00;
    public final /* synthetic */ AnonymousClass6OQ A01;
    public final /* synthetic */ C160057kO A02;
    public final /* synthetic */ KeyPair A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101364xQ(AnonymousClass6u4 r1, AnonymousClass6OQ r2, C160057kO r3, KeyPair keyPair) {
        super(r3);
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = keyPair;
        this.A01 = r2;
    }

    public void BiS(C122515uy r5, Integer num) {
        try {
            JSONObject A022 = C130936Na.A02(r5, this.A00.A02, this.A03.getPrivate());
            C160057kO r2 = this.A02;
            AnonymousClass6OQ r1 = this.A01;
            AnonymousClass6OQ.A01(r1, r2, C135086c7.A00(r1.A04), A022);
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            this.A02.BWk(e);
        }
    }
}
