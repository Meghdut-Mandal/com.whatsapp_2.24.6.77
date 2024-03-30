package X;

import android.net.TrafficStats;
import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.List;
import javax.crypto.SecretKey;

public class AVr implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public AVr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A05 = str;
        this.A04 = obj5;
    }

    public final void run() {
        String str;
        String A002;
        switch (this.A06) {
            case 0:
                C145166tS r6 = (C145166tS) this.A00;
                C18820ts r1 = (C18820ts) this.A01;
                C20810yC r5 = (C20810yC) this.A02;
                AnonymousClass17Y r4 = (AnonymousClass17Y) this.A03;
                String str2 = this.A05;
                C21010yW r2 = (C21010yW) this.A04;
                try {
                    TrafficStats.setThreadStatsTag(5);
                    r6.A0H(r5, r1.A06());
                    if (r6.A0I()) {
                        r4.A0H(new C80383vJ(r6, str2, 0, false));
                        r6.A0G(r5);
                    }
                    r6.A0D();
                } catch (IOException | RuntimeException | URISyntaxException unused) {
                } catch (Throwable th) {
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                TrafficStats.clearThreadStatsTag();
                C1041258j r0 = r6.A04;
                if (r0 != null) {
                    r2.Bly(r0);
                }
                r4.A0H(new C80383vJ(r6, str2, 0, true));
                return;
            case 1:
                AnonymousClass9Y1 r7 = (AnonymousClass9Y1) this.A00;
                String str3 = this.A05;
                C176468cA r12 = new C176468cA();
                r12.A04 = r7.A08.A00((Jid) this.A01);
                r12.A05 = r7.A02;
                r12.A06 = str3;
                r12.A03 = C36441kJ.A0y(r7.A0D.getAndIncrement());
                r12.A01 = (Integer) this.A02;
                r12.A00 = (Integer) this.A03;
                r12.A02 = (Long) this.A04;
                r7.A07.Bly(r12);
                return;
            case 2:
                C198219d6 r52 = (C198219d6) this.A00;
                UserJid userJid = (UserJid) this.A01;
                AnonymousClass6A4 r10 = (AnonymousClass6A4) this.A02;
                String str4 = this.A05;
                C006302t r3 = (C006302t) this.A03;
                C207109uZ r22 = (C207109uZ) this.A04;
                C36331k8.A1G(userJid, 1, r3);
                AnonymousClass1KM r62 = r52.A04;
                C19420v0 r17 = r62.A0A;
                String A0t = C36371kC.A0t(C36341k9.A0E(r17), AnonymousClass000.A0p("dc_business_domain_", userJid.getRawString(), AnonymousClass000.A0u()));
                String str5 = r10.A01;
                C200939iV r72 = null;
                if (A0t != null) {
                    if (!r52.A05.A0E(3401) || !AnonymousClass00C.A0J(str5, r52.A01) || (A002 = r52.A00) == null || str4 == null) {
                        try {
                            String A012 = r62.A01(userJid);
                            if (A012 == null) {
                                Log.e("DirectConnectionManager/generateEncryptionStringFromSearchQuery/Null certificate");
                                r62.A04.A0E("direct-connection-failed-to-load-certificate-from-preferences", "", false);
                            } else {
                                Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(C90524aI.A0P(Base64.decode(A012, 2)));
                                AnonymousClass00C.A0E(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                X509Certificate x509Certificate = (X509Certificate) generateCertificate;
                                String name = x509Certificate.getSubjectX500Principal().getName();
                                AnonymousClass00C.A08(name);
                                if (!A0t.equals(C109845Zi.A00(name))) {
                                    Log.e("DirectConnectionManager/generateEncryptionStringFromSearchQuery/Incorrect CN in certificate");
                                    r62.A04.A0E("direct-connection-certificate-common-name-mismatch", "", false);
                                    r17.A1M(userJid.getRawString());
                                } else {
                                    AnonymousClass1KN r15 = r62.A07;
                                    PublicKey publicKey = x509Certificate.getPublicKey();
                                    AnonymousClass00C.A08(publicKey);
                                    C193019Jn A003 = AnonymousClass1KN.A00(str5);
                                    SecretKey secretKey = A003.A00;
                                    byte[] A013 = AnonymousClass1KN.A01(publicKey, secretKey);
                                    r15.A00 = secretKey.getEncoded();
                                    byte[] bArr = A003.A02;
                                    r15.A01 = bArr;
                                    A002 = C109855Zj.A00(A003.A01, A013, bArr);
                                    if (A002 != null) {
                                    }
                                }
                            }
                        } catch (IllegalArgumentException | GeneralSecurityException e) {
                            Log.e("DirectConnectionManager/generateEncryptionStringFromSearchQuery/", e);
                            r62.A04.A0E("direct-connection-fail-to-generate-encryption-string", e.toString(), false);
                        }
                        str = "CatalogSearchCatalogPageRequestFactory/createRequest/EN";
                        Log.e(str);
                        r62.A03(new C21101A8m(r52), r22, userJid, false);
                    }
                    r52.A01 = str5;
                    r52.A00 = A002;
                    r72 = C198219d6.A00(r52, r10, r22, A002, "V1", str4);
                } else {
                    str = "CatalogSearchCatalogPageRequestFactory/createRequest/DN";
                    Log.e(str);
                    r62.A03(new C21101A8m(r52), r22, userJid, false);
                }
                r3.invoke(r72);
                return;
            case 3:
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = (P2mLiteOrderDetailsActivity) this.A00;
                Calendar calendar = (Calendar) this.A01;
                String str6 = this.A05;
                P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = (P2mLiteConfirmDateOfBirthBottomSheetFragment) this.A02;
                PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A03;
                AnonymousClass2bZ r13 = (AnonymousClass2bZ) this.A04;
                C36341k9.A1E(str6, 2, p2mLiteConfirmDateOfBirthBottomSheetFragment);
                C195389Uc r23 = p2mLiteOrderDetailsActivity.A0F;
                if (r23 != null) {
                    r23.A00(new C21266AEw(p2mLiteConfirmDateOfBirthBottomSheetFragment, p2mLiteOrderDetailsActivity, paymentBottomSheet, r13, str6), "p2m-lite-buyer-check", (String) null, calendar.get(1), calendar.get(2), calendar.get(5));
                    return;
                }
                throw C36331k8.A0d("paymentsComplianceManager");
            default:
                C134876bk r32 = (C134876bk) this.A01;
                AnonymousClass639 r42 = (AnonymousClass639) this.A03;
                C128936Ee r24 = (C128936Ee) this.A04;
                AnonymousClass00C.A0D(r32, 1);
                C130286Km.A00(r24, r32, r42, (C130286Km) this.A00, this.A05, (List) this.A02);
                return;
        }
    }
}
