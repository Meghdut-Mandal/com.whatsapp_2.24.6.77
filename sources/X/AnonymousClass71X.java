package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.71X  reason: invalid class name */
public final class AnonymousClass71X implements C159797jw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C160057kO A01;
    public final /* synthetic */ C128936Ee A02;
    public final /* synthetic */ C135086c7 A03;
    public final /* synthetic */ C145546u7 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ PublicKey A06;
    public final /* synthetic */ X509Certificate A07;

    public void BWj(AnonymousClass5V6 r23) {
        AnonymousClass5V6 r0 = r23;
        AnonymousClass00C.A0D(r0, 0);
        C145546u7 r8 = this.A04;
        C160057kO r6 = this.A01;
        X509Certificate x509Certificate = this.A07;
        PublicKey publicKey = this.A06;
        int i = this.A00;
        long A09 = C36431kI.A09(C135086c7.A00(this.A03));
        AnonymousClass6OQ r12 = new AnonymousClass6OQ(C145546u7.A0B, (Long) null, this.A05, "dummy", (String) null, A09, -1);
        C128936Ee r7 = this.A02;
        int A002 = AnonymousClass3ME.A00(r0.node);
        if (C145546u7.A06(r6, r7, r0, r8, new C1503674z(r12, r6, r7, r8, publicKey, x509Certificate, i, 1), A002)) {
            return;
        }
        if (A002 == 304) {
            r8.BlZ(r12, r6, r7, Integer.valueOf(i), publicKey, x509Certificate);
        } else if (A002 == 401 || A002 == 409) {
            r8.A05.A00(r6, r0);
        } else if (A002 != 480) {
            C90464aC.A1M("unexpected error code: ", AnonymousClass000.A0u(), A002);
            r6.BWk(r0);
        } else {
            r8.A05.A01(r7, new C162987pT(r12, r6, r7, r8, 0), r0);
        }
    }

    public AnonymousClass71X(C160057kO r1, C128936Ee r2, C135086c7 r3, C145546u7 r4, String str, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A04 = r4;
        this.A05 = str;
        this.A03 = r3;
        this.A01 = r1;
        this.A07 = x509Certificate;
        this.A06 = publicKey;
        this.A00 = i;
        this.A02 = r2;
    }

    public void BiI(JSONObject jSONObject) {
        C18740tg.A06(jSONObject);
        String str = this.A05;
        C18740tg.A06(str);
        AnonymousClass6OQ A002 = AnonymousClass1UW.A00(C145546u7.A0B, str, jSONObject);
        Object obj = A002.A04.A00;
        C18740tg.A06(obj);
        Object obj2 = this.A03.A00;
        C18740tg.A06(obj2);
        if (AnonymousClass00C.A0J(obj, obj2)) {
            this.A01.Bi5(A002);
        } else {
            this.A01.BWk(AnonymousClass001.A09("ids do not match"));
        }
    }
}
