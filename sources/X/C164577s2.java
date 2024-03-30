package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.7s2  reason: invalid class name and case insensitive filesystem */
public class C164577s2 implements C159797jw {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public C164577s2(C160057kO r1, C128936Ee r2, C145546u7 r3, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A07 = i;
        if (i != 0) {
            this.A00 = r1;
            this.A05 = r3;
            this.A01 = x509Certificate;
            this.A04 = publicKey;
            this.A03 = num;
            this.A02 = r2;
            this.A06 = str;
        } else {
            this.A05 = r3;
            this.A01 = x509Certificate;
            this.A00 = r1;
            this.A06 = str;
            this.A04 = publicKey;
            this.A03 = num;
            this.A02 = r2;
        }
    }

    public void BWj(AnonymousClass5V6 r20) {
        AnonymousClass5V6 r15 = r20;
        if (this.A07 != 0) {
            AnonymousClass00C.A0D(r15, 0);
            C145546u7 r5 = (C145546u7) this.A05;
            Object obj = this.A01;
            Object obj2 = this.A04;
            Object obj3 = this.A03;
            C160057kO r9 = (C160057kO) this.A00;
            C128936Ee r10 = (C128936Ee) this.A02;
            String str = this.A06;
            int A002 = AnonymousClass3ME.A00(r15.node);
            AnonymousClass741 r4 = new AnonymousClass741(r5, obj, obj2, obj3, r9, r10, str, 0);
            if (!C145546u7.A07(r9, r10, r15, r5, r4, A002)) {
                if (A002 != 429) {
                    if (A002 == 481) {
                        AnonymousClass00C.A0D(r10, 0);
                        if (r10.A04()) {
                            r4.run();
                            return;
                        }
                    } else if (A002 != 500) {
                        C18740tg.A0D(false, AnonymousClass000.A0r("unexpected error code: ", AnonymousClass000.A0u(), A002));
                    }
                    r9.BWk(r15);
                    return;
                }
                AnonymousClass6OH r1 = r5.A05;
                AnonymousClass00C.A0D(r10, 0);
                Long A012 = r10.A01();
                if (A012 != null) {
                    r1.A00.BpM(r4, "WaffleIQErrorHelper/retry", A012.longValue());
                    return;
                }
                r9.BWk(r15);
                return;
            }
            return;
        }
        AnonymousClass00C.A0D(r15, 0);
        C145546u7 r6 = (C145546u7) this.A05;
        C160057kO r42 = (C160057kO) this.A00;
        PublicKey publicKey = (PublicKey) this.A04;
        int A0I = AnonymousClass000.A0I(this.A03);
        C128936Ee r52 = (C128936Ee) this.A02;
        int A003 = AnonymousClass3ME.A00(r15.node);
        if (!C145546u7.A07(r42, r52, r15, r6, new C81273wk(r42, r52, r6, publicKey, (X509Certificate) this.A01, A0I), A003)) {
            if (!(A003 == 304 || A003 == 409)) {
                if (A003 == 480) {
                    r6.A05.A01(r52, new AnonymousClass5Ou(r42, r52, r6), r15);
                    return;
                } else if (A003 != 488) {
                    C90464aC.A1M("unexpected error code: ", AnonymousClass000.A0u(), A003);
                    r42.BWk(r15);
                    return;
                }
            }
            r6.A05.A00(r42, r15);
        }
    }

    public void BiI(JSONObject jSONObject) {
        if (this.A07 != 0) {
            ((C160057kO) this.A00).Bi5((AnonymousClass6OQ) null);
            ((C130716Md) ((C145546u7) this.A05).A05.A01.get()).A01();
            return;
        }
        C146356vT A002 = C146356vT.A00();
        C18740tg.A06(jSONObject);
        C135086c7 r3 = new C135086c7(A002, Long.valueOf(C90484aE.A0y("data", jSONObject).getLong("fbid")), "WaFbid");
        C160057kO r1 = (C160057kO) this.A00;
        String str = this.A06;
        PublicKey publicKey = (PublicKey) this.A04;
        int A0I = AnonymousClass000.A0I(this.A03);
        C145546u7.A05(r1, (C128936Ee) this.A02, r3, (C145546u7) this.A05, str, publicKey, (X509Certificate) this.A01, A0I);
    }
}
