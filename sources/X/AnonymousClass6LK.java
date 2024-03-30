package X;

import android.util.Base64;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.6LK  reason: invalid class name */
public class AnonymousClass6LK {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final String A03;
    public final X509Certificate A04;
    public final X509Certificate A05;

    public AnonymousClass6LK(String str) {
        JSONObject A1C = C36441kJ.A1C(str);
        byte[] decode = Base64.decode(A1C.getString("e_cert"), 3);
        byte[] A1b = C90514aH.A1b("s_cert", A1C, 3);
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        this.A04 = (X509Certificate) instance.generateCertificate(C90524aI.A0P(decode));
        this.A05 = (X509Certificate) instance.generateCertificate(C90524aI.A0P(A1b));
        this.A00 = A1C.optInt("ttl");
        this.A01 = A1C.optLong("ts");
        this.A03 = A1C.optString("ppk");
        this.A02 = Integer.valueOf(A1C.optInt("ppk_id"));
    }

    public AnonymousClass6LK(Integer num, String str, X509Certificate x509Certificate, X509Certificate x509Certificate2, int i, long j) {
        this.A04 = x509Certificate;
        this.A05 = x509Certificate2;
        this.A00 = i;
        this.A01 = j;
        this.A03 = str;
        this.A02 = num;
    }
}
