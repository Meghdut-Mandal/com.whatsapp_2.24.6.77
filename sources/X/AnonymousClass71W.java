package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.71W  reason: invalid class name */
public final class AnonymousClass71W implements C159797jw {
    public final /* synthetic */ AnonymousClass6OQ A00;
    public final /* synthetic */ C160057kO A01;
    public final /* synthetic */ C128936Ee A02;
    public final /* synthetic */ C145546u7 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ PublicKey A05;
    public final /* synthetic */ X509Certificate A06;

    public void BWj(AnonymousClass5V6 r20) {
        C162987pT r3;
        AnonymousClass6OH r0;
        AnonymousClass5V6 r14 = r20;
        AnonymousClass00C.A0D(r14, 0);
        C145546u7 r7 = this.A03;
        C160057kO r5 = this.A01;
        X509Certificate x509Certificate = this.A06;
        PublicKey publicKey = this.A05;
        int intValue = this.A04.intValue();
        AnonymousClass6OQ r4 = this.A00;
        C128936Ee r6 = this.A02;
        int A002 = AnonymousClass3ME.A00(r14.node);
        C160057kO r12 = r5;
        C128936Ee r13 = r6;
        C145546u7 r15 = r7;
        if (!C145546u7.A06(r12, r13, r14, r15, new C1503674z(r4, r5, r6, r7, publicKey, x509Certificate, intValue, 4), A002)) {
            if (A002 == 401) {
                r3 = new C162987pT(r4, r5, r6, r7, 4);
                boolean A032 = r6.A03();
                r0 = r7.A05;
                if (A032) {
                    r0.A00(r5, r14);
                    return;
                }
            } else if (A002 == 480) {
                r0 = r7.A05;
                r3 = new C162987pT(r4, r5, r6, r7, 5);
            } else if (A002 != 484) {
                C90464aC.A1M("unexpected error code: ", AnonymousClass000.A0u(), A002);
                r5.BWk(r14);
                return;
            } else {
                C145546u7.A02(r4, r12, r13, r14, r15, publicKey, x509Certificate, intValue);
                return;
            }
            r0.A01(r6, r3, r14);
        }
    }

    public AnonymousClass71W(AnonymousClass6OQ r1, C160057kO r2, C128936Ee r3, C145546u7 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = x509Certificate;
        this.A05 = publicKey;
        this.A04 = num;
        this.A02 = r3;
    }

    public void BiI(JSONObject jSONObject) {
        C145546u7 r2 = this.A03;
        JSONObject jSONObject2 = jSONObject;
        C18740tg.A06(jSONObject2);
        String string = new JSONObject(jSONObject2.getString("data")).getString("access_token");
        AnonymousClass00C.A08(string);
        AnonymousClass00C.A0B(jSONObject2);
        long j = C90484aE.A0y("data", jSONObject2).getLong("timestamp");
        AnonymousClass6OQ r5 = this.A00;
        Object obj = r5.A04.A00;
        C18740tg.A06(obj);
        Number number = (Number) obj;
        long j2 = C90484aE.A0y("data", jSONObject2).getLong("fbid");
        if (number == null || number.longValue() != j2) {
            this.A01.BWk(AnonymousClass001.A09("ids do not match"));
        } else {
            C160057kO r1 = this.A01;
            C18740tg.A06(obj);
            AnonymousClass00C.A08(obj);
            long A09 = C36431kI.A09(obj);
            Object obj2 = r5.A05.A00;
            C18740tg.A06(obj2);
            String str = r5.A08;
            r1.Bi5(new AnonymousClass6OQ(r5.A01, (Long) null, (String) obj2, string, str, A09, j));
        }
        ((AnonymousClass1UC) r2.A06.get()).A0A(C36381kD.A0j());
    }
}
