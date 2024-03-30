package org.apache.xml.security.signature;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165597tg;
import X.C165607th;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.MessageDigest;
import java.security.PrivilegedAction;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.MessageDigestAlgorithm;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.transforms.Transforms;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.DigesterOutputStream;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.UnsyncBufferedOutputStream;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolver;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

public class Reference extends SignatureElementProxy {
    public static Log a;
    public static Class d;
    public static boolean e = AnonymousClass000.A1X(AccessController.doPrivileged(new PrivilegedAction() {
        public Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.apache.xml.security.useC14N11"));
        }
    }));
    public Manifest b = null;
    public XMLSignatureInput c;
    public Transforms f;
    public Element g;
    public Element h;

    public Reference(Element element, String str, Manifest manifest) {
        super(element, str);
        this.l = str;
        Element a2 = XMLUtils.a(element.getFirstChild());
        if ("Transforms".equals(a2.getLocalName()) && "http://www.w3.org/2000/09/xmldsig#".equals(a2.getNamespaceURI())) {
            this.f = new Transforms(a2, this.l);
            a2 = XMLUtils.a(a2.getNextSibling());
        }
        this.g = a2;
        this.h = XMLUtils.a(a2.getNextSibling());
        this.b = manifest;
    }

    public MessageDigestAlgorithm a() {
        String attributeNS;
        Element element = this.g;
        if (element == null || (attributeNS = element.getAttributeNS((String) null, "Algorithm")) == null) {
            return null;
        }
        return MessageDigestAlgorithm.a(this.m, attributeNS);
    }

    public XMLSignatureInput a(OutputStream outputStream) {
        try {
            XMLSignatureInput a2 = a(g(), outputStream);
            this.c = a2;
            return a2;
        } catch (XMLSecurityException e2) {
            throw new ReferenceNotInitializedException("empty", (Exception) e2);
        }
    }

    public String b() {
        return this.k.getAttributeNS((String) null, "URI");
    }

    public String c() {
        return this.k.getAttributeNS((String) null, "Type");
    }

    public String e() {
        return "Reference";
    }

    public Transforms h() {
        return this.f;
    }

    static {
        Class a2 = a("org.apache.xml.security.signature.Reference");
        d = a2;
        a = LogFactory.getLog(a2.getName());
    }

    private XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream) {
        try {
            Transforms transforms = this.f;
            if (transforms == null) {
                return xMLSignatureInput;
            }
            XMLSignatureInput a2 = transforms.a(xMLSignatureInput, outputStream);
            this.c = a2;
            return a2;
        } catch (ResourceResolverException e2) {
            throw new XMLSignatureException("empty", (Exception) e2);
        } catch (CanonicalizationException e3) {
            throw new XMLSignatureException("empty", (Exception) e3);
        } catch (InvalidCanonicalizerException e4) {
            throw new XMLSignatureException("empty", (Exception) e4);
        } catch (TransformationException e5) {
            throw new XMLSignatureException("empty", (Exception) e5);
        } catch (XMLSecurityException e6) {
            throw new XMLSignatureException("empty", (Exception) e6);
        }
    }

    public XMLSignatureInput g() {
        try {
            Attr attributeNodeNS = this.k.getAttributeNodeNS((String) null, "URI");
            if (attributeNodeNS != null) {
                attributeNodeNS.getNodeValue();
            }
            ResourceResolver a2 = ResourceResolver.a(attributeNodeNS, this.l, this.b.e);
            a2.a((Map) this.b.d);
            return a2.e.a(attributeNodeNS, this.l);
        } catch (ResourceResolverException e2) {
            throw new ReferenceNotInitializedException("empty", (Exception) e2);
        } catch (XMLSecurityException e3) {
            throw new ReferenceNotInitializedException("empty", (Exception) e3);
        }
    }

    public byte[] i() {
        Element element = this.h;
        if (element != null) {
            return Base64.a(element);
        }
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = "DigestValue";
        A0M[1] = "http://www.w3.org/2000/09/xmldsig#";
        throw new XMLSecurityException("signature.Verification.NoSignatureElement", A0M);
    }

    public boolean f() {
        return AnonymousClass000.A1P("http://www.w3.org/2000/09/xmldsig#Manifest".equals(c()) ? 1 : 0);
    }

    public boolean j() {
        byte[] i = i();
        byte[] a2 = a(true);
        ThreadLocal threadLocal = MessageDigestAlgorithm.b;
        boolean isEqual = MessageDigest.isEqual(i, a2);
        Log log = a;
        StringBuffer A0x = C165607th.A0x();
        if (!isEqual) {
            A0x.append("Verification failed for URI \"");
            log.warn(C165577te.A0l(b(), "\"", A0x));
            Log log2 = a;
            StringBuffer A0x2 = C165607th.A0x();
            A0x2.append("Expected Digest: ");
            log2.warn(C165597tg.A0n(Base64.b(i), A0x2));
            Log log3 = a;
            StringBuffer A0x3 = C165607th.A0x();
            A0x3.append("Actual Digest: ");
            log3.warn(C165597tg.A0n(Base64.b(a2), A0x3));
            return isEqual;
        }
        A0x.append("Verification successful for URI \"");
        C165567td.A1O(b(), "\"", A0x, log);
        return isEqual;
    }

    private byte[] a(boolean z) {
        boolean z2;
        try {
            MessageDigestAlgorithm a2 = a();
            a2.c();
            DigesterOutputStream digesterOutputStream = new DigesterOutputStream(a2);
            UnsyncBufferedOutputStream unsyncBufferedOutputStream = new UnsyncBufferedOutputStream(digesterOutputStream);
            XMLSignatureInput a3 = a((OutputStream) unsyncBufferedOutputStream);
            if (!e || z || AnonymousClass000.A1V(a3.k) || a3.h()) {
                z2 = false;
            } else {
                if (this.f == null) {
                    Log log = Transforms.a;
                    Transforms transforms = new Transforms(this.m);
                    this.f = transforms;
                    this.k.insertBefore(transforms.k, this.g);
                }
                this.f.a("http://www.w3.org/2006/12/xml-c14n11");
                z2 = true;
            }
            a3.a(unsyncBufferedOutputStream, z2);
            unsyncBufferedOutputStream.flush();
            return digesterOutputStream.a();
        } catch (XMLSecurityException e2) {
            throw new ReferenceNotInitializedException("empty", (Exception) e2);
        } catch (IOException e3) {
            throw new ReferenceNotInitializedException("empty", (Exception) e3);
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
