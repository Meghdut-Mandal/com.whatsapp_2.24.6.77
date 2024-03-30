package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6xk  reason: invalid class name and case insensitive filesystem */
public final class C147766xk implements C236119d {
    public final /* synthetic */ AnonymousClass6OQ A00;
    public final /* synthetic */ C160057kO A01;
    public final /* synthetic */ C128936Ee A02;
    public final /* synthetic */ C145546u7 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ PublicKey A05;
    public final /* synthetic */ X509Certificate A06;

    public void BiM(C203399nx r7, String str) {
        AnonymousClass1UB r2;
        long j;
        AnonymousClass00C.A0D(r7, 1);
        C145546u7 r5 = this.A03;
        ((AnonymousClass1UC) r5.A06.get()).A0A(false);
        C203399nx A0c = r7.A0c("ping_interval");
        int A0S = r7.A0S("ping_interval", -1);
        if (A0c != null && A0c.A0e() != null) {
            r2 = r5.A03;
            String A0e = A0c.A0e();
            if (A0e != null) {
                j = Long.parseLong(A0e);
            } else {
                throw C36381kD.A0l();
            }
        } else if (A0S != -1) {
            r2 = r5.A03;
            j = (long) A0S;
        } else {
            this.A01.BWk(AnonymousClass001.A09("ping interval not present"));
            return;
        }
        r2.A01(j);
        C36331k8.A0w(AnonymousClass1UB.A00(r2).edit(), "pref_ping_one_time_delay_for_server_error", false);
        this.A01.Bi5(this.A00);
    }

    public C147766xk(AnonymousClass6OQ r1, C160057kO r2, C128936Ee r3, C145546u7 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = x509Certificate;
        this.A05 = publicKey;
        this.A04 = num;
        this.A02 = r3;
    }

    public void BVN(String str) {
        this.A01.BVK();
    }

    public void BWw(C203399nx r27, String str) {
        C203399nx r2 = r27;
        String str2 = str;
        C36321k7.A0w(str2, r2);
        C145546u7 r8 = this.A03;
        AnonymousClass5V6 r11 = new AnonymousClass5V6(r2, str2);
        C160057kO r7 = this.A01;
        X509Certificate x509Certificate = this.A06;
        PublicKey publicKey = this.A05;
        AnonymousClass00C.A0B(publicKey);
        Integer num = this.A04;
        int A07 = C36411kG.A07(num);
        AnonymousClass6OQ r5 = this.A00;
        C128936Ee r10 = this.A02;
        int A002 = AnonymousClass3ME.A00(r11.node);
        C145546u7 r21 = r8;
        AnonymousClass6OQ r18 = r5;
        C160057kO r19 = r7;
        C1503674z r17 = new C1503674z(r18, r19, r10, r21, publicKey, x509Certificate, A07, 2);
        if (A002 == 500) {
            AnonymousClass1UB r3 = r8.A03;
            if (!C36371kC.A1U(AnonymousClass1UB.A00(r3), "pref_ping_one_time_delay_for_server_error")) {
                long A0B = C36441kJ.A0B(r8.A02, 2042);
                if (A0B > 0) {
                    r3.A01(TimeUnit.HOURS.toSeconds(A0B));
                    C36331k8.A0w(AnonymousClass1UB.A00(r3).edit(), "pref_ping_one_time_delay_for_server_error", true);
                    r7.Bi5(r5);
                    return;
                }
            }
        }
        if (!C145546u7.A06(r7, r10, r11, r21, r17, A002)) {
            if (A002 != 401) {
                if (A002 == 480) {
                    r8.A05.A01(r10, new C162987pT(r5, r7, r10, r8, 1), r11);
                    return;
                } else if (A002 != 484) {
                    C90464aC.A1M("unexpected error code: ", AnonymousClass000.A0u(), A002);
                } else {
                    C145546u7.A02(r5, r7, r10, r11, r8, publicKey, x509Certificate, A07);
                    return;
                }
            } else if (r10.A04()) {
                r8.BlZ(r5, new C145506u0(r7, r10, r8, publicKey, x509Certificate, A07), new C128936Ee(1, AnonymousClass6X5.A0L), num, publicKey, x509Certificate);
                return;
            }
            r7.BWk(r11);
        }
    }
}
