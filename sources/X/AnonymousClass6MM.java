package X;

import java.io.StringReader;
import java.security.Key;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.xml.security.signature.XMLSignature;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: X.6MM  reason: invalid class name */
public class AnonymousClass6MM {
    public Certificate A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|7) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0026 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.security.cert.Certificate A00(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r0)
            java.lang.Class r0 = r4.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.io.InputStream r2 = r0.getResourceAsStream(r5)
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r2)
            java.security.cert.Certificate r0 = r3.generateCertificate(r1)     // Catch:{ all -> 0x0022 }
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            r2.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            return r0
        L_0x0022:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            r2.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MM.A00(java.lang.String):java.security.cert.Certificate");
    }

    public boolean A01(String str) {
        if (this.A00 == null) {
            try {
                this.A00 = A00(new String(AnonymousClass6HS.A01("c2lnbmVyLmNydA==".getBytes())));
            } catch (CertificateException unused) {
                System.out.println("Error in loading certificate.");
                return false;
            }
        }
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
            PublicKey publicKey = this.A00.getPublicKey();
            NodeList elementsByTagNameNS = parse.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Signature");
            if (elementsByTagNameNS.getLength() != 0) {
                Log log = XMLSignature.a;
                return new XMLSignature((Element) elementsByTagNameNS.item(0), "").a((Key) publicKey);
            }
            throw new Exception("Signature not found");
        } catch (Exception | ParserConfigurationException | SAXException unused2) {
            return false;
        }
    }

    public AnonymousClass6MM() {
        try {
            this.A00 = A00(new String(AnonymousClass6HS.A01("c2lnbmVyLmNydA==".getBytes())));
        } catch (CertificateException unused) {
        }
    }
}
