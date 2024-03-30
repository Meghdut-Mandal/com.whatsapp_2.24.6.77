package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.57Y  reason: invalid class name */
public class AnonymousClass57Y extends C145416tr {
    public final /* synthetic */ AnonymousClass6u5 A00;
    public final /* synthetic */ AnonymousClass6OQ A01;
    public final /* synthetic */ C160057kO A02;
    public final /* synthetic */ KeyPair A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass57Y(AnonymousClass6u5 r1, AnonymousClass6OQ r2, C160057kO r3, C160057kO r4, KeyPair keyPair) {
        super(r3);
        this.A00 = r1;
        this.A03 = keyPair;
        this.A02 = r4;
        this.A01 = r2;
    }

    public void BiS(C122515uy r5, Integer num) {
        try {
            JSONObject A022 = C130936Na.A02(r5, this.A00.A00, this.A03.getPrivate());
            C160057kO r2 = this.A02;
            AnonymousClass6OQ r1 = this.A01;
            Object obj = r1.A04.A00;
            C18740tg.A06(obj);
            AnonymousClass6OQ.A01(r1, r2, obj, A022);
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            this.A02.BWk(e);
        }
    }
}
