package org.apache.xml.security.signature;

import X.C165577te;
import X.C165597tg;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.keys.KeyInfo;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;

public final class XMLSignature extends SignatureElementProxy {
    public static Log a;
    public static Class b;
    public SignedInfo c = null;
    public KeyInfo d = null;
    public boolean e = false;
    public Element f;
    public int g = 0;

    static {
        Class a2 = a("org.apache.xml.security.signature.XMLSignature");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public XMLSignature(Element element, String str) {
        super(element, str);
        Element a2 = XMLUtils.a(element.getFirstChild());
        if (a2 != null) {
            this.c = new SignedInfo(a2, str);
            Element a3 = XMLUtils.a(XMLUtils.a(element.getFirstChild()).getNextSibling());
            this.f = a3;
            if (a3 != null) {
                Element a4 = XMLUtils.a(a3.getNextSibling());
                if (a4 != null && a4.getNamespaceURI().equals("http://www.w3.org/2000/09/xmldsig#") && a4.getLocalName().equals("KeyInfo")) {
                    this.d = new KeyInfo(a4, str);
                }
                this.g = 1;
                return;
            }
            throw new XMLSignatureException("xml.WrongContent", new Object[]{"SignatureValue", "Signature"});
        }
        throw new XMLSignatureException("xml.WrongContent", new Object[]{"SignedInfo", "Signature"});
    }

    public SignedInfo a() {
        return this.c;
    }

    public String e() {
        return "Signature";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091 A[ExcHandler: XMLSignatureException (r2v1 'e' org.apache.xml.security.signature.XMLSignatureException A[CUSTOM_DECLARE]), Splitter:B:2:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.security.Key r8) {
        /*
            r7 = this;
            java.lang.String r3 = "empty"
            r6 = 0
            if (r8 == 0) goto L_0x0093
            org.apache.xml.security.signature.SignedInfo r4 = r7.c     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            org.apache.xml.security.algorithms.SignatureAlgorithm r5 = r4.g     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            org.apache.commons.logging.Log r0 = a     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            if (r0 == 0) goto L_0x0052
            org.apache.commons.logging.Log r2 = a     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.String r0 = "SignatureMethodURI = "
            r1.append(r0)     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.String r0 = r5.a()     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            X.C165567td.A1Q(r0, r1, r2)     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            org.apache.commons.logging.Log r2 = a     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.String r0 = "jceSigAlgorithm    = "
            r1.append(r0)     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.String r0 = r5.b()     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            X.C165567td.A1Q(r0, r1, r2)     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            org.apache.commons.logging.Log r2 = a     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.String r0 = "jceSigProvider     = "
            r1.append(r0)     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.String r0 = r5.c()     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            X.C165567td.A1Q(r0, r1, r2)     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            org.apache.commons.logging.Log r2 = a     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.String r0 = "PublicKey = "
            X.C165577te.A1J(r8, r0, r1, r2)     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
        L_0x0052:
            r2 = 0
            r5.a((java.security.Key) r8)     // Catch:{ IOException -> 0x0070, XMLSecurityException -> 0x006b, XMLSignatureException -> 0x0091 }
            org.apache.xml.security.utils.SignerOutputStream r1 = new org.apache.xml.security.utils.SignerOutputStream     // Catch:{ IOException -> 0x0070, XMLSecurityException -> 0x006b, XMLSignatureException -> 0x0091 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0070, XMLSecurityException -> 0x006b, XMLSignatureException -> 0x0091 }
            org.apache.xml.security.utils.UnsyncBufferedOutputStream r0 = new org.apache.xml.security.utils.UnsyncBufferedOutputStream     // Catch:{ IOException -> 0x0070, XMLSecurityException -> 0x006b, XMLSignatureException -> 0x0091 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0070, XMLSecurityException -> 0x006b, XMLSignatureException -> 0x0091 }
            r4.a((java.io.OutputStream) r0)     // Catch:{ IOException -> 0x0070, XMLSecurityException -> 0x006b, XMLSignatureException -> 0x0091 }
            r0.close()     // Catch:{ IOException -> 0x0070, XMLSecurityException -> 0x006b, XMLSignatureException -> 0x0091 }
            byte[] r2 = r7.b()     // Catch:{ IOException -> 0x0070, XMLSecurityException -> 0x006b, XMLSignatureException -> 0x0091 }
            goto L_0x0073
        L_0x006b:
            r0 = move-exception
            r5.f()     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            throw r0     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
        L_0x0070:
            r5.f()     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
        L_0x0073:
            org.apache.xml.security.algorithms.SignatureAlgorithmSpi r0 = r5.h     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            boolean r0 = r0.b(r2)     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            if (r0 != 0) goto L_0x0083
            org.apache.commons.logging.Log r1 = a     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            java.lang.String r0 = "Signature verification failed."
            r1.warn(r0)     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            return r6
        L_0x0083:
            boolean r0 = r7.e     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            boolean r0 = r4.b(r0)     // Catch:{ XMLSignatureException -> 0x0091, XMLSecurityException -> 0x008a }
            return r0
        L_0x008a:
            r0 = move-exception
            org.apache.xml.security.signature.XMLSignatureException r2 = new org.apache.xml.security.signature.XMLSignatureException
            r2.<init>((java.lang.String) r3, (java.lang.Exception) r0)
            throw r2
        L_0x0091:
            r2 = move-exception
            throw r2
        L_0x0093:
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            java.lang.String r0 = "Didn't get a key"
            r1[r6] = r0
            org.apache.xml.security.signature.XMLSignatureException r2 = new org.apache.xml.security.signature.XMLSignatureException
            r2.<init>((java.lang.String) r3, (java.lang.Object[]) r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.signature.XMLSignature.a(java.security.Key):boolean");
    }

    public byte[] b() {
        try {
            return Base64.a(this.f);
        } catch (Base64DecodingException e2) {
            throw C165597tg.A0v(e2);
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw C165577te.A0m(e2);
        }
    }
}
