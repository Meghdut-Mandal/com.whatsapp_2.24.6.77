package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.71V  reason: invalid class name */
public final class AnonymousClass71V implements C159797jw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6OQ A01;
    public final /* synthetic */ C160057kO A02;
    public final /* synthetic */ C128936Ee A03;
    public final /* synthetic */ C145546u7 A04;
    public final /* synthetic */ PublicKey A05;
    public final /* synthetic */ X509Certificate A06;

    public void BWj(AnonymousClass5V6 r17) {
        C162987pT r5;
        AnonymousClass6OH r0;
        AnonymousClass5V6 r11 = r17;
        AnonymousClass00C.A0D(r11, 0);
        C145546u7 r4 = this.A04;
        AnonymousClass6OQ r1 = this.A01;
        C160057kO r2 = this.A02;
        X509Certificate x509Certificate = this.A06;
        PublicKey publicKey = this.A05;
        int i = this.A00;
        C128936Ee r3 = this.A03;
        int A002 = AnonymousClass3ME.A00(r11.node);
        C160057kO r9 = r2;
        C128936Ee r10 = r3;
        C145546u7 r12 = r4;
        if (!C145546u7.A06(r9, r10, r11, r12, new C1503674z(r1, r2, r3, r4, publicKey, x509Certificate, i), A002)) {
            if (A002 == 401) {
                r5 = new C162987pT(r1, r2, r3, r4, 2);
                boolean A032 = r3.A03();
                r0 = r4.A05;
                if (A032) {
                    r0.A00(r2, r11);
                    return;
                }
            } else if (A002 == 480) {
                r0 = r4.A05;
                r5 = new C162987pT(r1, r2, r3, r4, 3);
            } else if (A002 != 484) {
                C90464aC.A1M("unexpected error code: ", AnonymousClass000.A0u(), A002);
                r2.BWk(r11);
                return;
            } else {
                C145546u7.A02(r1, r9, r10, r11, r12, publicKey, x509Certificate, i);
                return;
            }
            r0.A01(r3, r5, r11);
        }
    }

    public AnonymousClass71V(AnonymousClass6OQ r1, C160057kO r2, C128936Ee r3, C145546u7 r4, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A01 = r1;
        this.A04 = r4;
        this.A02 = r2;
        this.A06 = x509Certificate;
        this.A05 = publicKey;
        this.A00 = i;
        this.A03 = r3;
    }

    public void BiI(JSONObject jSONObject) {
        C18740tg.A06(jSONObject);
        AnonymousClass6OQ r3 = this.A01;
        Object obj = r3.A04.A00;
        C18740tg.A06(obj);
        Number number = (Number) obj;
        C145546u7 r8 = this.A04;
        AnonymousClass00C.A0B(jSONObject);
        long j = C90484aE.A0y("data", jSONObject).getLong("fbid");
        if (number == null || number.longValue() != j) {
            this.A02.BWk(AnonymousClass001.A09("ids do not match"));
            return;
        }
        ((AnonymousClass1UC) r8.A06.get()).A0A(C36381kD.A0j());
        C160057kO r2 = this.A02;
        C18740tg.A06(obj);
        AnonymousClass00C.A08(obj);
        long A09 = C36431kI.A09(obj);
        Object obj2 = r3.A05.A00;
        C18740tg.A06(obj2);
        String string = new JSONObject(jSONObject.getString("data")).getString("access_token");
        long j2 = C90484aE.A0y("data", jSONObject).getLong("timestamp");
        String str = r3.A08;
        r2.Bi5(new AnonymousClass6OQ(r3.A01, (Long) null, (String) obj2, string, str, A09, j2));
    }
}
