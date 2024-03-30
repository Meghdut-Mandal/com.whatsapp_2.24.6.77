package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.71Y  reason: invalid class name */
public final class AnonymousClass71Y implements C159797jw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C160057kO A01;
    public final /* synthetic */ C128936Ee A02;
    public final /* synthetic */ C135086c7 A03;
    public final /* synthetic */ C135086c7 A04;
    public final /* synthetic */ C135086c7 A05;
    public final /* synthetic */ C135086c7 A06;
    public final /* synthetic */ C135086c7 A07;
    public final /* synthetic */ C145546u7 A08;
    public final /* synthetic */ Integer A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ PublicKey A0B;
    public final /* synthetic */ X509Certificate A0C;

    public void BWj(AnonymousClass5V6 r23) {
        AnonymousClass5V6 r0 = r23;
        AnonymousClass00C.A0D(r0, 0);
        C145546u7 r11 = this.A08;
        C135086c7 r6 = this.A03;
        Integer num = this.A09;
        C135086c7 r7 = this.A05;
        C135086c7 r8 = this.A04;
        C135086c7 r9 = this.A06;
        C135086c7 r10 = this.A07;
        C160057kO r4 = this.A01;
        X509Certificate x509Certificate = this.A0C;
        PublicKey publicKey = this.A0B;
        int i = this.A00;
        C128936Ee r5 = this.A02;
        int A002 = AnonymousClass3ME.A00(r0.node);
        if (C145546u7.A06(r4, r5, r0, r11, new AnonymousClass74K(r4, r5, r6, r7, r8, r9, r10, r11, num, publicKey, x509Certificate, i), A002)) {
            return;
        }
        if (A002 == 480) {
            r11.A05.A01(r5, new C107425Ov(r4, r5, r6, r7, r8, r9, r10, r11, num), r0);
        } else if (A002 != 484) {
            C90464aC.A1M("unexpected error code: ", AnonymousClass000.A0u(), A002);
            r4.BWk(r0);
        } else {
            C145546u7.A02((AnonymousClass6OQ) null, r4, r5, r0, r11, publicKey, x509Certificate, i);
        }
    }

    public AnonymousClass71Y(C160057kO r1, C128936Ee r2, C135086c7 r3, C135086c7 r4, C135086c7 r5, C135086c7 r6, C135086c7 r7, C145546u7 r8, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A08 = r8;
        this.A01 = r1;
        this.A0A = str;
        this.A03 = r3;
        this.A09 = num;
        this.A05 = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A0C = x509Certificate;
        this.A0B = publicKey;
        this.A00 = i;
        this.A02 = r2;
    }

    public void BiI(JSONObject jSONObject) {
        C160057kO r2;
        Exception A092;
        C18740tg.A06(jSONObject);
        try {
            AnonymousClass00C.A0B(jSONObject);
            int i = C90484aE.A0y("data", jSONObject).getInt("response_code");
            if (i != 0) {
                if (i != 1) {
                    r2 = this.A01;
                    if (i != 2) {
                        A092 = C90464aC.A0R("unknown code: ", AnonymousClass000.A0u(), i);
                    } else {
                        A092 = new AnonymousClass57K();
                    }
                } else {
                    r2 = this.A01;
                    A092 = AnonymousClass001.A09("invalid auth token");
                }
                r2.BWk(A092);
                return;
            }
        } catch (JSONException unused) {
        }
        C160057kO r22 = this.A01;
        AnonymousClass00C.A0B(jSONObject);
        long j = C90484aE.A0y("data", jSONObject).getLong("fbid");
        r22.Bi5(new AnonymousClass6OQ(C145546u7.A0B, (Long) null, this.A0A, "dummy access token", (String) null, j, C90484aE.A0y("data", jSONObject).getLong("timestamp")));
    }
}
