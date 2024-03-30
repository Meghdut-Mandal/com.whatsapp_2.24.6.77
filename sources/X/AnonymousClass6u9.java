package X;

import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;

/* renamed from: X.6u9  reason: invalid class name */
public class AnonymousClass6u9 implements C160067kP {
    public final /* synthetic */ AnonymousClass6LK A00;
    public final /* synthetic */ AnonymousClass6P0 A01;
    public final /* synthetic */ C160077kQ A02;
    public final /* synthetic */ AnonymousClass6Mw A03;

    public AnonymousClass6u9(AnonymousClass6LK r1, AnonymousClass6P0 r2, C160077kQ r3, AnonymousClass6Mw r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void BVM(Exception exc) {
        PublicKey publicKey;
        AnonymousClass6LK r5 = this.A00;
        C160077kQ r4 = this.A02;
        if (r5 != null) {
            try {
                X509Certificate x509Certificate = r5.A04;
                X509Certificate x509Certificate2 = r5.A05;
                String str = r5.A03;
                if (str == null) {
                    publicKey = null;
                } else {
                    publicKey = AnonymousClass6UE.A05(str);
                }
                r4.BiT(r5.A02, publicKey, x509Certificate, x509Certificate2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        r4.BVM(exc);
    }

    public void BWk(Exception exc) {
        PublicKey publicKey;
        AnonymousClass6LK r5 = this.A00;
        C160077kQ r4 = this.A02;
        if (r5 != null) {
            try {
                X509Certificate x509Certificate = r5.A04;
                X509Certificate x509Certificate2 = r5.A05;
                String str = r5.A03;
                if (str == null) {
                    publicKey = null;
                } else {
                    publicKey = AnonymousClass6UE.A05(str);
                }
                r4.BiT(r5.A02, publicKey, x509Certificate, x509Certificate2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        r4.BWk(exc);
    }

    public void BiU(Integer num, String str, String str2, String str3, String str4, String str5) {
        try {
            AnonymousClass6Mw.A00(this.A01, this.A02, this.A03, num, str2, str3, str4, str5);
        } catch (CertificateExpiredException unused) {
            AnonymousClass6Mw r2 = this.A03;
            C132196Sp r0 = r2.A01;
            AnonymousClass6P0 r1 = this.A01;
            r0.A02(r1);
            ((AnonymousClass6CN) ((AnonymousClass004) C90514aH.A0p(r1, ((C117245lw) r2.A02.get()).A00)).get()).A00(new C145556u8(this));
        }
    }
}
