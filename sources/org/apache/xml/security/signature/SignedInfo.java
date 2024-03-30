package org.apache.xml.security.signature;

import X.AnonymousClass001;
import X.C90524aI;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.transforms.params.InclusiveNamespaces;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class SignedInfo extends Manifest {
    public SignatureAlgorithm g = null;
    public byte[] h = null;
    public Element i;
    public Element q;

    public String b() {
        return this.i.getAttributeNS((String) null, "Algorithm");
    }

    public boolean b(boolean z) {
        return super.a(z);
    }

    public SignatureAlgorithm c() {
        return this.g;
    }

    public String e() {
        return "SignedInfo";
    }

    public String f() {
        Element a;
        String attributeNS = this.i.getAttributeNS((String) null, "Algorithm");
        if ((attributeNS.equals("http://www.w3.org/2001/10/xml-exc-c14n#") || attributeNS.equals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments")) && (a = XMLUtils.a(this.i.getFirstChild())) != null) {
            try {
                return new InclusiveNamespaces(a, "http://www.w3.org/2001/10/xml-exc-c14n#").a();
            } catch (XMLSecurityException unused) {
            }
        }
        return null;
    }

    public static Element a(Element element) {
        String attributeNS = XMLUtils.a(element.getFirstChild()).getAttributeNS((String) null, "Algorithm");
        if (attributeNS.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315") || attributeNS.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments") || attributeNS.equals("http://www.w3.org/2001/10/xml-exc-c14n#") || attributeNS.equals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments") || attributeNS.equals("http://www.w3.org/2006/12/xml-c14n11") || attributeNS.equals("http://www.w3.org/2006/12/xml-c14n11#WithComments")) {
            return element;
        }
        try {
            byte[] a = new Canonicalizer(attributeNS).c.a((Node) element);
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Node importNode = element.getOwnerDocument().importNode(newInstance.newDocumentBuilder().parse(C90524aI.A0P(a)).getDocumentElement(), true);
            element.getParentNode().replaceChild(importNode, element);
            return (Element) importNode;
        } catch (ParserConfigurationException e) {
            throw new XMLSecurityException("empty", (Exception) e);
        } catch (IOException e2) {
            throw new XMLSecurityException("empty", (Exception) e2);
        } catch (SAXException e3) {
            throw new XMLSecurityException("empty", (Exception) e3);
        }
    }

    public SignedInfo(Element element, String str) {
        super(a(element), str);
        Element a = XMLUtils.a(element.getFirstChild());
        this.i = a;
        Element a2 = XMLUtils.a(a.getNextSibling());
        this.q = a2;
        this.g = new SignatureAlgorithm(a2, this.l);
    }

    public void a(OutputStream outputStream) {
        byte[] bArr = this.h;
        if (bArr == null) {
            Canonicalizer canonicalizer = new Canonicalizer(b());
            canonicalizer.a(outputStream);
            String f = f();
            Element element = this.k;
            if (f == null) {
                canonicalizer.a((Node) element);
            } else {
                canonicalizer.a((Node) element, f);
            }
        } else {
            try {
                outputStream.write(bArr);
            } catch (IOException e) {
                throw AnonymousClass001.A0B(e);
            }
        }
    }
}
