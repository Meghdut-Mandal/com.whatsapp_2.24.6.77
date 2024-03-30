package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.security.PublicKey;
import java.security.Signature;
import org.json.JSONObject;

/* renamed from: X.6HT  reason: invalid class name */
public class AnonymousClass6HT {
    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.Certificate A01(java.lang.String r4) {
        /*
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r0)
            java.lang.Class<X.6HT> r0 = X.AnonymousClass6HT.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.io.InputStream r2 = r0.getResourceAsStream(r4)
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r2)
            java.security.cert.Certificate r0 = r3.generateCertificate(r1)     // Catch:{ all -> 0x0020 }
            r1.close()     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            r2.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            return r0
        L_0x0020:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            r2.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6HT.A01(java.lang.String):java.security.cert.Certificate");
    }

    public static Boolean A00(JSONObject jSONObject) {
        String string = jSONObject.getString("riskRules");
        String string2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
        PublicKey publicKey = A01(new String(Base64.decode("c2lnbmVyLmNydA==", 2))).getPublicKey();
        byte[] bytes = string.getBytes("UTF8");
        byte[] decode = Base64.decode(string2, 2);
        Signature instance = Signature.getInstance("SHA512withRSA/PSS");
        instance.initVerify(publicKey);
        instance.update(bytes);
        return Boolean.valueOf(instance.verify(decode));
    }
}
