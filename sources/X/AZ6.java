package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class AZ6 implements X509TrustManager {
    public final /* synthetic */ C183218qP A00;

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr.length >= 1) {
            try {
                byte[] encoded = x509CertificateArr[0].getEncoded();
                byte[] bArr = AnonymousClass6XZ.A00;
                if (!C36441kJ.A13(C90504aG.A1a(encoded, "SHA-256")).equals(this.A00.A00.A05)) {
                    Log.e("fpm/HashCheckingSSLSocketFactory/certificate hash not matching");
                    throw new CertificateException("Certificate is not valid");
                }
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
                Log.e("fpm/HashCheckingSSLSocketFactory/failed to encode certificate", e);
                throw new CertificateException("Failed to encode certificate");
            }
        } else {
            throw new CertificateException("Chain have to have at least 1 certificate");
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    public AZ6(C183218qP r1) {
        this.A00 = r1;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Trust manager should not be used to checkClientTrusted");
    }
}
