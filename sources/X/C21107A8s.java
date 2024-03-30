package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.A8s  reason: case insensitive filesystem */
public final class C21107A8s implements C23022B0s {
    public final /* synthetic */ AnonymousClass1KM A00;
    public final /* synthetic */ C207109uZ A01;

    public void BYU(UserJid userJid) {
        StringBuilder A0u = AnonymousClass000.A0u();
        String A0q = AnonymousClass000.A0q(C165607th.A0r(userJid, "Business JID: ", A0u), A0u);
        AnonymousClass1KM r2 = this.A00;
        r2.A0A.A1M(userJid.getRawString());
        r2.A04(userJid);
        r2.A04.A0E("direct-connection-public-key-error-response", A0q, false);
    }

    public C21107A8s(AnonymousClass1KM r1, C207109uZ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BYV(UserJid userJid, String str, String str2, String str3) {
        Log.i("DirectConnectionManager/onGetBusinessPublicKeySuccess");
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            String str4 = C19430v1.A0B;
            AnonymousClass00C.A09(str4);
            Charset forName = Charset.forName(str4);
            AnonymousClass00C.A08(forName);
            byte[] bytes = str.getBytes(forName);
            AnonymousClass00C.A08(bytes);
            Collection<? extends Certificate> generateCertificates = instance.generateCertificates(C90524aI.A0P(bytes));
            AnonymousClass00C.A0B(generateCertificates);
            ArrayList A0J = C36321k7.A0J(generateCertificates);
            for (Object next : generateCertificates) {
                AnonymousClass00C.A0E(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                A0J.add(next);
            }
            X509Certificate[] x509CertificateArr = (X509Certificate[]) A0J.toArray(new X509Certificate[0]);
            AnonymousClass00C.A0D(x509CertificateArr, 0);
            TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance2.init((KeyStore) null);
            TrustManager trustManager = instance2.getTrustManagers()[0];
            AnonymousClass00C.A0E(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, "RSA");
            String A13 = C36441kJ.A13(x509CertificateArr[0].getEncoded());
            AnonymousClass1KM r10 = this.A00;
            C36341k9.A0x(C19420v0.A00(r10.A0A), AnonymousClass000.A0p("smb_business_direct_connection_public_key_", userJid.getRawString(), AnonymousClass000.A0u()), A13);
            AnonymousClass1KM.A00(r10, this.A01, userJid);
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
            Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/", e);
            AnonymousClass1KM r3 = this.A00;
            r3.A04(userJid);
            StringBuilder A0v = AnonymousClass000.A0v("\n                        Business JID: ");
            A0v.append(userJid.getRawString());
            A0v.append("\n                        Exception: ");
            A0v.append(e);
            String A012 = AnonymousClass091.A01(AnonymousClass000.A0q("\n                        ", A0v));
            boolean z = e instanceof NoSuchAlgorithmException;
            C19700wN r0 = r3.A04;
            if (z) {
                r0.A0E("direct-connection-certificate-exception-no-such-algorithm", A012, true);
            } else {
                r0.A0E("direct-connection-certificate-exception", A012, true);
            }
        }
    }
}
