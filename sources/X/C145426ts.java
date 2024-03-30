package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6ts  reason: invalid class name and case insensitive filesystem */
public final class C145426ts implements C160047kN {
    public final /* synthetic */ C160057kO A00;
    public final /* synthetic */ C159797jw A01;
    public final /* synthetic */ C145546u7 A02;
    public final /* synthetic */ PrivateKey A03;

    public void BWj(AnonymousClass5V6 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01.BWj(r2);
    }

    public C145426ts(C160057kO r1, C159797jw r2, C145546u7 r3, PrivateKey privateKey) {
        this.A03 = privateKey;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BVK() {
        this.A00.BVK();
    }

    public void BiS(C122515uy r3, Integer num) {
        JSONObject jSONObject;
        if (r3 != null) {
            try {
                PrivateKey privateKey = this.A03;
                if (privateKey != null) {
                    jSONObject = C130936Na.A02(r3, this.A02.A01, privateKey);
                    this.A01.BiI(jSONObject);
                }
            } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                this.A00.BWk(e);
                return;
            }
        }
        jSONObject = null;
        this.A01.BiI(jSONObject);
    }
}
